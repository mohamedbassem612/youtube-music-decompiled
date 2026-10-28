package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aqzo extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aqzq) aihn.parseFrom(aqzq.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aqzq aqzqVar = (aqzq) builder.instance;
            if ((aqzqVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aqzq aqzqVar2 = (aqzq) builder.instance;
                str.getClass();
                aqzqVar2.b |= 1;
                aqzqVar2.c = str;
            } else if (!aqzqVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aqzq) builder.instance).c + ')');
            }
            return new aqzn(builder);
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
        return aqzp.class;
    }
}
