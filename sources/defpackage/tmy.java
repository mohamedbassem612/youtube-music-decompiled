package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tmy extends tnm {
    public final long a;
    public final long b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public tmy(tnm tnmVar, long j, long j2, int i, boolean z) {
        int i2 = tnmVar.d;
        Iterable iterableC = tnmVar.c();
        List list = tnmVar.f;
        super(i2, iterableC, list == null ? awno.a : list, z, tnmVar.d());
        this.a = j;
        this.b = j2;
        this.c = i;
    }
}
