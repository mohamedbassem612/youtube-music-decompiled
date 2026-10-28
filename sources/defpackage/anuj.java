package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anuj extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihh aihhVar = (aihh) ((anuu) aihn.parseFrom(anuu.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anuu anuuVar = (anuu) aihhVar.instance;
            if ((anuuVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                aihhVar.copyOnWrite();
                anuu anuuVar2 = (anuu) aihhVar.instance;
                str.getClass();
                anuuVar2.b |= 1;
                anuuVar2.c = str;
            } else if (!anuuVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anuu) aihhVar.instance).c + ')');
            }
            return new anui(aihhVar);
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
        return anuk.class;
    }
}
