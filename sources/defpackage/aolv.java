package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aolv extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aolx) aihn.parseFrom(aolx.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aolx aolxVar = (aolx) builder.instance;
            if ((aolxVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aolx aolxVar2 = (aolx) builder.instance;
                str.getClass();
                aolxVar2.b |= 1;
                aolxVar2.c = str;
            } else if (!aolxVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aolx) builder.instance).c + ')');
            }
            return new aolu(builder);
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
        return aolw.class;
    }
}
