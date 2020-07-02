package edu.vinaenter.cland.models;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categories {
	
	
	private int cid;
	
	@Length(min=5,max = 20,message ="Tối thiểu là 5 ký tự,tối đa 15 ký tự!")
	private String cname;
	
	private int count;
	
}
