package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adgq {
    public final adgp a;
    public blf b;
    private final DisplayMetrics c;
    private final nxq d;
    private final PointF e = new PointF();
    private boolean f;

    public adgq(Context context, adgp adgpVar) {
        this.a = adgpVar;
        this.c = context.getResources().getDisplayMetrics();
        this.d = new nxq(context, 0.0f, 45.0f, false);
    }

    private final PointF d(MotionEvent motionEvent) {
        PointF pointF = this.e;
        return new PointF(motionEvent.getRawX() - pointF.x, motionEvent.getRawY() - pointF.y);
    }

    private final Boolean e(View view, MotionEvent motionEvent) {
        Boolean boolA = this.d.a(view, motionEvent);
        boolean zEquals = Objects.equals(boolA, Boolean.TRUE);
        if (!this.f && zEquals) {
            this.e.set(motionEvent.getRawX(), motionEvent.getRawY());
            this.a.c(a(view, motionEvent));
        }
        this.f = zEquals;
        return boolA;
    }

    public final adgo a(View view, MotionEvent motionEvent) {
        PointF pointFD = d(motionEvent);
        boolean zBs = qnl.bs(view.getContext().getResources());
        int i = true == zBs ? -1 : 1;
        float f = pointFD.x;
        DisplayMetrics displayMetrics = this.c;
        int iB = (int) twm.b(displayMetrics, f);
        if (view != null) {
            return new adgo(view, zBs, i * iB, twm.m(displayMetrics, view.getWidth()), twm.m(displayMetrics, view.getHeight()));
        }
        throw new NullPointerException("Null view");
    }

    public final boolean b(View view, MotionEvent motionEvent) {
        return Objects.equals(e(view, motionEvent), Boolean.TRUE);
    }

    public final boolean c(final View view, final MotionEvent motionEvent) {
        Boolean boolE = e(view, motionEvent);
        if (boolE == null) {
            return true;
        }
        if (!boolE.booleanValue()) {
            return false;
        }
        blf blfVar = this.b;
        if (blfVar != null) {
            blfVar.j();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                view.setTranslationX((int) d(motionEvent).x);
                this.a.a(a(view, motionEvent));
                return true;
            }
            if (actionMasked != 3) {
                return true;
            }
        }
        blf blfVar2 = new blf(new ble());
        blg blgVar = new blg(0.0f);
        blgVar.e(384.0f);
        blgVar.c(0.51f);
        blfVar2.p = blgVar;
        blfVar2.f(new adgm(view, 0));
        blfVar2.e(new bkz() { // from class: adgn
            @Override // defpackage.bkz
            public final void a(boolean z, float f) {
                adgq adgqVar = this.a;
                adgqVar.b = null;
                adgqVar.a.b(adgqVar.a(view, motionEvent));
            }
        });
        blfVar2.h(d(motionEvent).x);
        this.b = blfVar2;
        blfVar2.l();
        this.a.d(a(view, motionEvent));
        return true;
    }
}
