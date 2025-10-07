package com.store;

import java.util.*;
import java.util.Date;
import com.store.Store;
import com.store.Franchise;
import com.store.ProductPromotion;

public class Promotion {

	Store store;
	Franchise franchise;
	Collection<ProductPromotion> productPromotion;
	private String description;
	private String discountType;
	private String discountValue;
	private Date startDate;
	private Date endDate;
	private boolean isFranchiseScope;

	public void applyPromotion() {
		// TODO - implement Promotion.applyPromotion
		throw new UnsupportedOperationException();
	}

	public void validatePromotion() {
		// TODO - implement Promotion.validatePromotion
		throw new UnsupportedOperationException();
	}

}
