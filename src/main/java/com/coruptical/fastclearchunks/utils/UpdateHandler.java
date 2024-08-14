package com.coruptical.fastclearchunks.utils;

public class UpdateHandler {
    private static UpdateHandler instance = new UpdateHandler();

    public static UpdateHandler getInstance(){
        return instance;
    }

    private UpdateHandler(){

    }

    /*
    TODO: Figure out whether I need to make a queue for ALL updates, or just local ones per edit
     */
    public void startRunnable(){

    }
}
