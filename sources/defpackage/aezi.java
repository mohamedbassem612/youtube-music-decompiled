package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aezi extends aezx {
    public static final int[] a = {0, 1350, 2700, 4050};
    public static final int[] b = {667, 2017, 3367, 4717};
    public static final int[] c = {1000, 2350, 3700, 5050};
    private static final Property l = new aezg(Float.class);
    private static final Property m = new aezh(Float.class);
    public final bnn d;
    public final aezc e;
    public int f;
    public float g;
    public float h;
    dta i;
    private ObjectAnimator n;
    private ObjectAnimator o;

    public aezi(aezo aezoVar) {
        super(1);
        this.f = 0;
        this.i = null;
        this.e = aezoVar;
        this.d = new bnn();
    }

    private final void i() {
        if (this.n == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<aezi, Float>) l, 0.0f, 1.0f);
            this.n = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.e.n * 5400.0f));
            this.n.setInterpolator(null);
            this.n.setRepeatCount(-1);
            this.n.addListener(new aeze(this));
        }
        if (this.o == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<aezi, Float>) m, 0.0f, 1.0f);
            this.o = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.e.n * 333.0f));
            this.o.setInterpolator(this.d);
            this.o.addListener(new aezf(this));
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
        aezc aezcVar = this.e;
        ObjectAnimator objectAnimator = this.n;
        float f = aezcVar.n;
        objectAnimator.setDuration((long) (5400.0f * f));
        this.o.setDuration((long) (f * 333.0f));
        e();
    }

    @Override // defpackage.aezx
    public final void c(dta dtaVar) {
        this.i = dtaVar;
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
        this.f = 0;
        ((aezv) this.k.get(0)).c = this.e.e[0];
        this.h = 0.0f;
    }

    @Override // defpackage.aezx
    public final void f() {
        i();
        e();
        this.n.start();
    }

    @Override // defpackage.aezx
    public final void g() {
        this.i = null;
    }
}
