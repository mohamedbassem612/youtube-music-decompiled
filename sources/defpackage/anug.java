package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anug extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anut) aihn.parseFrom(anut.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anut anutVar = (anut) builder.instance;
            if ((anutVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anut anutVar2 = (anut) builder.instance;
                str.getClass();
                anutVar2.b |= 1;
                anutVar2.c = str;
            } else if (!anutVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anut) builder.instance).c + ')');
            }
            return new anuf(builder);
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
        return anuh.class;
    }
}
