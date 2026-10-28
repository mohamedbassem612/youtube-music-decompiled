package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class brc implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;

    public /* synthetic */ brc(List list, AtomicBoolean atomicBoolean, View view, View view2, List list2, int i) {
        this.$cid = i;
        this.d = list;
        this.a = atomicBoolean;
        this.b = view;
        this.c = view2;
        this.e = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.lang.Object, kzm] */
    /* JADX WARN: Type inference failed for: r10v29, types: [kzm] */
    /* JADX WARN: Type inference failed for: r10v31, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v34, types: [vhk] */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r1v17, types: [lga] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, vhj] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r2v25, types: [lga] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object, xgm] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r10;
        ?? L;
        int i = this.$cid;
        if (i == 0) {
            IBinder iBinderL = ((zf) this.e).l();
            bre breVar = (bre) ((qcb) this.d).a;
            bqp bqpVar = (bqp) breVar.c.get(iBinderL);
            Object obj2 = this.a;
            if (bqpVar == null) {
                Log.w("MBServiceCompat", "search for callback that isn't registered query=".concat(String.valueOf(obj2)));
                return;
            }
            Object obj3 = this.b;
            bqm bqmVar = new bqm(obj2, (ResultReceiver) this.c);
            breVar.d = bqpVar;
            breVar.e((String) obj2, (Bundle) obj3, bqmVar);
            breVar.d = null;
            if (!bqmVar.d()) {
                throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=".concat(String.valueOf(obj2)));
            }
            return;
        }
        if (i == 1) {
            IBinder iBinderL2 = ((zf) this.e).l();
            bre breVar2 = (bre) ((qcb) this.d).a;
            bqp bqpVar2 = (bqp) breVar2.c.get(iBinderL2);
            Object obj4 = this.a;
            if (bqpVar2 == null) {
                Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=".concat(String.valueOf(obj4)));
                return;
            }
            Object obj5 = this.c;
            Object obj6 = this.b;
            HashMap map = bqpVar2.e;
            List<axq> arrayList = (List) map.get(obj4);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (axq axqVar : arrayList) {
                if (obj5 == axqVar.a) {
                    if (amw.d((Bundle) obj6, (Bundle) axqVar.b)) {
                        return;
                    }
                }
            }
            arrayList.add(new axq(obj5, obj6));
            map.put(obj4, arrayList);
            breVar2.g((String) obj4, bqpVar2, (Bundle) obj6);
            breVar2.d = null;
            return;
        }
        if (i == 2) {
            IBinder iBinderL3 = ((zf) this.e).l();
            bre breVar3 = (bre) ((qcb) this.d).a;
            bqp bqpVar3 = (bqp) breVar3.c.get(iBinderL3);
            Object obj7 = this.a;
            if (bqpVar3 == null) {
                Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + ((String) obj7) + ", extras=" + this.b);
                return;
            }
            Object obj8 = this.b;
            bqn bqnVar = new bqn(obj7, (ResultReceiver) this.c);
            breVar3.d = bqpVar3;
            breVar3.h((Bundle) obj8, bqnVar);
            breVar3.d = null;
            if (bqnVar.d()) {
                return;
            }
            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + ((String) obj7) + " extras=" + obj8);
        }
        if (i != 3) {
            if (i == 4) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        Object obj9 = this.d;
                        lco lcoVar = ((lff) obj9).b;
                        if (lcoVar == null) {
                            ((ldz) obj9).aT().c.c("Failed to get conditional properties; not connected to service", this.e, this.a);
                            L = ((ldz) obj9).L();
                            r10 = this.b;
                        } else {
                            arrayList2 = lga.D(lcoVar.g((String) this.e, (String) this.a, (lbg) this.c));
                            ((lff) obj9).A();
                            Object obj10 = this.d;
                            Object obj11 = this.b;
                            L = ((ldz) obj10).L();
                            r10 = obj11;
                        }
                    } catch (RemoteException e) {
                        ((ldz) this.d).aT().c.d("Failed to get conditional properties; remote exception", this.e, this.a, e);
                    }
                    L.U(r10, arrayList2);
                    return;
                } catch (Throwable th) {
                    ((ldz) this.d).L().U(this.b, arrayList2);
                    throw th;
                }
            }
            if (i != 5) {
                ?? r0 = this.a;
                for (apji apjiVar : r0) {
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(aqct.b);
                    apjiVar.c(aihlVarCheckIsLite);
                    Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                    ((xsc) this.d).b.hB().d(yno.fh((aqcr) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))));
                }
                ?? r1 = this.b;
                Object obj12 = this.e;
                ?? r11 = (vhk) this.c;
                r11.c(((aqrt) obj12).b);
                r1.o(false);
                r11.d(r0);
                return;
            }
            Object obj13 = this.c;
            Object obj14 = this.b;
            ?? r3 = this.d;
            if (r3 != 0 && ((AtomicBoolean) this.a).getAndSet(false)) {
                Iterator it = r3.iterator();
                while (it.hasNext()) {
                    ((ntp) it.next()).d((View) obj14, (View) obj13);
                }
            }
            ?? r12 = this.e;
            if (r12 != 0) {
                Iterator it2 = r12.iterator();
                while (it2.hasNext()) {
                    ((ntp) it2.next()).d((View) obj14, (View) obj13);
                }
                return;
            }
            return;
        }
        Object obj15 = this.a;
        synchronized (obj15) {
            try {
                try {
                    Object obj16 = this.c;
                    lco lcoVar2 = ((lff) obj16).b;
                    if (lcoVar2 == null) {
                        ((ldz) obj16).aT().c.d("(legacy) Failed to get conditional properties; not connected to service", null, this.d, this.e);
                        ((AtomicReference) obj15).set(Collections.EMPTY_LIST);
                        obj15.notify();
                    } else {
                        ((AtomicReference) obj15).set(lcoVar2.g((String) this.d, (String) this.e, (lbg) this.b));
                        ((lff) obj16).A();
                        obj = this.a;
                        obj.notify();
                    }
                } catch (RemoteException e2) {
                    ((ldz) this.c).aT().c.d("(legacy) Failed to get conditional properties; remote exception", null, this.d, e2);
                    ((AtomicReference) this.a).set(Collections.EMPTY_LIST);
                    obj = this.a;
                }
            } catch (Throwable th2) {
                this.a.notify();
                throw th2;
            }
        }
    }

    public brc(lff lffVar, String str, String str2, lbg lbgVar, kzm kzmVar, int i) {
        this.$cid = i;
        this.e = str;
        this.a = str2;
        this.c = lbgVar;
        this.b = kzmVar;
        this.d = lffVar;
    }

    public brc(lff lffVar, AtomicReference atomicReference, String str, String str2, lbg lbgVar, int i) {
        this.$cid = i;
        this.a = atomicReference;
        this.d = str;
        this.e = str2;
        this.b = lbgVar;
        this.c = lffVar;
    }

    public brc(qcb qcbVar, zf zfVar, String str, Bundle bundle, ResultReceiver resultReceiver, int i) {
        this.$cid = i;
        this.d = qcbVar;
        this.e = zfVar;
        this.a = str;
        this.b = bundle;
        this.c = resultReceiver;
    }

    public brc(qcb qcbVar, zf zfVar, String str, IBinder iBinder, Bundle bundle, int i) {
        this.$cid = i;
        this.d = qcbVar;
        this.e = zfVar;
        this.a = str;
        this.c = iBinder;
        this.b = bundle;
    }

    public /* synthetic */ brc(xsc xscVar, List list, vhk vhkVar, aqrt aqrtVar, vhj vhjVar, int i) {
        this.$cid = i;
        this.d = xscVar;
        this.a = list;
        this.c = vhkVar;
        this.e = aqrtVar;
        this.b = vhjVar;
    }
}
