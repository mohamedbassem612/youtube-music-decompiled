package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aqzb extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aqzd) aihn.parseFrom(aqzd.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aqzd aqzdVar = (aqzd) builder.instance;
            if ((aqzdVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aqzd aqzdVar2 = (aqzd) builder.instance;
                str.getClass();
                aqzdVar2.b |= 1;
                aqzdVar2.c = str;
            } else if (!aqzdVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aqzd) builder.instance).c + ')');
            }
            return new aqza(builder);
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
        return aqzc.class;
    }
}
