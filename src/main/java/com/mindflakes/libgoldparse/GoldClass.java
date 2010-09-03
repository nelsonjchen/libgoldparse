package com.mindflakes.libgoldparse;

import java.util.ArrayList;

public class GoldClass implements Comparable<GoldClass>{
	
	private String name;
	private ArrayList<GoldClassSession> sessions;
	
	public GoldClass(){
		sessions = new ArrayList<GoldClassSession>();
	}
	 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addClassTime(GoldClassSession session){
		sessions.add(session);
	}
	
	public void remove(GoldClassSession session){
		sessions.remove(session);
	}
		
	@Override
	public int compareTo(GoldClass goldclass) {
		if (goldclass.getName() == this.getName()){
			return 1;
		}
		return 0;
	}
}
