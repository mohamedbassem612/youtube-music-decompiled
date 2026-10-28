package com.google.android.libraries.youtube.media.player.exo2.platypus;

import com.google.android.libraries.youtube.media.interfaces.MetadataStore;
import com.google.android.libraries.youtube.media.interfaces.SharedBandwidthSampleTracker;
import com.google.protos.youtube.api.innertube.BandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy;
import com.google.protos.youtube.api.innertube.MediaFetchHotConfigOuterClass$MediaFetchHotConfig;
import defpackage.zjr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class SharedBandwidthSampleTrackerWrapper {
    public volatile SharedBandwidthSampleTracker a = null;
    private volatile boolean b = false;
    private final zjr c;
    private final MetadataStore d;

    /* JADX INFO: compiled from: PG */
    interface TrackerFactory {
    }

    public SharedBandwidthSampleTrackerWrapper(zjr zjrVar, MetadataStore metadataStore) {
        this.c = zjrVar;
        this.d = metadataStore;
    }

    public final void a() {
        BandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy bandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy;
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            MediaFetchHotConfigOuterClass$MediaFetchHotConfig mediaFetchHotConfigOuterClass$MediaFetchHotConfigW = this.c.W();
            if ((mediaFetchHotConfigOuterClass$MediaFetchHotConfigW.c & 64) == 0 || (bandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy = mediaFetchHotConfigOuterClass$MediaFetchHotConfigW.f) == null) {
                bandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy = BandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy.a;
            }
            SharedBandwidthSampleTracker sharedBandwidthSampleTrackerCreate = SharedBandwidthSampleTracker.create(bandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy, mediaFetchHotConfigOuterClass$MediaFetchHotConfigW.h, this.d);
            if (sharedBandwidthSampleTrackerCreate != null) {
                this.a = sharedBandwidthSampleTrackerCreate;
                this.a.loadPersistentBandwidthSamplesAsync();
            }
            this.b = true;
        }
    }
}
