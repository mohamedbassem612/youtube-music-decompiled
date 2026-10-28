package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awwl {
    public static final boolean a = awrc.Y("kotlinx.coroutines.fast.path.cancellation", false);
    public static final axdy b = new axdy("COMPLETING_ALREADY");
    public static final axdy c = new axdy("COMPLETING_WAITING_CHILDREN");
    public static final axdy d = new axdy("COMPLETING_RETRY");
    public static final axdy e = new axdy("TOO_LATE_TO_CANCEL");
    public static final axdy f = new axdy("SEALED");
    public static final awvn g = new awvn(false);
    public static final awvn h = new awvn(true);

    public static final Object a(Object obj) {
        return obj instanceof awvz ? new awwa((awvz) obj) : obj;
    }

    public static final Object b(Object obj) {
        awvz awvzVar;
        awwa awwaVar = obj instanceof awwa ? (awwa) obj : null;
        return (awwaVar == null || (awvzVar = awwaVar.a) == null) ? obj : awvzVar;
    }
}
