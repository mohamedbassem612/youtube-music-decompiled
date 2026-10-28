package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class annp extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((annr) aihn.parseFrom(annr.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            annr annrVar = (annr) builder.instance;
            if ((annrVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                annr annrVar2 = (annr) builder.instance;
                str.getClass();
                annrVar2.b |= 1;
                annrVar2.c = str;
            } else if (!annrVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((annr) builder.instance).c + ')');
            }
            return new anno(builder);
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
        return annq.class;
    }
}
