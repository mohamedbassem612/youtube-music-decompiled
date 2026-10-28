package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class amkx extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((amkz) aihn.parseFrom(amkz.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            amkz amkzVar = (amkz) builder.instance;
            if ((amkzVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                amkz amkzVar2 = (amkz) builder.instance;
                str.getClass();
                amkzVar2.b |= 1;
                amkzVar2.c = str;
            } else if (!amkzVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((amkz) builder.instance).c + ')');
            }
            return new amkw(builder);
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
        return amky.class;
    }
}
