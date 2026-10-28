package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdj {
    public final cdi d;
    public final bvq g;
    public boolean h;
    public final ces i;
    private final cfd k;
    private final crd l;
    public ayq j = new ayq((byte[]) null, (byte[]) null);
    public final IdentityHashMap b = new IdentityHashMap();
    public final Map c = new HashMap();
    public final List a = new ArrayList();
    public final HashMap e = new HashMap();
    public final Set f = new HashSet();

    public cdj(cdi cdiVar, ces cesVar, bvq bvqVar, cfd cfdVar, crd crdVar) {
        this.k = cfdVar;
        this.l = crdVar;
        this.d = cdiVar;
        this.i = cesVar;
        this.g = bvqVar;
    }

    private final void h(int i, int i2) {
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ((cdh) list.get(i)).d += i2;
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [cnn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [cno, java.lang.Object] */
    private final void i(cdh cdhVar) {
        xsc xscVar = (xsc) this.e.get(cdhVar);
        if (xscVar != null) {
            xscVar.a.u(xscVar.b);
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final btn b() {
        List list = this.a;
        if (list.isEmpty()) {
            return btn.a;
        }
        int iC = 0;
        for (int i = 0; i < list.size(); i++) {
            cdh cdhVar = (cdh) list.get(i);
            cdhVar.d = iC;
            iC += cdhVar.a.a.c();
        }
        return new cau(list, this.j);
    }

    public final void c() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            cdh cdhVar = (cdh) it.next();
            if (cdhVar.c.isEmpty()) {
                i(cdhVar);
                it.remove();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [cjv, cns, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [cno, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [cnn, java.lang.Object] */
    public final void d(cdh cdhVar) {
        if (cdhVar.e && cdhVar.c.isEmpty()) {
            xsc xscVar = (xsc) this.e.remove(cdhVar);
            xscVar.getClass();
            ?? r1 = xscVar.a;
            r1.A(xscVar.b);
            ?? r0 = xscVar.c;
            r1.C(r0);
            r1.B(r0);
            this.f.remove(cdhVar);
        }
    }

    public final void e(cdh cdhVar) {
        cnh cnhVar = cdhVar.a;
        cnn cnnVar = new cnn() { // from class: cde
            @Override // defpackage.cnn
            public final void a(cno cnoVar, btn btnVar) {
                bvq bvqVar = ((ccs) this.a.d).e;
                bvqVar.b(2);
                bvqVar.g(22);
            }
        };
        cdg cdgVar = new cdg(this, cdhVar);
        this.e.put(cdhVar, new xsc(cnhVar, cnnVar, cdgVar, (float[]) null));
        cnhVar.t(bwp.ap(), cdgVar);
        cnhVar.s(bwp.ap(), cdgVar);
        cnhVar.y(cnnVar, this.k, this.l);
    }

    public final void f(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            cdh cdhVar = (cdh) this.a.remove(i2);
            this.c.remove(cdhVar.b);
            h(i2, -cdhVar.a.a.c());
            cdhVar.e = true;
            if (this.h) {
                d(cdhVar);
            }
        }
    }

    public final btn g(int i, List list, ayq ayqVar) {
        if (!list.isEmpty()) {
            this.j = ayqVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                cdh cdhVar = (cdh) list.get(i2 - i);
                if (i2 > 0) {
                    cdh cdhVar2 = (cdh) this.a.get(i2 - 1);
                    cdhVar.c(cdhVar2.d + cdhVar2.a.a.c());
                } else {
                    cdhVar.c(0);
                }
                h(i2, cdhVar.a.a.c());
                this.a.add(i2, cdhVar);
                this.c.put(cdhVar.b, cdhVar);
                if (this.h) {
                    e(cdhVar);
                    if (this.b.isEmpty()) {
                        this.f.add(cdhVar);
                    } else {
                        i(cdhVar);
                    }
                }
            }
        }
        return b();
    }
}
