package com.yewon.word;

public class Student {

    private String name; //private이나 public 이런거 4개 알아야함.
    private String id; //학번은 int 아님, int는 계산할 때 사용

    public Student() { //빈게 필요하면 만들어줘야하고 이것만 잇으면 자바가 알아서 만들어주지만 다른 게 있으면 안만들어줌
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override //이것도 제너레이션에 있음
    public String toString() {
        return "Student { " +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
