package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class amwe extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((amwh) aihn.parseFrom(amwh.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            amwh amwhVar = (amwh) builder.instance;
            if ((amwhVar.c & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                amwh amwhVar2 = (amwh) builder.instance;
                str.getClass();
                amwhVar2.c |= 1;
                amwhVar2.d = str;
            } else if (!amwhVar.d.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((amwh) builder.instance).d + ')');
            }
            return new amwd(builder);
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
        return amwf.class;
    }
}
