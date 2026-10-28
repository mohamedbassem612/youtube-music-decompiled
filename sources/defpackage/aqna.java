package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aqna extends weq {
    @Override // defpackage.wef
    public final /* bridge */ /* synthetic */ tzk a(String str, byte[] bArr) {
        try {
            aihf builder = ((aqnc) aihn.parseFrom(aqnc.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            aqnc aqncVar = (aqnc) builder.instance;
            if ((aqncVar.b & 1) == 0) {
                zvp.a(zvn.a, zvm.E, a.ce(str, "Stored key entity lacked key; using the key it was stored under: "));
                builder.copyOnWrite();
                aqnc aqncVar2 = (aqnc) builder.instance;
                str.getClass();
                aqncVar2.b |= 1;
                aqncVar2.c = str;
            } else if (!aqncVar.c.equals(str)) {
                throw new IllegalArgumentException("Parsed an entity protobuf with a mismatched key (expected: " + str + ", got: " + ((aqnc) builder.instance).c + ')');
            }
            return new aqmz(builder);
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
        return aqnb.class;
    }
}
