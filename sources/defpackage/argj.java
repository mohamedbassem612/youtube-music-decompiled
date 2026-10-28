package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class argj extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((argm) aihn.parseFrom(argm.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            argm argmVar = (argm) builder.instance;
            if ((argmVar.c & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                argm argmVar2 = (argm) builder.instance;
                str.getClass();
                argmVar2.c |= 1;
                argmVar2.d = str;
            } else if (!argmVar.d.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((argm) builder.instance).d + ')');
            }
            return new argi(builder);
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
        return argk.class;
    }
}
