package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lgx implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ lha a;
    private final String b;

    public lgx(lha lhaVar, String str) {
        this.a = lhaVar;
        this.b = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.a.aT().c.b(this.b, th);
    }
}
