package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avmq extends avmp {
    private static final long serialVersionUID = -8219729196779211169L;

    public avmq(Runnable runnable) {
        super(runnable);
    }

    @Override // defpackage.avmp
    protected final /* synthetic */ void a(Object obj) {
        ((Runnable) obj).run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "RunnableDisposable(disposed=" + f() + ", " + String.valueOf(get()) + ')';
    }
}
