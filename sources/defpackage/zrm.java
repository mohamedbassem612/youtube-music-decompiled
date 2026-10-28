package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zrm extends tbb {
    public zrm(tbc tbcVar) {
        super(tbcVar, "OfflineHttpRequestProto");
    }

    @Override // defpackage.tbb
    protected final /* bridge */ /* synthetic */ long a(Object obj) {
        jrh jrhVar = (jrh) obj;
        ahno.G((jrhVar.b & 32) != 0, "Must have stored time set");
        return jrhVar.i;
    }

    @Override // defpackage.tbb
    protected final /* bridge */ /* synthetic */ Object b(byte[] bArr) {
        try {
            return (jrh) aihn.parseFrom(jrh.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik unused) {
            return jrh.a;
        }
    }

    @Override // defpackage.tbb
    protected final /* synthetic */ byte[] i(Object obj) {
        return ((jrh) obj).toByteArray();
    }
}
