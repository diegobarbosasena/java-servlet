package br.com.diego.manager.servlet;

import java.util.ArrayList;
import java.util.List;

public class FakeDataBase {

	private static List<Company> companies = new ArrayList<>();

	static {
		Company company = new Company();
		company.setName("Natural");

		Company company2 = new Company();
		company2.setName("Harmonia");

		companies.add(company);
		companies.add(company2);
	}

	public void save(Company company) {
		FakeDataBase.companies.add(company);
	}

	public List<Company> getCompanies() {
		return FakeDataBase.companies;
	}
}
