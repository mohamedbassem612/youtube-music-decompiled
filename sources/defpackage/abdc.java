package defpackage;

import android.opengl.GLES20;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abdc {
    public static final /* synthetic */ int a = 0;
    private static final float[] b = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
    private static final float[] c = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
    private static final float[] d = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
    private static final String[] e = {"uTextureY", "uTextureU", "uTextureV"};
    private final int f;
    private final int h;
    private final int i;
    private abcr k;
    private final abcx l;
    private final int[] g = new int[3];
    private int j = -1;

    public abdc(abcz abczVar, boolean z) {
        if (z) {
            for (int i = 0; i < 3; i++) {
                this.g[i] = abczVar.d(e[i]);
            }
            this.h = abczVar.d("uColorConversion");
            this.f = -1;
        } else {
            this.f = abczVar.d("uTexture");
            this.h = -1;
        }
        this.i = abczVar.d("uCropRight");
        this.l = new abcx(abczVar);
    }

    public static String a(abdh abdhVar, boolean z) {
        return (true != z ? "" : "#define ENABLE_YUV\n").concat(abdhVar.a(R.raw.gl_rgb_and_yuv_program_ext_frag));
    }

    public final void b() {
        int[] iArr = this.l.l;
        if (iArr[0] != 0) {
            GLES20.glDeleteTextures(1, iArr, 0);
            iArr[0] = 0;
        }
    }

    public final void c(yia yiaVar, yib yibVar, int i, yib yibVar2) {
        abcx abcxVar = this.l;
        if (abcxVar.m != yiaVar || abcxVar.n != yibVar || abcxVar.p != yibVar2) {
            abcxVar.k = true;
        }
        abcxVar.m = yiaVar;
        abcxVar.n = yibVar;
        abcxVar.p = yibVar2;
        abcxVar.o = i;
    }

    public final void d(boolean z, byte[] bArr, long j, long j2) {
        this.l.b(z, bArr, j, j2);
    }

    public final void e(abcc abccVar) {
        if (abccVar.j() != 2) {
            GLES20.glUniform1i(this.f, 0);
            GLES20.glUniform1f(this.i, 1.0f);
            abcx abcxVar = this.l;
            abcxVar.i = abccVar.c();
            if ((abcxVar.e == 0 || abcxVar.k) && (abcxVar.m == yia.b || abcxVar.n != abcxVar.p)) {
                abcxVar.e(null);
            }
            GLES20.glUniform1f(abcxVar.d, abcxVar.e);
            abcxVar.k = false;
            abcxVar.a(0, abcxVar.a);
            abcxVar.a(2, abcxVar.c);
            abcxVar.a(1, abcxVar.b);
            abcxVar.c(abccVar);
            return;
        }
        for (int i = 0; i < 3; i++) {
            GLES20.glUniform1i(this.g[i], i);
        }
        GLES20.glUniform1f(this.i, abccVar.a());
        abcr abcrVarD = abccVar.d();
        int iB = abccVar.b();
        if (this.j == iB) {
            abcr abcrVar = this.k;
            if (abcrVarD == null ? abcrVar == null : !(abcrVar == null || !abcrVarD.a.equals(abcrVar.a))) {
                this.l.d(abccVar, iB, abcrVarD, false);
                return;
            }
        }
        float[] fArr = c;
        if (iB == 1) {
            fArr = b;
        } else if (iB == 3) {
            fArr = d;
        }
        GLES20.glUniformMatrix3fv(this.h, 1, false, fArr, 0);
        this.j = iB;
        this.k = abcrVarD;
        this.l.d(abccVar, iB, abcrVarD, true);
    }
}
