package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aiul extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aiuo) aihn.parseFrom(aiuo.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aiuo aiuoVar = (aiuo) builder.instance;
            if ((aiuoVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aiuo aiuoVar2 = (aiuo) builder.instance;
                str.getClass();
                aiuoVar2.b |= 1;
                aiuoVar2.c = str;
            } else if (!aiuoVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aiuo) builder.instance).c + ')');
            }
            return new aium(builder);
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
        return aiun.class;
    }
}
