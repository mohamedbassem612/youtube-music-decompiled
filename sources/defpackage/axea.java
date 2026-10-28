package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axea {
    public static final axdy a = new axdy("NO_THREAD_ELEMENTS");
    private static final awqk b = new jnk(8);
    private static final awqk c = new jnk(9);
    private static final awqk d = new jnk(10);

    public static final Object a(awou awouVar) {
        Object objFold = awouVar.fold(0, b);
        objFold.getClass();
        return objFold;
    }

    public static final Object b(awou awouVar, Object obj) {
        if (obj == null) {
            obj = a(awouVar);
        }
        if (obj == 0) {
            return a;
        }
        return obj instanceof Integer ? awouVar.fold(new axef(awouVar, ((Number) obj).intValue()), d) : ((awxg) obj).a(awouVar);
    }

    public static final void c(awou awouVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof axef)) {
            Object objFold = awouVar.fold(null, c);
            objFold.getClass();
            ((awxg) objFold).c(awouVar, obj);
            return;
        }
        axef axefVar = (axef) obj;
        awxg[] awxgVarArr = axefVar.c;
        int length = awxgVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            awxg awxgVar = awxgVarArr[length];
            awxgVar.getClass();
            awxgVar.c(awouVar, axefVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
