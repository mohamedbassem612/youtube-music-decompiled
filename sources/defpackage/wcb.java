package defpackage;

import com.google.android.libraries.elements.interfaces.Transaction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class wcb implements wbp {
    private final Transaction a;

    public wcb(Transaction transaction) {
        this.a = transaction;
    }

    @Override // defpackage.wbp
    public final void a(String str) {
        this.a.remove(str);
    }

    @Override // defpackage.wbp
    public final void b(String str, byte[] bArr) {
        this.a.setMetadata(str, bArr);
    }

    @Override // defpackage.wbp
    public final void c(String str, byte[] bArr, byte[] bArr2) {
        this.a.setWithMetadata(str, bArr, bArr2);
    }

    @Override // defpackage.wbp
    public final byte[] d(String str) {
        return this.a.get(str);
    }

    @Override // defpackage.wbp
    public final byte[] e(String str) {
        return this.a.getMetadata(str);
    }
}
