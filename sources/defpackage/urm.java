package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class urm {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final agkz d;

    public urm(Optional optional, Optional optional2, Optional optional3, agkz agkzVar) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        if (agkzVar == null) {
            throw new NullPointerException("Null activeGuidelines");
        }
        this.d = agkzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof urm) {
            urm urmVar = (urm) obj;
            if (this.a.equals(urmVar.a) && this.b.equals(urmVar.b) && this.c.equals(urmVar.c) && this.d.equals(urmVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        agkz agkzVar = this.d;
        Optional optional = this.c;
        Optional optional2 = this.b;
        return "SegmentTransformResult{translation=" + this.a.toString() + ", scale=" + optional2.toString() + ", rotationDegrees=" + optional.toString() + ", activeGuidelines=" + agkzVar.toString() + '}';
    }

    public urm() {
        throw null;
    }
}
