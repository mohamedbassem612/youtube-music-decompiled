package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.elements.interfaces.ByteStore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aefr extends ViewGroup {
    private final int A;
    private final int B;
    private final Rect C;
    private final int[] D;
    private final Point E;
    private aefi F;
    private View G;
    private int H;
    private int I;
    private int J;
    private int K;
    private final int L;
    private boolean M;
    private int N;
    boolean a;
    boolean b;
    final int c;
    final int d;
    final RectF e;
    final int f;
    public final Context g;
    int h;
    PopupWindow i;
    public aefq j;
    public boolean k;
    public boolean l;
    public boolean m;
    public View n;
    boolean o;
    int p;
    int q;
    public float r;
    final boolean s;
    final boolean t;
    ByteStore u;
    String v;
    boolean w;
    int x;
    private final Path y;
    private final Paint z;

    public aefr(Context context, int i, boolean z, boolean z2) {
        super(context);
        this.C = new Rect();
        this.D = new int[2];
        this.E = new Point();
        this.q = 0;
        this.r = 1.0f;
        this.J = 0;
        this.K = 0;
        this.w = false;
        this.M = false;
        this.x = 1;
        this.N = 0;
        this.g = context;
        this.s = z;
        this.t = z2;
        setWillNotDraw(false);
        this.y = new Path();
        this.e = new RectF();
        Paint paint = new Paint(1);
        this.z = paint;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, aefg.a, 0, i);
        this.A = z ? 0 : typedArrayObtainStyledAttributes.getDimensionPixelSize(5, twm.c(displayMetrics, 16));
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, twm.c(displayMetrics, 8));
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, twm.c(displayMetrics, 8));
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, twm.c(displayMetrics, 10));
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, twm.c(displayMetrics, 24));
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, twm.c(displayMetrics, 2));
        int color = typedArrayObtainStyledAttributes.getColor(2, tzk.i(context, R.attr.ytThemedBlue));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.L = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(6, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (dimensionPixelSize2 > 0) {
            paint.setStyle(Paint.Style.FILL);
            float f = dimensionPixelSize;
            paint.setShadowLayer(dimensionPixelSize2, f, f, color2);
        }
        e(color);
        this.k = true;
        this.l = true;
        this.m = false;
    }

    private static int g(int i, int i2, int i3) {
        return Math.min(i3, Math.max(i2, i));
    }

    private static Activity h(Context context) {
        for (int i = 0; i < 10 && context != null; i++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (context instanceof ContextWrapper) {
                context = h(((ContextWrapper) context).getBaseContext());
            }
        }
        return null;
    }

    private final void i(Canvas canvas) {
        canvas.save();
        int i = this.q;
        if (a.az(i)) {
            canvas.translate(this.f - this.J, 0.0f);
        } else if (i == 3 || i == 4) {
            canvas.translate(0.0f, this.f - this.K);
        }
        canvas.drawPath(this.y, this.z);
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    private final void j() {
        int i;
        int iHeight;
        int iHeight2;
        boolean zAz;
        Rect rect;
        int iWidth;
        int i2;
        int i3;
        int i4;
        int iWidth2;
        Point point = this.E;
        a(point);
        int i5 = point.x;
        int i6 = point.y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i7 = this.q;
        if (i7 != 1) {
            if (i7 == 2) {
                iHeight2 = this.C.height();
            } else if (i7 == 3) {
                i = -measuredWidth;
                iHeight = (this.C.height() - measuredHeight) / 2;
            } else if (i7 == 4) {
                Rect rect2 = this.C;
                int iWidth3 = rect2.width();
                iHeight = (rect2.height() - measuredHeight) / 2;
                i = iWidth3;
            } else {
                i = 0;
                iHeight = 0;
            }
            int i8 = bac.a;
            this.M = getLayoutDirection() == 1;
            zAz = a.az(this.q);
            rect = this.C;
            if (zAz) {
                i2 = rect.top + iHeight;
                i3 = this.H;
                if (i3 != 1) {
                    if (i3 != 2) {
                        iWidth = rect.left + ((rect.width() - measuredWidth) / 2);
                    } else {
                        if (i3 == 3) {
                            throw new IllegalStateException();
                        }
                        if (this.M) {
                            iWidth = rect.left;
                        } else {
                            i4 = rect.left;
                            iWidth2 = rect.width();
                            iWidth = (i4 + iWidth2) - measuredWidth;
                        }
                    }
                } else if (this.M) {
                    i4 = rect.left;
                    iWidth2 = rect.width();
                    iWidth = (i4 + iWidth2) - measuredWidth;
                } else {
                    iWidth = rect.left;
                }
            } else {
                iWidth = rect.left + i;
                i2 = rect.top + iHeight;
            }
            int i9 = this.f;
            this.J = g(iWidth, i9, (i5 - i9) - measuredWidth);
            this.K = g(i2, i9, (i6 - i9) - measuredHeight);
        }
        iHeight2 = -measuredHeight;
        iHeight = iHeight2;
        i = 0;
        int i10 = bac.a;
        this.M = getLayoutDirection() == 1;
        zAz = a.az(this.q);
        rect = this.C;
        if (zAz) {
            i2 = rect.top + iHeight;
            i3 = this.H;
            if (i3 != 1) {
                if (i3 != 2) {
                    iWidth = rect.left + ((rect.width() - measuredWidth) / 2);
                } else {
                    if (i3 == 3) {
                        throw new IllegalStateException();
                    }
                    if (this.M) {
                        iWidth = rect.left;
                    } else {
                        i4 = rect.left;
                        iWidth2 = rect.width();
                        iWidth = (i4 + iWidth2) - measuredWidth;
                    }
                }
            } else if (this.M) {
                i4 = rect.left;
                iWidth2 = rect.width();
                iWidth = (i4 + iWidth2) - measuredWidth;
            } else {
                iWidth = rect.left;
            }
        } else {
            iWidth = rect.left + i;
            i2 = rect.top + iHeight;
        }
        int i11 = this.f;
        this.J = g(iWidth, i11, (i5 - i11) - measuredWidth);
        this.K = g(i2, i11, (i6 - i11) - measuredHeight);
    }

    private final boolean k() {
        TextView textView = (TextView) this.n.findViewById(R.id.action_button);
        TextView textView2 = (TextView) this.n.findViewById(R.id.dismiss_button);
        if (textView == null || textView.getVisibility() != 0) {
            return textView2 != null && textView2.getVisibility() == 0;
        }
        return true;
    }

    final void a(Point point) {
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
    }

    public final void b(int i) {
        if (this.i != null) {
            aefi aefiVar = this.F;
            if (aefiVar != null && (aefiVar.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.F.getParent()).removeView(this.F);
                this.F = null;
            }
            this.i.setOnDismissListener(null);
            this.i.dismiss();
            aefq aefqVar = this.j;
            if (aefqVar != null) {
                aefqVar.a(i);
            }
        }
    }

    public final void c(View view, Rect rect, int i, int i2, int i3) {
        this.G = view;
        d(rect);
        this.p = i;
        this.q = 0;
        this.H = i2;
        this.I = i3;
        this.o = true;
    }

    public final void d(Rect rect) {
        this.C.set(rect);
    }

    public final void e(int i) {
        Paint paint = this.z;
        paint.setColor(i);
        if (Build.VERSION.SDK_INT < 28) {
            setLayerType(1, paint);
        }
    }

    public final void f() {
        aefr aefrVar;
        this.i.setClippingEnabled(false);
        this.i.setAnimationStyle(android.R.style.Animation.Dialog);
        if (this.m || this.I == 1) {
            boolean z = this.I == 1;
            aefrVar = this;
            aefrVar.F = new aefi(this.g, aefrVar, this.G, this.k, this.l);
            if (aefrVar.G.getRootView() instanceof ViewGroup) {
                ((ViewGroup) aefrVar.G.getRootView()).addView(aefrVar.F);
            }
            aefrVar.i.setOutsideTouchable(false);
            aefrVar.F.f = z;
        } else {
            this.i.setBackgroundDrawable(new BitmapDrawable(this.g.getResources(), ""));
            this.i.setOutsideTouchable(this.k);
            this.i.setOnDismissListener(new acya(this, 5));
            aefrVar = this;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            aefrVar.j();
            aefrVar.i.setWidth(aefrVar.getMeasuredWidth());
            aefrVar.i.setHeight(aefrVar.getMeasuredHeight());
        }
        Activity activityH = h(aefrVar.g);
        if (activityH == null || activityH.isDestroyed() || activityH.isFinishing()) {
            return;
        }
        aefrVar.i.showAtLocation(aefrVar.G, 0, aefrVar.J, aefrVar.K);
        if (aefrVar.s) {
            aefrVar.G.postDelayed(new acqu(aefrVar, 19), 300L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8  */
    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 5;
        if (this.s) {
            if (!this.t) {
                zvp.a(zvn.b, zvm.z, "Invalid entity store or entity key: could not show tooltip arrow correctly");
                return;
            }
            if (this.q == 0) {
                this.q = aefs.a(this.p, this);
            }
            int width = this.N - this.J;
            if (this.M) {
                width = this.i.getWidth() - width;
            }
            int iM = twm.m(this.g.getResources().getDisplayMetrics(), width - (this.d / 2));
            if (this.a) {
                int i7 = this.q;
                if (i7 == 1) {
                    this.x = 4;
                } else if (i7 == 2) {
                    this.x = 2;
                } else if (this.b) {
                    i = this.q;
                    if (i == 1) {
                        this.x = 5;
                    } else if (i == 2) {
                        this.x = 3;
                    }
                }
            } else if (this.b) {
                i = this.q;
                if (i == 1) {
                    this.x = 5;
                } else if (i == 2) {
                    this.x = 3;
                }
            }
            ByteStore byteStore = this.u;
            String str = this.v;
            aihf aihfVarCreateBuilder = aqoa.a.createBuilder();
            int i8 = this.q;
            if (i8 == 1) {
                i6 = 2;
            } else if (i8 == 2) {
                i6 = 3;
            } else if (i8 == 3) {
                i6 = 4;
            } else if (i8 != 4) {
                throw new IllegalStateException();
            }
            aihfVarCreateBuilder.copyOnWrite();
            aqoa aqoaVar = (aqoa) aihfVarCreateBuilder.instance;
            aqoaVar.c = i6 - 1;
            aqoaVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            aqoa aqoaVar2 = (aqoa) aihfVarCreateBuilder.instance;
            aqoaVar2.b |= 2;
            aqoaVar2.d = iM;
            int i9 = this.x;
            aihfVarCreateBuilder.copyOnWrite();
            aqoa aqoaVar3 = (aqoa) aihfVarCreateBuilder.instance;
            int i10 = i9 - 1;
            if (i9 == 0) {
                throw null;
            }
            aqoaVar3.e = i10;
            aqoaVar3.b |= 4;
            boolean z = this.M;
            aihfVarCreateBuilder.copyOnWrite();
            aqoa aqoaVar4 = (aqoa) aihfVarCreateBuilder.instance;
            aqoaVar4.b |= 32;
            aqoaVar4.f = z;
            byteStore.set(str, ((aqoa) aihfVarCreateBuilder.build()).toByteArray());
            return;
        }
        canvas.save();
        int i11 = this.q;
        if (i11 == 2 || i11 == 4) {
            i(canvas);
        }
        int i12 = this.h;
        if (this.a) {
            int i13 = this.q;
            if (i13 == 2) {
                i2 = i12;
                i3 = i2;
                i4 = i3;
                i12 = 0;
            } else if (i13 == 1) {
                i2 = i12;
                i3 = i2;
                i4 = 0;
            } else if (this.b) {
                i5 = this.q;
                if (i5 == 2) {
                    i3 = i12;
                    i4 = i3;
                    i2 = 0;
                } else if (i5 == 1) {
                    i2 = i12;
                    i4 = i2;
                    i3 = 0;
                } else {
                    i2 = i12;
                    i3 = i2;
                    i4 = i3;
                }
            } else {
                i2 = i12;
                i3 = i2;
                i4 = i3;
            }
        } else if (this.b) {
            i2 = i12;
            i3 = i2;
            i4 = i3;
        } else {
            i5 = this.q;
            if (i5 == 2) {
                i3 = i12;
                i4 = i3;
                i2 = 0;
            } else if (i5 == 1) {
                i2 = i12;
                i4 = i2;
                i3 = 0;
            } else {
                i2 = i12;
                i3 = i2;
                i4 = i3;
            }
        }
        float f = i12;
        float f2 = i2;
        float f3 = i3;
        float f4 = i4;
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        Path path = new Path();
        path.addRoundRect(this.e, fArr, Path.Direction.CW);
        canvas.drawPath(path, this.z);
        int i14 = this.q;
        if (i14 == 1 || i14 == 3) {
            i(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iWidth;
        int i5;
        int i6;
        int i7 = (i4 - i2) - (k() ? this.B : this.A);
        int i8 = this.A;
        int i9 = i3 - i;
        boolean z2 = this.s;
        int i10 = i9 - i8;
        View view = this.n;
        if (z2) {
            view.layout(i8, i8, i10, i7);
        } else {
            int i11 = this.q;
            view.layout((i11 == 4 ? this.c : 0) + i8, i8 + (i11 == 2 ? this.c : 0), i10 - (i11 == 3 ? this.c : 0), i7 - (i11 == 1 ? this.c : 0));
        }
        aefi aefiVar = this.F;
        if (aefiVar != null) {
            aefiVar.postInvalidate();
        }
        j();
        this.i.update(this.J, this.K, getMeasuredWidth(), getMeasuredHeight(), true);
        int i12 = this.H;
        if (i12 == 1) {
            iWidth = (this.d / 2) + (this.f << 1);
        } else if (i12 == 2) {
            iWidth = this.C.width() / 2;
        } else {
            if (i12 != 3) {
                throw new IllegalStateException();
            }
            iWidth = (this.C.width() - (this.d / 2)) - (this.f << 1);
        }
        this.N = iWidth;
        int i13 = bac.a;
        if (getLayoutDirection() == 1) {
            this.N = this.C.width() - this.N;
        }
        int i14 = this.N;
        Rect rect = this.C;
        this.N = i14 + rect.left;
        Path path = this.y;
        path.reset();
        int i15 = this.q;
        if (i15 == 1) {
            int i16 = this.N - this.f;
            int i17 = this.d;
            path.moveTo(i16 - (i17 / 2), this.e.bottom);
            path.rLineTo(i17, 0.0f);
            float f = (-i17) / 2.0f;
            int i18 = this.c;
            path.rLineTo(f, i18);
            path.rLineTo(f, -i18);
            path.close();
        } else if (i15 == 2) {
            int i19 = this.N - this.f;
            int i20 = this.d;
            path.moveTo(i19 + (i20 / 2), this.e.top);
            path.rLineTo(-i20, 0.0f);
            float f2 = i20 / 2.0f;
            int i21 = this.c;
            path.rLineTo(f2, -i21);
            path.rLineTo(f2, i21);
            path.close();
        } else if (i15 == 3) {
            float f3 = this.e.right;
            int iCenterY = rect.centerY();
            int i22 = this.d;
            path.moveTo(f3, (iCenterY - i22) + (this.f / 2));
            int i23 = this.c;
            float f4 = i22 / 2.0f;
            path.rLineTo(i23, f4);
            path.rLineTo(-i23, f4);
            path.rLineTo(0.0f, -i22);
            path.close();
        } else if (i15 == 4) {
            float f5 = this.e.left;
            int iCenterY2 = rect.centerY();
            int i24 = this.d;
            path.moveTo(f5, (iCenterY2 - i24) + (this.f / 2));
            path.rLineTo(0.0f, i24);
            int i25 = this.c;
            float f6 = (-i24) / 2.0f;
            path.rLineTo(-i25, f6);
            path.rLineTo(i25, f6);
            path.close();
        }
        Point point = this.E;
        a(point);
        int i26 = this.f;
        int i27 = this.h + i26;
        int i28 = this.d / 2;
        int i29 = (point.x - i26) - this.h;
        boolean z3 = this.M;
        int i30 = this.N;
        if (z3) {
            i5 = (i30 - i26) + i28;
            i6 = (i30 - i26) - i28;
        } else {
            i5 = (i30 - i26) - i28;
            i6 = (i30 - i26) + i28;
        }
        if (i5 <= i27 + i28) {
            this.a = true;
        } else if (i6 >= i29 - i28) {
            this.b = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.q == 0 && this.o) {
            this.q = aefs.a(this.p, this);
        }
        int[] iArr = this.D;
        Point point = this.E;
        a(point);
        int i8 = point.x;
        int iHeight = point.y;
        int i9 = this.q;
        if (i9 != 1) {
            if (i9 == 2) {
                i7 = this.f;
                i3 = i8 - (i7 << 1);
                Rect rect = this.C;
                iHeight = (iHeight - rect.top) - rect.height();
            } else if (i9 == 3) {
                Rect rect2 = this.C;
                int i10 = this.f;
                i3 = rect2.left - i10;
                i7 = i10 << 1;
            } else {
                if (i9 != 4) {
                    throw new IllegalStateException();
                }
                Rect rect3 = this.C;
                int iWidth = (i8 - rect3.left) - rect3.width();
                int i11 = this.f;
                i4 = iHeight - (i11 << 1);
                i3 = iWidth - i11;
            }
            i4 = iHeight - i7;
        } else {
            int i12 = this.f;
            i3 = i8 - (i12 << 1);
            i4 = this.C.top - i12;
        }
        iArr[0] = i3;
        iArr[1] = i4;
        int i13 = this.A;
        int i14 = i13 << 1;
        int i15 = i3 - i14;
        int i16 = this.L;
        int i17 = k() ? (i4 - i13) - this.B : (i4 - i14) - i16;
        int i18 = i15 - i16;
        boolean z = this.s;
        if (!z) {
            int i19 = this.q;
            if (a.az(i19)) {
                i17 -= this.c;
            } else if (i19 == 3 || i19 == 4) {
                i18 -= this.c;
            }
        }
        int i20 = i18;
        int i21 = i17;
        a(point);
        this.n.measure(View.MeasureSpec.makeMeasureSpec(Math.min((int) (point.x * this.r), i20), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i21, 0));
        if (!z || this.w) {
            i5 = i21;
            i6 = Integer.MIN_VALUE;
        } else {
            if (a.az(this.q) && this.n.getMeasuredHeight() + this.c > i21) {
                this.p = this.p == 1 ? 2 : 1;
                this.w = true;
            } else if (!a.az(this.q) && this.n.getMeasuredWidth() + this.c > i20) {
                this.p = this.p == 3 ? 4 : 3;
                this.w = true;
            }
            if (this.w) {
                i6 = Integer.MIN_VALUE;
                i5 = i21;
                c(this.G, this.C, this.p, this.H, this.I);
            } else {
                i5 = i21;
                i6 = Integer.MIN_VALUE;
            }
        }
        if (this.n.getMeasuredHeight() > i5) {
            this.n.measure(View.MeasureSpec.makeMeasureSpec(i20, i6), View.MeasureSpec.makeMeasureSpec(i5, i6));
        }
        int measuredWidth = this.n.getMeasuredWidth() + i13;
        boolean zK = k();
        View view = this.n;
        int measuredHeight = zK ? view.getMeasuredHeight() + i13 + this.B : view.getMeasuredHeight() + i14;
        RectF rectF = this.e;
        if (z) {
            rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        } else {
            int i22 = this.q;
            rectF.set(i22 == 4 ? this.c : 0.0f, i22 == 2 ? this.c : 0.0f, measuredWidth + (i22 == 4 ? this.c : 0), measuredHeight + (i22 == 2 ? this.c : 0));
        }
        RectF rectF2 = this.e;
        int iWidth2 = ((int) rectF2.width()) + i16;
        int iHeight2 = ((int) rectF2.height()) + i16;
        if (!z) {
            int i23 = this.q;
            if (a.az(i23)) {
                iHeight2 += this.c;
            } else if (i23 == 3 || i23 == 4) {
                iWidth2 += this.c;
            }
        }
        setMeasuredDimension(iWidth2, iHeight2);
    }
}
