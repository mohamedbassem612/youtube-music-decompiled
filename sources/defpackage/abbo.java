package defpackage;

import android.os.VibrationEffect;
import android.os.Vibrator;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abbo {
    public long A;
    public long B;
    public int E;
    private final Vibrator F;
    private final boolean G;
    private long H;
    private int I;
    public final agfx a;
    public boolean b;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public long o;
    public boolean r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;
    public final float[] C = new float[5];
    public final float[] D = new float[5];
    public final VibrationEffect p = VibrationEffect.createOneShot(10, 32);
    public final VibrationEffect q = VibrationEffect.createOneShot(10, 96);
    public final float g = 1.9547695f;
    public final float h = 1.5358905f;
    public final float i = 0.8726665f;

    public abbo(agfx agfxVar, Vibrator vibrator, boolean z) {
        this.G = z;
        this.a = agfxVar;
        this.F = vibrator;
        d();
    }

    public final float a() {
        if (!this.b || Math.abs(this.e - 1.74533f) >= 0.2094395f) {
            return this.e;
        }
        return 1.74533f;
    }

    public final void b(float f) {
        float f2 = this.v;
        float f3 = this.t + f2;
        if (f3 > f) {
            this.t = f - f2;
            if (this.y <= 0.0f) {
                return;
            }
        } else {
            float f4 = -f;
            if (f3 >= f4) {
                return;
            }
            this.t = f4 - f2;
            if (this.y >= 0.0f) {
                return;
            }
        }
        this.y = 0.0f;
    }

    public final void c() {
        this.f = this.e;
        this.c = true;
        this.d = true;
        this.k = false;
        this.b = false;
        this.z = 0.0f;
        this.y = 0.0f;
        this.n = 0;
    }

    public final void d() {
        this.k = false;
        this.c = false;
        this.d = false;
        this.t = 0.0f;
        this.v = 0.0f;
        this.u = 0.0f;
        this.w = 0.0f;
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
        this.e = 1.74533f;
        this.f = 1.74533f;
        this.r = false;
        this.b = false;
        this.n = 0;
        this.j = false;
    }

    public final void e(int i, int i2, int i3, int i4) {
        long jA = this.a.a();
        float fA = a();
        long j = jA - this.H;
        float f = i3;
        float fAtan = (float) Math.atan((Math.tan(fA / 2.0f) * ((double) i4)) / ((double) f));
        int i5 = i2 - this.m;
        double d = ((i - this.l) * (-fA)) / f;
        double dCos = Math.cos(this.x) * d;
        double d2 = (i5 * (-(fAtan + fAtan))) / i4;
        double dSin = Math.sin(this.x) * d2;
        float fCos = (float) ((Math.cos(this.x) * d2) + (Math.sin(this.x) * d));
        this.t += fCos;
        float f2 = (float) (dCos - dSin);
        this.u += f2;
        float f3 = j * 1.0E-9f;
        if (f3 > 0.0f) {
            float f4 = fCos / f3;
            float f5 = f2 / f3;
            float[] fArr = this.C;
            float fH = afxw.H(f4, -18.84956f, 18.84956f);
            float fH2 = afxw.H(f5, -18.84956f, 18.84956f);
            int i6 = this.I;
            fArr[i6] = fH;
            this.D[i6] = fH2;
            int i7 = i6 + 1;
            if (i7 >= 5) {
                i7 = 0;
            }
            this.I = i7;
            this.E = Math.min(this.E + 1, 5);
        }
        this.n += Math.abs(this.l - i) + Math.abs(this.m - i2);
        this.l = i;
        this.m = i2;
        this.H = jA;
    }

    public final void f(VibrationEffect vibrationEffect) {
        if (this.G && this.r && vibrationEffect != null) {
            this.F.vibrate(vibrationEffect);
            this.r = false;
        }
    }

    public final void g(int i, int i2) {
        this.k = true;
        this.H = this.a.a();
        this.l = i;
        this.m = i2;
        this.z = 0.0f;
        this.y = 0.0f;
        Arrays.fill(this.C, 0.0f);
        Arrays.fill(this.D, 0.0f);
        this.I = 0;
        this.E = 0;
        this.n = 0;
    }
}
