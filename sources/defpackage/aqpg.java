package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aqpg extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihh aihhVar = (aihh) ((aqpi) aihn.parseFrom(aqpi.b, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aqpi aqpiVar = (aqpi) aihhVar.instance;
            if ((aqpiVar.c & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                aihhVar.copyOnWrite();
                aqpi aqpiVar2 = (aqpi) aihhVar.instance;
                str.getClass();
                aqpiVar2.c |= 1;
                aqpiVar2.d = str;
            } else if (!aqpiVar.d.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aqpi) aihhVar.instance).d + ')');
            }
            return new aqpf(aihhVar);
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
        return aqph.class;
    }
}
