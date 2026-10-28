package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.facebook.litho.ComponentTree;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fho implements Callable {
    final /* synthetic */ fhp a;

    public fho(fhp fhpVar) {
        this.a = fhpVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x0202  */
    /* JADX WARN: Code duplicated, block: B:109:0x0209  */
    /* JADX WARN: Code duplicated, block: B:112:0x0215 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0217  */
    /* JADX WARN: Code duplicated, block: B:115:0x0227  */
    /* JADX WARN: Code duplicated, block: B:117:0x022d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0230  */
    /* JADX WARN: Code duplicated, block: B:121:0x0234  */
    /* JADX WARN: Code duplicated, block: B:122:0x0239  */
    /* JADX WARN: Code duplicated, block: B:125:0x024a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0257  */
    /* JADX WARN: Code duplicated, block: B:131:0x0276  */
    /* JADX WARN: Code duplicated, block: B:134:0x027f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0289 A[Catch: all -> 0x0292, DONT_GENERATE, TryCatch #0 {, blocks: (B:137:0x0285, B:139:0x0289, B:141:0x028d), top: B:156:0x0285 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x028d A[Catch: all -> 0x0292, DONT_GENERATE, TryCatch #0 {, blocks: (B:137:0x0285, B:139:0x0289, B:141:0x028d), top: B:156:0x0285 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0285 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00af A[Catch: all -> 0x00bb, TryCatch #3 {, blocks: (B:21:0x0063, B:23:0x006e, B:25:0x0074, B:27:0x007a, B:29:0x0092, B:34:0x009e, B:40:0x00af, B:41:0x00b4), top: B:160:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ef  */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        fkz fkzVar;
        fjc fjcVar;
        fhd fhdVar;
        boolean z;
        int i;
        fjq fjqVar;
        boolean z2;
        fib fibVar;
        fkn fknVarBN;
        String strR;
        boolean z3;
        fkn fknVar;
        fkn fknVar2;
        int i2;
        int i3;
        fjq fjqVar2;
        fjq fjqVarK;
        fji fjiVarBi;
        Object obj;
        fjq fjqVarL;
        fhp fhpVar;
        boolean z4;
        fjq fjqVar3;
        boolean z5;
        fhp fhpVar2 = this.a;
        synchronized (fhpVar2) {
            if (fhpVar2.m) {
                return null;
            }
            fhp fhpVar3 = this.a;
            ComponentTree componentTree = fhpVar3.n;
            fhp fhpVar4 = true != componentTree.D ? null : fhpVar3;
            synchronized (componentTree) {
                fkzVar = new fkz(componentTree.z);
                fjcVar = componentTree.y;
                fhdVar = new fhd(fhpVar3.a, fhpVar3.f, null);
                fkzVar.g.B(fkzVar);
            }
            fgy fgyVar = fhpVar3.b;
            ComponentTree componentTree2 = fhpVar3.n;
            int i4 = fhpVar3.c;
            int i5 = fhpVar3.d;
            int i6 = fhpVar3.i;
            boolean z6 = fhpVar3.e;
            int i7 = fhpVar3.k;
            String str = fhpVar3.l;
            int i8 = fjc.Q;
            omj omjVarW = fhdVar.w();
            String strO = fhdVar.o();
            int i9 = componentTree2.A;
            if (fna.w) {
                fgyVar.c();
                fjc.i(i7);
                int i10 = fgyVar.j;
                View.MeasureSpec.toString(i4);
                View.MeasureSpec.toString(i5);
            }
            if (fjcVar != null) {
                synchronized (fjcVar) {
                    fibVar = fjcVar.O;
                    fjq fjqVar4 = fjcVar.n;
                    fjcVar.d();
                    if (fjqVar4 != null && fhdVar.t() && fkzVar.m()) {
                        fjqVar3 = fjqVar4;
                        fgy fgyVarD = fjqVar3.d();
                        z = z6;
                        i = i7;
                        if (fgyVar.D().equals(fgyVarD.D()) && gzj.bA(fgyVarD, fgyVar) && (fgyVarD == fgyVar || (fgyVarD != null && fgyVar != null && fgyVarD.g(fgyVar)))) {
                            z5 = true;
                        }
                        if (!z5) {
                            fjcVar.n = null;
                            fjcVar.p = null;
                        }
                    } else {
                        fjqVar3 = fjqVar4;
                        z = z6;
                        i = i7;
                    }
                    z5 = false;
                    if (!z5) {
                        fjcVar.n = null;
                        fjcVar.p = null;
                    }
                }
                z2 = z5;
                fjqVar = fjqVar3;
            } else {
                z = z6;
                i = i7;
                fjqVar = null;
                z2 = false;
                fibVar = null;
            }
            if (omjVarW != null) {
                fknVarBN = gzj.bN(omjVarW, fhdVar.n(), omjVarW.p(fhdVar, 16), fhdVar.e);
            } else {
                fknVarBN = null;
            }
            if (fknVarBN != null) {
                fknVarBN.b("component", fgyVar.c());
                fknVarBN.b("calculate_layout_state_source", fjc.i(i));
                gzj.aT();
                fknVarBN.b("attribution", str);
                fknVarBN.a("layout_version", i6);
                fknVarBN.b("templateUri", strO);
            }
            boolean z7 = z;
            boolean z8 = z2;
            fjc fjcVar2 = new fjc(fhdVar, fgyVar, fkzVar, fhpVar4, fjcVar, fibVar);
            fjd fjdVarD = fjcVar2.d();
            Map map = fgy.h;
            if (fjdVarD.d) {
                ComponentTree componentTree3 = fjdVarD.a;
                throw new IllegalStateException("Duplicate layout of a component: ".concat(String.valueOf(String.valueOf(componentTree3 != null ? componentTree3.b() : null))));
            }
            fjdVarD.d = true;
            fhdVar.h = new WeakReference(fjdVarD);
            fjcVar2.w = z7;
            fjcVar2.x = i9;
            Context context = fhdVar.a;
            fjcVar2.B = (AccessibilityManager) context.getSystemService("accessibility");
            fjcVar2.C = fgn.c(fjcVar2.B);
            fjcVar2.d = i4;
            fjcVar2.e = i5;
            fjcVar2.r = fgyVar.c();
            fjcVar2.A = true;
            if (!z8) {
                strR = null;
            } else {
                if (fjqVar == 0) {
                    throw null;
                }
                strR = fjqVar.r();
            }
            if (true != z8) {
                fjqVar = null;
            }
            if (fknVarBN != null) {
                String str2 = "start_reconcile_layout";
                if (fjqVar == null) {
                    str2 = "start_create_layout";
                    z4 = false;
                } else {
                    z4 = true;
                }
                fknVarBN.c(str2);
                fknVar = fknVarBN;
                z3 = z4;
                fknVar2 = fknVar;
            } else {
                z3 = fjqVar != null;
                fknVar = null;
                fknVar2 = null;
            }
            if (true != z3) {
                fjqVarK = gzj.be(fjdVarD, fhdVar, i4, i5, fgyVar, true, false, null);
                i2 = i4;
                i3 = i5;
                if (fjqVarK == null || !fjdVarD.c()) {
                    fjc fjcVar3 = fjdVarD.b;
                    if (fjcVar3 != null) {
                        fjcVar3.H = false;
                    }
                    fjqVar2 = null;
                } else if (fknVar != null) {
                    fknVar.c("end_create_layout");
                }
                if (fjqVarK == null) {
                    if (fjdVarD.c()) {
                        fjiVarBi = null;
                    } else {
                        if (fknVar2 != null) {
                            fknVar2.c("start_measure");
                        } else {
                            fknVar2 = null;
                        }
                        fjiVarBi = gzj.bi(fjdVarD, fjqVarK, i2, i3);
                        if (fknVar2 != null) {
                            fknVar2.c("end_measure");
                        }
                    }
                    if (gzj.aZ(fjqVarK)) {
                        obj = null;
                        if (fjiVarBi != null) {
                            fjqVarL = fjiVarBi.l();
                        } else {
                            fjqVarL = null;
                        }
                        fjcVar2.p = fjiVarBi;
                        fjcVar2.n = fjqVarL;
                        fjcVar2.q = fjc.f(fjqVarL);
                        fjcVar2.A = false;
                        if (fknVarBN != null) {
                            fknVarBN.c("start_collect_results");
                        }
                        fjc.k(fhdVar, fjcVar2);
                        fjdVarD.b();
                        if (fknVarBN != null) {
                            fknVarBN.c("end_collect_results");
                            omj.r(gzj.bN(omjVarW, fhdVar.n(), fknVarBN, fhdVar.e));
                        }
                        fpq.d.addAndGet(1L);
                        if (gzj.aT()) {
                            fpq.e.addAndGet(1L);
                        }
                        if (fna.i) {
                            fia.b(i9, context);
                        }
                    } else {
                        if (fjqVarK != null) {
                            throw null;
                        }
                        fjcVar2.o = fjqVarK;
                        fjcVar2.q = fjc.f(fjqVarK);
                        fjcVar2.A = false;
                        fjcVar2.G = true;
                        if (fknVarBN != null) {
                            omj.r(fknVarBN);
                        }
                        obj = null;
                    }
                    fhpVar = this.a;
                    synchronized (fhpVar) {
                        return fhpVar.m ? obj : fjcVar2;
                    }
                }
                fjiVarBi = null;
                fjqVarK = null;
                if (gzj.aZ(fjqVarK)) {
                    obj = null;
                    if (fjiVarBi != null) {
                        fjqVarL = fjiVarBi.l();
                    } else {
                        fjqVarL = null;
                    }
                    fjcVar2.p = fjiVarBi;
                    fjcVar2.n = fjqVarL;
                    fjcVar2.q = fjc.f(fjqVarL);
                    fjcVar2.A = false;
                    if (fknVarBN != null) {
                        fknVarBN.c("start_collect_results");
                    }
                    fjc.k(fhdVar, fjcVar2);
                    fjdVarD.b();
                    if (fknVarBN != null) {
                        fknVarBN.c("end_collect_results");
                        omj.r(gzj.bN(omjVarW, fhdVar.n(), fknVarBN, fhdVar.e));
                    }
                    fpq.d.addAndGet(1L);
                    if (gzj.aT()) {
                        fpq.e.addAndGet(1L);
                    }
                    if (fna.i) {
                        fia.b(i9, context);
                    }
                } else {
                    if (fjqVarK != null) {
                        throw null;
                    }
                    fjcVar2.o = fjqVarK;
                    fjcVar2.q = fjc.f(fjqVarK);
                    fjcVar2.A = false;
                    fjcVar2.G = true;
                    if (fknVarBN != null) {
                        omj.r(fknVarBN);
                    }
                    obj = null;
                }
                fhpVar = this.a;
                synchronized (fhpVar) {
                    if (fhpVar.m) {
                    }
                }
            }
            i2 = i4;
            i3 = i5;
            fhd fhdVarBa = gzj.ba(fjdVarD, fhdVar, fgyVar, true, strR);
            fjqVar2 = fjqVar;
            fjqVarK = fjq.k(fjdVarD, fhdVar, fjqVar2, fhdVarBa.c, fhdVarBa.i(), strR, fjdVarD.a().f());
            if (fknVar != null) {
                fknVar.c(fjqVar2 == null ? "end_create_layout" : "end_reconcile_layout");
            }
            if (fjqVarK == null) {
                if (fjdVarD.c()) {
                    fjiVarBi = null;
                } else {
                    if (fknVar2 != null) {
                        fknVar2.c("start_measure");
                    } else {
                        fknVar2 = null;
                    }
                    fjiVarBi = gzj.bi(fjdVarD, fjqVarK, i2, i3);
                    if (fknVar2 != null) {
                        fknVar2.c("end_measure");
                    }
                }
                if (gzj.aZ(fjqVarK)) {
                    obj = null;
                    if (fjiVarBi != null) {
                        fjqVarL = fjiVarBi.l();
                    } else {
                        fjqVarL = null;
                    }
                    fjcVar2.p = fjiVarBi;
                    fjcVar2.n = fjqVarL;
                    fjcVar2.q = fjc.f(fjqVarL);
                    fjcVar2.A = false;
                    if (fknVarBN != null) {
                        fknVarBN.c("start_collect_results");
                    }
                    fjc.k(fhdVar, fjcVar2);
                    fjdVarD.b();
                    if (fknVarBN != null) {
                        fknVarBN.c("end_collect_results");
                        omj.r(gzj.bN(omjVarW, fhdVar.n(), fknVarBN, fhdVar.e));
                    }
                    fpq.d.addAndGet(1L);
                    if (gzj.aT()) {
                        fpq.e.addAndGet(1L);
                    }
                    if (fna.i) {
                        fia.b(i9, context);
                    }
                } else {
                    if (fjqVarK != null) {
                        throw null;
                    }
                    fjcVar2.o = fjqVarK;
                    fjcVar2.q = fjc.f(fjqVarK);
                    fjcVar2.A = false;
                    fjcVar2.G = true;
                    if (fknVarBN != null) {
                        omj.r(fknVarBN);
                    }
                    obj = null;
                }
                fhpVar = this.a;
                synchronized (fhpVar) {
                    if (fhpVar.m) {
                    }
                }
            }
            fjiVarBi = null;
            fjqVarK = null;
            if (gzj.aZ(fjqVarK)) {
                obj = null;
                if (fjiVarBi != null) {
                    fjqVarL = fjiVarBi.l();
                } else {
                    fjqVarL = null;
                }
                fjcVar2.p = fjiVarBi;
                fjcVar2.n = fjqVarL;
                fjcVar2.q = fjc.f(fjqVarL);
                fjcVar2.A = false;
                if (fknVarBN != null) {
                    fknVarBN.c("start_collect_results");
                }
                fjc.k(fhdVar, fjcVar2);
                fjdVarD.b();
                if (fknVarBN != null) {
                    fknVarBN.c("end_collect_results");
                    omj.r(gzj.bN(omjVarW, fhdVar.n(), fknVarBN, fhdVar.e));
                }
                fpq.d.addAndGet(1L);
                if (gzj.aT()) {
                    fpq.e.addAndGet(1L);
                }
                if (fna.i) {
                    fia.b(i9, context);
                }
            } else {
                if (fjqVarK != null) {
                    throw null;
                }
                fjcVar2.o = fjqVarK;
                fjcVar2.q = fjc.f(fjqVarK);
                fjcVar2.A = false;
                fjcVar2.G = true;
                if (fknVarBN != null) {
                    omj.r(fknVarBN);
                }
                obj = null;
            }
            fhpVar = this.a;
            synchronized (fhpVar) {
                if (fhpVar.m) {
                }
            }
        }
    }
}
