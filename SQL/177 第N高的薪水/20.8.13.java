CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    Set N:=N-1;
  RETURN (
      # Write your MySQL query statement below.
         Select Salary 
         From Employee
         Group By Salary
         Order by Salary Desc
         Limit 1 Offset N
  );
END
