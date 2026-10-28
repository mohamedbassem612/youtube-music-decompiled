package defpackage;

import j$.time.Duration;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aads implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ aads(aadu aaduVar, String str, List list, aohm aohmVar, aohx aohxVar, aamn aamnVar, byte[] bArr, int i) {
        this.$cid = i;
        this.a = aaduVar;
        this.b = str;
        this.c = list;
        this.d = aohmVar;
        this.e = aohxVar;
        this.f = aamnVar;
        this.g = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yqs] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, tgg] */
    /* JADX WARN: Type inference failed for: r6v1, types: [abor, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            aadu aaduVar = (aadu) this.a;
            if (aaduVar.g.C()) {
                Object obj = this.g;
                Object obj2 = this.f;
                Object obj3 = this.e;
                Object obj4 = this.d;
                aaduVar.i((String) this.b, this.c, (aohm) obj4, Long.MAX_VALUE, false, (aohx) obj3, (aamn) obj2, -1, (byte[]) obj);
                return;
            }
            return;
        }
        if (i == 1) {
            ?? r0 = this.d;
            Object obj5 = this.f;
            Object obj6 = this.e;
            ((yrv) this.b).g(this.a, (yrr) obj6, (wlo) obj5, r0);
            return;
        }
        Object obj7 = this.a;
        Object obj8 = this.b;
        Object obj9 = this.c;
        Object obj10 = this.g;
        Object obj11 = this.f;
        ((abpj) this.e).g(this.d, (abnl) obj11, (String) obj10, (Duration) obj9, (aphs) obj8, (sxw) obj7);
    }

    public /* synthetic */ aads(abpj abpjVar, abor aborVar, abnl abnlVar, String str, Duration duration, aphs aphsVar, sxw sxwVar, int i) {
        this.$cid = i;
        this.e = abpjVar;
        this.d = aborVar;
        this.f = abnlVar;
        this.g = str;
        this.c = duration;
        this.b = aphsVar;
        this.a = sxwVar;
    }

    public /* synthetic */ aads(yrv yrvVar, tgg tggVar, yrr yrrVar, wlo wloVar, yqs yqsVar, yxh yxhVar, zjd zjdVar, int i) {
        this.$cid = i;
        this.b = yrvVar;
        this.a = tggVar;
        this.e = yrrVar;
        this.f = wloVar;
        this.d = yqsVar;
        this.c = yxhVar;
        this.g = zjdVar;
    }
}
