package defpackage;

import android.widget.ScrollView;
import j$.util.Optional;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hgx implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hgx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, tbj] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                ((abvk) ((hgy) ((hhb) this.a).a).e.io()).ah();
                return;
            case 1:
                hgs hgsVar = ((hgq) this.a).e;
                int i = hgsVar.E;
                if (i == 2) {
                    hgsVar.c();
                } else if (i == 3) {
                    hgsVar.e();
                }
                hgsVar.E = 0;
                return;
            case 2:
                ((hia) this.a).o(hhz.c);
                return;
            case 3:
                Object obj = this.a;
                ReentrantLock reentrantLock = ((hik) obj).r;
                reentrantLock.lock();
                try {
                    ((hik) obj).w.set(null);
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            case 4:
                return;
            case 5:
                return;
            case 6:
                ((hlv) this.a).a().d();
                return;
            case 7:
                hmm hmmVar = (hmm) this.a;
                hmmVar.h.e();
                hmmVar.m.c(new aahm("PPSV"));
                hmmVar.b();
                return;
            case 8:
                hmm hmmVar2 = (hmm) this.a;
                hmmVar2.h.d();
                hmmVar2.m.c(new aahm("PPSE"));
                hmmVar2.b();
                return;
            case 9:
                Object obj2 = this.a;
                Optional optionalB = ((hqg) obj2).b();
                hge hgeVar = new hge(obj2, 12);
                if (true == optionalB.isPresent()) {
                    wer werVar = (wer) optionalB.get();
                    hqg hqgVar = (hqg) hgeVar.a;
                    if (((vxz) hqgVar.h.io()).l(60, 45385690L, false)) {
                        ahno.at(hqgVar.a(werVar), new hfb(werVar, 5), hqgVar.i);
                        return;
                    } else {
                        hqgVar.h(werVar);
                        hqg.o(werVar);
                        return;
                    }
                }
                return;
            case 10:
                hre hreVar = (hre) ((hdf) this.a).a;
                int iC = hreVar.c(hreVar.b);
                ScrollView scrollView = hreVar.a;
                if (scrollView != null) {
                    scrollView.smoothScrollTo(0, iC);
                    return;
                }
                return;
            case 11:
                hwm hwmVar = (hwm) this.a;
                hwmVar.g = false;
                hwmVar.d();
                return;
            case 12:
                ((ied) ((hxd) this.a).a.io()).h();
                return;
            case 13:
                ((hzq) this.a).a = amlg.INDIFFERENT;
                return;
            case 14:
                ((hzr) this.a).a = amlg.INDIFFERENT;
                return;
            case 15:
                ((ict) this.a).i();
                return;
            case 16:
                ((ict) this.a).m();
                return;
            case 17:
                jan janVar = (jan) this.a;
                ((abjp) janVar.b).d(0).hK(janVar.g);
                return;
            case 18:
                ((idr) this.a).s();
                return;
            case 19:
                ((inu) this.a).b();
                return;
            default:
                iog iogVar = (iog) this.a;
                iogVar.c.c(new hap());
                if (iogVar.m.r(48)) {
                    iogVar.m.v("sr_p", 48);
                    return;
                }
                return;
        }
    }
}
