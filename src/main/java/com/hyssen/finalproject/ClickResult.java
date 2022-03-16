/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hyssen.finalproject;

/**
 *
 * @author zinet
 */
class ClickResult {

    int index;  
    
    // Data field
    private String result;
    
    // Constructor
    public ClickResult (String res)
    {
        result = res;
    }
    public void setResult(String res)
    {
        result = res;
    }
    public String getResult()
    {
        return result;
    }
    public ClickResult (int ind)
    {
        index = ind;
    }
    
}

