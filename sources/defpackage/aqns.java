package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aqns extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aqnu) aihn.parseFrom(aqnu.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aqnu aqnuVar = (aqnu) builder.instance;
            if ((aqnuVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aqnu aqnuVar2 = (aqnu) builder.instance;
                str.getClass();
                aqnuVar2.b |= 1;
                aqnuVar2.c = str;
            } else if (!aqnuVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aqnu) builder.instance).c + ')');
            }
            return new aqnr(builder);
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
        return aqnt.class;
    }
}
