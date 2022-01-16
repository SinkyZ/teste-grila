package com.snk.testegrila;

import javafx.application.Platform;
import javafx.scene.control.ProgressIndicator;

public class ProgressTimerMedium implements Runnable {

    ProgressIndicator progressIndicatorMedium;

    public ProgressTimerMedium(ProgressIndicator progressIndicatorMedium) {
        this.progressIndicatorMedium = progressIndicatorMedium;
    }

    /**
     * Este implementata interfata Runnable deoarece obiectele sunt executate de catre un Thread.
     */

    /**
     * Metoda pentru ca ProgressIndicator ul nostru folosit pentru a face testarea contra-timp sa ruleze continuu.
     * Acesta este timer-ul pentru intrebarile de dificultate "Medium"
     */

    @Override
    public void run() {
        while (progressIndicatorMedium.getProgress() <= 1) {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    progressIndicatorMedium.setProgress(progressIndicatorMedium.getProgress() + 0.02);
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
