package com.google.android.libraries.youtube.composition.api;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class OnPlayerStateChangedParams {
    final PlayerState state;

    public OnPlayerStateChangedParams(PlayerState playerState) {
        this.state = playerState;
    }

    public PlayerState getState() {
        return this.state;
    }

    public String toString() {
        return "OnPlayerStateChangedParams{state=" + String.valueOf(this.state) + '}';
    }
}
