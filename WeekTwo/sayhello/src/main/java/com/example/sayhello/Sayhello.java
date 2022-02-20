package com.example.sayhello;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sayhello {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String msg;
	public Sayhello(int id, String msg) {
		
		this.id = id;
		this.msg = msg;
	}
	public Sayhello(String msg) {
		this.msg = msg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Sayhello() {
		
	}
	
	@Override
    public String toString() {
        return "SayHello{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                '}';
    }
}
