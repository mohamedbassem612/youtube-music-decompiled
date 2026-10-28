package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ankq extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ankw) aihn.parseFrom(ankw.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ankw ankwVar = (ankw) builder.instance;
            if ((ankwVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ankw ankwVar2 = (ankw) builder.instance;
                str.getClass();
                ankwVar2.b |= 1;
                ankwVar2.c = str;
            } else if (!ankwVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ankw) builder.instance).c + ')');
            }
            return new ankp(builder);
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
        return ankr.class;
    }
}
