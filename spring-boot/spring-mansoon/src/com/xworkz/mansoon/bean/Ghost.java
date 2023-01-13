package com.xworkz.mansoon.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ghost {

	private String name;
	private String fatherName;
	private String motherName;
	private LocalDate dateOfBirth;
	private LocalDate dateOfDeath;
	private String youngerSisterName;
	private String elderSisterName;
	private String youngerBrotherName;
	private String elderBrotherName;
	private boolean prelegs;

	@Value("169")
	private long weight;
	@Value("2.0")
	private double legs;
	@Value("300")
	private int height;
	@Value("french")
	private String grandFathername;
	@Value("protuguess")
	private String grandMotherName;
	@Value("kannada")
	private String boyfriend;
	@Value("uttarKarnataka Kannda")
	private String girlFriend;
	@Value("10")
	private int familyMembers;
	@Value("B.E (Mech)")
	private String education;
	@Value("300")
	private int totalFriends;

	@Autowired
	public Ghost(@Qualifier("gname") String name, @Qualifier("gfatherName") String fatherName,@Qualifier("gmotherName") String motherName, @Qualifier("gdateOfBirth") LocalDate dateOfBirth,
			@Qualifier("gdateOfDeath") LocalDate dateOfDeath, @Qualifier("gyoungerSisterName") String youngerSisterName,
			@Qualifier("gelderSisterName") String elderSisterName,@Qualifier("gyoungerBrotherName") String youngerBrotherName,
			@Qualifier("gelderBrotherName") String elderBrotherName, boolean prelegs) {
		super();
		this.name = name;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.dateOfBirth = dateOfBirth;
		this.dateOfDeath = dateOfDeath;
		this.youngerSisterName = youngerSisterName;
		this.elderSisterName = elderSisterName;
		this.youngerBrotherName = youngerBrotherName;
		this.elderBrotherName = elderBrotherName;
		this.prelegs = prelegs;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", fatherName=" + fatherName + ", motherName=" + motherName + ", dateOfBirth="
				+ dateOfBirth + ", dateOfDeath=" + dateOfDeath + ", youngerSisterName=" + youngerSisterName
				+ ", elderSisterName=" + elderSisterName + ", youngerBrotherName=" + youngerBrotherName
				+ ", elderBrotherName=" + elderBrotherName + ", prelegs=" + prelegs + ", weight=" + weight + ", legs="
				+ legs + ", height=" + height + ", grandFathername=" + grandFathername + ", grandMotherName="
				+ grandMotherName + ", boyfriend=" + boyfriend + ", girlFriend=" + girlFriend + ", familyMembers="
				+ familyMembers + ", education=" + education + ", totalFriends=" + totalFriends + "]";
	}

}
