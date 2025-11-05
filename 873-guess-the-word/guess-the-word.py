from typing import List

class Solution:
    def findSecretWord(self, wordlist: List[str], master) -> None:
        def matches(a: str, b: str) -> int:
            return sum(x == y for x, y in zip(a, b))
        
        # Precompute similarity matrix
        similarity = [[0] * len(wordlist) for _ in range(len(wordlist))]
        for i in range(len(wordlist)):
            for j in range(len(wordlist)):
                similarity[i][j] = matches(wordlist[i], wordlist[j])
        
        candidates = wordlist[:]
        
        while candidates:
            try_index = 0
            min_max_size = len(candidates)
            
            # Find the best word to minimize worst-case partition size
            for i in range(len(candidates)):
                groups = [0] * 7  # words have 6 letters → possible match counts: 0–6
                for s in candidates:
                    groups[matches(candidates[i], s)] += 1
                max_size = max(groups)
                if max_size < min_max_size:
                    min_max_size = max_size
                    try_index = i
            
            result = candidates[try_index]
            similarity_score = master.guess(result)
            if similarity_score == 6:
                return  # Guessed correctly
            
            # Filter next round candidates
            next_round = [s for s in candidates if matches(s, result) == similarity_score]
            candidates = next_round
