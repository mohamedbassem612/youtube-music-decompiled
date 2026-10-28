package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rw extends vm {
    public final byte[] a;
    public final String b;
    public final String c;
    public final String d;
    private Integer e;

    public rw(byte[] bArr, String str, String str2, String str3) {
        super((byte[]) null);
        this.a = bArr;
        azs.h(bArr.length == 32, "The input digest isn't a sha-256 digest.");
        azs.l(str);
        this.b = str;
        azs.l(str2);
        this.c = str2;
        azs.l(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rw) {
            rw rwVar = (rw) obj;
            if (Arrays.equals(this.a, rwVar.a) && this.b.equals(rwVar.b) && this.c.equals(rwVar.c) && this.d.equals(rwVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = this.e;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(Objects.hash(Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, this.d));
            this.e = numValueOf;
        }
        return numValueOf.intValue();
    }

    public final String toString() {
        vn vnVar = new vn();
        vnVar.a("{\n");
        vnVar.d();
        vnVar.a("packageName: \"");
        vnVar.a(this.b);
        vnVar.a("\",\n");
        vnVar.a("databaseName: \"");
        vnVar.a(this.c);
        vnVar.a("\",\n");
        vnVar.a("namespace: \"");
        vnVar.a(this.d);
        vnVar.a("\",\n");
        vnVar.a("digest: \"");
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                vnVar.a("\",\n");
                vnVar.c();
                vnVar.a("}");
                return vnVar.toString();
            }
            String hexString = Integer.toHexString(bArr[i] & 255);
            if (hexString.length() == 1) {
                vnVar.b('0');
            }
            vnVar.a(hexString);
            i++;
        }
    }
}
