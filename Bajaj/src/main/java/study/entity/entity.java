package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class entity {
	
	@Id
	String user_id;
	
	@Column
	boolean status;
	
	@Column
	String email;
	
	@Column
	String roll_number;
	
	@Column
	int[]numbers;
	
	@Column
	String[]alphabets;
	
	public entity() {
		super();
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRoll_number() {
		return roll_number;
	}

	public void setRoll_number(String roll_number) {
		this.roll_number = roll_number;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public String[] getAlphabets() {
		return alphabets;
	}

	public void setAlphabets(String[] alphabets) {
		this.alphabets = alphabets;
	}

	
	
}
