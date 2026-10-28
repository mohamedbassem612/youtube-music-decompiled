package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xxj {
    public final /* synthetic */ Object a;

    public xxj(Object obj) {
        this.a = obj;
    }

    public final void a(amfl amflVar, amfn amfnVar) {
        Object obj = this.a;
        Map map = ((aaaj) obj).b;
        synchronized (map) {
            ((aaaj) obj).a.az(aaaj.a(amflVar));
            if (amfnVar == null) {
                zgc zgcVar = new zgc(obj, aaaj.a(amflVar), 18);
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    ((aaaj) obj).c.post(zgcVar);
                } else {
                    zgcVar.run();
                }
            }
            xxj xxjVar = ((aaaj) obj).f;
            ((wwn) xxjVar.a).o.iM((acjx) map.get(aaaj.a(amflVar)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:184:0x053a  */
    /* JADX WARN: Code duplicated, block: B:190:0x056e  */
    /* JADX WARN: Code duplicated, block: B:195:0x057a  */
    /* JADX WARN: Code duplicated, block: B:200:0x058d  */
    /* JADX WARN: Code duplicated, block: B:202:0x0592  */
    /* JADX WARN: Code duplicated, block: B:205:0x0599  */
    /* JADX WARN: Code duplicated, block: B:234:0x060f  */
    /* JADX WARN: Code duplicated, block: B:235:0x0611 A[Catch: JSONException -> 0x0615, TRY_LEAVE, TryCatch #11 {JSONException -> 0x0615, blocks: (B:232:0x0605, B:235:0x0611, B:230:0x05eb), top: B:401:0x0605 }] */
    /* JADX WARN: Code duplicated, block: B:254:0x069b  */
    /* JADX WARN: Code duplicated, block: B:259:0x06be  */
    /* JADX WARN: Code duplicated, block: B:261:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:266:0x06e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:272:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:274:0x0703  */
    /* JADX WARN: Code duplicated, block: B:276:0x072b  */
    /* JADX WARN: Code duplicated, block: B:279:0x0747  */
    /* JADX WARN: Code duplicated, block: B:283:0x078a  */
    /* JADX WARN: Code duplicated, block: B:288:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:291:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:294:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:401:0x0605 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x0519 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x05ae A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x05ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x0643 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x06ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:? A[LOOP:1: B:252:0x0695->B:442:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0397, code lost:
    
        if (r1.equals("DISABLED") != false) goto L122;
     */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(org.json.JSONArray r33) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxj.b(org.json.JSONArray):void");
    }

    public final void c(amej amejVar) {
        ((xdb) this.a).a(amejVar);
    }

    public final void d() {
        wwk wwkVar;
        xbi xbiVar = (xbi) this.a;
        String str = xbiVar.l;
        if (str == null || (wwkVar = xbiVar.y) == null) {
            return;
        }
        wwkVar.c(str);
    }

    public final void e() {
        wwt wwtVar = (wwt) this.a;
        wwtVar.a(wwtVar.i);
    }

    public final void f(ohp ohpVar) {
        vzt vztVar = (vzt) this.a;
        if (vztVar.h) {
            return;
        }
        vztVar.c(vztVar.k.H(ohpVar), false);
    }

    @tcc
    public void handleMdxPlaybackChangedEvent(xyt xytVar) {
        xxk xxkVar = (xxk) this.a;
        xxkVar.g().getClass();
        yco ycoVar = xxkVar.j.e;
        if (ycoVar != null) {
            agrx agrxVar = agso.a;
            if (xxkVar.i) {
                xxkVar.i = false;
                return;
            }
            xyv xyvVar = xytVar.a;
            if (xyvVar.d()) {
                if (xytVar.b != 1) {
                    xxkVar.b(xyvVar);
                    return;
                } else {
                    xxkVar.d(xyvVar);
                    return;
                }
            }
            if (xyvVar.f(ycoVar.A()) && !TextUtils.isEmpty(ycoVar.z())) {
                xxkVar.b(xyvVar);
                return;
            }
            if (ycoVar.am() && ycoVar.al()) {
                int i = xytVar.b;
                return;
            }
            abvk abvkVarG = xxkVar.g();
            abvkVarG.getClass();
            abvkVarG.r();
            xxkVar.d.c(xxo.c);
        }
    }

    @tcc
    public void handleMdxSessionStatusEvent(xzh xzhVar) {
        xxk xxkVar = (xxk) this.a;
        abvk abvkVarG = xxkVar.g();
        abvkVarG.getClass();
        xzc xzcVar = xzhVar.a;
        if (xzcVar == null) {
            xxkVar.e.c();
            abjx abjxVar = xzhVar.b;
            xxi xxiVar = xxkVar.f;
            amyu amyuVar = xxiVar.a;
            boolean z = xxiVar.b;
            abnl abnlVar = xxiVar.c;
            Float f = xxiVar.d;
            xxkVar.e(abjxVar, amyuVar, z);
            return;
        }
        int iB = xzcVar.b();
        if (iB == 0) {
            if (xxkVar.h && xxkVar.k.l(29, 45370305L, false)) {
                return;
            }
            abvkVarG.ap(false, 19);
            return;
        }
        if (iB == 1) {
            xxkVar.e.c();
            xxkVar.c();
            return;
        }
        xxkVar.e.c();
        abjx abjxVar2 = xzhVar.b;
        xxi xxiVar2 = xxkVar.f;
        amyu amyuVar2 = xxiVar2.a;
        boolean z2 = xxiVar2.b;
        abnl abnlVar2 = xxiVar2.c;
        Float f2 = xxiVar2.d;
        xxkVar.e(abjxVar2, amyuVar2, z2);
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        ((xxk) this.a).i = true;
    }

    public /* synthetic */ xxj(Object obj, byte[] bArr) {
        this.a = obj;
    }
}
