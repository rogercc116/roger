package com.roger.work;
import java.nio.channels.GatheringByteChannel;
import java.text.BreakIterator;
import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;
/**
 * 简单医院挂号系统
 * @author Roger
 * @date   2020年4月15日
 */
public class HospitalRegistration {

		public static void main(String[] args) {
			HosRe();
		}
	public static void HosRe() {
		String Hospital="昆山第一人民医院";
		int Hour =8;//定义医院上班时间
		int Hour2 =17; //定义医院下班时间
		int NowNumber=30;//定义现在已经挂号的人数
		int Number;
		String Department ="牙科";
		String Department2 ="内科";	
		String Department3 ="外科";	
		int count = 0;
		int MainCount = 0;
		System.out.println(Hospital);
		System.out.println("请输入挂号姓名");
		Scanner a =new Scanner(System.in);
		String Name = a.next();//获取姓名
		System.out.println("请输入身份证号码");
		Scanner b =new Scanner(System.in);
		String  IDNumber = b.next();//获取身份证号码
		System.out.println("姓名"+Name+"身份证号码"+IDNumber+"欢迎来到"+Hospital+"在线挂号系统");
		System.out.println("请输入挂号科室，目前仅可选牙科，内科，外科");
		for(int j = 1; j > 0; j++) {
			Scanner c =new Scanner(System.in);
			String  UserDepartment = c.next();//获取User希望挂的科室
			if(UserDepartment.equals(Department)||UserDepartment.equals(Department2)||UserDepartment.equals(Department3)){
			System.out.println("你要挂的科室是"+UserDepartment);
			System.out.println("请输入你挂号的时间（工作时间8点到17点）");
			for(int e = 1; e > 0; e++){
				Scanner d =new Scanner(System.in);
				int  InTime = d.nextInt();//获取User希望挂的时间hour
				if (InTime>Hour&&InTime<Hour2) {
					Number=NowNumber+1;
					System.out.println("目前有"+NowNumber+"人已经挂号"+"你排在"+Number+"位置"+"请在"+InTime+"点来就诊");
					break;
					}
				else{
					System.out.println("你预约的时间不是工作时间，请重新输入时间");
					count++;
				if (count == 3){
					System.out.println("你多次输入错误信息"+"\n"+"您已被列入黑名单！无法进行下一次预约");
					return;
				}

				}
			}
			break;
			}
			else{
			System.out.println("输入错误，请重新开始");
			MainCount++;
			if (MainCount == 3){
				System.out.println("你多次输入错误信息"+"\n"+"您已被列入黑名单！无法进行下一次预约");
				return;
			}
			}
	}
	}
	}
	


