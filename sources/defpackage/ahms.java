package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahms implements ahge {
    private final ahhl a;

    public ahms(ahhl ahhlVar) {
        this.a = ahhlVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ahge, java.lang.Object] */
    @Override // defpackage.ahge
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int iBinarySearch;
        bArr.getClass();
        ahhl ahhlVar = this.a;
        long[] jArr = ahhlVar.b;
        List list = (jArr.length == 0 || bArr.length < 5 || (iBinarySearch = Arrays.binarySearch(jArr, ahhl.a(bArr))) < 0) ? ahhlVar.d : ahhlVar.c[iBinarySearch];
        for (int i = 0; i < list.size(); i++) {
            aami aamiVar = (aami) list.get(i);
            try {
                aamiVar.b.a(bArr, bArr2);
                int i2 = aamiVar.a;
                int length = bArr2.length;
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
