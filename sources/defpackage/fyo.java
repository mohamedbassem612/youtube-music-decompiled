package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fyo implements Iterable, fyy, fyu {
    final SortedMap a;
    final Map b;

    public fyo(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                q(i, (fyy) list.get(i));
            }
        }
    }

    public final int b() {
        return this.a.size();
    }

    public final int c() {
        SortedMap sortedMap = this.a;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((Integer) sortedMap.lastKey()).intValue() + 1;
    }

    @Override // defpackage.fyy
    public final fyy d() {
        fyo fyoVar = new fyo();
        for (Map.Entry entry : this.a.entrySet()) {
            boolean z = entry.getValue() instanceof fyu;
            SortedMap sortedMap = fyoVar.a;
            if (z) {
                sortedMap.put((Integer) entry.getKey(), (fyy) entry.getValue());
            } else {
                sortedMap.put((Integer) entry.getKey(), ((fyy) entry.getValue()).d());
            }
        }
        return fyoVar;
    }

    public final fyy e(int i) {
        fyy fyyVar;
        if (i < c()) {
            return (!s(i) || (fyyVar = (fyy) this.a.get(Integer.valueOf(i))) == null) ? f : fyyVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fyo) {
            fyo fyoVar = (fyo) obj;
            if (c() == fyoVar.c()) {
                SortedMap sortedMap = this.a;
                if (sortedMap.isEmpty()) {
                    return fyoVar.a.isEmpty();
                }
                for (int iIntValue = ((Integer) sortedMap.firstKey()).intValue(); iIntValue <= ((Integer) sortedMap.lastKey()).intValue(); iIntValue++) {
                    if (e(iIntValue).equals(fyoVar.e(iIntValue))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fyu
    public final fyy f(String str) {
        fyy fyyVar;
        if ("length".equals(str)) {
            return new fyr(Double.valueOf(c()));
        }
        return (!t(str) || (fyyVar = (fyy) this.b.get(str)) == null) ? f : fyyVar;
    }

    @Override // defpackage.fyy
    public final Boolean g() {
        return Boolean.TRUE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [fyy] */
    /* JADX WARN: Type inference failed for: r1v13, types: [fyo] */
    /* JADX WARN: Type inference failed for: r1v58, types: [fyy] */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v6, types: [fyy] */
    /* JADX WARN: Type inference failed for: r1v63, types: [fzb] */
    @Override // defpackage.fyy
    public final fyy gR(String str, kwq kwqVar, List list) {
        ?? D;
        double d;
        double dC;
        String strI;
        fys fysVar;
        double dC2;
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str) && !"sort".equals(str) && !"splice".equals(str) && !"toString".equals(str) && !"unshift".equals(str)) {
            return fhz.aC(this, new fzb(str), kwqVar, list);
        }
        int i = 0;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    fxw.i("toString", 0, list);
                    return new fzb(j(","));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                if (str.equals("concat")) {
                    D = d();
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            fyy fyyVarV = kwqVar.v((fyy) it.next());
                            if (fyyVarV instanceof fyq) {
                                throw new IllegalStateException("Failed evaluation of arguments");
                            }
                            fyo fyoVar = (fyo) D;
                            int iC = fyoVar.c();
                            if (fyyVarV instanceof fyo) {
                                fyo fyoVar2 = (fyo) fyyVarV;
                                Iterator itK = fyoVar2.k();
                                while (itK.hasNext()) {
                                    Integer num = (Integer) itK.next();
                                    fyoVar.q(num.intValue() + iC, fyoVar2.e(num.intValue()));
                                }
                            } else {
                                fyoVar.q(iC, fyyVarV);
                            }
                        }
                    }
                    return D;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1274492040:
                if (str.equals("filter")) {
                    fxw.i("filter", 1, list);
                    fyy fyyVarV2 = kwqVar.v((fyy) list.get(0));
                    if (!(fyyVarV2 instanceof fyx)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (b() == 0) {
                        return new fyo();
                    }
                    fyy fyyVarD = d();
                    fyo fyoVarAA = fhz.aA(this, kwqVar, (fyx) fyyVarV2, null, Boolean.TRUE);
                    D = new fyo();
                    Iterator itK2 = fyoVarAA.k();
                    while (itK2.hasNext()) {
                        D.n(((fyo) fyyVarD).e(((Integer) itK2.next()).intValue()));
                    }
                    return D;
                }
                throw new IllegalArgumentException("Command not supported");
            case -934873754:
                if (str.equals("reduce")) {
                    return fhz.aB(this, kwqVar, list, true);
                }
                throw new IllegalArgumentException("Command not supported");
            case -895859076:
                if (str.equals("splice")) {
                    if (list.isEmpty()) {
                        return new fyo();
                    }
                    int iA = (int) fxw.a(kwqVar.v((fyy) list.get(0)).h().doubleValue());
                    if (iA < 0) {
                        iA = Math.max(0, iA + c());
                    } else if (iA > c()) {
                        iA = c();
                    }
                    int iC2 = c();
                    fyo fyoVar3 = new fyo();
                    if (list.size() > 1) {
                        int iMax = Math.max(0, (int) fxw.a(kwqVar.v((fyy) list.get(1)).h().doubleValue()));
                        if (iMax > 0) {
                            for (int i2 = iA; i2 < Math.min(iC2, iA + iMax); i2++) {
                                fyoVar3.n(e(iA));
                                p(iA);
                            }
                        }
                        if (list.size() > 2) {
                            for (int i3 = 2; i3 < list.size(); i3++) {
                                fyy fyyVarV3 = kwqVar.v((fyy) list.get(i3));
                                if (fyyVarV3 instanceof fyq) {
                                    throw new IllegalArgumentException("Failed to parse elements to add");
                                }
                                int i4 = (iA + i3) - 2;
                                if (i4 < 0) {
                                    throw new IllegalArgumentException(a.bR(i4, "Invalid value index: "));
                                }
                                if (i4 >= c()) {
                                    q(i4, fyyVarV3);
                                } else {
                                    SortedMap sortedMap = this.a;
                                    for (int iIntValue = ((Integer) sortedMap.lastKey()).intValue(); iIntValue >= i4; iIntValue--) {
                                        Integer numValueOf = Integer.valueOf(iIntValue);
                                        fyy fyyVar = (fyy) sortedMap.get(numValueOf);
                                        if (fyyVar != null) {
                                            q(iIntValue + 1, fyyVar);
                                            sortedMap.remove(numValueOf);
                                        }
                                    }
                                    q(i4, fyyVarV3);
                                }
                            }
                        }
                    } else {
                        while (iA < iC2) {
                            fyoVar3.n(e(iA));
                            q(iA, null);
                            iA++;
                        }
                    }
                    return fyoVar3;
                }
                throw new IllegalArgumentException("Command not supported");
            case -678635926:
                if (str.equals("forEach")) {
                    fxw.i("forEach", 1, list);
                    fyy fyyVarV4 = kwqVar.v((fyy) list.get(0));
                    if (!(fyyVarV4 instanceof fyx)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (b() == 0) {
                        return fyy.f;
                    }
                    fhz.aA(this, kwqVar, (fyx) fyyVarV4, null, null);
                    return fyy.f;
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    fxw.l("lastIndexOf", 2, list);
                    fyy fyyVarV5 = fyy.f;
                    if (!list.isEmpty()) {
                        fyyVarV5 = kwqVar.v((fyy) list.get(0));
                    }
                    int iC3 = c() - 1;
                    if (list.size() > 1) {
                        fyy fyyVarV6 = kwqVar.v((fyy) list.get(1));
                        dC = Double.isNaN(fyyVarV6.h().doubleValue()) ? c() - 1 : fxw.a(fyyVarV6.h().doubleValue());
                        d = 0.0d;
                        if (dC < 0.0d) {
                            dC += (double) c();
                        }
                    } else {
                        d = 0.0d;
                        dC = iC3;
                    }
                    if (dC < d) {
                        return new fyr(Double.valueOf(-1.0d));
                    }
                    for (int iMin = (int) Math.min(c(), dC); iMin >= 0; iMin--) {
                        if (s(iMin) && fxw.n(e(iMin), fyyVarV5)) {
                            return new fyr(Double.valueOf(iMin));
                        }
                    }
                    return new fyr(Double.valueOf(-1.0d));
                }
                throw new IllegalArgumentException("Command not supported");
            case -277637751:
                if (str.equals("unshift")) {
                    if (!list.isEmpty()) {
                        fyo fyoVar4 = new fyo();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            fyy fyyVarV7 = kwqVar.v((fyy) it2.next());
                            if (fyyVarV7 instanceof fyq) {
                                throw new IllegalStateException("Argument evaluation failed");
                            }
                            fyoVar4.n(fyyVarV7);
                        }
                        int iC4 = fyoVar4.c();
                        Iterator itK3 = k();
                        while (itK3.hasNext()) {
                            Integer num2 = (Integer) itK3.next();
                            fyoVar4.q(num2.intValue() + iC4, e(num2.intValue()));
                        }
                        o();
                        Iterator itK4 = fyoVar4.k();
                        while (itK4.hasNext()) {
                            Integer num3 = (Integer) itK4.next();
                            q(num3.intValue(), fyoVar4.e(num3.intValue()));
                        }
                    }
                    return new fyr(Double.valueOf(c()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 107868:
                if (str.equals("map")) {
                    fxw.i("map", 1, list);
                    fyy fyyVarV8 = kwqVar.v((fyy) list.get(0));
                    if (fyyVarV8 instanceof fyx) {
                        return c() == 0 ? new fyo() : fhz.aA(this, kwqVar, (fyx) fyyVarV8, null, null);
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                }
                throw new IllegalArgumentException("Command not supported");
            case 111185:
                if (str.equals("pop")) {
                    fxw.i("pop", 0, list);
                    int iC5 = c();
                    if (iC5 == 0) {
                        return fyy.f;
                    }
                    int i5 = iC5 - 1;
                    D = e(i5);
                    p(i5);
                    return D;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3267882:
                if (str.equals("join")) {
                    fxw.l("join", 1, list);
                    if (c() == 0) {
                        return fyy.m;
                    }
                    if (list.isEmpty()) {
                        strI = ",";
                    } else {
                        fyy fyyVarV9 = kwqVar.v((fyy) list.get(0));
                        strI = ((fyyVarV9 instanceof fyw) || (fyyVarV9 instanceof fzc)) ? "" : fyyVarV9.i();
                    }
                    D = new fzb(j(strI));
                    return D;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3452698:
                if (str.equals("push")) {
                    if (!list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            n(kwqVar.v((fyy) it3.next()));
                        }
                    }
                    return new fyr(Double.valueOf(c()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536116:
                if (str.equals("some")) {
                    fxw.i("some", 1, list);
                    fyy fyyVarV10 = kwqVar.v((fyy) list.get(0));
                    if (!(fyyVarV10 instanceof fys)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (c() == 0) {
                        return fyy.l;
                    }
                    fys fysVar2 = (fys) fyyVarV10;
                    Iterator itK5 = k();
                    while (itK5.hasNext()) {
                        int iIntValue2 = ((Integer) itK5.next()).intValue();
                        if (s(iIntValue2) && fysVar2.a(kwqVar, Arrays.asList(e(iIntValue2), new fyr(Double.valueOf(iIntValue2)), this)).g().booleanValue()) {
                            return fyy.k;
                        }
                    }
                    return fyy.l;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536286:
                if (str.equals("sort")) {
                    fxw.l("sort", 1, list);
                    if (c() >= 2) {
                        List listM = m();
                        if (list.isEmpty()) {
                            fysVar = null;
                        } else {
                            fyy fyyVarV11 = kwqVar.v((fyy) list.get(0));
                            if (!(fyyVarV11 instanceof fys)) {
                                throw new IllegalArgumentException("Comparator should be a method");
                            }
                            fysVar = (fys) fyyVarV11;
                        }
                        Collections.sort(listM, new fzh(fysVar, kwqVar));
                        o();
                        Iterator it4 = listM.iterator();
                        while (it4.hasNext()) {
                            q(i, (fyy) it4.next());
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case 96891675:
                if (str.equals("every")) {
                    fxw.i("every", 1, list);
                    fyy fyyVarV12 = kwqVar.v((fyy) list.get(0));
                    if (!(fyyVarV12 instanceof fyx)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (c() == 0) {
                        return fyy.k;
                    }
                    return fhz.aA(this, kwqVar, (fyx) fyyVarV12, Boolean.FALSE, Boolean.TRUE).c() != c() ? fyy.l : fyy.k;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109407362:
                if (str.equals("shift")) {
                    fxw.i("shift", 0, list);
                    if (c() == 0) {
                        return fyy.f;
                    }
                    fyy fyyVarE = e(0);
                    p(0);
                    return fyyVarE;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    fxw.l("slice", 2, list);
                    if (list.isEmpty()) {
                        return d();
                    }
                    double dC3 = c();
                    double dA = fxw.a(kwqVar.v((fyy) list.get(0)).h().doubleValue());
                    double dMax = dA < 0.0d ? Math.max(dA + dC3, 0.0d) : Math.min(dA, dC3);
                    if (list.size() == 2) {
                        double dA2 = fxw.a(kwqVar.v((fyy) list.get(1)).h().doubleValue());
                        dC3 = dA2 < 0.0d ? Math.max(dC3 + dA2, 0.0d) : Math.min(dC3, dA2);
                    }
                    fyo fyoVar5 = new fyo();
                    for (int i6 = (int) dMax; i6 < dC3; i6++) {
                        fyoVar5.n(e(i6));
                    }
                    return fyoVar5;
                }
                throw new IllegalArgumentException("Command not supported");
            case 965561430:
                if (str.equals("reduceRight")) {
                    return fhz.aB(this, kwqVar, list, false);
                }
                throw new IllegalArgumentException("Command not supported");
            case 1099846370:
                if (str.equals("reverse")) {
                    fxw.i("reverse", 0, list);
                    int iC6 = c();
                    if (iC6 != 0) {
                        while (i < iC6 / 2) {
                            if (s(i)) {
                                fyy fyyVarE2 = e(i);
                                q(i, null);
                                int i7 = (iC6 - 1) - i;
                                if (s(i7)) {
                                    q(i, e(i7));
                                }
                                q(i7, fyyVarE2);
                            }
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    fxw.l("indexOf", 2, list);
                    fyy fyyVarV13 = fyy.f;
                    if (!list.isEmpty()) {
                        fyyVarV13 = kwqVar.v((fyy) list.get(0));
                    }
                    if (list.size() > 1) {
                        double dA3 = fxw.a(kwqVar.v((fyy) list.get(1)).h().doubleValue());
                        if (dA3 >= c()) {
                            return new fyr(Double.valueOf(-1.0d));
                        }
                        dC2 = dA3 < 0.0d ? ((double) c()) + dA3 : dA3;
                    } else {
                        dC2 = 0.0d;
                    }
                    Iterator itK6 = k();
                    while (itK6.hasNext()) {
                        int iIntValue3 = ((Integer) itK6.next()).intValue();
                        double d2 = iIntValue3;
                        if (d2 >= dC2 && fxw.n(e(iIntValue3), fyyVarV13)) {
                            return new fyr(Double.valueOf(d2));
                        }
                    }
                    return new fyr(Double.valueOf(-1.0d));
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // defpackage.fyy
    public final Double h() {
        SortedMap sortedMap = this.a;
        if (sortedMap.size() == 1) {
            return e(0).h();
        }
        return sortedMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.fyy
    public final String i() {
        return j(",");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new fyn(this);
    }

    public final String j(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= c()) {
                    break;
                }
                fyy fyyVarE = e(i);
                sb.append(str2);
                if (!(fyyVarE instanceof fzc) && !(fyyVarE instanceof fyw)) {
                    sb.append(fyyVarE.i());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final Iterator k() {
        return this.a.keySet().iterator();
    }

    @Override // defpackage.fyy
    public final Iterator l() {
        return new fym(this.a.keySet().iterator(), this.b.keySet().iterator());
    }

    public final List m() {
        ArrayList arrayList = new ArrayList(c());
        for (int i = 0; i < c(); i++) {
            arrayList.add(e(i));
        }
        return arrayList;
    }

    public final void n(fyy fyyVar) {
        q(c(), fyyVar);
    }

    public final void o() {
        this.a.clear();
    }

    public final void p(int i) {
        SortedMap sortedMap = this.a;
        int iIntValue = ((Integer) sortedMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        sortedMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf(i2);
            if (sortedMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            sortedMap.put(numValueOf, fyy.f);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) sortedMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            fyy fyyVar = (fyy) sortedMap.get(numValueOf2);
            if (fyyVar != null) {
                sortedMap.put(Integer.valueOf(i - 1), fyyVar);
                sortedMap.remove(numValueOf2);
            }
        }
    }

    public final void q(int i, fyy fyyVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.bR(i, "Out of bounds index: "));
        }
        SortedMap sortedMap = this.a;
        if (fyyVar == null) {
            sortedMap.remove(Integer.valueOf(i));
        } else {
            sortedMap.put(Integer.valueOf(i), fyyVar);
        }
    }

    @Override // defpackage.fyu
    public final void r(String str, fyy fyyVar) {
        Map map = this.b;
        if (fyyVar == null) {
            map.remove(str);
        } else {
            map.put(str, fyyVar);
        }
    }

    public final boolean s(int i) {
        if (i >= 0) {
            SortedMap sortedMap = this.a;
            if (i <= ((Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(Integer.valueOf(i));
            }
        }
        throw new IndexOutOfBoundsException(a.bR(i, "Out of bounds index: "));
    }

    @Override // defpackage.fyu
    public final boolean t(String str) {
        return "length".equals(str) || this.b.containsKey(str);
    }

    public final String toString() {
        return j(",");
    }

    public fyo() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }

    public fyo(fyy... fyyVarArr) {
        this(Arrays.asList(fyyVarArr));
    }
}
