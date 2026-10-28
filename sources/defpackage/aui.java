package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aui extends auk {
    public final String a;
    public final String b;

    public aui(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        this.a = atr.d(charSequence);
        this.b = atr.d(charSequence2);
    }

    @Override // defpackage.auk
    public final void a(Bundle bundle) {
        bundle.putString("value", this.a);
        bundle.putString("unit", this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aui)) {
            return false;
        }
        aui auiVar = (aui) obj;
        return this == auiVar || (Objects.equals(this.a, auiVar.a) && Objects.equals(this.b, auiVar.b));
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return getClass().getSimpleName() + "{mValue=" + this.a + ", mUnit=" + this.b + '}';
    }
}
