package defpackage;

import com.google.android.libraries.elements.interfaces.ScopedTransaction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class wca implements wbp {
    private final ScopedTransaction a;

    public wca(ScopedTransaction scopedTransaction) {
        this.a = scopedTransaction;
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
