package com.snk.testegrila;

import javafx.application.Platform;
import javafx.scene.control.ProgressIndicator;

public class ProgressTimerHard implements Runnable {

    ProgressIndicator progressIndicatorHard;

    public ProgressTimerHard(ProgressIndicator progressIndicatorHard) {
        this.progressIndicatorHard = progressIndicatorHard;
    }

    /**
     * Este implementata interfata Runnable deoarece obiectele sunt executate de catre un Thread.
     */

    /**
     * Metoda pentru ca ProgressIndicator ul nostru folosit pentru a face testarea contra-timp sa ruleze continuu.
     * Acesta este timer-ul pentru intrebarile de dificultate "Hard"
     */

    @Override
    public void run() {
        while (progressIndicatorHard.getProgress() <= 1) {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    progressIndicatorHard.setProgress(progressIndicatorHard.getProgress() + 0.03);
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
