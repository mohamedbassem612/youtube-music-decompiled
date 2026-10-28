package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class akvo extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((akvq) aihn.parseFrom(akvq.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            akvq akvqVar = (akvq) builder.instance;
            if ((akvqVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                akvq akvqVar2 = (akvq) builder.instance;
                str.getClass();
                akvqVar2.b |= 1;
                akvqVar2.c = str;
            } else if (!akvqVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((akvq) builder.instance).c + ')');
            }
            return new akvn(builder);
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
        return akvp.class;
    }
}
