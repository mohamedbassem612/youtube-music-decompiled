package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vmq {
    public final vmp a;
    public final Optional b;
    public final float c;

    public vmq(vmp vmpVar, Optional optional, float f) {
        if (vmpVar == null) {
            throw new NullPointerException("Null source");
        }
        this.a = vmpVar;
        this.b = optional;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vmq) {
            vmq vmqVar = (vmq) obj;
            if (this.a.equals(vmqVar.a) && this.b.equals(vmqVar.b)) {
                if (Float.floatToIntBits(this.c) == Float.floatToIntBits(vmqVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ Float.floatToIntBits(this.c);
    }

    public final String toString() {
        Optional optional = this.b;
        return "RollingSegmentTransition{source=" + this.a.toString() + ", target=" + optional.toString() + ", maxWidth=" + this.c + '}';
    }

    public vmq() {
        throw null;
    }
}
