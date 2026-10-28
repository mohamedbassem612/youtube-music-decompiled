package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abiu implements Runnable {
    final /* synthetic */ tam a;

    public abiu(tam tamVar) {
        this.a = tamVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        akww akwwVar;
        avlr avlrVarW;
        taq.c();
        tam tamVar = this.a;
        int i = 1;
        avlh avlhVarI = ((avlh) tamVar.m.r().a).i(new abwr(i));
        abiv abivVar = tamVar.k;
        abivVar.getClass();
        tamVar.n = avlhVarI.al(new aawl(new abid(abivVar, 14), "PPT", 1), new xuk(15));
        abis abisVar = tamVar.o;
        absr abitVar = abss.a;
        int i2 = 8;
        if (abisVar != null) {
            abitVar = new abit(this);
            if (tamVar.h.aj()) {
                xir xirVarO = tamVar.g.o(4);
                aihf aihfVarCreateBuilder = amiu.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
                amiuVar.b |= SemanticState.Focused;
                amiuVar.j = "warm";
                aihf aihfVarCreateBuilder2 = amiw.a.createBuilder();
                amjr amjrVar = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                aihfVarCreateBuilder2.copyOnWrite();
                amiw amiwVar = (amiw) aihfVarCreateBuilder2.instance;
                amiwVar.e = amjrVar.o;
                amiwVar.b |= 8;
                amiw amiwVar2 = (amiw) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder.copyOnWrite();
                amiu amiuVar2 = (amiu) aihfVarCreateBuilder.instance;
                amiwVar2.getClass();
                amiuVar2.N = amiwVar2;
                amiuVar2.d |= 8;
                xirVarO.h((amiu) aihfVarCreateBuilder.build());
                abvc abvcVar = tamVar.f;
                abns abnsVarB = tamVar.b();
                abno abnoVarA = abnp.a();
                abnoVarA.a = xirVarO;
                abvcVar.l(abnsVarB, abnoVarA.a());
                return;
            }
        }
        absr absrVar = abitVar;
        abss abssVar = tamVar.c;
        abnk abnkVar = new abnk();
        abnkVar.a = tamVar.d;
        abnkVar.c = tamVar.i;
        abnkVar.b = tamVar.j;
        abnl abnlVarA = abnkVar.a();
        abns abnsVarB2 = tamVar.b();
        if (TextUtils.isEmpty(abnlVarA.w())) {
            new IllegalArgumentException("Unexpected empty videoId.");
            absrVar.b(4);
            return;
        }
        if (abnsVarB2.b == 1 && abnsVarB2.a <= 0) {
            new IllegalArgumentException("Invalid prefetchPlaybackContextWrapper.");
            absrVar.b(4);
            return;
        }
        vyo vyoVar = abssVar.c;
        aoqs aoqsVar = vyoVar.b().k;
        if (aoqsVar == null) {
            aoqsVar = aoqs.a;
        }
        if (aoqsVar.j) {
            new IllegalStateException("Prefetch request are disabled.");
            absrVar.b(5);
            return;
        }
        vyl.d();
        akwx akwxVar = akwx.a;
        alik alikVarB = vyoVar.b();
        if (alikVarB == null || (akwwVar = alikVarB.v) == null) {
            akwwVar = akww.a;
        }
        akwx akwxVar2 = (akwx) akwwVar.c.get(45746187L);
        if (akwxVar2 != null) {
            akwxVar = akwxVar2;
        }
        if (akwxVar.b == 1 && ((Boolean) akwxVar.c).booleanValue()) {
            boolean z = abssVar.f;
        }
        String strQ = abnlVarA.q(abssVar.e);
        zgj zgjVarA = abssVar.g.aL() ? abssVar.d.a(strQ, abnlVarA.w(), null, true, false) : null;
        abpd abpdVar = abssVar.b;
        aooj aoojVarA = abnsVarB2.a();
        if (TextUtils.isEmpty(abnlVarA.w())) {
            avlrVarW = avlr.A(new IllegalArgumentException("Unexpected empty videoId."));
        } else {
            awau awauVar = new awau(avmc.t(new aboy(abpdVar, abnlVarA, aoojVarA)), new abox(abpdVar, abnlVarA, strQ));
            avnn avnnVar = atqp.l;
            Executor executor = abpdVar.d;
            avmb avmbVar = awlg.a;
            avlrVarW = awauVar.W(new awir(executor));
        }
        avlrVarW.y(new abqg(absrVar, i2)).u(new vtu(absrVar, 12)).t(new vtu(zgjVarA, 13)).ag(new usm(zgjVarA, strQ, abnlVarA, absrVar, 2), new absp(absrVar, i));
    }
}
