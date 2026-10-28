package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ajpv extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ajpx) aihn.parseFrom(ajpx.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ajpx ajpxVar = (ajpx) builder.instance;
            if ((ajpxVar.c & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ajpx ajpxVar2 = (ajpx) builder.instance;
                str.getClass();
                ajpxVar2.c |= 1;
                ajpxVar2.d = str;
            } else if (!ajpxVar.d.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ajpx) builder.instance).d + ')');
            }
            return new ajpu(builder);
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
        return ajpw.class;
    }
}
