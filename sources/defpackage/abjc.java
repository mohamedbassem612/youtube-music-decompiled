package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class abjc implements abjl {
    public final Set E;
    private final SparseArray a;
    private final Set b;
    private final Set c;
    private final abjf d;
    private final Set e;
    private final abmt f;
    private int g;

    public abjc(abmt abmtVar) {
        abjf abjfVar = new abjf();
        this.a = new SparseArray(2);
        this.b = new CopyOnWriteArraySet();
        this.c = new CopyOnWriteArraySet();
        this.E = new CopyOnWriteArraySet();
        this.d = abjfVar;
        this.f = abmtVar;
        for (int i = 0; i < 2; i++) {
            this.a.put(F[i], new ArrayList());
        }
        this.g = -1;
        this.e = new HashSet();
    }

    private final synchronized void a() {
        List list = (List) this.a.get(0);
        boolean zH = this.f.H();
        int i = this.g;
        abke abkeVar = null;
        if (i != -1 && (!zH || (i >= 0 && i < list.size()))) {
            abkeVar = (abke) list.get(this.g);
        }
        ahno.O(this.d.a(abkeVar));
    }

    private final synchronized void c(int i) {
        if (i != this.g) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((abjj) it.next()).ho(i, this.g);
            }
        }
    }

    private final synchronized void d(int i, int i2) {
        int i3 = this.g;
        if (i3 != -1 && i <= i3) {
            this.g = i3 + i2;
            a();
        }
    }

    private final synchronized void e(int i, int i2) {
        int i3 = this.g;
        if (i3 == -1 || !tym.B(i3, Math.min(i, i2), Math.max(i, i2))) {
            return;
        }
        int i4 = this.g;
        if (i4 == i) {
            this.g = i2;
        } else if (i < i2) {
            this.g = i4 - 1;
        } else {
            this.g = i4 + 1;
        }
        a();
    }

    private final synchronized void f(int i, int i2) {
        int i3 = this.g;
        if (i3 != -1 && i <= i3) {
            if (i + i2 > i3) {
                this.g = Math.min(i, ((List) this.a.get(0)).size() - 1);
                h(null);
            } else {
                this.g = i3 - i2;
                a();
            }
        }
    }

    private final void g(int i, Object obj, abjm abjmVar) {
        int i2;
        synchronized (this) {
            List list = (List) this.a.get(0);
            if (!list.isEmpty()) {
                nsj.o(i, list.size() - 1);
            } else if (i != -1) {
                throw new IndexOutOfBoundsException();
            }
            i2 = this.g;
            this.g = i;
            if (obj != null) {
                S(obj);
            }
            if (!this.f.E()) {
                c(i2);
                h(abjmVar);
            }
        }
        if (this.f.E()) {
            c(i2);
            h(abjmVar);
        }
    }

    private final synchronized void h(abjm abjmVar) {
        abjf abjfVar = this.d;
        abke abkeVarB = abjg.b(this);
        if (!abjfVar.a(abkeVarB)) {
            abjfVar.b = abkeVarB;
            Iterator it = abjfVar.a.iterator();
            while (it.hasNext()) {
                ((abji) it.next()).hp(abkeVarB, abjmVar);
            }
        }
    }

    public boolean H() {
        return true;
    }

    @Override // defpackage.abjl
    public final synchronized int M(abke abkeVar) {
        Object objR = R();
        int iGZ = gZ(0, abkeVar);
        if (iGZ < 0) {
            int iGZ2 = gZ(1, abkeVar);
            if (iGZ2 < 0) {
                iGZ = Math.max(0, this.g + 1);
                ha(0, iGZ, Collections.singleton(abkeVar));
            } else {
                if (H()) {
                    int i = iGZ2 + 1;
                    for (int i2 = 0; i2 < i; i2++) {
                        hh(1, 0, 0, hc(0));
                    }
                } else {
                    hh(1, iGZ2, 0, hc(0));
                }
                iGZ = hc(0) - 1;
            }
        }
        g(iGZ, objR, null);
        return hd();
    }

    @Override // defpackage.abjl
    public final synchronized abjw N() {
        return new abjw(agke.n(((List) this.a.get(0)).subList(0, hc(0))), this.g);
    }

    @Override // defpackage.abjl
    public final synchronized abke O(int i, int i2) {
        return (abke) ((List) this.a.get(i)).get(i2);
    }

    @Override // defpackage.abjl
    public final synchronized void P(int i) {
        g(i, null, null);
    }

    @Override // defpackage.abjl
    public final synchronized boolean Q() {
        for (int i = 0; i < 2; i++) {
            if (!((List) this.a.get(F[i])).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final synchronized Object R() {
        Object obj;
        obj = new Object();
        this.e.add(obj);
        return obj;
    }

    public final synchronized void S(Object obj) {
        this.e.remove(obj);
    }

    public final synchronized void T(int i, abjm abjmVar) {
        g(i, null, abjmVar);
    }

    public final synchronized void U(List list) {
        list.addAll((Collection) this.a.get(0));
    }

    @Override // defpackage.abjl
    public final abjk b() {
        return abjk.a;
    }

    @Override // defpackage.abjl
    public final synchronized int gZ(int i, abke abkeVar) {
        return ((List) this.a.get(i)).indexOf(abkeVar);
    }

    @Override // defpackage.abjl
    public void ha(int i, int i2, Collection collection) {
        int i3;
        if (collection == null || collection.isEmpty()) {
            return;
        }
        int size = collection.size();
        synchronized (this) {
            Object objR = R();
            ((List) this.a.get(i)).addAll(i2, collection);
            i3 = this.g;
            if (i == 0) {
                d(i2, size);
                i = 0;
            }
            S(objR);
            if (!this.f.E()) {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((abjh) it.next()).a(i, i2, size);
                }
                c(i3);
            }
        }
        if (this.f.E()) {
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                ((abjh) it2.next()).a(i, i2, size);
            }
            c(i3);
        }
    }

    @Override // defpackage.abjl
    public synchronized void hb() {
        for (int i = 0; i < 2; i++) {
            int i2 = F[i];
            hi(i2, 0, ((List) this.a.get(i2)).size());
        }
    }

    @Override // defpackage.abjl
    public final synchronized int hc(int i) {
        return ((List) this.a.get(i)).size();
    }

    @Override // defpackage.abjl
    public final synchronized int hd() {
        return this.g;
    }

    @Override // defpackage.abjl
    public final void he(abjh abjhVar) {
        this.b.add(abjhVar);
    }

    @Override // defpackage.abjl
    public final void hf(abji abjiVar) {
        this.d.a.add(abjiVar);
    }

    @Override // defpackage.abjl
    public final void hg(abjj abjjVar) {
        this.c.add(abjjVar);
    }

    @Override // defpackage.abjl
    public final void hh(int i, int i2, int i3, int i4) {
        if (i2 == i4 && i == i3) {
            return;
        }
        synchronized (this) {
            Object objR = R();
            SparseArray sparseArray = this.a;
            List list = (List) sparseArray.get(i);
            List list2 = (List) sparseArray.get(i3);
            abmt abmtVar = this.f;
            boolean zH = abmtVar.H();
            if (zH) {
                if (i2 < 0 || i2 >= list.size()) {
                    zvp.a(zvn.b, zvm.k, "Attempted to move a queue item from a position which doesn't exist.");
                    S(objR);
                    return;
                }
            } else if (i2 >= list.size()) {
                zvp.a(zvn.b, zvm.k, "Attempted to move a queue item from a position which doesn't exist.");
                S(objR);
                return;
            }
            abke abkeVar = (abke) list.remove(i2);
            if (zH) {
                if (i4 < 0) {
                    zvp.a(zvn.b, zvm.k, "Attempted to move a queue item to a negative position.");
                    i4 = 0;
                } else if (i4 > list2.size()) {
                    zvp.a(zvn.b, zvm.k, "Attempted to move a queue item to a position which doesn't exist.");
                    i4 = list2.size();
                }
                list2.add(i4, abkeVar);
            } else if (i4 > list2.size()) {
                zvp.a(zvn.b, zvm.k, "Attempted to move a queue item to a position which doesn't exist.");
                list2.add(abkeVar);
            } else {
                list2.add(i4, abkeVar);
            }
            int i5 = this.g;
            boolean z = i == 0;
            boolean z2 = i3 == 0;
            if (z) {
                if (z2) {
                    e(i2, i4);
                } else {
                    f(i2, 1);
                }
            } else if (z2) {
                d(i4, 1);
                Iterator it = this.E.iterator();
                while (it.hasNext()) {
                    ((aczl) ((icj) ((hwf) it.next()).a).k.io()).x((hyz) abkeVar);
                }
            }
            S(objR);
            if (!abmtVar.E()) {
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    ((abjh) it2.next()).b(i, i2, i3, i4);
                }
                c(i5);
            }
            if (abmtVar.E()) {
                Iterator it3 = this.b.iterator();
                while (it3.hasNext()) {
                    ((abjh) it3.next()).b(i, i2, i3, i4);
                }
                c(i5);
            }
        }
    }

    @Override // defpackage.abjl
    public final void hi(int i, int i2, int i3) {
        int i4;
        if (i3 != 0) {
            synchronized (this) {
                Object objR = R();
                ((List) this.a.get(i)).subList(i2, i2 + i3).clear();
                i4 = this.g;
                if (i == 0) {
                    f(i2, i3);
                    i = 0;
                }
                S(objR);
                if (!this.f.E()) {
                    Iterator it = this.b.iterator();
                    while (it.hasNext()) {
                        ((abjh) it.next()).c(i, i2, i3);
                    }
                    c(i4);
                }
            }
            if (this.f.E()) {
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    ((abjh) it2.next()).c(i, i2, i3);
                }
                c(i4);
            }
        }
    }

    @Override // defpackage.abjl
    public final void hj(abjh abjhVar) {
        this.b.remove(abjhVar);
    }

    @Override // defpackage.abjl
    public final void hk(abji abjiVar) {
        this.d.a.remove(abjiVar);
    }

    @Override // defpackage.abjl
    public final void hl(abjj abjjVar) {
        this.c.remove(abjjVar);
    }

    @Override // defpackage.abjl
    public final synchronized boolean hm() {
        return this.e.isEmpty();
    }
}
