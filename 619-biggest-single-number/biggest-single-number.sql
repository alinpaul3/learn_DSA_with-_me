# Write your MySQL query statement below
SELECT Max(num) as num from MyNumbers where num in (Select num from MyNumbers Group by num having count(*)=1)