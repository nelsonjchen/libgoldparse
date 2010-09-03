package com.mindflakes.libgoldparse;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: nelson
 * Date: Jul 20, 2010
 * Time: 12:12:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class GoldSchedule {
	
	private ArrayList<GoldClass> classes;
	private String quarter;
	private int year;
	
    public GoldSchedule(){
    	classes = new ArrayList<GoldClass>();
    }
    
    public void addClass(GoldClass goldclass){
    	if (classes.contains(goldclass)){
    		return;
    	}
    	classes.add(goldclass);
    }
    
    public void removeClass(GoldClass goldclass){
    	classes.remove(goldclass);
    }
    
    public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
}
