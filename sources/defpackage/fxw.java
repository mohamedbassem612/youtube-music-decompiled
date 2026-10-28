package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fxw {
    private static final ahub b = afyd.s();
    public static volatile boolean a = false;

    public static double a(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return Math.floor(Math.abs(d)) * ((double) (d > 0.0d ? 1 : -1));
    }

    public static int b(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static long c(double d) {
        return ((long) b(d)) & 4294967295L;
    }

    public static fzp d(String str) {
        fzp fzpVar = null;
        if (str != null && !str.isEmpty()) {
            fzpVar = (fzp) fzp.ao.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (fzpVar != null) {
            return fzpVar;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object e(fyy fyyVar) {
        if (fyy.g.equals(fyyVar)) {
            return null;
        }
        if (fyy.f.equals(fyyVar)) {
            return "";
        }
        if (fyyVar instanceof fyv) {
            return g((fyv) fyyVar);
        }
        if (!(fyyVar instanceof fyo)) {
            return !fyyVar.h().isNaN() ? fyyVar.h() : fyyVar.i();
        }
        ArrayList arrayList = new ArrayList();
        fyn fynVar = new fyn((fyo) fyyVar);
        while (fynVar.hasNext()) {
            Object objE = e(fynVar.next());
            if (objE != null) {
                arrayList.add(objE);
            }
        }
        return arrayList;
    }

    public static String f(String str) {
        return a ? (String) b.h(str) : str;
    }

    public static Map g(fyv fyvVar) {
        HashMap map = new HashMap();
        for (String str : new ArrayList(fyvVar.a.keySet())) {
            Object objE = e(fyvVar.f(str));
            if (objE != null) {
                map.put(str, objE);
            }
        }
        return map;
    }

    public static void h(fzp fzpVar, int i, List list) {
        i(fzpVar.name(), i, list);
    }

    public static void i(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static void j(fzp fzpVar, int i, List list) {
        k(fzpVar.name(), i, list);
    }

    public static void k(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static void l(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static boolean m(fyy fyyVar) {
        if (fyyVar == null) {
            return false;
        }
        Double dH = fyyVar.h();
        return !dH.isNaN() && dH.doubleValue() >= 0.0d && dH.equals(Double.valueOf(Math.floor(dH.doubleValue())));
    }

    public static boolean n(fyy fyyVar, fyy fyyVar2) {
        if (!fyyVar.getClass().equals(fyyVar2.getClass())) {
            return false;
        }
        if (!(fyyVar instanceof fzc) && !(fyyVar instanceof fyw)) {
            if (fyyVar instanceof fyr) {
                if (Double.isNaN(fyyVar.h().doubleValue()) || Double.isNaN(fyyVar2.h().doubleValue())) {
                    return false;
                }
                return fyyVar.h().equals(fyyVar2.h());
            }
            if (fyyVar instanceof fzb) {
                return fyyVar.i().equals(fyyVar2.i());
            }
            if (fyyVar instanceof fyp) {
                return fyyVar.g().equals(fyyVar2.g());
            }
            if (fyyVar != fyyVar2) {
                return false;
            }
        }
        return true;
    }

    public static void o(kwq kwqVar) {
        int iB = b(kwqVar.x("runtime.counter").h().doubleValue() + 1.0d);
        if (iB > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        kwqVar.A("runtime.counter", new fyr(Double.valueOf(iB)));
    }
}
