package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Special;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.WeeklyPeriod;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.OfferEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.WeeklyPeriodEmbeddable;
import io.oasp.module.basic.common.api.to.AbstractEto;

/**
 * @author MKARASKI
 *
 */
public class SpecialEto extends AbstractEto implements Special {

  private String name;

  private OfferEntity offer;

  private WeeklyPeriodEmbeddable activePeriod;

  private Money specialPrice;

  @Override
  public String getName() {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setName(String name) {

    // TODO Auto-generated method stub

  }

  @Override
  public WeeklyPeriod getActivePeriod() {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setActivePeriod(WeeklyPeriod activePeriod) {

    // TODO Auto-generated method stub

  }

  @Override
  public Money getSpecialPrice() {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setSpecialPrice(Money specialPrice) {

    // TODO Auto-generated method stub

  }

}
