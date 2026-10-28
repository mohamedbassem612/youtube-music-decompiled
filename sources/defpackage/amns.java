package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class amns extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((amnu) aihn.parseFrom(amnu.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            amnu amnuVar = (amnu) builder.instance;
            if ((amnuVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                amnu amnuVar2 = (amnu) builder.instance;
                str.getClass();
                amnuVar2.b |= 1;
                amnuVar2.c = str;
            } else if (!amnuVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((amnu) builder.instance).c + ')');
            }
            return new amnr(builder);
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
        return amnt.class;
    }
}
