package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ajxe extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ajxg) aihn.parseFrom(ajxg.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ajxg ajxgVar = (ajxg) builder.instance;
            if ((ajxgVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ajxg ajxgVar2 = (ajxg) builder.instance;
                str.getClass();
                ajxgVar2.b |= 1;
                ajxgVar2.c = str;
            } else if (!ajxgVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ajxg) builder.instance).c + ')');
            }
            return new ajxd(builder);
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
        return ajxf.class;
    }
}
