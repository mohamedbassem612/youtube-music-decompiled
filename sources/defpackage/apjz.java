package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class apjz extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((apkb) aihn.parseFrom(apkb.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            apkb apkbVar = (apkb) builder.instance;
            if ((apkbVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                apkb apkbVar2 = (apkb) builder.instance;
                str.getClass();
                apkbVar2.b |= 1;
                apkbVar2.c = str;
            } else if (!apkbVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((apkb) builder.instance).c + ')');
            }
            return new apjy(builder);
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
        return apka.class;
    }
}
