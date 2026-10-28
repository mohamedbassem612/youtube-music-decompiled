package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anyt extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anzc) aihn.parseFrom(anzc.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anzc anzcVar = (anzc) builder.instance;
            if ((anzcVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anzc anzcVar2 = (anzc) builder.instance;
                str.getClass();
                anzcVar2.b |= 1;
                anzcVar2.c = str;
            } else if (!anzcVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anzc) builder.instance).c + ')');
            }
            return new anys(builder);
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
        return anyu.class;
    }
}
