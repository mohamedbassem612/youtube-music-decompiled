package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anum extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anuw) aihn.parseFrom(anuw.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anuw anuwVar = (anuw) builder.instance;
            if ((anuwVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anuw anuwVar2 = (anuw) builder.instance;
                str.getClass();
                anuwVar2.b |= 1;
                anuwVar2.c = str;
            } else if (!anuwVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anuw) builder.instance).c + ')');
            }
            return new anul(builder);
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
        return anun.class;
    }
}
