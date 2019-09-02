package de.laliluna.tutorial.object;

public class Customer {
	//properties
		private int id;
		private String name;
		private String city;
		private String phone;

		//constructors
		public Customer(){}
		public Customer(int id, String name, String city, String phone){
			this.id = id;
			this.name = name;
			this.city = city;
			this.phone = phone;
		}

		//getter and setter methods
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
}
