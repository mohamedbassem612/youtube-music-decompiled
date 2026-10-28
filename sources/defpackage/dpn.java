package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dpn extends RuntimeException {
    public final Throwable a;
    public final int b;

    public dpn(int i, Throwable th) {
        super(th);
        this.b = i;
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
