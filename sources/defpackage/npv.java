package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.car.app.model.Alert;
import j$.util.Objects;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class npv extends qa {
    public int a;
    public int b;
    public WeakReference c;
    public int d;
    public int e;
    private final boolean f;
    private final oyg g;
    private final float[] h;
    private final int[] i;
    private final Rect j;
    private final npt k;
    private final npr l;
    private final View.OnAttachStateChangeListener m;

    public npv(boolean z, oyg oygVar) {
        npt nptVar = new npt();
        npr nprVar = new npr();
        super((byte[]) null);
        this.h = new float[]{0.0f, 0.0f};
        this.i = new int[2];
        this.j = new Rect();
        this.d = -1;
        this.e = -1;
        this.f = z;
        this.g = oygVar;
        this.k = nptVar;
        this.l = nprVar;
        this.m = new npu(this, nptVar, nprVar, 0);
    }

    public static void o(View view) {
        if (view != null) {
            try {
                view.setRenderEffect(null);
            } catch (LinkageError | RuntimeException unused) {
            }
        }
    }

    private final void r() {
        this.d = -1;
        this.e = -1;
        this.a = 0;
        this.b = 0;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0197  */
    /* JADX WARN: Code duplicated, block: B:103:0x019d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x019f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:123:0x01df  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:135:0x0206  */
    /* JADX WARN: Code duplicated, block: B:157:0x024d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x024f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x0269  */
    /* JADX WARN: Code duplicated, block: B:168:0x0272  */
    /* JADX WARN: Code duplicated, block: B:171:0x027b  */
    /* JADX WARN: Code duplicated, block: B:173:0x028f  */
    /* JADX WARN: Code duplicated, block: B:176:0x029f  */
    /* JADX WARN: Code duplicated, block: B:183:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.qa
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int iComputeVerticalScrollOffset;
        int iComputeVerticalScrollRange;
        boolean z;
        boolean z2;
        int i2;
        int height;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        float f;
        boolean z5;
        int paddingTop;
        int top;
        int i5;
        int paddingRight;
        boolean z6;
        float f2;
        boolean z7;
        float f3;
        int bottom;
        npt nptVar;
        Rect rect;
        int paddingTop2;
        int paddingBottom;
        int width = recyclerView.getWidth();
        int height2 = recyclerView.getHeight();
        if (width <= 0 || height2 <= 0) {
            this.d = -1;
            return;
        }
        WeakReference weakReference = this.c;
        RecyclerView recyclerView2 = weakReference != null ? (RecyclerView) weakReference.get() : null;
        if (!Objects.equals(recyclerView2, recyclerView)) {
            if (recyclerView2 != null) {
                recyclerView2.removeOnAttachStateChangeListener(this.m);
                this.k.a(recyclerView2);
                o(recyclerView2);
            }
            r();
            recyclerView.addOnAttachStateChangeListener(this.m);
            this.c = new WeakReference(recyclerView);
        }
        npw.b();
        boolean z8 = npw.a() && !(recyclerView.i && (!this.f ? recyclerView.getPaddingTop() > 0 || recyclerView.getPaddingBottom() > 0 : recyclerView.getPaddingLeft() > 0 || recyclerView.getPaddingRight() > 0));
        boolean z9 = this.f;
        boolean z10 = z9 && recyclerView.getLayoutDirection() == 1;
        boolean z11 = recyclerView.i;
        boolean z12 = z10;
        int i6 = true != z9 ? height2 : width;
        if (z11) {
            if (z9) {
                paddingTop2 = recyclerView.getPaddingLeft();
                paddingBottom = recyclerView.getPaddingRight();
            } else {
                paddingTop2 = recyclerView.getPaddingTop();
                paddingBottom = recyclerView.getPaddingBottom();
            }
            i = i6 - (paddingTop2 + paddingBottom);
        } else {
            i = i6;
        }
        int iMax = Math.max(0, i);
        if (iMax != this.e) {
            this.e = iMax;
            oyg oygVar = this.g;
            int[] iArr = this.i;
            oygVar.a(iMax, iArr);
            nqv.g(iArr[0], iArr[1], iMax, iArr);
            this.a = iArr[0];
            this.b = iArr[1];
        }
        if (this.a <= 0 && this.b <= 0) {
            npt nptVar2 = this.k;
            if (nptVar2.a) {
                nptVar2.a(recyclerView);
            }
            this.l.b();
            this.d = -1;
            return;
        }
        if (z9) {
            iComputeVerticalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            iComputeVerticalScrollRange = recyclerView.computeHorizontalScrollRange();
        } else {
            iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            iComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
        }
        int i7 = this.a;
        int i8 = this.b;
        float[] fArr = this.h;
        int childCount = recyclerView.getChildCount();
        if (childCount != 0) {
            nh nhVar = recyclerView.m;
            int iA = nhVar != null ? nhVar.a() : 0;
            z = z8;
            z2 = z9;
            int i9 = 0;
            int i10 = Alert.DURATION_SHOW_INDEFINITELY;
            int i11 = Integer.MIN_VALUE;
            View view = null;
            View view2 = null;
            while (i9 < childCount) {
                int i12 = childCount;
                View childAt = recyclerView.getChildAt(i9);
                int i13 = i6;
                int iD = recyclerView.d(childAt);
                if (iD != -1) {
                    if (iD < i10) {
                        i10 = iD;
                        view = childAt;
                    }
                    if (iD >= i11) {
                        i11 = iD;
                        view2 = childAt;
                    }
                }
                i9++;
                childCount = i12;
                i6 = i13;
            }
            i2 = i6;
            if (z2) {
                height = recyclerView.getWidth();
                z3 = true;
            } else {
                height = recyclerView.getHeight();
                z3 = false;
            }
            if (height <= 0) {
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
            } else {
                int iMax2 = Math.max(0, iComputeVerticalScrollRange - height);
                int iMax3 = (z3 && z12 && iMax2 > 0) ? Math.max(0, iMax2 - iComputeVerticalScrollOffset) : iComputeVerticalScrollOffset;
                if (z3) {
                    if (!z12 || iMax2 <= 0) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (i7 <= 0) {
                        i4 = height;
                        f = 0.0f;
                    } else {
                        if (i10 == 0) {
                            i3 = i10;
                        } else if (view != null) {
                            float f4 = i7;
                            z5 = recyclerView.i;
                            if (z4) {
                                if (z12) {
                                    int right = view.getRight();
                                    if (z5) {
                                        paddingRight = recyclerView.getPaddingRight();
                                    } else {
                                        paddingRight = 0;
                                    }
                                    i5 = right - (height - paddingRight);
                                } else {
                                    if (z5) {
                                        paddingTop = recyclerView.getPaddingLeft();
                                    } else {
                                        paddingTop = 0;
                                    }
                                    top = view.getLeft();
                                }
                                f = nqv.f(i5 / f4);
                                i4 = height;
                            } else {
                                if (z5) {
                                    paddingTop = recyclerView.getPaddingTop();
                                } else {
                                    paddingTop = 0;
                                }
                                top = view.getTop();
                            }
                            i5 = paddingTop - top;
                            f = nqv.f(i5 / f4);
                            i4 = height;
                        } else {
                            i3 = 0;
                        }
                        i4 = height;
                        if (i3 > 0 || i3 >= Integer.MAX_VALUE) {
                            f = nqv.f(iMax3 / i7);
                        } else if (iMax3 > 0) {
                            f = nqv.f(iMax3 / i7);
                        } else {
                            f = 1.0f;
                        }
                    }
                    fArr[0] = f;
                    if (i8 <= 0) {
                        z6 = z12;
                        f2 = 0.0f;
                    } else if (iA > 0 || i11 != iA - 1 || view2 == null) {
                        if (iA > 0 || i11 >= iA - 1 || i11 == Integer.MIN_VALUE) {
                            if (iMax2 > 0) {
                                f2 = nqv.f(iComputeVerticalScrollOffset / i8);
                            } else {
                                z6 = z12;
                                f2 = 0.0f;
                            }
                        } else if (iComputeVerticalScrollOffset > 0) {
                            f2 = nqv.f(iComputeVerticalScrollOffset / i8);
                        } else {
                            z6 = z12;
                            f2 = 1.0f;
                        }
                        z6 = z12;
                    } else {
                        float f5 = i8;
                        boolean z13 = recyclerView.i;
                        if (!z4) {
                            bottom = (view2.getBottom() + (z13 ? recyclerView.getPaddingBottom() : 0)) - i4;
                            z6 = z12;
                        } else if (z12) {
                            bottom = (z13 ? recyclerView.getPaddingLeft() : 0) - view2.getLeft();
                            z6 = true;
                        } else {
                            bottom = (view2.getRight() + (z13 ? recyclerView.getPaddingRight() : 0)) - i4;
                            z6 = false;
                        }
                        f2 = nqv.f(bottom / f5);
                    }
                    fArr[1] = f2;
                    z7 = z6;
                    f3 = f2;
                } else {
                    z4 = false;
                }
                iComputeVerticalScrollOffset = Math.max(0, iMax2 - iComputeVerticalScrollOffset);
                if (i7 <= 0) {
                    i4 = height;
                    f = 0.0f;
                } else {
                    if (i10 == 0) {
                        i3 = i10;
                    } else if (view != null) {
                        float f6 = i7;
                        z5 = recyclerView.i;
                        if (z4) {
                            if (z12) {
                                int right2 = view.getRight();
                                if (z5) {
                                    paddingRight = recyclerView.getPaddingRight();
                                } else {
                                    paddingRight = 0;
                                }
                                i5 = right2 - (height - paddingRight);
                            } else {
                                if (z5) {
                                    paddingTop = recyclerView.getPaddingLeft();
                                } else {
                                    paddingTop = 0;
                                }
                                top = view.getLeft();
                            }
                            f = nqv.f(i5 / f6);
                            i4 = height;
                        } else {
                            if (z5) {
                                paddingTop = recyclerView.getPaddingTop();
                            } else {
                                paddingTop = 0;
                            }
                            top = view.getTop();
                        }
                        i5 = paddingTop - top;
                        f = nqv.f(i5 / f6);
                        i4 = height;
                    } else {
                        i3 = 0;
                    }
                    i4 = height;
                    if (i3 > 0) {
                        f = nqv.f(iMax3 / i7);
                    } else {
                        f = nqv.f(iMax3 / i7);
                    }
                }
                fArr[0] = f;
                if (i8 <= 0) {
                    z6 = z12;
                    f2 = 0.0f;
                } else if (iA > 0) {
                    if (iA > 0) {
                        if (iMax2 > 0) {
                            f2 = nqv.f(iComputeVerticalScrollOffset / i8);
                            z6 = z12;
                        } else {
                            z6 = z12;
                            f2 = 0.0f;
                        }
                    } else if (iMax2 > 0) {
                        f2 = nqv.f(iComputeVerticalScrollOffset / i8);
                        z6 = z12;
                    } else {
                        z6 = z12;
                        f2 = 0.0f;
                    }
                } else if (iA > 0) {
                    if (iMax2 > 0) {
                        f2 = nqv.f(iComputeVerticalScrollOffset / i8);
                        z6 = z12;
                    } else {
                        z6 = z12;
                        f2 = 0.0f;
                    }
                } else if (iMax2 > 0) {
                    f2 = nqv.f(iComputeVerticalScrollOffset / i8);
                    z6 = z12;
                } else {
                    z6 = z12;
                    f2 = 0.0f;
                }
                fArr[1] = f2;
                z7 = z6;
                f3 = f2;
            }
            if (z) {
                if (this.k.b(recyclerView, z2, z7, i2, this.a, this.b, fArr[0], f3)) {
                    this.l.b();
                    this.d = -1;
                    return;
                }
            }
            nptVar = this.k;
            if (nptVar.a) {
                nptVar.a(recyclerView);
            }
            this.d = -1;
            if (fArr[0] <= 0.0f || fArr[1] > 0.0f) {
                rect = this.j;
                if (npr.c(recyclerView, width, height2, rect)) {
                    this.d = canvas.saveLayer(rect.left, rect.top, rect.right, rect.bottom, null);
                }
            }
            return;
        }
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        z = z8;
        z2 = z9;
        i2 = i6;
        z7 = z12;
        f3 = 0.0f;
        if (z) {
            if (this.k.b(recyclerView, z2, z7, i2, this.a, this.b, fArr[0], f3)) {
                this.l.b();
                this.d = -1;
                return;
            }
        }
        nptVar = this.k;
        if (nptVar.a) {
            nptVar.a(recyclerView);
        }
        this.d = -1;
        if (fArr[0] <= 0.0f) {
        }
        rect = this.j;
        if (npr.c(recyclerView, width, height2, rect)) {
            this.d = canvas.saveLayer(rect.left, rect.top, rect.right, rect.bottom, null);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof npv) && ((npv) obj).p(this.f, this.g);
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f), this.g);
    }

    public final void m(RecyclerView recyclerView) {
        byte[] bArr = null;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            new Handler(Looper.getMainLooper()).post(new msh(this, recyclerView, 9, bArr));
            return;
        }
        WeakReference weakReference = this.c;
        RecyclerView recyclerView2 = weakReference != null ? (RecyclerView) weakReference.get() : null;
        if (recyclerView2 != null) {
            recyclerView2.removeOnAttachStateChangeListener(this.m);
            this.k.a(recyclerView2);
            o(recyclerView2);
            this.c = null;
        }
        if (recyclerView != null && !recyclerView.equals(recyclerView2)) {
            recyclerView.removeOnAttachStateChangeListener(this.m);
            this.k.a(recyclerView);
            o(recyclerView);
        }
        this.l.b();
        r();
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01ee A[Catch: all -> 0x0361, TryCatch #1 {all -> 0x0361, blocks: (B:19:0x0048, B:31:0x0072, B:38:0x0085, B:40:0x0089, B:42:0x008d, B:44:0x0091, B:49:0x009c, B:103:0x01d6, B:105:0x01da, B:107:0x01de, B:111:0x01e6, B:113:0x01ea, B:148:0x02a8, B:184:0x034d, B:115:0x01ee, B:120:0x020b, B:122:0x0211, B:125:0x0229, B:127:0x022f, B:130:0x0241, B:132:0x0247, B:135:0x0258, B:137:0x025e, B:140:0x0277, B:142:0x027d, B:145:0x028e, B:147:0x0294, B:57:0x00ab, B:59:0x00af, B:66:0x00bb, B:78:0x010f, B:102:0x01cd, B:81:0x0115, B:83:0x0125, B:85:0x014c, B:84:0x0139, B:86:0x0158, B:71:0x00c6, B:73:0x00d6, B:75:0x00ff, B:74:0x00eb, B:76:0x010a, B:88:0x015e, B:96:0x0198, B:99:0x019e, B:100:0x01ca, B:93:0x0168, B:94:0x0194), top: B:200:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0205 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0207  */
    /* JADX WARN: Code duplicated, block: B:119:0x0209 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0227 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x023d  */
    /* JADX WARN: Code duplicated, block: B:129:0x023f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x0256 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x0273  */
    /* JADX WARN: Code duplicated, block: B:139:0x0275 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x028c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x02ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:172:0x031b  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6 A[Catch: all -> 0x0361, TryCatch #1 {all -> 0x0361, blocks: (B:19:0x0048, B:31:0x0072, B:38:0x0085, B:40:0x0089, B:42:0x008d, B:44:0x0091, B:49:0x009c, B:103:0x01d6, B:105:0x01da, B:107:0x01de, B:111:0x01e6, B:113:0x01ea, B:148:0x02a8, B:184:0x034d, B:115:0x01ee, B:120:0x020b, B:122:0x0211, B:125:0x0229, B:127:0x022f, B:130:0x0241, B:132:0x0247, B:135:0x0258, B:137:0x025e, B:140:0x0277, B:142:0x027d, B:145:0x028e, B:147:0x0294, B:57:0x00ab, B:59:0x00af, B:66:0x00bb, B:78:0x010f, B:102:0x01cd, B:81:0x0115, B:83:0x0125, B:85:0x014c, B:84:0x0139, B:86:0x0158, B:71:0x00c6, B:73:0x00d6, B:75:0x00ff, B:74:0x00eb, B:76:0x010a, B:88:0x015e, B:96:0x0198, B:99:0x019e, B:100:0x01ca, B:93:0x0168, B:94:0x0194), top: B:200:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00eb A[Catch: all -> 0x0361, TryCatch #1 {all -> 0x0361, blocks: (B:19:0x0048, B:31:0x0072, B:38:0x0085, B:40:0x0089, B:42:0x008d, B:44:0x0091, B:49:0x009c, B:103:0x01d6, B:105:0x01da, B:107:0x01de, B:111:0x01e6, B:113:0x01ea, B:148:0x02a8, B:184:0x034d, B:115:0x01ee, B:120:0x020b, B:122:0x0211, B:125:0x0229, B:127:0x022f, B:130:0x0241, B:132:0x0247, B:135:0x0258, B:137:0x025e, B:140:0x0277, B:142:0x027d, B:145:0x028e, B:147:0x0294, B:57:0x00ab, B:59:0x00af, B:66:0x00bb, B:78:0x010f, B:102:0x01cd, B:81:0x0115, B:83:0x0125, B:85:0x014c, B:84:0x0139, B:86:0x0158, B:71:0x00c6, B:73:0x00d6, B:75:0x00ff, B:74:0x00eb, B:76:0x010a, B:88:0x015e, B:96:0x0198, B:99:0x019e, B:100:0x01ca, B:93:0x0168, B:94:0x0194), top: B:200:0x0048 }] */
    @Override // defpackage.qa
    public final void n(Canvas canvas, RecyclerView recyclerView) throws Throwable {
        float f;
        boolean z;
        boolean z2;
        LinearGradient linearGradient;
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        Canvas canvas2 = canvas;
        int i = this.d;
        if (i > 0) {
            this.d = -1;
            if (canvas2.getSaveCount() > i) {
                int width = recyclerView.getWidth();
                int height = recyclerView.getHeight();
                if (width > 0 && height > 0) {
                    Rect rect = this.j;
                    if (npr.c(recyclerView, width, height, rect)) {
                        boolean z3 = this.f;
                        boolean z4 = z3 && recyclerView.getLayoutDirection() == 1;
                        npr nprVar = this.l;
                        int i2 = this.a;
                        int i3 = this.b;
                        float[] fArr = this.h;
                        float f2 = fArr[0];
                        float f3 = fArr[1];
                        if (canvas2.getSaveCount() <= i) {
                            return;
                        }
                        try {
                            canvas2.translate(rect.left, rect.top);
                            int iWidth = rect.width();
                            int iHeight = rect.height();
                            npw.b();
                            if (iWidth > 0 && iHeight > 0 && ((i2 > 0 || i3 > 0) && (f2 > 0.0f || f3 > 0.0f))) {
                                int i4 = true != z3 ? iHeight : iWidth;
                                int[] iArr = nprVar.m;
                                nqv.g(i2, i3, i4, iArr);
                                int i5 = iArr[0];
                                int i6 = iArr[1];
                                boolean z5 = i5 > 0;
                                boolean z6 = i6 > 0;
                                boolean z7 = nprVar.e;
                                try {
                                    if (z7 && (z2 = nprVar.f) == z3 && (z = nprVar.g) == z4) {
                                        f = f3;
                                        if ((nprVar.b != null) == z5) {
                                            if ((nprVar.c != null) == z6) {
                                            }
                                        }
                                        if (nprVar.l || iWidth != nprVar.j || iHeight != nprVar.k || z3 != z2 || z4 != z || i5 != nprVar.h || i6 != nprVar.i) {
                                            nprVar.l = false;
                                            nprVar.j = iWidth;
                                            nprVar.k = iHeight;
                                            nprVar.f = z3;
                                            nprVar.g = z4;
                                            nprVar.h = i5;
                                            nprVar.i = i6;
                                            paint = nprVar.b;
                                            paint2 = nprVar.c;
                                            if (!z3) {
                                                if (i5 > 0 && paint != null && paint.getShader() != null) {
                                                    Matrix matrix = nprVar.d;
                                                    matrix.setScale(1.0f, i5);
                                                    paint.getShader().setLocalMatrix(matrix);
                                                }
                                                if (i6 > 0 && paint2 != null && paint2.getShader() != null) {
                                                    Matrix matrix2 = nprVar.d;
                                                    matrix2.setScale(1.0f, i6);
                                                    matrix2.postTranslate(0.0f, iHeight - i6);
                                                    paint2.getShader().setLocalMatrix(matrix2);
                                                }
                                            } else if (z4) {
                                                if (i5 > 0 && paint != null && paint.getShader() != null) {
                                                    Matrix matrix3 = nprVar.d;
                                                    matrix3.setScale(i5, 1.0f);
                                                    matrix3.postTranslate(iWidth - i5, 0.0f);
                                                    paint.getShader().setLocalMatrix(matrix3);
                                                }
                                                if (i6 > 0 && paint2 != null && paint2.getShader() != null) {
                                                    Matrix matrix4 = nprVar.d;
                                                    matrix4.setScale(i6, 1.0f);
                                                    paint2.getShader().setLocalMatrix(matrix4);
                                                }
                                            } else {
                                                if (i5 > 0 && paint != null && paint.getShader() != null) {
                                                    Matrix matrix5 = nprVar.d;
                                                    matrix5.setScale(i5, 1.0f);
                                                    paint.getShader().setLocalMatrix(matrix5);
                                                }
                                                if (i6 > 0 && paint2 != null && paint2.getShader() != null) {
                                                    Matrix matrix6 = nprVar.d;
                                                    matrix6.setScale(i6, 1.0f);
                                                    matrix6.postTranslate(iWidth - i6, 0.0f);
                                                    paint2.getShader().setLocalMatrix(matrix6);
                                                }
                                            }
                                        }
                                        paint3 = nprVar.b;
                                        paint4 = nprVar.c;
                                        if (z3) {
                                            if (i5 > 0 && f2 > 0.0f && paint3 != null) {
                                                paint3.setAlpha(npr.a(f2));
                                                canvas.drawRect(0.0f, 0.0f, iWidth, i5, paint3);
                                            }
                                            if (i6 <= 0 && f > 0.0f && paint4 != null) {
                                                paint4.setAlpha(npr.a(f));
                                                canvas2 = canvas;
                                                canvas2.drawRect(0.0f, iHeight - i6, iWidth, iHeight, paint4);
                                            }
                                        } else if (z4) {
                                            if (i5 > 0 && f2 > 0.0f && paint3 != null) {
                                                paint3.setAlpha(npr.a(f2));
                                                canvas2.drawRect(iWidth - i5, 0.0f, iWidth, iHeight, paint3);
                                            }
                                            if (i6 > 0 && f > 0.0f && paint4 != null) {
                                                paint4.setAlpha(npr.a(f));
                                                canvas.drawRect(0.0f, 0.0f, i6, iHeight, paint4);
                                            }
                                        } else {
                                            if (i5 > 0 && f2 > 0.0f && paint3 != null) {
                                                paint3.setAlpha(npr.a(f2));
                                                canvas.drawRect(0.0f, 0.0f, i5, iHeight, paint3);
                                            }
                                            if (i6 > 0 && f > 0.0f && paint4 != null) {
                                                paint4.setAlpha(npr.a(f));
                                                canvas.drawRect(iWidth - i6, 0.0f, iWidth, iHeight, paint4);
                                            }
                                        }
                                        canvas2 = canvas;
                                    } else {
                                        f = f3;
                                    }
                                    if (z3) {
                                        if (i5 > 0) {
                                            paint3.setAlpha(npr.a(f2));
                                            canvas.drawRect(0.0f, 0.0f, iWidth, i5, paint3);
                                        }
                                        if (i6 <= 0) {
                                        }
                                    } else if (z4) {
                                        if (i5 > 0) {
                                            paint3.setAlpha(npr.a(f2));
                                            canvas2.drawRect(iWidth - i5, 0.0f, iWidth, iHeight, paint3);
                                        }
                                        if (i6 > 0) {
                                            paint4.setAlpha(npr.a(f));
                                            canvas.drawRect(0.0f, 0.0f, i6, iHeight, paint4);
                                        }
                                    } else {
                                        if (i5 > 0) {
                                            paint3.setAlpha(npr.a(f2));
                                            canvas.drawRect(0.0f, 0.0f, i5, iHeight, paint3);
                                        }
                                        if (i6 > 0) {
                                            paint4.setAlpha(npr.a(f));
                                            canvas.drawRect(iWidth - i6, 0.0f, iWidth, iHeight, paint4);
                                        }
                                    }
                                    canvas2 = canvas;
                                } catch (Throwable th) {
                                    th = th;
                                    canvas2 = canvas;
                                    if (canvas2.getSaveCount() > i) {
                                        canvas2.restoreToCount(i);
                                    }
                                    throw th;
                                }
                                boolean z8 = (z7 && nprVar.f == z3 && nprVar.g == z4) ? false : true;
                                if (z3) {
                                    if (i5 <= 0) {
                                        nprVar.b = null;
                                        z = z4;
                                    } else if (nprVar.b == null) {
                                        nprVar.b = new Paint();
                                        nprVar.b.setXfermode(npr.a);
                                        if (z4) {
                                            linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                                            z = true;
                                        } else {
                                            linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, Shader.TileMode.CLAMP);
                                            z = false;
                                        }
                                        nprVar.b.setShader(linearGradient);
                                        nprVar.l = true;
                                    } else if (z8) {
                                        z8 = true;
                                        nprVar.b = new Paint();
                                        nprVar.b.setXfermode(npr.a);
                                        if (z4) {
                                            linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                                            z = true;
                                        } else {
                                            linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, Shader.TileMode.CLAMP);
                                            z = false;
                                        }
                                        nprVar.b.setShader(linearGradient);
                                        nprVar.l = true;
                                    } else {
                                        z = z4;
                                        z8 = false;
                                    }
                                    if (i6 <= 0) {
                                        nprVar.c = null;
                                    } else if (nprVar.c == null || z8) {
                                        nprVar.c = new Paint();
                                        nprVar.c.setXfermode(npr.a);
                                        nprVar.c.setShader(z4 ? new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
                                        nprVar.l = true;
                                    }
                                } else {
                                    if (i5 <= 0) {
                                        nprVar.b = null;
                                    } else if (nprVar.b == null) {
                                        nprVar.b = new Paint();
                                        nprVar.b.setXfermode(npr.a);
                                        nprVar.b.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, -16777216, 0, Shader.TileMode.CLAMP));
                                        nprVar.l = true;
                                    } else if (z8) {
                                        z8 = true;
                                        nprVar.b = new Paint();
                                        nprVar.b.setXfermode(npr.a);
                                        nprVar.b.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, -16777216, 0, Shader.TileMode.CLAMP));
                                        nprVar.l = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (i6 <= 0) {
                                        nprVar.c = null;
                                    } else if (nprVar.c == null || z8) {
                                        nprVar.c = new Paint();
                                        nprVar.c.setXfermode(npr.a);
                                        nprVar.c.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -16777216, Shader.TileMode.CLAMP));
                                        nprVar.l = true;
                                    }
                                    z = z4;
                                }
                                nprVar.e = true;
                                nprVar.f = z3;
                                nprVar.g = z4;
                                z2 = z3;
                                z4 = z;
                                if (nprVar.l) {
                                    nprVar.l = false;
                                    nprVar.j = iWidth;
                                    nprVar.k = iHeight;
                                    nprVar.f = z3;
                                    nprVar.g = z4;
                                    nprVar.h = i5;
                                    nprVar.i = i6;
                                    paint = nprVar.b;
                                    paint2 = nprVar.c;
                                    if (!z3) {
                                        if (i5 > 0) {
                                            Matrix matrix7 = nprVar.d;
                                            matrix7.setScale(1.0f, i5);
                                            paint.getShader().setLocalMatrix(matrix7);
                                        }
                                        if (i6 > 0) {
                                            Matrix matrix8 = nprVar.d;
                                            matrix8.setScale(1.0f, i6);
                                            matrix8.postTranslate(0.0f, iHeight - i6);
                                            paint2.getShader().setLocalMatrix(matrix8);
                                        }
                                    } else if (z4) {
                                        if (i5 > 0) {
                                            Matrix matrix9 = nprVar.d;
                                            matrix9.setScale(i5, 1.0f);
                                            matrix9.postTranslate(iWidth - i5, 0.0f);
                                            paint.getShader().setLocalMatrix(matrix9);
                                        }
                                        if (i6 > 0) {
                                            Matrix matrix10 = nprVar.d;
                                            matrix10.setScale(i6, 1.0f);
                                            paint2.getShader().setLocalMatrix(matrix10);
                                        }
                                    } else {
                                        if (i5 > 0) {
                                            Matrix matrix11 = nprVar.d;
                                            matrix11.setScale(i5, 1.0f);
                                            paint.getShader().setLocalMatrix(matrix11);
                                        }
                                        if (i6 > 0) {
                                            Matrix matrix12 = nprVar.d;
                                            matrix12.setScale(i6, 1.0f);
                                            matrix12.postTranslate(iWidth - i6, 0.0f);
                                            paint2.getShader().setLocalMatrix(matrix12);
                                        }
                                    }
                                } else {
                                    nprVar.l = false;
                                    nprVar.j = iWidth;
                                    nprVar.k = iHeight;
                                    nprVar.f = z3;
                                    nprVar.g = z4;
                                    nprVar.h = i5;
                                    nprVar.i = i6;
                                    paint = nprVar.b;
                                    paint2 = nprVar.c;
                                    if (!z3) {
                                        if (i5 > 0) {
                                            Matrix matrix13 = nprVar.d;
                                            matrix13.setScale(1.0f, i5);
                                            paint.getShader().setLocalMatrix(matrix13);
                                        }
                                        if (i6 > 0) {
                                            Matrix matrix14 = nprVar.d;
                                            matrix14.setScale(1.0f, i6);
                                            matrix14.postTranslate(0.0f, iHeight - i6);
                                            paint2.getShader().setLocalMatrix(matrix14);
                                        }
                                    } else if (z4) {
                                        if (i5 > 0) {
                                            Matrix matrix15 = nprVar.d;
                                            matrix15.setScale(i5, 1.0f);
                                            matrix15.postTranslate(iWidth - i5, 0.0f);
                                            paint.getShader().setLocalMatrix(matrix15);
                                        }
                                        if (i6 > 0) {
                                            Matrix matrix16 = nprVar.d;
                                            matrix16.setScale(i6, 1.0f);
                                            paint2.getShader().setLocalMatrix(matrix16);
                                        }
                                    } else {
                                        if (i5 > 0) {
                                            Matrix matrix17 = nprVar.d;
                                            matrix17.setScale(i5, 1.0f);
                                            paint.getShader().setLocalMatrix(matrix17);
                                        }
                                        if (i6 > 0) {
                                            Matrix matrix18 = nprVar.d;
                                            matrix18.setScale(i6, 1.0f);
                                            matrix18.postTranslate(iWidth - i6, 0.0f);
                                            paint2.getShader().setLocalMatrix(matrix18);
                                        }
                                    }
                                }
                                paint3 = nprVar.b;
                                paint4 = nprVar.c;
                            }
                            if (canvas2.getSaveCount() > i) {
                                canvas2.restoreToCount(i);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                canvas2.restoreToCount(i);
            }
        }
    }

    public final boolean p(boolean z, oyg oygVar) {
        return this.f == z && this.g.equals(oygVar);
    }
}
