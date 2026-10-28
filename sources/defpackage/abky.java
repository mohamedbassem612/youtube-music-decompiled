package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class abky extends View {
    private int a;
    public int b;
    public int c;
    private int d;
    private int e;
    private int f;
    private float[] g;
    private float[] h;
    private float[] i;
    private int j;
    private int k;
    private Paint l;

    public abky(Context context) {
        super(context);
        a(context, null);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        int i;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i2 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, abkt.a);
            int color = typedArrayObtainStyledAttributes.getColor(2, 2146365166);
            int color2 = typedArrayObtainStyledAttributes.getColor(0, 16777215);
            agrf agrfVar = twm.a;
            displayMetrics.getClass();
            dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, (int) (displayMetrics.density * 40.0f));
            displayMetrics.getClass();
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, (int) (displayMetrics.density * 400.0f));
            typedArrayObtainStyledAttributes.recycle();
            i = color2;
            i2 = color;
        } else {
            i = 0;
            dimensionPixelSize = 0;
            dimensionPixelSize2 = 0;
        }
        Paint paint = new Paint();
        this.l = paint;
        paint.setStyle(Paint.Style.FILL);
        this.g = new float[3];
        this.h = new float[3];
        this.i = new float[3];
        this.a = Color.alpha(i2);
        this.d = Color.alpha(i);
        Color.colorToHSV(i2, this.g);
        Color.colorToHSV(i, this.h);
        this.e = dimensionPixelSize2;
        this.f = dimensionPixelSize;
        b(0.0f);
    }

    public final void b(float f) {
        int i = this.a;
        int i2 = i + ((int) ((this.d - i) * f));
        float[] fArr = this.i;
        float[] fArr2 = this.g;
        float f2 = fArr2[0];
        float[] fArr3 = this.h;
        fArr[0] = f2 + ((fArr3[0] - f2) * f);
        float f3 = fArr2[1];
        fArr[1] = f3 + ((fArr3[1] - f3) * f);
        float f4 = fArr2[2];
        fArr[2] = f4 + ((fArr3[2] - f4) * f);
        this.j = Color.HSVToColor(i2, fArr);
        int i3 = this.e;
        this.k = i3 + ((int) ((this.f - i3) * f));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.l.setColor(this.j);
        canvas.drawCircle(this.b, this.c, this.k, this.l);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(Math.max(1, View.MeasureSpec.getSize(i)), Math.max(1, View.MeasureSpec.getSize(i2)));
    }

    public abky(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public abky(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    public abky(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }
}
