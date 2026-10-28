package defpackage;

import android.graphics.PointF;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qwl extends qvs {
    public String A;
    public String B;
    public float C;
    public int D;
    public qvz E;
    public qwa F;
    public qvy G;
    public qwb H;
    public int I;
    public float J;
    public float K;
    public qwe L;
    public float M;
    public qwg N;
    public qwi O;
    public qwk P;
    public qwj Q;
    public int R;
    public PointF S;
    public PointF T;
    public double U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public boolean Z;
    public float aa;
    public qvx ab;
    public qwh ac;
    public agke ad;
    public int af;
    public static final qvz k = qvz.e;
    public static final qwa l = qwa.f;
    public static final qvy r = qvy.b;
    public static final int ae = 3;
    public static final qwb s = qwb.b;
    public static final qwe t = qwe.b;
    public static final qwg u = qwg.c;
    public static final qwi v = qwi.a;
    public static final qwk w = qwk.a;
    public static final qwj x = qwj.a;
    public static final qvx y = qvx.a;
    public static final qwh z = qwh.a;

    private qwl(qwl qwlVar) {
        super(qwlVar);
        this.A = "";
        this.B = "sans-serif";
        this.C = 1.0f;
        this.D = -16777216;
        this.E = k;
        this.F = l;
        this.G = r;
        this.af = ae;
        this.H = s;
        this.I = 0;
        this.J = 1.0f;
        this.K = 0.0f;
        this.L = t;
        this.M = 2.0f;
        this.N = u;
        this.O = v;
        this.P = w;
        this.Q = x;
        this.R = -16777216;
        this.S = new PointF(0.0f, 0.0f);
        this.T = new PointF(0.0f, 0.0f);
        this.U = 0.0d;
        this.V = 1.0f;
        this.W = 0.0f;
        this.X = 0.0f;
        this.Y = 0.0f;
        this.Z = true;
        this.aa = 0.0f;
        this.ab = y;
        this.ac = z;
        this.ad = agpi.a;
        this.A = qwlVar.A;
        this.B = qwlVar.B;
        this.C = qwlVar.C;
        this.D = qwlVar.D;
        this.E = qwlVar.E;
        this.F = qwlVar.F;
        this.G = qwlVar.G;
        this.af = qwlVar.af;
        this.H = qwlVar.H;
        this.I = qwlVar.I;
        this.J = qwlVar.J;
        this.K = qwlVar.K;
        this.L = qwlVar.L;
        this.M = qwlVar.M;
        this.N = qwlVar.N;
        this.O = qwlVar.O;
        this.P = qwlVar.P;
        this.Q = qwlVar.Q;
        this.V = qwlVar.V;
        this.R = qwlVar.R;
        this.S = qwlVar.S;
        this.T = qwlVar.T;
        this.U = 0.0d;
        this.W = qwlVar.W;
        this.X = qwlVar.X;
        this.Y = qwlVar.Y;
        this.Z = qwlVar.Z;
        this.aa = qwlVar.aa;
        this.ab = qwlVar.ab;
        this.ac = qwlVar.ac;
        this.ad = qwlVar.ad;
    }

    @Override // defpackage.qvu
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qvu clone() {
        return new qwl(this);
    }

    public final void b(float f) {
        ahno.F(Math.signum(f) != -1.0f);
        this.M = f;
    }

    @Override // defpackage.qvu
    public final /* synthetic */ Object clone() {
        return new qwl(this);
    }

    @Override // defpackage.qvs, defpackage.qvu
    public final String toString() {
        String str;
        Locale locale = Locale.US;
        String string = super.toString();
        String str2 = this.A;
        String str3 = this.B;
        Float fValueOf = Float.valueOf(this.C);
        Integer numValueOf = Integer.valueOf(this.D);
        qvz qvzVar = this.E;
        qwa qwaVar = this.F;
        qvy qvyVar = this.G;
        int i = this.af;
        if (i == 1) {
            str = "UNSPECIFIED";
        } else if (i == 2) {
            str = "ALIAS";
        } else if (i != 3) {
            str = i != 4 ? "null" : "SUBPIXEL_ANTI_ALIAS";
        } else {
            str = "ANTI_ALIAS";
        }
        qwb qwbVar = this.H;
        Integer numValueOf2 = Integer.valueOf(this.I);
        Float fValueOf2 = Float.valueOf(this.J);
        Float fValueOf3 = Float.valueOf(this.K);
        qwe qweVar = this.L;
        Float fValueOf4 = Float.valueOf(this.M);
        qwg qwgVar = this.N;
        qwi qwiVar = this.O;
        qwk qwkVar = this.P;
        qwj qwjVar = this.Q;
        Float fValueOf5 = Float.valueOf(this.V);
        Integer numValueOf3 = Integer.valueOf(this.R);
        PointF pointF = this.S;
        PointF pointF2 = this.T;
        Double dValueOf = Double.valueOf(0.0d);
        Float fValueOf6 = Float.valueOf(0.0f);
        return String.format(locale, "TextSegment{%s, text: \"%s\", fontFamily: %s, normalizedFontSize: %f, color: %d, fontWeight: %s, fontWidth: %s, fontSlant: %s, fontEdging: %s, paintStyle: %s, strokeColor: %d, strokeWidth: %f, normalizedStrokeWidth: %f, strokeJoin: %s, strokeMiterLimit: %f, textAlignment: %s, textDecoration: %s, textDecorationStyle: %s, textDecorationMode: %s, textDecorationThicknessMultiplier: %f, textShadowColor: %d, textShadowOffset: %s, normalizedTextShadowOffset: %s, textShadowBlurSigma: %f, normalizedTextShadowBlurSigma: %f, horizontalPadding: %f, normalizedHorizontalPadding: %f, verticalPadding: %f, normalizedVerticalPadding: %f, cornerRadius: %f, normalizedCornerRadius: %f, enableTextWrapping: %b, horizontalBoundaryPadding: %f, backgroundCornerType: %s, phrases: %s, contentMode: %s}", string, str2, str3, fValueOf, numValueOf, qvzVar, qwaVar, qvyVar, str, qwbVar, numValueOf2, fValueOf2, fValueOf3, qweVar, fValueOf4, qwgVar, qwiVar, qwkVar, qwjVar, fValueOf5, numValueOf3, pointF, pointF2, dValueOf, dValueOf, fValueOf6, Float.valueOf(this.W), fValueOf6, Float.valueOf(this.X), fValueOf6, Float.valueOf(this.Y), Boolean.valueOf(this.Z), Float.valueOf(this.aa), this.ab, this.ad, this.ac);
    }

    public qwl() {
        this.A = "";
        this.B = "sans-serif";
        this.C = 1.0f;
        this.D = -16777216;
        this.E = k;
        this.F = l;
        this.G = r;
        this.af = ae;
        this.H = s;
        this.I = 0;
        this.J = 1.0f;
        this.K = 0.0f;
        this.L = t;
        this.M = 2.0f;
        this.N = u;
        this.O = v;
        this.P = w;
        this.Q = x;
        this.R = -16777216;
        this.S = new PointF(0.0f, 0.0f);
        this.T = new PointF(0.0f, 0.0f);
        this.U = 0.0d;
        this.V = 1.0f;
        this.W = 0.0f;
        this.X = 0.0f;
        this.Y = 0.0f;
        this.Z = true;
        this.aa = 0.0f;
        this.ab = y;
        this.ac = z;
        this.ad = agpi.a;
    }
}
