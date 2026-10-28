package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class akht extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((akhw) aihn.parseFrom(akhw.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            akhw akhwVar = (akhw) builder.instance;
            if ((akhwVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                akhw akhwVar2 = (akhw) builder.instance;
                str.getClass();
                akhwVar2.b |= 1;
                akhwVar2.c = str;
            } else if (!akhwVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((akhw) builder.instance).c + ')');
            }
            return new akhs(builder);
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
        return akhu.class;
    }
}
