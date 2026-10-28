package defpackage;

import android.net.Uri;
import android.util.Base64;
import j$.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bya extends bxw {
    private byi a;
    private byte[] b;
    private int c;
    private int d;

    public bya() {
        super(false);
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.b;
        int i4 = bwp.a;
        System.arraycopy(bArr2, this.c, bArr, i, iMin);
        this.c += iMin;
        this.d -= iMin;
        g(iMin);
        return iMin;
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) throws bsz, byf {
        i(byiVar);
        this.a = byiVar;
        Uri uriNormalizeScheme = byiVar.a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        ahno.K("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = bwp.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new bsz("Unexpected URI format: ".concat(String.valueOf(String.valueOf(uriNormalizeScheme))), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.b = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new bsz("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e, true, 0);
            }
        } else {
            this.b = bwp.ah(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j = byiVar.h;
        int length = this.b.length;
        if (j > length) {
            this.b = null;
            throw new byf(2008);
        }
        int i2 = (int) j;
        this.c = i2;
        int i3 = length - i2;
        this.d = i3;
        long j2 = byiVar.i;
        if (j2 != -1) {
            this.d = (int) Math.min(i3, j2);
        }
        j(byiVar);
        return j2 == -1 ? this.d : j2;
    }

    @Override // defpackage.bye
    public final Uri c() {
        byi byiVar = this.a;
        if (byiVar != null) {
            return byiVar.a;
        }
        return null;
    }

    @Override // defpackage.bye
    public final void f() {
        if (this.b != null) {
            this.b = null;
            h();
        }
        this.a = null;
    }
}
