package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aofj extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aofl) aihn.parseFrom(aofl.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aofl aoflVar = (aofl) builder.instance;
            if ((aoflVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aofl aoflVar2 = (aofl) builder.instance;
                str.getClass();
                aoflVar2.b |= 1;
                aoflVar2.e = str;
            } else if (!aoflVar.e.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aofl) builder.instance).e + ')');
            }
            return new aofi(builder);
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
        return aofk.class;
    }
}
