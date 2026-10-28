package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aozk extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aozm) aihn.parseFrom(aozm.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aozm aozmVar = (aozm) builder.instance;
            if ((aozmVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aozm aozmVar2 = (aozm) builder.instance;
                str.getClass();
                aozmVar2.b |= 1;
                aozmVar2.c = str;
            } else if (!aozmVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aozm) builder.instance).c + ')');
            }
            return new aozj(builder);
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
        return aozl.class;
    }
}
