package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aqdu extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aqdw) aihn.parseFrom(aqdw.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aqdw aqdwVar = (aqdw) builder.instance;
            if ((aqdwVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aqdw aqdwVar2 = (aqdw) builder.instance;
                str.getClass();
                aqdwVar2.b |= 1;
                aqdwVar2.c = str;
            } else if (!aqdwVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aqdw) builder.instance).c + ')');
            }
            return new aqdt(builder);
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
        return aqdv.class;
    }
}
