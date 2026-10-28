package defpackage;

import android.opengl.GLES20;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class abdf extends abcv {
    public final int j;
    public final int k;

    public abdf(abdh abdhVar) {
        this(abdhVar.a(R.raw.gl_streaming_texture_program_vert), abdhVar.a(R.raw.gl_streaming_texture_program_frag));
        d("uTexMultiplier");
        d("uTexOffset");
    }

    public final void i(afee afeeVar) {
        ((abcb) afeeVar.d).a(this.j);
        ((abcb) afeeVar.c).a(this.a);
        GLES20.glDrawArrays(afeeVar.a, 0, afeeVar.b);
    }

    public abdf(String str, String str2) {
        super(str, str2);
        this.j = c("aTextureCoords");
        this.k = d("uBrightness");
    }
}
