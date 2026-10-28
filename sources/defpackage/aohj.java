package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aohj extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aohl) aihn.parseFrom(aohl.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aohl aohlVar = (aohl) builder.instance;
            if ((aohlVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aohl aohlVar2 = (aohl) builder.instance;
                str.getClass();
                aohlVar2.b |= 1;
                aohlVar2.c = str;
            } else if (!aohlVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aohl) builder.instance).c + ')');
            }
            return new aohi(builder);
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
        return aohk.class;
    }
}
