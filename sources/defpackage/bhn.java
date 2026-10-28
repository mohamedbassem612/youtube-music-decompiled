package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bhn implements bji {
    protected int memoizedHashCode = 0;

    public int c(bjs bjsVar) {
        throw null;
    }

    @Override // defpackage.bji
    public final bhy d() {
        try {
            int iH = h();
            bhy bhyVar = bhy.d;
            byte[] bArr = new byte[iH];
            bie bieVar = new bie(bArr, iH);
            r(bieVar);
            return acw.c(bieVar, bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
