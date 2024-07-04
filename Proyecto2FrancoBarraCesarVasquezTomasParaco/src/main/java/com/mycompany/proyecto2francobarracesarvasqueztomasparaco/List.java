/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2francobarracesarvasqueztomasparaco;

/**
 *
 * @author frank
 */
public class List<T> {
    private Node<T> pFirst;
    private Node<T> pLast;
    private int size;
    
    public List() {
        this.pFirst=null;
        this.pLast=null;
        this.size=1;
    }
    
    public boolean isEmpty(){
        return this.pFirst == null;
    }
    public void addFirst (T data){
        Node<T> nodeInfo = new Node<>(data);
        if (isEmpty()) {
            pFirst=nodeInfo;
            pLast=nodeInfo;
            
        }
        else{
            nodeInfo.setpNext(this.pFirst);
            this.pFirst=nodeInfo;
        }
    }
    
    public void deleteFirst(){
        Node<T> delete = pFirst.getpNext();
        this.pFirst=delete;
    }
    
    public void print(){
        Node<T> pAux = this.pFirst;
        
        while(pAux != null){
            System.out.println(pAux.getData());
            pAux = pAux.getpNext();
        }
    }
    public void addLast(T data){
        Node<T> nodeinfo= new Node<T>(data);
        if (isEmpty()){
            this.pFirst=nodeinfo;
            this.pLast=nodeinfo;
           
        }else {
            this.pLast.setpNext(nodeinfo);
            this.pLast=nodeinfo;
        }
    }
    public void deletebyNumber(int number){
        Node<T> pAux=this.pFirst;
        Node<T> pPrev=this.pFirst;
        
        for(int i=1; i <=number; i++){
            if (pAux!= null){
                pPrev=pAux;
                pAux=pAux.getpNext();
                
            }else{
                System.out.println("No existe ese elemento");
                break;
            }
        }
        if (pAux!=null){
            pPrev.setpNext(pAux.getpNext());
            pAux=null;
        }
        
    }
    public void setSize(){
        Node<T> pAux=pFirst;
        if (!isEmpty()&& pAux.getpNext()==null){
            size++;
        }
        else{
            while (pAux.getpNext()!=null){
                size++;
                pAux=pAux.getpNext();
            }
        }
    }
    public int getSize(){
        setSize();
        return size;
    }
    public Node<T> getNodebyNumber(int x){
        Node<T> pAux=pFirst;
        for (int i=0;i<x;i++){
            pAux=pAux.getpNext();
        }
        return pAux;
    }
    public void arbitList(String[] s){
        Node<T> pAux= pFirst;
        if (!isEmpty()){
            while (pAux.getpArbit()!=null){
                if (pAux.getpArbit()!=null){
                    Integer i=Integer.valueOf(s[1]);
                    pAux.setpArbit(getNodebyNumber(i));
                    }
                pAux=pAux.getpNext();
            }
        }
        }
    }
