package filehandlingdemo;

import java.io.Serializable;

public class EmpClass implements Serializable{
	

		 int id;
		 String name;
		 String location;
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
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
			
		}
		@Override
		public String toString() {
			return "EmpClass [id=" + id + ", name=" + name + ", location=" + location + "]";
		}
		public EmpClass(int id, String name, String location) {
			super();
			this.id = id;
			this.name = name;
			this.location = location;
		}
		
		
		 
		
}


