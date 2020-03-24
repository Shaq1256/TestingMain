package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    ProductDao productDao;
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Ball");
        Product product1 = new Product("Shoes");
        Product product2 = new Product("TShirt");

        Item item = new Item(new BigDecimal(5), 10, new BigDecimal(50));
        Item item1 = new Item(new BigDecimal(20), 5, new BigDecimal(100));
        Item item2 = new Item(new BigDecimal(10), 6, new BigDecimal(60));

        Invoice invoice = new Invoice("FA001");
        Invoice invoice1 = new Invoice("FA002");
        Invoice invoice2 = new Invoice("FA003");

        invoice.getItems().add(item);
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice2.getItems().add(item);
        invoice2.getItems().add(item1);
        invoice2.getItems().add(item2);

        product.getItems().add(item);
        product.getItems().add(item2);
        product1.getItems().add(item1);
        product1.getItems().add(item2);
        product2.getItems().add(item);
        product2.getItems().add(item1);
        product2.getItems().add(item2);

        item.setInvoice(invoice);
        item1.setInvoice(invoice1);
        item1.setInvoice(invoice2);
        item2.setInvoice(invoice);


        //When

        invoiceDao.save(product);
        int itemId = item.getId();
        invoiceDao.save(item1);
        int itemId1 = item1.getId();
        invoiceDao.save(item2);
        int itemId2 = item2.getId();

        //Then

        //CleanUp

    }
}
