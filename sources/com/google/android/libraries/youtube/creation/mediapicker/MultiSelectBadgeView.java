package com.google.android.libraries.youtube.creation.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class MultiSelectBadgeView extends FrameLayout {
    public MultiSelectBadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.multi_select_badge_view, (ViewGroup) this, true);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
    }
}
