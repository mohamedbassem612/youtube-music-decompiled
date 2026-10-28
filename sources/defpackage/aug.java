package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aug extends auk {
    public final float a;
    public final String b;
    public final int c;
    public final int d;

    public aug(float f, CharSequence charSequence, int i, int i2) {
        this.a = f;
        this.b = atr.d(charSequence);
        boolean z = i >= 0 && i <= 6;
        Integer numValueOf = Integer.valueOf(i);
        azs.g(z, "Invalid minFractionDigits: %s", numValueOf);
        boolean z2 = i2 >= 0 && i2 <= 6;
        Integer numValueOf2 = Integer.valueOf(i2);
        azs.g(z2, "Invalid maxFractionDigits: %s", numValueOf2);
        azs.g(i <= i2, "Invalid minFractionDigits/maxFractionDigits: %s/%s", numValueOf, numValueOf2);
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.auk
    public final void a(Bundle bundle) {
        bundle.putFloat("value", this.a);
        bundle.putString("unit", this.b);
        bundle.putInt("minDigits", this.c);
        bundle.putInt("maxDigits", this.d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aug)) {
            return false;
        }
        aug augVar = (aug) obj;
        return this == augVar || (this.a == augVar.a && Objects.equals(this.b, augVar.b) && this.c == augVar.c && this.d == augVar.d);
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.a), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        return getClass().getSimpleName() + "{mValue=" + this.a + ", mUnit=" + this.b + ", mMinFractionDigits=" + this.c + ", mMaxFractionDigits=" + this.d + '}';
    }
}
