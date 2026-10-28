package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class alir extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((alit) aihn.parseFrom(alit.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            alit alitVar = (alit) builder.instance;
            if ((alitVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                alit alitVar2 = (alit) builder.instance;
                str.getClass();
                alitVar2.b |= 1;
                alitVar2.c = str;
            } else if (!alitVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((alit) builder.instance).c + ')');
            }
            return new aliq(builder);
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
        return alis.class;
    }
}
