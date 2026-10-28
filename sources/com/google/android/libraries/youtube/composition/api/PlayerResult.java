package com.google.android.libraries.youtube.composition.api;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class PlayerResult {
    final Composition composition;
    final Player player;

    public PlayerResult(Player player, Composition composition) {
        this.player = player;
        this.composition = composition;
    }

    public Composition getComposition() {
        return this.composition;
    }

    public Player getPlayer() {
        return this.player;
    }

    public String toString() {
        Composition composition = this.composition;
        return "PlayerResult{player=" + String.valueOf(this.player) + ",composition=" + String.valueOf(composition) + '}';
    }
}
