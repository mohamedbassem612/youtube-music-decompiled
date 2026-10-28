package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class annu extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((annw) aihn.parseFrom(annw.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            annw annwVar = (annw) builder.instance;
            if ((annwVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                annw annwVar2 = (annw) builder.instance;
                str.getClass();
                annwVar2.b |= 1;
                annwVar2.c = str;
            } else if (!annwVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((annw) builder.instance).c + ')');
            }
            return new annt(builder);
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
        return annv.class;
    }
}
