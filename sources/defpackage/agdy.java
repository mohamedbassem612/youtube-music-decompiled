package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class agdy implements agek {
    protected /* bridge */ /* synthetic */ Object a(Object obj) {
        pnb pnbVar = (pnb) obj;
        int iOrdinal = pnbVar.ordinal();
        if (iOrdinal == 0) {
            return pzy.a;
        }
        if (iOrdinal == 1) {
            return pzy.b;
        }
        if (iOrdinal == 2) {
            return pzy.c;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(pnbVar.toString()));
    }

    @Override // defpackage.agek
    @Deprecated
    public final Object apply(Object obj) {
        return b(obj);
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objA = a(obj);
        objA.getClass();
        return objA;
    }
}
