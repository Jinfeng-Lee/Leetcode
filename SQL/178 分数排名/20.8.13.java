# Write your MySQL query statement below
Select a.score as Score,(Select count(distinct b.score) From Scores b Where b.score>=a.score) as 'Rank'
From Scores a
Order By a.score Desc
