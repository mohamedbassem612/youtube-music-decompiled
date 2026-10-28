package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class smf {
    public abnc a;
    public final acm b;
    public final acm c;
    private final apfp d;

    public smf(apfp apfpVar) {
        this.d = apfpVar;
        acm acmVar = new acm();
        this.b = acmVar;
        acm acmVar2 = new acm();
        this.c = acmVar2;
        int i = 3;
        ape.f(new sdf(acmVar, i));
        ape.f(new sdf(acmVar2, i));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof smf) {
            return Objects.equals(this.d, ((smf) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.d);
    }

    public final String toString() {
        return "ReelAdMetadata[" + this.d.o + ']';
    }
}
