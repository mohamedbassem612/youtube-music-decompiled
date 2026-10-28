package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class viu {
    public final int a;
    public final float b;
    public final int c;
    private final int d;

    public viu(int i, float f, int i2, int i3) {
        this.a = i;
        this.b = f;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof viu) {
            viu viuVar = (viu) obj;
            if (this.a == viuVar.a) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(viuVar.b) && this.c == viuVar.c && this.d == viuVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        return "Picker{borderColor=" + this.a + ", borderWidth=" + this.b + ", horizontalPadding=" + this.c + ", footerPaddingOffsetDp=" + this.d + '}';
    }

    public viu() {
        throw null;
    }
}
