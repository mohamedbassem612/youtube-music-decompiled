package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aoat extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aoav) aihn.parseFrom(aoav.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aoav aoavVar = (aoav) builder.instance;
            if ((aoavVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aoav aoavVar2 = (aoav) builder.instance;
                str.getClass();
                aoavVar2.b |= 1;
                aoavVar2.c = str;
            } else if (!aoavVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aoav) builder.instance).c + ')');
            }
            return new aoas(builder);
        } catch (aiik e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.weg
    public final int b() {
        return 1;
    }

    @Override // defpackage.weq
    public final Class c() {
        return aoau.class;
    }
}
