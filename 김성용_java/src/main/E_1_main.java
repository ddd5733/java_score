package main;

import java.util.*;

import common.CommonUtil;
import dto.E_1_dto;
import dao.E_1_dao;

public class E_1_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CommonUtil util = new CommonUtil();
		E_1_dao dao = new E_1_dao();
		ArrayList<E_1_dto> arr = new ArrayList<>();
		System.out.println("몇분이세요?");
		int hmp =sc.nextInt();
		String name ="";
		int kor;
		int eng;
		int mat;
		int total;
		double ka = 0;
		double ea= 0;
		double ma= 0;
		double ta= 0;
		double aa= 0;
		double ava= 0;
		for(int k =0; k<hmp; k++) {
			System.out.println("이름");
			name = sc.next();
			System.out.println("국어점수");
			kor =sc.nextInt();
			System.out.println("영어점수");
			eng =sc.nextInt();
			System.out.println("수학점수");
			mat =sc.nextInt();
			total= dao.gettoTotal(kor,eng,mat);
			ava =dao.getAva(total);
			E_1_dto dto = new E_1_dto(name,kor,eng,mat,total,ava);
			
			arr.add(dto);
			
		}
		System.out.println("=============================================");
		System.out.println("성명\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=============================================");
		for(int k =0; k<arr.size(); k++) {
		System.out.print(arr.get(k).getName());
		System.out.print("\t");
		System.out.print(arr.get(k).getKor());
		System.out.print("\t");
		System.out.print(arr.get(k).getEng());
		System.out.print("\t");
		System.out.print(arr.get(k).getMat());
		System.out.print("\t");
		System.out.print(arr.get(k).getTotal());
		System.out.print("\t");
		System.out.println(arr.get(k).getAva());
			ka += arr.get(k).getKor();
			ea += arr.get(k).getEng();
			ma += arr.get(k).getMat();
			ta += arr.get(k).getTotal();
			aa += arr.get(k).getAva();
			
		}
		System.out.println("=============================================");
		System.out.print("평균\t");
		System.out.print(ka/arr.size()+"\t");
		System.out.print(ea/arr.size()+"\t");
		System.out.print(ma/arr.size()+"\t");
		System.out.print(ta/arr.size()+"\t");
		System.out.print(aa/arr.size()+"\n");
		System.out.println("=============================================");
	}

}
