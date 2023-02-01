create Database InvoiceSystem;
use InvoiceSystem;
-------------------------------------
Select * from Invoice ;
Select * from Customer;
Select * from Items ;
Select * from Shop ;
Select * from ShopTwo ;
Select * from InvoiceHeader ;
----------------------------------
alter table  Shop add   fax varchar(100);
update shop set fax =1233 where shop_id=1;
update shop set fax =1333 where shop_id=2;
update shop set fax =1444 where shop_id=3;
update shop set fax =1555 where shop_id=4;
update shop set fax =1666 where shop_id=5;
update shop set fax =1777 where shop_id=6;
update shop set fax =1888 where shop_id=7;
update shop set fax =1999 where shop_id=8;
update shop set fax =1900 where shop_id=9;
---------------------------------------------

drop table Invoice ; 
---------------------------------------------

4- Report: Statistics (No Of Items, No of Invoices, Total Sales) 
Select count (*) AS NumberOFItems ,(Select COUNT (*) from Invoice) AS NumberOfInvice , SUM (Items_quantity_Price) AS totalprice  From Items ;

---------------------------------------------------------------------
SELECT Invoice.Invoice_id,Invoice.Invoice_date,customer.Customer_name, Customer.Number_of_items,Customer.Total_amount, Customer.Balance FROM Invoice
Join Customer ON Customer.Customer_id=Invoice.Customer_id


------------------------------------------------------------------------------------------------
select * from Invoice inner join Items ON Invoice.item_id= Items.Items_id where Invoice_id=1;
Select * from Invoice ;
Select * from Customer;
Select * from Items ;
Select * from Shop ;
Select * from ShopTwo ;
Select * from InvoiceHeader ;
---------------------------------------------------------------------------------------------------

--------------------------------------------------------------------------------------------------
