package com.kodilla.hibernate.invoice.dao;
import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Ball");
        Product product1 = new Product("Shoes");
        Item item = new Item(new BigDecimal(5), 10, new BigDecimal(50));
        Item item1 = new Item(new BigDecimal(4), 10, new BigDecimal(40));
        Invoice invoice = new Invoice("FA001");
        Invoice invoice1 = new Invoice("FA002");

        item.setProduct(product);
        item1.setProduct(product1);
        invoice.getItems().add(item);
        invoice1.getItems().add(item1);

        //When
        invoiceDao.save(invoice);
        int invoiceSize = invoice.getItems().size();
        invoiceDao.save(invoice1);
        int invoiceSize1 = invoice1.getItems().size();

        //Then
        Assert.assertEquals(2, invoiceSize + invoiceSize1);

        //CleanUp
        itemDao.deleteAll();
    }
}