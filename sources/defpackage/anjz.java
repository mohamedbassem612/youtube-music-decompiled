package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anjz extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anke) aihn.parseFrom(anke.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anke ankeVar = (anke) builder.instance;
            if ((ankeVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anke ankeVar2 = (anke) builder.instance;
                str.getClass();
                ankeVar2.b |= 1;
                ankeVar2.c = str;
            } else if (!ankeVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anke) builder.instance).c + ')');
            }
            return new anjy(builder);
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
        return anka.class;
    }
}
