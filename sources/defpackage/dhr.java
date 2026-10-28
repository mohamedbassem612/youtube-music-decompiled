package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dhr implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dhr(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [axo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [eom, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r9v15, types: [eco, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r9v32, types: [dty, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v33, types: [dty, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [axo, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        ees eesVar;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                ((dhs) this.a).c((String) this.b);
                return;
            case 1:
                cul culVar = (cul) this.b;
                SurfaceTexture surfaceTexture = culVar.d;
                Surface surface = culVar.e;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.a;
                Surface surface2 = new Surface(surfaceTexture2);
                culVar.d = surfaceTexture2;
                culVar.e = surface2;
                Iterator it = culVar.a.iterator();
                while (it.hasNext()) {
                    ((cch) it.next()).a.Z(surface2);
                }
                cul.a(surfaceTexture, surface);
                return;
            case 2:
                this.a.accept(this.b);
                return;
            case 3:
                Object obj = this.a;
                try {
                    this.b.run();
                    return;
                } finally {
                    ((dmy) obj).a();
                }
            case 4:
                ((aeiv) this.b).b.accept(this.a);
                return;
            case 5:
                String str = eam.a;
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    ((eab) it2.next()).a((eek) this.a, false);
                }
                return;
            case 6:
                Object obj2 = this.a;
                synchronized (((eam) obj2).l) {
                    arrayList = new ArrayList(((eam) obj2).j);
                    break;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((eaa) arrayList.get(i)).a((eek) this.b, false);
                }
                return;
            case 7:
                Object obj3 = this.a;
                ecg ecgVar = (ecg) obj3;
                Map map = ecgVar.g;
                Object obj4 = this.b;
                if (map.containsKey(obj4)) {
                    String str2 = ((eek) obj4).a;
                    dzf.b();
                    WorkDatabase workDatabase = ecgVar.e;
                    ees eesVarC = workDatabase.C().c(str2);
                    if (eesVarC != null && eesVarC.d == dzr.b) {
                        eeg eegVarA = workDatabase.z().a(bou.e(eesVarC));
                        if (eegVarA != null) {
                            ecf ecfVar = ecgVar.d;
                            int i2 = eegVarA.c;
                            try {
                                ((ecg) obj3).i(eesVarC, i2, ecfVar.a(eesVarC, i2, ecg.c));
                                break;
                            } catch (Exception e) {
                                String strConcat = "Unable to delay work ".concat(str2);
                                dzf.b();
                                Log.e(ecg.a, strConcat, e);
                            }
                            ((ecg) this.a).f.b(ecg.b, this);
                            return;
                        }
                    }
                    map.remove(obj4);
                    return;
                }
                return;
            case 8:
                Iterator it3 = this.b.iterator();
                while (it3.hasNext()) {
                    ((gei) it3.next()).a(((edl) this.a).d);
                }
                return;
            case 9:
                eam eamVar = ((edu) this.a).b.f;
                Object obj5 = eamVar.l;
                Object obj6 = this.b;
                synchronized (obj5) {
                    eby ebyVarB = eamVar.b((String) obj6);
                    eesVar = ebyVarB != null ? ebyVarB.a : null;
                }
                if (eesVar == null || !eesVar.c()) {
                    return;
                }
                ?? r9 = this.a;
                synchronized (((edu) r9).c) {
                    ((edu) r9).f.put(bou.e(eesVar), eesVar);
                    ((edu) r9).g.put(bou.e(eesVar), ecu.a(((edu) r9).i, eesVar, (awuq) ((edu) r9).j.b, r9));
                    break;
                }
                return;
            case 10:
                Iterator it4 = ((WorkDatabase) this.a).C().B().iterator();
                while (it4.hasNext()) {
                    dms.j((ebm) this.b, (String) it4.next());
                }
                return;
            case 11:
                String string = ((UUID) this.b).toString();
                string.getClass();
                dms.j((ebm) this.a, string);
                return;
            case 12:
                enu enuVar = (enu) this.a;
                aerq aerqVar = enuVar.m;
                if (enuVar.m.d != null) {
                    enuVar.m.d.c((eoh) this.b, agpi.a);
                    return;
                } else {
                    eov.e("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 13:
                ?? r0 = this.b;
                if (r0.isDone() || r0.isCancelled()) {
                    return;
                }
                ?? r10 = this.a;
                r0.cancel(true);
                eov.e("BillingClient", "Async task is taking too long, cancel it!");
                if (r10 != 0) {
                    r10.run();
                    return;
                }
                return;
            case 14:
                try {
                    ((env) this.a).b.h.b((eoh) this.b);
                    return;
                } catch (Throwable th) {
                    eov.f("BillingClient", "Exception calling onBillingSetupFinished.", th);
                    return;
                }
            case 15:
                try {
                    ((epy) this.a).a.put(this.b);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 16:
                Map map2 = ((fis) this.a).a;
                synchronized (map2) {
                    Object obj7 = this.b;
                    Integer num = (Integer) map2.get(obj7);
                    if (num != null) {
                        boolean z2 = num.intValue() > 0;
                        int iIntValue = num.intValue() - 1;
                        Integer numValueOf = Integer.valueOf(iIntValue);
                        numValueOf.getClass();
                        if (iIntValue > 0) {
                            map2.put(obj7, numValueOf);
                        } else {
                            map2.remove(obj7);
                        }
                        z = z2;
                    }
                    break;
                }
                if (z) {
                    this.b.run();
                    return;
                }
                return;
            case 17:
                ((duc) this.a).e(this.b);
                return;
            case 18:
                ((duc) this.a).j(this.b);
                return;
            case 19:
                Object obj8 = this.a;
                ((fqh) obj8).k();
                if (fna.I) {
                    ((fsy) this.b).r.remove(obj8);
                    return;
                }
                return;
            default:
                fsy.B((fqh) this.a, ((fsy) this.b).l);
                return;
        }
    }

    public /* synthetic */ dhr(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public dhr(Object obj, Object obj2, int i, char[] cArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public dhr(Object obj, Object obj2, int i, int[] iArr) {
        this.$cid = i;
        this.b = obj2;
        this.a = obj;
    }

    public dhr(Object obj, Object obj2, int i, short[] sArr) {
        this.$cid = i;
        this.a = obj2;
        this.b = obj;
    }
}
