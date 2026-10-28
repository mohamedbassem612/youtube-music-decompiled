package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ankt extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ankx) aihn.parseFrom(ankx.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ankx ankxVar = (ankx) builder.instance;
            if ((ankxVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ankx ankxVar2 = (ankx) builder.instance;
                str.getClass();
                ankxVar2.b |= 1;
                ankxVar2.c = str;
            } else if (!ankxVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ankx) builder.instance).c + ')');
            }
            return new anks(builder);
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
        return anku.class;
    }
}
