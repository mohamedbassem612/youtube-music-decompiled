package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeuo extends FrameLayout.LayoutParams {
    int a;
    float b;

    public aeuo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aeut.d);
        this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.b = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public aeuo() {
        super(-1, -1);
        this.a = 0;
        this.b = 0.5f;
    }

    public aeuo(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
        this.b = 0.5f;
    }
}
