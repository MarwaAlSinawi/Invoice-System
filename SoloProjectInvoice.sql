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
drop table InvoiceHeader ; 
---------------------------------------------

4- Report: Statistics (No Of Items, No of Invoices, Total Sales) 
Select count (*) AS NumberOFItems ,(Select COUNT (*) from Invoice) AS NumberOfInvice , SUM (Items_quantity_Price) AS totalprice  From Items ;

---------------------------------------------------------------------
