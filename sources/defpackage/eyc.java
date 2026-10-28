package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class eyc implements euh {
    private final String a;
    private Object b;

    public eyc(String str) {
        this.a = str;
    }

    @Override // defpackage.euh
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.euh
    public final void d() {
        try {
            ((InputStream) this.b).close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.euh
    public final void f(esf esfVar, eug eugVar) {
        try {
            String str = this.a;
            if (!str.startsWith("data:image")) {
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
            int iIndexOf = str.indexOf(44);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Missing comma in data URL.");
            }
            if (!str.substring(0, iIndexOf).endsWith(";base64")) {
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
            this.b = byteArrayInputStream;
            eugVar.b(byteArrayInputStream);
        } catch (IllegalArgumentException e) {
            eugVar.e(e);
        }
    }

    @Override // defpackage.euh
    public final int g() {
        return 1;
    }

    @Override // defpackage.euh
    public final void gI() {
    }
}
