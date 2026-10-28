package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anoo extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anow) aihn.parseFrom(anow.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anow anowVar = (anow) builder.instance;
            if ((anowVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anow anowVar2 = (anow) builder.instance;
                str.getClass();
                anowVar2.b |= 1;
                anowVar2.e = str;
            } else if (!anowVar.e.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anow) builder.instance).e + ')');
            }
            return new anon(builder);
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
        return anop.class;
    }
}
