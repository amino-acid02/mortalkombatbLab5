package com.mycompany.maven_lab5_mortalkombat;

/**
 * Класс описания таблицы результатов
 * @author Мария
 */
public class Result {
    
    private String name;
    private int points;
    
    /**
     * Конструктор 
     */
    public Result(String n, int p){
        this.name=n;
        this.points=p;
    }
    /**
     * set метод 
     */
    public void setName(String s){
        this.name=s;
    }
    /**
     * set метод 
     */
    public void setPoints(int p){
        this.points=p;
    }
    /**
     * get метод 
     */
    public String getName(){
        return this.name;
    }
    /**
     * get метод 
     */
    public int getPoints(){
        return this.points;
    }
    
}
