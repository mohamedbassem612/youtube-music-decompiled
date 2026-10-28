package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anjt extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((ankc) aihn.parseFrom(ankc.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            ankc ankcVar = (ankc) builder.instance;
            if ((ankcVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                ankc ankcVar2 = (ankc) builder.instance;
                str.getClass();
                ankcVar2.b |= 1;
                ankcVar2.c = str;
            } else if (!ankcVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((ankc) builder.instance).c + ')');
            }
            return new anjs(builder);
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
        return anju.class;
    }
}
