package defpackage;

import android.os.Handler;
import j$.util.concurrent.atomic.DesugarAtomicInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aace implements lot {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aace(ahgb ahgbVar, int i, int i2) {
        this.$cid = i2;
        this.b = ahgbVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, mbc] */
    @Override // defpackage.lot
    public final void a(lpa lpaVar) {
        int iIncrementAndGet;
        if (this.$cid != 0) {
            ahgb ahgbVar = (ahgb) this.b;
            Handler handler = (Handler) ahgbVar.d;
            kro.e(handler);
            kro.e(handler);
            if (lpaVar.j()) {
                int i = this.a - 1;
                if (i != 0) {
                    iIncrementAndGet = i != 2 ? ((AtomicInteger) ahgbVar.b).get() : DesugarAtomicInteger.updateAndGet((AtomicInteger) ahgbVar.b, new ktx());
                } else {
                    iIncrementAndGet = ((AtomicInteger) ahgbVar.b).incrementAndGet();
                }
            } else {
                iIncrementAndGet = ((AtomicInteger) ahgbVar.b).get();
            }
            int iDecrementAndGet = ((AtomicInteger) ahgbVar.a).decrementAndGet();
            if (iIncrementAndGet > 0 || iDecrementAndGet > 0) {
                return;
            }
            kpz kpzVar = (kpz) ahgbVar.e;
            if (kpzVar.w()) {
                kpzVar.l();
                return;
            }
            return;
        }
        boolean zJ = lpaVar.j();
        Object obj = this.b;
        if (!zJ) {
            ((aacg) ((ahgb) obj).a).d(String.format(Locale.US, "FCM %s fail", this.a != 1 ? "UNSUBSCRIBE" : "SUBSCRIBE"));
            return;
        }
        ahgb ahgbVar2 = (ahgb) obj;
        Object obj2 = ahgbVar2.a;
        ahgbVar2.e.b();
        aacg aacgVar = (aacg) obj2;
        aacgVar.c++;
        if (aacgVar.d == 1) {
            aaal.b(aacgVar.a, "SUBSCRIBED", true, aacgVar.b);
        } else {
            aaal.b(aacgVar.a, "UNSUBSCRIBED", true, aacgVar.b);
        }
        aach aachVar = aacgVar.f;
        int i2 = aachVar.g;
        if (i2 == 1) {
            aachVar.g = 2;
            Set set = aachVar.c;
            Iterator it = new HashSet(set).iterator();
            while (it.hasNext()) {
                ((xxj) it.next()).a(aachVar.a, null);
            }
            if (set.isEmpty()) {
                aachVar.e.e();
                aachVar.e = null;
                aachVar.b();
                return;
            }
        } else if (i2 == 3) {
            aachVar.g = 4;
            Set set2 = aachVar.c;
            if (!set2.isEmpty()) {
                aachVar.e.e();
                aachVar.e = null;
                aachVar.a();
                return;
            } else if (set2.isEmpty()) {
                aachVar.d.execute(new ztg(aachVar, 15));
            }
        }
        aagu.h(aachVar);
        aacg aacgVar2 = aachVar.e;
        if (aacgVar2 != null) {
            aacgVar2.e();
        }
        aachVar.e = null;
    }
}
