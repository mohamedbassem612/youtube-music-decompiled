package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awve extends Exception {
    public final Throwable a;

    public awve(Throwable th, awuq awuqVar, awou awouVar) {
        super(a.bZ(awouVar, awuqVar, "Coroutine dispatcher ", " threw an exception, context = "), th);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
