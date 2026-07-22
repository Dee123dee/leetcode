# Write your MySQL query statement below
select c.name as Customers  from Customers as c 
LEFT JOIN Orders as o 
ON  o.customerId = c.id 
where o.customerId IS NULL;