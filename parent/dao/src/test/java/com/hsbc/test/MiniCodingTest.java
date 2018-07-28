package com.hsbc.test;

import org.junit.Test;

public class MiniCodingTest {
	//���峣��
	private static final String FIZZBUZZ="FizzBuzz";
	private static final String FIZZ="Fizz";
	private static final String BUZZ="Buzz";
	
	@Test
	public void codingTestPartOne() {
		for (int i = 1; i <= 100; i++) {
			//��һ��ʹ��if...else�ж�
			/*if(i%3==0&&i%5==0) {
				System.out.println(FIZZBUZZ);
			}else if(i%3==0) {
				System.out.println(FIZZ);
			}else if(i%5==0){
				System.out.println(BUZZ);
			}else {
				System.out.println(i);
			}
			*/
			//�ڶ���ʹ����Ԫ���ʽ
			System.out.println(i%3==0&&i%5==0?FIZZBUZZ:(i%3==0?FIZZ:(i%5==0?BUZZ:i)));
			
		}
	}

	@Test
	public void codingTestPartTwo() {
		for (int i = 1; i <= 100; i++) {
			boolean isContainNumThree = (i+"").contains("3");
			boolean isContainNumFive = (i+"").contains("5");
			boolean isContainBothNum=((isContainNumThree==true?1:0)+(isContainNumFive==true?1:0))-2==0?true:false;
			/**
			 * ���������
			 *   1.�����ֱ�3�������߰���3ΪFizz
			 *   2.�����ֱ�5�������߰���5ΪBuzz
			 *   3.����4�����ΪFizzBuzz
			 *     3.1 ����3����5����
			 *     3.2 ����5����3����
			 *     3.3 ����3��5
			 *     3.4 ��3��5����
			 */
			System.out.println((i%3==0&&i%5==0)||isContainBothNum||(isContainNumThree&&i%5==0)
								||(isContainNumFive&&i%3==0)?FIZZBUZZ:
								(isContainNumThree||i%3==0?FIZZ:
								(isContainNumFive||i%5==0?BUZZ:i)));
		}
	}
}
