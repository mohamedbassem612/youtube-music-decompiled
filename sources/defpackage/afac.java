package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afac extends aezx {
    public static final /* synthetic */ int f = 0;
    private static final Property g = new afab(Float.class);
    public final bnn a;
    public final aezc b;
    public int c;
    public boolean d;
    public float e;
    private ObjectAnimator h;

    public afac(afah afahVar) {
        super(3);
        this.c = 1;
        this.b = afahVar;
        this.a = new bnn();
    }

    private final void i() {
        if (this.h == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<afac, Float>) g, 0.0f, 1.0f);
            this.h = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.b.n * 333.0f));
            this.h.setInterpolator(null);
            this.h.setRepeatCount(-1);
            this.h.addListener(new afaa(this));
        }
    }

    @Override // defpackage.aezx
    public final void a() {
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.aezx
    public final void b() {
        i();
        this.h.setDuration((long) (this.b.n * 333.0f));
        e();
    }

    final void e() {
        this.d = true;
        this.c = 1;
        for (aezv aezvVar : this.k) {
            aezc aezcVar = this.b;
            aezvVar.c = aezcVar.e[0];
            aezvVar.d = aezcVar.i / 2;
        }
    }

    @Override // defpackage.aezx
    public final void f() {
        i();
        e();
        this.h.start();
    }

    @Override // defpackage.aezx
    public final void d() {
    }

    @Override // defpackage.aezx
    public final void g() {
    }

    @Override // defpackage.aezx
    public final void c(dta dtaVar) {
    }
}
