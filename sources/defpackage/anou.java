package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anou extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anoy) aihn.parseFrom(anoy.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anoy anoyVar = (anoy) builder.instance;
            if ((anoyVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anoy anoyVar2 = (anoy) builder.instance;
                str.getClass();
                anoyVar2.b |= 1;
                anoyVar2.c = str;
            } else if (!anoyVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anoy) builder.instance).c + ')');
            }
            return new anot(builder);
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
        return anov.class;
    }
}
