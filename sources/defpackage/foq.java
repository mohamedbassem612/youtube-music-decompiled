package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class foq {
    private static volatile Looper n;
    public volatile boolean a;
    public final fvu b;
    public final fof c;
    public final fny d;
    public final foc e;
    public final String f;
    public final boolean g;
    public final fon h;
    public foe i;
    public foe j;
    public foe k;
    public afwv l;
    private final fon p;
    private boolean q;
    private int r;
    private final List s;
    private final AtomicBoolean t;
    private final gev u;
    private final dov w;
    private final Map o = new HashMap();
    public final ci m = new ci((char[]) null, (char[]) null);
    private final gat v = new gat();

    /* JADX WARN: Type inference failed for: r5v0, types: [fop, java.lang.Object] */
    public foq(afwv afwvVar) {
        fvt fvtVar = new fvt(Looper.getMainLooper());
        fvz fvzVar = gzj.c;
        this.b = fvtVar;
        dov dovVar = new dov((byte[]) null, (byte[]) null, (byte[]) null);
        this.w = dovVar;
        this.a = false;
        String str = (String) afwvVar.b;
        this.f = str;
        fny fnyVar = new fny(afwvVar.a, dovVar, str);
        this.d = fnyVar;
        this.g = ((fpp) fnyVar.b).b;
        this.e = new foc(fnyVar);
        fof fofVar = new fof((fhd) afwvVar.c);
        fofVar.l = this;
        fofVar.n = new Cfor(this);
        this.c = fofVar;
        this.s = new ArrayList();
        this.u = new gev();
        fvt fvtVar2 = new fvt(a());
        fvz fvzVar2 = gzj.c;
        this.h = new fon(this, fvtVar2);
        this.p = new fon(this, fvtVar);
        this.t = new AtomicBoolean(false);
    }

    public static synchronized Looper a() {
        if (n == null) {
            HandlerThread handlerThread = new HandlerThread("SectionChangeSetThread", 0);
            handlerThread.start();
            n = handlerThread.getLooper();
        }
        return n;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public static RuntimeException b(foq foqVar, foe foeVar, IndexOutOfBoundsException indexOutOfBoundsException) {
        String string;
        RuntimeException runtimeExceptionO = o(null, foeVar, indexOutOfBoundsException);
        if (runtimeExceptionO == indexOutOfBoundsException) {
            synchronized (foqVar) {
                boolean z = foqVar.a;
                StringBuilder sb = new StringBuilder("tag: ");
                sb.append(foqVar.f);
                sb.append(", currentSection.size: ");
                foe foeVar2 = foqVar.i;
                sb.append(foeVar2 != null ? Integer.valueOf(foeVar2.i) : null);
                sb.append(", currentSection.name: ");
                foe foeVar3 = foqVar.i;
                sb.append(foeVar3 != null ? foeVar3.f : null);
                sb.append(", nextSection.size: ");
                foe foeVar4 = foqVar.j;
                sb.append(foeVar4 != null ? Integer.valueOf(foeVar4.i) : null);
                sb.append(", nextSection.name: ");
                foe foeVar5 = foqVar.j;
                sb.append(foeVar5 != null ? foeVar5.f : null);
                sb.append(", pendingChangeSets.size: ");
                sb.append(foqVar.s.size());
                sb.append(", pendingStateUpdates.size: ");
                gev gevVar = foqVar.u;
                sb.append(gevVar.a.size());
                sb.append(", pendingNonLazyStateUpdates.size: ");
                sb.append(gevVar.b.size());
                sb.append('\n');
                string = sb.toString();
            }
            runtimeExceptionO = new RuntimeException("Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://fblitho.com/docs/sections/best-practices/#avoiding-indexoutofboundsexception for more information. Debug info: " + string + indexOutOfBoundsException.getMessage(), indexOutOfBoundsException);
        }
        return runtimeExceptionO;
    }

    private static RuntimeException o(foe foeVar, foe foeVar2, IndexOutOfBoundsException indexOutOfBoundsException) {
        if (foeVar2 == null) {
            return indexOutOfBoundsException;
        }
        String strH = foeVar2.h(foeVar2.c);
        if (strH != null) {
            RuntimeException runtimeException = new RuntimeException(a.ct(foeVar != null ? foeVar.f : foeVar2.f, strH, "Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://fblitho.com/docs/sections/best-practices/#avoiding-indexoutofboundsexception for more information. Debug info: ", " in the [", "]."), indexOutOfBoundsException);
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }
        List list = foeVar2.j;
        if (list == null) {
            return indexOutOfBoundsException;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RuntimeException runtimeExceptionO = o(foeVar2, (foe) it.next(), indexOutOfBoundsException);
            if (runtimeExceptionO != indexOutOfBoundsException) {
                return runtimeExceptionO;
            }
        }
        return indexOutOfBoundsException;
    }

    private final void p(foe foeVar) {
        this.m.J(foeVar.c, foeVar, foeVar.k);
        if (foeVar.k()) {
            return;
        }
        List list = foeVar.j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            p((foe) list.get(i));
        }
    }

    private final synchronized void q(foe foeVar) {
        fof fofVar = foeVar.c;
        List list = foeVar.j;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                q((foe) list.get(i));
            }
        }
    }

    private final void r() {
        this.q = false;
        this.r = 0;
    }

    private final void s(foe foeVar) {
        fof fofVar = foeVar.c;
        if (foeVar.k()) {
            return;
        }
        List list = foeVar.j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            s((foe) list.get(i));
        }
    }

    private static foe t(foe foeVar) {
        if (foeVar != null) {
            return foeVar.c(false);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    private final void u(foe foeVar, List list) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z = fna.w;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i8 = 0;
        boolean z2 = false;
        while (true) {
            ?? r7 = 1;
            if (i8 >= size) {
                break;
            }
            afts aftsVar = (afts) list.get(i8);
            if (aftsVar.m() > 0) {
                int iM = aftsVar.m();
                int i9 = 0;
                while (i9 < iM) {
                    fnz fnzVarN = aftsVar.n(i9);
                    int i10 = fnzVarN.b;
                    if (i10 == -3) {
                        fny fnyVar = this.d;
                        int i11 = fnzVarN.c;
                        int i12 = fnzVarN.e;
                        fnyVar.b();
                        fnyVar.b.a(i11, i12);
                    } else if (i10 == -2) {
                        fny fnyVar2 = this.d;
                        int i13 = fnzVarN.c;
                        int i14 = fnzVarN.e;
                        List list2 = fnzVarN.g;
                        fnyVar2.b();
                        fnyVar2.b.g(i13, list2);
                        if (fny.a) {
                            fnyVar2.d(i13, list2);
                        }
                    } else if (i10 == -1) {
                        fny fnyVar3 = this.d;
                        int i15 = fnzVarN.c;
                        int i16 = fnzVarN.e;
                        List list3 = fnzVarN.g;
                        fnyVar3.b();
                        fnyVar3.b.f(i15, list3);
                        if (fny.a) {
                            fnyVar3.c(i15, list3);
                        }
                    } else if (i10 == 0) {
                        fny fnyVar4 = this.d;
                        int i17 = fnzVarN.c;
                        int i18 = fnzVarN.d;
                        fnyVar4.b();
                        fop fopVar = fnyVar4.b;
                        if (((fpp) fopVar).b) {
                            fsy fsyVar = ((fpp) fopVar).a;
                            fsyVar.y();
                            if (ftj.a) {
                                fsyVar.hashCode();
                            }
                            fsp fspVar = new fsp(i17, i18, null);
                            synchronized (fsyVar) {
                                fsyVar.L = r7;
                                List list4 = fsyVar.c;
                                list4.add(i18, (fqh) list4.remove(i17));
                                fsyVar.w(fspVar);
                            }
                        } else {
                            ((fpp) fopVar).a.H(i17, i18);
                        }
                        if (fny.a) {
                            fnyVar4.h.z(fnyVar4.d, i17, i18, Thread.currentThread().getName());
                        }
                    } else if (i10 != r7) {
                        fny fnyVar5 = this.d;
                        if (i10 != 2) {
                            int i19 = fnzVarN.c;
                            if (fnyVar5.e != 3 || (i7 = fnyVar5.f) < i19 || i7 > i19 + 1) {
                                fnyVar5.b();
                                fnyVar5.f = i19;
                                fnyVar5.g = r7;
                                fnyVar5.e = 3;
                            } else {
                                fnyVar5.g += r7;
                                fnyVar5.f = i19;
                            }
                        } else {
                            int i20 = fnzVarN.c;
                            ftg ftgVar = fnzVarN.f;
                            if (fnyVar5.e != 2 || i20 > (i5 = fnyVar5.g + (i4 = fnyVar5.f)) || (i6 = i20 + 1) < i4) {
                                fnyVar5.b();
                                fnyVar5.f = i20;
                                fnyVar5.g = r7;
                                fnyVar5.e = 2;
                                fnyVar5.c.put(i20, ftgVar);
                            } else {
                                fnyVar5.f = Math.min(i20, i4);
                                fnyVar5.g = Math.max(i5, i6) - fnyVar5.f;
                                fnyVar5.c.put(i20, ftgVar);
                            }
                        }
                    } else {
                        fny fnyVar6 = this.d;
                        int i21 = fnzVarN.c;
                        ftg ftgVar2 = fnzVarN.f;
                        if (fnyVar6.e != r7 || i21 < (i = fnyVar6.f) || i21 > (i3 = i + (i2 = fnyVar6.g)) || i21 < i3) {
                            fnyVar6.b();
                            fnyVar6.f = i21;
                            fnyVar6.g = r7;
                            fnyVar6.e = r7;
                            fnyVar6.c.put(i21, ftgVar2);
                        } else {
                            fnyVar6.g = i2 + 1;
                            fnyVar6.f = Math.min(i21, i);
                            fnyVar6.c.put(i21, ftgVar2);
                        }
                    }
                    i9++;
                    z2 = true;
                    r7 = 1;
                }
                this.d.b();
            }
            arrayList.addAll(aftsVar.b);
            i8++;
        }
        gzj gzjVar = new gzj(arrayList);
        fny fnyVar7 = this.d;
        boolean z3 = z2;
        foi foiVar = new foi(this, gzjVar, z3, z, foeVar);
        fop fopVar2 = fnyVar7.b;
        if (!((fpp) fopVar2).b) {
            ((fpp) fopVar2).a.V(z3, foiVar);
            return;
        }
        fsy fsyVar2 = ((fpp) fopVar2).a;
        if (ftj.a) {
            fsyVar2.hashCode();
        }
        fsyVar2.L = true;
        fsyVar2.y();
        fsyVar2.U(z3, foiVar);
        if (gzj.aT()) {
            fsyVar2.x(0);
            if (z3) {
                int i22 = fjs.a;
                fsyVar2.F();
            }
        } else if (fsyVar2.j.get()) {
            fmz.b().a(fsyVar2.x);
        }
        if (fna.a || fna.d) {
            fsyVar2.s.set(-1L);
        }
    }

    private final void v(flf flfVar) {
        if (!this.g) {
            if (gzj.aT()) {
                try {
                    i();
                    return;
                } catch (IndexOutOfBoundsException e) {
                    throw b(this, this.i, e);
                }
            } else {
                fvu fvuVar = this.b;
                fol folVar = new fol(this, flfVar);
                if (this.t.compareAndSet(true, false)) {
                    ((fvt) fvuVar).postAtFrontOfQueue(folVar);
                    return;
                } else {
                    ((fvt) fvuVar).post(folVar);
                    return;
                }
            }
        }
        boolean z = fna.a;
        synchronized (this) {
            boolean z2 = this.a;
            foe foeVar = this.i;
            List list = this.s;
            u(foeVar, list);
            list.clear();
        }
        if (gzj.aT()) {
            e();
            return;
        }
        ((fvt) this.b).post(new fom(this, flfVar));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    private final synchronized boolean w(gev gevVar) {
        return gevVar.b.equals(this.u.b);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    private final synchronized void x(String str, aero aeroVar) {
        boolean z = this.a;
        if (this.i == null && this.j == null) {
            throw new IllegalStateException("State set with no attached Section");
        }
        gev gevVar = this.u;
        gev.j(str, aeroVar, gevVar.a);
        gev.j(str, aeroVar, gevVar.b);
        if (this.q) {
            int i = this.r + 1;
            this.r = i;
            if (i == 50) {
                gzj.br(3, "Large number of state updates detected which indicates an infinite loop leading to unresponsive apps");
            }
        }
        foe foeVar = this.j;
        if (foeVar == null) {
            this.j = t(this.i);
        } else {
            this.j = t(foeVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List] */
    private static void y(fof fofVar, foe foeVar, foe foeVar2, Map map, dov dovVar, String str) {
        if (foeVar2 == null) {
            throw new IllegalStateException("Can't generate a subtree with a null root");
        }
        boolean z = fna.a;
        foeVar2.c = fof.B(fofVar, foeVar2);
        if (foeVar != null) {
            foeVar2.i = foeVar.i;
        }
        boolean zK = foeVar2.k();
        if (!zK) {
            fly flyVar = fofVar.e;
        }
        boolean z2 = foeVar != null && foeVar.getClass().equals(foeVar2.getClass());
        if (foeVar == null || !z2) {
            foeVar2.i(foeVar2.c);
        } else {
            foeVar2.j(foeVar.g, foeVar2.g);
        }
        Map map2 = map;
        List list = (List) map2.get(foeVar2.k);
        if (list != null) {
            fky fkyVar = foeVar2.g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                fkyVar.b((aero) list.get(i));
            }
            fpq.g.addAndGet(list.size());
            if (foe.o(foeVar, foeVar2)) {
                foe.e(foeVar2);
            }
        }
        if (zK) {
            return;
        }
        Map mapD = (foeVar == null || foeVar.k()) ? null : foe.d(foeVar);
        fly flyVar2 = fofVar.e;
        omj omjVarW = fofVar.w();
        fkn fknVarAQ = gzj.aQ(fofVar, 14, null, foeVar2);
        dov dovVarS = foeVar2.s(foeVar2.c);
        foeVar2.j = dovVarS == null ? new ArrayList() : dovVarS.a;
        if (omjVarW != null && fknVarAQ != null) {
            omj.r(fknVarAQ);
        }
        List list2 = foeVar2.j;
        int size2 = list2.size();
        int i2 = 0;
        while (i2 < size2) {
            foe foeVar3 = (foe) list2.get(i2);
            foeVar3.a = foeVar2;
            String str2 = foeVar3.l;
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalStateException(a.bT(foeVar3.f, "Your Section ", " has an empty key. Please specify a key."));
            }
            String str3 = foeVar2.k + str2;
            fof fofVar2 = foeVar2.c;
            foe foeVarA = fofVar2.A();
            if (foeVarA != null && foeVarA.c.o.a.contains(str3)) {
                String str4 = foeVar3.f;
                if (foeVarA.e == null) {
                    foeVarA.e = new HashMap();
                }
                int iIntValue = foeVarA.e.containsKey(str4) ? ((Integer) foeVarA.e.get(str4)).intValue() : 0;
                foeVarA.e.put(str4, Integer.valueOf(iIntValue + 1));
                str3 = str3 + iIntValue;
            }
            foeVar3.k = str3;
            fofVar2.o.a.add(str3);
            foeVar3.c = fof.B(fofVar, foeVar3);
            axq axqVar = mapD == null ? null : (axq) mapD.get(foeVar3.k);
            y(fofVar, axqVar != null ? (foe) axqVar.a : null, foeVar3, map2, dovVar, str);
            i2++;
            map2 = map;
        }
        if (fofVar.e != flyVar2) {
            fofVar.e = flyVar2;
        }
    }

    public final synchronized String c() {
        foe foeVar = this.i;
        if (foeVar == null) {
            return null;
        }
        return foeVar.k;
    }

    public final void d(foe foeVar) {
        fof fofVar = foeVar.c;
        if (foeVar.k()) {
            return;
        }
        List list = foeVar.j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            d((foe) list.get(i));
        }
    }

    public final void e() {
        foc focVar = this.e;
        if (focVar.b()) {
            focVar.a = false;
            focVar.a();
        }
    }

    public final void f(foe foeVar) {
        fof fofVar = foeVar.c;
        foeVar.p();
        if (foeVar.k()) {
            return;
        }
        List list = foeVar.j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            f((foe) list.get(i));
        }
    }

    public final void g(foe foeVar, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int iMax;
        int iMin;
        int iMin2;
        foq foqVar = this;
        Map map = foqVar.o;
        foo fooVar = (foo) map.get(foeVar.k);
        int i7 = foeVar.i;
        if (fooVar == null) {
            fooVar = new foo();
            map.put(foeVar.k, fooVar);
            i6 = i5;
        } else if (fooVar.a != i || fooVar.b != i2 || fooVar.c != i3 || fooVar.d != i4 || fooVar.e != i7) {
            i6 = i5;
        } else if (i5 != 1) {
            return;
        } else {
            i6 = 1;
        }
        fooVar.b = i2;
        fooVar.a = i;
        fooVar.c = i3;
        fooVar.d = i4;
        fooVar.e = i7;
        fof fofVar = foeVar.c;
        foeVar.q(i2, i7);
        if (foeVar.k()) {
            return;
        }
        List list = foeVar.j;
        int size = list.size();
        int i8 = 0;
        int i9 = 0;
        while (i9 < size) {
            foe foeVar2 = (foe) list.get(i9);
            int i10 = i - i8;
            int i11 = i2 - i8;
            int i12 = i3 - i8;
            int i13 = i4 - i8;
            int iMax2 = -1;
            if (i10 >= foeVar2.i || i11 < 0) {
                iMax = -1;
                iMin = -1;
            } else {
                iMax = Math.max(i10, 0);
                iMin = Math.min(i11, foeVar2.i - 1);
            }
            if (i12 >= foeVar2.i || i13 < 0) {
                iMin2 = -1;
            } else {
                iMax2 = Math.max(i12, 0);
                iMin2 = Math.min(i13, foeVar2.i - 1);
            }
            int i14 = foeVar2.i + i8;
            foqVar.g(foeVar2, iMax, iMin, iMax2, iMin2, i6);
            i9++;
            foqVar = this;
            i8 = i14;
        }
    }

    public final void h(int i) {
        if (i == 1) {
            this.e.a = true;
        } else if (i == 2) {
            i = 2;
            this.e.a = true;
        }
        if (i == 4) {
            this.e.a = false;
        }
        foc focVar = this.e;
        focVar.b = i;
        focVar.a();
    }

    public final void i() {
        ArrayList arrayList;
        foe foeVar;
        gzj.aS();
        if (this.g) {
            throw new IllegalStateException("Cannot use UIThread-only variant when background change sets are enabled.");
        }
        boolean z = fna.a;
        synchronized (this) {
            boolean z2 = this.a;
            List list = this.s;
            arrayList = new ArrayList(list);
            list.clear();
            foeVar = this.i;
        }
        u(foeVar, arrayList);
        e();
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0203  */
    /* JADX WARN: Code duplicated, block: B:123:0x0205 A[Catch: all -> 0x050a, TryCatch #7 {all -> 0x050a, blocks: (B:60:0x00a8, B:65:0x00b5, B:67:0x00bc, B:69:0x00c2, B:71:0x00c6, B:77:0x00db, B:79:0x00e8, B:81:0x00f2, B:83:0x00ff, B:84:0x0111, B:86:0x0121, B:90:0x012d, B:92:0x0133, B:94:0x0139, B:96:0x014e, B:98:0x0156, B:101:0x015c, B:102:0x015f, B:104:0x0168, B:106:0x017e, B:120:0x01f2, B:125:0x020f, B:127:0x0218, B:123:0x0205, B:109:0x019e, B:112:0x01b1, B:114:0x01b9, B:115:0x01c0, B:117:0x01c8, B:119:0x01d6, B:128:0x0237, B:129:0x0247, B:130:0x0248, B:132:0x0258, B:97:0x0154, B:78:0x00e3), top: B:282:0x00a8, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x020f A[Catch: all -> 0x050a, TryCatch #7 {all -> 0x050a, blocks: (B:60:0x00a8, B:65:0x00b5, B:67:0x00bc, B:69:0x00c2, B:71:0x00c6, B:77:0x00db, B:79:0x00e8, B:81:0x00f2, B:83:0x00ff, B:84:0x0111, B:86:0x0121, B:90:0x012d, B:92:0x0133, B:94:0x0139, B:96:0x014e, B:98:0x0156, B:101:0x015c, B:102:0x015f, B:104:0x0168, B:106:0x017e, B:120:0x01f2, B:125:0x020f, B:127:0x0218, B:123:0x0205, B:109:0x019e, B:112:0x01b1, B:114:0x01b9, B:115:0x01c0, B:117:0x01c8, B:119:0x01d6, B:128:0x0237, B:129:0x0247, B:130:0x0248, B:132:0x0258, B:97:0x0154, B:78:0x00e3), top: B:282:0x00a8, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0216  */
    /* JADX WARN: Code duplicated, block: B:150:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d8 A[Catch: all -> 0x0508, TryCatch #6 {, blocks: (B:138:0x026e, B:140:0x0283, B:142:0x028d, B:152:0x02da, B:154:0x02f1, B:155:0x0340, B:151:0x02d8, B:158:0x0347, B:162:0x034f, B:164:0x0359, B:166:0x0397, B:167:0x03da, B:169:0x03de, B:170:0x040d, B:171:0x041b, B:165:0x035f, B:160:0x034b, B:145:0x02bb), top: B:280:0x026e, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x02f1 A[Catch: all -> 0x0508, TryCatch #6 {, blocks: (B:138:0x026e, B:140:0x0283, B:142:0x028d, B:152:0x02da, B:154:0x02f1, B:155:0x0340, B:151:0x02d8, B:158:0x0347, B:162:0x034f, B:164:0x0359, B:166:0x0397, B:167:0x03da, B:169:0x03de, B:170:0x040d, B:171:0x041b, B:165:0x035f, B:160:0x034b, B:145:0x02bb), top: B:280:0x026e, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0421  */
    /* JADX WARN: Code duplicated, block: B:176:0x0423  */
    /* JADX WARN: Code duplicated, block: B:178:0x0426 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x042e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x0439 A[Catch: all -> 0x0506, TryCatch #4 {all -> 0x0506, blocks: (B:173:0x041d, B:179:0x0428, B:185:0x0435, B:187:0x0439, B:193:0x0446, B:198:0x0451, B:200:0x0463, B:201:0x046b, B:203:0x0471, B:205:0x047f, B:206:0x048a, B:208:0x0491, B:209:0x0494, B:211:0x049a), top: B:277:0x041d, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x0441  */
    /* JADX WARN: Code duplicated, block: B:192:0x0444 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x044e  */
    /* JADX WARN: Code duplicated, block: B:198:0x0451 A[Catch: all -> 0x0506, TryCatch #4 {all -> 0x0506, blocks: (B:173:0x041d, B:179:0x0428, B:185:0x0435, B:187:0x0439, B:193:0x0446, B:198:0x0451, B:200:0x0463, B:201:0x046b, B:203:0x0471, B:205:0x047f, B:206:0x048a, B:208:0x0491, B:209:0x0494, B:211:0x049a), top: B:277:0x041d, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x0463 A[Catch: all -> 0x0506, TryCatch #4 {all -> 0x0506, blocks: (B:173:0x041d, B:179:0x0428, B:185:0x0435, B:187:0x0439, B:193:0x0446, B:198:0x0451, B:200:0x0463, B:201:0x046b, B:203:0x0471, B:205:0x047f, B:206:0x048a, B:208:0x0491, B:209:0x0494, B:211:0x049a), top: B:277:0x041d, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x0471 A[Catch: all -> 0x0506, TryCatch #4 {all -> 0x0506, blocks: (B:173:0x041d, B:179:0x0428, B:185:0x0435, B:187:0x0439, B:193:0x0446, B:198:0x0451, B:200:0x0463, B:201:0x046b, B:203:0x0471, B:205:0x047f, B:206:0x048a, B:208:0x0491, B:209:0x0494, B:211:0x049a), top: B:277:0x041d, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x047f A[Catch: all -> 0x0506, LOOP:4: B:201:0x046b->B:205:0x047f, LOOP_END, TryCatch #4 {all -> 0x0506, blocks: (B:173:0x041d, B:179:0x0428, B:185:0x0435, B:187:0x0439, B:193:0x0446, B:198:0x0451, B:200:0x0463, B:201:0x046b, B:203:0x0471, B:205:0x047f, B:206:0x048a, B:208:0x0491, B:209:0x0494, B:211:0x049a), top: B:277:0x041d, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x0491 A[Catch: all -> 0x0506, TryCatch #4 {all -> 0x0506, blocks: (B:173:0x041d, B:179:0x0428, B:185:0x0435, B:187:0x0439, B:193:0x0446, B:198:0x0451, B:200:0x0463, B:201:0x046b, B:203:0x0471, B:205:0x047f, B:206:0x048a, B:208:0x0491, B:209:0x0494, B:211:0x049a), top: B:277:0x041d, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x0499  */
    /* JADX WARN: Code duplicated, block: B:213:0x049d A[Catch: all -> 0x0547, TRY_ENTER, TryCatch #5 {all -> 0x0547, blocks: (B:24:0x0024, B:35:0x004c, B:38:0x0058, B:44:0x0066, B:55:0x0084, B:56:0x008a, B:57:0x0090, B:59:0x0094, B:137:0x026b, B:172:0x041c, B:213:0x049d, B:215:0x04a7, B:216:0x04ba, B:217:0x04c4, B:232:0x0501, B:236:0x0505, B:240:0x0509, B:244:0x050d, B:245:0x050e, B:249:0x0520, B:253:0x052a, B:259:0x0542, B:248:0x0517, B:261:0x0544, B:218:0x04c5, B:220:0x04d3, B:222:0x04db, B:224:0x04df, B:227:0x04ea, B:229:0x04f9, B:228:0x04f5, B:25:0x0025, B:27:0x002c, B:29:0x0032, B:31:0x0037, B:33:0x003d, B:34:0x004b, B:173:0x041d, B:179:0x0428, B:185:0x0435, B:187:0x0439, B:193:0x0446, B:198:0x0451, B:200:0x0463, B:201:0x046b, B:203:0x0471, B:205:0x047f, B:206:0x048a, B:208:0x0491, B:209:0x0494, B:211:0x049a, B:138:0x026e, B:140:0x0283, B:142:0x028d, B:152:0x02da, B:154:0x02f1, B:155:0x0340, B:151:0x02d8, B:158:0x0347, B:162:0x034f, B:164:0x0359, B:166:0x0397, B:167:0x03da, B:169:0x03de, B:170:0x040d, B:171:0x041b, B:165:0x035f, B:160:0x034b, B:145:0x02bb, B:60:0x00a8, B:65:0x00b5, B:67:0x00bc, B:69:0x00c2, B:71:0x00c6, B:77:0x00db, B:79:0x00e8, B:81:0x00f2, B:83:0x00ff, B:84:0x0111, B:86:0x0121, B:90:0x012d, B:92:0x0133, B:94:0x0139, B:96:0x014e, B:98:0x0156, B:101:0x015c, B:102:0x015f, B:104:0x0168, B:106:0x017e, B:120:0x01f2, B:125:0x020f, B:127:0x0218, B:123:0x0205, B:109:0x019e, B:112:0x01b1, B:114:0x01b9, B:115:0x01c0, B:117:0x01c8, B:119:0x01d6, B:128:0x0237, B:129:0x0247, B:130:0x0248, B:132:0x0258, B:97:0x0154, B:78:0x00e3, B:242:0x050b), top: B:279:0x0024, inners: #0, #3, #4, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x04a7 A[Catch: all -> 0x0547, LOOP:5: B:214:0x04a5->B:215:0x04a7, LOOP_END, TryCatch #5 {all -> 0x0547, blocks: (B:24:0x0024, B:35:0x004c, B:38:0x0058, B:44:0x0066, B:55:0x0084, B:56:0x008a, B:57:0x0090, B:59:0x0094, B:137:0x026b, B:172:0x041c, B:213:0x049d, B:215:0x04a7, B:216:0x04ba, B:217:0x04c4, B:232:0x0501, B:236:0x0505, B:240:0x0509, B:244:0x050d, B:245:0x050e, B:249:0x0520, B:253:0x052a, B:259:0x0542, B:248:0x0517, B:261:0x0544, B:218:0x04c5, B:220:0x04d3, B:222:0x04db, B:224:0x04df, B:227:0x04ea, B:229:0x04f9, B:228:0x04f5, B:25:0x0025, B:27:0x002c, B:29:0x0032, B:31:0x0037, B:33:0x003d, B:34:0x004b, B:173:0x041d, B:179:0x0428, B:185:0x0435, B:187:0x0439, B:193:0x0446, B:198:0x0451, B:200:0x0463, B:201:0x046b, B:203:0x0471, B:205:0x047f, B:206:0x048a, B:208:0x0491, B:209:0x0494, B:211:0x049a, B:138:0x026e, B:140:0x0283, B:142:0x028d, B:152:0x02da, B:154:0x02f1, B:155:0x0340, B:151:0x02d8, B:158:0x0347, B:162:0x034f, B:164:0x0359, B:166:0x0397, B:167:0x03da, B:169:0x03de, B:170:0x040d, B:171:0x041b, B:165:0x035f, B:160:0x034b, B:145:0x02bb, B:60:0x00a8, B:65:0x00b5, B:67:0x00bc, B:69:0x00c2, B:71:0x00c6, B:77:0x00db, B:79:0x00e8, B:81:0x00f2, B:83:0x00ff, B:84:0x0111, B:86:0x0121, B:90:0x012d, B:92:0x0133, B:94:0x0139, B:96:0x014e, B:98:0x0156, B:101:0x015c, B:102:0x015f, B:104:0x0168, B:106:0x017e, B:120:0x01f2, B:125:0x020f, B:127:0x0218, B:123:0x0205, B:109:0x019e, B:112:0x01b1, B:114:0x01b9, B:115:0x01c0, B:117:0x01c8, B:119:0x01d6, B:128:0x0237, B:129:0x0247, B:130:0x0248, B:132:0x0258, B:97:0x0154, B:78:0x00e3, B:242:0x050b), top: B:279:0x0024, inners: #0, #3, #4, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x04d3 A[Catch: all -> 0x0502, TryCatch #0 {, blocks: (B:218:0x04c5, B:220:0x04d3, B:222:0x04db, B:224:0x04df, B:227:0x04ea, B:229:0x04f9, B:228:0x04f5), top: B:269:0x04c5, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:221:0x04da  */
    /* JADX WARN: Code duplicated, block: B:224:0x04df A[Catch: all -> 0x0502, TryCatch #0 {, blocks: (B:218:0x04c5, B:220:0x04d3, B:222:0x04db, B:224:0x04df, B:227:0x04ea, B:229:0x04f9, B:228:0x04f5), top: B:269:0x04c5, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:225:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:227:0x04ea A[Catch: all -> 0x0502, TryCatch #0 {, blocks: (B:218:0x04c5, B:220:0x04d3, B:222:0x04db, B:224:0x04df, B:227:0x04ea, B:229:0x04f9, B:228:0x04f5), top: B:269:0x04c5, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:228:0x04f5 A[Catch: all -> 0x0502, TryCatch #0 {, blocks: (B:218:0x04c5, B:220:0x04d3, B:222:0x04db, B:224:0x04df, B:227:0x04ea, B:229:0x04f9, B:228:0x04f5), top: B:269:0x04c5, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:267:0x0555  */
    /* JADX WARN: Code duplicated, block: B:269:0x04c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x041d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x048a A[EDGE_INSN: B:296:0x048a->B:206:0x048a BREAK  A[LOOP:4: B:201:0x046b->B:205:0x047f], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v1, types: [fkn, nri] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59 */
    public final void j(int i, String str, flf flfVar) {
        boolean z;
        foe foeVarC;
        boolean z2;
        foe foeVarC2;
        omj omjVarW;
        gev gevVarB;
        foe foeVar;
        ?? r18;
        dov dovVar;
        fkn fknVar;
        boolean z3;
        omj omjVar;
        ?? r3;
        dov dovVar2;
        String str2;
        foe foeVar2;
        int i2;
        foe foeVar3;
        afts aftsVarA;
        foe foeVar4;
        boolean z4;
        boolean z5;
        foe foeVar5;
        boolean z6;
        boolean z7;
        foe foeVar6;
        foe foeVar7;
        foe foeVar8;
        boolean z8;
        boolean z9;
        int size;
        int i3;
        foe foeVar9;
        gev gevVar;
        ?? r10;
        int i4;
        Object obj;
        ?? r4;
        int i5;
        axq axqVar;
        foe foeVar10;
        ?? r19;
        String str3;
        String str4 = str == null ? this.f : str;
        if (fna.w) {
            synchronized (this) {
            }
        }
        if (ftj.a) {
            synchronized (this) {
            }
            hashCode();
        }
        try {
            synchronized (this) {
                boolean z10 = this.a;
                foe foeVar11 = this.i;
                z = true;
                foeVarC = foeVar11 != null ? foeVar11.c(true) : null;
                foe foeVar12 = this.j;
                z2 = false;
                foeVarC2 = foeVar12 != null ? foeVar12.c(false) : null;
                omjVarW = this.c.w();
                gevVarB = this.u.b();
                this.q = true;
            }
            ?? AQ = gzj.aQ(this.c, 15, foeVarC, foeVarC2);
            boolean z11 = (omjVarW == null || AQ == 0 || !AQ.f()) ? false : true;
            if (AQ != 0) {
                AQ.b("attribution", str4);
                if (i == -1) {
                    str3 = "none";
                } else if (i == 0) {
                    str3 = "setRoot";
                } else if (i != 1) {
                    str3 = i != 2 ? "updateStateAsync" : "updateState";
                } else {
                    str3 = "setRootAsync";
                }
                AQ.b("section_set_root_source", str3);
                gzj.aT();
            }
            this.v.c();
            foe foeVarC3 = foeVarC;
            while (true) {
                fof fofVar = this.c;
                if (foeVarC2 == null) {
                    omj omjVar2 = omjVarW;
                    fly flyVar = fofVar.e;
                    if (fjs.b(flyVar == null ? null : (fjs) flyVar.c(fjs.class))) {
                        throw null;
                    }
                    if (omjVar2 != null && AQ != 0) {
                        omj.r(AQ);
                    }
                    fpq.j.addAndGet(1L);
                    if (gzj.aT()) {
                        fpq.k.addAndGet(1L);
                        return;
                    }
                    return;
                }
                ?? r0 = gevVarB.a;
                dov dovVar3 = this.w;
                String str5 = this.f;
                foeVarC2.k = foeVarC2.l;
                omj omjVarW2 = fofVar.w();
                fkn fknVarAQ = gzj.aQ(fofVar, 11, foeVarC3, foeVarC2);
                try {
                    foeVarC2.c = fof.B(fofVar, foeVarC2);
                    boolean z12 = foeVarC3 != null ? z2 : z;
                    if (foeVarC3 != null) {
                        foeVarC2.i = foeVarC3.i;
                        foeVar = foeVarC3;
                    } else {
                        foeVar = null;
                    }
                    boolean zK = foeVarC2.k();
                    if (!zK) {
                        fly flyVar2 = fofVar.e;
                    }
                    boolean z13 = foeVar != null && foeVar.getClass().equals(foeVarC2.getClass());
                    if (foeVar == null || !z13) {
                        foeVarC2.i(foeVarC2.c);
                    } else {
                        foeVarC2.j(foeVar.g, foeVarC2.g);
                    }
                    List list = (List) r0.get(foeVarC2.k);
                    if (list != null) {
                        fky fkyVar = foeVarC2.g;
                        r19 = r0;
                        dovVar = dovVar3;
                        int i6 = 0;
                        for (int size2 = list.size(); i6 < size2; size2 = size2) {
                            fkyVar.b((aero) list.get(i6));
                            i6++;
                        }
                        fpq.g.addAndGet(list.size());
                        r18 = r19;
                        if (foe.o(foeVar, foeVarC2)) {
                            foe.e(foeVarC2);
                        }
                    } else {
                        r18 = r0;
                        dovVar = dovVar3;
                    }
                    if (zK) {
                        fknVar = fknVarAQ;
                        z3 = z12;
                        omjVar = omjVarW;
                        r3 = r18;
                        dovVar2 = dovVar;
                        str2 = str5;
                    } else {
                        Map mapD = (foeVar == null || foeVar.k()) ? null : foe.d(foeVar);
                        fly flyVar3 = fofVar.e;
                        omj omjVarW3 = fofVar.w();
                        fkn fknVarAQ2 = gzj.aQ(fofVar, 14, null, foeVarC2);
                        dov dovVarS = foeVarC2.s(foeVarC2.c);
                        foeVarC2.j = dovVarS == null ? new ArrayList() : dovVarS.a;
                        if (omjVarW3 != null && fknVarAQ2 != null) {
                            omj.r(fknVarAQ2);
                        }
                        List list2 = foeVarC2.j;
                        int size3 = list2.size();
                        int i7 = 0;
                        ?? r110 = r18;
                        while (i7 < size3) {
                            fkn fknVar2 = fknVarAQ;
                            foe foeVar13 = (foe) list2.get(i7);
                            foeVar13.a = foeVarC2;
                            boolean z14 = z12;
                            String str6 = foeVar13.l;
                            if (TextUtils.isEmpty(str6)) {
                                throw new IllegalStateException(a.bT(foeVar13.f, "Your Section ", " has an empty key. Please specify a key."));
                            }
                            String str7 = str5;
                            List list3 = list2;
                            String str8 = foeVarC2.k + str6;
                            fof fofVar2 = foeVarC2.c;
                            foe foeVarA = fofVar2.A();
                            if (foeVarA == null) {
                                i5 = size3;
                            } else {
                                i5 = size3;
                                if (foeVarA.c.o.a.contains(str8)) {
                                    String str9 = foeVar13.f;
                                    if (foeVarA.e == null) {
                                        foeVarA.e = new HashMap();
                                    }
                                    int iIntValue = foeVarA.e.containsKey(str9) ? ((Integer) foeVarA.e.get(str9)).intValue() : 0;
                                    foeVarA.e.put(str9, Integer.valueOf(iIntValue + 1));
                                    str8 = str8 + iIntValue;
                                }
                                foeVar13.k = str8;
                                fofVar2.o.a.add(str8);
                                foeVar13.c = fof.B(fofVar, foeVar13);
                                if (mapD == null) {
                                    axqVar = null;
                                } else {
                                    axqVar = (axq) mapD.get(foeVar13.k);
                                }
                                if (axqVar != null) {
                                    foeVar10 = (foe) axqVar.a;
                                } else {
                                    foeVar10 = null;
                                }
                                y(fofVar, foeVar10, foeVar13, r110, dovVar, str7);
                                i7++;
                                dovVar = dovVar;
                                str5 = str7;
                                list2 = list3;
                                z12 = z14;
                                size3 = i5;
                                omjVarW = omjVarW;
                                r110 = r110;
                                fknVarAQ = fknVar2;
                            }
                            foeVar13.k = str8;
                            fofVar2.o.a.add(str8);
                            foeVar13.c = fof.B(fofVar, foeVar13);
                            if (mapD == null) {
                                axqVar = null;
                            } else {
                                axqVar = (axq) mapD.get(foeVar13.k);
                            }
                            if (axqVar != null) {
                                foeVar10 = (foe) axqVar.a;
                            } else {
                                foeVar10 = null;
                            }
                            y(fofVar, foeVar10, foeVar13, r110, dovVar, str7);
                            i7++;
                            dovVar = dovVar;
                            str5 = str7;
                            list2 = list3;
                            z12 = z14;
                            size3 = i5;
                            omjVarW = omjVarW;
                            r110 = r110;
                            fknVarAQ = fknVar2;
                            fpq.j.addAndGet(1L);
                            if (gzj.aT()) {
                                fpq.k.addAndGet(1L);
                            }
                            throw th;
                        }
                        fknVar = fknVarAQ;
                        z3 = z12;
                        omjVar = omjVarW;
                        r4 = r110;
                        dovVar2 = dovVar;
                        str2 = str5;
                        r3 = r4;
                        if (fofVar.e != flyVar3) {
                            fofVar.e = flyVar3;
                        }
                    }
                    if (omjVarW2 != null && fknVar != null) {
                        omj.r(fknVar);
                    }
                    r18 = r19;
                    r3 = r4;
                    int i8 = fob.a;
                    omj omjVarW4 = fofVar.w();
                    fkn fknVarAQ3 = gzj.aQ(fofVar, 13, foeVarC3, foeVarC2);
                    ArrayList arrayList = new ArrayList();
                    if (foeVarC3 != null) {
                        if (foeVarC3.f.equals(foeVarC2.f)) {
                            foeVar2 = foeVarC3;
                        } else {
                            i2 = -1;
                            afts aftsVarA2 = fob.a(fofVar, foeVarC3, null, arrayList, dovVar2, str2, "", "", Thread.currentThread().getName(), z11);
                            foeVar2 = foeVarC3;
                            foeVar3 = foeVarC2;
                            aftsVarA = afts.v(aftsVarA2, fob.a(fofVar, null, foeVar3, arrayList, dovVar2, str2, "", "", Thread.currentThread().getName(), z11));
                            foeVarC3 = foeVar2;
                        }
                        if (omjVarW4 != null && fknVarAQ3 != null) {
                            if (foeVarC3 == null) {
                                i4 = i2;
                            } else {
                                i4 = foeVarC3.i;
                            }
                            fknVarAQ3.a("current_root_count", i4);
                            fknVarAQ3.a("change_count", aftsVarA.m());
                            fknVarAQ3.a("final_count", aftsVarA.a);
                            obj = aftsVarA.c;
                            if (obj != null) {
                                fknVarAQ3.a("changeset_effective_count", ((foa) obj).a);
                                fknVarAQ3.a("changeset_insert_single_count", ((foa) obj).b);
                                fknVarAQ3.a("changeset_insert_range_count", ((foa) obj).c);
                                fknVarAQ3.a("changeset_delete_single_count", ((foa) obj).d);
                                fknVarAQ3.a("changeset_delete_range_count", ((foa) obj).e);
                                fknVarAQ3.a("changeset_update_single_count", ((foa) obj).f);
                                fknVarAQ3.a("changeset_update_range_count", ((foa) obj).g);
                                fknVarAQ3.a("changeset_move_count", ((foa) obj).h);
                            }
                            omj.r(fknVarAQ3);
                        }
                        if ((foeVarC3 == null && foeVarC3.i < 0) || foeVar3.i < 0) {
                            break;
                        }
                        synchronized (this) {
                            try {
                                foeVar4 = this.i;
                                if (foeVar4 != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                z5 = (z3 && z4 && foeVar2.h == foeVar4.h) || (z3 && !z4);
                                foeVar5 = this.j;
                                if (foeVar5 == null && foeVar3.h == foeVar5.h) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (!z5 && z6 && w(gevVarB)) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    foeVar9 = this.i;
                                    this.i = foeVar3;
                                    this.j = null;
                                    r();
                                    gevVar = this.u;
                                    if (!r3.isEmpty()) {
                                        for (String str10 : r3.keySet()) {
                                            r10 = gevVar.a;
                                            if (!r10.containsKey(str10)) {
                                                break;
                                            }
                                            gev.a(r10, r3, str10);
                                            gev.a(gevVar.b, gevVarB.b, str10);
                                        }
                                    }
                                    this.s.add(aftsVarA);
                                    if (foeVar9 != null) {
                                        s(foeVar9);
                                    }
                                    q(foeVar3);
                                    foeVar6 = foeVar3;
                                } else {
                                    foeVar6 = null;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z7) {
                            p(foeVar6);
                            size = arrayList.size();
                            for (i3 = 0; i3 < size; i3++) {
                            }
                            this.m.K();
                            v(flfVar);
                        }
                        synchronized (this) {
                            r3.clear();
                            gevVarB.b.clear();
                            boolean z15 = this.a;
                            foeVar7 = this.i;
                            if (foeVar7 != null) {
                                foeVarC3 = foeVar7.c(true);
                            } else {
                                foeVarC3 = null;
                            }
                            foeVar8 = this.j;
                            if (foeVar8 != null) {
                                z8 = false;
                                foeVarC2 = foeVar8.c(false);
                            } else {
                                z8 = false;
                                foeVarC2 = null;
                            }
                            if (foeVarC2 != null) {
                                gev gevVarB2 = this.u.b();
                                z9 = true;
                                this.q = true;
                                gevVarB = gevVarB2;
                            } else {
                                z9 = true;
                                r();
                            }
                        }
                        z2 = z8;
                        z = z9;
                        omjVarW = omjVar;
                        fpq.j.addAndGet(1L);
                        if (gzj.aT()) {
                            fpq.k.addAndGet(1L);
                        }
                        throw th;
                    }
                    foeVar2 = null;
                    foeVarC3 = null;
                    i2 = -1;
                    foeVar3 = foeVarC2;
                    aftsVarA = fob.a(fofVar, foeVarC3, foeVar3, arrayList, dovVar2, str2, "", "", Thread.currentThread().getName(), z11);
                    if (omjVarW4 != null) {
                        if (foeVarC3 == null) {
                            i4 = i2;
                        } else {
                            i4 = foeVarC3.i;
                        }
                        fknVarAQ3.a("current_root_count", i4);
                        fknVarAQ3.a("change_count", aftsVarA.m());
                        fknVarAQ3.a("final_count", aftsVarA.a);
                        obj = aftsVarA.c;
                        if (obj != null) {
                            fknVarAQ3.a("changeset_effective_count", ((foa) obj).a);
                            fknVarAQ3.a("changeset_insert_single_count", ((foa) obj).b);
                            fknVarAQ3.a("changeset_insert_range_count", ((foa) obj).c);
                            fknVarAQ3.a("changeset_delete_single_count", ((foa) obj).d);
                            fknVarAQ3.a("changeset_delete_range_count", ((foa) obj).e);
                            fknVarAQ3.a("changeset_update_single_count", ((foa) obj).f);
                            fknVarAQ3.a("changeset_update_range_count", ((foa) obj).g);
                            fknVarAQ3.a("changeset_move_count", ((foa) obj).h);
                        }
                        omj.r(fknVarAQ3);
                    }
                    if (foeVarC3 == null) {
                        synchronized (this) {
                            foeVar4 = this.i;
                            if (foeVar4 != null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z3) {
                            }
                            foeVar5 = this.j;
                            if (foeVar5 == null) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (!z5) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                foeVar9 = this.i;
                                this.i = foeVar3;
                                this.j = null;
                                r();
                                gevVar = this.u;
                                if (!r3.isEmpty()) {
                                    while (r8.hasNext()) {
                                        r10 = gevVar.a;
                                        if (!r10.containsKey(str10)) {
                                            break;
                                            break;
                                        } else {
                                            gev.a(r10, r3, str10);
                                            gev.a(gevVar.b, gevVarB.b, str10);
                                        }
                                    }
                                }
                                this.s.add(aftsVarA);
                                if (foeVar9 != null) {
                                    s(foeVar9);
                                }
                                q(foeVar3);
                                foeVar6 = foeVar3;
                            } else {
                                foeVar6 = null;
                            }
                            if (z7) {
                                p(foeVar6);
                                size = arrayList.size();
                                while (i3 < size) {
                                }
                                this.m.K();
                                v(flfVar);
                            }
                            synchronized (this) {
                                r3.clear();
                                gevVarB.b.clear();
                                boolean z16 = this.a;
                                foeVar7 = this.i;
                                if (foeVar7 != null) {
                                    foeVarC3 = foeVar7.c(true);
                                } else {
                                    foeVarC3 = null;
                                }
                                foeVar8 = this.j;
                                if (foeVar8 != null) {
                                    z8 = false;
                                    foeVarC2 = foeVar8.c(false);
                                } else {
                                    z8 = false;
                                    foeVarC2 = null;
                                }
                                if (foeVarC2 != null) {
                                    gev gevVarB3 = this.u.b();
                                    z9 = true;
                                    this.q = true;
                                    gevVarB = gevVarB3;
                                } else {
                                    z9 = true;
                                    r();
                                }
                                z2 = z8;
                                z = z9;
                                omjVarW = omjVar;
                            }
                        }
                    } else {
                        synchronized (this) {
                            foeVar4 = this.i;
                            if (foeVar4 != null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z3) {
                            }
                            foeVar5 = this.j;
                            if (foeVar5 == null) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (!z5) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                foeVar9 = this.i;
                                this.i = foeVar3;
                                this.j = null;
                                r();
                                gevVar = this.u;
                                if (!r3.isEmpty()) {
                                    while (r8.hasNext()) {
                                        r10 = gevVar.a;
                                        if (!r10.containsKey(str10)) {
                                            break;
                                            break;
                                        } else {
                                            gev.a(r10, r3, str10);
                                            gev.a(gevVar.b, gevVarB.b, str10);
                                        }
                                    }
                                }
                                this.s.add(aftsVarA);
                                if (foeVar9 != null) {
                                    s(foeVar9);
                                }
                                q(foeVar3);
                                foeVar6 = foeVar3;
                            } else {
                                foeVar6 = null;
                            }
                            if (z7) {
                                p(foeVar6);
                                size = arrayList.size();
                                while (i3 < size) {
                                }
                                this.m.K();
                                v(flfVar);
                            }
                            synchronized (this) {
                                r3.clear();
                                gevVarB.b.clear();
                                boolean z17 = this.a;
                                foeVar7 = this.i;
                                if (foeVar7 != null) {
                                    foeVarC3 = foeVar7.c(true);
                                } else {
                                    foeVarC3 = null;
                                }
                                foeVar8 = this.j;
                                if (foeVar8 != null) {
                                    z8 = false;
                                    foeVarC2 = foeVar8.c(false);
                                } else {
                                    z8 = false;
                                    foeVarC2 = null;
                                }
                                if (foeVarC2 != null) {
                                    gev gevVarB4 = this.u.b();
                                    z9 = true;
                                    this.q = true;
                                    gevVarB = gevVarB4;
                                } else {
                                    z9 = true;
                                    r();
                                }
                                z2 = z8;
                                z = z9;
                                omjVarW = omjVar;
                            }
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ChangeSet count is below 0! Current section: ");
            if (foeVarC3 == null) {
                sb.append("null; ");
            } else {
                sb.append(foeVarC3.f + " , key=" + foeVarC3.k + ", count=" + foeVarC3.i + ", childrenSize=" + foeVarC3.j.size() + "; ");
            }
            sb.append("Next section: ");
            sb.append(foeVar3.f + " , key=" + foeVar3.k + ", count=" + foeVar3.i + ", childrenSize=" + foeVar3.j.size() + "; ");
            sb.append("Changes: [");
            for (int i9 = 0; i9 < aftsVarA.a; i9++) {
                fnz fnzVarN = aftsVarA.n(i9);
                int i10 = fnzVarN.b;
                int i11 = fnzVarN.c;
                int i12 = fnzVarN.d;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10);
                sb2.append(' ');
                sb2.append(i11);
                sb2.append(' ');
                sb2.append(i12);
                sb.append(sb2.toString());
                sb.append(", ");
            }
            sb.append(']');
            throw new IllegalStateException(sb.toString());
        } catch (Throwable th4) {
            fpq.j.addAndGet(1L);
            if (gzj.aT()) {
                fpq.k.addAndGet(1L);
            }
            throw th4;
        }
    }

    final synchronized void k(String str, aero aeroVar, String str2) {
        fon fonVar = this.p;
        fonVar.b();
        x(str, aeroVar);
        fonVar.c(2, str2);
        fpq.h.addAndGet(1L);
    }

    final synchronized void l(String str, aero aeroVar, String str2) {
        fon fonVar = this.h;
        fonVar.b();
        x(str, aeroVar);
        fonVar.c(3, str2);
        fpq.i.addAndGet(1L);
    }

    public final aami m(foe foeVar, String str, int i) {
        if (foeVar == null) {
            return null;
        }
        if (str.equals(foeVar.k)) {
            return new aami(foeVar, i, null);
        }
        List list = foeVar.j;
        if (list == null || list.isEmpty()) {
            return null;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            foe foeVar2 = (foe) list.get(i3);
            aami aamiVarM = m(foeVar2, str, i + i2);
            if (aamiVarM != null) {
                return aamiVarM;
            }
            i2 += foeVar2.i;
        }
        return null;
    }

    public final void n(foe foeVar, boolean z, boolean z2, long j, gzj gzjVar, int i) {
        if (foeVar.k()) {
            return;
        }
        fof fofVar = foeVar.c;
        List list = foeVar.j;
        int size = list.size();
        int i2 = i;
        for (int i3 = 0; i3 < size; i3++) {
            foe foeVar2 = (foe) list.get(i3);
            n(foeVar2, z, z2, j, gzjVar, i2);
            i2 += foeVar2.i;
        }
    }
}
