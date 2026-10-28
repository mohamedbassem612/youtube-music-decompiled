package com.google.android.libraries.youtube.media.interfaces;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class PlayerResponseCompatibilityRequirements {
    final ArrayList allowedFormats;
    final LiveMetadataCompatibilityRequirements allowedLiveMetadata;
    final boolean audioOnly;
    final Time desiredPlaybackStartTime;

    public PlayerResponseCompatibilityRequirements(ArrayList arrayList, Time time, LiveMetadataCompatibilityRequirements liveMetadataCompatibilityRequirements, boolean z) {
        this.allowedFormats = arrayList;
        this.desiredPlaybackStartTime = time;
        this.allowedLiveMetadata = liveMetadataCompatibilityRequirements;
        this.audioOnly = z;
    }

    public ArrayList getAllowedFormats() {
        return this.allowedFormats;
    }

    public LiveMetadataCompatibilityRequirements getAllowedLiveMetadata() {
        return this.allowedLiveMetadata;
    }

    public boolean getAudioOnly() {
        return this.audioOnly;
    }

    public Time getDesiredPlaybackStartTime() {
        return this.desiredPlaybackStartTime;
    }

    public String toString() {
        LiveMetadataCompatibilityRequirements liveMetadataCompatibilityRequirements = this.allowedLiveMetadata;
        Time time = this.desiredPlaybackStartTime;
        return "PlayerResponseCompatibilityRequirements{allowedFormats=" + String.valueOf(this.allowedFormats) + ",desiredPlaybackStartTime=" + String.valueOf(time) + ",allowedLiveMetadata=" + String.valueOf(liveMetadataCompatibilityRequirements) + ",audioOnly=" + this.audioOnly + '}';
    }
}
