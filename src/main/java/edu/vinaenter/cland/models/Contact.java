package edu.vinaenter.cland.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
	private int cid;
	private String fullname;
	private String email;
	private String subject;
	private String content;
}
