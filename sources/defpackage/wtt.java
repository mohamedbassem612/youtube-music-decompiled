package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wtt {
    public final alya a;
    public volatile boolean b;
    private volatile List c;
    private volatile List d;
    private volatile Object e;

    public wtt(alya alyaVar) {
        this.a = alyaVar;
    }

    private static final List d(Object[] objArr, agek agekVar) {
        List arrayList = agpi.a;
        if (objArr != null && (objArr.length) > 0) {
            arrayList = new ArrayList();
            for (Object obj : objArr) {
                arrayList.addAll((Collection) agekVar.apply(obj));
            }
        }
        return arrayList;
    }

    public final Object a() {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    alye alyeVar = this.a.e;
                    if (alyeVar == null) {
                        alyeVar = alye.a;
                    }
                    List listEh = yno.eh(alyeVar, null);
                    if (!listEh.isEmpty()) {
                        this.e = listEh.get(0);
                    }
                }
            }
        }
        return this.e;
    }

    public final List b() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = d((alye[]) this.a.c.toArray(new alye[0]), new vdm(new ArrayList(), 17));
                }
            }
        }
        return this.c;
    }

    public final List c() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = d((alyb[]) this.a.d.toArray(new alyb[0]), new vxq(14));
                }
            }
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof wtt)) {
            return false;
        }
        wtt wttVar = (wtt) obj;
        int size = b().size();
        int size2 = c().size();
        if (size != wttVar.b().size() || size2 != wttVar.c().size() || !b().equals(wttVar.b()) || !c().equals(wttVar.c())) {
            return false;
        }
        if (this.b) {
            Object objA = a();
            Object objA2 = wttVar.a();
            if (objA != null) {
                return objA.equals(objA2);
            }
            if (objA2 != null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = (((b().isEmpty() ? 0 : b().hashCode()) + 527) * 31) + (c().isEmpty() ? 0 : c().hashCode());
        if (!this.b) {
            return iHashCode;
        }
        Object objA = a();
        return (iHashCode * 31) + (objA != null ? objA.hashCode() : 0);
    }
}
