package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class amni extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((amnk) aihn.parseFrom(amnk.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            amnk amnkVar = (amnk) builder.instance;
            if ((amnkVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                amnk amnkVar2 = (amnk) builder.instance;
                str.getClass();
                amnkVar2.b |= 1;
                amnkVar2.c = str;
            } else if (!amnkVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((amnk) builder.instance).c + ')');
            }
            return new amnh(builder);
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
        return amnj.class;
    }
}
