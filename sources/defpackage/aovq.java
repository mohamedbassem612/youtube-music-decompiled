package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aovq extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aovs) aihn.parseFrom(aovs.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aovs aovsVar = (aovs) builder.instance;
            if ((aovsVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aovs aovsVar2 = (aovs) builder.instance;
                str.getClass();
                aovsVar2.b |= 1;
                aovsVar2.e = str;
            } else if (!aovsVar.e.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aovs) builder.instance).e + ')');
            }
            return new aovp(builder);
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
        return aovr.class;
    }
}
