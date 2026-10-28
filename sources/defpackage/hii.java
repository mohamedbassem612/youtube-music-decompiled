package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hii implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hii(String str, int i, int i2) {
        this.$cid = i2;
        this.b = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        this.c = str;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        int i;
        ptj ptjVar;
        int i2;
        int i3 = this.$cid;
        if (i3 == 0) {
            Throwable th = (Throwable) obj;
            th.getClass();
            int i4 = this.a;
            Object obj2 = this.c;
            Object obj3 = this.b;
            if (i4 >= 3) {
                ((hjn) obj2).b(tau.MEDIA_BROWSER_GET_ROOT_REQUEST_FAILED);
                ((agrc) ((agrc) hik.a.c()).j(th).k("com/google/android/apps/youtube/music/mediabrowser/content/MediaClientContentSupplier", "executeGetRootMediaItemsRequest$<anonymous>", 397, "MediaClientContentSupplier.kt")).w("GetRootMediaItemsRequest failed for client %s", ((hik) obj3).q);
                return ahng.m(th);
            }
            ReentrantLock reentrantLock = ((hik) obj3).r;
            reentrantLock.lock();
            try {
                return ((hik) obj3).c((hjn) obj2, i4 + 1);
            } finally {
                reentrantLock.unlock();
            }
        }
        if (i3 == 1) {
            dpt dptVar = (dpt) obj;
            dptVar.getClass();
            dpb dpbVarA = dptVar.a((String) this.b);
            int i5 = this.a;
            try {
                dpbVarA.i(1, (String) this.c);
                dpbVarA.g(2, i5);
                dpbVarA.l();
                return awmy.a;
            } finally {
                dpbVarA.close();
            }
        }
        if (i3 != 2) {
            ((Integer) obj).getClass();
            ?? r3 = this.c;
            int i6 = this.a;
            aduh aduhVar = (aduh) this.b;
            return awro.r(aduhVar.b, awov.a, 1, new adug(aduhVar, i6, (awqg) r3, (awoq) null, 0));
        }
        dpb dpbVarA2 = ((dpt) obj).a((String) this.b);
        ?? r5 = this.c;
        try {
            dpbVarA2.g(1, qnl.al(this.a));
            Iterator it = r5.iterator();
            int i7 = 2;
            while (it.hasNext()) {
                dpbVarA2.g(i7, qnl.ai((ptj) it.next()));
                i7++;
            }
            int iM = ape.m(dpbVarA2, "id");
            int iM2 = ape.m(dpbVarA2, "account_name");
            int iM3 = ape.m(dpbVarA2, "experiment_id");
            int iM4 = ape.m(dpbVarA2, "experiment_type");
            int iM5 = ape.m(dpbVarA2, "insertion_time");
            int iM6 = ape.m(dpbVarA2, "experiment_source");
            ArrayList arrayList = new ArrayList();
            while (dpbVarA2.l()) {
                int iB = (int) dpbVarA2.b(iM);
                String strD = dpbVarA2.d(iM2);
                int iB2 = (int) dpbVarA2.b(iM3);
                int iB3 = (int) dpbVarA2.b(iM4);
                ptj[] ptjVarArrValues = ptj.values();
                int length = ptjVarArrValues.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        i = iM;
                        ptjVar = null;
                        break;
                    }
                    ptjVar = ptjVarArrValues[i8];
                    i = iM;
                    if (ptjVar.d == iB3) {
                        break;
                    }
                    i8++;
                    iM = i;
                }
                if (ptjVar == null) {
                    ptjVar = ptj.EXPERIMENT_TYPE_UNSPECIFIED;
                }
                ptj ptjVar2 = ptjVar;
                Instant instantOfEpochMilli = Instant.ofEpochMilli(dpbVarA2.b(iM5));
                instantOfEpochMilli.getClass();
                int iB4 = (int) dpbVarA2.b(iM6);
                int i9 = 3;
                int[] iArr = {1, 2, 3};
                int i10 = 0;
                while (true) {
                    if (i10 >= i9) {
                        i2 = 0;
                        break;
                    }
                    i2 = iArr[i10];
                    int i11 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i11 == iB4) {
                        break;
                    }
                    i10++;
                    i9 = 3;
                }
                arrayList.add(new ptk(iB, strD, iB2, ptjVar2, instantOfEpochMilli, i2 == 0 ? 1 : i2));
                iM = i;
            }
            return arrayList;
        } finally {
            dpbVarA2.close();
        }
    }

    public /* synthetic */ hii(Object obj, int i, Object obj2, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
        this.c = obj2;
    }

    public /* synthetic */ hii(int i, hik hikVar, hjn hjnVar, int i2) {
        this.$cid = i2;
        this.a = i;
        this.b = hikVar;
        this.c = hjnVar;
    }
}
