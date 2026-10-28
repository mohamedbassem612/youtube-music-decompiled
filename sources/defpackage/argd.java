package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class argd extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((argf) aihn.parseFrom(argf.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            argf argfVar = (argf) builder.instance;
            if ((argfVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                argf argfVar2 = (argf) builder.instance;
                str.getClass();
                argfVar2.b |= 1;
                argfVar2.c = str;
            } else if (!argfVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((argf) builder.instance).c + ')');
            }
            return new argc(builder);
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
        return arge.class;
    }
}
