package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avzd extends avlm implements avor {
    final Object a;

    public avzd(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.avlm
    protected final void G(avln avlnVar) {
        avlnVar.d(avns.a);
        avlnVar.ki(this.a);
    }

    @Override // defpackage.avor, java.util.concurrent.Callable
    public final Object call() {
        return this.a;
    }
}
