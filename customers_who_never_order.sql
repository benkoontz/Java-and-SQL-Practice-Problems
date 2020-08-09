/* 
Suppose there's two tables, the Customers table and the Orders table. Write a SQL query to find all customers who never order anything.

 table: Customers.

+----+-------+
| Id | Name  |
+----+-------+
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Ben   |
| 5  | Max   |
+----+-------+

Table: Orders.

+----+------------+
| Id | CustomerId |
+----+------------+
| 1  | 3          |
| 2  | 1          |
+----+------------+

Using the above tables as example, the solution would return:

+-----------+
| Customers |
+-----------+
| Henry     |
| Ben       |
| Max       |
+-----------+

*/
# select the name column from the customer table and rename it as customers
select customers.name as 'Customers' 
# select from the customers table
from customers
# take all customer id's from the customers table that aren't in the orders table
where customers.id not in
(
    select customerid from orders
);
