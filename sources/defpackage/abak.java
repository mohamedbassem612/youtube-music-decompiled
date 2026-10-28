package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.os.SystemClock;
import android.os.Vibrator;
import com.google.cardboard.sdk.CardboardView;
import com.google.cardboard.sdk.HeadTransform;
import com.google.cardboard.sdk.Viewport;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abak implements CardboardView.Renderer, abby {
    private static final agrf i = agrf.h("com/google/android/libraries/youtube/player/features/gl/CardboardRenderer");
    public final abbo a;
    public abbf c;
    public boolean d;
    public volatile boolean e;
    public abbd f;
    public abbd g;
    public int h;
    private final float[] j;
    private abbw o;
    private float p;
    private final Viewport s;
    private final float[] k = new float[16];
    private final float[] l = new float[16];
    private final float[] m = new float[16];
    public final Queue b = new ConcurrentLinkedQueue();
    private final float[] n = new float[3];
    private int q = 16;
    private int r = 9;

    public abak(Context context) {
        float[] fArr = new float[16];
        this.j = fArr;
        context.getClass();
        this.a = new abbo(agdd.a, (Vibrator) context.getSystemService("vibrator"), context.checkCallingOrSelfPermission("android.permission.VIBRATE") == 0);
        Matrix.setLookAtM(fArr, 0, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        this.s = new Viewport();
    }

    private final void b() {
        while (true) {
            Queue queue = this.b;
            if (queue.isEmpty()) {
                return;
            } else {
                ((Runnable) queue.remove()).run();
            }
        }
    }

    private final void c(abbx abbxVar) {
        abbd abbdVar = this.f;
        if (abbdVar != null) {
            abbdVar.l(abbxVar);
        }
    }

    private final void d() {
        float f = this.p;
        abbo abboVar = this.a;
        if (abbz.b(f, abboVar.a(), 1.0E-5f)) {
            return;
        }
        float fA = abboVar.a();
        this.p = fA;
        float fTan = (float) Math.tan(fA / 2.0f);
        int i2 = this.q;
        int i3 = this.r;
        float f2 = i2 > i3 ? fTan : (i2 * fTan) / i3;
        if (i2 >= i3) {
            fTan = (fTan * i3) / i2;
        }
        Matrix.frustumM(this.k, 0, (-f2) * 0.1f, f2 * 0.1f, (-fTan) * 0.1f, fTan * 0.1f, 0.1f, 20000.0f);
        this.o = new abbw(f2, fTan, f2, fTan);
    }

    @Override // defpackage.abby
    public final void a(Runnable runnable) {
        throw null;
    }

    @Override // com.google.cardboard.sdk.CardboardView.Renderer
    public final void onDrawEye(CardboardView.Eye eye) {
        float[] perspective;
        abbw abbwVar;
        eye.getClass();
        if (eye.getEyeType() == 2) {
            this.s.setGLViewport();
        }
        if (this.c != null) {
            if (eye.getEyeType() != 2) {
                eye.applyHeadView(this.l);
            }
            Matrix.multiplyMM(this.m, 0, eye.getEyeView(), 0, this.j, 0);
            if (eye.getEyeType() != 2) {
                perspective = eye.getPerspective(0.1f, 20000.0f);
                abbwVar = new abbw(eye.getFieldOfView()[0], eye.getFieldOfView()[3], eye.getFieldOfView()[1], eye.getFieldOfView()[2]);
            } else {
                perspective = this.k;
                abbwVar = this.o;
            }
            try {
                this.c.b(new ahgb(this.l, perspective, abbwVar, eye));
            } catch (abbx e) {
                c(e);
            }
        }
    }

    @Override // com.google.cardboard.sdk.CardboardView.Renderer
    public final void onFinishFrame(Viewport viewport) {
        viewport.getClass();
        viewport.setViewport(viewport.x, viewport.y, viewport.width, viewport.height);
        int i2 = 0;
        while (true) {
            try {
                int iGlGetError = GLES20.glGetError();
                if (iGlGetError == 0) {
                    break;
                }
                ((agrc) ((agrc) abbz.a.b()).k("com/google/android/libraries/youtube/player/features/gl/common/GlUtilities", "checkGlError", 53, "GlUtilities.java")).w("GL error %s", GLU.gluErrorString(iGlGetError));
                if (i2 == 0) {
                    i2 = iGlGetError;
                }
            } catch (abbx e) {
                c(e);
                return;
            }
        }
        if (i2 != 0) {
            throw new abbx("GL error ".concat(String.valueOf(GLU.gluErrorString(i2))));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e0  */
    @Override // com.google.cardboard.sdk.CardboardView.Renderer
    public final void onNewFrame(HeadTransform headTransform) {
        float fH;
        b();
        headTransform.getClass();
        if (this.c != null) {
            d();
            float[] fArr = this.n;
            headTransform.getEulerAngles(fArr, 0);
            float f = -fArr[0];
            fArr[0] = f;
            float f2 = -fArr[1];
            fArr[1] = f2;
            fArr[2] = -fArr[2];
            if (this.d) {
                this.d = false;
                abbo abboVar = this.a;
                float fH2 = afxw.H(f, -1.5707964f, 1.5707964f);
                abboVar.t = -fH2;
                abboVar.u = -f2;
                abboVar.v = fH2;
                abboVar.w = f2;
            }
            abbo abboVar2 = this.a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[2];
            int i2 = this.h;
            agfx agfxVar = abboVar2.a;
            long jA = agfxVar.a();
            float f6 = (jA - abboVar2.A) * 1.0E-9f;
            boolean z = (abboVar2.k || f6 >= 10.0f || (abbz.b(abboVar2.y, 0.0f, 1.0E-5f) && abbz.b(abboVar2.z, 0.0f, 1.0E-5f))) ? false : true;
            if (z) {
                float fExp = ((1.0f - ((float) Math.exp(f6 * (-3.8f)))) / 3.8f) - ((1.0f - ((float) Math.exp(((abboVar2.B - abboVar2.A) * 1.0E-9f) * (-3.8f)))) / 3.8f);
                abboVar2.t += abboVar2.y * fExp;
                abboVar2.u += abboVar2.z * fExp;
                abboVar2.B = jA;
            }
            long jA2 = agfxVar.a() - abboVar2.s;
            if (abbz.b(2.0f, 0.0f, 1.0E-5f)) {
                fH = 0.0f;
            } else {
                float f7 = jA2 * 1.0E-9f;
                if (f7 < 2.0f) {
                    fH = afxw.H(1.0f - (f7 / 2.0f), 0.0f, 1.0f);
                } else {
                    fH = 0.0f;
                }
            }
            float f8 = abboVar2.t;
            float f9 = abboVar2.v;
            abboVar2.t = f8 + ((f9 - f3) * fH);
            if (!z && fH == 0.0f) {
                float fMin = Math.min(Math.abs(f3 - f9), 0.017453292f) * 0.1f;
                if (Math.abs(abboVar2.t) < fMin) {
                    abboVar2.t = 0.0f;
                } else {
                    float f10 = abboVar2.t;
                    abboVar2.t = f10 - (Math.signum(f10) * fMin);
                }
            }
            abboVar2.v = f3;
            abboVar2.w = f4;
            abboVar2.x = f5;
            if (i2 == 2) {
                float f11 = f4 + abboVar2.u;
                if (f11 > 0.62831855f) {
                    abboVar2.u = 0.62831855f - f4;
                    if (abboVar2.z > 0.0f) {
                        abboVar2.z = 0.0f;
                    }
                } else if (f11 < -0.62831855f) {
                    abboVar2.u = (-0.62831855f) - f4;
                    if (abboVar2.z < 0.0f) {
                        abboVar2.z = 0.0f;
                    }
                }
                abboVar2.b(0.9424779f);
            } else {
                abboVar2.b(1.5707964f);
            }
            if (!abboVar2.c && !abboVar2.k) {
                float f12 = abboVar2.e;
                if ((f12 > 2.26894f || f12 < 0.78538996f) && jA > abboVar2.o) {
                    if (abboVar2.j) {
                        abboVar2.r = true;
                        abboVar2.f(abboVar2.q);
                        abboVar2.j = false;
                    }
                    float f13 = (jA - abboVar2.o) * 1.0E-9f;
                    float fMax = abboVar2.e;
                    if (fMax > 2.26894f) {
                        fMax = Math.max(fMax - ((f13 / 0.1f) * 0.087249994f), 2.26893f);
                        abboVar2.e = fMax;
                    }
                    if (fMax < 0.78538996f) {
                        abboVar2.e = Math.min(fMax + ((f13 / 0.1f) * 0.087249994f), 0.7854f);
                    }
                    abboVar2.o = jA;
                }
            }
            float f14 = abboVar2.v;
            float f15 = abboVar2.t + f14;
            float f16 = abboVar2.w + abboVar2.u;
            float fCos = abboVar2.x * ((float) Math.cos(f14));
            float[] fArr2 = this.l;
            Matrix.setIdentityM(fArr2, 0);
            Matrix.rotateM(fArr2, 0, (float) Math.toDegrees(fCos), 0.0f, 0.0f, 1.0f);
            Matrix.rotateM(fArr2, 0, (float) Math.toDegrees(f15), 1.0f, 0.0f, 0.0f);
            Matrix.rotateM(fArr2, 0, (float) Math.toDegrees(f16), 0.0f, 1.0f, 0.0f);
            if (Double.isNaN(fArr2[0])) {
                ((agrc) ((agrc) i.b()).k("com/google/android/libraries/youtube/player/features/gl/CardboardRenderer", "onNewFrame", 200, "CardboardRenderer.java")).t("New frame error: head view has NaN value");
                return;
            }
            SystemClock.uptimeMillis();
            abbf abbfVar = this.c;
            if (abbfVar != null) {
                grj grjVar = new grj(fArr2);
                abbfVar.c(abbfVar.e(grjVar), grjVar);
                abbfVar.d(grjVar);
            }
        }
    }

    @Override // com.google.cardboard.sdk.CardboardView.Renderer
    public final void onRendererShutdown() {
        abbf abbfVar = this.c;
        if (abbfVar != null) {
            abbfVar.a();
            this.c = null;
        }
    }

    @Override // com.google.cardboard.sdk.CardboardView.Renderer
    public final void onSurfaceChanged(int i2, int i3) {
        this.q = i2;
        this.r = i3;
        this.s.setViewport(0, 0, i2, i3);
        try {
            abbd abbdVar = this.g;
            if (abbdVar != null) {
                abbdVar.c.c();
            }
        } catch (abbx e) {
            c(e);
        }
        this.p = -1.0f;
        d();
    }

    @Override // com.google.cardboard.sdk.CardboardView.Renderer
    public final void onSurfaceCreated(EGLConfig eGLConfig) {
        this.e = true;
        try {
            abbd abbdVar = this.g;
            if (abbdVar != null) {
                abak abakVar = abbdVar.e;
                abap abapVar = abbdVar.d;
                if (abakVar != null && abapVar != null) {
                    try {
                        abbe abbeVar = abbdVar.c;
                        abbeVar.c();
                        abbu abbuVar = new abbu(abbdVar.j, abbdVar.b, abapVar, abbdVar.m / abbdVar.n, abbdVar.s, abbdVar.b());
                        abbdVar.g = abbuVar.f;
                        abbdVar.g.h(abbeVar.a(), abbeVar.b(), abbeVar.a, abbdVar.o);
                        abbdVar.f = abbuVar;
                        boolean z = abbdVar.l;
                        if (abbdVar.e == null || abbdVar.d == null) {
                            abbuVar.g();
                            abbdVar.f = null;
                        } else {
                            boolean z2 = abbdVar.l;
                            abakVar.c = abbuVar;
                            abbdVar.h(abbdVar.p, abbdVar.q);
                            if (abbdVar.k) {
                                abbdVar.f();
                            }
                            abbuVar.h(abbdVar.r);
                            abbuVar.f.j(abbdVar.i);
                        }
                    } catch (abbx e) {
                        abbdVar.l(e);
                    }
                }
            }
        } catch (abbx e2) {
            c(e2);
        }
        b();
    }
}
