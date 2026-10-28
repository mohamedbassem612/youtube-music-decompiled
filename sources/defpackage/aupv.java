package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aupv {
    public static volatile String a;
    public static final omm b;
    private static final qmj c;

    static {
        qmk qmkVar = new qmk(new auqc(1));
        qmkVar.b(new agqj("ANDROID_AUTH"));
        qmj qmjVarA = qmkVar.a();
        c = qmjVarA;
        b = new omm("com.google.android.gms.auth_account_client", qmjVarA);
        a = null;
    }

    private aupv() {
    }
}
