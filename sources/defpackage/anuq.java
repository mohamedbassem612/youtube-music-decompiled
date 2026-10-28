package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anuq extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anux) aihn.parseFrom(anux.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anux anuxVar = (anux) builder.instance;
            if ((anuxVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anux anuxVar2 = (anux) builder.instance;
                str.getClass();
                anuxVar2.b |= 1;
                anuxVar2.c = str;
            } else if (!anuxVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anux) builder.instance).c + ')');
            }
            return new anup(builder);
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
        return anur.class;
    }
}
