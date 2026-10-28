package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aftl extends IllegalStateException {
    public aftl(String str) {
        super(a(null, str));
    }

    private static String a(String str, String str2) {
        return a.ct(str == null ? "" : ": ".concat(str), str2, "Starting new trace ", " when already associated with a trace", ". For more help, see http://go/tiktok-tracing#fixing-duplicate-trace-issues");
    }

    public aftl(String str, String str2, Throwable th) {
        super(a(str, str2), th);
    }
}
