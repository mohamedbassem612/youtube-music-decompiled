package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class th extends vm {
    public final int a;
    public final int b;

    public th(int i, int i2) {
        super((byte[]) null);
        if (i > i2) {
            throw new IllegalArgumentException("Start point must be less than or equal to end point");
        }
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof th) {
            th thVar = (th) obj;
            if (this.a == thVar.a && this.b == thVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        return "MatchRange { start: " + this.a + " , end: " + this.b + '}';
    }
}
