package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ares extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((areu) aihn.parseFrom(areu.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            areu areuVar = (areu) builder.instance;
            if ((areuVar.c & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                areu areuVar2 = (areu) builder.instance;
                str.getClass();
                areuVar2.c |= 1;
                areuVar2.d = str;
            } else if (!areuVar.d.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((areu) builder.instance).d + ')');
            }
            return new arer(builder);
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
        return aret.class;
    }
}
