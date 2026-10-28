package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class sr {
    public final uy a;
    public final sr b;

    public sr(String str, String str2, String str3) {
        azs.l(str);
        azs.l(str2);
        azs.l(str3);
        this.b = this;
        this.a = new uy(str, str2, str3);
    }

    public static final void j(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Property name cannot be blank.");
        }
    }

    public final sr a(long j) {
        this.a.a = j;
        return this.b;
    }

    public final sr b(String str, boolean... zArr) {
        azs.l(str);
        j(str);
        vh vhVar = new vh(str);
        vhVar.c = zArr;
        this.a.b(str, vhVar.a());
        return this.b;
    }

    public final sr c(String str, byte[]... bArr) {
        azs.l(str);
        j(str);
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == null) {
                throw new IllegalArgumentException(a.bP(i, "The byte[] at ", " is null."));
            }
        }
        uy uyVar = this.a;
        vh vhVar = new vh(str);
        vhVar.d = bArr;
        uyVar.b(str, vhVar.a());
        return this.b;
    }

    public ss d() {
        return new ss(this.a.a());
    }

    public final void e(String str, ss... ssVarArr) {
        azs.l(str);
        j(str);
        uz[] uzVarArr = new uz[ssVarArr.length];
        for (int i = 0; i < ssVarArr.length; i++) {
            ss ssVar = ssVarArr[i];
            if (ssVar == null) {
                throw new IllegalArgumentException(a.bP(i, "The document at ", " is null."));
            }
            uzVarArr[i] = ssVar.a;
        }
        uy uyVar = this.a;
        vh vhVar = new vh(str);
        vhVar.e = uzVarArr;
        uyVar.b(str, vhVar.a());
    }

    public final void f(String str, double... dArr) {
        azs.l(str);
        j(str);
        vh vhVar = new vh(str);
        vhVar.b = dArr;
        this.a.b(str, vhVar.a());
    }

    public final void g(String str, sp... spVarArr) {
        azs.l(str);
        j(str);
        for (int i = 0; i < spVarArr.length; i++) {
            if (spVarArr[i] == null) {
                throw new IllegalArgumentException(a.bP(i, "The EmbeddingVector at ", " is null."));
            }
        }
        uy uyVar = this.a;
        vh vhVar = new vh(str);
        vhVar.f = spVarArr;
        uyVar.b(str, vhVar.a());
    }

    public final void h(String str, long... jArr) {
        azs.l(str);
        j(str);
        vh vhVar = new vh(str);
        vhVar.a = jArr;
        this.a.b(str, vhVar.a());
    }

    public final void i(String str, String... strArr) {
        azs.l(str);
        azs.l(strArr);
        j(str);
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] == null) {
                throw new IllegalArgumentException(a.bP(i, "The String at ", " is null."));
            }
        }
        uy uyVar = this.a;
        vh vhVar = new vh(str);
        vhVar.b(strArr);
        uyVar.b(str, vhVar.a());
    }
}
