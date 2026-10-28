package defpackage;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class og implements Runnable {
    public OverScroller a;
    Interpolator b;
    final /* synthetic */ RecyclerView c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;

    public og(RecyclerView recyclerView) {
        this.c = recyclerView;
        Interpolator interpolator = RecyclerView.c;
        this.b = interpolator;
        this.f = false;
        this.g = false;
        this.a = new OverScroller(recyclerView.getContext(), interpolator);
    }

    private final void e() {
        RecyclerView recyclerView = this.c;
        recyclerView.removeCallbacks(this);
        int i = bac.a;
        recyclerView.postOnAnimation(this);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.c;
        recyclerView.ai(2);
        this.e = 0;
        this.d = 0;
        Interpolator interpolator = this.b;
        Interpolator interpolator2 = RecyclerView.c;
        if (interpolator != interpolator2) {
            this.b = interpolator2;
            this.a = new OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.a.fling(0, 0, i, i2, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
        b();
    }

    final void b() {
        if (this.f) {
            this.g = true;
        } else {
            e();
        }
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            RecyclerView recyclerView = this.c;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (true != z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.c;
        }
        if (this.b != interpolator) {
            this.b = interpolator;
            this.a = new OverScroller(this.c.getContext(), interpolator);
        }
        this.e = 0;
        this.d = 0;
        this.c.ai(2);
        this.a.startScroll(0, 0, i, i2, i4);
        b();
    }

    public final void d() {
        this.c.removeCallbacks(this);
        this.a.abortAnimation();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cf A[PHI: r1
      0x00cf: PHI (r1v11 int) = (r1v10 int), (r1v23 int) binds: [B:35:0x00c8, B:37:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        RecyclerView recyclerView = this.c;
        if (recyclerView.n == null) {
            d();
            return;
        }
        this.g = false;
        this.f = true;
        recyclerView.C();
        OverScroller overScroller = this.a;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.d;
            int i7 = currY - this.e;
            this.d = currX;
            this.e = currY;
            int iAw = RecyclerView.aw(i6, recyclerView.A, recyclerView.C, recyclerView.getWidth());
            int iAw2 = RecyclerView.aw(i7, recyclerView.B, recyclerView.D, recyclerView.getHeight());
            int[] iArr = recyclerView.T;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.ap(iAw, iAw2, iArr, null, 1)) {
                iAw -= iArr[0];
                iAw2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.B(iAw, iAw2);
            }
            if (recyclerView.m != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.aa(iAw, iAw2, iArr);
                int i8 = iArr[0];
                i3 = iArr[1];
                iAw -= i8;
                int i9 = iAw2 - i3;
                od odVar = recyclerView.n.mSmoothScroller;
                if (odVar != null && !odVar.e && odVar.f) {
                    int iA = recyclerView.O.a();
                    if (iA == 0) {
                        odVar.g();
                    } else if (odVar.b >= iA) {
                        odVar.b = iA - 1;
                        odVar.f(i8, i3);
                    } else {
                        odVar.f(i8, i3);
                    }
                }
                i = i9;
                i2 = i8;
            } else {
                i = iAw2;
                i2 = 0;
                i3 = 0;
            }
            if (!recyclerView.p.isEmpty()) {
                recyclerView.invalidate();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int i10 = iAw;
            int i11 = i2;
            int i12 = i3;
            recyclerView.G(i11, i12, i10, i, null, 1, iArr);
            int i13 = i;
            int i14 = i10 - iArr[0];
            int i15 = i13 - iArr[1];
            if (i11 == 0) {
                i11 = 0;
                if (i12 == 0) {
                    i4 = 0;
                } else {
                    recyclerView.H(i11, i12);
                    i4 = i12;
                }
            } else {
                recyclerView.H(i11, i12);
                i4 = i12;
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            int currX2 = overScroller.getCurrX();
            int finalX = overScroller.getFinalX();
            int currY2 = overScroller.getCurrY();
            int finalY = overScroller.getFinalY();
            if (overScroller.isFinished()) {
                z = true;
            } else if (currX2 != finalX && i14 == 0) {
                z = false;
                i14 = 0;
            } else if (currY2 == finalY || i15 != 0) {
                z = true;
            } else {
                z = false;
                i15 = 0;
            }
            od odVar2 = recyclerView.n.mSmoothScroller;
            if ((odVar2 == null || !odVar2.e) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i14 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i14 > 0 ? currVelocity : 0;
                    }
                    if (i15 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i15 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.J();
                        if (recyclerView.A.isFinished()) {
                            recyclerView.A.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.K();
                        if (recyclerView.C.isFinished()) {
                            recyclerView.C.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.L();
                        if (recyclerView.B.isFinished()) {
                            recyclerView.B.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.I();
                        if (recyclerView.D.isFinished()) {
                            recyclerView.D.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                recyclerView.N.b();
            } else {
                b();
                mj mjVar = recyclerView.M;
                if (mjVar != null) {
                    mjVar.a(recyclerView, i11, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                nj.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        od odVar3 = recyclerView.n.mSmoothScroller;
        if (odVar3 != null && odVar3.e) {
            odVar3.f(0, 0);
        }
        this.f = false;
        if (this.g) {
            e();
        } else {
            recyclerView.ai(0);
            recyclerView.am(1);
        }
    }
}
