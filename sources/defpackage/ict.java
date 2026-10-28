package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ict implements tbk, tbj, abji {
    private static final agrf g = agrf.h("com/google/android/apps/youtube/music/player/queue/ObservableVideoItemReferenceList");
    public final abjp a;
    public final Handler b;
    public final int c;
    public tbk d;
    public final vxz e;
    public igp f;
    private final awmd h;
    private final awku i;
    private final avmb j;
    private final icu k;
    private final long l;
    private avmn o;
    private icr p;
    private Runnable q;
    private final ics n = new ics(this);
    private final List m = new ArrayList();

    public ict(abjp abjpVar, awmd awmdVar, awku awkuVar, Handler handler, avmb avmbVar, icu icuVar, vxz vxzVar, int i) {
        this.a = abjpVar;
        this.h = awmdVar;
        this.i = awkuVar;
        this.b = handler;
        this.j = avmbVar;
        this.k = icuVar;
        this.e = vxzVar;
        this.c = i;
        this.l = vxzVar.c(5, 45797742L, 1000L);
    }

    private final boolean A() {
        return ((ycp) this.h.io()).b == 1;
    }

    private final boolean B(abke abkeVar) {
        return r(abkeVar) != -1;
    }

    private static final boolean C(abke abkeVar, abke abkeVar2) {
        return abkeVar == abkeVar2;
    }

    private final int q() {
        if (this.c == 0) {
            return this.a.a();
        }
        return -1;
    }

    private final int r(abke abkeVar) {
        for (int i = 0; i < this.d.size(); i++) {
            if (C((abke) this.d.get(i), abkeVar)) {
                return i;
            }
        }
        return -1;
    }

    private final synchronized ida s(int i) {
        ida idaVar;
        idaVar = (ida) this.m.remove(i);
        this.k.a((abke) idaVar.get(), amee.QUEUE_ACTION_TYPE_REMOVE);
        this.n.jU(i, 1);
        return idaVar;
    }

    private final void t() {
        Runnable runnable;
        if (!A() || (runnable = this.q) == null) {
            return;
        }
        this.b.removeCallbacks(runnable);
    }

    private final synchronized void u(int i, int i2) {
        List list = this.m;
        list.add(i2, (ida) list.remove(i));
        this.n.k(i, i2);
    }

    private final synchronized void v() {
        int iQ;
        int iIndexOf;
        icr icrVar = this.p;
        if (icrVar != null && (iQ = q()) != -1) {
            abke abkeVar = (abke) this.d.get(iQ);
            abke abkeVar2 = icrVar.a;
            if (!C(abkeVar2, abkeVar) && (iIndexOf = indexOf(abkeVar2)) != -1) {
                jT(iIndexOf, 1);
            }
        }
    }

    private final void w(int i, hyz hyzVar) {
        List list = this.m;
        if (((ida) list.get(i)).get() != hyzVar) {
            list.set(i, new ida(hyzVar));
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [aunn, java.lang.Object] */
    private final synchronized void x(int i, int i2) {
        icr icrVar = this.p;
        if (icrVar == null) {
            return;
        }
        this.k.a(icrVar.b, amee.QUEUE_ACTION_TYPE_MOVE);
        this.d.j(i, i2);
        igp igpVar = this.f;
        if (igpVar != null) {
            hyz hyzVar = (hyz) this.d.get(i2);
            hyz hyzVar2 = i2 <= 0 ? null : (hyz) this.d.get(i2 - 1);
            aczl aczlVar = (aczl) igpVar.a.io();
            aczlVar.getClass();
            aczlVar.z(hyzVar, hyzVar2);
        }
        v();
        this.p = null;
    }

    private final void y() {
        if (!A() || !z()) {
            i();
            return;
        }
        t();
        hgx hgxVar = new hgx(this, 15);
        this.q = hgxVar;
        this.b.postDelayed(hgxVar, this.l);
    }

    private final boolean z() {
        return this.l > 0;
    }

    @Override // defpackage.tbk
    public final synchronized boolean addAll(int i, Collection collection) {
        if (this.d == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hyz hyzVar = (hyz) ((ida) it.next()).get();
            if (hyzVar != null) {
                arrayList.add(hyzVar);
            }
        }
        t();
        return this.d.addAll(i, arrayList);
    }

    @Override // defpackage.tbk
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized ida remove(int i) {
        ida idaVarS = null;
        if (this.d == null) {
            return null;
        }
        t();
        if (tym.C(i, Math.min(this.d.size(), size())) && C((abke) ((ida) this.m.get(i)).get(), (abke) this.d.get(i))) {
            s(i);
            return new ida((hyz) this.d.remove(i));
        }
        if (tym.C(i, size()) && B((abke) ((ida) this.m.get(i)).get())) {
            idaVarS = s(i);
            int iR = r((abke) idaVarS.get());
            if (iR != -1) {
                idaVarS = new ida((hyz) this.d.remove(iR));
            } else {
                hyz hyzVar = (hyz) idaVarS.get();
                ((agrc) ((agrc) g.b().i(agso.a, "VideoItemRefList")).k("com/google/android/apps/youtube/music/player/queue/ObservableVideoItemReferenceList", "remove", 314, "ObservableVideoItemReferenceList.java")).w("Item was removed from reference list but missing from the queue. Item videoId: %s", hyzVar != null ? hyzVar.t() : "null");
                y();
            }
        } else {
            ((agrc) ((agrc) g.b().i(agso.a, "VideoItemRefList")).k("com/google/android/apps/youtube/music/player/queue/ObservableVideoItemReferenceList", "remove", 322, "ObservableVideoItemReferenceList.java")).u("Index to be removed is missing. Position: %d", i);
            y();
        }
        return idaVarS;
    }

    @Override // defpackage.tbk
    public final synchronized void clear() {
        throw null;
    }

    @Override // defpackage.tbk
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.tbj
    public final synchronized void d(int i, int i2) {
        if (A() && z()) {
            y();
            return;
        }
        if (size() == this.d.size() - i2) {
            List listSubList = this.d.subList(i, i + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                this.m.add(i3 + i, new ida((hyz) listSubList.get(i3)));
            }
            this.n.d(i, i2);
        }
        i();
    }

    @Override // defpackage.tbk
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final synchronized void add(int i, ida idaVar) {
        hyz hyzVar = (hyz) idaVar.get();
        if (this.d != null && hyzVar != null) {
            t();
            this.d.add(i, hyzVar);
        }
    }

    public final synchronized void g() {
        t();
        icr icrVar = this.p;
        if (icrVar == null) {
            y();
            return;
        }
        int size = this.d.size();
        int i = icrVar.c;
        if (tym.C(i, size) && tym.C(icrVar.d, this.d.size()) && C(icrVar.b, (abke) this.d.get(i))) {
            x(i, icrVar.d);
            return;
        }
        abke abkeVar = icrVar.b;
        if (!B(abkeVar)) {
            zvp.a(zvn.a, zvm.n, "Item to be moved was missing.");
            this.p = null;
            y();
        } else {
            int iR = r(abkeVar);
            if (icrVar.d < this.d.size()) {
                x(iR, icrVar.d);
            } else {
                x(iR, this.d.size() - 1);
            }
        }
    }

    @Override // defpackage.tbk
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return (ida) this.m.get(i);
    }

    public final synchronized void h() {
        if (this.d == null) {
            this.b.post(new gky(this, 20));
        }
    }

    @Override // defpackage.tbk
    public final void hK(tbj tbjVar) {
        this.n.a.add(tbjVar);
    }

    @Override // defpackage.abji
    public final /* bridge */ /* synthetic */ void hp(Object obj, abjm abjmVar) {
        p();
    }

    public final synchronized void i() {
        if (this.d != null) {
            if (size() != this.d.size()) {
                this.b.post(new hgx(this, 16));
                return;
            }
            tbk tbkVar = this.d;
            List listSubList = tbkVar.subList(0, tbkVar.size());
            for (int i = 0; i < listSubList.size(); i++) {
                List list = this.m;
                if (C((abke) ((ida) list.get(i)).get(), (abke) listSubList.get(i))) {
                    w(i, (hyz) listSubList.get(i));
                } else {
                    list.set(i, new ida((hyz) listSubList.get(i)));
                    this.n.jT(i, 1);
                }
            }
        }
    }

    @Override // defpackage.tbk
    public final int indexOf(Object obj) {
        if (obj instanceof ida) {
            obj = ((ida) obj).get();
        }
        if (obj instanceof abke) {
            for (int i = 0; i < size(); i++) {
                if (C((abke) ((ida) this.m.get(i)).get(), (abke) obj)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.tbk
    public final boolean isEmpty() {
        return this.m.isEmpty();
    }

    @Override // defpackage.tbk
    public final synchronized void j(int i, int i2) {
        if (this.d != null && i != i2 && tym.C(i, size()) && tym.B(i2, 0, size())) {
            t();
            u(i, i2);
            icr icrVar = this.p;
            if (icrVar == null) {
                int iQ = q();
                this.p = new icr(i, i2, iQ != -1 ? (abke) this.d.get(iQ) : null, (abke) ((ida) this.m.get(i2)).get());
            } else {
                icrVar.d = i2;
            }
            avmn avmnVar = this.o;
            if (avmnVar == null || avmnVar.f()) {
                this.o = this.i.T(new hxe(5)).az().L(this.j).al(new ibr(this, 3), new ido(1));
            }
        }
    }

    @Override // defpackage.tbj
    public final synchronized void jT(int i, int i2) {
        if (A() && z()) {
            y();
            return;
        }
        if (size() == this.d.size()) {
            List listSubList = this.d.subList(i, i + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                List list = this.m;
                int i4 = i3 + i;
                if (((ida) list.get(i4)).get() != listSubList.get(i3)) {
                    list.set(i4, new ida((hyz) listSubList.get(i3)));
                }
            }
            this.n.jT(i, i2);
        }
        i();
    }

    @Override // defpackage.tbj
    public final synchronized void jU(int i, int i2) {
        if (A() && z()) {
            y();
            return;
        }
        if (size() == this.d.size() + i2) {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                this.m.remove(i + i3);
            }
            this.n.jU(i, i2);
        }
        i();
    }

    @Override // defpackage.tbj
    public final synchronized void k(int i, int i2) {
        if (A() && z()) {
            y();
            return;
        }
        if (size() == this.d.size()) {
            List listSubList = this.d.subList(i2, i2 + 1);
            if (!C((abke) ((ida) this.m.get(i)).get(), (abke) listSubList.get(0))) {
                i();
                return;
            } else {
                w(i, (hyz) listSubList.get(0));
                u(i, i2);
            }
        }
        i();
    }

    public final synchronized void m() {
        if (this.d != null) {
            int size = size();
            tbk tbkVar = this.d;
            List listSubList = tbkVar.subList(0, tbkVar.size());
            int size2 = listSubList.size();
            if (size < size2) {
                for (int i = size; i < size2; i++) {
                    this.m.add(i, new ida((hyz) listSubList.get(i)));
                }
                this.n.d(size, size2 - size);
            } else if (size > size2) {
                while (size() > size2) {
                    this.m.remove(size() - 1);
                }
                int size3 = size - size();
                this.n.jU(size - size3, size3);
            }
            for (int i2 = 0; i2 < size2; i2++) {
                List list = this.m;
                if (C((abke) ((ida) list.get(i2)).get(), (abke) listSubList.get(i2))) {
                    w(i2, (hyz) listSubList.get(i2));
                } else {
                    list.set(i2, new ida((hyz) listSubList.get(i2)));
                    this.n.jT(i2, 1);
                }
            }
        }
    }

    @Override // defpackage.tbk
    public final void n(tbj tbjVar) {
        this.n.a.remove(tbjVar);
    }

    public final synchronized boolean o(hyz hyzVar) {
        int iIndexOf = indexOf(hyzVar);
        if (iIndexOf == -1) {
            return false;
        }
        jT(iIndexOf, 1);
        return true;
    }

    public final synchronized void p() {
        if (A()) {
            y();
        }
    }

    @Override // defpackage.tbk
    public final int size() {
        return this.m.size();
    }

    @Override // defpackage.tbk
    public final List subList(int i, int i2) {
        int size = size();
        return (i < i2 && tym.C(i, size) && tym.B(i2, 0, size)) ? this.m.subList(i, i2) : Collections.EMPTY_LIST;
    }
}
