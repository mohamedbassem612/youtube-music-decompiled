package com.google.android.libraries.youtube.creation.editor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;
import defpackage.aaok;
import defpackage.agrc;
import defpackage.agrf;
import defpackage.awli;
import defpackage.bdl;
import defpackage.roq;
import defpackage.ukg;
import defpackage.ukh;
import defpackage.ulj;
import defpackage.ult;
import defpackage.ulx;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ShortsPlayerView extends FrameLayout {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/editor/ShortsPlayerView");
    public final ShortsPlayerVideoView b;
    public final RelativeLayout c;
    public final ShortsPlayerImageView d;
    public ult e;
    public ulj f;
    public Executor g;
    public ulx h;
    public float i;
    public boolean j;
    public float k;
    public float l;
    public double m;
    public double n;
    public SurfaceHolder.Callback o;
    public bdl p;
    public roq q;
    public aaok r;
    private int s;
    private int t;
    private boolean u;

    public ShortsPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 0.0f;
        this.u = true;
        new awli();
        View.inflate(context, R.layout.shorts_player_view, this);
        View viewFindViewById = findViewById(R.id.player_video_view);
        viewFindViewById.getClass();
        this.b = (ShortsPlayerVideoView) viewFindViewById;
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.shorts_player_error_container);
        relativeLayout.getClass();
        this.c = relativeLayout;
        View viewFindViewById2 = findViewById(R.id.guidelines_image_view);
        viewFindViewById2.getClass();
        ShortsPlayerImageView shortsPlayerImageView = (ShortsPlayerImageView) viewFindViewById2;
        this.d = shortsPlayerImageView;
        shortsPlayerImageView.setScaleType(ImageView.ScaleType.MATRIX);
        findViewById(R.id.processing_indicator);
    }

    private final void g(int i, int i2) {
        ShortsPlayerView shortsPlayerView;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        int i3 = 0;
        while (i3 < this.getChildCount()) {
            View childAt = this.getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                shortsPlayerView = this;
                shortsPlayerView.measureChildWithMargins(childAt, iMakeMeasureSpec, 0, iMakeMeasureSpec2, 0);
            } else {
                shortsPlayerView = this;
            }
            i3++;
            this = shortsPlayerView;
        }
        this.setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
    }

    private static final float h(float f, float f2, float f3) {
        return Math.max(0.0f, ((f3 - Math.abs(f)) - f2) / f3);
    }

    public final ukh a() {
        ShortsPlayerVideoView shortsPlayerVideoView = this.b;
        float translationX = shortsPlayerVideoView.getTranslationX();
        float translationY = shortsPlayerVideoView.getTranslationY();
        float height = getHeight();
        float width = getWidth();
        float height2 = shortsPlayerVideoView.getHeight();
        float width2 = shortsPlayerVideoView.getWidth();
        ukg ukgVar = new ukg();
        ukgVar.c(Math.abs(translationX) / width2);
        ukgVar.e(Math.abs(translationY) / height2);
        ukgVar.d(h(translationX, width, width2));
        ukgVar.b(h(translationY, height, height2));
        return ukgVar.a();
    }

    public final void b(float f) {
        this.b.setTranslationX(f);
        this.d.setTranslationX(f);
    }

    public final void c(float f) {
        this.b.setTranslationY(f);
        this.d.setTranslationY(f);
    }

    public final void d(float f) {
        ulx ulxVar;
        if (this.i != 0.0f) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/creation/editor/ShortsPlayerView", "setVideoAspectRatio", 178, "ShortsPlayerView.java")).t("Changing the video aspect ratio after it's initialized is not allowed");
            return;
        }
        this.i = f;
        ShortsPlayerVideoView shortsPlayerVideoView = this.b;
        shortsPlayerVideoView.d = f;
        if (shortsPlayerVideoView.c && ((ulxVar = shortsPlayerVideoView.e) == null || ulxVar.i == 1)) {
            SurfaceView surfaceView = shortsPlayerVideoView.b;
            if (surfaceView.getWidth() != 0 && surfaceView.getHeight() != 0) {
                float width = surfaceView.getWidth() / surfaceView.getHeight();
                if (f < width) {
                    surfaceView.getHolder().setFixedSize(Math.round((surfaceView.getWidth() * f) / width), surfaceView.getHeight());
                } else {
                    surfaceView.getHolder().setFixedSize(surfaceView.getWidth(), Math.round((surfaceView.getHeight() * width) / f));
                }
            }
        }
        shortsPlayerVideoView.requestLayout();
        ShortsPlayerImageView shortsPlayerImageView = this.d;
        shortsPlayerImageView.a = f;
        shortsPlayerImageView.requestLayout();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        bdl bdlVar = this.p;
        if (bdlVar == null || !bdlVar.dispatchHoverEvent(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e() {
        if (this.f == null || this.j || this.i == 0.0f) {
            return;
        }
        this.j = true;
        ViewParent parent = getParent();
        if (this.r == null || !(parent instanceof ShortsPlayerViewContainer)) {
            return;
        }
        ((ShortsPlayerViewContainer) parent).a = true;
    }

    public final boolean f() {
        ulx ulxVar = this.h;
        if (ulxVar != null) {
            return ulxVar.a;
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.u && f() && this.i != 0.0f) {
            e();
            this.u = false;
            double d = this.m;
            ShortsPlayerVideoView shortsPlayerVideoView = this.b;
            b((float) (-(d * ((double) shortsPlayerVideoView.getWidth()))));
            c((float) (-(this.n * ((double) shortsPlayerVideoView.getHeight()))));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iRound;
        int iRound2;
        ulx ulxVar = this.h;
        if (ulxVar != null && ulxVar.i == 2) {
            if (this.i == 0.0f) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.r != null && this.j) {
                g(this.s, this.t);
                return;
            }
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            this.s = size;
            this.t = size2;
            g(size, size2);
            return;
        }
        super.onMeasure(i, i2);
        if (this.i != 0.0f) {
            if (this.r != null && this.j) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.s, 1073741824), View.MeasureSpec.makeMeasureSpec(this.t, 1073741824));
                return;
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f = measuredWidth;
            float f2 = measuredHeight;
            float f3 = this.i;
            if (f3 > f / f2) {
                iRound2 = Math.round(f / f3);
                iRound = measuredWidth;
            } else {
                iRound = Math.round(f2 * f3);
                iRound2 = measuredHeight;
            }
            if (iRound == measuredWidth && iRound2 == measuredHeight) {
                e();
            }
            this.s = iRound;
            this.t = iRound2;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824));
        }
    }

    public ShortsPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShortsPlayerView(Context context) {
        this(context, null);
    }
}
