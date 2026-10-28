package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acdh extends ViewGroup.LayoutParams {
    public final boolean a;

    public acdh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aauz.a);
        this.a = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public acdh(int i, int i2, boolean z) {
        super(i, i2);
        this.a = z;
    }

    public acdh(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = true;
    }
}
