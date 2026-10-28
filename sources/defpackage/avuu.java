package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avuu extends avlh implements avor {
    private final Object b;

    public avuu(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        axspVar.e(new awjy(axspVar, this.b));
    }

    @Override // defpackage.avor, java.util.concurrent.Callable
    public final Object call() {
        return this.b;
    }
}
