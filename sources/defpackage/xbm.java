package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xbm extends qa {
    final /* synthetic */ xbn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbm(xbn xbnVar) {
        super((byte[]) null);
        this.a = xbnVar;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        xbn xbnVar = this.a;
        if (recyclerView != xbnVar.q() || i2 >= 0) {
            return;
        }
        xbnVar.u(!xbnVar.g());
    }

    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) {
        xbn xbnVar = this.a;
        if (recyclerView != xbnVar.q()) {
            if (recyclerView == xbnVar.r()) {
                xbnVar.w();
                xbnVar.l = i;
                xbnVar.r.kk(Boolean.valueOf(i == 1));
                if (xbnVar.l == 1) {
                    xbnVar.k = false;
                    return;
                }
                if (xbnVar.A()) {
                    xbnVar.k = false;
                    return;
                } else if (xbnVar.k) {
                    xbnVar.f();
                    return;
                } else {
                    xbnVar.v(10000L);
                    return;
                }
            }
            return;
        }
        xbnVar.h = i;
        vxz vxzVar = xbnVar.v;
        if (vxzVar != null && vxzVar.m(10, 45747041L)) {
            int i2 = xbnVar.h;
            if (i2 != 0) {
                if (i2 == 1) {
                    xbnVar.g = false;
                }
            } else if (xbnVar.z()) {
                xbnVar.g = true;
            } else if (xbnVar.g) {
                xbnVar.a();
            }
        } else if (xbnVar.h == 1) {
            xbnVar.g = false;
        } else if (xbnVar.g && !xbnVar.z()) {
            xbnVar.a();
        } else if (xbnVar.z()) {
            xbnVar.g = true;
        }
        xbnVar.u(!xbnVar.g());
    }
}
