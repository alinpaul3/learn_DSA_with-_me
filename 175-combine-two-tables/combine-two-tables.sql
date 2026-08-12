# Write your MySQL query statement b
Select p.firstName, p.lastName, a.city,a.state from Person p left join Address a on p.PersonId=a.PersonId;