package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bj extends dy {
    public final List a;
    public final ea b;
    public final ea c;
    public final dv d;
    public final afv e;
    public final boolean f;
    public Object g;
    public boolean h;
    private final Object k;
    private final ArrayList l;
    private final ArrayList m;
    private final afv n;
    private final ArrayList o;
    private final ArrayList p;
    private final afv q;
    private final awl r;

    public bj(List list, ea eaVar, ea eaVar2, dv dvVar, Object obj, ArrayList arrayList, ArrayList arrayList2, afv afvVar, ArrayList arrayList3, ArrayList arrayList4, afv afvVar2, afv afvVar3, boolean z) {
        arrayList3.getClass();
        arrayList4.getClass();
        this.a = list;
        this.b = eaVar;
        this.c = eaVar2;
        this.d = dvVar;
        this.k = obj;
        this.l = arrayList;
        this.m = arrayList2;
        this.n = afvVar;
        this.o = arrayList3;
        this.p = arrayList4;
        this.q = afvVar2;
        this.e = afvVar3;
        this.f = z;
        this.r = new awl();
    }

    private final awml g(ViewGroup viewGroup, ea eaVar, ea eaVar2) {
        dv dvVar;
        Object obj;
        ArrayList arrayList;
        Object obj2;
        eaVar = eaVar;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        List list = this.a;
        Iterator it = list.iterator();
        View view2 = null;
        boolean z = false;
        while (it.hasNext()) {
            if (((bk) it.next()).c() && eaVar2 != null && eaVar != null && !this.n.isEmpty() && (obj2 = this.k) != null) {
                boolean z2 = this.f;
                afv afvVar = this.q;
                C0027do.a(eaVar.a, eaVar2.a, z2, afvVar, true);
                ayz.b(viewGroup, new bf(eaVar, eaVar2, this, 0));
                ArrayList arrayList2 = this.l;
                arrayList2.addAll(afvVar.values());
                ArrayList arrayList3 = this.p;
                if (!arrayList3.isEmpty()) {
                    Object obj3 = arrayList3.get(0);
                    obj3.getClass();
                    view2 = (View) afvVar.get((String) obj3);
                    this.d.j(obj2, view2);
                }
                ArrayList arrayList4 = this.m;
                afv afvVar2 = this.e;
                arrayList4.addAll(afvVar2.values());
                ArrayList arrayList5 = this.o;
                if (!arrayList5.isEmpty()) {
                    Object obj4 = arrayList5.get(0);
                    obj4.getClass();
                    View view3 = (View) afvVar2.get((String) obj4);
                    if (view3 != null) {
                        ayz.b(viewGroup, new bg(view3, rect, 0));
                        z = true;
                    }
                }
                dv dvVar2 = this.d;
                dvVar2.k(obj2, view, arrayList2);
                dvVar2.q(obj2, null, null, obj2, arrayList4);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it2 = list.iterator();
        Object objP = null;
        Object objP2 = null;
        while (it2.hasNext()) {
            bk bkVar = (bk) it2.next();
            ea eaVar3 = bkVar.a;
            dv dvVar3 = this.d;
            Object objA = dvVar3.a(bkVar.b);
            if (objA != null) {
                Iterator it3 = it2;
                ArrayList arrayList7 = new ArrayList();
                boolean z3 = z;
                cc ccVar = eaVar3.a;
                Object obj5 = objP;
                View view4 = ccVar.mView;
                view4.getClass();
                h(arrayList7, view4);
                if (this.k != null) {
                    if (eaVar3 == eaVar2) {
                        arrayList7.removeAll(atqq.aw(this.l));
                    } else if (eaVar3 == eaVar) {
                        arrayList7.removeAll(atqq.aw(this.m));
                    }
                }
                if (arrayList7.isEmpty()) {
                    dvVar3.d(objA, view);
                    obj = objA;
                    arrayList = arrayList7;
                    dvVar = dvVar3;
                } else {
                    dvVar3.e(objA, arrayList7);
                    dvVar3.q(objA, objA, arrayList7, null, null);
                    dvVar = dvVar3;
                    obj = objA;
                    arrayList = arrayList7;
                    if (eaVar3.h == 3) {
                        eaVar3.g();
                        ArrayList arrayList8 = new ArrayList(arrayList);
                        arrayList8.remove(ccVar.mView);
                        dvVar.h(obj, ccVar.mView, arrayList8);
                        ayz.b(viewGroup, new bh(arrayList, 0));
                    }
                }
                if (eaVar3.h == 2) {
                    arrayList6.addAll(arrayList);
                    if (z3) {
                        dvVar.i(obj, rect);
                    }
                    if (dd.aa(2)) {
                        Objects.toString(obj);
                        Iterator it4 = arrayList.iterator();
                        it4.getClass();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            next.getClass();
                            Objects.toString((View) next);
                        }
                    }
                } else {
                    dvVar.j(obj, view2);
                    if (dd.aa(2)) {
                        Objects.toString(obj);
                        Iterator it5 = arrayList.iterator();
                        it5.getClass();
                        while (it5.hasNext()) {
                            Object next2 = it5.next();
                            next2.getClass();
                            Objects.toString((View) next2);
                        }
                    }
                }
                if (bkVar.c) {
                    objP2 = dvVar.p(objP2, obj);
                    it2 = it3;
                    z = z3;
                    objP = obj5;
                } else {
                    objP = dvVar.p(obj5, obj);
                    it2 = it3;
                    z = z3;
                }
            }
        }
        Object objB = this.d.b(objP2, objP, this.k);
        if (dd.aa(2)) {
            Objects.toString(objB);
            Objects.toString(viewGroup);
        }
        return new awml(arrayList6, objB);
    }

    private final void h(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = bae.a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                childAt.getClass();
                h(arrayList, childAt);
            }
        }
    }

    private final void i(ArrayList arrayList, ViewGroup viewGroup, Function0 function0) {
        C0027do.b(arrayList, 4);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.m;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            int i2 = bac.a;
            arrayList2.add(view.getTransitionName());
            view.setTransitionName(null);
        }
        if (dd.aa(2)) {
            Iterator it = this.l.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                View view2 = (View) next;
                int i3 = bac.a;
                view2.getTransitionName();
                Objects.toString(view2);
            }
            Iterator it2 = arrayList3.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                next2.getClass();
                View view3 = (View) next2;
                int i4 = bac.a;
                view3.getTransitionName();
                Objects.toString(view3);
            }
        }
        function0.invoke();
        dv dvVar = this.d;
        ArrayList arrayList4 = this.l;
        afv afvVar = this.n;
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i5 = 0; i5 < size2; i5++) {
            View view4 = (View) arrayList4.get(i5);
            int i6 = bac.a;
            String transitionName = view4.getTransitionName();
            arrayList5.add(transitionName);
            if (transitionName != null) {
                view4.setTransitionName(null);
                String str = (String) afvVar.get(transitionName);
                for (int i7 = 0; i7 < size2; i7++) {
                    if (str.equals(arrayList2.get(i7))) {
                        ((View) arrayList3.get(i7)).setTransitionName(transitionName);
                        break;
                    }
                }
            }
        }
        ayz.b(viewGroup, new cdf(size2, arrayList3, arrayList2, arrayList4, arrayList5, 1));
        C0027do.b(arrayList, 0);
        dvVar.l(this.k, arrayList4, arrayList3);
    }

    @Override // defpackage.dy
    public final void a(ViewGroup viewGroup) {
        this.r.a();
    }

    @Override // defpackage.dy
    public final void b(ViewGroup viewGroup) {
        int i = 0;
        if (!viewGroup.isLaidOut() || this.h) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ea eaVar = ((bk) it.next()).a;
                if (dd.aa(2)) {
                    if (this.h) {
                        Objects.toString(eaVar);
                    } else {
                        Objects.toString(viewGroup);
                        Objects.toString(eaVar);
                    }
                }
                eaVar.f(this);
            }
            this.h = false;
            return;
        }
        Object obj = this.g;
        if (obj != null) {
            this.d.t(obj);
            if (dd.aa(2)) {
                ea eaVar2 = this.b;
                ea eaVar3 = this.c;
                Objects.toString(eaVar2);
                Objects.toString(eaVar3);
                return;
            }
            return;
        }
        ea eaVar4 = this.c;
        ea eaVar5 = this.b;
        awml awmlVarG = g(viewGroup, eaVar4, eaVar5);
        Object obj2 = awmlVarG.a;
        Object obj3 = awmlVarG.b;
        List list = this.a;
        ArrayList arrayList = (ArrayList) obj2;
        ArrayList<ea> arrayList2 = new ArrayList(atqq.N(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((bk) it2.next()).a);
        }
        for (ea eaVar6 : arrayList2) {
            dv dvVar = this.d;
            cc ccVar = eaVar6.a;
            dvVar.r(obj3, this.r, new bg(eaVar6, this, 2));
        }
        i(arrayList, viewGroup, new bi(this, viewGroup, obj3, i));
        if (dd.aa(2)) {
            Objects.toString(eaVar5);
            Objects.toString(eaVar4);
        }
    }

    @Override // defpackage.dy
    public final void c(ViewGroup viewGroup) {
        Object obj;
        int i = 2;
        if (!viewGroup.isLaidOut()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ea eaVar = ((bk) it.next()).a;
                if (dd.aa(2)) {
                    Objects.toString(viewGroup);
                    Objects.toString(eaVar);
                }
            }
            return;
        }
        if (f() && (obj = this.k) != null && !d()) {
            ea eaVar2 = this.b;
            ea eaVar3 = this.c;
            Objects.toString(obj);
            Objects.toString(eaVar2);
            Objects.toString(eaVar3);
        }
        if (d() && f()) {
            awrm awrmVar = new awrm();
            awml awmlVarG = g(viewGroup, this.c, this.b);
            Object obj2 = awmlVarG.a;
            Object obj3 = awmlVarG.b;
            List list = this.a;
            ArrayList arrayList = (ArrayList) obj2;
            ArrayList<ea> arrayList2 = new ArrayList(atqq.N(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((bk) it2.next()).a);
            }
            for (ea eaVar4 : arrayList2) {
                bh bhVar = new bh(awrmVar, i);
                dv dvVar = this.d;
                cc ccVar = eaVar4.a;
                dvVar.z(obj3, this.r, bhVar, new bg(eaVar4, this, 3));
            }
            i(arrayList, viewGroup, new ega(this, viewGroup, obj3, awrmVar, 1));
        }
    }

    @Override // defpackage.dy
    public final boolean d() {
        Object obj;
        dv dvVar = this.d;
        if (!dvVar.n()) {
            return false;
        }
        List<bk> list = this.a;
        if (!list.isEmpty()) {
            for (bk bkVar : list) {
                if (Build.VERSION.SDK_INT < 34 || (obj = bkVar.b) == null || !dvVar.o(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.k;
        return obj2 == null || dvVar.o(obj2);
    }

    @Override // defpackage.dy
    public final void e(pw pwVar) {
        Object obj = this.g;
        if (obj != null) {
            this.d.w(obj, pwVar.a);
        }
    }

    public final boolean f() {
        List list = this.a;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((bk) it.next()).a.a.mTransitioning) {
                return false;
            }
        }
        return true;
    }
}
