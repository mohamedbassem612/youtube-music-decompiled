package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aama implements aamb {
    private wej a;

    public aama(wej wejVar) {
        wejVar.getClass();
        this.a = wejVar;
    }

    @Override // defpackage.aamb
    public final synchronized int a(String str) {
        return b(str, 0);
    }

    @Override // defpackage.aamb
    public final synchronized int b(String str, int i) {
        String strB = this.a.b(str);
        if (strB != null) {
            try {
                i = Integer.parseInt(strB);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    @Override // defpackage.aamb
    public final synchronized long c(String str) {
        return d(str, 0L);
    }

    @Override // defpackage.aamb
    public final synchronized long d(String str, long j) {
        String strB = this.a.b(str);
        if (strB != null) {
            try {
                j = Long.parseLong(strB);
            } catch (NumberFormatException unused) {
            }
        }
        return j;
    }

    public final synchronized wej e() {
        return this.a;
    }

    @Override // defpackage.aamb
    public final synchronized String f(String str) {
        return g(str, null);
    }

    public final synchronized String g(String str, String str2) {
        if (this.a.b.a(str)) {
            str2 = this.a.b(str);
        }
        return str2;
    }

    @Override // defpackage.aamb
    public final synchronized void h(String str, boolean z) {
        vwt vwtVarC = this.a.c();
        vwtVarC.d(str, Boolean.toString(z));
        this.a = vwtVarC.b();
    }

    @Override // defpackage.aamb
    public final synchronized void i(String str, byte[] bArr) {
        vwt vwtVarC = this.a.c();
        vwtVarC.c("logging_params", bArr, new aaly(0));
        this.a = vwtVarC.b();
    }

    @Override // defpackage.aamb
    public final synchronized void j(String str, int i) {
        vwt vwtVarC = this.a.c();
        vwtVarC.d(str, Integer.toString(i));
        this.a = vwtVarC.b();
    }

    @Override // defpackage.aamb
    public final synchronized void k(String str, long j) {
        vwt vwtVarC = this.a.c();
        vwtVarC.d(str, Long.toString(j));
        this.a = vwtVarC.b();
    }

    @Override // defpackage.aamb
    public final synchronized void l(String str, String str2) {
        vwt vwtVarC = this.a.c();
        vwtVarC.d(str, str2);
        this.a = vwtVarC.b();
    }

    @Override // defpackage.aamb
    public final synchronized boolean m(String str, boolean z) {
        String strB = this.a.b(str);
        if (strB != null) {
            z = Boolean.parseBoolean(strB);
        }
        return z;
    }

    @Override // defpackage.aamb
    public final synchronized byte[] n(String str) {
        return (byte[]) this.a.a(str, new aalz(0));
    }

    @Override // defpackage.aamb
    public final synchronized boolean o() {
        return m("sd_card_offline_disk_error", false);
    }

    @Override // defpackage.aamb
    public final String p() {
        return ahno.Z(g("transfer_nonce", ""));
    }

    @Override // defpackage.aamb
    public final synchronized void q(double d) {
        vwt vwtVarC = this.a.c();
        vwtVarC.d("bytes_per_sec", Double.toString(d));
        this.a = vwtVarC.b();
    }
}
