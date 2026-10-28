package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hlw implements Comparator {
    private final aofy a;

    public hlw(aofy aofyVar) {
        this.a = aofyVar;
    }

    private static final long a(hth hthVar, int i) {
        if (hthVar.b().isEmpty()) {
            return -1L;
        }
        return hmy.l((anyo) hthVar.b().get(), i).longValue();
    }

    private static final String b(hth hthVar) {
        return ((anyx) hthVar.a().get()).getTitle();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        hth hthVar = (hth) obj;
        hth hthVar2 = (hth) obj2;
        hthVar.getClass();
        hthVar2.getClass();
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return b(hthVar).compareToIgnoreCase(b(hthVar2));
        }
        if (iOrdinal == 2) {
            return b(hthVar2).compareToIgnoreCase(b(hthVar));
        }
        if (iOrdinal == 3) {
            return Long.compare(a(hthVar2, 3), a(hthVar, 3));
        }
        if (iOrdinal == 4) {
            return Long.compare(a(hthVar2, 1), a(hthVar, 1));
        }
        if (iOrdinal == 5) {
            return Long.compare(a(hthVar2, 2), a(hthVar, 2));
        }
        throw new RuntimeException(null, null);
    }
}
