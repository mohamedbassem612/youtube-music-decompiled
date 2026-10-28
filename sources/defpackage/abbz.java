package defpackage;

import android.opengl.GLES20;
import android.opengl.GLU;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abbz {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/features/gl/common/GlUtilities");

    public static void a(int i) {
        if (i != 0) {
            return;
        }
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                throw new abbx("Invalid GL object");
            }
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/player/features/gl/common/GlUtilities", "checkGlObject", 93, "GlUtilities.java")).w("GL error %s", GLU.gluErrorString(iGlGetError));
        }
    }

    public static boolean b(float f, float f2, float f3) {
        return Math.abs(f - f2) < f3;
    }
}
