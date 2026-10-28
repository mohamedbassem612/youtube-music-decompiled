package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anyn extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihh aihhVar = (aihh) ((anyp) aihn.parseFrom(anyp.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anyp anypVar = (anyp) aihhVar.instance;
            if ((anypVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                aihhVar.copyOnWrite();
                anyp anypVar2 = (anyp) aihhVar.instance;
                str.getClass();
                anypVar2.b |= 1;
                anypVar2.c = str;
            } else if (!anypVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anyp) aihhVar.instance).c + ')');
            }
            return new anym(aihhVar);
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
        return anyo.class;
    }
}
