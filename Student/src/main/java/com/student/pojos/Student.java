package com.student.pojos;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
	
	@Id
	private long roll_no;
	private String Name;
	private String Address;
	private String Email;
	private long MobileNo;
	

}
