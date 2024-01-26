package com.sist.controller;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
/*
 *   구분자
 *   => 찾기 => 인덱스
 *   => if문과 동일
 *   => 어노테이션 => 위에 존재
 *   
 *   @         @
 *   class A   class B
 *   
 *   class A
 *   {
 *       @RequestMappin("a.do") => 요청값 a라면 => aaa()
 *       aaa()
 *       @RequestMappin("b")
 *       bbb()
 *       @RequestMappin("c")
 *       ccc()
 *   }
 */
@Retention(RUNTIME)
// 저장 기간
/*
 *   RUNTIME
 *   =======
 *   SOURCE
 *   CLASS
 *   ======= 컴파일 후 자동으로 메모리 해제
 */
@Target(METHOD)
// 찾기 => 구분자
/*
 *   TYPE ===> class
 *   METHOD ===> method
 *   FIELD ===> 멤버변수
 *   PARAMETER ===> 매개변수
 *   CONSTRUCTOR ===> 생성자
 *   
 *   @ => TYPE
 *   class A
 *   {
 *       @ => FIELD
 *       B b=new B();
 *       
 *       @ => METHOD
 *       public void display(){}
 *       
 *       @ => CONSTRUCTOR
 *       A()
 *       
 *       public void aa(@ => PARAMETER B b)
 *   }
 *   
 *   @RequestMapping("경로")
 */
public @interface RequestMapping {
	public String value();
}
