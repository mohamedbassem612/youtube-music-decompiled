package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afag extends aezx {
    public static final int[] a = {533, 567, 850, 750};
    public static final int[] b = {1267, 1000, 333, 0};
    private static final Property i = new afaf(Float.class);
    public final Interpolator[] c;
    public final aezc d;
    public int e;
    public boolean f;
    public float g;
    dta h;
    private ObjectAnimator l;
    private ObjectAnimator m;

    public afag(Context context, afah afahVar) {
        super(2);
        this.e = 0;
        this.h = null;
        this.d = afahVar;
        this.c = new Interpolator[]{dtp.d(context, R.anim.linear_indeterminate_line1_head_interpolator), dtp.d(context, R.anim.linear_indeterminate_line1_tail_interpolator), dtp.d(context, R.anim.linear_indeterminate_line2_head_interpolator), dtp.d(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    private final void i() {
        if (this.l == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<afag, Float>) i, 0.0f, 1.0f);
            this.l = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.d.n * 1800.0f));
            this.l.setInterpolator(null);
            this.l.setRepeatCount(-1);
            this.l.addListener(new afad(this));
        }
        if (this.m == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<afag, Float>) i, 1.0f);
            this.m = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.d.n * 1800.0f));
            this.m.setInterpolator(null);
            this.m.addListener(new afae(this));
        }
    }

    @Override // defpackage.aezx
    public final void a() {
        ObjectAnimator objectAnimator = this.l;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.aezx
    public final void b() {
        i();
        aezc aezcVar = this.d;
        ObjectAnimator objectAnimator = this.l;
        long j = (long) (aezcVar.n * 1800.0f);
        objectAnimator.setDuration(j);
        this.m.setDuration(j);
        e();
    }

    @Override // defpackage.aezx
    public final void c(dta dtaVar) {
        this.h = dtaVar;
    }

    @Override // defpackage.aezx
    public final void d() {
        ObjectAnimator objectAnimator = this.m;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.j.isVisible()) {
            this.m.setFloatValues(this.g, 1.0f);
            this.m.setDuration((long) ((1.0f - this.g) * 1800.0f));
            this.m.start();
        }
    }

    final void e() {
        this.e = 0;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((aezv) it.next()).c = this.d.e[0];
        }
    }

    @Override // defpackage.aezx
    public final void f() {
        i();
        e();
        this.l.start();
    }

    @Override // defpackage.aezx
    public final void g() {
        this.h = null;
    }
}
