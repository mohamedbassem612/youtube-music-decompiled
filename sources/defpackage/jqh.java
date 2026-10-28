package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jqh extends ShapeDrawable {
    public int[] a;
    private float[] b;
    private int c;
    private int[] d;
    private float[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqh(float[] fArr) {
        super(new RectShape());
        fArr.getClass();
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        fArrCopyOf.getClass();
        this.b = fArrCopyOf;
    }

    public final void a(int[] iArr, float[] fArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        iArrCopyOf.getClass();
        this.a = iArrCopyOf;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        fArrCopyOf.getClass();
        this.b = fArrCopyOf;
        b();
        invalidateSelf();
    }

    public final void b() {
        int[] iArr;
        float[] fArr;
        Rect bounds = getBounds();
        bounds.getClass();
        int[] iArr2 = this.a;
        int iHeight = bounds.height();
        if (iArr2 == null || iHeight <= 0) {
            getPaint().setShader(null);
            this.c = 0;
            this.d = null;
            return;
        }
        if (getPaint().getShader() == null || iHeight != this.c || (iArr = this.d) == null || !Arrays.equals(iArr, iArr2) || (fArr = this.e) == null || !Arrays.equals(fArr, this.b)) {
            getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, iHeight, iArr2, this.b, Shader.TileMode.CLAMP));
            this.c = iHeight;
            int[] iArrCopyOf = Arrays.copyOf(iArr2, iArr2.length);
            iArrCopyOf.getClass();
            this.d = iArrCopyOf;
            float[] fArr2 = this.b;
            float[] fArrCopyOf = Arrays.copyOf(fArr2, fArr2.length);
            fArrCopyOf.getClass();
            this.e = fArrCopyOf;
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        rect.getClass();
        super.onBoundsChange(rect);
        b();
    }
}
