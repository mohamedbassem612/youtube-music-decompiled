package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ardc extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((arde) aihn.parseFrom(arde.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            arde ardeVar = (arde) builder.instance;
            if ((ardeVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                arde ardeVar2 = (arde) builder.instance;
                str.getClass();
                ardeVar2.b |= 1;
                ardeVar2.c = str;
            } else if (!ardeVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((arde) builder.instance).c + ')');
            }
            return new ardb(builder);
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
        return ardd.class;
    }
}
