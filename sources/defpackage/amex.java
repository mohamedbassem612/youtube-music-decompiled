package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class amex extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((amez) aihn.parseFrom(amez.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            amez amezVar = (amez) builder.instance;
            if ((amezVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                amez amezVar2 = (amez) builder.instance;
                str.getClass();
                amezVar2.b |= 1;
                amezVar2.c = str;
            } else if (!amezVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((amez) builder.instance).c + ')');
            }
            return new amew(builder);
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
        return amey.class;
    }
}
