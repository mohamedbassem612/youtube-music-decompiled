package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class sz {
    public final va a;

    public sz(String str, List list) {
        azs.l(str);
        if (list.isEmpty()) {
            throw new IllegalArgumentException("multiSignerSha256Certificates cannot be empty");
        }
        for (int i = 0; i < list.size(); i++) {
            azs.m((byte[]) list.get(i), a.bP(i, "cert at index ", " cannot be null"));
        }
        this.a = new va(str, null, (byte[][]) list.toArray(new byte[0][]));
    }

    public final String a() {
        return this.a.a;
    }

    public final byte[] b() {
        return (byte[]) this.a.b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sz) {
            return this.a.equals(((sz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public sz(va vaVar) {
        azs.l(vaVar);
        this.a = vaVar;
    }

    public sz(String str, byte[] bArr) {
        azs.l(str);
        azs.l(bArr);
        this.a = new va(str, bArr, null);
    }
}
