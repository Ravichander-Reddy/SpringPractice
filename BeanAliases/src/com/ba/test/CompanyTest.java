package com.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Company;

public class CompanyTest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/ba/commons/application-context.xml"));
		Company company = beanFactory.getBean("c", Company.class);
		System.err.println(company.companyStatus(2));
		System.err.println(company);
	}
}
