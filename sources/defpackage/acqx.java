package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.youtube.reel.internal.pager.ReelLinearLayoutManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acqx extends nf {
    final /* synthetic */ acqz b;

    public acqx(acqz acqzVar) {
        this.b = acqzVar;
    }

    @Override // defpackage.nf, defpackage.oq
    public final int a(np npVar, int i, int i2) {
        acqh acqhVar;
        int iZ;
        acqz acqzVar = this.b;
        acqzVar.R = super.a(npVar, i, i2);
        if (acqzVar.at.V() && acqzVar.P() && (acqhVar = acqzVar.ag) != null && (iZ = acqhVar.z()) != -1 && acqzVar.R >= iZ) {
            acqzVar.R = Math.max(0, iZ - 1);
        }
        return acqzVar.R;
    }

    @Override // defpackage.nf, defpackage.oq
    public final View b(np npVar) {
        if (npVar.getChildCount() > 0) {
            acqz acqzVar = this.b;
            if (acqzVar.Q()) {
                acqh acqhVar = acqzVar.ag;
                int iZ = acqhVar == null ? -1 : acqhVar.z();
                View view = null;
                if (iZ != -1 && acqzVar.Q >= iZ && (!acqzVar.at.V() || !acqzVar.P())) {
                    for (int i = 0; i < npVar.getChildCount(); i++) {
                        View childAt = npVar.getChildAt(i);
                        if (childAt != null) {
                            int i2 = acrp.x;
                            Object tag = childAt.getTag();
                            acrp acrpVar = tag instanceof acrp ? (acrp) tag : null;
                            if ((acrpVar instanceof acpz) && !((acpz) acrpVar).s) {
                                acqzVar.l.hB().l(new xgj(xhb.b(175531)));
                                acrn acrnVar = acqzVar.b;
                                if (acrnVar.o.compareAndSet(false, true)) {
                                    acrnVar.h(acrt.CRITICAL);
                                }
                                if (!acrnVar.i(new acqw(this))) {
                                    break;
                                }
                                view = childAt;
                                break;
                            }
                        }
                    }
                }
                if (view != null) {
                    return view;
                }
            }
        }
        return super.b(npVar);
    }

    @Override // defpackage.nf, defpackage.oq
    public final od d(np npVar) {
        acqz acqzVar = this.b;
        hno hnoVar = acqzVar.at;
        if (!hnoVar.be() || acqzVar.z == null || (!hnoVar.aU() && (!hnoVar.aV() || hnoVar.c() <= 0.0f))) {
            return super.d(npVar);
        }
        Context context = acqzVar.y.getContext();
        ReelLinearLayoutManager reelLinearLayoutManager = acqzVar.z;
        return new acqv(this, context, hnoVar, reelLinearLayoutManager.a, reelLinearLayoutManager.b);
    }

    @Override // defpackage.oq, defpackage.ns
    public final boolean e(int i, int i2) {
        acqz acqzVar = this.b;
        apdq apdqVar = ((vxu) acqzVar.at.p).c().w;
        if (apdqVar == null) {
            apdqVar = apdq.a;
        }
        double d = apdqVar.f;
        if (ahbd.c(d, 0.0d, 0.05d) || ahbd.c(d, 1.0d, 0.05d)) {
            return super.e(i, i2);
        }
        int iMax = acqzVar.y.I;
        if (ahbd.c(d, -1.0d, 0.05d)) {
            if (i2 < 0) {
                iMax = -iMax;
            }
        } else if (i2 >= 0) {
            iMax = Math.min((int) (d * ((double) i2)), iMax);
        } else {
            iMax = Math.max((int) (d * ((double) i2)), -iMax);
        }
        return super.e(i, iMax);
    }

    public final void j() {
        acqz acqzVar = this.b;
        if (acqzVar.Q >= 0) {
            acqzVar.j.execute(afwl.i(new acqu(this, 0)));
        }
    }
}
