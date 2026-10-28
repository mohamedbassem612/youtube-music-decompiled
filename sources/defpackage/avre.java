package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avre extends avmc {
    final avle a;
    final Object b;

    public avre(avle avleVar, Object obj) {
        this.a = avleVar;
        this.b = obj;
    }

    @Override // defpackage.avmc
    protected final void G(avmd avmdVar) {
        this.a.kp(new avrd(this, avmdVar, 0));
    }
}
