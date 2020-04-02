package com.zzj.catkg.cat;

import com.zzj.catkg.facade.entity.Cat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackageClasses= Cat.class)
public class CatApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatApplication.class, args);
	}
}
