package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agpb extends agpd implements Serializable {
    public static final agpb a = new agpb();
    private static final long serialVersionUID = 0;

    private agpb() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.agpd
    public final agpd a() {
        return agpt.a;
    }

    @Override // defpackage.agpd, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
