
package com.model;

import javax.servlet.http.Part;

public class Match {
			String title;
			String place;
			String dt;
			String name;
			String age;
			int age1;
			Part profile;
			String gender;
			String address;
			String match;
			String matchdate;
			public String getGender() {
				return gender;
			}


			public void setGender(String gender) {
				this.gender = gender;
			}


			public String getAddress() {
				return address;
			}


			public void setAddress(String address) {
				this.address = address;
			}


			public String getMatch() {
				return match;
			}


			public void setMatch(String match) {
				this.match = match;
			}


			public String getMatchdate() {
				return matchdate;
			}


			public void setMatchdate(String matchdate) {
				this.matchdate = matchdate;
			}


			public Match(String name, String age, String gender, String address, String match, String matchdate) {
				super();
				this.name = name;
				this.age = age;
				this.gender = gender;
				this.address = address;
				this.match = match;
				this.matchdate = matchdate;
			}


			public Match(String title, String place, String dt) {
				super();
				this.title = title;
				this.place = place;
				this.dt = dt;
			}


			public Match(String name, String age,Part profile) {
				super();
				this.name = name;
				this.age = age;
				this.profile=profile;
			}
            public Match() {

            }

			public String getAge() {
				return age;
			}

			public String getTitle() {
				return title;
			}

			public String getPlace() {
				return place;
			}

			public String getDt() {
		        return dt;
			}
           public Part getProfile() {
        	   return profile;
           }

			public String  getName() {
				// TODO Auto-generated method stub
				return name;
			}


			public void setTitle(String title) {
				this.title = title;
			}


			public void setPlace(String place) {
				this.place = place;
			}


			public void setDt(String dt) {
				this.dt = dt;
			}


			public void setName(String name) {
				this.name = name;
			}


			public void setAge(String age) {
				this.age = age;
			}


			public Match(String name ,String age,String title, String place, String dt) {
		
				this.title = title;
				this.place = place;
				this.dt = dt;
				this.name = name;
				this.age = age;
			}


//			public Match(String name, String age, String gender, String address, String match, String matchdate) {
//				super();
//				this.name = name;
//				this.age = age;
//				this.gender = gender;
//				this.address = address;
//				this.match = match;
//				this.matchdate = matchdate;
//			}
//
//
	public int getAge1() {
		return age1;
		}
//
//
		public void setAge1(int age1) {
			this.age1 = age1;
		}


	}


