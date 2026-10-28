package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kol implements kna, knb {
    public final kmt b;
    public final knu c;
    public Set f;
    public final int g;
    public boolean h;
    public final /* synthetic */ koq l;
    public final khn m;
    private final kpf n;
    private volatile kqk o;
    public final Queue a = new LinkedList();
    public final Set d = new HashSet();
    public final Map e = new HashMap();
    public final List i = new ArrayList();
    public klo j = null;
    public int k = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public kol(koq koqVar, kmz kmzVar) {
        this.l = koqVar;
        kmt kmtVarB = ((kro) kmzVar.E.b).b(kmzVar.v, koqVar.q.getLooper(), kmzVar.z().a(), kmzVar.y, this, this);
        ktd ktdVar = kmzVar.x;
        if (ktdVar != null) {
            ((kpz) kmtVarB).z = ktdVar;
        } else {
            String str = kmzVar.w;
            if (str != null) {
                ((kpz) kmtVarB).y = str;
            }
        }
        this.b = kmtVarB;
        this.c = kmzVar.z;
        this.m = new khn((byte[]) null);
        this.g = kmzVar.B;
        this.n = kmtVarB.i() ? new kpf(koqVar.g, koqVar.q, kmzVar.z().a()) : null;
    }

    private final klq r(klq[] klqVarArr) {
        if (klqVarArr == null) {
            return null;
        }
        klq[] klqVarArrY = this.b.y();
        if (klqVarArrY == null) {
            klqVarArrY = new klq[0];
        }
        afv afvVar = new afv(klqVarArrY.length);
        for (klq klqVar : klqVarArrY) {
            afvVar.put(klqVar.a, Long.valueOf(klqVar.a()));
        }
        klq klqVar2 = klqVarArr[0];
        Long l = (Long) afvVar.get(klqVar2.a);
        if (l == null || l.longValue() < klqVar2.a()) {
            return klqVar2;
        }
        return null;
    }

    private final Status s(klo kloVar) {
        return koq.a(this.c, kloVar);
    }

    private final void t(klo kloVar) {
        Set set = this.d;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((knv) it.next()).a(this.c, kloVar, Objects.equals(kloVar, klo.a) ? this.b.r() : null);
        }
        set.clear();
    }

    private final void u(Status status, Exception exc, boolean z) {
        kro.e(this.l.q);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            knt kntVar = (knt) it.next();
            if (!z || kntVar.c == 2) {
                if (status != null) {
                    kntVar.f(status);
                } else {
                    kntVar.g(exc);
                }
                it.remove();
            }
        }
    }

    private final void v(knt kntVar) {
        kntVar.i(this.m, q());
        try {
            kntVar.h(this);
        } catch (DeadObjectException unused) {
            b(1);
            this.b.v("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean w(knt kntVar) {
        kqk kqkVar;
        int iA;
        int maxInflight;
        if (!(kntVar instanceof knn)) {
            v(kntVar);
            return true;
        }
        knn knnVar = (knn) kntVar;
        klq klqVarR = r(knnVar.d(this));
        if (klqVarR != null) {
            Object obj = this.b;
            String name = obj.getClass().getName();
            long jA = klqVarR.a();
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(" could not execute call because it requires feature (");
            String str = klqVarR.a;
            sb.append(str);
            sb.append(", ");
            sb.append(jA);
            sb.append(").");
            Log.w("GoogleApiManager", sb.toString());
            koq koqVar = this.l;
            if (!koqVar.r || !knnVar.c(this)) {
                knnVar.g(new knm(klqVarR));
                return true;
            }
            int iA2 = knnVar.a(this);
            kom komVar = new kom(this.c, klqVarR);
            List list = this.i;
            int iIndexOf = list.indexOf(komVar);
            if (iIndexOf >= 0) {
                kom komVar2 = (kom) list.get(iIndexOf);
                Handler handler = koqVar.q;
                handler.removeMessages(15, komVar2);
                handler.sendMessageDelayed(Message.obtain(handler, 15, komVar2), 5000L);
            } else {
                list.add(komVar);
                Handler handler2 = koqVar.q;
                handler2.sendMessageDelayed(Message.obtain(handler2, 15, komVar), 5000L);
                handler2.sendMessageDelayed(Message.obtain(handler2, 16, komVar), 120000L);
                if (obj instanceof kpz) {
                    ((kpz) obj).E();
                }
                int i = klu.c;
                klo kloVar = new klo(1, 2, null, null, Integer.valueOf(iA2), null);
                if (x(kloVar)) {
                    Log.w("GoogleApiManager", "A dialog should be displayed for missing feature: " + str + ", version: " + klqVarR.a());
                } else if (koqVar.h(kloVar, this.g)) {
                    Log.w("GoogleApiManager", "Notification displayed for missing feature: " + str + ", version: " + klqVarR.a());
                }
            }
            return false;
        }
        if (!knnVar.d && !knnVar.e && (kqkVar = this.o) != null && (knnVar instanceof knn) && (iA = knnVar.a(this)) != 0) {
            koq koqVar2 = this.l;
            SparseArray sparseArray = kqkVar.a;
            elq elqVarI = koqVar2.i();
            kyt kytVar = (kyt) sparseArray.get(iA, (kyt) sparseArray.get(0));
            if (kytVar != null) {
                Object obj2 = elqVarI.a;
                long j = iA;
                int maxInflight2 = kytVar.getMaxInflight();
                if (maxInflight2 > 0) {
                    Object obj3 = ((kys) obj2).b;
                    synchronized (obj3) {
                        long[] jArr = (long[]) ((LongSparseArray) obj3).get(j);
                        if (jArr != null) {
                            long j2 = jArr[0];
                            long j3 = ((kys) obj2).a + 1;
                            ((kys) obj2).a = j3;
                            jArr[1] = j3;
                            if (j2 < maxInflight2) {
                                jArr[0] = j2 + 1;
                            }
                        } else {
                            if (((LongSparseArray) obj3).size() >= 2000) {
                                int size = ((LongSparseArray) obj3).size();
                                long j4 = Long.MAX_VALUE;
                                int i2 = 0;
                                for (int i3 = 0; i3 < size; i3++) {
                                    long j5 = ((long[]) ((LongSparseArray) obj3).valueAt(i3))[1];
                                    if (j5 < j4) {
                                        i2 = i3;
                                        j4 = j5;
                                    }
                                }
                                ((LongSparseArray) obj3).removeAt(i2);
                            }
                            long j6 = ((kys) obj2).a + 1;
                            ((kys) obj2).a = j6;
                            ((LongSparseArray) obj3).put(j, new long[]{1, j6});
                        }
                        maxInflight = Integer.MIN_VALUE;
                    }
                }
                maxInflight = kytVar.getMaxInflight();
            } else {
                maxInflight = Integer.MIN_VALUE;
            }
            if (maxInflight == Integer.MIN_VALUE) {
                knnVar.d = true;
                if (this.f == null) {
                    this.f = new HashSet();
                }
                this.f.add(knnVar);
                koq koqVar3 = this.l;
                Handler handler3 = koqVar3.q;
                handler3.getClass();
                knnVar.b(new cck(handler3, 8), new koo(this, koqVar3.i(), knnVar, iA));
            } else {
                Handler handler4 = this.l.q;
                handler4.sendMessage(handler4.obtainMessage(21, iA, maxInflight));
                knnVar.e = true;
            }
        }
        v(kntVar);
        return true;
    }

    private final boolean x(klo kloVar) {
        synchronized (koq.c) {
            koq koqVar = this.l;
            if (koqVar.l == null || !koqVar.m.contains(this.c)) {
                return false;
            }
            koqVar.l.a(kloVar, this.g);
            return true;
        }
    }

    @Override // defpackage.kof
    public final void a(Bundle bundle) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.l.q;
        if (looperMyLooper == handler.getLooper()) {
            h(bundle);
        } else {
            handler.post(new jmi(this, bundle, 10, (byte[]) null));
        }
    }

    @Override // defpackage.kof
    public final void b(int i) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.l.q;
        if (looperMyLooper == handler.getLooper()) {
            k(i);
        } else {
            handler.post(new awu(this, i, 18, (byte[]) null));
        }
    }

    public final void c() {
        kro.e(this.l.q);
        this.j = null;
    }

    public final void d() {
        int i;
        int iM;
        koq koqVar = this.l;
        kro.e(koqVar.q);
        kmt kmtVar = this.b;
        if (kmtVar.w() || kmtVar.x()) {
            return;
        }
        try {
            hee heeVar = koqVar.s;
            Context context = koqVar.g;
            if (context == null) {
                throw new NullPointerException("null reference");
            }
            if (kmtVar == null) {
                throw new NullPointerException("null reference");
            }
            int iA = kmtVar.a();
            int iC = heeVar.c(iA);
            if (iC == -1) {
                Object obj = heeVar.a;
                synchronized (obj) {
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        try {
                            if (i3 >= ((SparseIntArray) obj).size()) {
                                i2 = -1;
                                break;
                            }
                            int iKeyAt = ((SparseIntArray) obj).keyAt(i3);
                            if (iKeyAt > iA && ((SparseIntArray) obj).get(iKeyAt) == 0) {
                                break;
                            } else {
                                i3++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    iM = i2 == -1 ? ((klu) heeVar.b).m(context, iA) : i2;
                    ((SparseIntArray) obj).put(iA, iM);
                }
                i = iM;
            } else {
                i = iC;
            }
            if (i != 0) {
                klo kloVar = new klo(1, i, null, null, null, null);
                Log.w("GoogleApiManager", "The service for " + this.b.getClass().getName() + " is not available: " + kloVar.toString());
                j(kloVar, null);
                return;
            }
            koq koqVar2 = this.l;
            kmt kmtVar2 = this.b;
            kon konVar = new kon(koqVar2, kmtVar2, this.c);
            if (kmtVar2.i()) {
                kpf kpfVar = this.n;
                if (kpfVar == null) {
                    throw new NullPointerException("null reference");
                }
                loj lojVar = kpfVar.e;
                if (lojVar != null) {
                    lojVar.l();
                }
                kqd kqdVar = kpfVar.d;
                kqdVar.h = Integer.valueOf(System.identityHashCode(kpfVar));
                kro kroVar = kpfVar.g;
                Context context2 = kpfVar.a;
                Handler handler = kpfVar.b;
                kpfVar.e = (loj) kroVar.b(context2, handler.getLooper(), kqdVar, kqdVar.g, kpfVar, kpfVar);
                kpfVar.f = konVar;
                Set set = kpfVar.c;
                if (set == null || set.isEmpty()) {
                    handler.post(new kcx(kpfVar, 13, null));
                } else {
                    loj lojVar2 = kpfVar.e;
                    lojVar2.u(new kpw(lojVar2));
                }
            }
            try {
                kmtVar2.u(konVar);
            } catch (SecurityException e) {
                j(new klo(1, 10, null, null, null, null), e);
            }
        } catch (IllegalStateException e2) {
            j(new klo(1, 10, null, null, null, null), e2);
        }
    }

    public final void e(knt kntVar) {
        kro.e(this.l.q);
        if (this.b.w()) {
            if (w(kntVar)) {
                n();
                return;
            } else {
                this.a.add(kntVar);
                return;
            }
        }
        Queue queue = this.a;
        if (queue.size() >= 1000) {
            kntVar.f(new Status(8, "Pending API call limit exceeded", null, null));
            return;
        }
        queue.add(kntVar);
        klo kloVar = this.j;
        if (kloVar == null || !kloVar.c()) {
            d();
        } else {
            j(this.j, null);
        }
    }

    public final void f(Status status) {
        kro.e(this.l.q);
        u(status, null, false);
    }

    public final void g() {
        Queue queue = this.a;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            knt kntVar = (knt) arrayList.get(i);
            if (!this.b.w()) {
                return;
            }
            if (w(kntVar)) {
                queue.remove(kntVar);
            }
        }
    }

    public final void h(Bundle bundle) {
        c();
        t(klo.a);
        p();
        if (bundle == null || !bundle.containsKey("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG")) {
            this.o = null;
        } else {
            byte[] byteArray = bundle.getByteArray("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG");
            this.o = byteArray != null ? (kqk) ket.y(byteArray, kqk.CREATOR) : null;
        }
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            Object obj = ((hed) it.next()).b;
            if (r(((kpc) obj).b) != null) {
                it.remove();
            } else {
                try {
                    ((kpc) obj).b(this.b, new kjc((byte[]) null, (byte[]) null, (byte[]) null));
                } catch (DeadObjectException unused) {
                    b(3);
                    this.b.v("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        g();
        n();
    }

    @Override // defpackage.kpb
    public final void i(klo kloVar) {
        j(kloVar, null);
    }

    public final void j(klo kloVar, Exception exc) {
        loj lojVar;
        koq koqVar = this.l;
        Handler handler = koqVar.q;
        kro.e(handler);
        kpf kpfVar = this.n;
        if (kpfVar != null && (lojVar = kpfVar.e) != null) {
            lojVar.l();
        }
        c();
        koqVar.s.b();
        t(kloVar);
        if ((this.b instanceof ksm) && kloVar.c != 24) {
            koqVar.f = true;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        int i = kloVar.c;
        if (i == 4) {
            f(koq.b);
            return;
        }
        if (i == 25) {
            f(s(kloVar));
            return;
        }
        Queue queue = this.a;
        if (queue.isEmpty()) {
            this.j = kloVar;
            return;
        }
        if (exc != null) {
            kro.e(handler);
            u(null, exc, false);
            return;
        }
        if (!koqVar.r) {
            f(s(kloVar));
            return;
        }
        u(s(kloVar), null, true);
        if (queue.isEmpty() || x(kloVar) || koqVar.h(kloVar, this.g)) {
            return;
        }
        if (i == 18) {
            this.h = true;
        }
        if (this.h) {
            handler.sendMessageDelayed(Message.obtain(handler, 9, this.c), 5000L);
        } else {
            f(s(kloVar));
        }
    }

    public final void k(int i) {
        c();
        this.h = true;
        kmt kmtVar = this.b;
        String strS = kmtVar.s();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strS != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strS);
        }
        this.m.m(true, new Status(20, sb.toString(), null, null));
        Status status = new Status(20, "Connection suspended: ".concat(String.valueOf(kmtVar.s())), null, null);
        Set set = this.f;
        if (set != null) {
            ArrayList arrayList = new ArrayList(set);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((knn) arrayList.get(i2)).g(new kmu(status));
            }
        }
        koq koqVar = this.l;
        knu knuVar = this.c;
        Handler handler = koqVar.q;
        handler.sendMessageDelayed(Message.obtain(handler, 9, knuVar), 5000L);
        handler.sendMessageDelayed(Message.obtain(handler, 11, knuVar), 120000L);
        koqVar.s.b();
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            Object obj = ((hed) it.next()).a;
        }
    }

    public final void l(klo kloVar) {
        kro.e(this.l.q);
        kmt kmtVar = this.b;
        kmtVar.v("onSignInFailed for " + kmtVar.getClass().getName() + " with " + String.valueOf(kloVar));
        j(kloVar, null);
    }

    final void m(knn knnVar) {
        kro.e(this.l.q);
        Set set = this.f;
        if (set != null) {
            set.remove(knnVar);
            if (this.f.isEmpty()) {
                this.f = null;
            }
        }
    }

    public final void n() {
        koq koqVar = this.l;
        Handler handler = koqVar.q;
        knu knuVar = this.c;
        handler.removeMessages(12, knuVar);
        handler.sendMessageDelayed(handler.obtainMessage(12, knuVar), koqVar.e);
    }

    public final void o() {
        kro.e(this.l.q);
        Status status = koq.a;
        f(status);
        this.m.m(false, status);
        for (kow kowVar : (kow[]) this.e.keySet().toArray(new kow[0])) {
            e(new kns(kowVar, new kjc((byte[]) null, (byte[]) null, (byte[]) null)));
        }
        t(new klo(1, 4, null, null, null, null));
        kmt kmtVar = this.b;
        if (kmtVar.w()) {
            kmtVar.A(new qcb(this));
        }
    }

    public final void p() {
        if (this.h) {
            koq koqVar = this.l;
            knu knuVar = this.c;
            Handler handler = koqVar.q;
            handler.removeMessages(11, knuVar);
            handler.removeMessages(9, knuVar);
            this.h = false;
        }
    }

    public final boolean q() {
        return this.b.i();
    }
}
