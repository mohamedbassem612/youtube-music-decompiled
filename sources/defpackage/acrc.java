package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acrc implements nt {
    public int c;
    public final acpa d;
    final hbf f;
    public avgj g;
    private float h;
    private float i;
    private final Context l;
    private aqhx m;
    private final acve n;
    private final acvf o;
    private final acvd p;
    private final hno r;
    private long j = -1;
    public boolean a = false;
    public boolean b = true;
    private int k = 0;
    public boolean e = false;
    private float q = 200.0f;

    public acrc(Context context, Handler handler, acve acveVar, acpa acpaVar, acvf acvfVar, acvd acvdVar, hno hnoVar) {
        this.l = context;
        this.d = acpaVar;
        this.n = acveVar;
        this.o = acvfVar;
        this.p = acvdVar;
        this.r = hnoVar;
        this.f = new hbf(context, new acrb(this), handler);
    }

    public static float a(float f, float f2, float f3, float f4) {
        float degrees = (float) Math.toDegrees(Math.abs(Math.atan2(f4 - f2, f3 - f)));
        if (degrees > 90.0f) {
            degrees = 180.0f - degrees;
        }
        return 90.0f - degrees;
    }

    private final void c() {
        this.j = -1L;
        acve acveVar = this.n;
        if (acveVar.e && ((float) Math.sqrt(acve.a(acveVar.a, acveVar.b))) > acveVar.d) {
            acveVar.e = false;
        }
        if (this.r.p()) {
            this.a = false;
        }
    }

    private final void d(View view) {
        aqhx aqhxVar = this.m;
        float width = 200.0f;
        if (((vxz) this.r.a).m(56, 45793635L) && aqhxVar != null && (aqhxVar.c & 2) != 0) {
            width = ((view == null || view.getWidth() <= 0) ? this.l.getResources().getDisplayMetrics().widthPixels : view.getWidth()) * aqhxVar.e;
        }
        this.q = width;
    }

    private final void e(View view, MotionEvent motionEvent) {
        int actionMasked;
        hno hnoVar = this.r;
        boolean z = false;
        if (((vxz) hnoVar.m).l(123, 45855104L, false) && ((actionMasked = motionEvent.getActionMasked()) == 1 || actionMasked == 3)) {
            this.b = true;
        }
        if (hnoVar.p()) {
            boolean z2 = this.p.b;
            if (motionEvent.getPointerCount() > 1) {
                if (this.k != 0 || this.a) {
                    c();
                    this.k = 0;
                    return;
                }
                return;
            }
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.j = motionEvent.getDownTime();
            this.h = motionEvent.getRawX();
            this.i = motionEvent.getRawY();
            this.k = 1;
            this.a = false;
            h();
            this.b = true;
            acve acveVar = this.n;
            float f = this.h;
            float f2 = this.i;
            PointF pointF = acveVar.a;
            pointF.set(f, f2);
            acveVar.b.set(pointF);
            acveVar.e = true;
            d(view);
            return;
        }
        if (action == 1) {
            this.n.c(motionEvent.getRawX(), motionEvent.getRawY());
            if (this.j < -1) {
                c();
                return;
            }
            if (this.k == 5) {
                this.o.U();
            } else {
                this.k = 0;
            }
            c();
            return;
        }
        if (action != 2) {
            if (action == 3) {
                this.n.e = false;
                c();
                return;
            }
            return;
        }
        if (hnoVar.p()) {
            boolean z3 = this.p.b;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        this.n.c(rawX, rawY);
        if (!this.b) {
            if (Math.abs(rawY - this.i) > 150.0f) {
                a(this.h, this.i, rawX, rawY);
            }
            h();
            this.b = true;
        }
        float f3 = rawX - this.h;
        float fAbs = Math.abs(f3);
        float fA = a(this.h, this.i, rawX, rawY);
        if (this.e) {
            z = true;
        } else {
            this.d.al();
        }
        int i = this.k;
        if (i != 1) {
            if (i != 5 || f3 <= ((double) this.q) * 0.8d) {
                return;
            }
            this.k = 1;
            return;
        }
        if ((this.c & 16) == 0 || !z || fAbs <= this.q || fA > 112.5f || fA < 67.5f || rawX >= this.h) {
            return;
        }
        this.k = 5;
        this.h = rawX;
        this.d.al();
    }

    private final void h() {
        this.d.al();
    }

    public final void b(aqhx aqhxVar) {
        this.m = aqhxVar;
        d(null);
    }

    @Override // defpackage.nt
    public final void g(RecyclerView recyclerView, MotionEvent motionEvent) {
        avgj avgjVar;
        acqz acqzVar;
        int i;
        if (motionEvent != null) {
            if (motionEvent.getAction() == 1 && (avgjVar = this.g) != null && (i = (acqzVar = (acqz) avgjVar.a).Q) != -1) {
                acqzVar.y.aj(i);
            }
            e(recyclerView, motionEvent);
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.b = true;
            }
        }
    }

    @Override // defpackage.nt
    public final boolean m(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.r.p()) {
            if (motionEvent.getActionMasked() == 5 || motionEvent.getPointerCount() > 1) {
                if (this.k == 0 && !this.a) {
                    return false;
                }
                c();
                this.k = 0;
                return false;
            }
            boolean z = this.p.b;
        }
        this.f.f(motionEvent);
        e(recyclerView, motionEvent);
        int i = this.k;
        return !(i == 0 || i == 1) || this.a;
    }

    @Override // defpackage.nt
    public final void f(boolean z) {
    }
}
