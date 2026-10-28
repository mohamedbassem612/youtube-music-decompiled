package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aipk extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aipj) aihn.parseFrom(aipj.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aipj aipjVar = (aipj) builder.instance;
            if ((aipjVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aipj aipjVar2 = (aipj) builder.instance;
                str.getClass();
                aipjVar2.b |= 1;
                aipjVar2.c = str;
            } else if (!aipjVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aipj) builder.instance).c + ')');
            }
            return new aipl(builder);
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
        return aipm.class;
    }
}
