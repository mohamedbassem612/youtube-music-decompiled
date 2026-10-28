package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aezn extends aezx {
    public final TimeInterpolator c;
    public final aezc d;
    public int e;
    public float f;
    public float g;
    dta h;
    private ObjectAnimator n;
    private ObjectAnimator o;
    private static final TimeInterpolator i = aetz.b;
    public static final int[] a = {0, 1500, 3000, 4500};
    public static final float[] b = {0.1f, 0.87f};
    private static final Property l = new aezl(Float.class);
    private static final Property m = new aezm(Float.class);

    public aezn(Context context, aezo aezoVar) {
        super(1);
        this.e = 0;
        this.h = null;
        this.d = aezoVar;
        this.c = afba.y(context, R.attr.motionEasingStandardInterpolator, i);
    }

    private final void i() {
        if (this.n == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<aezn, Float>) l, 0.0f, 1.0f);
            this.n = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.d.n * 6000.0f));
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new aezj(this));
        }
        if (this.o == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<aezn, Float>) m, 0.0f, 1.0f);
            this.o = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.d.n * 500.0f));
            this.o.addListener(new aezk(this));
        }
    }

    @Override // defpackage.aezx
    public final void a() {
        ObjectAnimator objectAnimator = this.n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.aezx
    public final void b() {
        i();
        aezc aezcVar = this.d;
        ObjectAnimator objectAnimator = this.n;
        float f = aezcVar.n;
        objectAnimator.setDuration((long) (6000.0f * f));
        this.o.setDuration((long) (f * 500.0f));
        e();
    }

    @Override // defpackage.aezx
    public final void c(dta dtaVar) {
        this.h = dtaVar;
    }

    @Override // defpackage.aezx
    public final void d() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.j.isVisible()) {
            this.o.start();
        } else {
            a();
        }
    }

    final void e() {
        this.e = 0;
        ((aezv) this.k.get(0)).c = this.d.e[0];
        this.g = 0.0f;
    }

    @Override // defpackage.aezx
    public final void f() {
        i();
        e();
        this.n.start();
    }

    @Override // defpackage.aezx
    public final void g() {
        this.h = null;
    }
}
