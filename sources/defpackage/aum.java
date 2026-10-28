package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aum {
    public final auk a;
    public final String b;
    public final int c;

    public aum(auk aukVar, CharSequence charSequence, int i) {
        this.a = aukVar;
        charSequence.getClass();
        String strD = atr.d(charSequence);
        this.b = strD;
        azs.f(!yno.D(strD), "Metric label is required");
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aum)) {
            return false;
        }
        aum aumVar = (aum) obj;
        return this == aumVar || (Objects.equals(this.a, aumVar.a) && Objects.equals(this.b, aumVar.b) && this.c == aumVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }

    public final String toString() {
        return "Metric{mValue=" + this.a + ", mLabel=" + this.b + ", mSemanticStyle=" + this.c + '}';
    }
}
