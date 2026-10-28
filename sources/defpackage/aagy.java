package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aagy implements aahd {
    protected final awmd a;
    protected final awmd b;
    protected final Executor c;
    public final Executor d;
    public final boolean e;
    public final vxz f;

    protected aagy(awmd awmdVar, awmd awmdVar2, abxu abxuVar, vxz vxzVar, aauk aaukVar) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = (Executor) abxuVar.e;
        this.d = (Executor) abxuVar.c;
        this.f = vxzVar;
        this.e = aaukVar.A();
    }

    public static final agke j(int i) {
        agjz agjzVar = new agjz(4);
        for (int i2 = 0; i2 < i; i2++) {
            agjzVar.h(Optional.empty());
        }
        return agjzVar.g();
    }

    private final aaqn k(zwa zwaVar) {
        aaqn aaqnVarB = ((aanb) this.a.io()).b();
        if (aaqnVarB.s().equals(zwaVar.k())) {
            return aaqnVarB;
        }
        return null;
    }

    private final ListenableFuture l(aaqn aaqnVar, String str) {
        return ahno.ar(aaqnVar.l().e(str), new aagw(this, 0), this.e ? this.c : this.d);
    }

    @Override // defpackage.aahd
    public final ListenableFuture a(zwa zwaVar, List list) {
        ListenableFuture listenableFutureN;
        if (zwaVar.h()) {
            return ahng.n(j(list.size()));
        }
        if (!i()) {
            return e(zwaVar, list);
        }
        ListenableFuture listenableFutureD = d(((wco) this.b.io()).b(zwaVar), list);
        if (this.f.l(142, 45632208L, false)) {
            listenableFutureN = ahno.as(listenableFutureD, new qzc(this, zwaVar, list, 20), this.e ? this.c : this.d);
        } else {
            listenableFutureN = ahng.n(agpn.b);
        }
        ListenableFuture listenableFuture = listenableFutureN;
        return ahno.av(listenableFutureD, listenableFuture).k(new vtq(listenableFutureD, listenableFuture, list, 8, (byte[]) null), this.e ? this.c : this.d);
    }

    @Override // defpackage.aahd
    public final ListenableFuture b(zwa zwaVar, String str) {
        if (zwaVar.h()) {
            return ahng.n(Optional.empty());
        }
        if (i()) {
            return ahno.as(f(((wco) this.b.io()).b(zwaVar), str), new aakn(this, zwaVar, str, 1), this.e ? this.c : this.d);
        }
        return g(zwaVar, str);
    }

    protected abstract ListenableFuture d(wcn wcnVar, List list);

    public final ListenableFuture e(zwa zwaVar, List list) {
        aaqn aaqnVarK = k(zwaVar);
        if (aaqnVarK == null || list.isEmpty()) {
            return ahng.n(j(list.size()));
        }
        if (this.e) {
            aaqt aaqtVarL = aaqnVarK.l();
            return afxd.f(aaqtVarL.g()).g(new hco(this, list, aaqtVarL, 15, (char[]) null), this.c).b(aais.class, new aagw(list, 2), MoreExecutors.directExecutor());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(l(aaqnVarK, (String) it.next()));
        }
        return ahno.au(arrayList).k(new wko(arrayList, 16), this.d);
    }

    protected abstract ListenableFuture f(wcn wcnVar, String str);

    public final ListenableFuture g(zwa zwaVar, String str) {
        aaqn aaqnVarK = k(zwaVar);
        return aaqnVarK == null ? ahng.n(Optional.empty()) : l(aaqnVarK, str);
    }

    public abstract Optional h(aamt aamtVar);

    protected abstract boolean i();
}
