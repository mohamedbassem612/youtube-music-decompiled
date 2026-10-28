package defpackage;

import android.opengl.GLES20;
import android.opengl.GLU;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class abcz {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/player/features/gl/program/GlProgram");
    private final String b;
    private boolean c;
    public int d;

    public abcz(String str, String str2) {
        String simpleName = getClass().getSimpleName();
        this.b = simpleName;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.d = iGlCreateProgram;
        abbz.a(iGlCreateProgram);
        int iA = a(35633, str);
        int iA2 = a(35632, str2);
        GLES20.glAttachShader(this.d, iA);
        GLES20.glAttachShader(this.d, iA2);
        GLES20.glLinkProgram(this.d);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.d, 35714, iArr, 0);
        if (iArr[0] == 1) {
            GLES20.glDeleteShader(iA);
            GLES20.glDeleteShader(iA2);
            return;
        }
        String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.d);
        ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/player/features/gl/program/GlProgram", "<init>", 65, "GlProgram.java")).B("Failed to link GlProgram %s: %s", simpleName, strGlGetProgramInfoLog);
        throw new abbx("Failed to link GlProgram " + simpleName + ": " + strGlGetProgramInfoLog);
    }

    private final int a(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        abbz.a(iGlCreateShader);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateShader;
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        agrc agrcVar = (agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/player/features/gl/program/GlProgram", "loadGlShader", 134, "GlProgram.java");
        String str2 = this.b;
        agrcVar.B("Failed to compile shader for GlProgram %s: %s", str2, strGlGetShaderInfoLog);
        throw new abbx(a.ca(strGlGetShaderInfoLog, str2, "Failed to compile shader for GlProgram ", ": "));
    }

    protected final int c(String str) {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.d, str);
        e(iGlGetAttribLocation, str);
        return iGlGetAttribLocation;
    }

    protected final int d(String str) {
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.d, str);
        e(iGlGetUniformLocation, str);
        return iGlGetUniformLocation;
    }

    protected final void e(int i, String str) {
        if (i != -1) {
            return;
        }
        while (true) {
            int iGlGetError = GLES20.glGetError();
            agrf agrfVar = a;
            if (iGlGetError == 0) {
                ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/player/features/gl/program/GlProgram", "checkGlLocation", 189, "GlProgram.java")).B("Invalid GL location: %s: %s", this.b, str);
                return;
            }
            ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/player/features/gl/program/GlProgram", "checkGlLocation", 184, "GlProgram.java")).w("GL error %s", GLU.gluErrorString(iGlGetError));
        }
    }

    public final void f() {
        if (this.c) {
            return;
        }
        int[] iArr = new int[1];
        GLES20.glValidateProgram(this.d);
        GLES20.glGetProgramiv(this.d, 35715, iArr, 0);
        if (iArr[0] == 1) {
            this.c = true;
            return;
        }
        String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.d);
        agrc agrcVar = (agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/player/features/gl/program/GlProgram", "maybeValidateProgram", 90, "GlProgram.java");
        String str = this.b;
        agrcVar.B("Failed to validate GlProgram %s: %s", str, strGlGetProgramInfoLog);
        throw new abbx(a.ca(strGlGetProgramInfoLog, str, "Failed to validate GlProgram ", ": "));
    }

    public void g() {
        int i = this.d;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.d = 0;
        }
    }

    public final void h() {
        GLES20.glUseProgram(this.d);
    }
}
