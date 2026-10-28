package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aqdk extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aqdm) aihn.parseFrom(aqdm.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aqdm aqdmVar = (aqdm) builder.instance;
            if ((aqdmVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aqdm aqdmVar2 = (aqdm) builder.instance;
                str.getClass();
                aqdmVar2.b |= 1;
                aqdmVar2.c = str;
            } else if (!aqdmVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aqdm) builder.instance).c + ')');
            }
            return new aqdj(builder);
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
        return aqdl.class;
    }
}
