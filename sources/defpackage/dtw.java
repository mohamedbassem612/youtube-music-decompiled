package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dtw extends ViewGroup.LayoutParams {
    public boolean a;
    public int b;
    float c;
    boolean d;
    int e;
    int f;

    public dtw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, duc.a);
        this.b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
    }

    public dtw() {
        super(-1, -1);
        this.c = 0.0f;
    }
}
