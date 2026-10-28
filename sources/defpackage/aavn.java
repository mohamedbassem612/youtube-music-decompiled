package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aavn {
    public final Executor a;
    public final awmd b;
    final avlh c;
    final avlh d;
    final avlh e;
    public final aunn f;
    final avmm g = new avmm();
    public volatile boolean h;
    public boolean i;
    public boolean j;
    public final adet k;
    private final abwg l;
    private final avlh m;
    private final adws n;

    public aavn(adet adetVar, abwg abwgVar, aunn aunnVar, Executor executor, awmd awmdVar, avlh avlhVar, avlh avlhVar2, avlh avlhVar3, adws adwsVar, avlh avlhVar4) {
        this.k = adetVar;
        this.l = abwgVar;
        this.f = aunnVar;
        this.a = executor;
        this.b = awmdVar;
        this.c = avlhVar;
        this.d = avlhVar2;
        this.e = avlhVar3;
        this.n = adwsVar;
        this.m = avlhVar4;
    }

    public final void a() {
        avmm avmmVar = this.g;
        if (avmmVar.a() == 0) {
            abwg abwgVar = this.l;
            int i = 16;
            avmmVar.c(((avlh) abwgVar.a).al(new aawl(new aapk(this, 4), "AC", 1), new jop(i)));
            avmmVar.c(this.d.al(new aapk(this, 6), new jop(i)));
            avmmVar.c(this.c.al(new aapk(this, 7), new jop(i)));
            avmmVar.c(this.e.al(new aapk(this, 8), new jop(i)));
            avmmVar.c(this.n.b().al(new aapk(this, 9), new jop(i)));
            avmmVar.c(this.m.al(new aapk(this, 5), new jop(i)));
        }
    }
}
