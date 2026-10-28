package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class czi {
    public final int a;
    public final int b;
    public final float c;

    private czi(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public static czi a(int i) {
        int i2 = i >> 13;
        if (i2 == 0) {
            return null;
        }
        return new czi(i2, (i >> 10) & 7, ((i & 511) * ((i & SemanticState.LiveRegion) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof czi)) {
            return false;
        }
        czi cziVar = (czi) obj;
        return this.a == cziVar.a && this.b == cziVar.b && Float.compare(this.c, cziVar.c) == 0;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "GainField{name=" + this.a + ", originator=" + this.b + ", gain=" + this.c + '}';
    }
}
