package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aefh extends ViewGroup {
    public PopupWindow a;
    public boolean b;
    public View c;
    public int d;
    public View e;
    public int f;
    public float g;
    private final int[] h;
    private final Path i;
    private final RectF j;
    private final Paint k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private boolean s;
    private Rect t;

    public aefh(Context context) {
        super(context);
        this.g = 1.0f;
        setWillNotDraw(false);
        this.h = new int[2];
        this.i = new Path();
        this.j = new RectF();
        Paint paint = new Paint();
        this.k = paint;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(aefg.a);
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, twm.c(displayMetrics, 16));
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, twm.c(displayMetrics, 8));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, twm.c(displayMetrics, 1));
        this.n = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, twm.c(displayMetrics, 1));
        this.r = dimensionPixelSize2;
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, twm.c(displayMetrics, 10));
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, twm.c(displayMetrics, 24));
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, twm.c(displayMetrics, 4));
        int color = typedArrayObtainStyledAttributes.getColor(2, tzk.i(context, R.attr.ytThemedBlue));
        int color2 = typedArrayObtainStyledAttributes.getColor(6, 1073741824);
        typedArrayObtainStyledAttributes.recycle();
        paint.setStyle(Paint.Style.FILL);
        float f = dimensionPixelSize;
        paint.setShadowLayer(dimensionPixelSize2, f, f, color2);
        paint.setColor(color);
        if (Build.VERSION.SDK_INT < 28) {
            setLayerType(1, paint);
        }
        this.b = true;
    }

    private static int b(int i, int i2, int i3) {
        return Math.min(i3, Math.max(i2, i));
    }

    private final Point c() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    private final void d(Canvas canvas) {
        int[] iArr = this.h;
        getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        this.e.getLocationOnScreen(iArr);
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        this.e.getLocationInWindow(iArr);
        int i5 = i3 + iArr[0];
        int i6 = i4 + iArr[1];
        iArr[0] = i5;
        iArr[1] = i6;
        canvas.save();
        int i7 = this.d;
        if (a.az(i7)) {
            canvas.translate(this.m - iArr[0], 0.0f);
        } else if (i7 == 5 || i7 == 6) {
            canvas.translate(0.0f, this.m - iArr[1]);
        }
        canvas.drawPath(this.i, this.k);
        canvas.restore();
    }

    public final void a() {
        View view = this.e;
        view.measure(0, 0);
        int[] iArr = this.h;
        view.getLocationInWindow(iArr);
        int measuredWidth = view.getWidth() == 0 ? view.getMeasuredWidth() : view.getWidth();
        int measuredHeight = view.getHeight() == 0 ? view.getMeasuredHeight() : view.getHeight();
        int i = iArr[0];
        int i2 = iArr[1];
        this.t = new Rect(i, i2, measuredWidth + i, measuredHeight + i2);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.save();
        int i = this.d;
        if (i == 2 || i == 6) {
            d(canvas);
        }
        RectF rectF = this.j;
        float f = this.q;
        canvas.drawRoundRect(rectF, f, f, this.k);
        int i2 = this.d;
        if (i2 == 1 || i2 == 5) {
            d(canvas);
        }
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:50:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    /* JADX WARN: Code duplicated, block: B:55:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x012c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0135  */
    /* JADX WARN: Code duplicated, block: B:60:0x0142  */
    /* JADX WARN: Code duplicated, block: B:63:0x0159  */
    /* JADX WARN: Code duplicated, block: B:64:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x017f  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int iHeight;
        int i7;
        int i8;
        int iWidth;
        int measuredWidth;
        int measuredHeight;
        int i9;
        int iHeight2;
        int i10;
        int iWidth2;
        int iHeight3;
        int layoutDirection;
        int i11;
        int i12;
        int i13;
        Path path;
        int i14;
        int i15;
        View view = this.c;
        int i16 = this.d;
        int iWidth3 = 0;
        int i17 = i16 == 6 ? this.o : 0;
        int i18 = this.l;
        view.layout(i18 + i17, (i16 == 2 ? this.o : 0) + i18, ((i3 - i) - i18) - (i16 == 5 ? this.o : 0), ((i4 - i2) - i18) - (i16 == 1 ? this.o : 0));
        Point pointC = c();
        int i19 = pointC.x;
        int i20 = pointC.y;
        int i21 = this.d;
        if (i21 != 1) {
            if (i21 == 2) {
                i5 = this.m;
                i6 = i19 - (i5 << 1);
                iHeight = (i20 - this.t.top) - this.t.height();
            } else if (i21 == 5) {
                int i22 = this.t.left;
                int i23 = this.m;
                i8 = i22 - i23;
                i7 = i20 - (i23 << 1);
            } else {
                if (i21 != 6) {
                    throw new IllegalStateException();
                }
                int iWidth4 = (i19 - this.t.left) - this.t.width();
                int i24 = this.m;
                i7 = i20 - (i24 << 1);
                i8 = iWidth4 - i24;
            }
            measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
            iWidth = this.t.left;
            int i25 = this.t.top;
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
            i9 = this.d;
            if (i9 == 1) {
                if (i9 == 2) {
                    iHeight2 = this.t.height();
                } else {
                    if (i9 == 5) {
                        iWidth2 = -measuredWidth;
                        iHeight3 = (this.t.height() - measuredHeight) / 2;
                    } else if (i9 == 6) {
                        iWidth2 = this.t.width();
                        iHeight3 = (this.t.height() - measuredHeight) / 2;
                    } else {
                        iHeight2 = 0;
                        i10 = 0;
                    }
                    int i26 = iHeight3;
                    i10 = iWidth2;
                    iHeight2 = i26;
                }
                int i27 = i25 + iHeight2;
                int i28 = bac.a;
                layoutDirection = getLayoutDirection();
                if (a.az(this.d)) {
                    i15 = this.f;
                    if (i15 != 1) {
                        if (i15 == 2) {
                            throw new IllegalStateException();
                        }
                        iWidth += (this.t.width() - measuredWidth) / 2;
                    } else if (layoutDirection == 1) {
                        iWidth = (iWidth + this.t.width()) - measuredWidth;
                    }
                } else {
                    iWidth += i10;
                }
                i11 = this.m;
                this.a.update(b(iWidth, i11, (i19 - i11) - measuredWidth), b(i27, i11, (i20 - i11) - measuredHeight), measuredWidth, measuredHeight, true);
                i12 = this.f;
                if (i12 != 1) {
                    iWidth3 = (this.p / 2) + (i11 << 1);
                } else if (i12 == 2) {
                    iWidth3 = this.t.width() / 2;
                }
                if (getLayoutDirection() == 1) {
                    iWidth3 = this.t.width() - iWidth3;
                }
                i13 = iWidth3 + this.t.left;
                path = this.i;
                path.reset();
                i14 = this.d;
                if (i14 == 1) {
                    int i29 = this.p;
                    path.moveTo((i13 - i11) - (i29 / 2), this.j.bottom);
                    path.rLineTo(i29, 0.0f);
                    int i30 = this.o;
                    float f = (-i29) / 2;
                    path.rLineTo(f, i30);
                    path.rLineTo(f, -i30);
                    path.close();
                    return;
                }
                if (i14 == 2) {
                    int i31 = this.p;
                    int i32 = i31 / 2;
                    path.moveTo((i13 - i11) + i32, this.j.top);
                    path.rLineTo(-i31, 0.0f);
                    int i33 = this.o;
                    float f2 = i32;
                    path.rLineTo(f2, -i33);
                    path.rLineTo(f2, i33);
                    path.close();
                    return;
                }
                if (i14 == 5) {
                    float f3 = this.j.right;
                    int iCenterY = this.t.centerY();
                    int i34 = this.p;
                    path.moveTo(f3, (iCenterY - i34) + (i11 / 2));
                    int i35 = this.o;
                    float f4 = i34 / 2;
                    path.rLineTo(i35, f4);
                    path.rLineTo(-i35, f4);
                    path.rLineTo(0.0f, -i34);
                    path.close();
                    return;
                }
                if (i14 == 6) {
                    float f5 = this.j.left;
                    int iCenterY2 = this.t.centerY();
                    int i36 = this.p;
                    path.moveTo(f5, (iCenterY2 - i36) + (i11 / 2));
                    path.rLineTo(0.0f, i36);
                    int i37 = this.o;
                    float f6 = (-i36) / 2;
                    path.rLineTo(-i37, f6);
                    path.rLineTo(i37, f6);
                    path.close();
                }
            }
            iHeight2 = -measuredHeight;
            i10 = 0;
            int i210 = i25 + iHeight2;
            int i211 = bac.a;
            layoutDirection = getLayoutDirection();
            if (a.az(this.d)) {
                i15 = this.f;
                if (i15 != 1) {
                    if (i15 == 2) {
                        throw new IllegalStateException();
                    }
                    iWidth += (this.t.width() - measuredWidth) / 2;
                } else if (layoutDirection == 1) {
                    iWidth = (iWidth + this.t.width()) - measuredWidth;
                }
            } else {
                iWidth += i10;
            }
            i11 = this.m;
            this.a.update(b(iWidth, i11, (i19 - i11) - measuredWidth), b(i210, i11, (i20 - i11) - measuredHeight), measuredWidth, measuredHeight, true);
            i12 = this.f;
            if (i12 != 1) {
                iWidth3 = (this.p / 2) + (i11 << 1);
            } else if (i12 == 2) {
                iWidth3 = this.t.width() / 2;
            }
            if (getLayoutDirection() == 1) {
                iWidth3 = this.t.width() - iWidth3;
            }
            i13 = iWidth3 + this.t.left;
            path = this.i;
            path.reset();
            i14 = this.d;
            if (i14 == 1) {
                int i212 = this.p;
                path.moveTo((i13 - i11) - (i212 / 2), this.j.bottom);
                path.rLineTo(i212, 0.0f);
                int i38 = this.o;
                float f7 = (-i212) / 2;
                path.rLineTo(f7, i38);
                path.rLineTo(f7, -i38);
                path.close();
                return;
            }
            if (i14 == 2) {
                int i39 = this.p;
                int i310 = i39 / 2;
                path.moveTo((i13 - i11) + i310, this.j.top);
                path.rLineTo(-i39, 0.0f);
                int i311 = this.o;
                float f8 = i310;
                path.rLineTo(f8, -i311);
                path.rLineTo(f8, i311);
                path.close();
                return;
            }
            if (i14 == 5) {
                float f9 = this.j.right;
                int iCenterY3 = this.t.centerY();
                int i312 = this.p;
                path.moveTo(f9, (iCenterY3 - i312) + (i11 / 2));
                int i313 = this.o;
                float f10 = i312 / 2;
                path.rLineTo(i313, f10);
                path.rLineTo(-i313, f10);
                path.rLineTo(0.0f, -i312);
                path.close();
                return;
            }
            if (i14 == 6) {
                float f11 = this.j.left;
                int iCenterY4 = this.t.centerY();
                int i314 = this.p;
                path.moveTo(f11, (iCenterY4 - i314) + (i11 / 2));
                path.rLineTo(0.0f, i314);
                int i315 = this.o;
                float f12 = (-i314) / 2;
                path.rLineTo(-i315, f12);
                path.rLineTo(i315, f12);
                path.close();
            }
        }
        i5 = this.m;
        i6 = i19 - (i5 << 1);
        iHeight = this.t.top;
        i7 = iHeight - i5;
        i8 = i6;
        measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
        iWidth = this.t.left;
        int i213 = this.t.top;
        measuredWidth = getMeasuredWidth();
        measuredHeight = getMeasuredHeight();
        i9 = this.d;
        if (i9 == 1) {
            if (i9 == 2) {
                iHeight2 = this.t.height();
            } else {
                if (i9 == 5) {
                    iWidth2 = -measuredWidth;
                    iHeight3 = (this.t.height() - measuredHeight) / 2;
                } else if (i9 == 6) {
                    iWidth2 = this.t.width();
                    iHeight3 = (this.t.height() - measuredHeight) / 2;
                } else {
                    iHeight2 = 0;
                    i10 = 0;
                }
                int i214 = iHeight3;
                i10 = iWidth2;
                iHeight2 = i214;
            }
            int i215 = i213 + iHeight2;
            int i216 = bac.a;
            layoutDirection = getLayoutDirection();
            if (a.az(this.d)) {
                i15 = this.f;
                if (i15 != 1) {
                    if (i15 == 2) {
                        throw new IllegalStateException();
                    }
                    iWidth += (this.t.width() - measuredWidth) / 2;
                } else if (layoutDirection == 1) {
                    iWidth = (iWidth + this.t.width()) - measuredWidth;
                }
            } else {
                iWidth += i10;
            }
            i11 = this.m;
            this.a.update(b(iWidth, i11, (i19 - i11) - measuredWidth), b(i215, i11, (i20 - i11) - measuredHeight), measuredWidth, measuredHeight, true);
            i12 = this.f;
            if (i12 != 1) {
                iWidth3 = (this.p / 2) + (i11 << 1);
            } else if (i12 == 2) {
                iWidth3 = this.t.width() / 2;
            }
            if (getLayoutDirection() == 1) {
                iWidth3 = this.t.width() - iWidth3;
            }
            i13 = iWidth3 + this.t.left;
            path = this.i;
            path.reset();
            i14 = this.d;
            if (i14 == 1) {
                int i217 = this.p;
                path.moveTo((i13 - i11) - (i217 / 2), this.j.bottom);
                path.rLineTo(i217, 0.0f);
                int i316 = this.o;
                float f13 = (-i217) / 2;
                path.rLineTo(f13, i316);
                path.rLineTo(f13, -i316);
                path.close();
                return;
            }
            if (i14 == 2) {
                int i317 = this.p;
                int i318 = i317 / 2;
                path.moveTo((i13 - i11) + i318, this.j.top);
                path.rLineTo(-i317, 0.0f);
                int i319 = this.o;
                float f14 = i318;
                path.rLineTo(f14, -i319);
                path.rLineTo(f14, i319);
                path.close();
                return;
            }
            if (i14 == 5) {
                float f15 = this.j.right;
                int iCenterY5 = this.t.centerY();
                int i3110 = this.p;
                path.moveTo(f15, (iCenterY5 - i3110) + (i11 / 2));
                int i3111 = this.o;
                float f16 = i3110 / 2;
                path.rLineTo(i3111, f16);
                path.rLineTo(-i3111, f16);
                path.rLineTo(0.0f, -i3110);
                path.close();
                return;
            }
            if (i14 == 6) {
                float f17 = this.j.left;
                int iCenterY6 = this.t.centerY();
                int i3112 = this.p;
                path.moveTo(f17, (iCenterY6 - i3112) + (i11 / 2));
                path.rLineTo(0.0f, i3112);
                int i3113 = this.o;
                float f18 = (-i3112) / 2;
                path.rLineTo(-i3113, f18);
                path.rLineTo(i3113, f18);
                path.close();
            }
        }
        iHeight2 = -measuredHeight;
        i10 = 0;
        int i218 = i213 + iHeight2;
        int i219 = bac.a;
        layoutDirection = getLayoutDirection();
        if (a.az(this.d)) {
            i15 = this.f;
            if (i15 != 1) {
                if (i15 == 2) {
                    throw new IllegalStateException();
                }
                iWidth += (this.t.width() - measuredWidth) / 2;
            } else if (layoutDirection == 1) {
                iWidth = (iWidth + this.t.width()) - measuredWidth;
            }
        } else {
            iWidth += i10;
        }
        i11 = this.m;
        this.a.update(b(iWidth, i11, (i19 - i11) - measuredWidth), b(i218, i11, (i20 - i11) - measuredHeight), measuredWidth, measuredHeight, true);
        i12 = this.f;
        if (i12 != 1) {
            iWidth3 = (this.p / 2) + (i11 << 1);
        } else if (i12 == 2) {
            iWidth3 = this.t.width() / 2;
        }
        if (getLayoutDirection() == 1) {
            iWidth3 = this.t.width() - iWidth3;
        }
        i13 = iWidth3 + this.t.left;
        path = this.i;
        path.reset();
        i14 = this.d;
        if (i14 == 1) {
            int i2110 = this.p;
            path.moveTo((i13 - i11) - (i2110 / 2), this.j.bottom);
            path.rLineTo(i2110, 0.0f);
            int i3114 = this.o;
            float f19 = (-i2110) / 2;
            path.rLineTo(f19, i3114);
            path.rLineTo(f19, -i3114);
            path.close();
            return;
        }
        if (i14 == 2) {
            int i3115 = this.p;
            int i3116 = i3115 / 2;
            path.moveTo((i13 - i11) + i3116, this.j.top);
            path.rLineTo(-i3115, 0.0f);
            int i3117 = this.o;
            float f110 = i3116;
            path.rLineTo(f110, -i3117);
            path.rLineTo(f110, i3117);
            path.close();
            return;
        }
        if (i14 == 5) {
            float f111 = this.j.right;
            int iCenterY7 = this.t.centerY();
            int i3118 = this.p;
            path.moveTo(f111, (iCenterY7 - i3118) + (i11 / 2));
            int i3119 = this.o;
            float f112 = i3118 / 2;
            path.rLineTo(i3119, f112);
            path.rLineTo(-i3119, f112);
            path.rLineTo(0.0f, -i3118);
            path.close();
            return;
        }
        if (i14 == 6) {
            float f113 = this.j.left;
            int iCenterY8 = this.t.centerY();
            int i31110 = this.p;
            path.moveTo(f113, (iCenterY8 - i31110) + (i11 / 2));
            path.rLineTo(0.0f, i31110);
            int i31111 = this.o;
            float f114 = (-i31110) / 2;
            path.rLineTo(-i31111, f114);
            path.rLineTo(i31111, f114);
            path.close();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        if (!this.s && (i3 = this.d) != 0) {
            this.d = addn.c(i3, this);
            this.s = true;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.l << 1;
        int i5 = this.n;
        int i6 = this.d;
        int i7 = (size - i4) - i5;
        int i8 = (size2 - i4) - i5;
        if (a.az(i6)) {
            i8 -= this.o;
        } else if (i6 == 5 || i6 == 6) {
            i7 -= this.o;
        }
        this.c.measure(View.MeasureSpec.makeMeasureSpec(Math.min((int) (c().x * this.g), i7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i8, 0));
        if (this.c.getMeasuredHeight() > i8) {
            this.c.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE));
        }
        int measuredWidth = this.c.getMeasuredWidth() + i4;
        int measuredHeight = this.c.getMeasuredHeight() + i4;
        RectF rectF = this.j;
        int i9 = this.d;
        rectF.set(i9 == 6 ? this.o : 0.0f, i9 == 2 ? this.o : 0.0f, measuredWidth + (i9 == 6 ? this.o : 0), measuredHeight + (i9 == 2 ? this.o : 0));
        int iWidth = ((int) rectF.width()) + i5;
        int iHeight = ((int) rectF.height()) + i5;
        int i10 = this.d;
        if (a.az(i10)) {
            iHeight += this.o;
        } else if (i10 == 5 || i10 == 6) {
            iWidth += this.o;
        }
        setMeasuredDimension(iWidth, iHeight);
    }
}
