package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class utq {
    public final long a;
    public final float b;
    public final Optional c;

    public utq(long j, float f, Optional optional) {
        this.a = j;
        this.b = f;
        this.c = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof utq) {
            utq utqVar = (utq) obj;
            if (this.a == utqVar.a) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(utqVar.b) && this.c.equals(utqVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PrimaryAudioParams{id=" + this.a + ", volume=" + this.b + ", audioSourceOverride=" + this.c.toString() + '}';
    }

    public utq() {
        throw null;
    }
}
