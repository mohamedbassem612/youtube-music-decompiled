package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ltk {
    public static final /* synthetic */ int a = 0;
    private static final lxl b = lxl.a();

    public static lud a(byte[] bArr) {
        lyo lyoVarC = c(bArr, lud.d(), new lti(6));
        if (bArr != null) {
            lxq lxqVar = (lxq) lyoVarC;
            lxqVar.s();
            lud ludVar = (lud) lxqVar.a;
            ludVar.bitField0_ |= 8;
            ludVar.responseBytes_ = bArr.length;
        }
        return (lud) ((lxq) lyoVarC).o();
    }

    public static lvw b(byte[] bArr, int i) {
        lxq lxqVar = (lxq) c(bArr, lvw.f(), new lti(13));
        lxqVar.s();
        lvw lvwVar = (lvw) lxqVar.a;
        lvwVar.bitField0_ |= SemanticState.Focused;
        lvwVar.requestBytes_ = i;
        if (bArr != null) {
            lxqVar.s();
            lvw lvwVar2 = (lvw) lxqVar.a;
            lvwVar2.bitField0_ |= SemanticState.Hidden;
            lvwVar2.responseBytes_ = bArr.length;
            long jCurrentTimeMillis = System.currentTimeMillis() - lxqVar.C().nativeToJavaStartTimestampMs_;
            lxq lxqVarV = lxqVar.C().v();
            lxqVarV.A((int) jCurrentTimeMillis);
            lxqVar.s();
            ((lvw) lxqVar.a).e((lvg) lxqVarV.o());
        }
        return (lvw) lxqVar.o();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, lyo] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, lyo] */
    public static lyo c(byte[] bArr, lyo lyoVar, ltj ltjVar) {
        if (bArr == null) {
            lxq lxqVarC = lwf.c();
            lxqVarC.G(8);
            return ltjVar.a((lwf) lxqVarC.o());
        }
        try {
            lwm lwmVar = (lwm) lyoVar;
            lwmVar.m(bArr, bArr.length, b);
            return lyoVar;
        } catch (lyh unused) {
            lxq lxqVarC2 = lwf.c();
            lxqVarC2.G(8);
            return ltjVar.a((lwf) lxqVarC2.o());
        }
    }
}
