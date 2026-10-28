package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ajgb extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ajge) aihn.parseFrom(ajge.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ajge ajgeVar = (ajge) builder.instance;
            if ((ajgeVar.c & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ajge ajgeVar2 = (ajge) builder.instance;
                str.getClass();
                ajgeVar2.c |= 1;
                ajgeVar2.d = str;
            } else if (!ajgeVar.d.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ajge) builder.instance).d + ')');
            }
            return new ajgc(builder);
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
        return ajgd.class;
    }
}
