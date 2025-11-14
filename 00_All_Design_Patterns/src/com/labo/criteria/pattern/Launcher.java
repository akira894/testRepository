package com.labo.criteria.pattern;

import java.util.ArrayList;
import java.util.List;

public class Launcher {
	
	private static void printEntities(List<?> entities) {
		entities.forEach(entity -> {
			System.out.println("\t" + entity);
		});		
	}
	
	
	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<Person>();
		
		persons.addAll(List.of(
			new Person("Robert", Gender.MALE, MaritalStatus.SINGLE),
			new Person("John", Gender.MALE, MaritalStatus.MARRIED),
			new Person("Laura", Gender.FEMALE, MaritalStatus.MARRIED),
			new Person("Diana", Gender.FEMALE, MaritalStatus.SINGLE),
			new Person("Bobby", Gender.MALE, MaritalStatus.SINGLE),
			new Person("Mike", Gender.MALE, MaritalStatus.SINGLE)
		));
		
		
		Criteria<Person> male = new CriteriaMale();
		
		Criteria<Person> female = new CriteriaFemale();
		
		Criteria<Person> single = new CriteriaSingle();
		
		Criteria<Person> singleAndMale = new AndCriteria<Person>(single, male);
		
		Criteria<Person> singleOrFemale = new OrCriteria<Person>(single, female);
		
		
		System.out.println("COMPLETE DATASET");
		printEntities(persons);
		
		System.out.println("\ncond [IS MALE]");
		printEntities(male.meetCriteria(persons));
		
		System.out.println("\ncond [IS FEMALE]");
		printEntities(female.meetCriteria(persons));
		
		System.out.println("\ncond [IS SINGLE AND MALE]");
		printEntities(singleAndMale.meetCriteria(persons));
		
		System.out.println("\ncond [IS SINGLE OR FEMALE]");
		printEntities(singleOrFemale.meetCriteria(persons));
		
		
	}
}
