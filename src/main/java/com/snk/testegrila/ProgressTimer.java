package com.snk.testegrila;

import javafx.application.Platform;
import javafx.scene.control.ProgressIndicator;

public class ProgressTimer implements Runnable {

    ProgressIndicator progressIndicator;

    public ProgressTimer(ProgressIndicator progressIndicator) {
        this.progressIndicator = progressIndicator;
    }


    /**
     * Este implementata interfata Runnable deoarece obiectele sunt executate de catre un Thread.
     */

    /**
     * Metoda pentru ca ProgressIndicator ul nostru folosit pentru a face testarea contra-timp sa ruleze continuu.
     * Acesta este timer-ul pentru intrebarile de dificultate "Easy"
     */

    @Override
    public void run() {
        while (progressIndicator.getProgress() <= 1) {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    progressIndicator.setProgress(progressIndicator.getProgress() + 0.01);
                }
            });
            synchronized (this) {
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
