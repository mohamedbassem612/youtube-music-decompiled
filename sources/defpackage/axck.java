package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class axck extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axck(StackTraceElement[] stackTraceElementArr) {
        super("Coroutine encountered an exception.");
        stackTraceElementArr.getClass();
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable fillInStackTrace() {
        return this;
    }
}
