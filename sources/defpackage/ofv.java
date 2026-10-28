package defpackage;

import android.graphics.Rect;
import j$.util.DesugarCollections;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ofv {
    protected static final Map a;
    private static final Set d;
    protected final Set b = EnumSet.noneOf(ogj.class);
    public ogi c;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("atos", new ofz(ofh.D, null, 0));
        linkedHashMap.put("avt", new ofz(ofh.D, hashSet, 0));
        linkedHashMap.put("davs", new ofy(ofh.ah, 0));
        linkedHashMap.put("dafvs", new ofy(ofh.ai, 0));
        linkedHashMap.put("dav", new ofy(ofh.F, 0));
        linkedHashMap.put("ss", new ofz(ofh.s, off.b, 1));
        linkedHashMap.put("ssb", new ofx(ofh.x, null, true));
        linkedHashMap.put("t", new ofy(ofh.al, 0));
        a = DesugarCollections.unmodifiableMap(linkedHashMap);
        d = EnumSet.of(ogj.COMPLETE, ogj.ABANDON, ogj.SKIP, ogj.SWIPE);
    }

    public ofv(ogi ogiVar) {
        this.c = ogiVar;
    }

    protected Map a(ogj ogjVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sv", new ofy("118", 1));
        linkedHashMap.put("cb", new ofy("a", 1));
        linkedHashMap.put("sdk", new ofy(ofh.c, 0));
        linkedHashMap.put("gmm", new ofy(ofh.d, 0));
        ofh ofhVar = ofh.e;
        DecimalFormat decimalFormat = off.c;
        linkedHashMap.put("a", new ofz(ofhVar, decimalFormat, 1));
        linkedHashMap.put("nv", new ofz(ofh.f, decimalFormat, 1));
        linkedHashMap.put("mv", new ofz(ofh.g, decimalFormat, 1));
        ofh ofhVar2 = ofh.l;
        DecimalFormat decimalFormat2 = off.b;
        linkedHashMap.put("c", new ofz(ofhVar2, decimalFormat2, 1));
        linkedHashMap.put("nc", new ofz(ofh.m, decimalFormat2, 1));
        linkedHashMap.put("mc", new ofz(ofh.n, decimalFormat2, 1));
        linkedHashMap.put("tos", new ofz(ofh.y, null, 0));
        linkedHashMap.put("mtos", new ofz(ofh.z, null, 0));
        linkedHashMap.put("amtos", new ofz(ofh.E, null, 0));
        linkedHashMap.put("p", new ofz(ofh.Q, null, 0));
        linkedHashMap.put("cp", new ofz(ofh.V, null, 0));
        linkedHashMap.put("bs", new ofz(ofh.ab, null, 0));
        linkedHashMap.put("ps", new ofz(ofh.aa, null, 0));
        linkedHashMap.put("scs", new ofz(ofh.ac, null, 0));
        linkedHashMap.put("at", new ofy(ofh.G, 0));
        linkedHashMap.put("as", new ofy(ofh.I, 0));
        linkedHashMap.put("dur", new ofy(ofh.O, 0));
        linkedHashMap.put("vmtime", new ofy(ofh.P, 0));
        linkedHashMap.put("dvs", new ofy(ofh.af, 0));
        linkedHashMap.put("dfvs", new ofy(ofh.ag, 0));
        linkedHashMap.put("dtos", new ofy(ofh.ad, 0));
        linkedHashMap.put("dtoss", new ofy(ofh.ae, 0));
        linkedHashMap.put("std", new ofy(ofh.aj, 0));
        linkedHashMap.put("tcm", new ofy(ofh.am, 0));
        linkedHashMap.put("bt", new ofy(ofh.an, 0));
        linkedHashMap.put("pst", new ofy(ofh.ao, 0));
        linkedHashMap.put("nmt", new ofy(ofh.ap, 0));
        linkedHashMap.put("ft", new ofy(ofh.M, 0));
        linkedHashMap.put("dat", new ofy(ofh.H, 0));
        linkedHashMap.put("dft", new ofy(ofh.N, 0));
        linkedHashMap.put("is", new ofy(ofh.aq, 0));
        linkedHashMap.put("i0", new ofy(ofh.ar, 0));
        linkedHashMap.put("i1", new ofy(ofh.as, 0));
        linkedHashMap.put("i2", new ofy(ofh.at, 0));
        linkedHashMap.put("i3", new ofy(ofh.au, 0));
        linkedHashMap.put("ic", new ofy(ofh.av, 0));
        linkedHashMap.put("cs", new ofy(ofh.aw, 0));
        linkedHashMap.put("vpt", new ofy(ofh.J, 0));
        linkedHashMap.put("dvpt", new ofy(ofh.K, 0));
        linkedHashMap.put("lte", new ofy("1", 1));
        linkedHashMap.put("avms", new ofy("nl", 1));
        if (ogjVar != null && (ogjVar.c() || ogjVar.d())) {
            linkedHashMap.put("qmt", new ofz(ofh.ax, null, 0));
            linkedHashMap.put("qnc", new ofz(ofh.ay, decimalFormat2, 1));
            linkedHashMap.put("qmv", new ofz(ofh.az, decimalFormat, 1));
            linkedHashMap.put("qnv", new ofz(ofh.aA, decimalFormat, 1));
        }
        if (ogjVar != null && ogjVar.d()) {
            linkedHashMap.put("c0", new ofz(ofh.o, decimalFormat2, 2));
            linkedHashMap.put("c1", new ofz(ofh.p, decimalFormat2, 2));
            linkedHashMap.put("c2", new ofz(ofh.q, decimalFormat2, 2));
            linkedHashMap.put("c3", new ofz(ofh.r, decimalFormat2, 2));
            linkedHashMap.put("a0", new ofz(ofh.h, decimalFormat, 2));
            linkedHashMap.put("a1", new ofz(ofh.i, decimalFormat, 2));
            linkedHashMap.put("a2", new ofz(ofh.j, decimalFormat, 2));
            linkedHashMap.put("a3", new ofz(ofh.k, decimalFormat, 2));
            linkedHashMap.put("ss0", new ofz(ofh.t, decimalFormat2, 2));
            linkedHashMap.put("ss1", new ofz(ofh.u, decimalFormat2, 2));
            linkedHashMap.put("ss2", new ofz(ofh.v, decimalFormat2, 2));
            linkedHashMap.put("ss3", new ofz(ofh.w, decimalFormat2, 2));
            linkedHashMap.put("p0", new ofz(ofh.R, null, 0));
            linkedHashMap.put("p1", new ofz(ofh.S, null, 0));
            linkedHashMap.put("p2", new ofz(ofh.T, null, 0));
            linkedHashMap.put("p3", new ofz(ofh.U, null, 0));
            linkedHashMap.put("cp0", new ofz(ofh.W, null, 0));
            linkedHashMap.put("cp1", new ofz(ofh.X, null, 0));
            linkedHashMap.put("cp2", new ofz(ofh.Y, null, 0));
            linkedHashMap.put("cp3", new ofz(ofh.Z, null, 0));
            agkz agkzVarR = agkz.r(0, 2, 4);
            linkedHashMap.put("mtos1", new ofx(ofh.A, agkzVarR, false));
            linkedHashMap.put("mtos2", new ofx(ofh.B, agkzVarR, false));
            linkedHashMap.put("mtos3", new ofx(ofh.C, agkzVarR, false));
        }
        linkedHashMap.put("psm", new ofy(ofh.aC, 0));
        linkedHashMap.put("psv", new ofy(ofh.aD, 0));
        linkedHashMap.put("psfv", new ofy(ofh.aE, 0));
        linkedHashMap.put("psa", new ofy(ofh.aF, 0));
        linkedHashMap.put("tm", new ofy(ofh.aK, 0));
        linkedHashMap.put("tu", new ofy(ofh.aL, 0));
        return linkedHashMap;
    }

    public abstract void b(ofo ofoVar, ogh oghVar);

    public abstract void c(ogh oghVar);

    public final ofg d(ogj ogjVar, ogh oghVar) throws Throwable {
        int i;
        Throwable th;
        oft oftVar;
        int i2;
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        if (oghVar.r && !Collections.disjoint(this.b, d)) {
            return null;
        }
        boolean z = ogjVar != null && ogjVar.x && !this.b.contains(ogjVar) && this.c.b(ogjVar).contains("VIEWABILITY");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ofh.c, "a");
        oft oftVar2 = oghVar.e;
        linkedHashMap.put(ofh.x, oftVar2.h.l(1, false));
        linkedHashMap.put(ofh.al, Long.valueOf(oghVar.d));
        linkedHashMap.put(ofh.aJ, Double.valueOf(-1.0d));
        ofh ofhVar = ofh.l;
        ofl oflVar = oghVar.f;
        linkedHashMap.put(ofhVar, Double.valueOf(oflVar != null ? oflVar.a : 0.0d));
        ofh ofhVar2 = ofh.s;
        ofl oflVar2 = oghVar.f;
        linkedHashMap.put(ofhVar2, Double.valueOf(oflVar2 != null ? oflVar2.b : 0.0d));
        ofh ofhVar3 = ofh.Q;
        ofl oflVar3 = oghVar.f;
        linkedHashMap.put(ofhVar3, (oflVar3 == null || (rect4 = oflVar3.c) == null) ? new Integer[]{0, 0, 0, 0} : new Integer[]{Integer.valueOf(rect4.top), Integer.valueOf(oghVar.f.c.left), Integer.valueOf(oghVar.f.c.bottom), Integer.valueOf(oghVar.f.c.right)});
        ofl oflVar4 = oghVar.f;
        if (oflVar4 == null || (rect3 = oflVar4.d) == null || rect3.equals(oflVar4.c)) {
            i = 3;
            th = null;
        } else {
            th = null;
            i = 3;
            linkedHashMap.put(ofh.V, new Integer[]{Integer.valueOf(oghVar.f.d.top), Integer.valueOf(oghVar.f.d.left), Integer.valueOf(oghVar.f.d.bottom), Integer.valueOf(oghVar.f.d.right)});
        }
        ofh ofhVar4 = ofh.ab;
        ofl oflVar5 = oghVar.f;
        linkedHashMap.put(ofhVar4, (oflVar5 == null || (rect2 = oflVar5.e) == null) ? new Integer[]{0, 0} : new Integer[]{Integer.valueOf(rect2.width()), Integer.valueOf(oghVar.f.e.height())});
        ofh ofhVar5 = ofh.ac;
        ofl oflVar6 = oghVar.f;
        linkedHashMap.put(ofhVar5, (oflVar6 == null || (rect = oflVar6.f) == null) ? new Integer[]{0, 0} : new Integer[]{Integer.valueOf(rect.width()), Integer.valueOf(oghVar.f.f.height())});
        linkedHashMap.put(ofh.m, Double.valueOf(oftVar2.a));
        linkedHashMap.put(ofh.n, Double.valueOf(oftVar2.b));
        linkedHashMap.put(ofh.y, oftVar2.g.l(1, false));
        linkedHashMap.put(ofh.z, oftVar2.c(true));
        linkedHashMap.put(ofh.aK, Long.valueOf(oftVar2.e));
        linkedHashMap.put(ofh.aL, Long.valueOf(oftVar2.f));
        linkedHashMap.put(ofh.d, 4);
        linkedHashMap.put(ofh.e, Double.valueOf(oghVar.n));
        linkedHashMap.put(ofh.O, Integer.valueOf(oghVar.o));
        linkedHashMap.put(ofh.P, Integer.valueOf(oghVar.p));
        linkedHashMap.put(ofh.am, Integer.valueOf(oghVar.t - 1));
        linkedHashMap.put(ofh.an, Long.valueOf(oghVar.g));
        linkedHashMap.put(ofh.L, Boolean.valueOf(oghVar.l));
        linkedHashMap.put(ofh.ao, Long.valueOf(oghVar.i));
        linkedHashMap.put(ofh.ap, Long.valueOf(oghVar.h));
        oft oftVar3 = oghVar.e;
        ogl oglVar = (ogl) oftVar3;
        linkedHashMap.put(ofh.f, Double.valueOf(oglVar.i));
        linkedHashMap.put(ofh.g, Double.valueOf(oglVar.j));
        ofh ofhVar6 = ofh.D;
        elr elrVar = oglVar.v;
        linkedHashMap.put(ofhVar6, elrVar.l(1, true));
        linkedHashMap.put(ofh.E, elrVar.l(2, false));
        ofh ofhVar7 = ofh.G;
        oge ogeVar = oglVar.m;
        linkedHashMap.put(ofhVar7, Long.valueOf(ogeVar.b(1)));
        linkedHashMap.put(ofh.I, Boolean.valueOf(oglVar.f()));
        ofh ofhVar8 = ofh.aB;
        linkedHashMap.put(ofhVar8, Boolean.valueOf(oglVar.f()));
        linkedHashMap.put(ofh.J, Long.valueOf(oglVar.d()));
        linkedHashMap.put(ofh.M, Long.valueOf(oglVar.k));
        linkedHashMap.put(ofh.ak, Boolean.valueOf(oglVar.g()));
        tld tldVar = oglVar.w;
        linkedHashMap.put(ofh.aq, Integer.valueOf(tldVar.H()));
        List list = oghVar.m;
        if (list.size() > 0) {
            ogg oggVar = (ogg) list.get(0);
            i2 = 0;
            linkedHashMap.put(ofh.ar, oggVar.d);
            linkedHashMap.put(ofh.o, new Double[]{Double.valueOf(oggVar.a)});
            oftVar = oftVar3;
            linkedHashMap.put(ofh.h, new Double[]{Double.valueOf(oggVar.b)});
            linkedHashMap.put(ofh.t, new Double[]{Double.valueOf(oggVar.c)});
            linkedHashMap.put(ofh.R, oggVar.f());
            Integer[] numArrE = oggVar.e();
            if (numArrE != null && !Arrays.equals(numArrE, oggVar.f())) {
                linkedHashMap.put(ofh.W, numArrE);
            }
        } else {
            oftVar = oftVar3;
            i2 = 0;
        }
        if (list.size() >= 2) {
            ogg oggVar2 = (ogg) list.get(1);
            linkedHashMap.put(ofh.as, oggVar2.d);
            linkedHashMap.put(ofh.p, oggVar2.b());
            linkedHashMap.put(ofh.i, oggVar2.d());
            linkedHashMap.put(ofh.u, oggVar2.c());
            linkedHashMap.put(ofh.S, oggVar2.f());
            linkedHashMap.put(ofh.A, oggVar2.e);
            Integer[] numArrE2 = oggVar2.e();
            if (numArrE2 != null && !Arrays.equals(numArrE2, oggVar2.f())) {
                linkedHashMap.put(ofh.X, numArrE2);
            }
        }
        if (list.size() >= i) {
            ogg oggVar3 = (ogg) list.get(2);
            linkedHashMap.put(ofh.at, oggVar3.d);
            linkedHashMap.put(ofh.q, oggVar3.b());
            linkedHashMap.put(ofh.j, oggVar3.d());
            linkedHashMap.put(ofh.v, oggVar3.c());
            linkedHashMap.put(ofh.T, oggVar3.f());
            linkedHashMap.put(ofh.B, oggVar3.e);
            Integer[] numArrE3 = oggVar3.e();
            if (numArrE3 != null && !Arrays.equals(numArrE3, oggVar3.f())) {
                linkedHashMap.put(ofh.Y, numArrE3);
            }
        }
        if (list.size() >= 4) {
            ogg oggVar4 = (ogg) list.get(3);
            linkedHashMap.put(ofh.au, oggVar4.d);
            linkedHashMap.put(ofh.r, oggVar4.b());
            linkedHashMap.put(ofh.k, oggVar4.d());
            linkedHashMap.put(ofh.w, oggVar4.c());
            linkedHashMap.put(ofh.U, oggVar4.f());
            linkedHashMap.put(ofh.C, oggVar4.e);
            Integer[] numArrE4 = oggVar4.e();
            if (numArrE4 != null && !Arrays.equals(numArrE4, oggVar4.f())) {
                linkedHashMap.put(ofh.Z, numArrE4);
            }
        }
        Object obj = tldVar.a;
        ofh ofhVar9 = ofh.aw;
        EnumMap enumMap = (EnumMap) obj;
        Iterator it = enumMap.keySet().iterator();
        int i3 = i2;
        while (it.hasNext()) {
            i3 |= ((ofp) it.next()).s;
        }
        linkedHashMap.put(ofhVar9, Integer.valueOf(i3));
        if (z) {
            if (oftVar.b()) {
                linkedHashMap.put(ofh.ad, Integer.valueOf((int) oglVar.n.a()));
                ofh ofhVar10 = ofh.ae;
                int i4 = oglVar.q;
                oglVar.q = i4 + 1;
                linkedHashMap.put(ofhVar10, Integer.valueOf(i4));
                linkedHashMap.put(ofh.F, Integer.valueOf((int) oglVar.p.a()));
            }
            elr elrVar2 = oglVar.g;
            ofh ofhVar11 = ofh.af;
            double d2 = ofs.HALF.f;
            linkedHashMap.put(ofhVar11, Integer.valueOf((int) elrVar2.g(d2)));
            ofh ofhVar12 = ofh.ag;
            double d3 = ofs.FULL.f;
            linkedHashMap.put(ofhVar12, Integer.valueOf((int) elrVar2.g(d3)));
            linkedHashMap.put(ofh.ah, Integer.valueOf((int) elrVar.g(d2)));
            linkedHashMap.put(ofh.ai, Integer.valueOf((int) elrVar.g(d3)));
            ofh ofhVar13 = ofh.av;
            int i5 = i2;
            for (Map.Entry entry : enumMap.entrySet()) {
                if (!((Boolean) entry.getValue()).booleanValue()) {
                    i5 |= ((ofp) entry.getKey()).r;
                    entry.setValue(Boolean.TRUE);
                }
            }
            linkedHashMap.put(ofhVar13, Integer.valueOf(i5));
            elrVar.k();
            elrVar2.k();
            linkedHashMap.put(ofh.H, Integer.valueOf((int) ogeVar.a()));
            linkedHashMap.put(ofh.K, Integer.valueOf((int) oglVar.l.a()));
            ofh ofhVar14 = ofh.N;
            int i6 = oglVar.o;
            oglVar.o = i2;
            linkedHashMap.put(ofhVar14, Integer.valueOf(i6));
        }
        linkedHashMap.put(ofh.ax, oghVar.o().c(true));
        linkedHashMap.put(ofh.ay, Double.valueOf(oghVar.o().a));
        linkedHashMap.put(ofh.az, Double.valueOf(oghVar.o().j));
        linkedHashMap.put(ofhVar8, Boolean.valueOf(oghVar.o().f()));
        linkedHashMap.put(ofh.aA, Double.valueOf(oghVar.o().i));
        oga ogaVar = oglVar.s;
        linkedHashMap.put(ofh.aC, Integer.valueOf(ogaVar.b));
        linkedHashMap.put(ofh.aD, Integer.valueOf(ogaVar.a));
        linkedHashMap.put(ofh.aE, Integer.valueOf(oglVar.t.a));
        linkedHashMap.put(ofh.aF, Integer.valueOf(oglVar.u.a));
        ofh ofhVar15 = ofh.aI;
        int i7 = oghVar.v;
        int i8 = i7 - 1;
        if (i7 == 0) {
            throw th;
        }
        linkedHashMap.put(ofhVar15, Integer.valueOf(i8));
        ofh ofhVar16 = ofh.aH;
        int i9 = oghVar.u;
        int i10 = i9 - 1;
        if (i9 == 0) {
            throw th;
        }
        linkedHashMap.put(ofhVar16, Integer.valueOf(i10));
        if (ogjVar == ogj.GROUPM_VIEWABLE_IMPRESSION) {
            linkedHashMap.put(ofh.aj, "csm");
        }
        return new ofg(nrn.a(linkedHashMap, a(ogjVar)), nrn.a(linkedHashMap, a));
    }
}
