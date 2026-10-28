package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class apes extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((apeu) aihn.parseFrom(apeu.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            apeu apeuVar = (apeu) builder.instance;
            if ((apeuVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                apeu apeuVar2 = (apeu) builder.instance;
                str.getClass();
                apeuVar2.b |= 1;
                apeuVar2.c = str;
            } else if (!apeuVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((apeu) builder.instance).c + ')');
            }
            return new aper(builder);
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
        return apet.class;
    }
}
