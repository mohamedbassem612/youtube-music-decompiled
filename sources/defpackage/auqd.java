package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class auqd {
    public static volatile String a;
    public static final omm b;
    private static final qmj c;

    static {
        qmk qmkVar = new qmk(new auqc(0));
        qmkVar.b(agkz.t("METALOG_COUNTERS", "CLEARCUT_LOG_LOSS", "CLEARCUT_FUNNEL", "CLEARCUT_BACKSTOP", "CLIENT_LOGGING_PROD"));
        qmj qmjVarA = qmkVar.a();
        c = qmjVarA;
        b = new omm("com.google.android.gms.clearcut_client", qmjVarA);
        a = null;
    }

    private auqd() {
    }
}
