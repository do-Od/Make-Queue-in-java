package boj_10845;

import java.util.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue<Integer> q =new LinkedList<>();
		int num=0;	//¸í·É¾î °¹¼ö
		String command=null;
		num=sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			command=sc.next();
			if(command.equals("push"))
			{
				q.add(sc.nextInt());
			}else if(command.equals("pop"))
			{
				System.out.println(q.isEmpty()?-1:q.poll());
			}else if(command.equals("size"))
			{
				System.out.println(q.size());
			}else if(command.equals("empty"))
			{
				System.out.println(q.isEmpty()?1:0);
			}else if(command.equals("front"))
			{
				System.out.println(q.isEmpty()?-1:q.peek());
			}else if(command.equals("back"))
			{
				Object[] end=q.toArray();
				System.out.println(q.isEmpty()?-1:end[q.size()-1]);
			}
		}
	}
}
