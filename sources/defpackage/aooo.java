package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aooo extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihh aihhVar = (aihh) ((aooq) aihn.parseFrom(aooq.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aooq aooqVar = (aooq) aihhVar.instance;
            if ((aooqVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                aihhVar.copyOnWrite();
                aooq aooqVar2 = (aooq) aihhVar.instance;
                str.getClass();
                aooqVar2.b |= 1;
                aooqVar2.c = str;
            } else if (!aooqVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aooq) aihhVar.instance).c + ')');
            }
            return new aoon(aihhVar);
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
        return aoop.class;
    }
}
