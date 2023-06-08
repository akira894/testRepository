package com.labo.criteria.pattern;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaSingle implements Criteria<Person> {

	@Override
	public List<Person> meetCriteria(List<Person> entities) {
		return entities
			   .stream()
			   .filter(person -> person.getMaritalStatus() == MaritalStatus.SINGLE)
			   .collect(Collectors.toList());
	}

}
