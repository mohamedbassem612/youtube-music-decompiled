package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class answ extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ansy) aihn.parseFrom(ansy.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ansy ansyVar = (ansy) builder.instance;
            if ((ansyVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ansy ansyVar2 = (ansy) builder.instance;
                str.getClass();
                ansyVar2.b |= 1;
                ansyVar2.c = str;
            } else if (!ansyVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ansy) builder.instance).c + ')');
            }
            return new ansv(builder);
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
        return ansx.class;
    }
}
