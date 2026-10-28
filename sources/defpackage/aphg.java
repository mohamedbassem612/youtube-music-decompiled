package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aphg extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aphi) aihn.parseFrom(aphi.b, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aphi aphiVar = (aphi) builder.instance;
            if ((aphiVar.c & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aphi aphiVar2 = (aphi) builder.instance;
                str.getClass();
                aphiVar2.c |= 1;
                aphiVar2.d = str;
            } else if (!aphiVar.d.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aphi) builder.instance).d + ')');
            }
            return new aphf(builder);
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
        return aphh.class;
    }
}
