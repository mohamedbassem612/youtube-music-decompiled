package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kcu implements jsd {
    private final /* synthetic */ int $cid;

    public /* synthetic */ kcu(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v6, types: [ahql, java.lang.Object] */
    @Override // defpackage.jsd
    public final Object a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ((agzp) obj).toByteArray();
        }
        if (i == 1) {
            return ((aioi) obj).toByteArray();
        }
        ahub ahubVar = (ahub) obj;
        axlj axljVar = fwx.a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ahqs ahqsVar = new ahqs(byteArrayOutputStream, axljVar.b, axljVar.a, axljVar.c);
            ahql ahqlVar = (ahql) ahqsVar.c.get(ahubVar.getClass());
            if (ahqlVar == null) {
                throw new ahqi("No encoder for ".concat(String.valueOf(String.valueOf(ahubVar.getClass()))));
            }
            ahqlVar.a(ahubVar, ahqsVar);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
        }
    }
}
