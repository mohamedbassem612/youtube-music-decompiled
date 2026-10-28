package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class jpm extends jpe {
    private static final int r(int i, float f) {
        float f2 = i;
        float f3 = f2 / 2.0f;
        return (int) (f3 + ((f2 - f3) * f));
    }

    @Override // defpackage.jpe, defpackage.jpy
    public final agkz a() {
        return jpn.f;
    }

    @Override // defpackage.jpe
    public final int d() {
        return this.a.at.getMeasuredWidth() / 2;
    }

    @Override // defpackage.jpe
    public final int e() {
        return super.e() - this.a.w();
    }

    @Override // defpackage.jpe, defpackage.jpy
    public final void j() {
        if (this.c.l(41, 45679250L, false)) {
            this.a.aK.F(true);
        }
    }

    @Override // defpackage.jpe, defpackage.jpy
    public final void k() {
        WatchWhileLayout watchWhileLayout = this.a;
        watchWhileLayout.aK.E = false;
        if (this.c.l(132, 45845054L, false)) {
            watchWhileLayout.ae.e(1.0f);
            watchWhileLayout.aJ.e = true;
        }
    }

    @Override // defpackage.jpe, defpackage.jpy
    public final void l(int i, int i2) {
        View view;
        WatchWhileLayout watchWhileLayout = this.a;
        kro.F(watchWhileLayout.ax, r(i, watchWhileLayout.bF), i2);
        int i3 = i / 2;
        kro.F(watchWhileLayout.ae, i3, i2);
        vxz vxzVar = this.c;
        if (vxzVar.l(132, 45845054L, false) && (view = watchWhileLayout.aH) != null) {
            kro.F(view, i3, i2);
        }
        watchWhileLayout.aK.Q(i2);
        watchWhileLayout.ae.setPadding(0, watchWhileLayout.x(), 0, 0);
        if (vxzVar.l(105, 45795183L, false)) {
            kro.F(watchWhileLayout.ay, 0, 0);
        }
        watchWhileLayout.bk = Math.max(0, Math.min(i2 - f(), i3 - (g() << 1)));
        int i4 = hwz.k(watchWhileLayout.bD) ? watchWhileLayout.bk : i3;
        watchWhileLayout.bj = i4;
        int i5 = (i3 - i4) / 2;
        if (watchWhileLayout.getLayoutDirection() != 1) {
            i3 = 0;
        }
        watchWhileLayout.bl = i3 + i5;
    }

    @Override // defpackage.jpe, defpackage.jpy
    public final void o() {
        WatchWhileLayout watchWhileLayout = this.a;
        ViewPager2 viewPager2 = (ViewPager2) watchWhileLayout.findViewById(watchWhileLayout.S);
        if (viewPager2 != null) {
            int measuredWidth = watchWhileLayout.getMeasuredWidth() / 2;
            kro.F(watchWhileLayout.az, measuredWidth, watchWhileLayout.aE.getMeasuredHeight());
            kro.G(watchWhileLayout.az, watchWhileLayout.getLayoutDirection() == 1 ? watchWhileLayout.getMeasuredWidth() - measuredWidth : 0, (int) watchWhileLayout.aE.getY());
            int measuredWidth2 = hwz.k(watchWhileLayout.bD) ? (measuredWidth - watchWhileLayout.aE.getMeasuredWidth()) / 2 : 0;
            if (viewPager2.c() instanceof jqv) {
                ((jqv) viewPager2.c()).z(measuredWidth2);
            }
        }
    }

    @Override // defpackage.jpe, defpackage.jpy
    public final void p(float f) {
        View view;
        super.p(f);
        WatchWhileLayout watchWhileLayout = this.a;
        watchWhileLayout.ae.setAlpha(1.0f - (Math.min(f, 0.25f) / 0.25f));
        int iR = r(watchWhileLayout.getMeasuredWidth(), f);
        kro.F(watchWhileLayout.ax, iR, watchWhileLayout.getMeasuredHeight());
        watchWhileLayout.ae.setTranslationX(watchWhileLayout.getLayoutDirection() == 1 ? -iR : iR);
        if (!this.c.l(132, 45845054L, false) || (view = watchWhileLayout.aH) == null) {
            return;
        }
        if (watchWhileLayout.getLayoutDirection() == 1) {
            iR = -iR;
        }
        view.setTranslationX(iR);
    }

    @Override // defpackage.jpe, defpackage.jpy
    public final boolean q() {
        return false;
    }
}
