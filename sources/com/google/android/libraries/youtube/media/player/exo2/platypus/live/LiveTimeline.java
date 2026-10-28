package com.google.android.libraries.youtube.media.player.exo2.platypus.live;

import defpackage.bss;
import defpackage.btl;
import defpackage.btm;
import defpackage.btn;
import defpackage.bwp;
import defpackage.yno;
import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveTimeline extends btn {
    public static final Integer b = 0;
    public static final Integer c = 0;
    public static final long d;
    public final bss e;
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d = 1000L;
    }

    public LiveTimeline(LiveTimelineMetadata liveTimelineMetadata) {
        AutoValue_LiveTimelineMetadata autoValue_LiveTimelineMetadata = (AutoValue_LiveTimelineMetadata) liveTimelineMetadata;
        this.e = autoValue_LiveTimelineMetadata.b;
        this.i = autoValue_LiveTimelineMetadata.a;
        long j = d;
        long jMax = Math.max(j, autoValue_LiveTimelineMetadata.c);
        this.f = jMax;
        long jMax2 = Math.max(j, autoValue_LiveTimelineMetadata.d);
        this.g = jMax2;
        long j2 = autoValue_LiveTimelineMetadata.e;
        this.j = j2;
        this.k = yno.z(j2, jMax);
        this.l = Math.max(autoValue_LiveTimelineMetadata.h - Math.max(j, autoValue_LiveTimelineMetadata.c), 0L);
        this.h = autoValue_LiveTimelineMetadata.g ? -9223372036854775807L : jMax2;
        this.m = autoValue_LiveTimelineMetadata.f;
    }

    @Override // defpackage.btn
    public final int a(Object obj) {
        return obj != c ? -1 : 0;
    }

    @Override // defpackage.btn
    public final int b() {
        return 1;
    }

    @Override // defpackage.btn
    public final int c() {
        return 1;
    }

    @Override // defpackage.btn
    public final btl d(int i, btl btlVar, boolean z) {
        Integer num;
        Integer num2;
        if (i != 0) {
            throw new IndexOutOfBoundsException();
        }
        if (z) {
            num = b;
            num2 = c;
        } else {
            num = null;
            num2 = null;
        }
        btlVar.m(num, num2, this.h, -this.f);
        return btlVar;
    }

    @Override // defpackage.btn
    public final btm e(int i, btm btmVar, long j) {
        if (i != 0) {
            throw new IndexOutOfBoundsException();
        }
        bss bssVar = this.e;
        long j2 = this.j;
        long j3 = this.k;
        boolean z = this.i;
        boolean z2 = this.h == -9223372036854775807L;
        long j4 = this.l;
        long j5 = this.g;
        long j6 = this.f;
        btmVar.e(btm.a, bssVar, null, bwp.F(j2), bwp.F(j3), -9223372036854775807L, z, z2, bssVar.d, j4, j5 - j6, 0, j6);
        return btmVar;
    }

    @Override // defpackage.btn
    public final boolean equals(Object obj) {
        if (!(obj instanceof LiveTimeline)) {
            return false;
        }
        LiveTimeline liveTimeline = (LiveTimeline) obj;
        return this.f == liveTimeline.f && this.g == liveTimeline.g && this.h == liveTimeline.h && this.j == liveTimeline.j && this.k == liveTimeline.k && this.l == liveTimeline.l && this.i == liveTimeline.i && Objects.equals(this.e, liveTimeline.e);
    }

    @Override // defpackage.btn
    public final Object f(int i) {
        if (i == 0) {
            return c;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.btn
    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h), Long.valueOf(this.j), Long.valueOf(this.k), Long.valueOf(this.l), Boolean.valueOf(this.i), this.e);
    }

    public final String toString() {
        btm btmVar = new btm();
        e(0, btmVar, 0L);
        Locale locale = Locale.US;
        Boolean boolValueOf = Boolean.valueOf(this.i);
        Double dValueOf = Double.valueOf(this.f / 1000000.0d);
        Double dValueOf2 = Double.valueOf(this.g / 1000000.0d);
        long j = this.j;
        String str = j == -9223372036854775807L ? "TIME_UNSET" : String.format(Locale.US, "%.1f sec", Double.valueOf(j / 1000000.0d));
        long j2 = this.k;
        String str2 = j2 == -9223372036854775807L ? "TIME_UNSET" : String.format(Locale.US, "%.1f sec", Double.valueOf(j2 / 1000000.0d));
        Double dValueOf3 = Double.valueOf(btmVar.q / 1000000.0d);
        Double dValueOf4 = Double.valueOf(btmVar.n / 1000000.0d);
        Double dValueOf5 = Double.valueOf(btmVar.m / 1000000.0d);
        long j3 = this.h;
        return String.format(locale, "LiveTimeline (seekable = %b, windowMinMediaTime = %.1f sec, windowMaxMediaTime = %.1f sec, utcOffset = %s, windowStartUtc = %s, window.positionInFirstPeriod = %.1f sec, window.duration = %.1f sec, window.defaultPosition = %.1f sec, period.duration = %s)", boolValueOf, dValueOf, dValueOf2, str, str2, dValueOf3, dValueOf4, dValueOf5, j3 != -9223372036854775807L ? String.format(Locale.US, "%.1f sec", Double.valueOf(j3 / 1000000.0d)) : "TIME_UNSET");
    }
}
