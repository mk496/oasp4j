package io.oasp.gastronomy.restaurant.offermanagement.logic.impl;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.flywaydb.core.Flyway;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.oasp.gastronomy.restaurant.SpringBootApp;
import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Product;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.OfferEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.OfferDao;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.SpecialDao;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.impl.dao.ProductDaoImpl;
import io.oasp.module.test.common.base.ComponentTest;

/**
 * This is the test case of {@link ProductDaoImpl}
 *
 * @since dev
 */
@Transactional
@SpringBootTest(classes = { SpringBootApp.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpecialTestMIK extends ComponentTest {

  @Inject
  private SpecialDao specialDao;

  @Inject
  private OfferDao offerDao;

  @Inject
  private Flyway flyway;

  /**
   * Tests if the {@link Product} is filtered correctly.
   */
  @Test
  public void test() {

    // Given
    SpecialEntity special = new SpecialEntity();
    OfferEntity offer = new OfferEntity();
    //
    // special.setName("Danie Dnia");
    // offer.setId(1L);
    // offer.setName("Zupa pomidorowa");
    // special.setOffer(offer);
    //
    // SpecialEntity special_result = this.specialDao.save(special);
    // assertNotNull("Ok not null", special_result);
    //

    // When
    offer.setNumber(102L);
    offer.setPrice(new Money(12));

    special.setName("Danie Dnia");

    offer.setName("Zupa pomidorowa");
    special.setOffer(offer);

    assertNotNull("Offer successfully saved", this.offerDao.save(offer));
    assertNotNull("Special successfully saved", this.specialDao.save(special));

    // filter.setFetchDrinks(true);
    // filter.setFetchMeals(false);
    // sort.setSortByEntry(ProductSortByHitEntry.DESCRIPTION);
    // products = this.offerManagement.findProductsFiltered(filter, sort);
    // assertEquals(products.size(), 4);
    // assertEquals(products.get(0).getId(), new Long(13));
    // assertEquals(products.get(1).getId(), new Long(12));
    // assertEquals(products.get(2).getId(), new Long(11));
    // assertEquals(products.get(3).getId(), new Long(14));
    //
    // filter.setFetchSideDishes(true);
    // filter.setFetchDrinks(false);
    // products = this.offerManagement.findProductsFiltered(filter, sort);
    // assertEquals(products.size(), 4);
    // assertEquals(products.get(0).getId(), new Long(9));
    // assertEquals(products.get(1).getId(), new Long(10));
    // assertEquals(products.get(2).getId(), new Long(7));
    // assertEquals(products.get(3).getId(), new Long(8));
    //
    // filter.setFetchMeals(true);
    // products = this.offerManagement.findProductsFiltered(filter, sort);
    // assertEquals(products.size(), 10);
    //
    // filter.setFetchMeals(true);
    // filter.setFetchDrinks(true);
    // sort.setSortByEntry(ProductSortByHitEntry.ID);
    // products = this.offerManagement.findProductsFiltered(filter, sort);
    // assertEquals(products.size(), 14);
    // assertEquals(products.get(5).getDescription(), "Flammkuchen");
    // sort.setOrderBy(OrderDirection.DESC);
    // products = this.offerManagement.findProductsFiltered(filter, sort);
    // assertEquals(products.get(5).getDescription(), "Brot");
    // assertEquals(products.get(0).getId(), new Long(14));
    // assertEquals(products.get(1).getId(), new Long(13));
    // assertEquals(products.get(2).getId(), new Long(12));
    // assertEquals(products.get(3).getId(), new Long(11));
    //
  }
}
