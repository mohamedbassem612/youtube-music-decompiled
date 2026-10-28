package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fj extends ViewGroup.MarginLayoutParams {
    public int a;

    public fj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, he.b);
        this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public fj(int i, int i2) {
        super(i, i2);
        this.a = 8388627;
    }

    public fj(fj fjVar) {
        super((ViewGroup.MarginLayoutParams) fjVar);
        this.a = 0;
        this.a = fjVar.a;
    }

    public fj(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
