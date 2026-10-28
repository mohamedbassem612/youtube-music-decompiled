package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xau implements advb {
    private final awmd a;
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final awmd e;
    private final admh f = new adlg();

    public xau(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.d = awmdVar4;
        this.e = awmdVar5;
    }

    private static void c(admh admhVar, Class cls, awmd awmdVar) {
        admhVar.d(cls, new admj(awmdVar));
    }

    @Override // defpackage.advb
    public final void b(Class cls) {
        if (amqm.class.isAssignableFrom(cls)) {
            admh admhVar = this.f;
            c(admhVar, ampq.class, this.a);
            c(admhVar, amox.class, this.b);
            c(admhVar, amoy.class, this.c);
            c(admhVar, ampr.class, this.d);
            c(admhVar, acxm.class, this.e);
        }
    }

    @Override // defpackage.agfr
    public final /* synthetic */ Object io() {
        return this.f;
    }
}
