package com.store;

import java.util.*;
import java.sql.Timestamp;
import com.store.Franchise;
import com.store.Store;
import com.store.User;
import com.store.AnalyticsData;

public class AnalyticsReport {

	Franchise franchise;
	Store store;
	User user;
	Collection<AnalyticsData> analyticsData;
	private String name;
	private String type;
	private Timestamp generatedDate;

}
