package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qla {
    public static final qla a = new qla(agps.c);
    public final aglk b;

    public qla(aglk aglkVar) {
        this.b = aglkVar;
    }

    public static qla a(aigm aigmVar) throws aiik {
        long j;
        String strX;
        qkz qkzVar;
        byte[] bArrJ;
        int iK = aigmVar.k();
        if (iK < 0) {
            throw new aiik("Negative number of flags");
        }
        agli agliVar = new agli(agpb.a);
        long j2 = 0;
        for (int i = 0; i < iK; i++) {
            long jS = aigmVar.s();
            int i2 = (int) jS;
            long j3 = jS >>> 3;
            if (j3 == 0) {
                j = 0;
                strX = aigmVar.x();
            } else {
                long j4 = j3 + j2;
                if (j4 > 2305843009213693951L) {
                    throw new aiik("Flag name larger than max size");
                }
                j = j4;
                strX = null;
            }
            int i3 = i2 & 7;
            if (i3 == 0 || i3 == 1) {
                qkzVar = new qkz(j, strX, i3, 0L, null);
            } else if (i3 == 2) {
                qkzVar = new qkz(j, strX, i3, aigmVar.s(), null);
            } else if (i3 == 3) {
                qkzVar = new qkz(j, strX, i3, Double.doubleToRawLongBits(aigmVar.b()), null);
            } else if (i3 == 4) {
                qkzVar = new qkz(j, strX, i3, 0L, aigmVar.x());
            } else {
                if (i3 != 5) {
                    throw new aiik(a.bR(i3, "Unrecognized flag type "));
                }
                aigl aiglVar = (aigl) aigmVar;
                int iK2 = aiglVar.k();
                int i4 = aiglVar.c;
                int i5 = aiglVar.d;
                if (iK2 <= i4 - i5 && iK2 > 0) {
                    bArrJ = Arrays.copyOfRange(aiglVar.b, i5, i5 + iK2);
                    aiglVar.d += iK2;
                } else {
                    if (iK2 < 0) {
                        throw new aiik("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
                    bArrJ = aiglVar.J(iK2);
                }
                qkzVar = new qkz(j, strX, i3, 0L, bArrJ);
            }
            long j5 = qkzVar.a;
            if (j5 != 0) {
                j2 = j5;
            }
            agliVar.n(qkzVar);
        }
        return new qla(agliVar.g());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qla) {
            return this.b.equals(((qla) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return ahng.ab(this.b);
    }
}
