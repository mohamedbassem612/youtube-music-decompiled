package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anvg extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anvi) aihn.parseFrom(anvi.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anvi anviVar = (anvi) builder.instance;
            if ((anviVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anvi anviVar2 = (anvi) builder.instance;
                str.getClass();
                anviVar2.b |= 1;
                anviVar2.c = str;
            } else if (!anviVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anvi) builder.instance).c + ')');
            }
            return new anvf(builder);
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
        return anvh.class;
    }
}
