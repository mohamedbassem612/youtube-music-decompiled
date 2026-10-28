package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.MoreExecutors;
import internal.org.jni_zero.JniZero;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class abge implements tdh {
    public final Executor A;
    public final abmt B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public aazj I;
    public abob J;
    public abgg K;
    public Map L;
    public long M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public wgs[] S;
    public final yha V;
    public final vxz W;
    public final abgo Y;
    private abgi b;
    private avmn c;
    private final vxz e;
    private final ci f;
    public final abvk x;
    public final abfz y;
    public final ScheduledExecutorService z;
    public final Object R = new Object();
    public Optional T = Optional.empty();
    private final abga d = new abga(this);
    private final avmm a = new avmm();
    public final aber X = new aber(this);
    public final abgb U = new abgb(this);

    public abge(abvk abvkVar, ci ciVar, abfz abfzVar, yha yhaVar, ScheduledExecutorService scheduledExecutorService, Executor executor, abmt abmtVar, vxz vxzVar, abgo abgoVar, vxz vxzVar2) {
        this.x = abvkVar;
        this.y = abfzVar;
        this.V = yhaVar;
        this.z = scheduledExecutorService;
        this.A = executor;
        this.B = abmtVar;
        this.f = ciVar;
        this.W = vxzVar;
        this.Y = abgoVar;
        this.e = vxzVar2;
    }

    private final boolean c() {
        return this.f != null;
    }

    public static final boolean q(aazj aazjVar) {
        wjf wjfVar;
        return aazjVar.a.a(abob.e, abob.f) && (wjfVar = aazjVar.c) != null && wjfVar.k().e("dibs");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener, java.lang.Object] */
    public void f() {
        if (c() && this.c != null) {
            ?? r0 = this.f.a;
            abfs abfsVar = (abfs) r0;
            if (abfsVar.e) {
                abfsVar.e = false;
                twb.a(abfsVar.a).removeAccessibilityStateChangeListener(r0);
            }
            awka.f((AtomicReference) this.c);
            this.c = null;
        }
        k(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener, java.lang.Object] */
    public void g() {
        if (c() && this.c == null) {
            ?? r0 = this.f.a;
            abfs abfsVar = (abfs) r0;
            if (!abfsVar.e) {
                abfsVar.e = true;
                Context context = abfsVar.a;
                int i = twb.a;
                ((AccessibilityManager) context.getSystemService("accessibility")).addAccessibilityStateChangeListener(r0);
                Boolean bool = abfsVar.c;
                aher aherVar = bool != null ? new aher(bool) : new aher(Boolean.FALSE);
                hvf hvfVar = new hvf(r0, 8);
                Executor executor = taf.a;
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                taa taaVar = new taa(hvfVar, null, taf.b);
                long j = afwl.a;
                aherVar.addListener(new ahei(aherVar, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
            }
            avlh avlhVarP = abfsVar.b.p();
            avmb avmbVar = avmh.a;
            JniZero.a(avmbVar);
            this.c = avlhVarP.L(avmbVar).al(new aawi(this, 19), new abeq(3));
            l();
        }
        k(true);
    }

    @Override // defpackage.tdh
    public final void gY() {
        this.a.b();
    }

    public final void j(abgi abgiVar) {
        abmt abmtVar = this.B;
        if (abmtVar == null || !abmtVar.g.l(495, 45837332L, false) || !this.H || abgiVar.a()) {
            if (abmtVar == null || !abmtVar.g.m(96, 45618144L)) {
                this.y.o(abgiVar);
            } else {
                if (abgiVar.equals(this.b)) {
                    return;
                }
                this.b = abgiVar;
                this.y.o(abgiVar);
            }
        }
    }

    public final void k(boolean z) {
        abmt abmtVar = this.B;
        if (abmtVar == null || !abmtVar.p.l(38, 45647048L, false)) {
            abga abgaVar = this.d;
            if (!z) {
                abgaVar.a();
            } else {
                abgaVar.a();
                abgaVar.b = abgaVar.c.z.scheduleAtFixedRate(abgaVar.a, 0L, 10L, TimeUnit.SECONDS);
            }
        }
    }

    public final void l() {
        if (c()) {
            ((abfs) this.f.a).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x013f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x014f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0153  */
    /* JADX WARN: Code duplicated, block: B:113:0x0156  */
    /* JADX WARN: Code duplicated, block: B:30:0x0049  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    public final void m() {
        boolean z;
        wjf wjfVar;
        aazj aazjVar = this.I;
        if (aazjVar != null) {
            boolean z2 = aazjVar.i && (wjfVar = aazjVar.b) != null && wjfVar.W();
            wjf wjfVar2 = this.I.b;
            if (wjfVar2 != null) {
                aoqd aoqdVar = wjfVar2.u().e;
                if (aoqdVar == null) {
                    aoqdVar = aoqd.a;
                }
                aopd aopdVar = aoqdVar.h;
                if (aopdVar == null) {
                    aopdVar = aopd.a;
                }
                if ((aopdVar.b & 8) != 0) {
                    aoqd aoqdVar2 = wjfVar2.u().e;
                    if (aoqdVar2 == null) {
                        aoqdVar2 = aoqd.a;
                    }
                    aopd aopdVar2 = aoqdVar2.h;
                    if (aopdVar2 == null) {
                        aopdVar2 = aopd.a;
                    }
                    z = (aopdVar2.b & 16) != 0;
                }
            }
            abob abobVar = this.J;
            abgg abggVar = null;
            if (abobVar != abob.d) {
                if (abobVar.h()) {
                    boolean z3 = this.C;
                    aazj aazjVar2 = this.I;
                    if (z3) {
                        abggVar = aazjVar2.h == null ? abgg.s : abgg.o;
                    } else if (q(aazjVar2)) {
                        abggVar = abgg.b;
                    } else {
                        abmt abmtVar = this.B;
                        if (abmtVar != null) {
                            String str = afxw.e(abmtVar.a).cD;
                            if (Objects.equals(str, "red")) {
                                abggVar = abgg.i;
                            } else if (Objects.equals(str, "gray")) {
                                abggVar = abgg.j;
                            } else if (Objects.equals(str, "hidden")) {
                                abggVar = abgg.k;
                            } else {
                                abggVar = abgg.h;
                            }
                        } else {
                            abggVar = abgg.h;
                        }
                    }
                } else if (this.J.c(abob.g)) {
                    if (!this.C) {
                        boolean zO = o();
                        abmt abmtVar2 = this.B;
                        if (zO) {
                            abggVar = (abmtVar2 == null || !abmtVar2.aH()) ? abgg.p : abgg.l;
                        } else if (abmtVar2 != null && abmtVar2.af() && this.T.isPresent()) {
                            abggVar = abgg.m;
                        } else {
                            wjf wjfVar3 = this.I.b;
                            if (wjfVar3 != null) {
                                alvw alvwVar = wjfVar3.u().g;
                                if (alvwVar == null) {
                                    alvwVar = alvw.a;
                                }
                                if ((alvwVar.b & SemanticState.Modal) != 0) {
                                    alvw alvwVar2 = wjfVar3.u().g;
                                    if (alvwVar2 == null) {
                                        alvwVar2 = alvw.a;
                                    }
                                    int iAS = a.aS(alvwVar2.j);
                                    if (iAS == 0 || iAS != 2) {
                                        alvw alvwVar3 = wjfVar3.u().g;
                                        if (alvwVar3 == null) {
                                            alvwVar3 = alvw.a;
                                        }
                                        int iAS2 = a.aS(alvwVar3.j);
                                        if (iAS2 == 0 || iAS2 != 3) {
                                            if (!this.I.i) {
                                                if (this.F) {
                                                    abggVar = abgg.c;
                                                } else {
                                                    abggVar = abgg.a;
                                                }
                                            } else if (this.F) {
                                                abggVar = abgg.c;
                                            } else {
                                                abggVar = abgg.a;
                                            }
                                        }
                                    }
                                    abggVar = abgg.t;
                                } else if (!this.I.i) {
                                    if (this.F) {
                                        abggVar = abgg.c;
                                    } else {
                                        abggVar = abgg.a;
                                    }
                                } else if (this.F) {
                                    abggVar = abgg.c;
                                } else {
                                    abggVar = abgg.a;
                                }
                            } else if (!this.I.i && !z) {
                                abggVar = z2 ? abgg.r : abgg.q;
                            } else if (this.F) {
                                abggVar = abgg.c;
                            } else {
                                abggVar = abgg.a;
                            }
                        }
                    } else if (this.I.i) {
                        abggVar = z2 ? abgg.g : abgg.f;
                    } else {
                        abggVar = this.F ? abgg.d : abgg.e;
                    }
                }
            }
            if (abggVar != null) {
                vxz vxzVar = this.e;
                if (vxzVar == null || (vxzVar.c(65, 45793111L, 0L) & 1) == 0 || !Objects.equals(abggVar, this.K)) {
                    this.K = abggVar;
                    this.y.w(abggVar);
                }
            }
        }
    }

    public final void n() {
        long jMin = Math.min(Math.max(this.P, this.Q), this.O);
        abmt abmtVar = this.B;
        if (abmtVar != null && abmtVar.aH() && o() && this.T.isPresent()) {
            this.y.Q(this.M - ((aaza) this.T.get()).f, 0L, ((aaza) this.T.get()).j.d(), jMin);
        } else {
            this.y.Q(this.M, this.N, this.O, jMin);
        }
    }

    public final boolean o() {
        wjf wjfVar = this.I.b;
        return wjfVar != null && wjfVar.f().aA() && this.T.isPresent();
    }

    public final /* bridge */ /* synthetic */ void p(Object obj) {
        this.y.s(ackj.k(null, (alay) obj, null, false));
    }

    @Override // defpackage.tdh
    public final void a() {
    }
}
