package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jur extends Exception {
    public final String a;
    public final boolean b;
    public final clo c;
    public final String d;

    public jur(bse bseVar, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + String.valueOf(bseVar), th, bseVar.q, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i));
    }

    public jur(String str, Throwable th, String str2, boolean z, clo cloVar, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = cloVar;
        this.d = str3;
    }
}
