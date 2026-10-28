package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anlp extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((anlr) aihn.parseFrom(anlr.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            anlr anlrVar = (anlr) builder.instance;
            if ((anlrVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                anlr anlrVar2 = (anlr) builder.instance;
                str.getClass();
                anlrVar2.b |= 1;
                anlrVar2.c = str;
            } else if (!anlrVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((anlr) builder.instance).c + ')');
            }
            return new anlo(builder);
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
        return anlq.class;
    }
}
