package defpackage;

import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class adlq extends adks {
    private final boolean a;
    private transient adlo b;
    public final List c;

    public adlq(boolean z) {
        this.c = new ArrayList();
        this.a = z;
    }

    protected adlo D(adkz adkzVar) {
        return new adlo(this, adkzVar);
    }

    protected adlo E(int i) {
        taq.d();
        List list = this.c;
        adlo adloVar = (adlo) list.get(i);
        adloVar.a.n(adloVar);
        o();
        return (adlo) list.remove(i);
    }

    public void F(adkz adkzVar, adkz adkzVar2) {
        taq.d();
        int i = 0;
        while (true) {
            List list = this.c;
            if (i >= list.size()) {
                return;
            }
            adlo adloVar = (adlo) list.get(i);
            adkz adkzVar3 = adloVar.a;
            if (adkzVar3 == adkzVar) {
                E(i);
                n(i, adkzVar2, false);
                r();
                if (adkzVar3.isEmpty()) {
                    int iA = ((adlo) list.get(i)).a.a();
                    if (iA > 0) {
                        z(adloVar.b, iA);
                        return;
                    }
                    return;
                }
                adlo adloVar2 = (adlo) list.get(i);
                int iA2 = adloVar2.a.a();
                int iA3 = adkzVar3.a();
                int i2 = adloVar.b;
                int i3 = adloVar2.b;
                if (iA2 > iA3) {
                    z(i2 + iA3, iA2 - iA3);
                } else if (iA3 > iA2) {
                    A(i3 + iA2, iA3 - iA2);
                }
                y(i2, Math.min(iA3, iA2));
                return;
            }
            i++;
        }
    }

    @Override // defpackage.adkz
    public final int a() {
        List list = this.c;
        if (list.isEmpty()) {
            return 0;
        }
        return ((adlo) list.get(list.size() - 1)).f();
    }

    @Override // defpackage.adkz
    public final long c(int i) {
        adlo adloVarV = v(i);
        if (adloVarV == null) {
            return 0L;
        }
        return adloVarV.a.c(adloVarV.b(i));
    }

    @Override // defpackage.adkz
    public final boolean contains(Object obj) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (((adlo) it.next()).a.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adkz
    public final Object d(int i) {
        adlo adloVarV = v(i);
        if (adloVarV == null) {
            return null;
        }
        return adloVarV.a.d(adloVarV.b(i));
    }

    @Override // defpackage.adks, defpackage.adkz
    public final void f(adly adlyVar, int i) {
        super.f(adlyVar, i);
        adlo adloVarV = v(i);
        if (adloVarV != null) {
            adloVarV.a.f(adlyVar, adloVarV.b(i));
        }
    }

    public final int g() {
        return this.c.size();
    }

    public final int i(adkz adkzVar) {
        if (adkzVar != null) {
            List list = this.c;
            if (!list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    if (((adlo) list.get(i)).a == adkzVar) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    @Override // defpackage.adkz
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final int k(adkz adkzVar) {
        for (adlo adloVar : this.c) {
            if (adloVar.a == adkzVar) {
                return adloVar.f();
            }
        }
        return -1;
    }

    public final int l(adkz adkzVar) {
        for (adlo adloVar : this.c) {
            if (adloVar.a == adkzVar) {
                return adloVar.b;
            }
        }
        return -1;
    }

    public final adlp m(int i, adkz adkzVar, boolean z) {
        if (i == -1) {
            i = this.c.size();
        }
        return n(i, adkzVar, z);
    }

    protected adlp n(int i, adkz adkzVar, boolean z) {
        taq.d();
        adlo adloVarU = u(adkzVar, i);
        r();
        adkz adkzVar2 = adloVarU.a;
        if (adkzVar2.isEmpty()) {
            return null;
        }
        if (!z) {
            return new adlp(adloVarU.b, adkzVar2.a());
        }
        z(adloVarU.b, adkzVar2.a());
        return null;
    }

    protected final void o() {
        this.b = null;
    }

    public void p(List list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        j$.util.List.EL.sort(arrayList, Comparator$CC.comparing(new ygi(10)));
        int i = ((adlp) arrayList.get(0)).a;
        int size = arrayList.size();
        int i2 = i;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            adlp adlpVar = (adlp) arrayList.get(i4);
            int i5 = adlpVar.a;
            if (i5 == i2 + i3) {
                i3 += adlpVar.b;
            } else {
                z(i2, i3);
                i3 = adlpVar.b;
                i2 = i5;
            }
        }
        z(i2, i3);
    }

    public void q(adkz adkzVar) {
        adlo adloVar;
        adkz adkzVar2;
        taq.d();
        List list = this.c;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
            adloVar = (adlo) list.get(size);
            adkzVar2 = adloVar.a;
        } while (adkzVar2 != adkzVar);
        E(size);
        r();
        if (adkzVar2.isEmpty()) {
            return;
        }
        A(adloVar.b, adkzVar2.a());
    }

    protected final void r() {
        int iF = 0;
        for (adlo adloVar : this.c) {
            adloVar.b = iF;
            iF = adloVar.f();
        }
    }

    public boolean s(int i, int i2) {
        taq.d();
        List list = this.c;
        if (list.isEmpty() || i > i2 || i2 >= list.size()) {
            return false;
        }
        int iF = ((adlo) list.get(i2)).f();
        int i3 = ((adlo) list.get(i)).b;
        while (i2 >= i) {
            E(i2);
            i2--;
        }
        r();
        int i4 = iF - i3;
        if (i4 > 0) {
            A(i3, i4);
        }
        return true;
    }

    public boolean t() {
        taq.d();
        List list = this.c;
        if (list.isEmpty()) {
            return false;
        }
        int iA = a();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            E(size);
        }
        if (iA > 0) {
            A(0, iA);
        }
        return true;
    }

    protected final adlo u(adkz adkzVar, int i) {
        adlo adloVarD = D(adkzVar);
        adloVarD.a.h(adloVarD);
        this.c.add(i, adloVarD);
        o();
        return adloVarD;
    }

    public final adlo v(int i) {
        adlo adloVar;
        if (i < 0 || i >= a()) {
            return null;
        }
        if (this.a && (adloVar = this.b) != null && i >= adloVar.b && i < adloVar.f()) {
            return adloVar;
        }
        List list = this.c;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >> 1;
            adlo adloVar2 = (adlo) list.get(i3);
            if (i < adloVar2.b) {
                size = i3 - 1;
            } else {
                if (i < adloVar2.f()) {
                    this.b = adloVar2;
                    return adloVar2;
                }
                i2 = i3 + 1;
            }
        }
        return null;
    }

    public adlq() {
        throw null;
    }
}
