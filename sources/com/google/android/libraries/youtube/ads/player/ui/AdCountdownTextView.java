package com.google.android.libraries.youtube.ads.player.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import defpackage.spd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class AdCountdownTextView extends YouTubeTextView {
    public AdCountdownTextView(Context context) {
        super(context);
        a(context, null, 0, 0);
    }

    private static final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        Resources.Theme theme = context.getTheme();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, spd.a, i, i2);
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                typedArrayObtainStyledAttributes.getInt(6, -1);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AdCountdownTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0, 0);
    }

    public AdCountdownTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    public AdCountdownTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }
}
