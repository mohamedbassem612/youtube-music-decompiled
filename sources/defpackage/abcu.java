package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abcu extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, ScaleGestureDetector.OnScaleGestureListener {
    public View.OnClickListener a;
    public View.OnLongClickListener b;
    public jmt c;
    private View d;
    private final GestureDetector e;
    private boolean f = false;
    private boolean g = false;

    public abcu(Context context) {
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.e = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        new ScaleGestureDetector(context, this);
    }

    private static final void a(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (this.c == null) {
            return false;
        }
        a(this.d, true);
        jmt jmtVar = this.c;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        this.d.getWidth();
        this.d.getHeight();
        abak abakVar = jmtVar.a.e;
        if (abakVar == null) {
            return false;
        }
        abakVar.a.g(x, y);
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        a(this.d, true);
        this.f = false;
        abbd abbdVar = this.c.a;
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        abak abakVar = abbdVar.e;
        if (abakVar != null) {
            abbo abboVar = abakVar.a;
            if (!abboVar.c) {
                abboVar.c();
            }
            float fPow = (float) Math.pow(scaleFactor, 1.2000000476837158d);
            float f = abboVar.f / fPow;
            if (f <= 0.69816f) {
                f = 0.69815f;
                abboVar.f = fPow * 0.69815f;
            } else if (f >= 2.35617f) {
                f = 2.35618f;
                abboVar.f = fPow * 2.35618f;
            } else {
                float f2 = abboVar.e;
                if ((f2 < 1.74533f && f >= 1.74533f) || (f2 > 1.74533f && f <= 1.74533f)) {
                    abboVar.f(abboVar.p);
                    abboVar.b = true;
                }
            }
            abboVar.e = f;
            abboVar.r = abboVar.r || (abboVar.g < f && f < 2.1816635f) || (f > 0.8726665f && f < abboVar.h);
            abboVar.b = abboVar.b && Math.abs(f + (-1.74533f)) < 0.2094395f;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.g = true;
        abak abakVar = this.c.a.e;
        if (abakVar != null) {
            abakVar.a.c();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        abak abakVar = this.c.a.e;
        if (abakVar != null) {
            abbo abboVar = abakVar.a;
            if (abboVar.b && Math.abs(abboVar.e - 1.74533f) < 0.2094395f) {
                abboVar.e = 1.74533f;
            }
            float f = abboVar.e;
            boolean z = true;
            if (f > 0.78541f && f < 2.26892f) {
                z = false;
            }
            abboVar.j = z;
            abboVar.o = abboVar.a.a() + 100000008;
            abboVar.c = false;
        }
        this.g = false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        jmt jmtVar = this.c;
        if (jmtVar == null) {
            return false;
        }
        this.f = true;
        int x = (int) motionEvent2.getX();
        int y = (int) motionEvent2.getY();
        int width = this.d.getWidth();
        int height = this.d.getHeight();
        abak abakVar = jmtVar.a.e;
        if (abakVar == null) {
            return true;
        }
        abbo abboVar = abakVar.a;
        if (!abboVar.k || Math.abs(abboVar.l - x) > 100 || Math.abs(abboVar.m - y) > 100) {
            abboVar.g(x, y);
        }
        abboVar.e(x, y, width, height);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.d = view;
        boolean z = true;
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f) {
                this.f = false;
                jmt jmtVar = this.c;
                if (jmtVar != null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int width = view.getWidth();
                    int height = view.getHeight();
                    abak abakVar = jmtVar.a.e;
                    if (abakVar != null) {
                        abbo abboVar = abakVar.a;
                        if (Math.abs(abboVar.l - x) < 100 && Math.abs(abboVar.m - y) < 100) {
                            abboVar.e(x, y, width, height);
                        }
                        if (abboVar.E > 0) {
                            float f = 0.0f;
                            if (!abboVar.d || abboVar.n >= 500) {
                                float f2 = 0.0f;
                                for (int i = 0; i < 5; i++) {
                                    f2 += abboVar.C[i];
                                    f += abboVar.D[i];
                                }
                                float f3 = abboVar.E;
                                abboVar.y = f2 / f3;
                                abboVar.z = f / f3;
                            }
                        }
                        long jA = abboVar.a.a();
                        abboVar.B = jA;
                        abboVar.A = jA;
                        if (abboVar.d) {
                            abboVar.o = jA;
                        }
                        abboVar.k = false;
                        abboVar.d = false;
                    }
                }
            } else if (this.b == null || motionEvent.getEventTime() - motionEvent.getDownTime() <= ViewConfiguration.getLongPressTimeout()) {
                View.OnClickListener onClickListener = this.a;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                } else {
                    z = false;
                }
            } else {
                this.b.onLongClick(view);
            }
            a(this.d, false);
        } else {
            if (!this.g) {
                this.e.onTouchEvent(motionEvent);
            }
            if (!this.g && !this.f) {
                return false;
            }
        }
        return z;
    }
}
