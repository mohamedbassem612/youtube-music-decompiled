package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xsi implements Comparator {
    private final /* synthetic */ int $cid;
    private final Object a;

    public xsi(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        if (this.$cid == 0) {
            xvq xvqVar = (xvq) obj;
            xvq xvqVar2 = (xvq) obj2;
            int iCompare = Boolean.compare(xvqVar2.m(), xvqVar.m());
            if (iCompare != 0) {
                return iCompare;
            }
            ydu yduVar = (ydu) this.a;
            return xvqVar.b(yduVar) == xvqVar2.b(yduVar) ? xvqVar.c.compareToIgnoreCase(xvqVar2.c) : xvqVar2.b(yduVar) - xvqVar.b(yduVar);
        }
        String str = (String) obj;
        String str2 = (String) obj2;
        ?? r2 = this.a;
        if (r2.contains(str)) {
            if (r2.contains(str2)) {
                return str.compareTo(str2);
            }
            return -1;
        }
        if (r2.contains(str2)) {
            return 1;
        }
        return str.compareTo(str2);
    }
}
