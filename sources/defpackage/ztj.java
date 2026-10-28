package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ztj extends tbb {
    public ztj(tbc tbcVar) {
        super(tbcVar, "DelayedEventProto");
    }

    @Override // defpackage.tbb
    protected final /* bridge */ /* synthetic */ long a(Object obj) {
        aihf aihfVar = (aihf) obj;
        ahno.G((((jrc) aihfVar.instance).b & 8) != 0, "Must have stored time set");
        return ((jrc) aihfVar.instance).f;
    }

    @Override // defpackage.tbb
    protected final /* bridge */ /* synthetic */ Object b(byte[] bArr) {
        try {
            return ((jrc) aihn.parseFrom(jrc.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
        } catch (aiik unused) {
            return jrc.a.createBuilder();
        }
    }

    @Override // defpackage.tbb
    protected final /* bridge */ /* synthetic */ byte[] i(Object obj) {
        return ((jrc) ((aihf) obj).build()).toByteArray();
    }
}
