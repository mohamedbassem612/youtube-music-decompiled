package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class PlaybackAgnosticUserPreferences {
    final int audioQualitySetting;
    final String audioTrackId;
    final int disableHfrSlicesBitfield;
    final boolean isDrcEnabled;
    final int maxAudioQuality;
    final int minAudioQuality;

    public PlaybackAgnosticUserPreferences(boolean z, String str, int i, int i2, int i3, int i4) {
        this.isDrcEnabled = z;
        this.audioTrackId = str;
        this.audioQualitySetting = i;
        this.minAudioQuality = i2;
        this.maxAudioQuality = i3;
        this.disableHfrSlicesBitfield = i4;
    }

    public int getAudioQualitySetting() {
        return this.audioQualitySetting;
    }

    public String getAudioTrackId() {
        return this.audioTrackId;
    }

    public int getDisableHfrSlicesBitfield() {
        return this.disableHfrSlicesBitfield;
    }

    public boolean getIsDrcEnabled() {
        return this.isDrcEnabled;
    }

    public int getMaxAudioQuality() {
        return this.maxAudioQuality;
    }

    public int getMinAudioQuality() {
        return this.minAudioQuality;
    }

    public String toString() {
        return "PlaybackAgnosticUserPreferences{isDrcEnabled=" + this.isDrcEnabled + ",audioTrackId=" + this.audioTrackId + ",audioQualitySetting=" + this.audioQualitySetting + ",minAudioQuality=" + this.minAudioQuality + ",maxAudioQuality=" + this.maxAudioQuality + ",disableHfrSlicesBitfield=" + this.disableHfrSlicesBitfield + '}';
    }
}
