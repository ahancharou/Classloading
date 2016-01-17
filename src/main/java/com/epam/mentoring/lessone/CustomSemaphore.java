package com.epam.mentoring.lessone;

public class CustomSemaphore extends Semaphore{
    @Override
    public void lever() {
        System.out.println("It customly works!");
    }
}
