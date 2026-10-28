package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class amus extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((amuu) aihn.parseFrom(amuu.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            amuu amuuVar = (amuu) builder.instance;
            if ((amuuVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                amuu amuuVar2 = (amuu) builder.instance;
                str.getClass();
                amuuVar2.b |= 1;
                amuuVar2.c = str;
            } else if (!amuuVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((amuu) builder.instance).c + ')');
            }
            return new amur(builder);
        } catch (aiik e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.weg
    public final int b() {
        return 2;
    }

    @Override // defpackage.weq
    public final Class c() {
        return amut.class;
    }
}
