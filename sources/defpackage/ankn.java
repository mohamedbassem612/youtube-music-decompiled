package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ankn extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ankv) aihn.parseFrom(ankv.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ankv ankvVar = (ankv) builder.instance;
            if ((ankvVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ankv ankvVar2 = (ankv) builder.instance;
                str.getClass();
                ankvVar2.b |= 1;
                ankvVar2.c = str;
            } else if (!ankvVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ankv) builder.instance).c + ')');
            }
            return new ankm(builder);
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
        return anko.class;
    }
}
