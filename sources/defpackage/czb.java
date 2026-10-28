package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class czb {
    public byte[] P;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a;
    public cwj ac;
    public bse ad;
    public int ae;
    public jtq af;
    public String b;
    public String c;
    public int d;
    public long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public byte[] k;
    public cwi l;
    public byte[] m;
    public bsa n;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = 0;
    public int u = -1;
    public float v = 0.0f;
    public float w = 0.0f;
    public float x = 0.0f;
    public byte[] y = null;
    public int z = -1;
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public int D = 1000;
    public int E = 200;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public float N = -1.0f;
    public float O = -1.0f;
    public int Q = 1;
    public int R = -1;
    public int S = -1;
    public int T = 8000;
    public long U = 0;
    public long V = 0;
    public boolean W = false;
    public boolean aa = true;
    public String ab = "eng";

    protected czb() {
    }

    public static Pair a(bwb bwbVar) throws bsz {
        try {
            bwbVar.Q(16);
            long jU = bwbVar.u();
            if (jU == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jU == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jU != 826496599) {
                bvx.e("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int i = bwbVar.c + 20;
            byte[] bArr = bwbVar.b;
            while (true) {
                int length = bArr.length;
                if (i >= length - 4) {
                    throw new bsz("Failed to find FourCC VC1 initialization data", null, true, 1);
                }
                int i2 = i + 1;
                if (bArr[i] == 0 && bArr[i2] == 0 && bArr[i + 2] == 1 && bArr[i + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, i, length)));
                }
                i = i2;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new bsz("Error parsing FourCC private data", null, true, 1);
        }
    }

    public static List b(byte[] bArr) throws bsz {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw new bsz("Error parsing vorbis codec private", null, true, 1);
            }
            int i3 = 0;
            int i4 = 1;
            while (true) {
                int i5 = bArr[i4];
                i4++;
                i = i5 & 255;
                if (i != 255) {
                    break;
                }
                i3 += 255;
            }
            int i6 = i3 + i;
            int i7 = 0;
            while (true) {
                int i8 = bArr[i4];
                i4++;
                i2 = i8 & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
            }
            int i9 = i7 + i2;
            if (bArr[i4] != 1) {
                throw new bsz("Error parsing vorbis codec private", null, true, 1);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            int i10 = i4 + i6;
            if (bArr[i10] != 3) {
                throw new bsz("Error parsing vorbis codec private", null, true, 1);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw new bsz("Error parsing vorbis codec private", null, true, 1);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new bsz("Error parsing vorbis codec private", null, true, 1);
        }
    }

    public final void c() {
        this.ac.getClass();
    }

    public final boolean d(bwb bwbVar) throws bsz {
        try {
            int iL = bwbVar.l();
            if (iL == 1) {
                return true;
            }
            if (iL == 65534) {
                bwbVar.P(20);
                int iK = bwbVar.k();
                if (aty.l(iK, this.Q)) {
                    this.S = aty.k(iK);
                }
                long jV = bwbVar.v();
                UUID uuid = czc.b;
                if (jV == uuid.getMostSignificantBits() && bwbVar.v() == uuid.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new bsz("Error parsing MS/ACM codec private", null, true, 1);
        }
    }

    public final byte[] e(String str) throws bsz {
        byte[] bArr = this.m;
        if (bArr != null) {
            return bArr;
        }
        throw new bsz("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null, true, 1);
    }
}
