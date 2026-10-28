package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anjp extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anjr) aihn.parseFrom(anjr.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anjr anjrVar = (anjr) builder.instance;
            if ((anjrVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anjr anjrVar2 = (anjr) builder.instance;
                str.getClass();
                anjrVar2.b |= 1;
                anjrVar2.c = str;
            } else if (!anjrVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anjr) builder.instance).c + ')');
            }
            return new anjo(builder);
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
        return anjq.class;
    }
}
