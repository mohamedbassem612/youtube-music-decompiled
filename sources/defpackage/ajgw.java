package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ajgw extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ajgz) aihn.parseFrom(ajgz.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ajgz ajgzVar = (ajgz) builder.instance;
            if ((ajgzVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ajgz ajgzVar2 = (ajgz) builder.instance;
                str.getClass();
                ajgzVar2.b |= 1;
                ajgzVar2.c = str;
            } else if (!ajgzVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ajgz) builder.instance).c + ')');
            }
            return new ajgx(builder);
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
        return ajgy.class;
    }
}
