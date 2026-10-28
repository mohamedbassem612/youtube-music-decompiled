package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ajqu extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ajqw) aihn.parseFrom(ajqw.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ajqw ajqwVar = (ajqw) builder.instance;
            if ((ajqwVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ajqw ajqwVar2 = (ajqw) builder.instance;
                str.getClass();
                ajqwVar2.b |= 1;
                ajqwVar2.c = str;
            } else if (!ajqwVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ajqw) builder.instance).c + ')');
            }
            return new ajqt(builder);
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
        return ajqv.class;
    }
}
