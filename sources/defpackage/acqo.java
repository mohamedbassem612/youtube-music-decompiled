package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.reel.internal.pager.ReelLinearLayoutManager;
import com.google.android.libraries.youtube.reel.internal.pager.ReelRecyclerView;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acqo extends qa {
    final /* synthetic */ acqz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acqo(acqz acqzVar) {
        super((byte[]) null);
        this.a = acqzVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001e A[PHI: r3
      0x001e: PHI (r3v2 int) = (r3v0 int), (r3v3 int) binds: [B:12:0x0017, B:14:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        acqz acqzVar = this.a;
        aeqq aeqqVar = acqzVar.ac;
        if (aeqqVar != null && aeqqVar.b) {
            aeqqVar.e();
        }
        if (acqzVar.B != null) {
            if (aeqqVar != null && aeqqVar.b) {
                if (i == 0) {
                    i = 0;
                    if (i2 == 0) {
                        i2 = 0;
                    } else {
                        aeqqVar.g = true;
                        aeqqVar.d();
                    }
                } else {
                    aeqqVar.g = true;
                    aeqqVar.d();
                }
            }
            acvq acvqVar = acqzVar.B;
            acvqVar.l();
            acqzVar.D(((View) acvqVar).getScrollX() + i);
            acvq acvqVar2 = acqzVar.B;
            acvqVar2.l();
            acqzVar.E(((View) acvqVar2).getScrollY() + i2);
        }
    }

    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) throws Throwable {
        acqh acqhVar;
        int iFindFirstVisibleItemPosition;
        int i2;
        acqh acqhVar2;
        acra acraVarL;
        ajwo ajwoVar;
        int i3;
        if (i == 0) {
            this.a.k.c();
        } else if (i == 1) {
            abvx abvxVar = this.a.k;
            if (abvxVar.d.u()) {
                abvxVar.a.a();
            }
        }
        acqz acqzVar = this.a;
        trt trtVar = acqzVar.af;
        if (trtVar != null && trtVar.b && (i3 = trtVar.c) != i) {
            String strA = trt.a(i3);
            if (strA != null) {
                tsv.e(trtVar.a, Ctry.SCROLL_STATE, strA);
            }
            String strA2 = trt.a(i);
            if (strA2 != null) {
                tsv.d(trtVar.a, Ctry.SCROLL_STATE, strA2);
            }
            trtVar.c = i;
        }
        hno hnoVar = acqzVar.at;
        if (hnoVar.aT() && acqzVar.G == 2 && i == 1) {
            acqzVar.X.set(true);
        }
        acqzVar.G = i;
        if (i == 0) {
            aeqq aeqqVar = acqzVar.ac;
            if (aeqqVar != null && aeqqVar.b) {
                aeqqVar.e();
            }
            acqzVar.K = acqzVar.i.f().toEpochMilli();
            acqzVar.R = -1;
            ReelRecyclerView reelRecyclerView = acqzVar.y;
            if (reelRecyclerView != null) {
                reelRecyclerView.aL(false);
            }
            if (acqzVar.H) {
                acqzVar.H = false;
                acqzVar.D(0);
                acqzVar.E(0);
                acqzVar.z(false);
            } else {
                ReelLinearLayoutManager reelLinearLayoutManager = acqzVar.z;
                int iFindFirstCompletelyVisibleItemPosition = reelLinearLayoutManager != null ? reelLinearLayoutManager.findFirstCompletelyVisibleItemPosition() : -1;
                if (iFindFirstCompletelyVisibleItemPosition == -1) {
                    if (hnoVar != null && ((vxz) hnoVar.i).l(241, 45795002L, false)) {
                        acqzVar.p(acqj.a);
                    }
                    iFindFirstCompletelyVisibleItemPosition = -1;
                }
                if (iFindFirstCompletelyVisibleItemPosition != -1) {
                    if (iFindFirstCompletelyVisibleItemPosition != acqzVar.Q && (acqhVar = acqzVar.ag) != null && !acqzVar.E.isEmpty()) {
                        Object obj = ((aciz) acqzVar.E.get()).b;
                        if (acqhVar.L(iFindFirstCompletelyVisibleItemPosition) == null) {
                            int iZ = acqhVar.z();
                            if (iZ != -1 && iZ == iFindFirstCompletelyVisibleItemPosition) {
                                acqzVar.v(((acra) obj).f);
                            }
                        } else if (acqhVar.E(iFindFirstCompletelyVisibleItemPosition) > acqzVar.M) {
                            acqzVar.v(((acra) obj).f);
                        }
                    }
                    acqzVar.C(iFindFirstCompletelyVisibleItemPosition);
                    acqzVar.n(false);
                }
            }
            acqzVar.q();
            if (acqzVar.U.isPresent()) {
                Object obj2 = ((aciz) acqzVar.F.get()).b;
                new AtomicBoolean(true);
                long jC = acqzVar.c();
                acqh acqhVar3 = acqzVar.ag;
                if (acqhVar3 != null) {
                    acqzVar.p(acqj.b);
                    acqhVar3.Y(((acra) obj2).q, 11);
                    int iA = acqhVar3.A(jC);
                    if (iA != -1) {
                        acqzVar.Q = iA;
                    }
                }
                acqzVar.U = Optional.empty();
            }
            ReelLinearLayoutManager reelLinearLayoutManager2 = acqzVar.z;
            if (reelLinearLayoutManager2 != null && (iFindFirstVisibleItemPosition = reelLinearLayoutManager2.findFirstVisibleItemPosition()) != (i2 = acqzVar.Q) && !acqzVar.M()) {
                acqzVar.g.d(9, a.bQ(i2, iFindFirstVisibleItemPosition, "Idle State: Visible page does not match intended page. First visible position: ", ", Desired position: "));
            }
            acqzVar.I = false;
            acqzVar.X.set(false);
            acqzVar.Y.b();
        } else if (i != 1) {
            int position = acqzVar.R;
            if (position != -1) {
                acqzVar.V = true;
            } else {
                acqzVar.V = false;
                acqx acqxVar = acqzVar.x;
                acqz acqzVar2 = acqxVar.b;
                View viewB = acqxVar.b(acqzVar2.z);
                position = viewB != null ? acqzVar2.z.getPosition(viewB) : -1;
            }
            szs szsVar = acqzVar.Y;
            szsVar.a();
            acqzVar.q.b();
            if (hnoVar.aT()) {
                long jE = acqzVar.ag.E(position);
                long j = acqzVar.M;
                AtomicBoolean atomicBoolean = acqzVar.X;
                if (atomicBoolean.get() && jE != j) {
                    if (acqzVar.H) {
                        acqzVar.L = acqzVar.i.f().toEpochMilli();
                        acqzVar.z(true);
                        acqzVar.q();
                        acqzVar.H = false;
                        acqzVar.I = false;
                    }
                    szsVar.b();
                    atomicBoolean.set(false);
                }
            }
            acqzVar.J = acqzVar.i.f().toEpochMilli();
            aenu aenuVar = (aenu) acqzVar.ae.io();
            if (aenuVar != null && aenuVar.l() && (acqhVar2 = acqzVar.ag) != null && position != -1 && (acraVarL = acqhVar2.L(position)) != null && (ajwoVar = acraVarL.f) != null) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    apfp apfpVarC = acraVarL.c();
                    if ((apfpVarC.d & 262144) != 0) {
                        aihf aihfVarCreateBuilder = aoar.a.createBuilder();
                        String str = apfpVarC.U;
                        aihfVarCreateBuilder.copyOnWrite();
                        aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
                        str.getClass();
                        aoarVar.b |= SemanticState.ReadOnly;
                        aoarVar.k = str;
                        aenuVar.e(aewo.u(41, null, (aoar) aihfVarCreateBuilder.build(), ajwoVar, 3), Long.valueOf(acqzVar.J));
                    }
                }
            }
            if (acqzVar.V && acqzVar.y != null) {
                vxu vxuVar = (vxu) hnoVar.p;
                apdq apdqVar = vxuVar.c().w;
                if (apdqVar == null) {
                    apdqVar = apdq.a;
                }
                if ((apdqVar.b & SemanticState.Multiline) == 0) {
                    apdq apdqVar2 = vxuVar.c().w;
                    if (apdqVar2 == null) {
                        apdqVar2 = apdq.a;
                    }
                    if ((apdqVar2.b & 16384) != 0) {
                        acqzVar.z.scrollToPosition(acqzVar.R);
                    } else if (hnoVar.aU() && !hnoVar.be()) {
                        acqzVar.z.smoothScrollToPosition(acqzVar.y, new oe(), acqzVar.R);
                    }
                }
            }
            if (o(position)) {
                acqzVar.y.aL(acqzVar.T());
                acra acraVar = (acra) acqzVar.j().orElse(null);
                acrp acrpVar = acraVar != null ? acraVar.i : null;
                if (acrpVar == null || !acrpVar.F() || acrpVar.H() == null || acrpVar.J().isEmpty()) {
                    m(position);
                } else {
                    Object obj3 = acrpVar.J().get();
                    acvv acvvVarH = acrpVar.H();
                    if (acvvVarH != null) {
                        acvvVarH.b();
                    }
                    ((acph) obj3).f();
                    m(position);
                }
            }
            Iterable$EL.forEach(acqzVar.o, new tso(this, position, 5));
        } else {
            szs szsVar2 = acqzVar.Y;
            if (szsVar2 != null) {
                szsVar2.a();
            }
            ijt ijtVar = acqzVar.aq;
            if (ijtVar != null) {
                ijtVar.b();
            }
        }
        Iterator it = acqzVar.o.iterator();
        while (it.hasNext()) {
            ((acqt) it.next()).S(i);
        }
        acqzVar.s = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(int i) throws Throwable {
        acqz acqzVar = this.a;
        acqzVar.H = true;
        acqzVar.C(i);
        acqzVar.n(true);
        Object obj = acqzVar.B;
        if (obj != null) {
            if (acqzVar.D) {
                int scrollY = ((View) obj).getScrollY();
                acvq acvqVar = acqzVar.B;
                acvqVar.l();
                int height = ((View) acvqVar).getHeight();
                if (acqzVar.P) {
                    acqzVar.E(scrollY - height);
                    return;
                } else {
                    acqzVar.E(scrollY + height);
                    return;
                }
            }
            int scrollX = ((View) obj).getScrollX();
            acvq acvqVar2 = acqzVar.B;
            acvqVar2.l();
            int width = ((View) acvqVar2).getWidth();
            if (acqzVar.P) {
                acqzVar.D(scrollX - width);
            } else {
                acqzVar.D(scrollX + width);
            }
        }
    }

    public final boolean o(int i) {
        agfr agfrVar;
        acqz acqzVar = this.a;
        acqh acqhVar = acqzVar.ag;
        if (acqhVar == null || (agfrVar = acqzVar.c) == null) {
            return false;
        }
        acra acraVarL = acqhVar.L(i);
        long j = acraVarL != null ? acraVarL.b : Long.MIN_VALUE;
        long j2 = acqzVar.M;
        if (i == -1 || j < 0 || j == j2) {
            return false;
        }
        hno hnoVar = acqzVar.at;
        if ((hnoVar != null && ((vxz) hnoVar.m).l(84, 45783269L, false) && acraVarL.m() && aecm.ao(acraVarL.c())) || agfrVar.io() == null) {
            return false;
        }
        int iBt = a.bt(((apeq) agfrVar.io()).e);
        if (iBt == 0) {
            iBt = 1;
        }
        int i2 = iBt - 1;
        if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                if (j <= acqzVar.M) {
                    return false;
                }
            } else if (i2 != 5) {
                return false;
            }
        }
        return true;
    }
}
