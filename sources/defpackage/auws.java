package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class auws {
    public static volatile String a;
    public static final omm b;
    private static final qmj c;

    static {
        qmk qmkVar = new qmk(new auqc(5));
        qmkVar.b(new agqj("CLIENT_LOGGING_PROD"));
        qmkVar.a = true;
        qmj qmjVarA = qmkVar.a();
        c = qmjVarA;
        b = new omm("com.google.android.libraries.performance.primes", qmjVarA);
        a = null;
    }

    private auws() {
    }
}
