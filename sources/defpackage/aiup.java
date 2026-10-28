package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aiup extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aius) aihn.parseFrom(aius.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aius aiusVar = (aius) builder.instance;
            if ((aiusVar.c & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aius aiusVar2 = (aius) builder.instance;
                str.getClass();
                aiusVar2.c |= 1;
                aiusVar2.d = str;
            } else if (!aiusVar.d.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aius) builder.instance).d + ')');
            }
            return new aiuq(builder);
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
        return aiur.class;
    }
}
