package app.rive;

import defpackage.awrc;
import defpackage.awtl;
import defpackage.awtn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveFrameRateKt {
    private static final long DEFAULT_EARLY_WAKE;
    private static final double ONE_SECOND_IN_NANOS = 1.0E9d;

    static {
        int i = awtl.b;
        DEFAULT_EARLY_WAKE = awrc.i(4000000, awtn.NANOSECONDS);
    }
}
