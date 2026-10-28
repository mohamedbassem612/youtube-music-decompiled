package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anvt extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anvv) aihn.parseFrom(anvv.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anvv anvvVar = (anvv) builder.instance;
            if ((anvvVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anvv anvvVar2 = (anvv) builder.instance;
                str.getClass();
                anvvVar2.b |= 1;
                anvvVar2.c = str;
            } else if (!anvvVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anvv) builder.instance).c + ')');
            }
            return new anvs(builder);
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
        return anvu.class;
    }
}
