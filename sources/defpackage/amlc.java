package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class amlc extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((amle) aihn.parseFrom(amle.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            amle amleVar = (amle) builder.instance;
            if ((amleVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                amle amleVar2 = (amle) builder.instance;
                str.getClass();
                amleVar2.b |= 1;
                amleVar2.c = str;
            } else if (!amleVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((amle) builder.instance).c + ')');
            }
            return new amlb(builder);
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
        return amld.class;
    }
}
