package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class mra implements nsr {
    public final agfr a = aguu.al(new cln(5));

    @Override // defpackage.nsr
    public final avlr a(String str) {
        return avlr.o(new tgx(str, (ByteStore) this.a.io(), 1));
    }

    @Override // defpackage.nsr
    public final /* synthetic */ void b(String str, byte[] bArr) {
        ((ByteStore) this.a.io()).set(str, bArr);
    }
}
