package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cxs extends cxp {
    @Override // defpackage.cxp
    protected final bsx b(cxn cxnVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        dqp dqpVar = new dqp(byteBuffer.array(), byteBuffer.limit());
        dqpVar.s(12);
        int iG = dqpVar.g() + dqpVar.i(12);
        dqpVar.s(44);
        dqpVar.t(dqpVar.i(12));
        dqpVar.s(16);
        ArrayList arrayList = new ArrayList();
        while (dqpVar.g() < iG - 4) {
            dqpVar.s(48);
            int i = dqpVar.i(8);
            dqpVar.s(4);
            int iG2 = dqpVar.g() + dqpVar.i(12);
            String strK = null;
            String strK2 = null;
            while (dqpVar.g() < iG2) {
                int i2 = dqpVar.i(8);
                int i3 = dqpVar.i(8);
                int iG3 = dqpVar.g() + i3;
                if (i2 == 2) {
                    int i4 = dqpVar.i(16);
                    dqpVar.s(8);
                    if (i4 == 3) {
                        while (dqpVar.g() < iG3) {
                            strK = dqpVar.k(dqpVar.i(8), StandardCharsets.US_ASCII);
                            int i5 = dqpVar.i(8);
                            for (int i6 = 0; i6 < i5; i6++) {
                                dqpVar.t(dqpVar.i(8));
                            }
                        }
                    }
                } else if (i2 == 21) {
                    strK2 = dqpVar.k(i3, StandardCharsets.US_ASCII);
                }
                dqpVar.q(iG3 << 3);
            }
            dqpVar.q(iG2 << 3);
            if (strK != null && strK2 != null) {
                arrayList.add(new cxr(i, strK.concat(strK2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new bsx(arrayList);
    }
}
