package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class aezc {
    public final int a;
    public int b;
    public float c;
    public boolean d;
    public int[] e;
    public int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final float n;
    public final float o;
    public final float p;

    protected aezc(Context context, AttributeSet attributeSet, int i, int i2) {
        this.e = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        TypedArray typedArrayA = aeym.a(context, attributeSet, afai.a, i, i2, new int[0]);
        int iE = afba.e(context, typedArrayA, 10, dimensionPixelSize);
        this.a = iE;
        TypedValue typedValuePeekValue = typedArrayA.peekValue(9);
        if (typedValuePeekValue != null) {
            if (typedValuePeekValue.type == 5) {
                this.b = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayA.getResources().getDisplayMetrics()), iE / 2);
                this.d = false;
            } else if (typedValuePeekValue.type == 6) {
                this.c = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.d = true;
            }
        }
        this.g = typedArrayA.getInt(6, 0);
        this.h = typedArrayA.getInt(1, 0);
        this.i = typedArrayA.getDimensionPixelSize(4, 0);
        int iAbs = Math.abs(typedArrayA.getDimensionPixelSize(15, 0));
        this.j = Math.abs(typedArrayA.getDimensionPixelSize(16, iAbs));
        this.k = Math.abs(typedArrayA.getDimensionPixelSize(17, iAbs));
        this.l = Math.abs(typedArrayA.getDimensionPixelSize(11, 0));
        this.m = typedArrayA.getDimensionPixelSize(14, 0);
        this.n = typedArrayA.getFloat(2, 1.0f);
        this.o = typedArrayA.getFloat(13, 0.1f);
        this.p = typedArrayA.getFloat(12, 0.9f);
        if (!typedArrayA.hasValue(3)) {
            this.e = new int[]{afba.J(context, R.attr.colorPrimary, -1)};
        } else if (typedArrayA.peekValue(3).type != 1) {
            this.e = new int[]{typedArrayA.getColor(3, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayA.getResourceId(3, -1));
            this.e = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayA.hasValue(8)) {
            this.f = typedArrayA.getColor(8, -1);
        } else {
            this.f = this.e[0];
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes.recycle();
            this.f = afba.H(this.f, (int) (f * 255.0f));
        }
        typedArrayA.recycle();
    }

    public final int a() {
        if (!this.d) {
            return this.b;
        }
        return (int) (this.a * this.c);
    }

    public void b() {
        if (this.i < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }

    public final boolean c(boolean z) {
        if (this.l <= 0) {
            return false;
        }
        if (z) {
            if (this.j <= 0) {
                return false;
            }
        } else if (this.k <= 0) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        return this.h != 0;
    }

    public final boolean e() {
        return this.g != 0;
    }

    public boolean f() {
        return this.d && this.c == 0.5f;
    }
}
