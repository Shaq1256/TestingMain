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

        item.setProduct(product);
        item1.setProduct(product1);
        item2.setProduct(product2);

        invoice.getItems().add(item);
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice2.getItems().add(item);
        invoice2.getItems().add(item1);
        invoice2.getItems().add(item2);

        //When

        invoiceDao.save(invoice);
        int itemId = item.getId();
        invoiceDao.save(invoice1);
        int itemId1 = item1.getId();
        invoiceDao.save(invoice2);
        int itemId2 = item2.getId();

        //Then

        //CleanUp

    }
}
