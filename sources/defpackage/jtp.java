package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jtp {
    public jtq S;
    public boolean T;
    public cwj W;
    public int X;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public byte[] h;
    public cwi i;
    public byte[] j;
    public bsa k;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = 0;
    public int r = -1;
    public float s = 0.0f;
    public float t = 0.0f;
    public float u = 0.0f;
    public byte[] v = null;
    public int w = -1;
    public boolean x = false;
    public int y = -1;
    public int z = -1;
    public int A = -1;
    public int B = 1000;
    public int C = 200;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public int N = 1;
    public int O = -1;
    public int P = 8000;
    public long Q = 0;
    public long R = 0;
    public boolean U = true;
    public String V = "eng";

    protected jtp() {
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
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new bsz("Error parsing FourCC private data", e, true, 1);
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
                i = bArr[i4];
                i4++;
                if (i != -1) {
                    break;
                }
                i3 += 255;
            }
            int i5 = i3 + i;
            int i6 = 0;
            while (true) {
                i2 = bArr[i4];
                i4++;
                if (i2 != -1) {
                    break;
                }
                i6 += 255;
            }
            int i7 = i6 + i2;
            if (bArr[i4] != 1) {
                throw new bsz("Error parsing vorbis codec private", null, true, 1);
            }
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            int i8 = i4 + i5;
            if (bArr[i8] != 3) {
                throw new bsz("Error parsing vorbis codec private", null, true, 1);
            }
            int i9 = i8 + i7;
            if (bArr[i9] != 5) {
                throw new bsz("Error parsing vorbis codec private", null, true, 1);
            }
            int length = bArr.length - i9;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i9, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new bsz("Error parsing vorbis codec private", e, true, 1);
        }
    }

    public static boolean d(bwb bwbVar) throws bsz {
        try {
            int iL = bwbVar.l();
            if (iL == 1) {
                return true;
            }
            if (iL == 65534) {
                bwbVar.P(24);
                long jV = bwbVar.v();
                UUID uuid = jtr.b;
                if (jV == uuid.getMostSignificantBits() && bwbVar.v() == uuid.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new bsz("Error parsing MS/ACM codec private", e, true, 1);
        }
    }

    public final void c() {
        jtq jtqVar = this.S;
        if (jtqVar != null) {
            jtqVar.a(this);
        }
    }
}
