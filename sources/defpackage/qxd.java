package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxd extends qwu {
    public static final qxd a = new qxd(Duration.ZERO, 1, 1, 0.0f, -1, agpi.a);
    public final Duration b;
    public final int c;
    public final int d;
    public final float e;
    private final int f;
    private final agke g;

    public qxd(Duration duration, int i, int i2, float f, int i3, agke agkeVar) {
        if (duration == null) {
            throw new NullPointerException("Null duration");
        }
        this.b = duration;
        this.c = i;
        this.d = i2;
        this.e = f;
        this.f = i3;
        if (agkeVar == null) {
            throw new NullPointerException("Null tracks");
        }
        this.g = agkeVar;
    }

    @Override // defpackage.qwu
    public final agke a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qxd) {
            qxd qxdVar = (qxd) obj;
            if (this.b.equals(qxdVar.b) && this.c == qxdVar.c && this.d == qxdVar.d) {
                if (Float.floatToIntBits(this.e) == Float.floatToIntBits(qxdVar.e) && this.f == qxdVar.f && aguu.v(this.g, qxdVar.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ Float.floatToIntBits(this.e)) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        agke agkeVar = this.g;
        return "Metadata{duration=" + this.b.toString() + ", width=" + this.c + ", height=" + this.d + ", captureFrameRate=" + this.e + ", bitRate=" + this.f + ", tracks=" + agkeVar.toString() + '}';
    }

    public qxd() {
        throw null;
    }
}
