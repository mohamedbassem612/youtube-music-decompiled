package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aohp extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aohr) aihn.parseFrom(aohr.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aohr aohrVar = (aohr) builder.instance;
            if ((aohrVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aohr aohrVar2 = (aohr) builder.instance;
                str.getClass();
                aohrVar2.b |= 1;
                aohrVar2.c = str;
            } else if (!aohrVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aohr) builder.instance).c + ')');
            }
            return new aoho(builder);
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
        return aohq.class;
    }
}
