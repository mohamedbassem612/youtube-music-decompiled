package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axdj {
    public static final boolean a;

    static {
        Object objI;
        try {
            objI = Class.forName("android.os.Build");
        } catch (Throwable th) {
            objI = atqp.i(th);
        }
        a = awmn.b(objI);
    }
}
