/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2francobarracesarvasqueztomasparaco;

/**
 *
 * @author frank
 */
public class Node<T> {
    private T data;
    private Node<T> pNext;
    private Node<T> pArbit;
    
    public Node(T data){
        this.data=data;
        this.pNext=null;
        this.pArbit=null;
    }
    
    public T getData(){
        return data;
    }
    
    public void setData(T data){
        this.data = data;
    }
    
    public Node<T> getpNext(){
        return pNext;
        
    }
    public void setpNext(Node<T> pNext){
        this.pNext=pNext;
    }
    public void setpArbit(Node<T> t){
        pArbit=t;
    }
    public Node<T> getpArbit(){
    return pArbit;
    }
    
}

