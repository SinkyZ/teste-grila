package com.snk.testegrila;

import javafx.application.Platform;
import javafx.scene.control.ProgressIndicator;

public class ProgressTimerMedium implements Runnable {

    ProgressIndicator progressIndicatorMedium;

    public ProgressTimerMedium(ProgressIndicator progressIndicatorMedium) {
        this.progressIndicatorMedium = progressIndicatorMedium;
    }


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
