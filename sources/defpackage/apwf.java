package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class apwf extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((apwh) aihn.parseFrom(apwh.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            apwh apwhVar = (apwh) builder.instance;
            if ((apwhVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                apwh apwhVar2 = (apwh) builder.instance;
                str.getClass();
                apwhVar2.b |= 1;
                apwhVar2.c = str;
            } else if (!apwhVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((apwh) builder.instance).c + ')');
            }
            return new apwe(builder);
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
        return apwg.class;
    }
}
