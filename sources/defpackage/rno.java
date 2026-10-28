package defpackage;

import com.google.android.apps.youtube.music.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rno implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rno(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, rvq] */
    /* JADX WARN: Type inference failed for: r4v20, types: [avmn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                rnp rnpVar = (rnp) this.a;
                rnpVar.h(rnpVar.g);
                break;
            case 1:
                rnp rnpVar2 = (rnp) this.a;
                rnpVar2.i(rnpVar2.f);
                break;
            case 2:
                ((roe) this.a).m(true);
                break;
            case 3:
                rop ropVar = (rop) this.a;
                if (ropVar.k && ropVar.j <= 0) {
                    ropVar.c.j(2);
                } else {
                    ropVar.g.setTextColor(tzk.n(ropVar.a, R.attr.ytBrandRed).orElse(0));
                    ropVar.h.setText("");
                    tuk.u(ropVar.i, ropVar.b.getString(R.string.retry_password));
                    if (ropVar.k) {
                        ropVar.j--;
                    }
                }
                break;
            case 4:
                rpy rpyVar = (rpy) this.a;
                if (rpyVar.c.c()) {
                    rpyVar.d.a(null, rpyVar.e);
                }
                break;
            case 5:
                CopyOnWriteArraySet copyOnWriteArraySet = ((rqa) this.a).k;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ((zws) it.next()).d();
                }
                copyOnWriteArraySet.clear();
                break;
            case 6:
                rry rryVar = (rry) this.a;
                rryVar.b = rmp.u(rryVar.a);
                break;
            case 7:
                rrx rrxVar = (rrx) this.a;
                rrxVar.b = rmp.u(rrxVar.a);
                break;
            case 8:
                this.a.dispose();
                break;
            case 9:
                ((acjb) this.a).e(false, acjc.RESUME_INTERRUPTED_PLAYBACK);
                break;
            case 10:
                Object obj = this.a;
                rvp rvpVar = (rvp) obj;
                if (rvpVar.a) {
                    rvr rvrVar = (rvr) rvpVar.d;
                    rvrVar.d.n(rvrVar.a);
                } else {
                    try {
                        sko skoVarA = (sko) ahng.v(((rvp) obj).b);
                        ?? r1 = rvpVar.c;
                        if (r1 != 0) {
                            skoVarA = r1.a(((rvr) rvpVar.d).a, skoVarA);
                        }
                        rvr rvrVar2 = (rvr) rvpVar.d;
                        rvrVar2.d.m(rvrVar2.a, skoVarA);
                    } catch (RuntimeException | ExecutionException e) {
                        Object obj2 = rvpVar.d;
                        sau sauVar = new sau("Fulfillment error: ".concat(e.toString()), 25);
                        rvr rvrVar3 = (rvr) obj2;
                        rsk rskVar = rvrVar3.d;
                        smr smrVar = rvrVar3.a;
                        rskVar.v(smrVar, sauVar, 5);
                        rmp.k(smrVar, "Slot failed to be fulfilled.  slot id: " + smrVar.a + ". msg: " + e.getMessage());
                        return;
                    }
                }
                break;
            case 11:
                rxb rxbVar = (rxb) this.a;
                rxbVar.f(rxbVar.a);
                break;
            case 12:
                rxf rxfVar = (rxf) this.a;
                soi soiVar = rxfVar.a;
                int i = soiVar.l;
                boolean z = soiVar.g;
                if (rww.f(soiVar)) {
                    new xgj(rxfVar.a.d, (amud) null);
                    rmp.n(null, "No interactionLogger available for logShown");
                    rxfVar.a = rww.e(rxfVar.a);
                }
                break;
            case 13:
                rxh rxhVar = (rxh) this.a;
                rxhVar.z(rxhVar.a);
                break;
            case 14:
                rxh rxhVar2 = (rxh) this.a;
                soi soiVar2 = rxhVar2.c;
                int i2 = soiVar2.l;
                boolean z2 = soiVar2.g;
                if (rww.f(soiVar2)) {
                    new xgj(rxhVar2.c.d, (amud) null);
                    rmp.n(null, "No interactionLogger available for logShown");
                    rxhVar2.c = rww.e(rxhVar2.c);
                }
                break;
            case 15:
                rxi rxiVar = (rxi) this.a;
                rxiVar.w(rxiVar.a);
                break;
            case 16:
                rxi rxiVar2 = (rxi) this.a;
                soi soiVar3 = rxiVar2.c;
                int i3 = soiVar3.l;
                boolean z3 = soiVar3.g;
                if (rww.f(soiVar3)) {
                    new xgj(rxiVar2.c.d, (amud) null);
                    rmp.n(null, "No interactionLogger available for logShown");
                    rxiVar2.c = rww.e(rxiVar2.c);
                }
                break;
            case 17:
                rxk rxkVar = (rxk) this.a;
                rxkVar.f(rxkVar.a);
                break;
            case 18:
                rxl rxlVar = (rxl) this.a;
                rxlVar.s(rxlVar.a);
                break;
            case 19:
                rxm rxmVar = (rxm) this.a;
                rxmVar.s(rxmVar.a);
                break;
            default:
                ((acjb) this.a).e(false, acjc.SKIP);
                break;
        }
    }
}
