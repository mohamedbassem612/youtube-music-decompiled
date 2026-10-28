package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class wnn {
    public static final wni a = new wng();
    public final abxv b;
    private final aunn c;

    public wnn(wlp wlpVar, abxv abxvVar, tgg tggVar) {
        this(abxvVar, tggVar);
        f(alzi.a, wlpVar, new wsj(12), new wtk(7));
    }

    public final tgg e() {
        return (tgg) this.c.io();
    }

    public final wnh f(MessageLite messageLite, wlp wlpVar, sya syaVar, sxz sxzVar) {
        return new wnh(wlpVar, e(), messageLite, syaVar, sxzVar);
    }

    public wnn(abxv abxvVar, tgg tggVar) {
        abxvVar.getClass();
        this.b = abxvVar;
        this.c = new pwa(tggVar, 2);
    }

    public wnn(abxv abxvVar, aunn aunnVar) {
        abxvVar.getClass();
        this.b = abxvVar;
        aunnVar.getClass();
        this.c = aunnVar;
    }

    protected wnn() {
        this.b = new abxv(new vrr(2));
        this.c = null;
    }

    public wnn(wlp wlpVar, abxv abxvVar, tgg tggVar, byte[] bArr) {
        this(abxvVar, tggVar);
        f(alpq.a, wlpVar, new wut(1), new wtk(16));
    }

    public wnn(wlp wlpVar, abxv abxvVar, tgg tggVar, char[] cArr) {
        this(abxvVar, tggVar);
        f(ambb.a, wlpVar, new wut(2), new wtk(18));
    }
}
