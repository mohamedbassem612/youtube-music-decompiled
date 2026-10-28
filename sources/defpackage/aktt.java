package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aktt extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aktv) aihn.parseFrom(aktv.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aktv aktvVar = (aktv) builder.instance;
            if ((aktvVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aktv aktvVar2 = (aktv) builder.instance;
                str.getClass();
                aktvVar2.b |= 1;
                aktvVar2.c = str;
            } else if (!aktvVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aktv) builder.instance).c + ')');
            }
            return new akts(builder);
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
        return aktu.class;
    }
}
