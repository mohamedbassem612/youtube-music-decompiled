package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anvc extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anve) aihn.parseFrom(anve.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anve anveVar = (anve) builder.instance;
            if ((anveVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anve anveVar2 = (anve) builder.instance;
                str.getClass();
                anveVar2.b |= 1;
                anveVar2.c = str;
            } else if (!anveVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anve) builder.instance).c + ')');
            }
            return new anvb(builder);
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
        return anvd.class;
    }
}
