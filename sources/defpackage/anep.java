package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anep extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anen) aihn.parseFrom(anen.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anen anenVar = (anen) builder.instance;
            if ((anenVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anen anenVar2 = (anen) builder.instance;
                str.getClass();
                anenVar2.b |= 1;
                anenVar2.c = str;
            } else if (!anenVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anen) builder.instance).c + ')');
            }
            return new aneo(builder);
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
        return aneq.class;
    }
}
