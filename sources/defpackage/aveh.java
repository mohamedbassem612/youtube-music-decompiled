package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
abstract class aveh implements Runnable {
    private final auzh a;

    protected aveh(auzh auzhVar) {
        this.a = auzhVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        auzh auzhVarA = this.a.a();
        try {
            a();
        } finally {
            this.a.c(auzhVarA);
        }
    }
}
