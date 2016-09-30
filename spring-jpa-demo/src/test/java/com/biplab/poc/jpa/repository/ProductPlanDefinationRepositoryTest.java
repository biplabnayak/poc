package com.biplab.poc.jpa.repository;

import com.biplab.poc.jpa.AbstractContextInitializer;
import com.biplab.poc.jpa.entities.ProductPlanDefination;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * @author Biplab Nayak
 */
public class ProductPlanDefinationRepositoryTest extends AbstractContextInitializer {

    @Autowired
    ProductPlanDefinationRepository repository;

    @Autowired
    ApplicationContext context;

    @Test
    public void testSimpleCrudOperations() {
        int testId = 1;
        ProductPlanDefination productPlanDefination = new ProductPlanDefination();
        productPlanDefination.setCoverageId(testId);
        productPlanDefination.setCoverage("Test");

        ProductPlanDefination saved = repository.save(productPlanDefination);
        Assert.assertNotNull(saved);

        ProductPlanDefination get = repository.findOne(testId);
        Assert.assertNotNull(get);

        repository.delete(testId);
    }

    @Test
    public void testSpringContext() {
        for (String s : context.getBeanDefinitionNames()) {
            System.out.println(s);
        }
        Object object = context.getBean("entityManagerFactory");
        System.out.println();
    }
}
