package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anor extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anox) aihn.parseFrom(anox.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anox anoxVar = (anox) builder.instance;
            if ((anoxVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anox anoxVar2 = (anox) builder.instance;
                str.getClass();
                anoxVar2.b |= 1;
                anoxVar2.c = str;
            } else if (!anoxVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anox) builder.instance).c + ')');
            }
            return new anoq(builder);
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
        return anos.class;
    }
}
