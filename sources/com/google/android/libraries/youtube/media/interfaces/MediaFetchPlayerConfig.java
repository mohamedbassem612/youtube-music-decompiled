package com.google.android.libraries.youtube.media.interfaces;

import com.google.protos.youtube.api.innertube.LivePlayerConfigOuterClass$LivePlayerConfig;
import com.google.protos.youtube.api.innertube.ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig;
import com.google.protos.youtube.api.innertube.MediaCommonConfigOuterClass$MediaCommonConfig;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class MediaFetchPlayerConfig {
    final ArrayList erroredItags;
    final int firstRequestNumber;
    final LivePlayerConfigOuterClass$LivePlayerConfig livePlayerConfig;
    final ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig manifestlessWindowedLiveConfig;
    final MediaCommonConfigOuterClass$MediaCommonConfig mediaCommonConfig;

    public MediaFetchPlayerConfig(LivePlayerConfigOuterClass$LivePlayerConfig livePlayerConfigOuterClass$LivePlayerConfig, MediaCommonConfigOuterClass$MediaCommonConfig mediaCommonConfigOuterClass$MediaCommonConfig, ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig manifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig, int i, ArrayList arrayList) {
        this.livePlayerConfig = livePlayerConfigOuterClass$LivePlayerConfig;
        this.mediaCommonConfig = mediaCommonConfigOuterClass$MediaCommonConfig;
        this.manifestlessWindowedLiveConfig = manifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig;
        this.firstRequestNumber = i;
        this.erroredItags = arrayList;
    }

    public ArrayList getErroredItags() {
        return this.erroredItags;
    }

    public int getFirstRequestNumber() {
        return this.firstRequestNumber;
    }

    public LivePlayerConfigOuterClass$LivePlayerConfig getLivePlayerConfig() {
        return this.livePlayerConfig;
    }

    public ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig getManifestlessWindowedLiveConfig() {
        return this.manifestlessWindowedLiveConfig;
    }

    public MediaCommonConfigOuterClass$MediaCommonConfig getMediaCommonConfig() {
        return this.mediaCommonConfig;
    }

    public String toString() {
        ArrayList arrayList = this.erroredItags;
        ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig manifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig = this.manifestlessWindowedLiveConfig;
        MediaCommonConfigOuterClass$MediaCommonConfig mediaCommonConfigOuterClass$MediaCommonConfig = this.mediaCommonConfig;
        return "MediaFetchPlayerConfig{livePlayerConfig=" + String.valueOf(this.livePlayerConfig) + ",mediaCommonConfig=" + String.valueOf(mediaCommonConfigOuterClass$MediaCommonConfig) + ",manifestlessWindowedLiveConfig=" + String.valueOf(manifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig) + ",firstRequestNumber=" + this.firstRequestNumber + ",erroredItags=" + String.valueOf(arrayList) + '}';
    }
}
