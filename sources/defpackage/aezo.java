package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aezo extends aezc {
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;

    public aezo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray typedArrayA = aeym.a(context, attributeSet, afai.b, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        this.q = typedArrayA.getInt(0, 0);
        this.r = Math.max(afba.e(context, typedArrayA, 4, dimensionPixelSize), this.a << 1);
        this.s = afba.e(context, typedArrayA, 3, dimensionPixelSize2);
        this.t = typedArrayA.getInt(2, 0);
        this.u = typedArrayA.getBoolean(1, true);
        typedArrayA.recycle();
        b();
    }
}
