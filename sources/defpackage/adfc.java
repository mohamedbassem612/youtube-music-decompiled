package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adfc extends AppCompatImageView implements View.OnTouchListener {
    public boolean A;
    public int B;
    public int C;
    public int D;
    private final ScaleGestureDetector E;
    private PointF F;
    private final int[] G;
    private final int[] H;
    public int a;
    public boolean b;
    public float c;
    boolean d;
    final PointF e;
    Dialog f;
    public AppCompatImageView g;
    public AppCompatImageView h;
    public AppCompatImageView i;
    public nsl j;
    public nry k;
    public CommandOuterClass$Command l;
    public CommandOuterClass$Command m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public asnr t;
    public boolean u;
    public boolean v;
    public boolean w;
    public zsl x;
    public nxs y;
    public byte[] z;

    public adfc(Context context) {
        super(context);
        this.n = true;
        this.o = false;
        this.a = 0;
        this.B = 1;
        this.b = false;
        getContext().registerReceiver(new adfb(this, this), new IntentFilter("android.intent.action.SCREEN_OFF"));
        this.E = new ScaleGestureDetector(getContext(), new adfa(this));
        setOnTouchListener(this);
        this.G = new int[2];
        this.H = new int[2];
        this.e = new PointF(0.0f, 0.0f);
        this.F = new PointF(0.0f, 0.0f);
        this.t = asnr.a;
        this.C = 1;
        this.D = 1;
    }

    private final Matrix e(Drawable drawable) {
        return f(drawable, getWidth(), getHeight());
    }

    private final Matrix f(Drawable drawable, int i, int i2) {
        RectF rectFB;
        boolean z = this.s;
        asnr asnrVar = this.t;
        int i3 = adex.a;
        if (!z || asnrVar == null) {
            rectFB = adex.b(drawable);
        } else {
            rectFB = new RectF(drawable.getIntrinsicWidth() * ((float) asnrVar.b), drawable.getIntrinsicHeight() * ((float) asnrVar.c), drawable.getIntrinsicWidth() * ((float) asnrVar.d), drawable.getIntrinsicHeight() * ((float) asnrVar.e));
        }
        Matrix.ScaleToFit scaleToFit = z ? Matrix.ScaleToFit.FILL : Matrix.ScaleToFit.CENTER;
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectFB, new RectF(0.0f, 0.0f, i, i2), scaleToFit);
        return matrix;
    }

    private final int[] g(int[] iArr) {
        return new int[]{iArr[0] - (this.q ? 0 : tuk.f(getRootView()).a()), iArr[1] - (this.q ? 0 : tuk.f(getRootView()).b())};
    }

    public final AppCompatImageView a() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setMaxWidth(getWidth());
        appCompatImageView.setMinimumWidth(getWidth());
        appCompatImageView.setMinimumHeight(getHeight());
        appCompatImageView.setMaxHeight(getHeight());
        return appCompatImageView;
    }

    public final void b() {
        if (this.v) {
            post(new acqu(this, 8));
        } else {
            d();
        }
    }

    public final void c(View view) {
        if (this.i != null && view != null) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            ArrayList arrayList = new ArrayList();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.i, "scaleX", 1.0f);
            objectAnimatorOfFloat.setDuration(200L);
            arrayList.add(objectAnimatorOfFloat);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.i, "scaleY", 1.0f);
            objectAnimatorOfFloat2.setDuration(200L);
            arrayList.add(objectAnimatorOfFloat2);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.i, "translationX", iArr[0]);
            objectAnimatorOfFloat3.setDuration(200L);
            arrayList.add(objectAnimatorOfFloat3);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.i, "translationY", iArr[1]);
            objectAnimatorOfFloat4.setDuration(200L);
            arrayList.add(objectAnimatorOfFloat4);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new adez(this));
            animatorSet.start();
        }
        PointF pointF = this.e;
        if (pointF != null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
        }
        this.d = false;
    }

    public final void d() {
        if (this.k == null || this.m == null) {
            return;
        }
        nrt nrtVarD = nrv.d();
        nsl nslVar = this.j;
        if (nslVar != null) {
            nrtVarD.f = nslVar.t;
        }
        this.k.a(this.m, nrtVarD.a()).D();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.r && getDrawable() != null) {
            setImageMatrix(f(getDrawable(), i, i2));
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.E.onTouchEvent(motionEvent);
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount >= 2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int[] iArr = this.G;
        view.getLocationInWindow(iArr);
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (actionMasked == 0) {
            PointF pointFA = adex.a(motionEvent);
            this.F = pointFA;
            int[] iArr2 = this.H;
            iArr2[0] = (view.getWidth() / 2) - ((int) pointFA.x);
            iArr2[1] = (view.getHeight() / 2) - ((int) pointFA.y);
        } else if (actionMasked == 1) {
            if (this.n) {
                int i2 = this.D;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                if (i3 == 1) {
                    ObjectAnimator.ofFloat(this, "translationX", 0.0f, 8.0f, -8.0f, 8.0f, -8.0f, 0.0f).setDuration(250L).start();
                } else if (i3 == 2) {
                    boolean zIsHapticFeedbackEnabled = isHapticFeedbackEnabled();
                    if (!zIsHapticFeedbackEnabled) {
                        setHapticFeedbackEnabled(true);
                    }
                    performHapticFeedback(0);
                    if (!zIsHapticFeedbackEnabled) {
                        setHapticFeedbackEnabled(false);
                    }
                }
                if (this.r && this.u && getDrawable() != null) {
                    this.s = !this.s;
                    ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new aeuc(), getImageMatrix(), e(getDrawable()));
                    valueAnimatorOfObject.addUpdateListener(new adey(this, i));
                    valueAnimatorOfObject.addListener(new vgm(this, 3));
                    valueAnimatorOfObject.setDuration(200L);
                    valueAnimatorOfObject.start();
                } else {
                    b();
                }
            }
            if (!this.n && pointerCount == 1) {
                this.n = true;
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (actionMasked == 2 && pointerCount > 1) {
            PointF pointFA2 = adex.a(motionEvent);
            float f = pointFA2.x - this.F.x;
            float f2 = pointFA2.y - this.F.y;
            if (this.d) {
                this.e.offset(f, f2);
            }
            this.F = pointFA2;
        }
        if (this.d) {
            int[] iArrG = g(iArr);
            AppCompatImageView appCompatImageView = this.g;
            if (appCompatImageView != null) {
                appCompatImageView.setX(iArrG[0]);
                this.g.setY(iArrG[1]);
            }
            AppCompatImageView appCompatImageView2 = this.h;
            if (appCompatImageView2 != null) {
                appCompatImageView2.setX(iArrG[0]);
                this.h.setY(iArrG[1]);
            }
            if (this.i != null) {
                int[] iArrG2 = g(iArr);
                int i4 = iArrG2[0];
                PointF pointF = this.e;
                int i5 = (int) pointF.x;
                float f3 = this.c - 1.0f;
                int[] iArr3 = this.H;
                iArrG2[0] = i4 + i5 + ((int) (f3 * iArr3[0]));
                iArrG2[1] = iArrG2[1] + ((int) pointF.y) + ((int) ((this.c - 1.0f) * iArr3[1]));
                this.i.setX(iArrG2[0]);
                this.i.setY(iArrG2[1]);
                this.i.setScaleX(this.c);
                this.i.setScaleY(this.c);
            }
            if (pointerCount == 1) {
                c(view);
            }
            invalidate();
        }
        return true;
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new BitmapDrawable(getResources(), bitmap));
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        ImageView.ScaleType scaleType;
        if (drawable == null) {
            super.setImageDrawable(null);
            return;
        }
        if (!this.r || this.w) {
            int i = this.B;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 2) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            } else if (i2 != 3) {
                scaleType = i2 != 4 ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.CENTER;
            } else {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            }
            setScaleType(scaleType);
        } else {
            setScaleType(ImageView.ScaleType.MATRIX);
            setImageMatrix(e(drawable));
        }
        drawable.setAutoMirrored(this.b);
        if (this.a != 0) {
            drawable.mutate().setColorFilter(this.a, PorterDuff.Mode.SRC_IN);
        } else {
            drawable.mutate().clearColorFilter();
        }
        super.setImageDrawable(drawable);
    }
}
