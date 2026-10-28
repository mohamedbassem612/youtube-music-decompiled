package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class auh extends auk {
    public final int a;
    public final String b;

    public auh(int i, CharSequence charSequence) {
        this.a = i;
        this.b = atr.d(charSequence);
    }

    @Override // defpackage.auk
    public final void a(Bundle bundle) {
        bundle.putInt("value", this.a);
        bundle.putString("unit", this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof auh)) {
            return false;
        }
        auh auhVar = (auh) obj;
        return this == auhVar || (this.a == auhVar.a && Objects.equals(this.b, auhVar.b));
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return getClass().getSimpleName() + "{mValue=" + this.a + ", mUnit=" + this.b + '}';
    }
}
