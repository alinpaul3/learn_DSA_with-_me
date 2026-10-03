# Write your MySQL query statement below
SELECT * from Cinema where id%2!=0 && description!="boring" 
Order BY rating DESC;