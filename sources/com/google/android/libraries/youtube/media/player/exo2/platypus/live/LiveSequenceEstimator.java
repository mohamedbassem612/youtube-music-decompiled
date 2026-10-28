package com.google.android.libraries.youtube.media.player.exo2.platypus.live;

import defpackage.zap;
import defpackage.zjr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveSequenceEstimator implements zap {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;

    public LiveSequenceEstimator(long j, long j2, long j3, long j4, zjr zjrVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = zjrVar.v();
    }

    @Override // defpackage.zap
    public final long jE(long j) {
        long j2 = this.c;
        long j3 = this.d;
        if (j2 <= j3) {
            long j4 = this.a;
            long j5 = this.b;
            if (j4 <= j5 && j2 >= 0 && j3 >= 0) {
                long j6 = LiveTimeline.d;
                if (j4 >= j6 && j5 >= j6 && j != this.e && j != -9223372036854775807L && j <= j5 && j >= j4) {
                    long j7 = 1 + j3;
                    return Math.min(j3, Math.max(j2, j7 - ((long) Math.ceil((j5 - j) / ((j5 - j4) / (j7 - j2))))));
                }
            }
        }
        return -1L;
    }
}
