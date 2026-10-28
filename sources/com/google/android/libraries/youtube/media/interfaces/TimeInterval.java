package com.google.android.libraries.youtube.media.interfaces;

import com.google.android.apps.youtube.proto.streaming.TimeRangeOuterClass$TimeRange;
import defpackage.aihf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class TimeInterval implements Comparable {
    private final Time begin;
    private final Time end;

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes4.dex */
    final class Bridge {
        private Bridge() {
        }
    }

    private TimeInterval(long j, long j2, long j3, long j4) {
        Time time = new Time(j, j2);
        Time time2 = new Time(j3, j4);
        this.begin = time;
        this.end = time2;
    }

    public final TimeRangeOuterClass$TimeRange a() {
        aihf aihfVarCreateBuilder = TimeRangeOuterClass$TimeRange.a.createBuilder();
        int i = Time.RoundingMode.k.l;
        Time time = this.end;
        Time time2 = this.begin;
        Time timeSubtract = TimeJniBridge.subtract(time, time2, i);
        if (time2.f() && timeSubtract.f()) {
            TimeInterval timeIntervalConvertToCommonTimescale = TimeIntervalJniBridge.convertToCommonTimescale(2147483647L, this.begin, i, timeSubtract, i);
            Time time3 = timeIntervalConvertToCommonTimescale.begin;
            Time time4 = timeIntervalConvertToCommonTimescale.end;
            int i2 = (int) time3.timescale;
            aihfVarCreateBuilder.copyOnWrite();
            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder.instance;
            timeRangeOuterClass$TimeRange.b |= 4;
            timeRangeOuterClass$TimeRange.e = i2;
            long j = time3.ticks;
            aihfVarCreateBuilder.copyOnWrite();
            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange2 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder.instance;
            timeRangeOuterClass$TimeRange2.b |= 1;
            timeRangeOuterClass$TimeRange2.c = j;
            long j2 = time4.ticks;
            aihfVarCreateBuilder.copyOnWrite();
            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange3 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder.instance;
            timeRangeOuterClass$TimeRange3.b |= 2;
            timeRangeOuterClass$TimeRange3.d = j2;
        } else if (this.begin.f()) {
            Time timeE = this.begin;
            long j3 = timeE.timescale;
            if (j3 < 0 || j3 > 2147483647L) {
                timeE = timeE.e(2147483647L);
            }
            int i3 = (int) timeE.timescale;
            aihfVarCreateBuilder.copyOnWrite();
            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange4 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder.instance;
            timeRangeOuterClass$TimeRange4.b |= 4;
            timeRangeOuterClass$TimeRange4.e = i3;
            aihfVarCreateBuilder.copyOnWrite();
            TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange5 = (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder.instance;
            timeRangeOuterClass$TimeRange5.b |= 1;
            timeRangeOuterClass$TimeRange5.c = timeE.ticks;
        }
        return (TimeRangeOuterClass$TimeRange) aihfVarCreateBuilder.build();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return TimeIntervalJniBridge.compare(this, (TimeInterval) obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TimeInterval) {
            return TimeIntervalJniBridge.equals(this, (TimeInterval) obj);
        }
        return false;
    }

    public final int hashCode() {
        Time time = this.end;
        double dB = this.begin.b();
        double dB2 = time.b();
        if (Double.isNaN(dB2) || (!Double.isNaN(dB) && dB2 < dB)) {
            dB2 = dB;
            dB = dB2;
        }
        return (TimeInterval$$ExternalSyntheticBackport0.a(dB) * 629) + (TimeInterval$$ExternalSyntheticBackport0.a(dB2) * 37);
    }

    public final String toString() {
        Time time = this.end;
        return "[ " + String.valueOf(this.begin) + " , " + String.valueOf(time) + " ]";
    }
}
