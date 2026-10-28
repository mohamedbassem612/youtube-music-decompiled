package com.google.android.apps.youtube.music.signin;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;
import defpackage.ivl;
import defpackage.ivm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class OnboardingVideoView extends ViewGroup {
    public final VideoView a;
    public final View b;

    public OnboardingVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        VideoView videoView = new VideoView(context);
        this.a = videoView;
        videoView.setOnPreparedListener(new ivl(this));
        videoView.setOnErrorListener(new ivm());
        addView(videoView);
        View view = new View(context);
        this.b = view;
        view.setBackgroundColor(-16777216);
        addView(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        VideoView videoView = this.a;
        int i5 = i3 - i;
        int measuredWidth = videoView.getMeasuredWidth();
        int i6 = i4 - i2;
        int measuredHeight = videoView.getMeasuredHeight();
        videoView.layout((i5 - measuredWidth) / 2, (i6 - measuredHeight) / 2, (measuredWidth + i5) / 2, (measuredHeight + i6) / 2);
        this.b.layout(0, 0, i5, i6);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = size;
        float f2 = size2 * 0.6666667f;
        VideoView videoView = this.a;
        if (f2 > f) {
            videoView.measure(View.MeasureSpec.makeMeasureSpec((int) f2, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            videoView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f / 0.6666667f), 1073741824));
        }
    }
}
