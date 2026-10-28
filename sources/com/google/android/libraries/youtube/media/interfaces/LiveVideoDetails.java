package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class LiveVideoDetails {
    final boolean allowUstreamerRequestAdconfig;
    final boolean isPostLiveDvr;
    final boolean isSeekable;
    final boolean isSsdaiEnabled;

    public LiveVideoDetails(boolean z, boolean z2, boolean z3, boolean z4) {
        this.isSeekable = z;
        this.isPostLiveDvr = z2;
        this.isSsdaiEnabled = z3;
        this.allowUstreamerRequestAdconfig = z4;
    }

    public boolean getAllowUstreamerRequestAdconfig() {
        return this.allowUstreamerRequestAdconfig;
    }

    public boolean getIsPostLiveDvr() {
        return this.isPostLiveDvr;
    }

    public boolean getIsSeekable() {
        return this.isSeekable;
    }

    public boolean getIsSsdaiEnabled() {
        return this.isSsdaiEnabled;
    }

    public String toString() {
        return "LiveVideoDetails{isSeekable=" + this.isSeekable + ",isPostLiveDvr=" + this.isPostLiveDvr + ",isSsdaiEnabled=" + this.isSsdaiEnabled + ",allowUstreamerRequestAdconfig=" + this.allowUstreamerRequestAdconfig + '}';
    }
}
