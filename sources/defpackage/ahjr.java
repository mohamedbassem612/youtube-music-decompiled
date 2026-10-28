package defpackage;

import java.security.spec.ECParameterSpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahjr {
    public static final ahjr a = new ahjr("NIST_P256", ahgu.a);
    public static final ahjr b = new ahjr("NIST_P384", ahgu.b);
    public static final ahjr c = new ahjr("NIST_P521", ahgu.c);
    public final String d;
    public final ECParameterSpec e;

    private ahjr(String str, ECParameterSpec eCParameterSpec) {
        this.d = str;
        this.e = eCParameterSpec;
    }

    public final String toString() {
        return this.d;
    }
}
