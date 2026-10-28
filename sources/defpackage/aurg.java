package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aurg {
    public static final qmc a;
    public static volatile String b;
    public static final omm c;
    private static final qmj d;

    static {
        qmk qmkVar = new qmk(new auqc(3));
        qmkVar.b = true;
        qmj qmjVarA = qmkVar.a();
        d = qmjVarA;
        omm ommVar = new omm("com.google.android.gms.measurement", qmjVarA);
        c = ommVar;
        a = ommVar.v("__phenotype_server_token", "");
        b = null;
    }

    private aurg() {
    }
}
