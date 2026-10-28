package defpackage;

import android.graphics.drawable.Drawable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nwp {
    public nei c;
    public float a = 0.0f;
    public int b = 0;
    public ahto e = null;
    public Drawable d = null;

    public final boolean equals(Object obj) {
        if (!(obj instanceof nwp)) {
            return false;
        }
        nwp nwpVar = (nwp) obj;
        if (!Objects.equals(this.d, nwpVar.d)) {
            return false;
        }
        float f = this.a;
        Float fValueOf = Float.valueOf(f);
        float f2 = nwpVar.a;
        Float fValueOf2 = Float.valueOf(f2);
        fValueOf.getClass();
        fValueOf2.getClass();
        return ((long) (f * 10000.0f)) == ((long) (f2 * 10000.0f)) && Objects.equals(this.e, nwpVar.e) && this.b == nwpVar.b;
    }

    public final int hashCode() {
        return Objects.hash(this.d, Float.valueOf(this.a), this.e, Integer.valueOf(this.b));
    }

    public final String toString() {
        return "StyleBuilderImpl(backgroundDrawable:" + String.valueOf(this.d) + ", cornerRadiusPx:" + this.a + ", border:" + String.valueOf(this.e) + ", borderColor:" + this.b + ')';
    }
}
