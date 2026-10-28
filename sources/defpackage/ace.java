package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ace {
    public static final double a(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    public static final double b(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d6) : d * d4;
    }

    public static final alo c(alo aloVar, amd amdVar, aln alnVar) {
        if (aloVar.b != 12884901888L) {
            return aloVar;
        }
        aloVar.getClass();
        amb ambVar = (amb) aloVar;
        amd amdVar2 = ambVar.d;
        if (d(amdVar2, amdVar)) {
            return aloVar;
        }
        return new amb(ambVar.a, ambVar.h, amdVar, g(e(alnVar.c, amdVar2.a(), amdVar.a()), ambVar.i), ambVar.k, ambVar.m, ambVar.e, ambVar.f, ambVar.g, -1);
    }

    public static final boolean d(amd amdVar, amd amdVar2) {
        if (amdVar != amdVar2) {
            return Math.abs(amdVar.a - amdVar2.a) < 0.001f && Math.abs(amdVar.b - amdVar2.b) < 0.001f;
        }
        return true;
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        h(fArr, fArr2);
        h(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrF = f(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return g(fArrF, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    public static final float[] f(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        int length = fArr.length;
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        return new float[]{f10 / f13, f11 / f13, f12 / f13, ((f3 * f8) - (f2 * f9)) / f13, ((f9 * f) - (f3 * f7)) / f13, ((f7 * f2) - (f8 * f)) / f13, ((f2 * f6) - (f3 * f5)) / f13, ((f3 * f4) - (f6 * f)) / f13, ((f * f5) - (f2 * f4)) / f13};
    }

    public static final float[] g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = fArr[1];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = (f8 * f2) + (f9 * f4) + (f10 * f6);
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[8];
        float f15 = (f2 * f12) + (f4 * f13) + (f6 * f14);
        float f16 = fArr2[3];
        float f17 = fArr2[4];
        float f18 = fArr2[5];
        float f19 = (f * f16) + (f3 * f17) + (f5 * f18);
        float f20 = (f8 * f16) + (f9 * f17) + (f10 * f18);
        float f21 = (f16 * f12) + (f17 * f13) + (f18 * f14);
        float f22 = fArr2[6];
        float f23 = fArr2[7];
        float f24 = fArr2[8];
        return new float[]{f7, f11, f15, f19, f20, f21, (f * f22) + (f3 * f23) + (f5 * f24), (f8 * f22) + (f9 * f23) + (f10 * f24), (f12 * f22) + (f13 * f23) + (f14 * f24)};
    }

    public static final void h(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    public static final alt i(alo aloVar, alo aloVar2) {
        alt altVar;
        if (aloVar == aloVar2) {
            return new alr(aloVar);
        }
        if (aloVar.b == 12884901888L && aloVar2.b == 12884901888L) {
            aloVar.getClass();
            aloVar2.getClass();
            altVar = new als((amb) aloVar, (amb) aloVar2);
        } else {
            altVar = new alt(aloVar, aloVar2);
        }
        return altVar;
    }

    public static void j(View view, float f) {
        try {
            view.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static float k(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return bcy.a(edgeEffect);
        }
        return 0.0f;
    }

    public static float l(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return bcy.b(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static EdgeEffect m(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? bcy.c(context, attributeSet) : new EdgeEffect(context);
    }
}
