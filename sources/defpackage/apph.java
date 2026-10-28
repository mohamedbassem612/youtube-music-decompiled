package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class apph extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((appj) aihn.parseFrom(appj.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            appj appjVar = (appj) builder.instance;
            if ((appjVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                appj appjVar2 = (appj) builder.instance;
                str.getClass();
                appjVar2.b |= 1;
                appjVar2.c = str;
            } else if (!appjVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((appj) builder.instance).c + ')');
            }
            return new appg(builder);
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
        return appi.class;
    }
}
