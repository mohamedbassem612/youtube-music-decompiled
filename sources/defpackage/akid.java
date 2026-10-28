package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class akid extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((akif) aihn.parseFrom(akif.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            akif akifVar = (akif) builder.instance;
            if ((akifVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                akif akifVar2 = (akif) builder.instance;
                str.getClass();
                akifVar2.b |= 1;
                akifVar2.c = str;
            } else if (!akifVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((akif) builder.instance).c + ')');
            }
            return new akic(builder);
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
        return akie.class;
    }
}
