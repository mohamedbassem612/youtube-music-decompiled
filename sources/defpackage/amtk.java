package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class amtk extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((amtm) aihn.parseFrom(amtm.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            amtm amtmVar = (amtm) builder.instance;
            if ((amtmVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                amtm amtmVar2 = (amtm) builder.instance;
                str.getClass();
                amtmVar2.b |= 1;
                amtmVar2.c = str;
            } else if (!amtmVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((amtm) builder.instance).c + ')');
            }
            return new amtj(builder);
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
        return amtl.class;
    }
}
