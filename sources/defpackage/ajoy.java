package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ajoy extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ajpa) aihn.parseFrom(ajpa.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ajpa ajpaVar = (ajpa) builder.instance;
            if ((ajpaVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ajpa ajpaVar2 = (ajpa) builder.instance;
                str.getClass();
                ajpaVar2.b |= 1;
                ajpaVar2.c = str;
            } else if (!ajpaVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ajpa) builder.instance).c + ')');
            }
            return new ajox(builder);
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
        return ajoz.class;
    }
}
