package com.google.protos.youtube.api.innertube;

import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class BandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy extends aihn implements aiis {
    public static final BandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy a;

    static {
        BandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy bandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy = new BandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy();
        a = bandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy;
        aihn.registerDefaultInstance(BandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy.class, bandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy);
    }

    private BandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new BandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(BandwidthSamplingPolicyOuterClass$BandwidthSamplingPolicy.class);
        }
        return null;
    }
}
