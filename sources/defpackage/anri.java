package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anri extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anrk) aihn.parseFrom(anrk.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anrk anrkVar = (anrk) builder.instance;
            if ((anrkVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anrk anrkVar2 = (anrk) builder.instance;
                str.getClass();
                anrkVar2.b |= 1;
                anrkVar2.c = str;
            } else if (!anrkVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anrk) builder.instance).c + ')');
            }
            return new anrh(builder);
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
        return anrj.class;
    }
}
