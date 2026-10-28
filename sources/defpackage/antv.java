package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class antv extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((antx) aihn.parseFrom(antx.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            antx antxVar = (antx) builder.instance;
            if ((antxVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                antx antxVar2 = (antx) builder.instance;
                str.getClass();
                antxVar2.b |= 1;
                antxVar2.c = str;
            } else if (!antxVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((antx) builder.instance).c + ')');
            }
            return new antu(builder);
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
        return antw.class;
    }
}
