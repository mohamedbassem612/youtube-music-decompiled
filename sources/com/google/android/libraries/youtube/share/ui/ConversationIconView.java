package com.google.android.libraries.youtube.share.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.aekg;
import defpackage.bac;
import defpackage.twm;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ConversationIconView extends ViewGroup {
    private final SparseArray a;
    private final SparseArray b;
    private final HashSet c;
    private final Paint d;
    private final Paint e;
    private final int f;
    private int g;
    private int h;
    private int i;
    private Canvas j;

    public ConversationIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new SparseArray();
        this.c = new HashSet();
        this.d = new Paint(1);
        Paint paint = new Paint();
        this.e = paint;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aekg.b);
        typedArrayObtainStyledAttributes.getColor(1, -1);
        typedArrayObtainStyledAttributes.getColor(0, -1728053248);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(2, twm.c(displayMetrics, 12));
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, twm.c(displayMetrics, 1));
        int color = typedArrayObtainStyledAttributes.getColor(3, -1);
        typedArrayObtainStyledAttributes.recycle();
        paint.setColor(color);
        setWillNotDraw(false);
    }

    private final int a(int i, int i2, boolean z) {
        return Math.round(((i + i2) * 0.5f) + (this.f * 0.5f * (true == z ? -1 : 1)));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        this.j.drawColor(0, PorterDuff.Mode.CLEAR);
        super.dispatchDraw(this.j);
        canvas.drawCircle(this.g, this.h, this.i, this.d);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            SparseArray sparseArray = this.b;
            if (sparseArray.get(iIntValue) != null) {
                canvas.drawPath((Path) sparseArray.get(iIntValue), this.e);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fA;
        boolean z2;
        float fA2;
        boolean z3;
        int iA;
        boolean z4;
        int iA2;
        boolean z5;
        int iA3;
        boolean z6;
        int iA4;
        boolean z7;
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i5 >= sparseArray.size()) {
                return;
            }
            View view = (View) sparseArray.valueAt(i5);
            int iKeyAt = sparseArray.keyAt(i5);
            int i6 = bac.a;
            int layoutDirection = getLayoutDirection();
            if (iKeyAt == 0) {
                view.layout(paddingLeft, paddingTop, paddingRight, paddingBottom);
            } else if (iKeyAt == 1) {
                if (layoutDirection == 1) {
                    iA = a(paddingLeft, paddingRight, false);
                    z4 = true;
                } else {
                    iA = paddingLeft;
                    z4 = false;
                }
                view.layout(iA, paddingTop, z4 ? paddingRight : a(paddingLeft, paddingRight, true), paddingBottom);
            } else if (iKeyAt == 2) {
                if (layoutDirection == 1) {
                    iA2 = paddingLeft;
                    z5 = true;
                } else {
                    iA2 = a(paddingLeft, paddingRight, false);
                    z5 = false;
                }
                view.layout(iA2, paddingTop, z5 ? a(paddingLeft, paddingRight, true) : paddingRight, paddingBottom);
            } else if (iKeyAt == 3) {
                if (layoutDirection == 1) {
                    iA3 = a(paddingLeft, paddingRight, false);
                    z6 = true;
                } else {
                    iA3 = paddingLeft;
                    z6 = false;
                }
                view.layout(iA3, paddingTop, z6 ? paddingRight : a(paddingLeft, paddingRight, true), a(paddingTop, paddingBottom, true));
            } else if (iKeyAt == 4) {
                if (layoutDirection == 1) {
                    iA4 = a(paddingLeft, paddingRight, false);
                    z7 = true;
                } else {
                    iA4 = paddingLeft;
                    z7 = false;
                }
                view.layout(iA4, a(paddingTop, paddingBottom, false), z7 ? paddingRight : a(paddingLeft, paddingRight, true), paddingBottom);
            }
            SparseArray sparseArray2 = this.b;
            int iKeyAt2 = sparseArray2.keyAt(i5);
            int layoutDirection2 = getLayoutDirection();
            Path path = (Path) sparseArray2.get(iKeyAt2);
            if (iKeyAt2 == 1 || iKeyAt2 == 2) {
                path.addRect(a(paddingLeft, paddingRight, true), paddingTop, a(paddingLeft, paddingRight, false), paddingBottom, Path.Direction.CW);
            } else if (iKeyAt2 == 3) {
                path.addRect(a(paddingLeft, paddingRight, true), paddingTop, a(paddingLeft, paddingRight, false), a(paddingTop, paddingBottom, false), Path.Direction.CW);
                if (layoutDirection2 == 1) {
                    fA = a(paddingLeft, paddingRight, true);
                    z2 = true;
                } else {
                    fA = paddingLeft;
                    z2 = false;
                }
                path.addRect(fA, a(paddingTop, paddingBottom, true), z2 ? paddingRight : a(paddingLeft, paddingRight, false), a(paddingTop, paddingBottom, false), Path.Direction.CW);
            } else if (iKeyAt2 == 4) {
                path.addRect(a(paddingLeft, paddingRight, true), a(paddingTop, paddingBottom, true), a(paddingLeft, paddingRight, false), paddingBottom, Path.Direction.CW);
                if (layoutDirection2 == 1) {
                    fA2 = a(paddingLeft, paddingRight, true);
                    z3 = true;
                } else {
                    fA2 = paddingLeft;
                    z3 = false;
                }
                path.addRect(fA2, a(paddingTop, paddingBottom, true), z3 ? paddingRight : a(paddingLeft, paddingRight, false), a(paddingTop, paddingBottom, false), Path.Direction.CW);
            }
            i5++;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i3 >= sparseArray.size()) {
                measureChildren(i, i2);
                return;
            }
            View view = (View) sparseArray.valueAt(i3);
            int iKeyAt = sparseArray.keyAt(i3);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = iKeyAt == 0 ? measuredWidth : a(0, measuredWidth, true);
            layoutParams.height = (iKeyAt == 0 || iKeyAt == 1 || iKeyAt == 2) ? measuredHeight : a(0, measuredHeight, true);
            i3++;
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i / 2;
        this.g = i5;
        int i6 = i2 / 2;
        this.h = i6;
        this.i = Math.min(i5, i6);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.j = new Canvas(bitmapCreateBitmap);
        this.d.setShader(new BitmapShader(bitmapCreateBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
    }
}
