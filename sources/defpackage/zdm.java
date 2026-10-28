package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class zdm {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    private final long e;
    private final Duration f;

    public zdm(int i, long j, Duration duration, int i2) {
        this.c = i;
        this.e = j;
        this.f = duration;
        this.d = i2;
        long millis = duration.toMillis();
        this.a = millis;
        this.b = j + millis;
    }

    public final float a(long j) {
        long j2 = this.a;
        long j3 = this.e;
        if (j2 <= 0) {
            return j >= j3 ? 1.0f : 0.0f;
        }
        return awro.m((j - j3) / j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zdm) {
            zdm zdmVar = (zdm) obj;
            if (this.c == zdmVar.c && this.e == zdmVar.e && awrc.c(this.f, zdmVar.f) && this.d == zdmVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.c * 31) + a.ak(this.e)) * 31) + this.f.hashCode()) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FadeOperation(direction=");
        sb.append((Object) (this.c != 1 ? "FADE_OUT" : "FADE_IN"));
        sb.append(", startPositionMs=");
        sb.append(this.e);
        sb.append(", duration=");
        sb.append(this.f);
        sb.append(", fadeCurve=");
        sb.append((Object) (this.d != 1 ? "EQUAL_POWER" : "LINEAR"));
        sb.append(')');
        return sb.toString();
    }
}
