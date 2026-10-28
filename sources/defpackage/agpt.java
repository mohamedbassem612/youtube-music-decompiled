package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agpt extends agpd implements Serializable {
    static final agpt a = new agpt();
    private static final long serialVersionUID = 0;

    private agpt() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.agpd
    public final agpd a() {
        return agpb.a;
    }

    @Override // defpackage.agpd, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
