package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lex implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;

    public /* synthetic */ lex(cdg cdgVar, Pair pair, cnd cndVar, cni cniVar, IOException iOException, boolean z, int i) {
        this.$cid = i;
        this.d = cdgVar;
        this.e = pair;
        this.f = cndVar;
        this.b = cniVar;
        this.c = iOException;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [lga] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v8, types: [lga] */
    /* JADX WARN: Type inference failed for: r2v2, types: [lga] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kzm] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v3, types: [kzm] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kzm] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ?? r8;
        ?? L;
        Object obj;
        int i = this.$cid;
        if (i == 0) {
            Bundle bundle = new Bundle();
            try {
                try {
                    Object obj2 = this.f;
                    lco lcoVar = ((lff) obj2).b;
                    if (lcoVar == null) {
                        ((ldz) obj2).aT().c.c("Failed to get user properties; not connected to service", this.b, this.c);
                        L = ((ldz) obj2).L();
                        r8 = this.e;
                        L.V(r8, bundle);
                    }
                    Object obj3 = this.d;
                    Object obj4 = this.b;
                    String str = (String) obj4;
                    List<lfy> listI = lcoVar.i(str, (String) this.c, this.a, (lbg) obj3);
                    List list = lga.a;
                    Bundle bundle2 = new Bundle();
                    if (listI != null) {
                        for (lfy lfyVar : listI) {
                            String str2 = lfyVar.e;
                            if (str2 != null) {
                                bundle2.putString(lfyVar.b, str2);
                            } else {
                                Long l = lfyVar.d;
                                if (l != null) {
                                    bundle2.putLong(lfyVar.b, l.longValue());
                                } else {
                                    Double d = lfyVar.g;
                                    if (d != null) {
                                        bundle2.putDouble(lfyVar.b, d.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        ((lff) obj2).A();
                        ((ldz) obj2).L().V(this.e, bundle2);
                    } catch (RemoteException e) {
                        e = e;
                        bundle = bundle2;
                        ((ldz) this.f).aT().c.c("Failed to get user properties; remote exception", this.b, e);
                        Object obj5 = this.f;
                        Object obj6 = this.e;
                        L = ((ldz) obj5).L();
                        r8 = obj6;
                        L.V(r8, bundle);
                    } catch (Throwable th) {
                        th = th;
                        bundle = bundle2;
                        Object obj7 = this.f;
                        ((ldz) obj7).L().V(this.e, bundle);
                        throw th;
                    }
                } catch (RemoteException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i == 1) {
                Pair pair = (Pair) this.e;
                int iIntValue = ((Integer) pair.first).intValue();
                cnm cnmVar = (cnm) pair.second;
                cdj cdjVar = ((cdg) this.d).a;
                boolean z = this.a;
                Object obj8 = this.c;
                Object obj9 = this.b;
                IOException iOException = (IOException) obj8;
                cdjVar.i.h(iIntValue, cnmVar, (cnd) this.f, (cni) obj9, iOException, z);
                return;
            }
            Object obj10 = this.c;
            synchronized (obj10) {
                try {
                    try {
                        Object obj11 = this.d;
                        lco lcoVar2 = ((lff) obj11).b;
                        if (lcoVar2 == null) {
                            ((ldz) obj11).aT().c.d("(legacy) Failed to get user properties; not connected to service", null, this.f, this.b);
                            ((AtomicReference) obj10).set(Collections.EMPTY_LIST);
                            obj10.notify();
                            return;
                        }
                        Object obj12 = this.e;
                        Object obj13 = this.f;
                        String str3 = (String) obj13;
                        ((AtomicReference) obj10).set(lcoVar2.i(str3, (String) this.b, this.a, (lbg) obj12));
                        ((lff) obj11).A();
                        obj = this.c;
                        obj.notify();
                    } catch (RemoteException e3) {
                        ((ldz) this.d).aT().c.d("(legacy) Failed to get user properties; remote exception", null, this.f, e3);
                        ((AtomicReference) this.c).set(Collections.EMPTY_LIST);
                        obj = this.c;
                    }
                } catch (Throwable th3) {
                    this.c.notify();
                    throw th3;
                }
            }
        }
    }

    public lex(lff lffVar, String str, String str2, lbg lbgVar, boolean z, kzm kzmVar, int i) {
        this.$cid = i;
        this.b = str;
        this.c = str2;
        this.d = lbgVar;
        this.a = z;
        this.e = kzmVar;
        this.f = lffVar;
    }

    public lex(lff lffVar, AtomicReference atomicReference, String str, String str2, lbg lbgVar, boolean z, int i) {
        this.$cid = i;
        this.c = atomicReference;
        this.f = str;
        this.b = str2;
        this.e = lbgVar;
        this.a = z;
        this.d = lffVar;
    }
}
