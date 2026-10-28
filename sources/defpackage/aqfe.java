package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aqfe extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aqfg) aihn.parseFrom(aqfg.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aqfg aqfgVar = (aqfg) builder.instance;
            if ((aqfgVar.c & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aqfg aqfgVar2 = (aqfg) builder.instance;
                str.getClass();
                aqfgVar2.c |= 1;
                aqfgVar2.f = str;
            } else if (!aqfgVar.f.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aqfg) builder.instance).f + ')');
            }
            return new aqfd(builder);
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
        return aqff.class;
    }
}
