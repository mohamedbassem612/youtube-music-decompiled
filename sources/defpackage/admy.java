package defpackage;

import j$.util.Comparator$EL;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class admy extends adks implements adlr {
    private final List a = new ArrayList();
    private final HashMap b = new HashMap();
    private final Comparator c;
    private final int d;
    private final int e;

    public admy(int i, int i2) {
        this.d = i;
        this.e = i2;
        Comparator pkeVar = new pke(new fui(new fui(new rit(16), 11), 15, null), this, 3);
        pkeVar = i2 == 3 ? Comparator$EL.reversed(pkeVar) : pkeVar;
        pkeVar.getClass();
        this.c = pkeVar;
    }

    private final admv o(akya akyaVar) {
        int i;
        if (this.d - 1 != 1 || (i = akyaVar.b) != 1) {
            return null;
        }
        akcm akcmVar = i == 1 ? (akcm) akyaVar.c : akcm.a;
        akcmVar.getClass();
        return new admv(akcmVar.b, akcmVar.c);
    }

    private final void p(Object obj) {
        String strS = s(obj);
        if (strS != null) {
            this.b.remove(strS);
            List list = this.a;
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (awrc.c(s(it.next()), strS)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                list.set(i, obj);
                return;
            }
        }
        this.a.add(obj);
    }

    private final void q(List list, List list2) {
        hs.a(new admx(list, list2), true).a(new admw(this));
    }

    private static final akrn r(Object obj) {
        Objects.checkIndex(0, 3);
        if (obj != null) {
            if (obj instanceof akrn) {
                return (akrn) obj;
            }
            if (obj instanceof acxm) {
                return ((acxm) obj).a;
            }
        }
        return null;
    }

    private static final String s(Object obj) {
        akrn akrnVarR = r(obj);
        if (akrnVarR == null) {
            return null;
        }
        akro akroVar = akrnVarR.c;
        if (akroVar == null) {
            akroVar = akro.a;
        }
        if (akroVar == null) {
            return null;
        }
        if ((akroVar.b & 16777216) == 0) {
            akroVar = null;
        }
        if (akroVar != null) {
            return akroVar.i;
        }
        return null;
    }

    @Override // defpackage.adkz
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.adlr
    public final boolean add(Object obj) {
        obj.getClass();
        taq.d();
        List list = this.a;
        List listAr = atqq.ar(list);
        p(obj);
        atqq.P(list, this.c);
        q(listAr, list);
        return true;
    }

    @Override // defpackage.adlr
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        taq.d();
        if (collection.isEmpty()) {
            return false;
        }
        List list = this.a;
        List listAr = atqq.ar(list);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            p(it.next());
        }
        atqq.P(list, this.c);
        q(listAr, list);
        return true;
    }

    @Override // defpackage.adkz
    public final long c(int i) {
        return i;
    }

    @Override // defpackage.adlr
    public final void clear() {
        taq.d();
        List list = this.a;
        int size = list.size();
        list.clear();
        A(0, size);
    }

    @Override // defpackage.adkz
    public final boolean contains(Object obj) {
        obj.getClass();
        return this.a.contains(obj);
    }

    @Override // defpackage.adkz
    public final Object d(int i) {
        return this.a.get(i);
    }

    @Override // defpackage.adlr
    public final void hH(Collection collection) {
        collection.addAll(this.a);
    }

    @Override // defpackage.adlr
    public final boolean hJ(String str, akya akyaVar) {
        str.getClass();
        akyaVar.getClass();
        taq.d();
        admv admvVarO = o(akyaVar);
        if (admvVarO != null) {
            List list = this.a;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (awrc.c(s(it.next()), str)) {
                        this.b.put(str, admvVarO);
                        Comparator comparator = this.c;
                        List listAr = atqq.ar(list);
                        atqq.P(list, comparator);
                        q(listAr, list);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.adlr
    public final void hL(int i, int i2) {
        taq.d();
        if (i2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i3 = i + i2;
        List list = this.a;
        ahno.N(i, i3, list.size());
        list.subList(i, i3).clear();
        A(i, i2);
    }

    @Override // defpackage.adlr
    public final void hM(int i, Object obj) {
        obj.getClass();
        taq.d();
        List list = this.a;
        ahno.W(i, list.size());
        List listAr = atqq.ar(list);
        String strS = s(list.remove(i));
        if (strS != null) {
        }
        p(obj);
        atqq.P(list, this.c);
        q(listAr, list);
    }

    @Override // defpackage.adkz
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // defpackage.adlr
    public final void k(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        taq.d();
        int iIndexOf = this.a.indexOf(obj);
        if (iIndexOf >= 0) {
            hM(iIndexOf, obj2);
        }
    }

    @Override // defpackage.adlr
    public final void l(Collection collection) {
        taq.d();
        List list = this.a;
        List listAr = atqq.ar(list);
        list.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            p(it.next());
        }
        atqq.P(list, this.c);
        q(listAr, list);
    }

    public final admv m(Object obj) {
        admv admvVar;
        String strS = s(obj);
        if (strS != null && (admvVar = (admv) this.b.get(strS)) != null) {
            return admvVar;
        }
        akrn akrnVarR = r(obj);
        if (akrnVarR != null) {
            akro akroVar = akrnVarR.c;
            if (akroVar == null) {
                akroVar = akro.a;
            }
            if (akroVar != null) {
                akyk akykVar = akroVar.k;
                if (akykVar == null) {
                    akykVar = akyk.a;
                }
                if (akykVar != null) {
                    akya akyaVar = akykVar.b;
                    if (akyaVar == null) {
                        akyaVar = akya.a;
                    }
                    if (akyaVar != null) {
                        return o(akyaVar);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.adlr
    public final boolean remove(Object obj) {
        obj.getClass();
        taq.d();
        int iIndexOf = this.a.indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // defpackage.adlr
    public final Object remove(int i) {
        taq.d();
        List list = this.a;
        ahno.W(i, list.size());
        Object objRemove = list.remove(i);
        B(i);
        return objRemove;
    }

    @Override // defpackage.adlr
    public final void add(int i, Object obj) {
        obj.getClass();
        add(obj);
    }

    @Override // defpackage.adlr
    public final void j(int i, int i2) {
    }
}
