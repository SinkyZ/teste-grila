package com.snk.testegrila;

import javafx.application.Platform;
import javafx.scene.control.ProgressIndicator;

public class ProgressTimerHard implements Runnable {

    ProgressIndicator progressIndicatorHard;

    public ProgressTimerHard(ProgressIndicator progressIndicatorHard) {
        this.progressIndicatorHard = progressIndicatorHard;
    }


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
