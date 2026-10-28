package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ajxq extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ajxs) aihn.parseFrom(ajxs.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ajxs ajxsVar = (ajxs) builder.instance;
            if ((ajxsVar.c & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ajxs ajxsVar2 = (ajxs) builder.instance;
                str.getClass();
                ajxsVar2.c |= 1;
                ajxsVar2.d = str;
            } else if (!ajxsVar.d.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ajxs) builder.instance).d + ')');
            }
            return new ajxp(builder);
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
        return ajxr.class;
    }
}
