package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jdy implements advb {
    private final awmd a;
    private final awmd b;
    private final awmd c;
    private final admh d = new adlg();

    public jdy(awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
    }

    @Override // defpackage.advb
    public final void b(Class cls) {
        if (anfv.class.isAssignableFrom(cls)) {
            ((ci) this.c.io()).ag(this.d);
        } else if (angf.class.isAssignableFrom(cls)) {
            ((ci) this.a.io()).ag(this.d);
        } else if (ange.class.isAssignableFrom(cls)) {
            ((ci) this.b.io()).ag(this.d);
        }
    }

    @Override // defpackage.agfr
    public final /* synthetic */ Object io() {
        return this.d;
    }
}
