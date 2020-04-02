package com.zzj.catkg.cat.dao;

import com.zzj.catkg.facade.entity.Cat;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CatDAOTest {
  @Autowired CatDAO catDAO;

  @Before
  public void setUp() {
    Cat cat = new Cat();
    cat.setCatId(0L);
    cat.setCatName("cat0");
    catDAO.saveAndFlush(cat);
  }

  @After
 public void tearDown() {
    catDAO.delete(0L);
  }

  @Test
  public void queryById() {
    Cat cat = catDAO.findOne(0L);
    Assert.assertEquals(Long.valueOf(0), cat.getCatId());
    Assert.assertEquals("cat0", cat.getCatName());
  }
}
