package com.example.ACTIVIDAD1;

public class Usuario {
    private String name;
    private Integer age;
    private String hobbies;

    public Usuario(String name, Integer age, String hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String toString(){
        return  "{" + "name=" + name + "\'" + ", age=" + age + "}";
    }
}
