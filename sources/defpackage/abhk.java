package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class abhk extends View implements abhq {
    private final int a;
    private int b;
    private int[] c;
    private Point d;
    public abho k;
    public long l;
    protected final abhi m;

    public abhk(abho abhoVar, Context context, AttributeSet attributeSet, abhi abhiVar) {
        super(context, attributeSet);
        this.m = abhiVar;
        this.k = abhoVar;
        abhiVar.c = new abgn(this);
        setAccessibilityDelegate(new abhj(this));
        this.a = (int) (context.getResources().getDisplayMetrics().density * (-50.0f));
    }

    private final String b(long j) {
        return getContext().getResources().getString(R.string.accessibility_player_progress_time, nsj.b(getResources(), aaja.d(j)), nsj.b(getResources(), aaja.d(p())));
    }

    public abstract long a();

    protected abstract void c(float f);

    protected abstract void e();

    protected abstract void f();

    protected abstract boolean g(float f, float f2);

    @Override // defpackage.abhq
    public final float j() {
        long jO = o();
        long jP = p();
        if (jP <= 0 || jO <= 0) {
            return 0.0f;
        }
        if (jO >= jP) {
            return 1.0f;
        }
        return jO / jP;
    }

    public final long k() {
        return l(this.l);
    }

    public final long l(long j) {
        return this.k.r() ? -(this.k.g() - j) : j;
    }

    public final long m() {
        return this.k.e() - this.k.h();
    }

    public final long n() {
        return this.k.f() - this.k.h();
    }

    protected final long o() {
        return this.l - this.k.h();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            Point pointQ = q(motionEvent);
            int i = pointQ.x;
            int i2 = pointQ.y;
            int action = motionEvent.getAction();
            if (action == 0) {
                float f = i;
                if (g(f, i2)) {
                    abhi abhiVar = this.m;
                    abhiVar.a(5, this.l);
                    c(f);
                    long jA = a();
                    this.l = jA;
                    abhiVar.a(1, jA);
                    e();
                    return true;
                }
            } else if (action == 1) {
                abhi abhiVar2 = this.m;
                if (abhiVar2.a) {
                    long jA2 = a();
                    abhiVar2.a(3, jA2);
                    setContentDescription(b(jA2));
                    e();
                    return true;
                }
            } else if (action == 2) {
                abhi abhiVar3 = this.m;
                if (abhiVar3.a) {
                    if (i2 < this.a) {
                        int i3 = this.b;
                        i = ((i - i3) / 3) + i3;
                    } else {
                        this.b = i;
                    }
                    c(i);
                    long jA3 = a();
                    this.l = jA3;
                    abhiVar3.a(2, jA3);
                    e();
                    return true;
                }
            } else if (action == 3) {
                abhi abhiVar4 = this.m;
                if (abhiVar4.a) {
                    abhiVar4.a(4, this.l);
                    e();
                    return true;
                }
            }
        }
        return false;
    }

    public final long p() {
        return this.k.g() - this.k.h();
    }

    public final Point q(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.c == null) {
            this.c = new int[2];
        }
        if (this.d == null) {
            this.d = new Point();
        }
        getLocationOnScreen(this.c);
        this.d.set(((int) motionEvent.getRawX()) - this.c[0], ((int) motionEvent.getRawY()) - this.c[1]);
        return this.d;
    }

    public final String r() {
        return b(n());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.abhq
    public final void s(abhp abhpVar) {
        this.m.b.add(abhpVar);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        if (isEnabled() != z) {
            super.setEnabled(z);
            f();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.abhq
    public final void t(abhp abhpVar) {
        this.m.b.remove(abhpVar);
    }

    public final void u(boolean z) {
        long jA = a();
        abhi abhiVar = this.m;
        if (abhiVar.a != z) {
            abhiVar.b(z, true != z ? 4 : 1, jA);
        }
    }

    public final void v(abho abhoVar) {
        abhoVar.getClass();
        this.k = abhoVar;
        e();
    }

    public final boolean w() {
        return this.m.a;
    }

    public abhk(abho abhoVar, Context context, AttributeSet attributeSet) {
        this(abhoVar, context, attributeSet, new abhi());
    }
}
