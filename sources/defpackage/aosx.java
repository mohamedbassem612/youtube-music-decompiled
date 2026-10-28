package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aosx extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aosz) aihn.parseFrom(aosz.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aosz aoszVar = (aosz) builder.instance;
            if ((aoszVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aosz aoszVar2 = (aosz) builder.instance;
                str.getClass();
                aoszVar2.b |= 1;
                aoszVar2.c = str;
            } else if (!aoszVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aosz) builder.instance).c + ')');
            }
            return new aosw(builder);
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
        return aosy.class;
    }
}
