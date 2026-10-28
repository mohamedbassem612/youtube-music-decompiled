package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ajxu extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ajxw) aihn.parseFrom(ajxw.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ajxw ajxwVar = (ajxw) builder.instance;
            if ((ajxwVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ajxw ajxwVar2 = (ajxw) builder.instance;
                str.getClass();
                ajxwVar2.b |= 1;
                ajxwVar2.c = str;
            } else if (!ajxwVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ajxw) builder.instance).c + ')');
            }
            return new ajxt(builder);
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
        return ajxv.class;
    }
}
