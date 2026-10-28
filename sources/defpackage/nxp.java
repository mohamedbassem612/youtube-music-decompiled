package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nxp {
    public static final String a(Object obj) {
        Objects.checkIndex(0, 3);
        if (obj != null) {
            if (obj instanceof Iterable) {
                return b((Iterable) obj);
            }
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                return b(objArr.length == 0 ? awno.a : new awtb(objArr, 1));
            }
        }
        String strValueOf = String.valueOf(obj);
        return (obj == null || strValueOf.length() == 0 || auup.a.io().a()) ? strValueOf : String.valueOf(strValueOf.hashCode());
    }

    public static final String b(Iterable iterable) {
        return atqq.aD(iterable, null, "[", "]", new prq(4), 25);
    }
}
