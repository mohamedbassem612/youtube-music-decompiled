package defpackage;

import android.media.MediaCodec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cak {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i = new MediaCodec.CryptoInfo();
    public final MediaCodec.CryptoInfo.Pattern j = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public final void a(int i) {
        if (i != 0) {
            if (this.d == null) {
                int[] iArr = new int[1];
                this.d = iArr;
                this.i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.d;
            iArr2[0] = iArr2[0] + i;
        }
    }
}
