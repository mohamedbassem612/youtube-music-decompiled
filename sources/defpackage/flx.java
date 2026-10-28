package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class flx extends fvv {
    public static final flx a = new flx(null);
    public static flx b;
    public final String c;

    public flx(String str) {
        this.c = str;
    }

    public static int a(fwb fwbVar, int i) {
        fvq fvqVarG = fwbVar.g(i);
        int iA = fwbVar.a();
        while (true) {
            i++;
            if (i >= iA) {
                return fwbVar.a() - 1;
            }
            fvq fvqVar = fwbVar.g(i).a;
            while (fvqVar != fvqVarG) {
                if (fvqVar == null || (fvqVar = fvqVar.a) == null) {
                    return i - 1;
                }
            }
        }
    }

    public static boolean c(flw flwVar, fwb fwbVar) {
        return flwVar.d == ((fjc) fwbVar).x || flwVar.c.o();
    }

    public static void d(jnm jnmVar) {
        ((flw) jnmVar.b).d = -1;
    }

    public static void e(jnm jnmVar, fwb fwbVar) {
        ArrayList arrayList;
        List listH;
        flw flwVar = (flw) jnmVar.b;
        kro.bl();
        if (flwVar.g) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        fjc fjcVar = (fjc) fwbVar;
        List list = fjcVar.F;
        if (list != null) {
            arrayList2.addAll(list);
        }
        fhd fhdVar = fjcVar.b;
        ComponentTree componentTree = fhdVar.g;
        if (componentTree == null || (listH = componentTree.h()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(listH);
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gzj.aF((flp) it.next(), arrayList2, fjcVar.r);
            }
        }
        inn innVar = new inn();
        inn innVar2 = new inn();
        flq flqVar = fjcVar.q;
        if (flqVar != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                flp flpVar = (flp) arrayList2.get(i);
                if (flpVar == null) {
                    throw new IllegalStateException("NULL_TRANSITION when collecting root bounds anim. Root: " + fjcVar.r + ", root TransitionId: " + flqVar.toString());
                }
                gzj.aI(flqVar, flpVar, fmg.c, innVar);
                gzj.aI(flqVar, flpVar, fmg.d, innVar2);
            }
        }
        if (true != innVar.a) {
            innVar = null;
        }
        if (true != innVar2.a) {
            innVar2 = null;
        }
        ComponentTree componentTree2 = fhdVar.g;
        if (componentTree2 != null) {
            componentTree2.F = innVar;
            componentTree2.G = innVar2;
        }
        flwVar.h = arrayList2.isEmpty() ? null : arrayList2.size() == 1 ? (flp) arrayList2.get(0) : new flv(arrayList2);
        flwVar.g = true;
    }

    public static void f(jnm jnmVar, fkm fkmVar) {
        flw flwVar = (flw) jnmVar.b;
        flq flqVar = ((fjh) flwVar.b.get(((fvi) fkmVar.d()).d.b)).e;
        flu fluVar = flwVar.e;
        if (fluVar != null && flqVar != null) {
            fluVar.f(flqVar, null);
        }
        short s = fkmVar.b;
        for (int i = 0; i < s; i++) {
            o(jnmVar, (fvi) fkmVar.c(i), true);
        }
    }

    public static void g(int i, jnm jnmVar) {
        if (n(i, m(jnmVar))) {
            return;
        }
        long j = ((fjr) ((flw) jnmVar.b).i.g(i).b).a;
        if (jnmVar.I(j)) {
            jnmVar.J(j);
        }
        jnmVar.G(j, true);
        jnmVar.J(j);
    }

    public static void h(int i, jnm jnmVar) {
        fvq fvqVar;
        fwb fwbVar = ((flw) jnmVar.b).i;
        if (fwbVar == null || i < 0) {
            return;
        }
        fvq fvqVarG = fwbVar.g(i);
        int iB = -1;
        if (fvqVarG != null && (fvqVar = fvqVarG.a) != null) {
            iB = fwbVar.b(((fjr) fvqVar.b).a);
        }
        if (iB < 0 || n(iB, m(jnmVar))) {
            return;
        }
        h(iB, jnmVar);
        g(iB, jnmVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    public static void i(jnm jnmVar) {
        flw flwVar = (flw) jnmVar.b;
        if (flwVar.e == null) {
            return;
        }
        Map map = flwVar.a;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            f(jnmVar, (fkm) it.next());
        }
        jnmVar.H();
        map.clear();
        flwVar.b.clear();
        flwVar.f.clear();
        flu fluVar = flwVar.e;
        jnm jnmVar2 = fluVar.k;
        for (flq flqVar : jnmVar2.M()) {
            flr flrVar = (flr) jnmVar2.K(flqVar);
            fluVar.g(flqVar, flrVar, null);
            flu.b(flrVar);
        }
        jnmVar2.d.clear();
        jnmVar2.c.clear();
        jnmVar2.a.clear();
        jnmVar2.b.clear();
        fluVar.b.e();
        fluVar.a.clear();
        ArrayList arrayList = fluVar.d;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                fluVar.g = null;
                fluVar.i.clear();
                return;
            }
            ((fmj) arrayList.get(size)).f();
        }
    }

    public static void j(jnm jnmVar, fwb fwbVar, int i, boolean z) {
        int iA = a(fwbVar, i);
        for (int i2 = i; i2 <= iA; i2++) {
            long j = ((fjr) fwbVar.g(i2).b).a;
            if (z) {
                if (!jnmVar.I(j)) {
                    jnmVar.G(j, false);
                }
            } else if (jnmVar.I(j)) {
                jnmVar.J(j);
            }
        }
        fvq fvqVar = fwbVar.g(i).a;
        while (fvqVar != null) {
            fvq fvqVar2 = fvqVar.a;
            if (fvqVar2 == null) {
                return;
            }
            long j2 = ((fjr) fvqVar.b).a;
            if (z) {
                if (!jnmVar.I(j2)) {
                    jnmVar.G(j2, false);
                }
            } else if (jnmVar.I(j2)) {
                jnmVar.J(j2);
            }
            fvqVar = fvqVar2;
        }
    }

    public static final boolean l(jnm jnmVar, fvi fviVar) {
        return ((flw) jnmVar.b).b.containsKey(fviVar.d.b);
    }

    private static boolean n(int i, fkb fkbVar) {
        return fkbVar.i(i) != null;
    }

    private static void o(jnm jnmVar, fvi fviVar, boolean z) {
        flw flwVar = (flw) jnmVar.b;
        Object obj = fviVar.a;
        fvr fvrVar = fviVar.d.b;
        if ((obj instanceof fvf) && !(obj instanceof fvs)) {
            fvf fvfVar = (fvf) obj;
            int iA = fvfVar.a();
            while (true) {
                iA--;
                if (iA < 0) {
                    break;
                }
                try {
                    o(jnmVar, fvfVar.b(iA), false);
                } catch (RuntimeException e) {
                    throw new RuntimeException("content: <cls>" + String.valueOf(fviVar.a.getClass()) + "</cls>\nrenderunit: <cls>" + String.valueOf(fviVar.d.b.getClass()) + "</cls>", e);
                }
            }
            if (fvfVar.a() > 0) {
                throw new IllegalStateException("Recursively unmounting items from a Host, left some items behind, this should never happen.");
            }
        }
        fvf fvfVar2 = fviVar.b;
        if (fvfVar2 == null) {
            throw new IllegalStateException("Disappearing mountItem has no host, can not be unmounted.");
        }
        if (z) {
            ComponentHost componentHost = (ComponentHost) fvfVar2;
            componentHost.e();
            if (!componentHost.g.remove(fviVar)) {
                throw new RuntimeException("Tried to remove non-existent disappearing item, transitionId: ".concat(String.valueOf(String.valueOf(((fjh) ((flw) jnmVar.b).b.get(fviVar.d.b)).e))));
            }
            Object obj2 = fviVar.a;
            if (obj2 instanceof Drawable) {
                componentHost.s((Drawable) obj2);
            } else if (obj2 instanceof View) {
                componentHost.t((View) obj2);
                componentHost.i = true;
            }
            componentHost.u(fja.a(fviVar));
        } else {
            fvfVar2.q(fviVar);
        }
        m(jnmVar).x(fviVar);
        flwVar.b.remove(fviVar.d.b);
    }

    @Override // defpackage.fvv
    public final /* bridge */ /* synthetic */ Object b() {
        return new flw(this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fvv
    public final void k(jnm jnmVar, fvr fvrVar, Object obj) {
        fwb fwbVar = ((flw) jnmVar.b).c;
        if (fwbVar != null) {
            fjc fjcVar = (fjc) fwbVar;
            ComponentTree componentTree = fjcVar.b.g;
            if (componentTree == null || !componentTree.k) {
                return;
            }
            long j = ((fjr) fvrVar).a;
            if (jnmVar.I(j) && fjcVar.k.contains(Long.valueOf(j))) {
                kro.bl();
                Stack stack = new Stack();
                stack.push((View) obj);
                while (!stack.isEmpty()) {
                    View view = (View) stack.pop();
                    if (view instanceof fwa) {
                        ((fwa) view).C(new Rect(0, 0, view.getWidth(), view.getHeight()), false);
                    } else if (view instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        int childCount = viewGroup.getChildCount();
                        while (true) {
                            childCount--;
                            if (childCount >= 0) {
                                stack.push(viewGroup.getChildAt(childCount));
                            }
                        }
                    }
                }
            }
        }
    }
}
