package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class amtb extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((amtd) aihn.parseFrom(amtd.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            amtd amtdVar = (amtd) builder.instance;
            if ((amtdVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                amtd amtdVar2 = (amtd) builder.instance;
                str.getClass();
                amtdVar2.b |= 1;
                amtdVar2.c = str;
            } else if (!amtdVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((amtd) builder.instance).c + ')');
            }
            return new amta(builder);
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
        return amtc.class;
    }
}
