package defpackage;

import java.lang.reflect.Array;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class uv extends sr {
    public final Set c;

    public uv(String str) {
        super("", str, "VisibilityType");
        this.c = new afx(0);
    }

    @Override // defpackage.sr
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final uw d() {
        afx afxVar = (afx) this.c;
        int i = afxVar.c;
        String[] strArr = new String[i];
        int i2 = 0;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i, 32);
        afw afwVar = new afw(afxVar);
        while (afwVar.hasNext()) {
            sz szVar = (sz) afwVar.next();
            strArr[i2] = szVar.a();
            bArr[i2] = szVar.b();
            i2++;
        }
        i("packageName", strArr);
        c("sha256Cert", bArr);
        return new uw(super.d());
    }
}
