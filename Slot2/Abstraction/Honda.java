/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author Asus
 */
public class Honda extends Car{
    @Override
    public void stop(){
        System.out.println("Honda::Stop");
        System.out.println("Mechanism to stop the car using break");
    }
}
