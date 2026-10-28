package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anyw extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anzd) aihn.parseFrom(anzd.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anzd anzdVar = (anzd) builder.instance;
            if ((anzdVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anzd anzdVar2 = (anzd) builder.instance;
                str.getClass();
                anzdVar2.b |= 1;
                anzdVar2.c = str;
            } else if (!anzdVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anzd) builder.instance).c + ')');
            }
            return new anyv(builder);
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
        return anyx.class;
    }
}
