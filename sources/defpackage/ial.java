package defpackage;

import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ial implements ahcx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ial(Object obj, Object obj2, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0181  */
    /* JADX WARN: Code duplicated, block: B:45:0x0188 A[Catch: IllegalArgumentException -> 0x022d, IllegalArgumentException | NullPointerException -> 0x022f, TryCatch #2 {IllegalArgumentException | NullPointerException -> 0x022f, blocks: (B:27:0x0126, B:29:0x0136, B:31:0x0147, B:33:0x0151, B:35:0x0157, B:37:0x0160, B:38:0x016b, B:39:0x0170, B:40:0x0171, B:43:0x0182, B:45:0x0188, B:47:0x0198, B:62:0x0226, B:63:0x022b, B:64:0x022c), top: B:73:0x0126 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0222 A[LOOP:1: B:43:0x0182->B:61:0x0222, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ahcx
    public final ListenableFuture a() {
        int i;
        aalx aalxVar;
        int i2 = this.$cid;
        int i3 = 19;
        int i4 = 0;
        if (i2 != 0) {
            int i5 = 2;
            if (i2 != 1) {
                Object obj = this.b;
                afnp afnpVar = (afnp) obj;
                ListenableFuture listenableFutureAn = ahno.an(((qso) afnpVar.d().a).b().d(afwl.e(new qse(new afnn(afnpVar.d), i4)), MoreExecutors.directExecutor()).g(), Exception.class, new aekb(new acsc(obj, 20), 13), MoreExecutors.directExecutor());
                aekb aekbVar = new aekb(new acsc(obj, 19), 9);
                ExecutorService executorService = afnpVar.b;
                return ahno.as(ahno.as(ahno.as(listenableFutureAn, aekbVar, executorService), new aekb(new acjo(obj, this.c, 9, null), 11), executorService), new aekb(new afnl(afnpVar, this.a, i5), 12), executorService);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                Optional optional = (Optional) ahng.v((ListenableFuture) it.next());
                hun hunVar = new hun(arrayList, 2);
                if (true == optional.isPresent()) {
                    hunVar.a.add((aapt) optional.get());
                }
            }
            if (arrayList.isEmpty()) {
                return ahng.n(alts.a);
            }
            boolean z = this.a;
            huy huyVar = (huy) this.b;
            abfv abfvVar = huyVar.g;
            twf twfVar = huyVar.b;
            abxv abxvVar = huyVar.f;
            return ((wnh) ((aaqc) abfvVar.a).e).a(abfvVar.x(abxvVar.a(), abxvVar.d(), Alert.DURATION_SHOW_INDEFINITELY, twfVar.a(), arrayList, z));
        }
        Object objD = this.c;
        abnl abnlVar = (abnl) objD;
        String strW = abnlVar.w();
        boolean zM = hna.m(abnlVar);
        Object obj2 = this.b;
        boolean z2 = this.a;
        if (zM && !TextUtils.isEmpty(strW)) {
            return ((iao) obj2).a(abnlVar, z2);
        }
        iao iaoVar = (iao) obj2;
        aaqk aaqkVarA = iaoVar.a.a(abnlVar.u(), abnlVar.w());
        try {
            aaqkVarA.getClass();
            List listB = aaqkVarA.b((abnl) objD);
            if (listB.isEmpty()) {
                throw null;
            }
            String strW2 = ((abnl) objD).w();
            int iA = ((abnl) objD).a();
            if (iA == -1 || !tym.C(iA, listB.size())) {
                i = 0;
                while (true) {
                    if (i < listB.size()) {
                        throw new IllegalArgumentException();
                    }
                    aalxVar = (aalx) listB.get(i);
                    if (TextUtils.equals(strW2, aalxVar.b())) {
                        objD = iao.d((abnl) objD, aalxVar, i);
                        break;
                    }
                    i++;
                }
            } else if (TextUtils.isEmpty(strW2)) {
                aalx aalxVarI = a.I(aaqkVarA, (abnl) objD);
                if (aalxVarI == null) {
                    throw new IllegalArgumentException();
                }
                objD = iao.d((abnl) objD, aalxVarI, listB.indexOf(aalxVarI));
            } else if (!TextUtils.equals(strW2, ((aalx) listB.get(iA)).b())) {
                i = 0;
                while (true) {
                    if (i < listB.size()) {
                        throw new IllegalArgumentException();
                    }
                    aalxVar = (aalx) listB.get(i);
                    if (TextUtils.equals(strW2, aalxVar.b())) {
                        objD = iao.d((abnl) objD, aalxVar, i);
                        break;
                    }
                    i++;
                }
            }
            abnlVar.J();
            abnl abnlVar2 = (abnl) objD;
            aamh aamhVarA = aaqkVarA.a(abnlVar2);
            if (aamhVarA == null) {
                return ahng.m(new NullPointerException());
            }
            aofc aofcVarC = hlz.c(aamhVarA);
            jkj jkjVar = new jkj();
            jkjVar.a = aamhVarA.a;
            jkjVar.g(aamhVarA.b);
            jkjVar.f(aofcVarC != null && aofcVarC.c);
            iar iarVarE = jkjVar.e();
            List listB2 = aaqkVarA.b(abnlVar2);
            if (iaoVar.c(z2)) {
                return ahno.as(ahno.an(ahng.u(ahno.ar(iaoVar.d.q(abnlVar2, null), new hqt(i3), MoreExecutors.directExecutor()), iaoVar.c, TimeUnit.SECONDS, iaoVar.b), Throwable.class, new iaj(iaoVar, abnlVar2, iarVarE, listB2, 1), MoreExecutors.directExecutor()), new iaj(iaoVar, abnlVar2, iarVarE, listB2, 0), MoreExecutors.directExecutor());
            }
            return iaoVar.f.Z(abnlVar2, iarVarE, listB2, null);
        } catch (IllegalArgumentException | NullPointerException e) {
            return !TextUtils.isEmpty(abnlVar.w()) ? iaoVar.a(abnlVar, z2) : ahng.m(e);
        }
    }
}
