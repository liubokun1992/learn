package com.example.lbk.MyDesignPattren.proxy.dynamicproxy;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import javax.lang.model.element.Modifier;

import com.example.lbk.MyDesignPattren.proxy.staticproxy.Flyable;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

public class Proxy {
	
	public static Object newProxyInstance() throws IOException {
		TypeSpec.Builder typeSpecBuilder = TypeSpec.classBuilder("TimeProxy")
				.addSuperinterface(Flyable.class);
		
		FieldSpec fieldSpec = FieldSpec.builder(Flyable.class, "flyable", Modifier.PRIVATE).build();
		typeSpecBuilder.addField(fieldSpec);
		
		MethodSpec constructorMethodSpec = MethodSpec.constructorBuilder()
				.addModifiers(Modifier.PUBLIC)
				.addParameter(Flyable.class, "flyable")
				.addStatement("this.flyable = flyable")
				.build();
		typeSpecBuilder.addMethod(constructorMethodSpec);
		
		Method[] methods = Flyable.class.getDeclaredMethods();
		for(Method method : methods) {
			MethodSpec methodSpec = MethodSpec.methodBuilder(method.getName())
					.addModifiers(Modifier.PUBLIC)
					.addAnnotation(Override.class)
					.returns(method.getReturnType())
					.addStatement("long start = $T.currrentTimeMillis()", System.class)
					.addCode("\n")
					.addStatement("this.flyable." + method.getName() + "()")
					.addCode("\n")
					.addStatement("long end = $T.currentTimeMillis()", System.class)
					.addStatement("$T.out.println(\"Fly time = \" + (end - start))", System.class)
					.build();
			typeSpecBuilder.addMethod(methodSpec);
		}
		
		JavaFile javaFile = JavaFile.builder("com.lbk.dynamicproxy", typeSpecBuilder.build()).build();
		javaFile.writeTo(new File("C:/Users/zwj/Desktop"));
		
		return null;
	}
	
	public static void main(String[] args) throws IOException {
		Proxy.newProxyInstance();
	}

}
