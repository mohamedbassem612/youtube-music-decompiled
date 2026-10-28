package defpackage;

import com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wiy {
    StreamingDataOuterClass$StreamingData a;
    final alvw b;
    byte[] c;
    Long d;
    Long e;
    public String f;
    wiu g;
    int h;
    wiv i;
    public boolean j;
    aomc k;
    boolean l;
    boolean m;
    zs n;

    public wiy(alvt alvtVar) {
        this.c = aigj.d.G();
        this.f = "";
        this.g = wiu.c;
        this.h = 0;
        this.l = false;
        this.m = false;
        StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData = alvtVar.h;
        this.a = streamingDataOuterClass$StreamingData == null ? StreamingDataOuterClass$StreamingData.getDefaultInstance() : streamingDataOuterClass$StreamingData;
        alvw alvwVar = alvtVar.g;
        this.b = alvwVar == null ? alvw.a : alvwVar;
        this.c = alvtVar.u.G();
        alvl alvlVar = alvtVar.f;
        aomc aomcVar = (alvlVar == null ? alvl.a : alvlVar).q;
        this.k = aomcVar == null ? aomc.a : aomcVar;
        alvf alvfVar = alvtVar.i;
        this.f = (alvfVar == null ? alvf.a : alvfVar).f;
        apji apjiVar = alvtVar.r;
        apjiVar = apjiVar == null ? apji.a : apjiVar;
        aihl aihlVar = aosp.a;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        apjiVar.c(aihlVarCheckIsLite);
        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
            apji apjiVar2 = alvtVar.r;
            apjiVar2 = apjiVar2 == null ? apji.a : apjiVar2;
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            apjiVar2.c(aihlVarCheckIsLite2);
            Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
            this.i = new wiv(((aoso) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).b);
        }
        if ((alvtVar.b & 2) != 0) {
            aoqd aoqdVar = alvtVar.e;
            this.g = new wiu(aoqdVar == null ? aoqd.a : aoqdVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0115  */
    /* JADX WARN: Code duplicated, block: B:58:0x0117  */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:65:0x0127  */
    /* JADX WARN: Code duplicated, block: B:66:0x0129  */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0133, code lost:
    
        if (r4.e.size() <= 0) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wja a() {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wiy.a():wja");
    }

    public final void b(long j) {
        this.e = Long.valueOf(j);
    }

    public final void c(vxz vxzVar) {
        this.n = new zs(vxzVar);
    }

    public wiy(StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData, alvw alvwVar) {
        this.c = aigj.d.G();
        this.f = "";
        this.g = wiu.c;
        this.h = 0;
        this.l = false;
        this.m = false;
        this.a = streamingDataOuterClass$StreamingData;
        this.b = alvwVar;
    }
}
