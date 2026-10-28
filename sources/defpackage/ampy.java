package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ampy extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((amqb) aihn.parseFrom(amqb.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            amqb amqbVar = (amqb) builder.instance;
            if ((amqbVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                amqb amqbVar2 = (amqb) builder.instance;
                str.getClass();
                amqbVar2.b |= 1;
                amqbVar2.c = str;
            } else if (!amqbVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((amqb) builder.instance).c + ')');
            }
            return new ampx(builder);
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
        return ampz.class;
    }
}
