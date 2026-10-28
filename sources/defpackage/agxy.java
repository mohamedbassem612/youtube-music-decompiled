package defpackage;

import app.rive.semantics.SemanticState;
import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agxy extends agwz implements Serializable {
    public static final agxj a = new agxy(0);
    public static final agxj b = new agxy(agxm.a);
    private static final long serialVersionUID = 0;
    public final int c;
    private final boolean d = true;

    public agxy(int i) {
        this.c = i;
    }

    public static int g(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static long h(char c) {
        int i = (c & '?') | SemanticState.Focused;
        return ((long) (c >>> '\f')) | 224 | ((long) ((((c >>> 6) & 63) | SemanticState.Focused) << 8)) | ((long) (i << 16));
    }

    public static long i(char c) {
        return ((long) (c >>> 6)) | 192 | ((long) (((c & '?') | SemanticState.Focused) << 8));
    }

    public static long j(int i) {
        return ((long) (i >>> 18)) | 240 | ((((long) ((i >>> 12) & 63)) | 128) << 8) | ((((long) ((i >>> 6) & 63)) | 128) << 16) | ((((long) (i & 63)) | 128) << 24);
    }

    public static agxi k(int i, int i2) {
        int i3 = agxi.b;
        int i4 = i ^ i2;
        int i5 = (i4 ^ (i4 >>> 16)) * (-2048144789);
        int i6 = (i5 ^ (i5 >>> 13)) * (-1028477387);
        return new agxg(i6 ^ (i6 >>> 16));
    }

    @Override // defpackage.agwz
    public final agxi e(byte[] bArr, int i) {
        int i2 = 0;
        ahno.N(0, i, bArr.length);
        int iRotateLeft = this.c;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 4;
            if (i4 > i) {
                break;
            }
            iRotateLeft = (Integer.rotateLeft(iRotateLeft ^ (Integer.rotateLeft(g(bArr, i3) * (-862048943), 15) * 461845907), 13) * 5) - 430675100;
            i3 = i4;
        }
        int i5 = 0;
        while (i3 < i) {
            i2 ^= (bArr[i3] & 255) << i5;
            i3++;
            i5 += 8;
        }
        return k(iRotateLeft ^ (Integer.rotateLeft(i2 * (-862048943), 15) * 461845907), i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof agxy) {
            agxy agxyVar = (agxy) obj;
            if (this.c == agxyVar.c) {
                boolean z = agxyVar.d;
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.agxj
    public final agxk f() {
        return new agxx(this.c);
    }

    public final int hashCode() {
        return getClass().hashCode() ^ this.c;
    }

    public final String toString() {
        return "Hashing.murmur3_32(" + this.c + ')';
    }
}
