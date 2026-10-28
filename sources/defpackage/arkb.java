package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class arkb extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((arkd) aihn.parseFrom(arkd.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            arkd arkdVar = (arkd) builder.instance;
            if ((arkdVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                arkd arkdVar2 = (arkd) builder.instance;
                str.getClass();
                arkdVar2.b |= 1;
                arkdVar2.c = str;
            } else if (!arkdVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((arkd) builder.instance).c + ')');
            }
            return new arka(builder);
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
        return arkc.class;
    }
}
