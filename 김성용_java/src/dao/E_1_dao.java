package dao;
import common.*;
import java.util.*;
import java.text.*;
public class E_1_dao {
	
	public int gettoTotal(int k ,int e ,int m) {
		int total = k+e+m;
		return total;
	}
	public double getAva(int total) {
		double ava =  Math.round(total/3);
		return ava;
	
	}
}
