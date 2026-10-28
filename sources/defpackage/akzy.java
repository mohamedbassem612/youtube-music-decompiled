package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class akzy extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihh aihhVar = (aihh) ((alab) aihn.parseFrom(alab.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            alab alabVar = (alab) aihhVar.instance;
            if ((alabVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                aihhVar.copyOnWrite();
                alab alabVar2 = (alab) aihhVar.instance;
                str.getClass();
                alabVar2.b |= 1;
                alabVar2.c = str;
            } else if (!alabVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((alab) aihhVar.instance).c + ')');
            }
            return new akzx(aihhVar);
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
        return akzz.class;
    }
}
