package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class LiveMetadataCompatibilityRequirements {
    final int headm;
    final boolean isLiveSource;
    final boolean isPostLiveDvr;
    final String liveBroadcastId;

    public LiveMetadataCompatibilityRequirements(boolean z, boolean z2, String str, int i) {
        this.isLiveSource = z;
        this.isPostLiveDvr = z2;
        this.liveBroadcastId = str;
        this.headm = i;
    }

    public int getHeadm() {
        return this.headm;
    }

    public boolean getIsLiveSource() {
        return this.isLiveSource;
    }

    public boolean getIsPostLiveDvr() {
        return this.isPostLiveDvr;
    }

    public String getLiveBroadcastId() {
        return this.liveBroadcastId;
    }

    public String toString() {
        return "LiveMetadataCompatibilityRequirements{isLiveSource=" + this.isLiveSource + ",isPostLiveDvr=" + this.isPostLiveDvr + ",liveBroadcastId=" + this.liveBroadcastId + ",headm=" + this.headm + '}';
    }
}
