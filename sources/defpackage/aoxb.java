package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aoxb extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aoxd) aihn.parseFrom(aoxd.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aoxd aoxdVar = (aoxd) builder.instance;
            if ((aoxdVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aoxd aoxdVar2 = (aoxd) builder.instance;
                str.getClass();
                aoxdVar2.b |= 1;
                aoxdVar2.c = str;
            } else if (!aoxdVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aoxd) builder.instance).c + ')');
            }
            return new aoxa(builder);
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
        return aoxc.class;
    }
}
