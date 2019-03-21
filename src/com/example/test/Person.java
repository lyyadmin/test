package com.example.test;


/**
 * Created by mingwei on 12/2/16.
 */
public class Person {
 
    @Name(value="阿特罗伯斯")
    private String name;
 
    @Gender(gender = Gender.GenderType.Male)
    private String gender;
 
    @Profile(id = 1001, height = 180, nativePlace = "CN")
    private String profile;
    
    @Love("方块是否快速的南方老师那里妈妈什么了")
    private String love;
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getGender() {
        return gender;
    }
 
    public void setGender(String gender) {
        this.gender = gender;
    }
 
    public String getProfile() {
        return profile;
    }
 
    public void setProfile(String profile) {
        this.profile = profile;
    }

	public String getLove() {
		return love;
	}

	public void setLove(String love) {
		this.love = love;
	}
}
