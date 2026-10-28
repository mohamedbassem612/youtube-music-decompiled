package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ahvp extends Exception {
    public ahvp(Throwable th) {
        super(th);
        StackTraceElement[] stackTraceElementArrB = agvl.b(agrl.class, -1, 2);
        if (stackTraceElementArrB.length > 0) {
            setStackTrace(stackTraceElementArrB);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
