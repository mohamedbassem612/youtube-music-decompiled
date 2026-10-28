package com.google.android.libraries.youtube.creation.editor;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import defpackage.ulx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ShortsPlayerVideoView extends FrameLayout {
    public final TextureView a;
    public final SurfaceView b;
    public boolean c;
    public float d;
    public ulx e;
    public SurfaceHolder.Callback f;

    public ShortsPlayerVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Matrix();
        this.d = 0.0f;
        View.inflate(context, R.layout.shorts_player_video_view, this);
        View viewFindViewById = findViewById(R.id.video_texture_view);
        viewFindViewById.getClass();
        this.a = (TextureView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.video_surface_view);
        viewFindViewById2.getClass();
        this.b = (SurfaceView) viewFindViewById2;
    }

    public final void a() {
        this.a.setSurfaceTextureListener(null);
        if (this.f != null) {
            SurfaceHolder holder = this.b.getHolder();
            SurfaceHolder.Callback callback = this.f;
            callback.getClass();
            holder.removeCallback(callback);
            this.f = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        ulx ulxVar = this.e;
        if (ulxVar == null || ulxVar.i == 1 || this.d == 0.0f) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        ulx ulxVar2 = this.e;
        if (this.d > (ulxVar2 != null ? ulxVar2.b : 1.0f)) {
            size2 = Math.round(View.MeasureSpec.getSize(i2) * this.d);
        } else {
            size = Math.round(View.MeasureSpec.getSize(i) / this.d);
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            layoutParams.height = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            setLayoutParams(layoutParams);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    public ShortsPlayerVideoView(Context context) {
        this(context, null);
    }
}
