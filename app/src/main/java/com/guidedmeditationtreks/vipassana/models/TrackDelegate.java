package com.guidedmeditationtreks.vipassana.models;

/**
 * Created by aerozero on 12/23/17.
 */

public interface TrackDelegate {
    public void trackTimeRemainingUpdated(int timeRemaining);
    public void trackEnded();
}
