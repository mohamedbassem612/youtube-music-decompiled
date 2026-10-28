package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ajwj extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ajwl) aihn.parseFrom(ajwl.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ajwl ajwlVar = (ajwl) builder.instance;
            if ((ajwlVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ajwl ajwlVar2 = (ajwl) builder.instance;
                str.getClass();
                ajwlVar2.b |= 1;
                ajwlVar2.c = str;
            } else if (!ajwlVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ajwl) builder.instance).c + ')');
            }
            return new ajwi(builder);
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
        return ajwk.class;
    }
}
