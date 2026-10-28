package defpackage;

import android.opengl.GLES20;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abdg {
    private final boolean a;
    private final int b;
    private final int c;
    private final int d;

    public abdg(abcz abczVar, boolean z) {
        int iD;
        this.a = z;
        if (z) {
            this.b = abczVar.d("uNoiseOffset");
            this.c = abczVar.d("uNoiseScale");
            iD = abczVar.d("uNoiseSeed");
        } else {
            iD = -1;
            this.b = -1;
            this.c = -1;
        }
        this.d = iD;
    }

    public static String a(abdh abdhVar, boolean z) {
        return (true != z ? "" : "#define ENABLE_WHITE_NOISE\n").concat(abdhVar.a(R.raw.gl_white_noise_program_ext_frag));
    }

    public final void b(float f, float f2, float f3) {
        if (this.a) {
            GLES20.glUniform1f(this.b, f3);
            GLES20.glUniform1f(this.c, f2);
            GLES20.glUniform1f(this.d, f);
        }
    }
}
