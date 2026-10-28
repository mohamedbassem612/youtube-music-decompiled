package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anmp extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anmr) aihn.parseFrom(anmr.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anmr anmrVar = (anmr) builder.instance;
            if ((anmrVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anmr anmrVar2 = (anmr) builder.instance;
                str.getClass();
                anmrVar2.b |= 1;
                anmrVar2.c = str;
            } else if (!anmrVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anmr) builder.instance).c + ')');
            }
            return new anmo(builder);
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
        return anmq.class;
    }
}
