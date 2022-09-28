package ru.stqa.pft.adressbook.model;

public class ContactData {

	private String firstName;
	private String lastName;
	private String mobilePhone;
	private int birghtDay;
	private String adress;
	
	public ContactData(String firstName, String lastName, String mobilePhone, String adress) {
//		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobilePhone = mobilePhone;
		this.adress = adress;
	}

	private int birghtYear;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public int getBirghtDay() {
		return birghtDay;
	}

	public void setBirghtDay(int birghtDay) {
		this.birghtDay = birghtDay;
	}

	public int getBirghtYear() {
		return birghtYear;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setBirghtYear(int birghtYear) {
		this.birghtYear = birghtYear;
	}

	public Months getBirghtMonth() {
		return birghtMonth;
	}

	public void setBirghtMonth(Months birghtMonth) {
		this.birghtMonth = birghtMonth;
	}

	private Months birghtMonth;

}

enum Months {
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}