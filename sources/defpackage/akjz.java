package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class akjz extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((akkb) aihn.parseFrom(akkb.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            akkb akkbVar = (akkb) builder.instance;
            if ((akkbVar.c & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                akkb akkbVar2 = (akkb) builder.instance;
                str.getClass();
                akkbVar2.c |= 1;
                akkbVar2.f = str;
            } else if (!akkbVar.f.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((akkb) builder.instance).f + ')');
            }
            return new akjy(builder);
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
        return akka.class;
    }
}
