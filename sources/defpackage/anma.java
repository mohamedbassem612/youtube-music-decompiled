package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anma extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anmc) aihn.parseFrom(anmc.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anmc anmcVar = (anmc) builder.instance;
            if ((anmcVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anmc anmcVar2 = (anmc) builder.instance;
                str.getClass();
                anmcVar2.b |= 1;
                anmcVar2.c = str;
            } else if (!anmcVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anmc) builder.instance).c + ')');
            }
            return new anlz(builder);
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
        return anmb.class;
    }
}
