package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aowr extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aowt) aihn.parseFrom(aowt.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aowt aowtVar = (aowt) builder.instance;
            if ((aowtVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aowt aowtVar2 = (aowt) builder.instance;
                str.getClass();
                aowtVar2.b |= 1;
                aowtVar2.c = str;
            } else if (!aowtVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aowt) builder.instance).c + ')');
            }
            return new aowq(builder);
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
        return aows.class;
    }
}
