package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mqx {
    private static final mqx b = new mqx(nty.a);
    public final byte[] a;

    public mqx(byte[] bArr) {
        this.a = bArr;
    }

    public static mqx a(nwl nwlVar) {
        try {
            aigm aigmVarU = aigm.U(nwlVar.c());
            if (aigmVarU.D()) {
                return b;
            }
            aigmVarU.n();
            return new mqx(aigmVarU.G());
        } catch (IOException e) {
            throw new nud("Error reading extension from model", e);
        }
    }

    public final nwl b(int i) {
        int i2 = i << 3;
        int iNumberOfLeadingZeros = (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
        byte[] bArr = this.a;
        byte[] bArr2 = new byte[iNumberOfLeadingZeros + aigs.G(bArr)];
        aigs aigsVarO = aigs.O(bArr2);
        try {
            int length = bArr.length;
            ((aigo) aigsVarO).y(i2 | 2);
            ((aigo) aigsVarO).B(bArr, length);
            aigsVarO.d();
            aigsVarO.P();
            return nwl.a(bArr2);
        } catch (IOException e) {
            throw new nud("Error adding extension to model", e);
        }
    }
}
