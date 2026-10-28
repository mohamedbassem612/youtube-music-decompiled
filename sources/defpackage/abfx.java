package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abfx implements acdg {
    public final spi a;
    public final spe b;
    public final sph c;
    public final int d;
    public final spg e;
    public final spj f;
    public som g;
    public boolean h;
    public abwk i;
    private final Context j;
    private abfy k;

    public abfx(Context context, xgn xgnVar, sgv sgvVar, hfn hfnVar, vyo vyoVar, vxu vxuVar) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.controls_overlay_timebar_height);
        context.getClass();
        this.j = context;
        this.d = dimensionPixelSize;
        this.a = new spi(context, vyoVar);
        this.b = new spe();
        this.c = new sph();
        this.f = new spj(xgnVar, sgvVar, vyoVar);
        this.e = new spg(vxuVar, vyoVar, xgnVar);
        this.g = som.a().a();
        hfnVar.y().al(new hjd(this, 20), new hpw(5));
    }

    @Override // defpackage.acdg
    public final ViewGroup.LayoutParams b() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final synchronized abfy c() {
        abfy abfyVar;
        abfyVar = this.k;
        if (abfyVar == null) {
            abfy abfyVar2 = new abfy(this.j, this, new abfw());
            this.k = abfyVar2;
            abfyVar = abfyVar2;
        }
        return abfyVar;
    }

    public final void d(int i) {
        abfy abfyVarC = c();
        abfyVarC.e(2);
        abfyVarC.e |= i;
        abfyVarC.d();
    }

    public final boolean e(int i) {
        return c().h(i);
    }

    public final boolean f() {
        return this.g.a;
    }

    @Override // defpackage.acdg
    public final View jM() {
        abfy abfyVarC = c();
        if (!abfyVarC.f(1)) {
            ((agrc) ((agrc) abfy.a.c()).k("com/google/android/libraries/youtube/player/features/overlay/base/LazyPlayerOverlayViewHelper", "getRootView", 222, "LazyPlayerOverlayViewHelper.java")).B("Forcefully created overlay:%s helper:%s", abfyVarC.g, abfyVarC);
            abfyVarC.c();
        }
        return abfyVarC.d;
    }
}
