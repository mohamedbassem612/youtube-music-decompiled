package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aqnh extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aqnj) aihn.parseFrom(aqnj.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aqnj aqnjVar = (aqnj) builder.instance;
            if ((aqnjVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aqnj aqnjVar2 = (aqnj) builder.instance;
                str.getClass();
                aqnjVar2.b |= 1;
                aqnjVar2.c = str;
            } else if (!aqnjVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aqnj) builder.instance).c + ')');
            }
            return new aqng(builder);
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
        return aqni.class;
    }
}
