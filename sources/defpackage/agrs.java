package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agrs extends Exception {
    public agrs(Throwable th, agsi agsiVar, StackTraceElement[] stackTraceElementArr) {
        super(agsiVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
