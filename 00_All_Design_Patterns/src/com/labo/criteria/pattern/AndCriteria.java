package com.labo.criteria.pattern;

import java.util.List;

public class AndCriteria<T> implements Criteria<T> {

	private Criteria<T> criteria;
	private Criteria<T> otherCriteria;
	
	public AndCriteria(Criteria<T> criteria, Criteria<T> otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<T> meetCriteria(List<T> entities) {
		List<T> firstCriteriaPersons = criteria.meetCriteria(entities);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
