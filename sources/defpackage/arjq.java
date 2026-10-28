package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class arjq extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((arjs) aihn.parseFrom(arjs.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            arjs arjsVar = (arjs) builder.instance;
            if ((arjsVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                arjs arjsVar2 = (arjs) builder.instance;
                str.getClass();
                arjsVar2.b |= 1;
                arjsVar2.c = str;
            } else if (!arjsVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((arjs) builder.instance).c + ')');
            }
            return new arjp(builder);
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
        return arjr.class;
    }
}
