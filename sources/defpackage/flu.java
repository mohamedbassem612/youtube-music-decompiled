package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class flu {
    public fmj g;
    public final String h;
    public final gev j;
    public final Map a = new HashMap();
    public final jnm k = new jnm();
    public final ahb b = new ahb(10);
    public final Map c = new HashMap();
    public final ArrayList d = new ArrayList();
    public final flt e = new flt(this);
    public final fls f = new fls(this);
    public final hhb l = new hhb(this);
    public final Map i = new LinkedHashMap();

    public flu(gev gevVar, String str) {
        this.j = gevVar;
        this.h = str;
    }

    public static void b(flr flrVar) {
        if (flrVar.d != null) {
            flrVar.d = null;
        }
        if (flrVar.e != null) {
            flrVar.e = null;
        }
    }

    public static void e(fmh fmhVar, fkm fkmVar) {
        short s = fkmVar.b;
        for (int i = 0; i < s; i++) {
            fmhVar.c(fkmVar.c(i));
        }
    }

    public static void h(fmh fmhVar, float f, fkm fkmVar) {
        short s = fkmVar.b;
        for (int i = 0; i < s; i++) {
            fmhVar.d(fkmVar.c(i), f);
        }
    }

    private final void i(View view, boolean z) {
        if ((view instanceof fvf) && !(view instanceof fvs)) {
            Map map = this.i;
            if (!z) {
                if (!map.containsKey(view)) {
                    fvf fvfVar = (fvf) view;
                    map.put(fvfVar, Boolean.valueOf(fvfVar.getClipChildren()));
                }
                ((fvf) view).setClipChildren(false);
            } else if (map.containsKey(view)) {
                ((fvf) view).setClipChildren(((Boolean) map.remove(view)).booleanValue());
            }
        }
        Object parent = view.getParent();
        if (!(parent instanceof fvf) || (parent instanceof fvs)) {
            return;
        }
        i((View) parent, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [fmh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    public final fmj a(flp flpVar) {
        fms fmsVarA;
        Object obj;
        if (!(flpVar instanceof flo)) {
            if (!(flpVar instanceof flv)) {
                throw new RuntimeException("Unhandled Transition type: ".concat(String.valueOf(String.valueOf(flpVar))));
            }
            ArrayList arrayList = ((flv) flpVar).a;
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                fmj fmjVarA = a((flp) arrayList.get(i));
                if (fmjVarA != null) {
                    arrayList2.add(fmjVarA);
                }
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return new fmn(arrayList2);
        }
        flo floVar = (flo) flpVar;
        gev gevVar = floVar.e;
        ArrayList arrayList3 = new ArrayList();
        aero aeroVar = (aero) gevVar.b;
        int i2 = aeroVar.a;
        jnm jnmVar = this.k;
        flq flqVar = (flq) jnmVar.d.get(aeroVar.b);
        aero aeroVar2 = (aero) gevVar.a;
        int i3 = aeroVar2.a;
        ?? r0 = aeroVar2.b;
        flr flrVar = (flr) jnmVar.K(flqVar);
        if (this.h != null) {
            String.valueOf(flqVar);
            r0.b();
        }
        if (flrVar == null || (flrVar.d == null && flrVar.e == null)) {
            fmsVarA = null;
        } else {
            flrVar.h = floVar.b() || flrVar.h;
            int i4 = flrVar.c;
            if (i4 != 0 ? i4 != 2 || floVar.b() : floVar.a()) {
                Map map = flrVar.a;
                tge tgeVar = (tge) map.get(r0);
                fmp fmpVar = new fmp(flqVar, r0);
                float fE = tgeVar != null ? ((fnp) tgeVar.c).c : flrVar.c != 0 ? r0.e((fjh) flrVar.d.d()) : floVar.c.a;
                float fE2 = flrVar.c != 2 ? r0.e((fjh) flrVar.e.d()) : floVar.d.a;
                if (tgeVar == null || (obj = tgeVar.d) == null ? fE != fE2 : fE2 != ((Float) obj).floatValue()) {
                    fmsVarA = floVar.a.a(new fmo(fmpVar, fE2));
                    fmsVarA.b(this.e);
                    fmsVarA.e(floVar.b);
                    if (tgeVar == null) {
                        tgeVar = new tge((byte[]) null);
                        tgeVar.c = new fmi(flrVar.b, r0);
                        map.put(r0, tgeVar);
                    }
                    Object obj2 = tgeVar.c;
                    ((fnp) obj2).c = fE;
                    ((fmi) obj2).c(fE);
                    tgeVar.a++;
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(fmpVar);
                    this.a.put(fmsVarA, arrayList4);
                    this.c.put(fmpVar, Float.valueOf(fE));
                }
            } else {
                flrVar.g = true;
            }
            fmsVarA = null;
        }
        if (fmsVarA != null) {
            arrayList3.add(fmsVarA);
        }
        if (arrayList3.isEmpty()) {
            return null;
        }
        return arrayList3.size() == 1 ? (fmj) arrayList3.get(0) : new fmn(arrayList3);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Map] */
    public final void c(flq flqVar, fkm fkmVar, fkm fkmVar2) {
        jnm jnmVar = this.k;
        flr flrVar = (flr) jnmVar.K(flqVar);
        if (flrVar == null) {
            flrVar = new flr();
            if (jnmVar.b.put(flqVar, flrVar) == null) {
                int i = flqVar.a;
                if (i == 1) {
                    jnmVar.d.put(flqVar.b, flqVar);
                } else if (i != 2) {
                    jnmVar.a.put(flqVar.b, flqVar);
                } else {
                    String str = flqVar.c;
                    ?? r0 = jnmVar.c;
                    Map linkedHashMap = (Map) r0.get(str);
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                        r0.put(str, linkedHashMap);
                    }
                    linkedHashMap.put(flqVar.b, flqVar);
                }
            }
        }
        if (fkmVar == null) {
            if (fkmVar2 == null) {
                throw new RuntimeException("Both current and next LayoutOutput groups were null!");
            }
            flrVar.c = 0;
        } else if (fkmVar2 != null) {
            flrVar.c = 1;
        } else {
            int i2 = flrVar.c;
            if ((i2 == 0 || i2 == 1) && !flrVar.h) {
                flrVar.g = true;
            }
            flrVar.c = 2;
        }
        flrVar.d = fkmVar;
        flrVar.e = fkmVar2;
        fkm fkmVar3 = flrVar.e;
        fjh fjhVar = fkmVar3 != null ? (fjh) fkmVar3.d() : null;
        Map map = flrVar.a;
        for (fmh fmhVar : map.keySet()) {
            tge tgeVar = (tge) map.get(fmhVar);
            if (fjhVar == null) {
                tgeVar.e = null;
            } else {
                tgeVar.e = Float.valueOf(fmhVar.e(fjhVar));
            }
        }
        flrVar.f = true;
        if (this.h != null) {
            String.valueOf(flqVar);
        }
    }

    public final void d(fkm fkmVar, boolean z) {
        Object objB = fkmVar.b(3);
        if (objB instanceof View) {
            i((View) objB, z);
        }
    }

    final void f(flq flqVar, fkm fkmVar) {
        flr flrVar = (flr) this.k.K(flqVar);
        if (flrVar != null) {
            g(flqVar, flrVar, fkmVar);
        }
    }

    public final void g(flq flqVar, flr flrVar, fkm fkmVar) {
        fkm fkmVar2 = flrVar.b;
        if (fkmVar2 == null) {
            if (fkmVar == null) {
                return;
            }
        } else if (fkmVar2.equals(fkmVar)) {
            return;
        }
        if (this.h != null) {
            String.valueOf(flqVar);
            String.valueOf(fkmVar);
        }
        Map map = flrVar.a;
        if (flrVar.b != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                e((fmh) it.next(), flrVar.b);
            }
            d(flrVar.b, true);
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            Object obj = ((tge) it2.next()).c;
            fmi fmiVar = (fmi) obj;
            fmiVar.b(fkmVar);
            fmiVar.c(((fnp) obj).c);
        }
        if (fkmVar != null) {
            d(fkmVar, false);
        }
        flrVar.b = fkmVar;
    }
}
