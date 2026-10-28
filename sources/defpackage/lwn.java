package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class lwn implements lyp {
    protected int memoizedHashCode = 0;

    private final String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int l(lyz lyzVar) {
        throw null;
    }

    @Override // defpackage.lyp
    public final lxa m() {
        try {
            int iQ = q();
            lxa lxaVar = lxa.d;
            byte[] bArr = new byte[iQ];
            lxh lxhVarF = lxh.F(bArr);
            G(lxhVarF);
            return ixt.O(lxhVarF, bArr);
        } catch (IOException e) {
            throw new RuntimeException(a("ByteString"), e);
        }
    }

    public final byte[] n() {
        try {
            byte[] bArr = new byte[q()];
            lxh lxhVarF = lxh.F(bArr);
            G(lxhVarF);
            lxhVarF.G();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(a("byte array"), e);
        }
    }
}
