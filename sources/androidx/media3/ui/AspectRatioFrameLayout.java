package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.dfj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, dfj.a, 0, 0);
            try {
                typedArrayObtainStyledAttributes.getInt(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }
}
