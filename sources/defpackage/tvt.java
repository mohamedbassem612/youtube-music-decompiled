package defpackage;

import android.view.VelocityTracker;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tvt extends bdq {
    boolean a = false;
    int b = 0;
    final /* synthetic */ SwipeLayout c;

    public tvt(SwipeLayout swipeLayout) {
        this.c = swipeLayout;
    }

    @Override // defpackage.bdq
    public final int a(View view) {
        return this.c.d.getWidth();
    }

    @Override // defpackage.bdq
    public final void c(View view, int i) {
        this.a = true;
        this.b = view.getLeft();
        this.c.e().j();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        r4.p(r4.d.getWidth(), r6);
     */
    @Override // defpackage.bdq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.View r5, float r6, float r7) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvt.e(android.view.View, float, float):void");
    }

    @Override // defpackage.bdq
    public final boolean f(View view, int i) {
        return view == this.c.d;
    }

    @Override // defpackage.bdq
    public final int g(View view, int i) {
        boolean zS;
        boolean zV;
        SwipeLayout swipeLayout;
        VelocityTracker velocityTracker;
        int i2 = 0;
        if (view.getLeft() != 0 || (velocityTracker = (swipeLayout = this.c).e) == null || Math.abs(velocityTracker.getXVelocity()) >= swipeLayout.b) {
            SwipeLayout swipeLayout2 = this.c;
            if (swipeLayout2.t()) {
                zS = swipeLayout2.v();
                zV = swipeLayout2.s();
            } else {
                zS = swipeLayout2.s();
                zV = swipeLayout2.v();
            }
            int width = swipeLayout2.d.getWidth();
            int i3 = (zV || swipeLayout2.c) ? width : 0;
            i2 = (zS || swipeLayout2.c) ? -width : 0;
            if (i > i3) {
                return i3;
            }
            if (i >= i2) {
                return i;
            }
        }
        return i2;
    }

    @Override // defpackage.bdq
    public final void i(View view, int i, int i2, int i3) {
        if (this.a) {
            int i4 = this.b;
            this.b = i3 + i4;
            int i5 = 0;
            int i6 = 1;
            if (i > 0) {
                Optional optionalF = this.c.f();
                tvr tvrVar = new tvr(this, i4, i6);
                if (true == optionalF.isPresent()) {
                    ((jfk) optionalF.get()).a(tvrVar.a, ((tvt) tvrVar.b).b);
                }
            } else {
                SwipeLayout swipeLayout = this.c;
                if (i < 0) {
                    Optional optionalG = swipeLayout.g();
                    tvr tvrVar2 = new tvr(this, i4, i5);
                    if (true == optionalG.isPresent()) {
                        ((jfk) optionalG.get()).a(tvrVar2.a, ((tvt) tvrVar2.b).b);
                    }
                } else {
                    swipeLayout.j();
                }
            }
            SwipeLayout swipeLayout2 = this.c;
            int iA = swipeLayout2.a();
            int iB = swipeLayout2.b();
            int i7 = this.b;
            int iMin = i7 > 0 ? Math.min(iA, i7) : Math.max(-iB, i7);
            int i8 = this.b;
            int iMax = iMin + ((int) ((i8 > 0 ? Math.max(0, i8 - iA) : Math.min(0, i8 + iB)) * swipeLayout2.m));
            if (swipeLayout2.t()) {
                iMax = -iMax;
            }
            swipeLayout2.o(iMax);
            swipeLayout2.r();
        }
    }
}
