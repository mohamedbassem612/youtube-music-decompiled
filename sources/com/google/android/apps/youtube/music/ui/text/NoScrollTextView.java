package com.google.android.apps.youtube.music.ui.text;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class NoScrollTextView extends YouTubeTextView {
    public NoScrollTextView(Context context) {
        super(context);
    }

    public NoScrollTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NoScrollTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NoScrollTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // com.google.android.libraries.youtube.common.ui.YouTubeTextView, android.view.View
    public final void scrollTo(int i, int i2) {
    }
}
