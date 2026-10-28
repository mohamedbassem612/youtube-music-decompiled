package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class FallbackConfig {
    final boolean disableCabrFallback;
    final boolean disableRetry;
    final boolean disableSsdai;
    final int firstRequestNumber;

    public FallbackConfig(int i, boolean z, boolean z2, boolean z3) {
        this.firstRequestNumber = i;
        this.disableCabrFallback = z;
        this.disableRetry = z2;
        this.disableSsdai = z3;
    }

    public boolean getDisableCabrFallback() {
        return this.disableCabrFallback;
    }

    public boolean getDisableRetry() {
        return this.disableRetry;
    }

    public boolean getDisableSsdai() {
        return this.disableSsdai;
    }

    public int getFirstRequestNumber() {
        return this.firstRequestNumber;
    }

    public String toString() {
        return "FallbackConfig{firstRequestNumber=" + this.firstRequestNumber + ",disableCabrFallback=" + this.disableCabrFallback + ",disableRetry=" + this.disableRetry + ",disableSsdai=" + this.disableSsdai + '}';
    }
}
