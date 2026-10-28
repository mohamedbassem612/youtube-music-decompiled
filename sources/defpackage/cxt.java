package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cxt implements bsw {
    private static final bse f;
    private static final bse g;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    private int h;

    static {
        bsd bsdVar = new bsd();
        bsdVar.e("application/id3");
        f = new bse(bsdVar);
        bsd bsdVar2 = new bsd();
        bsdVar2.e("application/x-scte35");
        g = new bse(bsdVar2);
    }

    public cxt(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return defpackage.cxt.f;
     */
    @Override // defpackage.bsw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bse a() {
        /*
            r2 = this;
            java.lang.String r2 = r2.a
            int r0 = r2.hashCode()
            r1 = -1468477611(0xffffffffa878cf55, float:-1.38117235E-14)
            if (r0 == r1) goto L29
            r1 = -795945609(0xffffffffd08ed577, float:-1.9170834E10)
            if (r0 == r1) goto L1e
            r1 = 1303648457(0x4db418c9, float:3.776904E8)
            if (r0 != r1) goto L34
            java.lang.String r0 = "https://developer.apple.com/streaming/emsg-id3"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L34
            goto L26
        L1e:
            java.lang.String r0 = "https://aomedia.org/emsg/ID3"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L34
        L26:
            bse r2 = defpackage.cxt.f
            goto L35
        L29:
            java.lang.String r0 = "urn:scte:scte35:2014:bin"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L34
            bse r2 = defpackage.cxt.g
            goto L35
        L34:
            r2 = 0
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxt.a():bse");
    }

    @Override // defpackage.bsw
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cxt cxtVar = (cxt) obj;
            if (this.c == cxtVar.c && this.d == cxtVar.d && Objects.equals(this.a, cxtVar.a) && Objects.equals(this.b, cxtVar.b) && Arrays.equals(this.e, cxtVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.b;
        int iHashCode2 = ((((((((iHashCode + 527) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + a.ak(this.c)) * 31) + a.ak(this.d)) * 31) + Arrays.hashCode(this.e);
        this.h = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    @Override // defpackage.bsw
    public final /* synthetic */ void b(bsu bsuVar) {
    }
}
