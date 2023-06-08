package com.labo.criteria.pattern;

import java.util.List;

public class OrCriteria<T> implements Criteria<T> {

	private Criteria<T> criteria;
	private Criteria<T> otherCriteria;
	
	public OrCriteria(Criteria<T> criteria, Criteria<T> otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	
	@Override
	public List<T> meetCriteria(List<T> entities) {
		
		List<T> firstCriteriaItems = criteria.meetCriteria(entities);
		List<T> otherCriteriaItems = otherCriteria.meetCriteria(entities);
		
		for(T entity : otherCriteriaItems) {
			if(firstCriteriaItems.contains(entity)) {
				firstCriteriaItems.add(entity);
			}
		}
		
		return firstCriteriaItems;
	}

	
}
