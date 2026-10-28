package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class apmg extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((apmi) aihn.parseFrom(apmi.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            apmi apmiVar = (apmi) builder.instance;
            if ((apmiVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored id entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                apmi apmiVar2 = (apmi) builder.instance;
                str.getClass();
                apmiVar2.b |= 1;
                apmiVar2.c = str;
            } else if (!apmiVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((apmi) builder.instance).c + ')');
            }
            return new apmf(builder);
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
        return apmh.class;
    }
}
