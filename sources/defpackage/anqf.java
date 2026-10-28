package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anqf extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anqh) aihn.parseFrom(anqh.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anqh anqhVar = (anqh) builder.instance;
            if ((anqhVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anqh anqhVar2 = (anqh) builder.instance;
                str.getClass();
                anqhVar2.b |= 1;
                anqhVar2.c = str;
            } else if (!anqhVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anqh) builder.instance).c + ')');
            }
            return new anqe(builder);
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
        return anqg.class;
    }
}
