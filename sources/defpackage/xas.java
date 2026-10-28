package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xas implements advb {
    public final admh a = new adlg();
    public final xpl b;
    private final awmd c;
    private final awmd d;
    private final awmd e;
    private final awmd f;
    private final awmd g;
    private final awmd h;
    private final awmd i;
    private final awmd j;
    private final awmd k;
    private final awmd l;
    private final awmd m;
    private final awmd n;
    private final awmd o;

    public xas(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, xpl xplVar, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13) {
        this.c = awmdVar;
        this.d = awmdVar2;
        this.e = awmdVar3;
        this.f = awmdVar4;
        this.g = awmdVar5;
        this.h = awmdVar6;
        this.i = awmdVar7;
        this.j = awmdVar8;
        this.b = xplVar;
        this.k = awmdVar9;
        this.l = awmdVar10;
        this.m = awmdVar11;
        this.n = awmdVar12;
        this.o = awmdVar13;
    }

    private static void c(admh admhVar, Class cls, awmd awmdVar) {
        admhVar.d(cls, new admj(awmdVar));
    }

    @Override // defpackage.advb
    public final void b(Class cls) {
        if (amqm.class.isAssignableFrom(cls)) {
            admh admhVar = this.a;
            admhVar.d(amou.class, new rle(this, 11));
            c(admhVar, ampd.class, this.c);
            c(admhVar, amox.class, this.d);
            c(admhVar, amoz.class, this.e);
            c(admhVar, ampq.class, this.f);
            c(admhVar, amrc.class, this.g);
            c(admhVar, amrd.class, this.h);
            c(admhVar, amra.class, this.i);
            c(admhVar, ampa.class, this.j);
            c(admhVar, ampe.class, this.k);
            c(admhVar, amoy.class, this.m);
            c(admhVar, ampr.class, this.l);
            c(admhVar, amov.class, this.n);
            c(admhVar, acxm.class, this.o);
        }
    }

    @Override // defpackage.agfr
    public final /* synthetic */ Object io() {
        return this.a;
    }
}
