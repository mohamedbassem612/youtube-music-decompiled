package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ajof extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ajoh) aihn.parseFrom(ajoh.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ajoh ajohVar = (ajoh) builder.instance;
            if ((ajohVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ajoh ajohVar2 = (ajoh) builder.instance;
                str.getClass();
                ajohVar2.b |= 1;
                ajohVar2.c = str;
            } else if (!ajohVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ajoh) builder.instance).c + ')');
            }
            return new ajoe(builder);
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
        return ajog.class;
    }
}
