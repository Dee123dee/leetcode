# Write your MySQL query statement below
Select Name as Customers from Customers c
where c.id not in (select CustomerId from Orders);