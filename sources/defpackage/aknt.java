package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aknt extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aknw) aihn.parseFrom(aknw.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aknw aknwVar = (aknw) builder.instance;
            if ((aknwVar.c & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aknw aknwVar2 = (aknw) builder.instance;
                str.getClass();
                aknwVar2.c |= 1;
                aknwVar2.d = str;
            } else if (!aknwVar.d.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aknw) builder.instance).d + ')');
            }
            return new akns(builder);
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
        return aknu.class;
    }
}
