package com.book;

import java.util.Arrays;
import java.util.LinkedList;

public class GongJu {
	public static String change(String s,String id)
	{
		
		LinkedList<String> li=new LinkedList<String>(Arrays.asList(s.split(",")));
		if(li==null||li.size()==0)
		{
			li.addFirst(id);
		}
		else
		{
			if(li.size()>0&&li.size()<3)
			{
			    li.addFirst(id);
			}
			else
			{
				if(li.size()>=3)
				{
					li.removeLast();
					li.addFirst(id);
				}
			}
		}
		String string="";
		for(int n=0;n<li.size();n++)
		{
			string=string+li.get(n)+",";
		}
			
		return string;
	}
    public static void main(String[] args) {
		System.out.println(new GongJu().change("1,2,", "1"));
	}
}
