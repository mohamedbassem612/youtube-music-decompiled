package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aken extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((akep) aihn.parseFrom(akep.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            akep akepVar = (akep) builder.instance;
            if ((akepVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                akep akepVar2 = (akep) builder.instance;
                str.getClass();
                akepVar2.b |= 1;
                akepVar2.c = str;
            } else if (!akepVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((akep) builder.instance).c + ')');
            }
            return new akem(builder);
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
        return akeo.class;
    }
}
