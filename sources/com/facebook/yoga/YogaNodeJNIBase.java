package com.facebook.yoga;

import android.view.View;
import defpackage.a;
import defpackage.fgy;
import defpackage.fhz;
import defpackage.fib;
import defpackage.fji;
import defpackage.fkw;
import defpackage.fna;
import defpackage.fwl;
import defpackage.fwn;
import defpackage.fwo;
import defpackage.gzj;
import defpackage.kro;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class YogaNodeJNIBase extends fwo implements Cloneable {
    public YogaNodeJNIBase a;
    public float[] arr;
    public List b;
    public long c;
    public Object d;
    public gzj e;
    private int mLayoutDirection;

    public YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        if (j == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.c = j;
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List list = this.b;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i);
        this.b.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.a = this;
        return yogaNodeJNIBase.c;
    }

    @Override // defpackage.fwo
    public final float a() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // defpackage.fwo
    public final float b() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    public final float baseline(float f, float f2) {
        throw null;
    }

    @Override // defpackage.fwo
    public final fwl c() {
        float[] fArr = this.arr;
        int i = fArr != null ? (int) fArr[5] : this.mLayoutDirection;
        if (i == 0) {
            return fwl.INHERIT;
        }
        if (i == 1) {
            return fwl.LTR;
        }
        if (i == 2) {
            return fwl.RTL;
        }
        throw new IllegalArgumentException(a.bR(i, "Unknown enum value: "));
    }

    @Override // defpackage.fwo
    public final Object d() {
        return this.d;
    }

    @Override // defpackage.fwo
    public final void e(fwl fwlVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.c, fwlVar.d);
    }

    @Override // defpackage.fwo
    public final void f(float f) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.c, f);
    }

    @Override // defpackage.fwo
    public final void g(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.c, f);
    }

    @Override // defpackage.fwo
    public final void h(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.c, f);
    }

    @Override // defpackage.fwo
    public final void i(float f) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.c, f);
    }

    @Override // defpackage.fwo
    public final float j(int i) {
        float[] fArr = this.arr;
        if (fArr != null) {
            int i2 = (int) fArr[0];
            if ((i2 & 4) == 4) {
                int i3 = i - 1;
                int i4 = (14 - (1 != (i2 & 1) ? 4 : 0)) - ((i2 & 2) != 2 ? 4 : 0);
                if (i3 == 0) {
                    return fArr[i4];
                }
                if (i3 != 1) {
                    return i3 != 2 ? fArr[i4 + 3] : fArr[i4 + 2];
                }
                return fArr[i4 + 1];
            }
        }
        return 0.0f;
    }

    @Override // defpackage.fwo
    public final float k(int i) {
        float[] fArr = this.arr;
        if (fArr == null || (((int) fArr[0]) & 1) != 1) {
            return 0.0f;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return fArr[6];
        }
        if (i2 != 1) {
            return i2 != 2 ? fArr[9] : fArr[8];
        }
        return fArr[7];
    }

    @Override // defpackage.fwo
    public final float l(int i) {
        float[] fArr = this.arr;
        if (fArr != null) {
            int i2 = (int) fArr[0];
            if ((i2 & 2) == 2) {
                int i3 = 1 != (i2 & 1) ? 4 : 0;
                int i4 = i - 1;
                int i5 = 10 - i3;
                if (i4 == 0) {
                    return fArr[i5];
                }
                if (i4 != 1) {
                    return i4 != 2 ? fArr[13 - i3] : fArr[12 - i3];
                }
                return fArr[11 - i3];
            }
        }
        return 0.0f;
    }

    public final void m() {
        Object obj = this.d;
        if (obj instanceof fwn) {
            ((fwn) obj).a();
        }
    }

    public final long measure(float f, int i, float f2, int i2) {
        int iFloatToRawIntBits;
        int iFloatToRawIntBits2;
        int i3;
        if (this.e == null) {
            throw new RuntimeException("Measure function isn't defined!");
        }
        int iBd = kro.bd(i);
        int iBd2 = kro.bd(i2);
        Object objD = d();
        int iAV = gzj.aV(f, iBd);
        int iAV2 = gzj.aV(f2, iBd2);
        fji fjiVar = (fji) objD;
        if (fjiVar.a.d()) {
            return 0L;
        }
        fgy fgyVarE = fjiVar.c.e();
        if (fna.w) {
            fgyVarE.c();
            View.MeasureSpec.toString(iAV);
            View.MeasureSpec.toString(iAV2);
            int i4 = fgyVarE.j;
        }
        fkw fkwVar = new fkw(Integer.MIN_VALUE, Integer.MIN_VALUE);
        try {
            try {
                ((fji) objD).n(iAV, iAV2, fkwVar);
                int i5 = fkwVar.a;
                if (i5 >= 0 && (i3 = fkwVar.b) >= 0) {
                    fib fibVar = ((fji) objD).m;
                    if (fibVar != null) {
                        fibVar.g = iAV;
                        fibVar.h = iAV2;
                        fibVar.e = i5;
                        fibVar.f = i3;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(i5);
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(i3);
                    fjiVar.j = fkwVar.a;
                    fjiVar.k = fkwVar.b;
                    fjiVar.h = iAV;
                    fjiVar.i = iAV2;
                    return (((long) iFloatToRawIntBits) << 32) | ((long) iFloatToRawIntBits2);
                }
                throw new IllegalStateException("MeasureOutput not set, Component is: " + String.valueOf(fgyVarE) + " WidthSpec: " + fhz.au(iAV) + " HeightSpec: " + fhz.au(iAV2) + " Measured width : " + fkwVar.a + " Measured Height: " + fkwVar.b);
            } catch (Exception e) {
                iFloatToRawIntBits = 0;
                fkwVar.a = 0;
                fkwVar.b = 0;
                gzj.bv(((fji) objD).c.g(), e);
                iFloatToRawIntBits2 = 0;
            }
        } catch (Throwable th) {
            fjiVar.j = fkwVar.a;
            fjiVar.k = fkwVar.b;
            fjiVar.h = iAV;
            fjiVar.i = iAV2;
            throw th;
        }
    }

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }
}
