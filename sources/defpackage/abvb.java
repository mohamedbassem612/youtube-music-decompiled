package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abvb {
    public final awmd a;
    public final avlh b;
    public boolean c;
    private final avmb d;
    private final abmt e;
    private final avmm f = new avmm();

    public abvb(awmd awmdVar, avlh avlhVar, avmb avmbVar, abmt abmtVar, avlh avlhVar2) {
        this.a = awmdVar;
        this.b = avlhVar;
        this.d = avmbVar;
        this.e = abmtVar;
        if (abmtVar.e.l(11, 45363623L, false)) {
            avlhVar2.ak(new absp(this, 4));
        }
    }

    public static Duration a(aazk aazkVar) {
        return Duration.ofMillis(aazkVar.e - aazkVar.a);
    }

    public final synchronized void b(aazq aazqVar) {
        ((aczl) this.a.io()).n();
        this.c = true;
        avmm avmmVar = this.f;
        avmmVar.b();
        acip acipVar = aazqVar.b;
        avmmVar.c(avlh.A(acipVar.T().H(new ablh(6)), acipVar.V().H(new ablh(7)), acipVar.ar().g().H(new ablh(8)), acipVar.Z().L(this.d).y(new abqe(this, 3))).z(avoi.a, 4).p().al(new absp(this, 5), new abxq(1)));
    }

    public final boolean c(aazk aazkVar) {
        return this.e.e.l(117, 45417938L, false) && aazkVar.e == aazkVar.d;
    }
}
