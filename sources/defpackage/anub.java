package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anub extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anud) aihn.parseFrom(anud.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anud anudVar = (anud) builder.instance;
            if ((anudVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anud anudVar2 = (anud) builder.instance;
                str.getClass();
                anudVar2.b |= 1;
                anudVar2.c = str;
            } else if (!anudVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anud) builder.instance).c + ')');
            }
            return new anua(builder);
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
        return anuc.class;
    }
}
