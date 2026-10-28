package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mf extends qa implements nt {
    private static final int[] r = {R.attr.state_pressed};
    private static final int[] s = new int[0];
    private final int A;
    private final int B;
    private int C;
    private final int[] D;
    private final int[] E;
    private final Runnable F;
    private final qa G;
    public final int a;
    public final StateListDrawable b;
    public final Drawable c;
    int d;
    int e;
    float f;
    int g;
    int h;
    float i;
    public int j;
    public int k;
    public RecyclerView l;
    public boolean m;
    public boolean n;
    public int o;
    final ValueAnimator p;
    int q;
    private final int v;
    private final int w;
    private final int x;
    private final StateListDrawable y;
    private final Drawable z;

    public mf(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        super((byte[]) null);
        this.j = 0;
        this.k = 0;
        this.m = false;
        this.n = false;
        this.o = 0;
        this.C = 0;
        this.D = new int[2];
        this.E = new int[2];
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.p = valueAnimatorOfFloat;
        this.q = 0;
        this.F = new mc(this, 0);
        md mdVar = new md(this);
        this.G = mdVar;
        this.b = stateListDrawable;
        this.c = drawable;
        this.y = stateListDrawable2;
        this.z = drawable2;
        this.w = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.x = Math.max(i, drawable.getIntrinsicWidth());
        this.A = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.B = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.v = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new me(this));
        valueAnimatorOfFloat.addUpdateListener(new pr(this, 1));
        RecyclerView recyclerView2 = this.l;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.aH(this);
                this.l.Z(this);
                this.l.aE(mdVar);
                o();
            }
            this.l = recyclerView;
            if (recyclerView != null) {
                recyclerView.aJ(this);
                this.l.w(this);
                this.l.aC(mdVar);
            }
        }
    }

    private final void o() {
        this.l.removeCallbacks(this.F);
    }

    private final void p(int i) {
        o();
        this.l.postDelayed(this.F, i);
    }

    private final boolean q() {
        return this.l.getLayoutDirection() == 1;
    }

    private static final int r(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // defpackage.nt
    public final void g(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.o != 0) {
            if (motionEvent.getAction() == 0) {
                boolean zL = l(motionEvent.getX(), motionEvent.getY());
                boolean zK = k(motionEvent.getX(), motionEvent.getY());
                if (zL) {
                    if (!zK) {
                        this.C = 2;
                        this.f = (int) motionEvent.getY();
                    }
                    i(2);
                    return;
                }
                if (!zK) {
                    return;
                }
                this.C = 1;
                this.i = (int) motionEvent.getX();
                i(2);
                return;
            }
            if (motionEvent.getAction() == 1 && this.o == 2) {
                this.f = 0.0f;
                this.i = 0.0f;
                i(1);
                this.C = 0;
                return;
            }
            if (motionEvent.getAction() == 2 && this.o == 2) {
                j();
                if (this.C == 1) {
                    float x = motionEvent.getX();
                    int[] iArr = this.E;
                    int i = this.v;
                    iArr[0] = i;
                    int i2 = this.j - i;
                    iArr[1] = i2;
                    float fMax = Math.max(i, Math.min(i2, x));
                    if (Math.abs(this.h - fMax) >= 2.0f) {
                        int iR = r(this.i, fMax, iArr, this.l.computeHorizontalScrollRange(), this.l.computeHorizontalScrollOffset(), this.j);
                        if (iR != 0) {
                            this.l.scrollBy(iR, 0);
                        }
                        this.i = fMax;
                    }
                }
                if (this.C == 2) {
                    float y = motionEvent.getY();
                    int[] iArr2 = this.D;
                    int i3 = this.v;
                    iArr2[0] = i3;
                    int i4 = this.k - i3;
                    iArr2[1] = i4;
                    float fMax2 = Math.max(i3, Math.min(i4, y));
                    if (Math.abs(this.e - fMax2) >= 2.0f) {
                        int iR2 = r(this.f, fMax2, iArr2, this.l.computeVerticalScrollRange(), this.l.computeVerticalScrollOffset(), this.k);
                        if (iR2 != 0) {
                            this.l.scrollBy(0, iR2);
                        }
                        this.f = fMax2;
                    }
                }
            }
        }
    }

    public final void h() {
        this.l.invalidate();
    }

    final void i(int i) {
        if (i == 2 && this.o != 2) {
            this.b.setState(r);
            o();
        }
        if (i == 0) {
            h();
        } else {
            j();
        }
        if (this.o == 2 && i != 2) {
            this.b.setState(s);
            p(1200);
        } else if (i == 1) {
            p(1500);
        }
        this.o = i;
    }

    public final void j() {
        int i = this.q;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.p.cancel();
            }
        }
        this.q = 1;
        ValueAnimator valueAnimator = this.p;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    final boolean k(float f, float f2) {
        if (f2 >= this.k - this.A) {
            int i = this.h;
            int i2 = this.g / 2;
            if (f >= i - i2 && f <= i + i2) {
                return true;
            }
        }
        return false;
    }

    final boolean l(float f, float f2) {
        if (!q() ? f >= this.j - this.w : f <= this.w) {
            int i = this.e;
            int i2 = this.d / 2;
            if (f2 >= i - i2 && f2 <= i + i2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nt
    public final boolean m(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.o;
        if (i == 1) {
            boolean zL = l(motionEvent.getX(), motionEvent.getY());
            boolean zK = k(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (zL) {
                if (!zK) {
                    this.C = 2;
                    this.f = (int) motionEvent.getY();
                }
                i(2);
            } else if (!zK) {
                return false;
            }
            this.C = 1;
            this.i = (int) motionEvent.getX();
            i(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // defpackage.qa
    public final void n(Canvas canvas, RecyclerView recyclerView) {
        if (this.j != this.l.getWidth() || this.k != this.l.getHeight()) {
            this.j = this.l.getWidth();
            this.k = this.l.getHeight();
            i(0);
            return;
        }
        if (this.q != 0) {
            if (this.m) {
                int i = this.j;
                int i2 = this.w;
                int i3 = i - i2;
                int i4 = this.e;
                int i5 = this.d;
                int i6 = i4 - (i5 / 2);
                StateListDrawable stateListDrawable = this.b;
                stateListDrawable.setBounds(0, 0, i2, i5);
                Drawable drawable = this.c;
                drawable.setBounds(0, 0, this.x, this.k);
                float f = i6;
                float f2 = -i6;
                if (q()) {
                    drawable.draw(canvas);
                    canvas.translate(i2, f);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i2, f2);
                } else {
                    canvas.translate(i3, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, f);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i3, f2);
                }
            }
            if (this.n) {
                int i7 = this.k;
                int i8 = this.A;
                int i9 = i7 - i8;
                int i10 = this.h;
                int i11 = this.g;
                int i12 = i10 - (i11 / 2);
                StateListDrawable stateListDrawable2 = this.y;
                stateListDrawable2.setBounds(0, 0, i11, i8);
                Drawable drawable2 = this.z;
                drawable2.setBounds(0, 0, this.j, this.B);
                canvas.translate(0.0f, i9);
                drawable2.draw(canvas);
                canvas.translate(i12, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i12, -i9);
            }
        }
    }

    @Override // defpackage.nt
    public final void f(boolean z) {
    }
}
