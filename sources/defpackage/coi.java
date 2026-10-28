package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class coi implements cnu {
    public bse a;
    public boolean d;
    private final byd e;
    private final crj f;
    private final ovo g;
    private final qcb h;

    public coi(byd bydVar, cvl cvlVar) {
        qcb qcbVar = new qcb(cvlVar, null);
        ovo ovoVar = new ovo();
        crh crhVar = new crh();
        this.e = bydVar;
        this.h = qcbVar;
        this.g = ovoVar;
        this.f = crhVar;
        this.d = true;
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ cno a(bss bssVar) {
        bssVar.c.getClass();
        return new coj(bssVar, this.e, this.h, this.g.c(bssVar), this.f, this.d, this.a);
    }

    @Override // defpackage.cnl
    public final /* synthetic */ void c(boolean z) {
    }

    @Override // defpackage.cnl
    public final /* synthetic */ void d(dbl dblVar) {
    }
}
