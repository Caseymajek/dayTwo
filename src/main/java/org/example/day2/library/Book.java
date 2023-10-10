package org.example.day2.library;

public class Book {
    private String name;

    public String getName() {
        return name;
        public
    }
    //public void setTheName(String inputName){
        if (inputName.length()<5) {
            System.out.println("Book is invalid");
        }else{
            this.name = inputName;
        }

    }
    public String getTheName(){
        return this.name;//
    }
}
