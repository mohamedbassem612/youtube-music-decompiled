package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class apwb extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((apwd) aihn.parseFrom(apwd.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            apwd apwdVar = (apwd) builder.instance;
            if ((apwdVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored project_id_key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                apwd apwdVar2 = (apwd) builder.instance;
                str.getClass();
                apwdVar2.b |= 1;
                apwdVar2.e = str;
            } else if (!apwdVar.e.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((apwd) builder.instance).e + ')');
            }
            return new apwa(builder);
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
        return apwc.class;
    }
}
