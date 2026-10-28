package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anmf extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anmh) aihn.parseFrom(anmh.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anmh anmhVar = (anmh) builder.instance;
            if ((anmhVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anmh anmhVar2 = (anmh) builder.instance;
                str.getClass();
                anmhVar2.b |= 1;
                anmhVar2.c = str;
            } else if (!anmhVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anmh) builder.instance).c + ')');
            }
            return new anme(builder);
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
        return anmg.class;
    }
}
