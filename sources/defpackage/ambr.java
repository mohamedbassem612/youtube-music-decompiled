package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ambr extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ambt) aihn.parseFrom(ambt.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ambt ambtVar = (ambt) builder.instance;
            if ((ambtVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ambt ambtVar2 = (ambt) builder.instance;
                str.getClass();
                ambtVar2.b |= 1;
                ambtVar2.c = str;
            } else if (!ambtVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ambt) builder.instance).c + ')');
            }
            return new ambq(builder);
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
        return ambs.class;
    }
}
