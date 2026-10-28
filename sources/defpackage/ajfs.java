package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ajfs extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ajfw) aihn.parseFrom(ajfw.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ajfw ajfwVar = (ajfw) builder.instance;
            if ((ajfwVar.c & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ajfw ajfwVar2 = (ajfw) builder.instance;
                str.getClass();
                ajfwVar2.c |= 1;
                ajfwVar2.d = str;
            } else if (!ajfwVar.d.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ajfw) builder.instance).d + ')');
            }
            return new ajft(builder);
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
        return ajfu.class;
    }
}
