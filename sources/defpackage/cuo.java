package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cuo {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, SemanticState.Focused, 160, 192, 224, SemanticState.Hidden, 320, 384, 448, SemanticState.LiveRegion, 576, 640};
    private static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = b[i];
        if (i4 == 44100) {
            return (f[i3] + (i2 & 1)) << 1;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 << 2;
    }

    public static int b(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                return 40 << ((bArr[(b2 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static bse c(bwb bwbVar, String str, String str2, bsa bsaVar) {
        dqp dqpVar = new dqp((byte[]) null);
        dqpVar.n(bwbVar);
        int i = b[dqpVar.i(2)];
        dqpVar.s(8);
        int i2 = d[dqpVar.i(3)];
        if (dqpVar.i(1) != 0) {
            i2++;
        }
        int i3 = e[dqpVar.i(5)] * 1000;
        dqpVar.m();
        bwbVar.P(dqpVar.g());
        bsd bsdVar = new bsd();
        bsdVar.a = str;
        bsdVar.e("audio/ac3");
        bsdVar.G = i2;
        bsdVar.I = i;
        bsdVar.s = bsaVar;
        bsdVar.d = str2;
        bsdVar.i = i3;
        bsdVar.j = i3;
        return new bse(bsdVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0063  */
    public static bse d(bwb bwbVar, String str, String str2, bsa bsaVar) {
        String str3;
        dqp dqpVar = new dqp((byte[]) null);
        dqpVar.n(bwbVar);
        int i = dqpVar.i(13) * 1000;
        dqpVar.s(3);
        int i2 = b[dqpVar.i(2)];
        dqpVar.s(10);
        int i3 = d[dqpVar.i(3)];
        if (dqpVar.i(1) != 0) {
            i3++;
        }
        dqpVar.s(3);
        int i4 = dqpVar.i(4);
        dqpVar.s(1);
        if (i4 > 0) {
            dqpVar.s(6);
            if (dqpVar.i(1) != 0) {
                i3 += 2;
            }
            dqpVar.s(1);
        }
        if (dqpVar.f() > 7) {
            dqpVar.s(7);
            if (dqpVar.i(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        dqpVar.m();
        bwbVar.P(dqpVar.g());
        bsd bsdVar = new bsd();
        bsdVar.a = str;
        bsdVar.e(str3);
        bsdVar.G = i3;
        bsdVar.I = i2;
        bsdVar.s = bsaVar;
        bsdVar.d = str2;
        bsdVar.j = i;
        return new bse(bsdVar);
    }
}
