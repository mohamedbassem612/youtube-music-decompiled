package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awdh extends avlr implements avor {
    private final Object a;

    public awdh(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.avor, java.util.concurrent.Callable
    public final Object call() {
        return this.a;
    }

    @Override // defpackage.avlr
    protected final void e(avlw avlwVar) {
        aweo aweoVar = new aweo(avlwVar, this.a);
        avlwVar.d(aweoVar);
        aweoVar.run();
    }
}
