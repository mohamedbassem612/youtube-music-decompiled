package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anqj extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anql) aihn.parseFrom(anql.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anql anqlVar = (anql) builder.instance;
            if ((anqlVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anql anqlVar2 = (anql) builder.instance;
                str.getClass();
                anqlVar2.b |= 1;
                anqlVar2.c = str;
            } else if (!anqlVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anql) builder.instance).c + ')');
            }
            return new anqi(builder);
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
        return anqk.class;
    }
}
