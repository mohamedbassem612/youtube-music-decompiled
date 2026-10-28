package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afah extends aezc {
    public final int q;
    public final int r;
    public boolean s;
    public final int t;
    public Integer u;
    public int v;
    public float w;
    public boolean x;
    public boolean y;

    public afah(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        TypedArray typedArrayA = aeym.a(context, attributeSet, afai.c, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        this.q = typedArrayA.getInt(0, 1);
        int i = typedArrayA.getInt(1, 0);
        this.r = i;
        this.t = typedArrayA.getDimensionPixelSize(4, 0);
        if (typedArrayA.hasValue(3)) {
            this.u = Integer.valueOf(typedArrayA.getDimensionPixelSize(3, 0));
        }
        TypedValue typedValuePeekValue = typedArrayA.peekValue(2);
        if (typedValuePeekValue != null) {
            if (typedValuePeekValue.type == 5) {
                this.v = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayA.getResources().getDisplayMetrics()), this.a / 2);
                this.x = false;
                this.y = true;
            } else if (typedValuePeekValue.type == 6) {
                this.w = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.x = true;
                this.y = true;
            }
        }
        typedArrayA.recycle();
        b();
        this.s = i == 1;
    }

    @Override // defpackage.aezc
    public final void b() {
        super.b();
        if (this.t < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.q == 0) {
            if ((a() > 0 || (this.y && g() > 0)) && this.i == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.e.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    @Override // defpackage.aezc
    public final boolean f() {
        return super.f() && g() == a();
    }

    public final int g() {
        if (!this.y) {
            return a();
        }
        if (!this.x) {
            return this.v;
        }
        return (int) (this.a * this.w);
    }
}
