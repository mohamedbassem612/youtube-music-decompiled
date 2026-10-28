package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aipy extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aiqb) aihn.parseFrom(aiqb.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aiqb aiqbVar = (aiqb) builder.instance;
            if ((aiqbVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aiqb aiqbVar2 = (aiqb) builder.instance;
                str.getClass();
                aiqbVar2.b |= 1;
                aiqbVar2.e = str;
            } else if (!aiqbVar.e.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aiqb) builder.instance).e + ')');
            }
            return new aipz(builder);
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
        return aiqa.class;
    }
}
