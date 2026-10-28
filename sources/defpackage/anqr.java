package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anqr extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anqt) aihn.parseFrom(anqt.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anqt anqtVar = (anqt) builder.instance;
            if ((anqtVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anqt anqtVar2 = (anqt) builder.instance;
                str.getClass();
                anqtVar2.b |= 1;
                anqtVar2.c = str;
            } else if (!anqtVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anqt) builder.instance).c + ')');
            }
            return new anqq(builder);
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
        return anqs.class;
    }
}
