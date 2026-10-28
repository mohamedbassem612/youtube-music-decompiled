package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class apcp extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((apcn) aihn.parseFrom(apcn.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            apcn apcnVar = (apcn) builder.instance;
            if ((apcnVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                apcn apcnVar2 = (apcn) builder.instance;
                str.getClass();
                apcnVar2.b |= 1;
                apcnVar2.c = str;
            } else if (!apcnVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((apcn) builder.instance).c + ')');
            }
            return new apco(builder);
        } catch (aiik e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.weg
    public final int b() {
        return 2;
    }

    @Override // defpackage.weq
    public final Class c() {
        return apcq.class;
    }
}
