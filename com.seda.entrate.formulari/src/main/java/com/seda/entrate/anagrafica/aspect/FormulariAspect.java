/**
 * 
 */
package com.seda.entrate.anagrafica.aspect;

import it.seda.jdbc.commons.DataPage;

import java.util.Arrays;

import org.apache.ibatis.annotations.Arg;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.seda.entrate.anagrafica.formulari.domain.Comune;

/**
 * Classe per il monitoraggio di formulari
 * @author lmontesi
 *
 */
@Aspect
public class FormulariAspect {
	
	@Around ("execution(* com.seda.entrate.anagrafica.formulari.service.FormulariService.listComuni(..))")
	   public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		 
		System.out.println("logAround() is running!");
		System.out.println("hijacked method : " + joinPoint.getSignature().getName());
		System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
	 
		System.out.println("Around before is running!");
		Object obj=  joinPoint.proceed(); //continue on the intercepted method
		System.out.println("Around after is running!");
	 
		System.out.println("******");
		return obj;
	 
	   }	
}
