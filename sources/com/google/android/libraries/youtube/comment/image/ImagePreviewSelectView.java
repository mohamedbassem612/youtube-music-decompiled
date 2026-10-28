package com.google.android.libraries.youtube.comment.image;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ImagePreviewSelectView extends FrameLayout {
    public ImagePreviewSelectView(Context context) {
        super(context);
        a();
    }

    private final void a() {
        LayoutInflater.from(getContext()).inflate(R.layout.image_preview_select_view, this);
        new PointF();
        new Matrix();
        new Matrix();
        new RectF();
        findViewById(R.id.select_square);
        findViewById(R.id.start_mark);
        findViewById(R.id.end_mark);
        findViewById(R.id.top_mark);
        findViewById(R.id.bottom_mark);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public ImagePreviewSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ImagePreviewSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
