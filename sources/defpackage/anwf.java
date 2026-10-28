package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anwf extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anwh) aihn.parseFrom(anwh.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anwh anwhVar = (anwh) builder.instance;
            if ((anwhVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anwh anwhVar2 = (anwh) builder.instance;
                str.getClass();
                anwhVar2.b |= 1;
                anwhVar2.c = str;
            } else if (!anwhVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anwh) builder.instance).c + ')');
            }
            return new anwe(builder);
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
        return anwg.class;
    }
}
