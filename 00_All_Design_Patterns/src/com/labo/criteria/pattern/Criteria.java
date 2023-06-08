package com.labo.criteria.pattern;

import java.util.List;

public interface Criteria<T> {
	List<T> meetCriteria(List<T> entities);
}
