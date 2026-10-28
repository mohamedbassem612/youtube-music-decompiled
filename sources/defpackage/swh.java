package defpackage;

import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class swh {
    private static final String d = "swh";
    public Object a;
    ViewGroup b;
    final FrameLayout c;
    private final Activity e;
    private final xgm f;
    private final admh g;
    private final awli h = new awli(Boolean.FALSE);
    private final adlk i;

    public swh(Activity activity, admh admhVar, xgm xgmVar) {
        this.e = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.c = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setClickable(true);
        this.i = new adlk(1);
        this.g = admhVar;
        this.f = xgmVar;
    }

    private final View e() {
        if (c()) {
            return this.c.getChildAt(0);
        }
        return null;
    }

    private final void f(adma admaVar, Object obj) {
        if (admaVar != null) {
            View viewA = admaVar.a();
            adly adlyVarC = adul.c(viewA);
            if (adlyVarC == null) {
                adlyVarC = new adly();
                adul.i(viewA, adlyVarC);
            }
            adlyVarC.h();
            adlyVarC.a(this.f.hB());
            this.i.a(adlyVarC, null, 0);
            admaVar.hU(adlyVarC, obj);
        }
    }

    private final void g() {
        if (c()) {
            View viewE = e();
            this.c.removeView(viewE);
            this.g.e(viewE);
        }
    }

    public final void a() {
        if (!c()) {
            Log.e(d, "No overlay to dismiss.");
            return;
        }
        g();
        this.b.removeView(this.c);
        this.b.setVisibility(8);
        this.i.a = null;
        this.h.kk(Boolean.FALSE);
    }

    public final void b() {
        if (c()) {
            View viewE = e();
            adul.g(viewE, this.g);
            f(adul.d(viewE), this.a);
        }
    }

    public final boolean c() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            FrameLayout frameLayout = this.c;
            if (viewGroup.indexOfChild(frameLayout) >= 0 && frameLayout.getChildCount() > 0) {
                return true;
            }
        }
        return false;
    }

    public final void d(Object obj) {
        adma admaVar;
        if (obj != null) {
            if (this.b == null) {
                Activity activity = this.e;
                ViewGroup viewGroup = (ViewGroup) activity.getWindow().findViewById(R.id.interstitials_container);
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) activity.getWindow().getDecorView();
                }
                this.b = viewGroup;
            }
            View viewA = null;
            this.i.a = Pair.create("overlay_controller_param", null);
            this.a = obj;
            if (c()) {
                Object obj2 = this.a;
                if (c() && adul.a(this.c.getChildAt(0)) == this.g.a(obj2)) {
                    b();
                    return;
                }
                g();
            }
            Object obj3 = this.a;
            if (obj3 != null && (admaVar = (adma) adul.f(this.g, obj3, this.b).f()) != null) {
                f(admaVar, obj3);
                viewA = admaVar.a();
            }
            if (viewA != null) {
                FrameLayout frameLayout = this.c;
                if (frameLayout.indexOfChild(viewA) < 0) {
                    frameLayout.addView(viewA);
                }
                if (this.b.indexOfChild(frameLayout) < 0) {
                    this.b.addView(frameLayout);
                }
                this.b.setVisibility(0);
                this.h.kk(Boolean.TRUE);
            }
        }
    }
}
