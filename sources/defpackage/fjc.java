package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fjc implements fwd, fwb, fvh {
    public static final /* synthetic */ int Q = 0;
    private static final AtomicInteger R = new AtomicInteger(1);
    public boolean A;
    public AccessibilityManager B;
    public boolean C;
    public fkz D;
    public final Map E;
    public List F;
    public volatile boolean G;
    public volatile boolean H;
    public List I;
    final boolean J;
    final boolean K;
    final Map L;
    public boolean M;
    public boolean N;
    public fib O;
    public acm P;
    private final Map S = new HashMap();
    private final fjd T;
    private final agk U;
    private final agk V;
    private int W;
    private int X;
    private long Y;
    private int Z;
    public List a;
    private flq aa;
    private fkm ab;
    private final Set ac;
    private yz ad;
    public final fhd b;
    public final fgy c;
    public int d;
    public int e;
    public final List f;
    public final List g;
    public final Map h;
    public final ArrayList i;
    public final ArrayList j;
    public final Set k;
    public final Map l;
    public final List m;
    fjq n;
    fjq o;
    fji p;
    public flq q;
    public String r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public int x;
    public final int y;
    public final int z;

    public fjc(fhd fhdVar, fgy fgyVar, fkz fkzVar, fhp fhpVar, fjc fjcVar, fib fibVar) {
        new HashMap();
        this.f = new ArrayList(8);
        this.U = new agk(8);
        this.h = new LinkedHashMap(8);
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.V = new agk(8);
        this.k = new HashSet(4);
        this.u = 0;
        this.Y = -1L;
        this.Z = -1;
        this.v = true;
        this.w = false;
        this.x = -1;
        this.C = false;
        this.E = new LinkedHashMap();
        this.ac = new HashSet();
        this.H = true;
        boolean z = fna.a;
        this.J = false;
        this.K = false;
        HashMap map = new HashMap();
        this.L = map;
        this.b = fhdVar;
        this.c = fgyVar;
        int andIncrement = R.getAndIncrement();
        this.y = andIncrement;
        int i = fjcVar != null ? fjcVar.y : -1;
        this.z = i;
        this.D = fkzVar;
        this.m = fna.d ? new ArrayList(8) : null;
        this.l = new HashMap();
        this.a = new ArrayList();
        this.g = new ArrayList(8);
        map.put("layoutId", Integer.valueOf(andIncrement));
        map.put("previousLayoutId", Integer.valueOf(i));
        this.T = new fjd(this, fkzVar, fhdVar.g, fhpVar, fibVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public static flq f(fjq fjqVar) {
        int i;
        if (fjqVar == null) {
            return null;
        }
        String str = fjqVar.q;
        fln flnVar = fjqVar.s;
        String str2 = fjqVar.r;
        String strS = fjqVar.s();
        if (!TextUtils.isEmpty(str)) {
            if (flnVar == fln.a) {
                i = 1;
            } else {
                if (flnVar != fln.b) {
                    throw new IllegalArgumentException("Unhandled transition key type ".concat(String.valueOf(String.valueOf(flnVar))));
                }
                i = 2;
            }
            if (str != null) {
                return new flq(i, str, str2);
            }
            return null;
        }
        str = strS;
        i = 3;
        str2 = null;
        if (str != null) {
            return new flq(i, str, str2);
        }
        return null;
    }

    public static String i(int i) {
        switch (i) {
            case -1:
                return "none";
            case 0:
                return "setRoot";
            case 1:
                return "setRootAsync";
            case 2:
                return "setSizeSpec";
            case 3:
                return "setSizeSpecAsync";
            case 4:
                return "updateStateSync";
            case 5:
                return "updateStateAsync";
            case 6:
                return "measure_setSizeSpec";
            default:
                return "measure_setSizeSpecAsync";
        }
    }

    public static void k(fhd fhdVar, fjc fjcVar) {
        fjq fjqVar;
        int i;
        int iB;
        Object obj;
        if (fjcVar.d().d()) {
            return;
        }
        boolean z = fna.a;
        int i2 = fjcVar.d;
        int i3 = fjcVar.e;
        fji fjiVar = fjcVar.p;
        int i4 = 0;
        if (fjiVar != null) {
            fjq fjqVarL = fjiVar.l();
            int iG = fjiVar.g();
            iB = fjiVar.b();
            fjqVar = fjqVarL;
            i = iG;
        } else {
            fjqVar = null;
            i = 0;
            iB = 0;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            fjcVar.s = Math.max(0, Math.min(i, View.MeasureSpec.getSize(i2)));
        } else if (mode == 0) {
            fjcVar.s = i;
        } else if (mode == 1073741824) {
            fjcVar.s = View.MeasureSpec.getSize(i2);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE) {
            fjcVar.t = Math.max(0, Math.min(iB, View.MeasureSpec.getSize(i3)));
        } else if (mode2 == 0) {
            fjcVar.t = iB;
        } else if (mode2 == 1073741824) {
            fjcVar.t = View.MeasureSpec.getSize(i3);
        }
        yz yzVar = fjcVar.ad;
        if (yzVar != null && (obj = yzVar.a) != null) {
            ((agk) obj).h();
        }
        fjcVar.Y = -1L;
        if (fjiVar != null) {
            boolean z2 = fjcVar.J;
            u(fhdVar, fjiVar, fjqVar, fjcVar, null, null);
            ArrayList arrayList = fjcVar.i;
            ArrayList arrayList2 = new ArrayList(arrayList);
            try {
                Collections.sort(arrayList, fvx.a);
                ArrayList arrayList3 = fjcVar.j;
                ArrayList arrayList4 = new ArrayList(arrayList3);
                try {
                    Collections.sort(arrayList3, fvx.b);
                    if (!fhdVar.t() && !fna.a && !fna.d) {
                        fjcVar.n = null;
                        fjcVar.p = null;
                    } else {
                        if (fna.k) {
                            return;
                        }
                        fjcVar.p = null;
                    }
                } catch (IllegalArgumentException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(e.getMessage());
                    sb.append('\n');
                    int size = arrayList4.size();
                    sb.append(a.bR(size, "Error while sorting LayoutState bottoms. Size: "));
                    sb.append('\n');
                    Rect rect = new Rect();
                    while (i4 < size) {
                        fjcVar.g(i4).b(rect);
                        sb.append("   Index " + i4 + " bottom: " + rect.bottom);
                        sb.append('\n');
                        i4++;
                    }
                    throw new IllegalStateException(sb.toString());
                }
            } catch (IllegalArgumentException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e2.getMessage());
                sb2.append('\n');
                int size2 = arrayList2.size();
                sb2.append(a.bR(size2, "Error while sorting LayoutState tops. Size: "));
                sb2.append('\n');
                Rect rect2 = new Rect();
                while (i4 < size2) {
                    fjcVar.g(i4).b(rect2);
                    sb2.append("   Index " + i4 + " top: " + rect2.top);
                    sb2.append('\n');
                    i4++;
                }
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    private static fvq q(fjr fjrVar, fjc fjcVar, fji fjiVar, boolean z, Object obj, fvq fvqVar) {
        int i;
        int i2;
        if (fvqVar != null) {
            i = fvqVar.f;
            i2 = fvqVar.e;
        } else {
            i = 0;
            i2 = 0;
        }
        int iH = (fjcVar.W - i2) + fjiVar.h();
        int i3 = (fjcVar.X - i) + fjiVar.i();
        int iG = fjiVar.g() + iH;
        int iB = fjiVar.b() + i3;
        if (z) {
            Map map = fgy.h;
            if (!fjr.b(fjrVar)) {
                iH += fjiVar.d();
                i3 += fjiVar.f();
                iG -= fjiVar.e();
                iB -= fjiVar.c();
            }
        }
        Rect rect = new Rect(iH, i3, iG, iB);
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i4 = fjcVar.y;
        int i5 = fjcVar.z;
        return gzj.aW(fjrVar, rect, new qx(iWidth, iHeight, obj), fvqVar);
    }

    private static void r(fjc fjcVar, fhd fhdVar) {
        flq flqVar;
        String string;
        Object obj;
        fkm fkmVar = fjcVar.ab;
        if (fkmVar == null || fkmVar.b == 0 || (flqVar = fjcVar.aa) == null) {
            return;
        }
        if (flqVar.a == 3) {
            Set set = fjcVar.ac;
            if (!set.contains(flqVar)) {
                Map map = fjcVar.E;
                if (map.put(flqVar, fkmVar) != null) {
                    map.remove(flqVar);
                    set.add(flqVar);
                }
            }
        } else if (fjcVar.E.put(flqVar, fkmVar) != null) {
            String string2 = flqVar.toString();
            fjq fjqVar = fjcVar.n;
            if (fjqVar == null) {
                string = "null";
            } else {
                StringBuilder sb = new StringBuilder();
                LinkedList linkedList = new LinkedList();
                linkedList.addLast(null);
                linkedList.addLast(fjqVar);
                int i = 0;
                while (!linkedList.isEmpty()) {
                    fjq fjqVar2 = (fjq) linkedList.removeLast();
                    if (fjqVar2 == null) {
                        i--;
                    } else {
                        fgy fgyVarE = fjqVar2.e();
                        if (fjqVar2 != fjqVar) {
                            int i2 = i - 1;
                            sb.append('\n');
                            Iterator it = linkedList.iterator();
                            it.next();
                            it.next();
                            for (int i3 = 0; i3 < i2; i3++) {
                                if (it.next() != null) {
                                    while (it.next() != null) {
                                    }
                                    obj = "│";
                                } else {
                                    obj = ' ';
                                }
                                sb.append(obj);
                                sb.append(' ');
                            }
                            sb.append(linkedList.getLast() == null ? "└╴" : "├╴");
                        }
                        sb.append(fgyVarE.c());
                        if (fgyVarE.m || fjqVar2.L() || fjqVar2.w != null) {
                            sb.append('[');
                            if (fgyVarE.m) {
                                sb.append("manual.key=\"");
                                sb.append(fgyVarE.D());
                                sb.append("\";");
                            }
                            if (fjqVar2.L()) {
                                sb.append("trans.key=\"");
                                sb.append(fjqVar2.q);
                                sb.append("\";");
                            }
                            if (fjqVar2.w != null) {
                                sb.append("test.key=\"");
                                sb.append(fjqVar2.w);
                                sb.append("\";");
                            }
                            sb.append(']');
                        }
                        if (fjqVar2.a() != 0) {
                            linkedList.addLast(null);
                            int iA = fjqVar2.a();
                            while (true) {
                                iA--;
                                if (iA < 0) {
                                    break;
                                } else {
                                    linkedList.addLast(fjqVar2.j(iA));
                                }
                            }
                            i++;
                        }
                    }
                }
                string = sb.toString();
            }
            gzj.bs(3, a.ca(string, string2, "The transitionId '", "' is defined multiple times in the same layout. TransitionIDs must be unique.\nTree:\n"), fpr.a(fhdVar));
        }
        fjcVar.ab = null;
        fjcVar.aa = null;
    }

    private static void s(fjc fjcVar, fvq fvqVar, fjr fjrVar, fja fjaVar, int i, flq flqVar, fvq fvqVar2) {
        if (fvqVar2 != null) {
            if (fvqVar2.h == null) {
                fvqVar2.h = new ArrayList(4);
            }
            fvqVar2.h.add(fvqVar);
        }
        fgy fgyVar = fjaVar.c;
        if (fgyVar.U() && fjaVar.c() && fvqVar2 != null) {
            ((fiw) fja.b(fvqVar2).c).b = true;
        }
        List list = fjcVar.f;
        int size = list.size();
        Rect rect = new Rect();
        fvqVar.b(rect);
        fvr fvrVar = fvqVar.b;
        fvw fvwVar = new fvw(size, rect, fvqVar2 != null ? (fvw) fjcVar.h.get(Long.valueOf(((fjr) fvqVar2.b).a)) : null);
        long j = ((fjr) fvrVar).a;
        list.add(fvqVar);
        Map map = fjcVar.h;
        Long lValueOf = Long.valueOf(j);
        map.put(lValueOf, fvwVar);
        fjcVar.i.add(fvwVar);
        fjcVar.j.add(fvwVar);
        if (fgyVar.Q()) {
            fjcVar.k.add(lValueOf);
        }
        long j2 = fjrVar.a;
        fjh fjhVar = new fjh(j2, rect, i, fjrVar.b.a, flqVar);
        fjcVar.V.i(j, fjhVar);
        fjcVar.U.i(j2, Integer.valueOf(size));
        fkm fkmVar = fjcVar.ab;
        if (fkmVar != null) {
            fkmVar.e(i, fjhVar);
        }
    }

    private final boolean t(fji fjiVar) {
        fji fjiVar2 = this.p;
        if (fjiVar2 instanceof fkd) {
            if (fjiVar == ((fkd) fjiVar2).n) {
                return true;
            }
        } else if (fjiVar == fjiVar2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [fiz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [fiz, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static void u(fhd fhdVar, fji fjiVar, fjq fjqVar, fjc fjcVar, fvq fvqVar, fib fibVar) {
        fib fibVar2;
        fhd fhdVar2;
        boolean z;
        fgy fgyVar;
        long jC;
        int i;
        fib fibVar3;
        fjd fjdVar;
        fhd fhdVar3;
        int i2;
        fjr fjrVarBl;
        fkm fkmVar;
        fjc fjcVar2;
        fji fjiVar2;
        int i3;
        fvq fvqVar2;
        fvq fvqVar3;
        fji fjiVar3;
        boolean z2;
        long j;
        fjr fjrVarBl2;
        fjr fjrVar;
        fjc fjcVar3;
        fvq fvqVar4;
        fvq fvqVarQ;
        fvq fvqVar5;
        boolean z3;
        fjr fjrVarBj;
        fjc fjcVar4;
        fji fjiVar4;
        boolean z4;
        boolean z5;
        long j2;
        Rect rect;
        List list;
        ArrayList arrayList;
        fji fjiVar5 = fjiVar;
        fjd fjdVarD = fjcVar.d();
        if (fjdVarD.d()) {
            return;
        }
        fgy fgyVarE = fjqVar.e();
        boolean zBm = gzj.bm();
        if (!fna.J) {
            List list2 = fjqVar.b;
            ArrayList arrayList2 = new ArrayList(list2.size());
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((fkt) it.next()).a);
            }
        }
        boolean z6 = true;
        if (fjiVar5 instanceof fkd) {
            if (zBm) {
                fgyVarE.c();
                fjiVar5.g();
                fjiVar5.b();
                int i4 = fjqVar.e().j;
            }
            fji fjiVarBb = gzj.bb(fjdVarD, fjqVar.b() == 1 ? fhdVar : fjqVar.f(1), (fkd) fjiVar5, View.MeasureSpec.makeMeasureSpec(fjiVar5.g(), 1073741824), View.MeasureSpec.makeMeasureSpec(fjiVar5.b(), 1073741824));
            if (fjiVarBb != null) {
                fjcVar.W += fjiVar5.h();
                fjcVar.X += fjiVar5.i();
                u(fhdVar, fjiVarBb, fjiVarBb.l(), fjcVar, fvqVar, fibVar);
                fjcVar.W -= fjiVar5.h();
                fjcVar.X -= fjiVar5.i();
                return;
            }
            return;
        }
        fkt fktVarN = fjqVar.n();
        fhd fhdVar4 = fktVarN.b;
        if (fjcVar.w) {
            fib fibVar4 = new fib();
            fgy fgyVar2 = fktVarN.a;
            fhdVar4.m();
            fibVar4.d = fgyVar2;
            fibVar4.j = fktVarN;
            if (fibVar != null) {
                fibVar.i.add(fibVar4);
            } else {
                fjcVar.O = fibVar4;
            }
            fibVar2 = fibVar4;
        } else {
            fibVar2 = null;
        }
        fhd fhdVar5 = fjiVar5.b;
        fjd fjdVar2 = fjiVar5.a;
        fjc fjcVar5 = fjdVar2.b;
        azs.l(fjcVar5);
        fjq fjqVarL = fjiVar5.l();
        fji fjiVar6 = fjiVar5.f;
        Object[] objArr = fjiVar6 == null || ((fjiVar6 instanceof fkd) && fjiVar6.f == null);
        if (objArr == true || gzj.bk(fjiVar5, fjcVar5)) {
            fiw fiwVar = new fiw();
            List list3 = fjqVarL.b;
            SparseArray sparseArray = new SparseArray();
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                z6 = z6;
                SparseArray sparseArrayI = ((fkt) it2.next()).a.i();
                if (sparseArrayI != null) {
                    fhd fhdVar6 = fhdVar5;
                    fhd fhdVar7 = fhdVar4;
                    int i5 = 0;
                    while (i5 < sparseArrayI.size()) {
                        int iKeyAt = sparseArrayI.keyAt(i5);
                        int i6 = i5;
                        hee heeVar = (hee) sparseArrayI.get(iKeyAt);
                        if (heeVar != null) {
                            sparseArray.append(iKeyAt, heeVar);
                        }
                        i5 = i6 + 1;
                    }
                    fhdVar5 = fhdVar6;
                    fhdVar4 = fhdVar7;
                }
            }
            fhdVar2 = fhdVar5;
            fhd fhdVar8 = fhdVar4;
            z = z6;
            fiwVar.a = sparseArray;
            if (objArr == true) {
                fgyVar = fiwVar;
                jC = 0;
                i = 2;
            } else {
                fgyVar = fiwVar;
                jC = fjcVar5.c(fgyVar, fjqVarL.s(), fjcVar5.u, 3, -1L);
                i = 0;
            }
            fibVar3 = fibVar2;
            fjdVar = fjdVar2;
            fhdVar3 = fhdVar8;
            i2 = 2;
            fjrVarBl = gzj.bl(jC, fgyVar, null, fjiVar5, fjqVarL, fjqVarL.D, i, false, false, true);
            fjiVar5 = fjiVar5;
        } else {
            fhdVar2 = fhdVar5;
            fibVar3 = fibVar2;
            z = true;
            i2 = 2;
            fjrVarBl = null;
            fhdVar3 = fhdVar4;
            fjdVar = fjdVar2;
        }
        boolean z7 = fjrVarBl != null ? z : false;
        long j3 = fjcVar.Y;
        int i7 = fjcVar.Z;
        flq flqVar = fjcVar.aa;
        fkm fkmVar2 = fjcVar.ab;
        flq flqVarF = f(fjqVar);
        fjcVar.aa = flqVarF;
        fjcVar.ab = flqVarF != null ? new fkm() : null;
        if (fjrVarBl == null) {
            fkmVar = fkmVar2;
            fjcVar2 = fjcVar;
            fjiVar2 = fjiVar5;
            i3 = i7;
            fvqVar2 = fvqVar;
        } else {
            if (fji.q(fjiVar5) && !fjcVar.t(fjiVar5)) {
                throw new IllegalArgumentException("We shouldn't insert a host as a parent of a View");
            }
            fjcVar2 = fjcVar;
            fkmVar = fkmVar2;
            fjiVar2 = fjiVar;
            i3 = i7;
            s(fjcVar2, q(fjrVarBl, fjcVar2, fjiVar5, false, null, fvqVar), fjrVarBl, fjrVarBl.b, 3, fjcVar2.aa, fvqVar);
            List list4 = fjcVar2.f;
            int size = list4.size() - 1;
            r(fjcVar2, fhdVar3);
            fvq fvqVar6 = (fvq) list4.get(size);
            fjcVar2.u++;
            fjcVar2.Y = ((fjr) fvqVar6.b).a;
            fjcVar2.Z = size;
            fvqVar2 = fvqVar6;
        }
        boolean z8 = fjcVar2.v;
        fjcVar2.v = (z7 != 0 || fjcVar2.t(fjiVar2)) ? z : false;
        boolean z9 = fjcVar2.K;
        fjiVar2.l();
        Drawable drawableJ = fjiVar2.j();
        fjr fjrVarBj2 = (drawableJ == null || fji.q(fjiVar2)) ? null : gzj.bj(fjiVar2, drawableJ, z ? 1 : 0);
        if (fjrVarBj2 != null) {
            fjc fjcVar6 = fjcVar2;
            fvq fvqVar7 = fvqVar2;
            fjiVar3 = fjiVar2;
            fvq fvqVarV = v(fjrVarBj2, fvqVar7, fjiVar3, fjcVar6, 1, z7);
            fvqVar3 = fvqVar7;
            if (fibVar3 != null) {
                fibVar3.b = (fjr) fvqVarV.b;
            }
        } else {
            fvqVar3 = fvqVar2;
            fjiVar3 = fjiVar2;
        }
        fjq fjqVarL2 = fjiVar3.l();
        fgy fgyVarE2 = fjqVarL2.e();
        if (fgyVarE2.af() == 1) {
            z2 = z8;
            j = j3;
            fjrVarBl2 = null;
        } else {
            String strS = fjqVarL2.s();
            fjc fjcVar7 = fjdVar.b;
            azs.l(fjcVar7);
            fib fibVar5 = fjiVar3.m;
            long j4 = -1;
            if (fibVar5 != null && (fjrVar = fibVar5.a) != null) {
                j4 = fjrVar.a;
            }
            long j5 = j4;
            long jC2 = fjcVar7.c(fgyVarE2, strS, fjcVar7.u, 0, j5);
            z2 = z8;
            j = j3;
            fji fjiVar7 = fjiVar3;
            fjrVarBl2 = gzj.bl(jC2, fgyVarE2, fhdVar2, fjiVar7, fjqVarL2, fjqVarL2.D, j5 != jC2 ? 0 : fjiVar3.g ? 1 : i2, fjcVar7.v, gzj.bk(fjiVar3, fjcVar7), fji.q(fjiVar3));
            fjiVar3 = fjiVar7;
        }
        if (fjrVarBl2 == null) {
            fjcVar3 = fjcVar;
            fvqVar4 = fvqVar3;
            fvqVarQ = null;
        } else {
            fjqVar.e();
            fjcVar3 = fjcVar;
            fvqVar4 = fvqVar3;
            fvqVarQ = q(fjrVarBl2, fjcVar3, fjiVar3, true, fjiVar3.l, fvqVar4);
        }
        if (fvqVarQ != null) {
            Object obj = fvqVarQ.c;
            if (zBm) {
                fgyVarE.c();
            }
            try {
                if (fgy.aa(fgyVarE)) {
                    fgyVarE.ag(fhdVar3, fjiVar3, ((qx) obj).c);
                }
            } catch (Exception e) {
                gzj.bw(fhdVar3, fgyVarE, e);
            }
            boolean z10 = fibVar3 == null;
            flq flqVar2 = z7 == 0 ? fjcVar3.aa : null;
            fjr fjrVar2 = (fjr) fvqVarQ.b;
            fvq fvqVar8 = fvqVar4;
            s(fjcVar3, fvqVarQ, fjrVar2, fjrVar2.b, 0, flqVar2, fvqVar8);
            fvqVar4 = fvqVar8;
            fvqVar5 = fvqVarQ;
            if (fibVar3 != null) {
                fibVar3.a = fjrVar2;
            }
            z3 = z10;
        } else {
            fvqVar5 = fvqVarQ;
            z3 = fibVar3 == null;
        }
        if (gzj.bg(fhdVar3) && (arrayList = fjqVar.t) != null) {
            int size2 = arrayList.size();
            int i8 = 0;
            while (i8 < size2) {
                flp flpVar = (flp) arrayList.get(i8);
                if (fjcVar3.F == null) {
                    fjcVar3.F = new ArrayList();
                }
                gzj.aF(flpVar, fjcVar3.F, fjcVar3.r);
                i8++;
                arrayList = arrayList;
            }
        }
        fjcVar3.W += fjiVar3.h();
        fjcVar3.X += fjiVar3.i();
        int iA = fjiVar3.a();
        int i9 = 0;
        while (i9 < iA) {
            int i10 = i9;
            fji fjiVarK = fjiVar3.k(i10);
            fib fibVar6 = fibVar3;
            fjc fjcVar8 = fjcVar3;
            u(fhdVar3, fjiVarK, fjiVarK.l(), fjcVar8, fvqVar4, fibVar6);
            fjcVar3 = fjcVar8;
            i9 = i10 + 1;
            fibVar3 = fibVar6;
        }
        fib fibVar7 = fibVar3;
        fjcVar3.W -= fjiVar3.h();
        fjcVar3.X -= fjiVar3.i();
        fhd fhdVar9 = fjiVar3.b;
        if (!fjiVar3.p()) {
            fjrVarBj = null;
        } else {
            if (!fjiVar3.p()) {
                throw new RuntimeException("This result does not support drawing border color");
            }
            fjq fjqVarL3 = fjiVar3.l();
            fwl fwlVarC = fjiVar3.e.c();
            if (fwlVarC == fwl.INHERIT) {
                throw new IllegalStateException("Direction cannot be resolved before layout calculation");
            }
            boolean z11 = fwlVarC == fwl.RTL;
            float[] fArr = fjqVarL3.e;
            int[] iArr = fjqVarL3.d;
            int i11 = z11 ? 3 : 1;
            int i12 = true != z11 ? 3 : 1;
            fnu fnuVar = new fnu();
            fnuVar.i = null;
            fnuVar.e = iArr[fgp.b(i11)];
            fnuVar.f = iArr[fgp.b(i2)];
            fnuVar.g = iArr[fgp.b(i12)];
            fnuVar.h = iArr[fgp.b(4)];
            fnuVar.a = fjiVar3.s(i11);
            fnuVar.b = fjiVar3.s(i2);
            fnuVar.c = fjiVar3.s(i12);
            fnuVar.d = fjiVar3.s(4);
            fnuVar.j = Arrays.copyOf(fArr, 4);
            fjrVarBj = gzj.bj(fjiVar3, new fnv(fnuVar), 4);
        }
        if (fjrVarBj != null) {
            fvq fvqVar9 = fvqVar4;
            fvq fvqVarV2 = v(fjrVarBj, fvqVar9, fjiVar4, fjcVar, 4, z7);
            z4 = true;
            fvqVar4 = fvqVar9;
            fjcVar4 = fjcVar;
            if (true != z3) {
                fjiVar4 = fjiVar3;
                fibVar7.c = (fjr) fvqVarV2.b;
            }
        } else {
            fjcVar4 = fjcVar;
            fjiVar4 = fjiVar3;
            z4 = true;
        }
        fjiVar4 = fjiVar3;
        boolean z12 = fjcVar4.K;
        fjiVar4.l();
        if (z4 != z3) {
            fibVar7.g = fjiVar4.h;
            fibVar7.h = fjiVar4.i;
            fibVar7.e = fjiVar4.j;
            fibVar7.f = fjiVar4.k;
            fibVar7.k = fjiVar4.l;
            fjiVar4.l();
        }
        if (fjqVar.g != null || fjqVar.h != null || fjqVar.i != null || fjqVar.j != null || fjqVar.k != null || fjqVar.l != null) {
            if (fvqVar5 != null) {
                fvqVar4 = fvqVar5;
            } else if (z7 == 0) {
                fvqVar4 = null;
            }
            int iH = fjcVar4.W + fjiVar4.h();
            int i13 = fjcVar4.X + fjiVar4.i();
            int iG = fjiVar4.g() + iH;
            int iB = fjiVar4.b() + i13;
            fip fipVar = fjqVar.g;
            fip fipVar2 = fjqVar.h;
            fip fipVar3 = fjqVar.i;
            fip fipVar4 = fjqVar.j;
            fip fipVar5 = fjqVar.k;
            fip fipVar6 = fjqVar.l;
            fgy fgyVarE3 = fjqVar.e();
            String strS2 = fjqVar.s();
            String strC = fgyVarE3 != null ? fgyVarE3.c() : "Unknown";
            Rect rect2 = new Rect(iH, i13, iG, iB);
            if (fvqVar4 != null) {
                j2 = ((fjr) fvqVar4.b).a;
                z5 = true;
            } else {
                z5 = false;
                j2 = 0;
            }
            fjcVar4.g.add(new fwh(strS2, strC, rect2, z5, j2, fipVar, fipVar5, fipVar2, fipVar3, fipVar4, fipVar6));
        }
        List list5 = fjcVar4.m;
        if (list5 != null && !TextUtils.isEmpty(fjqVar.w)) {
            fvr fvrVar = fvqVar5 != null ? fvqVar5.b : null;
            int iH2 = fjcVar4.W + fjiVar4.h();
            int i14 = fjcVar4.X + fjiVar4.i();
            int iG2 = fjiVar4.g() + iH2;
            int iB2 = fjiVar4.b() + i14;
            fla flaVar = new fla();
            String str = fjqVar.w;
            azs.l(str);
            flaVar.a = str;
            flaVar.d.set(iH2, i14, iG2, iB2);
            flaVar.b = fjcVar4.Y;
            if (fvrVar != null) {
                flaVar.c = ((fjr) fvrVar).a;
            }
            list5.add(flaVar);
        }
        ArrayList arrayList3 = fjqVar.u;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (fjcVar4.P == null) {
                fjcVar4.P = new acm();
            }
            int size3 = arrayList3.size();
            for (int i15 = 0; i15 < size3; i15++) {
                xsc xscVar = (xsc) arrayList3.get(i15);
                if (fgyVarE instanceof fkx) {
                    acm acmVar = fjcVar4.P;
                    Object obj2 = xscVar.a;
                    acmVar.a((nyc) xscVar.c, (fkt) xscVar.b, fjiVar4.l);
                } else {
                    acm acmVar2 = fjcVar4.P;
                    Object obj3 = xscVar.a;
                    acmVar2.a((nyc) xscVar.c, (fkt) xscVar.b, null);
                }
            }
        }
        ArrayList arrayList4 = fjiVar4.l().v;
        if (arrayList4 != null) {
            if (fjcVar4.I == null) {
                fjcVar4.I = new ArrayList();
            }
            fjcVar4.I.addAll(arrayList4);
        }
        if (fvqVar5 != null) {
            rect = new Rect();
            fvqVar5.b(rect);
        } else {
            rect = new Rect();
            rect.left = fjcVar4.W + fjiVar4.h();
            rect.top = fjcVar4.X + fjiVar4.i();
            rect.right = rect.left + fjiVar4.g();
            rect.bottom = rect.top + fjiVar4.b();
        }
        int iB3 = fjqVar.b();
        for (int i16 = 0; i16 < iB3; i16++) {
            fjqVar.c(i16);
            String strQ = fjqVar.q(i16);
            fhd fhdVarF = fjqVar.f(i16);
            if (fhdVarF.g != null && (list = fjcVar4.a) != null) {
                list.add(fhdVarF.i());
            }
            if (strQ != null) {
                fjcVar4.S.put(strQ, new Rect(rect));
            }
        }
        long j6 = j;
        if (fjcVar4.Y != j6) {
            fjcVar4.Y = j6;
            fjcVar4.Z = i3;
            fjcVar4.u--;
        }
        fjcVar4.v = z2;
        r(fjcVar4, fhdVar3);
        fjcVar4.aa = flqVar;
        fjcVar4.ab = fkmVar;
    }

    private static fvq v(fjr fjrVar, fvq fvqVar, fji fjiVar, fjc fjcVar, int i, boolean z) {
        fvq fvqVarQ = q(fjrVar, fjcVar, fjiVar, false, null, fvqVar);
        fjr fjrVar2 = (fjr) fvqVarQ.b;
        s(fjcVar, fvqVarQ, fjrVar2, fjrVar2.b, i, !z ? fjcVar.aa : null, fvqVar);
        return fvqVarQ;
    }

    @Override // defpackage.fwb
    public final int a() {
        return this.f.size();
    }

    @Override // defpackage.fvh
    public final int b(long j) {
        Integer num = (Integer) this.U.f(j, -1);
        num.getClass();
        return num.intValue();
    }

    public final long c(fgy fgyVar, String str, int i, int i2, long j) {
        fjd fjdVar = this.T;
        azs.l(fjdVar);
        ComponentTree componentTree = fjdVar.a;
        azs.l(componentTree);
        if (componentTree.e) {
            gev gevVar = componentTree.J;
            azs.l(str);
            return ((long) gevVar.c(str)) | (((long) i2) << 32) | (((long) componentTree.A) << 35);
        }
        yz yzVar = this.ad;
        if (yzVar == null) {
            yzVar = new yz();
            this.ad = yzVar;
        }
        if (yzVar.a == null) {
            yzVar.a = new agk(2);
        }
        if (i < 0 || i > 255) {
            throw new IllegalArgumentException(a.bR(i, "Level must be non-negative and no greater than 255 actual level "));
        }
        long j2 = i2;
        long j3 = fgyVar.i;
        long j4 = i;
        int i3 = -1;
        if (j > 0 && ((int) ((j >> 19) & 255)) == i) {
            i3 = (int) (j & 65535);
        }
        long j5 = (j3 << 27) | (j4 << 19) | (j2 << 16);
        int iIntValue = ((Integer) ((agk) yzVar.a).f(j5, 0)).intValue();
        if (i3 < iIntValue) {
            i3 = iIntValue + 1;
        }
        if (i3 < 0 || i3 > 65535) {
            throw new IllegalArgumentException(a.bR(i3, "Sequence must be non-negative and no greater than 65535 actual sequence "));
        }
        long j6 = j5 | ((long) i3);
        ((agk) yzVar.a).i(j5, Integer.valueOf(i3 + 1));
        return j6;
    }

    final fjd d() {
        fjd fjdVar = this.T;
        fjdVar.getClass();
        return fjdVar;
    }

    public final fji e(fgy fgyVar) {
        return (fji) this.l.get(Integer.valueOf(fgyVar.j));
    }

    @Override // defpackage.fwb
    public final fvq g(int i) {
        return (fvq) this.f.get(i);
    }

    final fvq h(fvw fvwVar) {
        return g(fvwVar.a);
    }

    public final void j(fgy fgyVar) {
        this.l.remove(Integer.valueOf(fgyVar.j));
    }

    public final boolean l() {
        return fgn.c(this.B) == this.C;
    }

    public final boolean m(int i, int i2, int i3) {
        return this.c.j == i && n(i2, i3);
    }

    public final boolean n(int i, int i2) {
        return gzj.aY(this.d, i, this.s) && gzj.aY(this.e, i2, this.t);
    }

    @Override // defpackage.fwb
    public final boolean o() {
        return this.b.g.u;
    }

    @Override // defpackage.fwb
    public final fjh p(long j) {
        return (fjh) this.V.e(j);
    }
}
