package defpackage;

import internal.org.jni_zero.JniZero;
import java.io.ByteArrayInputStream;
import java.util.zip.InflaterInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class poe implements pod {
    private static final agsn a = agsn.h("GnpSdk");

    @Override // defpackage.pod
    public final pky a(byte[] bArr) {
        try {
            InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr));
            try {
                byte[] bArrB = avkz.b(inflaterInputStream);
                JniZero.l(inflaterInputStream, null);
                return new pla(bArrB);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    JniZero.l(inflaterInputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            ((agsj) ((agsj) a.b()).j(e)).t("Failed to decompress the decrypted bytes.");
            return new pkv(e, pkx.aJ);
        }
    }
}
