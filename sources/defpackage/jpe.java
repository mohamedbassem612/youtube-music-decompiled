package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.watchpage.ui.PlayerBottomSheet;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jpe implements jpy {
    private static final Paint d;
    private static final agkj e;
    private static final agkj f;
    protected final WatchWhileLayout a;
    protected final aunn b;
    protected final vxz c;
    private final int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    static {
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        d = paint;
        e = agkj.o(hww.a, 5, hww.b, 4, hww.c, 3, hww.d, 3, hww.e, 3, hww.h, 3);
        f = agkj.o(hww.a, 4, hww.b, 4, hww.c, 4, hww.d, 6, hww.e, 3, hww.h, 4);
    }

    public jpe(WatchWhileLayout watchWhileLayout, vxz vxzVar) {
        this.a = watchWhileLayout;
        this.c = vxzVar;
        this.b = watchWhileLayout.n;
        this.g = tzk.i(watchWhileLayout.getContext(), R.attr.playerPageDefaultBackgroundColor);
    }

    private final int A() {
        if (this.c.l(105, 45795183L, false)) {
            return this.a.bb;
        }
        return 0;
    }

    private final int B() {
        return this.a.aD.getMeasuredHeight();
    }

    private final int C() {
        boolean zL = this.c.l(118, 45823962L, false);
        WatchWhileLayout watchWhileLayout = this.a;
        return zL ? watchWhileLayout.bi : watchWhileLayout.bh;
    }

    private final jpd D() {
        int i;
        int iD;
        float f2;
        float f3;
        float f4;
        WatchWhileLayout watchWhileLayout = this.a;
        int i2 = watchWhileLayout.bk;
        float f5 = watchWhileLayout.bm;
        if (watchWhileLayout.bx) {
            f2 = 0.0f;
            f3 = 0.0f;
            f4 = f5;
            i = i2;
            iD = d();
        } else {
            vxz vxzVar = this.c;
            float fJ = vxzVar.l(95, 45762151L, false) ? ((kwq) this.b.io()).j() : 0.0f;
            float f6 = watchWhileLayout.bj;
            float fD = d();
            float f7 = watchWhileLayout.bk;
            int measuredHeight = watchWhileLayout.at.getMeasuredHeight();
            if (J()) {
                measuredHeight = Math.max(d(), (int) (measuredHeight * (vxzVar.c(7, 45818042L, 100L) / 100.0f)));
            }
            float f8 = f6 + ((fD - f6) * fJ);
            float f9 = f7 + ((measuredHeight - f7) * fJ);
            float f10 = watchWhileLayout.bl;
            float f11 = (-f10) * fJ;
            float f12 = watchWhileLayout.bm;
            float f13 = (-f12) * fJ;
            float f14 = watchWhileLayout.bf;
            float f15 = (int) (f14 + ((-f14) * fJ));
            float f16 = (int) (f12 + f13);
            float f17 = (int) (f10 + f11);
            i = (int) f9;
            iD = (int) f8;
            f2 = f17;
            f3 = f15;
            f4 = f16;
        }
        return new jpd(iD, i, f2, f4, f3);
    }

    private final void E() {
        WatchWhileLayout watchWhileLayout = this.a;
        float fJ = 0.0f;
        if (!watchWhileLayout.bx && this.c.l(95, 45762151L, false) && watchWhileLayout.bE.b(hww.i, hww.c, hww.j, hww.k)) {
            fJ = ((kwq) this.b.io()).j();
        }
        watchWhileLayout.J(fJ);
    }

    private final void F(int[] iArr) {
        WatchWhileLayout watchWhileLayout = this.a;
        watchWhileLayout.an.setBackground(watchWhileLayout.getLayoutDirection() == 1 ? new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, iArr) : new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, iArr));
    }

    private final void G(int i, int i2) {
        WatchWhileLayout watchWhileLayout = this.a;
        watchWhileLayout.bk = i;
        int i3 = hwz.k(watchWhileLayout.bD) ? watchWhileLayout.bk : i2;
        watchWhileLayout.bj = i3;
        watchWhileLayout.bl = (i2 - i3) / 2;
    }

    private final void H(jpd jpdVar, jpd jpdVar2, float f2) {
        float f3 = jpdVar2.b;
        float f4 = jpdVar2.a;
        WatchWhileLayout watchWhileLayout = this.a;
        CardView cardView = watchWhileLayout.aE;
        float f5 = jpdVar.b;
        float f6 = f5 + ((f3 - f5) * f2);
        float f7 = jpdVar.a;
        kro.F(cardView, (int) (f7 + ((f4 - f7) * f2)), (int) f6);
        float f8 = jpdVar2.d;
        float f9 = jpdVar2.c;
        CardView cardView2 = watchWhileLayout.aE;
        float f10 = jpdVar.d;
        float f11 = f10 + ((f8 - f10) * f2);
        float f12 = jpdVar.c;
        kro.G(cardView2, (int) (f12 + ((f9 - f12) * f2)), (int) f11);
        if (hwz.k(watchWhileLayout.bD) && !watchWhileLayout.bx) {
            float f13 = jpdVar2.e;
            float f14 = jpdVar.e;
            watchWhileLayout.aE.b((int) (f14 + ((f13 - f14) * f2)));
        } else if (this.c.l(118, 45823962L, false) && watchWhileLayout.bE.b(hww.b, hww.l)) {
            watchWhileLayout.aE.b(C());
        } else {
            watchWhileLayout.aE.b(0.0f);
        }
    }

    private final boolean I() {
        if (!this.c.l(41, 45679250L, false)) {
            return false;
        }
        WatchWhileLayout watchWhileLayout = this.a;
        return watchWhileLayout.bE.b(hww.j, hww.d) || (watchWhileLayout.X() && watchWhileLayout.bE.b(hww.k, hww.g));
    }

    private final boolean J() {
        vxz vxzVar = this.c;
        return vxzVar.c(7, 45818042L, 100L) > 0 && vxzVar.c(7, 45818042L, 100L) < 100;
    }

    private final float r() {
        WatchWhileLayout watchWhileLayout = this.a;
        return Math.min(1.0f, watchWhileLayout.bF / watchWhileLayout.q());
    }

    private final int s() {
        boolean zL = this.c.l(80, 45739163L, false);
        WatchWhileLayout watchWhileLayout = this.a;
        return zL ? watchWhileLayout.aZ : watchWhileLayout.aY;
    }

    private final int t() {
        boolean zL = this.c.l(80, 45739163L, false);
        WatchWhileLayout watchWhileLayout = this.a;
        return zL ? watchWhileLayout.be : watchWhileLayout.bd;
    }

    private final int u() {
        boolean zL = this.c.l(80, 45739163L, false);
        WatchWhileLayout watchWhileLayout = this.a;
        return zL ? watchWhileLayout.bo : watchWhileLayout.bn;
    }

    private final int v() {
        boolean zL = this.c.l(80, 45739163L, false);
        WatchWhileLayout watchWhileLayout = this.a;
        return zL ? watchWhileLayout.bq : watchWhileLayout.bp;
    }

    private final int w(int i) {
        return I() ? (int) (i * (1.0f - r())) : i;
    }

    private final int x() {
        WatchWhileLayout watchWhileLayout = this.a;
        if (watchWhileLayout.af.getVisibility() != 8) {
            return watchWhileLayout.af.getMeasuredHeight();
        }
        return 0;
    }

    private final int y() {
        boolean zI = I();
        WatchWhileLayout watchWhileLayout = this.a;
        if (!zI) {
            return watchWhileLayout.bk;
        }
        if (watchWhileLayout.bF > watchWhileLayout.q()) {
            float f2 = this.h;
            return (int) (f2 + ((watchWhileLayout.aN - f2) * watchWhileLayout.r(watchWhileLayout.bF)));
        }
        float f3 = watchWhileLayout.bk;
        return (int) (f3 + ((this.h - f3) * r()));
    }

    private final int z() {
        return u() + t();
    }

    @Override // defpackage.jpy
    public agkz a() {
        return jpn.c;
    }

    final float b(float f2, float f3) {
        return 1.0f - (Math.min(Math.max(0.0f, f2 - this.a.q()), f3) / f3);
    }

    public final int c() {
        return e() + v() + u() + t() + this.a.ba + s();
    }

    public int d() {
        return this.a.at.getMeasuredWidth();
    }

    public int e() {
        WatchWhileLayout watchWhileLayout = this.a;
        return watchWhileLayout.x() + watchWhileLayout.aA.getMeasuredHeight() + watchWhileLayout.aC.getMeasuredHeight() + B() + watchWhileLayout.ar.getMeasuredHeight() + watchWhileLayout.w() + watchWhileLayout.bu;
    }

    public final int f() {
        return this.c.l(80, 45739163L, false) ? c() : e();
    }

    protected final int g() {
        boolean zL = this.c.l(42, 45681452L, false);
        WatchWhileLayout watchWhileLayout = this.a;
        return zL ? watchWhileLayout.bc : watchWhileLayout.aL;
    }

    @Override // defpackage.jpy
    public final agkj h() {
        if (!this.c.l(40, 45677954L, false)) {
            return f;
        }
        agkh agkhVar = new agkh(4);
        agkhVar.i(f);
        agkhVar.e(hww.f, 4);
        return agkhVar.d(true);
    }

    @Override // defpackage.jpy
    public final agkj i() {
        return e;
    }

    @Override // defpackage.jpy
    public void j() {
        if (this.c.l(41, 45679250L, false)) {
            WatchWhileLayout watchWhileLayout = this.a;
            watchWhileLayout.aK.E(watchWhileLayout.v());
            watchWhileLayout.aK.F(false);
        }
    }

    @Override // defpackage.jpy
    public void k() {
        WatchWhileLayout watchWhileLayout = this.a;
        watchWhileLayout.ae.setTranslationX(0.0f);
        watchWhileLayout.ae.setAlpha(1.0f);
        watchWhileLayout.aK.E = true;
        if (this.c.l(132, 45845054L, false)) {
            PlayerBottomSheet playerBottomSheet = watchWhileLayout.ae;
            if (playerBottomSheet != null) {
                playerBottomSheet.e(1.0f);
            }
            View view = watchWhileLayout.aH;
            if (view != null) {
                view.setTranslationX(0.0f);
                kro.F(watchWhileLayout.aH, -1, -1);
            }
            watchWhileLayout.aJ.e = false;
        }
    }

    @Override // defpackage.jpy
    public void l(int i, int i2) {
        int iX;
        int top;
        float fX;
        WatchWhileLayout watchWhileLayout = this.a;
        kro.F(watchWhileLayout.ax, i, i2);
        vxz vxzVar = this.c;
        PlayerBottomSheet playerBottomSheet = watchWhileLayout.ae;
        if (vxzVar.l(41, 45679250L, false)) {
            if (watchWhileLayout.bF > watchWhileLayout.q()) {
                float fU = watchWhileLayout.aK.u();
                fX = fU + ((((i2 - watchWhileLayout.x()) - watchWhileLayout.ai.getMeasuredHeight()) - fU) * watchWhileLayout.bF);
            } else {
                fX = i2 * 0.42f;
            }
            iX = (int) fX;
        } else {
            iX = (i2 - watchWhileLayout.x()) - watchWhileLayout.ai.getMeasuredHeight();
        }
        kro.F(playerBottomSheet, i, iX);
        watchWhileLayout.ae.setPadding(0, 0, 0, 0);
        if (vxzVar.l(41, 45679250L, false)) {
            View view = watchWhileLayout.ay;
            if (vxzVar.l(105, 45795183L, false) && watchWhileLayout.bE.a()) {
                top = watchWhileLayout.bI + watchWhileLayout.x();
            } else {
                top = watchWhileLayout.bE.b(hww.c, hww.d) ? watchWhileLayout.ae.getTop() : 0;
            }
            kro.F(view, i, top);
        }
        G(Math.max(0, Math.min(i2 - f(), i - (g() << 1))), i);
        int i3 = watchWhileLayout.bk;
        this.h = i3;
        this.i = i3;
        this.j = i3;
    }

    @Override // defpackage.jpy
    public final void m(int i) {
        float f2;
        int y;
        vxz vxzVar = this.c;
        boolean zL = vxzVar.l(118, 45823962L, false);
        WatchWhileLayout watchWhileLayout = this.a;
        if (zL) {
            watchWhileLayout.aW = watchWhileLayout.ai.getX() + watchWhileLayout.ak.getX() + watchWhileLayout.ap.getX();
            watchWhileLayout.aX = watchWhileLayout.ai.getY() + watchWhileLayout.ak.getY() + watchWhileLayout.ap.getY();
        } else {
            watchWhileLayout.aW = watchWhileLayout.ap.getX() + watchWhileLayout.ak.getX();
            watchWhileLayout.aX = watchWhileLayout.ap.getY();
        }
        int iE = i - e();
        WatchWhileLayout watchWhileLayout2 = this.a;
        int iMax = Math.max(0, iE - watchWhileLayout2.bk);
        int iC = c() - e();
        if (vxzVar.l(80, 45739163L, false)) {
            f2 = 1.0f;
        } else {
            f2 = iC != 0 ? iMax / iC : 0.0f;
        }
        int iMax2 = Math.max(0, iMax - ((int) (iC * f2)));
        if (vxzVar.l(41, 45679250L, false)) {
            float f3 = i * 0.58000004f;
            this.h = Math.max(0, (int) ((f3 - ((((watchWhileLayout2.x() + watchWhileLayout2.aA.getMeasuredHeight()) + watchWhileLayout2.aC.getMeasuredHeight()) + watchWhileLayout2.ar.getMeasuredHeight()) + A())) - ((v() + z()) * f2)));
            this.i = Math.max(0, (int) ((f3 - (((watchWhileLayout2.x() + watchWhileLayout2.aC.getMeasuredHeight()) + watchWhileLayout2.ar.getMeasuredHeight()) + A())) - (z() * f2)));
            this.j = this.h;
        }
        int i2 = iMax2 / 2;
        int measuredHeight = watchWhileLayout2.aA.getMeasuredHeight() + w(i2);
        int iV = (int) (v() * f2);
        int iX = watchWhileLayout2.x() + measuredHeight + iV;
        watchWhileLayout2.bm = iX;
        this.l = iX;
        if (true == vxzVar.l(85, 45746502L, false)) {
            iX = 0;
        }
        this.k = iX;
        if (vxzVar.l(41, 45679250L, false) && watchWhileLayout2.af()) {
            measuredHeight = Math.max(watchWhileLayout2.aA.getMeasuredHeight(), measuredHeight);
        }
        int iY = ((measuredHeight + y()) + iV) - x();
        int iU = (int) (u() * f2);
        if (x() > 0) {
            int i3 = watchWhileLayout2.bm - ((iV + iMax2) / 2);
            watchWhileLayout2.bm = i3;
            G(Math.min(watchWhileLayout2.bk, Math.max(0, (((watchWhileLayout2.x() + iY) + (iU / 2)) - i3) + (vxzVar.l(41, 45679250L, false) ? watchWhileLayout2.bk - y() : 0))), d());
        }
        int i4 = iU / 2;
        int i5 = iY + i4;
        kro.G(watchWhileLayout2.af, 0, i5);
        int iX2 = i5 + x();
        if (vxzVar.l(80, 45739163L, false)) {
            iX2 += w(i2);
        }
        int i6 = iX2 + i4;
        kro.G(watchWhileLayout2.aC, 0, i6);
        if (vxzVar.l(42, 45681452L, false)) {
            View view = watchWhileLayout2.aC;
            int i7 = watchWhileLayout2.bc;
            if (view.getPaddingStart() != i7 || view.getPaddingEnd() != i7) {
                int paddingTop = view.getPaddingTop();
                int paddingBottom = view.getPaddingBottom();
                if (view.getPaddingStart() != i7 || view.getPaddingEnd() != i7 || view.getPaddingTop() != paddingTop || view.getPaddingBottom() != paddingBottom) {
                    view.setPaddingRelative(i7, paddingTop, i7, paddingBottom);
                }
            }
        }
        int measuredHeight2 = i6 + watchWhileLayout2.aC.getMeasuredHeight() + ((int) (t() * f2));
        kro.G(watchWhileLayout2.aD, 0, measuredHeight2);
        int iB = B() + ((int) (watchWhileLayout2.ba * f2));
        if (I()) {
            iB = (int) (iB * (1.0f - r()));
        }
        int i8 = measuredHeight2 + iB;
        kro.G(watchWhileLayout2.ar, 0, i8);
        int measuredHeight3 = i8 + watchWhileLayout2.ar.getMeasuredHeight();
        float fS = s() * f2;
        if (!vxzVar.l(41, 45679250L, false)) {
            View view2 = watchWhileLayout2.ah;
            int measuredWidth = (watchWhileLayout2.ar.getMeasuredWidth() - watchWhileLayout2.ah.getMeasuredWidth()) / 2;
            if (true == vxzVar.l(80, 45739163L, false)) {
                iMax2 = 0;
            }
            kro.G(view2, measuredWidth, measuredHeight3 + ((((((int) fS) + iMax2) / 2) - watchWhileLayout2.ah.getMeasuredHeight()) / 2));
        }
        if (vxzVar.l(85, 45746502L, false)) {
            kro.F(watchWhileLayout2.aw, -1, watchWhileLayout2.x() + watchWhileLayout2.aA.getMeasuredHeight() + (vxzVar.l(95, 45762151L, false) ? watchWhileLayout2.br : v()));
            int iX3 = watchWhileLayout2.x();
            if (vxzVar.l(95, 45762151L, false)) {
                int y2 = (int) watchWhileLayout2.aC.getY();
                y = J() ? Math.max(0, Math.min(y2, (int) (watchWhileLayout2.aE.getY() + watchWhileLayout2.aE.getMeasuredHeight())) - watchWhileLayout2.bs) : Math.max(0, y2 - watchWhileLayout2.br);
            } else {
                y = (int) (watchWhileLayout2.aC.getY() * 0.75f);
            }
            kro.F(watchWhileLayout2.au, -1, watchWhileLayout2.at.getMeasuredHeight() - (iX3 + y));
        }
    }

    @Override // defpackage.jpy
    public final void n() {
        int color;
        WatchWhileLayout watchWhileLayout = this.a;
        if (((ViewPager2) watchWhileLayout.findViewById(watchWhileLayout.C)) != null) {
            kro.F(watchWhileLayout.am, watchWhileLayout.ak.getWidth(), watchWhileLayout.ak.getHeight());
            kro.G(watchWhileLayout.am, (int) watchWhileLayout.ak.getX(), (int) watchWhileLayout.ak.getY());
            if (this.c.l(118, 45823962L, false)) {
                if (watchWhileLayout.an.getBackground() == null) {
                    watchWhileLayout.am.setLayerType(2, null);
                    watchWhileLayout.an.setLayerType(2, d);
                    F(new int[]{0, this.g});
                    return;
                }
                return;
            }
            if (watchWhileLayout.aj()) {
                color = watchWhileLayout.bE.b(hww.b) ? this.g : 0;
            } else {
                ColorDrawable colorDrawable = (ColorDrawable) watchWhileLayout.as.getBackground();
                color = colorDrawable != null ? colorDrawable.getColor() : this.g;
            }
            F(new int[]{0, color});
        }
    }

    @Override // defpackage.jpy
    public void o() {
        WatchWhileLayout watchWhileLayout = this.a;
        ViewPager2 viewPager2 = (ViewPager2) watchWhileLayout.findViewById(watchWhileLayout.S);
        if (viewPager2 != null) {
            kro.F(watchWhileLayout.az, -1, watchWhileLayout.aE.getMeasuredHeight());
            kro.G(watchWhileLayout.az, 0, (int) watchWhileLayout.aE.getY());
            int measuredWidth = hwz.k(watchWhileLayout.bD) ? (watchWhileLayout.getMeasuredWidth() - watchWhileLayout.aE.getMeasuredWidth()) / 2 : 0;
            if (viewPager2.c() instanceof jqv) {
                ((jqv) viewPager2.c()).z(measuredWidth);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:102:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:105:0x031b  */
    /* JADX WARN: Code duplicated, block: B:107:0x032b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0336  */
    /* JADX WARN: Code duplicated, block: B:111:0x033b  */
    @Override // defpackage.jpy
    public void p(float f2) {
        float fB;
        float fMax;
        float fMin;
        float f3;
        float fMax2;
        float f4;
        float fMin2;
        View viewFindViewById;
        float f5;
        float fMin3;
        int iMax;
        float f6;
        Drawable background;
        int i;
        int i2;
        float f7;
        float f8;
        int i3;
        int i4;
        float f9;
        float f10;
        float f11;
        float f12;
        jpd jpdVar;
        jpd jpdVar2;
        float fQ;
        float fZ;
        float fJ;
        aunn aunnVar;
        float fMax3 = f2;
        WatchWhileLayout watchWhileLayout = this.a;
        int i5 = 4;
        if (yno.H(watchWhileLayout.getContext()) && !watchWhileLayout.getContext().getResources().getBoolean(R.bool.is_tablet) && watchWhileLayout.bE.b(hww.a, hww.l, hww.b, hww.i)) {
            float width = watchWhileLayout.getWidth();
            ViewGroup.LayoutParams layoutParams = watchWhileLayout.at.getLayoutParams();
            float marginStart = 0.65f * width;
            if (layoutParams != null) {
                kro.F(watchWhileLayout.at, (int) (((marginStart - width) * fMax3) + width), layoutParams.height);
            }
            ViewGroup.LayoutParams layoutParams2 = watchWhileLayout.ai.getLayoutParams();
            if (layoutParams2 != null) {
                if (this.c.l(118, 45823962L, false) && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginStart -= marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
                }
                kro.F(watchWhileLayout.ai, (int) (width + ((marginStart - width) * fMax3)), layoutParams2.height);
            }
        } else {
            ViewGroup.LayoutParams layoutParams3 = watchWhileLayout.at.getLayoutParams();
            if (layoutParams3 != null) {
                kro.F(watchWhileLayout.at, -1, layoutParams3.height);
            }
            ViewGroup.LayoutParams layoutParams4 = watchWhileLayout.ai.getLayoutParams();
            if (layoutParams4 != null) {
                kro.F(watchWhileLayout.ai, -1, layoutParams4.height);
            }
        }
        hww hwwVar = watchWhileLayout.bE;
        hww hwwVar2 = hww.d;
        hww hwwVar3 = hww.j;
        hww hwwVar4 = hww.k;
        hww hwwVar5 = hww.e;
        hww hwwVar6 = hww.g;
        int iX = hwwVar.b(hww.c, hwwVar2, hwwVar3, hwwVar4, hwwVar5, hww.f, hwwVar6) ? watchWhileLayout.x() : 0;
        View view = watchWhileLayout.ax;
        float fX = watchWhileLayout.x();
        float f13 = iX;
        view.setTranslationY((int) (fX + ((f13 - fX) * fMax3)));
        float fMin4 = 1.0f - (Math.min(fMax3, 0.25f) / 0.25f);
        if (I()) {
            fMax = b(fMax3, 0.25f);
            fB = b(fMax3, 0.05f);
        } else {
            fB = fMin4;
            fMax = fB;
        }
        watchWhileLayout.aA.setAlpha(fMax);
        watchWhileLayout.aC.setAlpha(fMax);
        watchWhileLayout.ar.setAlpha(fB);
        watchWhileLayout.aD.setAlpha(fMin4);
        View view2 = watchWhileLayout.aD;
        int i6 = fMin4 > 0.0f ? 0 : 4;
        view2.setVisibility(i6);
        watchWhileLayout.ah.setAlpha(fMin4);
        watchWhileLayout.aG.setAlpha(fMin4);
        watchWhileLayout.af.setAlpha(fMin4);
        if (watchWhileLayout.af.getVisibility() != 8) {
            watchWhileLayout.af.setVisibility(i6);
        }
        vxz vxzVar = this.c;
        if (vxzVar.l(85, 45746502L, false) || vxzVar.l(95, 45762151L, false)) {
            if (watchWhileLayout.bx) {
                f3 = 0.25f;
                fMax2 = 0.0f;
            } else {
                if (I()) {
                    float fQ2 = watchWhileLayout.q();
                    fMin = fMax3 > fQ2 ? fMax : 1.0f - (Math.min(fQ2 - fMax3, 0.25f) / 0.25f);
                } else {
                    fMin = 0.0f;
                }
                if (vxzVar.l(95, 45762151L, false)) {
                    if (J()) {
                        f3 = 0.25f;
                        if (watchWhileLayout.bE.b(hww.i)) {
                            fMax = Math.max(fMax, 1.0f - (Math.min(fMax3, 0.95f) / 0.95f));
                        }
                    } else {
                        f3 = 0.25f;
                    }
                    fMax2 = Math.max(fMax * ((kwq) this.b.io()).j(), fMin);
                } else {
                    f3 = 0.25f;
                    fMax2 = fMin;
                }
            }
            watchWhileLayout.av.setAlpha(fMax2);
            watchWhileLayout.aw.setAlpha(fMax2);
        } else {
            f3 = 0.25f;
        }
        watchWhileLayout.ai.setAlpha((Math.max(fMax3, 0.75f) - 0.75f) / f3);
        if (!I() || ((watchWhileLayout.bW.s() && watchWhileLayout.bH.isPresent() && ((Integer) watchWhileLayout.bH.get()).intValue() == 4) || (watchWhileLayout.bU.l(105, 45795183L, false) && watchWhileLayout.bE.equals(hwwVar4) && !watchWhileLayout.aJ.d))) {
            E();
            int i7 = watchWhileLayout.aN;
            H(new jpd(i7, i7, watchWhileLayout.aW, f13 + watchWhileLayout.aX, C()), D(), 1.0f - ((float) Math.pow(fMax3, 2.0d)));
        } else if (!watchWhileLayout.bE.b(hwwVar3, hwwVar4, hwwVar6, hwwVar2) || watchWhileLayout.q() == 1.0f) {
            E();
        } else {
            jpd jpdVarD = D();
            int measuredWidth = watchWhileLayout.at.getMeasuredWidth();
            if (watchWhileLayout.bx) {
                int i8 = this.j;
                f12 = this.l;
                i4 = measuredWidth;
                i3 = i8;
            } else {
                if (vxzVar.l(85, 45746502L, false)) {
                    f12 = this.k;
                    i4 = measuredWidth;
                    i3 = i4;
                } else {
                    boolean zK = hwz.k(watchWhileLayout.bD);
                    if (zK) {
                        i2 = this.h;
                        float f14 = watchWhileLayout.bl + ((watchWhileLayout.bj - this.h) / 2);
                        f8 = this.k;
                        f7 = f14;
                        i = i2;
                    } else {
                        i = watchWhileLayout.bj;
                        i2 = this.i;
                        f7 = watchWhileLayout.bl;
                        f8 = f13;
                    }
                    if (zK) {
                        f11 = watchWhileLayout.bg;
                        i3 = i2;
                        i4 = i;
                        f9 = f8;
                        f10 = f7;
                    } else {
                        i3 = i2;
                        i4 = i;
                        f9 = f8;
                        f10 = f7;
                        f11 = 0.0f;
                    }
                }
                jpdVar = new jpd(i4, i3, f10, f9, f11);
                int i9 = watchWhileLayout.aN;
                jpdVar2 = new jpd(i9, i9, watchWhileLayout.aW, f13 + watchWhileLayout.aX, C());
                fQ = watchWhileLayout.q();
                if (fMax3 <= fQ) {
                    float f15 = fMax3 / fQ;
                    H(jpdVarD, jpdVar, f15);
                    fZ = tym.z(f15, 0.0f, 1.0f);
                } else {
                    H(jpdVar, jpdVar2, watchWhileLayout.r(fMax3));
                    fZ = tym.z(1.0f - ((fMax3 - fQ) / (1.0f - fQ)), 0.0f, 1.0f);
                }
                if (vxzVar.l(95, 45762151L, false)) {
                    aunnVar = this.b;
                    if (((kwq) aunnVar.io()).k() == ibt.FILL) {
                        fJ = ((kwq) aunnVar.io()).j();
                    } else {
                        fJ = fZ;
                    }
                } else {
                    fJ = fZ;
                }
                if (true == watchWhileLayout.bx) {
                    fJ = 0.0f;
                }
                watchWhileLayout.J(fJ);
            }
            f9 = f12;
            f10 = 0.0f;
            f11 = 0.0f;
            jpdVar = new jpd(i4, i3, f10, f9, f11);
            int i10 = watchWhileLayout.aN;
            jpdVar2 = new jpd(i10, i10, watchWhileLayout.aW, f13 + watchWhileLayout.aX, C());
            fQ = watchWhileLayout.q();
            if (fMax3 <= fQ) {
                float f16 = fMax3 / fQ;
                H(jpdVarD, jpdVar, f16);
                fZ = tym.z(f16, 0.0f, 1.0f);
            } else {
                H(jpdVar, jpdVar2, watchWhileLayout.r(fMax3));
                fZ = tym.z(1.0f - ((fMax3 - fQ) / (1.0f - fQ)), 0.0f, 1.0f);
            }
            if (vxzVar.l(95, 45762151L, false)) {
                aunnVar = this.b;
                if (((kwq) aunnVar.io()).k() == ibt.FILL) {
                    fJ = ((kwq) aunnVar.io()).j();
                } else {
                    fJ = fZ;
                }
            } else {
                fJ = fZ;
            }
            if (true == watchWhileLayout.bx) {
                fJ = 0.0f;
            }
            watchWhileLayout.J(fJ);
        }
        if (!watchWhileLayout.aj() && (background = watchWhileLayout.as.getBackground()) != null) {
            float fQ3 = watchWhileLayout.q();
            background.setAlpha((int) (((!vxzVar.l(41, 45679250L, false) || fQ3 == 1.0f) ? fMax3 : Math.max(0.0f, fMax3 - fQ3) / (1.0f - fQ3)) * 255.0f));
        }
        if (vxzVar.l(118, 45823962L, false)) {
            if (watchWhileLayout.bE.b(hww.b, hww.a, hww.l)) {
                i5 = 0;
                iMax = 0;
                f6 = 1.0f;
            } else {
                iMax = 255;
                if (watchWhileLayout.bE == hww.i) {
                    iMax = Math.max(0, Math.min(255, (int) ((1.0f - fMax3) * 255.0f)));
                    f6 = fMax3;
                    i5 = 0;
                } else {
                    f6 = 0.0f;
                }
            }
            if (watchWhileLayout.aI != null) {
                if (true == watchWhileLayout.ab()) {
                    i5 = 8;
                }
                watchWhileLayout.aI.setVisibility(i5);
                if (i5 == 0) {
                    watchWhileLayout.aI.setAlpha(f6);
                }
            }
            View view3 = watchWhileLayout.at;
            if (view3 != null && view3.getBackground() != null) {
                watchWhileLayout.at.getBackground().mutate().setAlpha(iMax);
            }
        }
        if (watchWhileLayout.ae != null) {
            if (vxzVar.l(41, 45679250L, false)) {
                if (watchWhileLayout.aJ.d && watchWhileLayout.X()) {
                    fMin3 = 1.0f - (fMax3 / 0.05f);
                    f5 = 1.0f;
                } else if (watchWhileLayout.bE.b(hww.i)) {
                    float f17 = f3;
                    f5 = 1.0f;
                    fMin3 = 1.0f - (Math.min(fMax3, f17) / f17);
                } else {
                    f5 = 1.0f;
                    fMin3 = 1.0f;
                }
                watchWhileLayout.ae.setAlpha(afxw.H(fMin3, 0.0f, f5));
            }
            PlayerBottomSheet playerBottomSheet = watchWhileLayout.ae;
            float fQ4 = watchWhileLayout.q();
            if (playerBottomSheet.h()) {
                fMax3 = 1.0f;
            } else if (!playerBottomSheet.f.b(hwwVar3, hwwVar5, hwwVar2)) {
                fMax3 = 0.0f;
            }
            playerBottomSheet.c.b.o((((int) (fMax3 * 255.0f)) << 24) | 16777215);
            float f18 = true != playerBottomSheet.h.r() ? 1.0f : 0.965f;
            if (playerBottomSheet.h.r()) {
                f4 = 0.0f;
                fMin2 = Math.max(((-0.035f) + fMax3) / f18, 0.0f);
            } else {
                f4 = 0.0f;
                fMin2 = fMax3;
            }
            if (playerBottomSheet.g() && fQ4 != f4) {
                fMin2 = Math.min(1.0f, fMin2 / (f18 * fQ4));
            }
            playerBottomSheet.c().setAlpha(fMin2);
            if (playerBottomSheet.h.r() && (viewFindViewById = playerBottomSheet.findViewById(playerBottomSheet.a)) != null) {
                viewFindViewById.setAlpha(fMin2);
            }
            if (playerBottomSheet.h.r()) {
                TabLayout tabLayout = playerBottomSheet.c.b;
                tabLayout.setAlpha(Math.max(1.0f - (fMax3 / 0.035f), 0.0f));
                tabLayout.setVisibility(fMax3 > 0.035f ? 8 : 0);
            } else {
                playerBottomSheet.d.setAlpha(playerBottomSheet.e * fMax3);
            }
            Drawable background2 = playerBottomSheet.getBackground();
            if (background2 != null) {
                if (playerBottomSheet.g() && fQ4 != 1.0f) {
                    fMax3 = Math.max(0.0f, fMax3 - fQ4) / (1.0f - fQ4);
                }
                background2.setAlpha((int) (fMax3 * 255.0f));
            }
        }
    }

    @Override // defpackage.jpy
    public boolean q() {
        vxz vxzVar = this.c;
        return vxzVar.l(41, 45679250L, false) && vxzVar.l(105, 45795183L, false);
    }
}
