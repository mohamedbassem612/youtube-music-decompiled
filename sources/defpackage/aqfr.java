package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aqfr extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aqfp) aihn.parseFrom(aqfp.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aqfp aqfpVar = (aqfp) builder.instance;
            if ((aqfpVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aqfp aqfpVar2 = (aqfp) builder.instance;
                str.getClass();
                aqfpVar2.b |= 1;
                aqfpVar2.c = str;
            } else if (!aqfpVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aqfp) builder.instance).c + ')');
            }
            return new aqfq(builder);
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
        return aqfs.class;
    }
}
