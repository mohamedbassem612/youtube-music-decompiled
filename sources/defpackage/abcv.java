package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class abcv extends abcz {
    public final int a;
    public final int b;
    public final int c;

    public abcv(String str, String str2) {
        super(str, str2);
        this.a = c("aPosition");
        this.b = d("uMVP");
        this.c = d("uOpacity");
    }

    public abcv(abdh abdhVar) {
        this(abdhVar.a(R.raw.gl_color_program_vert), abdhVar.a(R.raw.gl_color_program_frag));
        c("aColor");
    }
}
