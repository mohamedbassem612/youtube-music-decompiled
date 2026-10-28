package com.google.android.libraries.youtube.creation.videoeffects.stickers.interactivestickers.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class FacepileView extends FrameLayout {
    public FacepileView(Context context) {
        super(context, null);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(R.layout.facepile_view, (ViewGroup) this, true);
    }

    public FacepileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public FacepileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
