package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ajls extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ajlv) aihn.parseFrom(ajlv.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ajlv ajlvVar = (ajlv) builder.instance;
            if ((ajlvVar.c & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ajlv ajlvVar2 = (ajlv) builder.instance;
                str.getClass();
                ajlvVar2.c |= 1;
                ajlvVar2.d = str;
            } else if (!ajlvVar.d.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ajlv) builder.instance).d + ')');
            }
            return new ajlt(builder);
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
        return ajlu.class;
    }
}
