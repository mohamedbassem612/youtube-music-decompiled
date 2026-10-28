package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anjw extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihh aihhVar = (aihh) ((ankd) aihn.parseFrom(ankd.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ankd ankdVar = (ankd) aihhVar.instance;
            if ((ankdVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                aihhVar.copyOnWrite();
                ankd ankdVar2 = (ankd) aihhVar.instance;
                str.getClass();
                ankdVar2.b |= 1;
                ankdVar2.c = str;
            } else if (!ankdVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ankd) aihhVar.instance).c + ')');
            }
            return new anjv(aihhVar);
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
        return anjx.class;
    }
}
