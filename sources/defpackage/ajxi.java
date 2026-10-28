package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ajxi extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ajxk) aihn.parseFrom(ajxk.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ajxk ajxkVar = (ajxk) builder.instance;
            if ((ajxkVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ajxk ajxkVar2 = (ajxk) builder.instance;
                str.getClass();
                ajxkVar2.b |= 1;
                ajxkVar2.e = str;
            } else if (!ajxkVar.e.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ajxk) builder.instance).e + ')');
            }
            return new ajxh(builder);
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
        return ajxj.class;
    }
}
