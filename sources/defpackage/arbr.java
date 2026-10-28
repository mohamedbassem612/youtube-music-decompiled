package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class arbr extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((arbt) aihn.parseFrom(arbt.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            arbt arbtVar = (arbt) builder.instance;
            if ((arbtVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                arbt arbtVar2 = (arbt) builder.instance;
                str.getClass();
                arbtVar2.b |= 1;
                arbtVar2.c = str;
            } else if (!arbtVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((arbt) builder.instance).c + ')');
            }
            return new arbq(builder);
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
        return arbs.class;
    }
}
