package defpackage;

import android.net.Uri;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aadk implements aaqm {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/client/DefaultOfflinePlaylistsStore");
    public static final long b;
    private final boolean A;
    private final abfv B;
    public final mbc c;
    public final String d;
    public final awmd e;
    public final awmd f;
    public final awmd g;
    public final Executor h;
    public final awmd i;
    public final awmd j;
    public final awmd k;
    public final awmd l;
    public final awmd m;
    public final awmd n;
    public final awmd o;
    public final awmd p;
    public final awmd q;
    public final awmd r;
    public final vyo t;
    public final vxu v;
    public final aado w;
    public final ci x;
    private final Executor y;
    public volatile long u = 0;
    public final aadj s = new aadj(this);
    private final Map z = new HashMap();

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        b = 3600000L;
    }

    public aadk(mbc mbcVar, String str, awmd awmdVar, ci ciVar, awmd awmdVar2, awmd awmdVar3, aado aadoVar, Executor executor, Executor executor2, aafj aafjVar, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, abfv abfvVar, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13, vxu vxuVar, vyo vyoVar, aauk aaukVar) {
        this.c = mbcVar;
        this.d = str;
        this.e = awmdVar;
        this.x = ciVar;
        this.f = awmdVar2;
        this.g = awmdVar3;
        this.w = aadoVar;
        this.y = executor;
        this.h = executor2;
        this.i = awmdVar4;
        this.j = awmdVar5;
        this.k = awmdVar6;
        this.l = awmdVar7;
        this.m = awmdVar8;
        this.n = awmdVar9;
        this.o = awmdVar10;
        this.B = abfvVar;
        this.p = awmdVar11;
        this.q = awmdVar12;
        this.r = awmdVar13;
        this.v = vxuVar;
        this.t = vyoVar;
        this.A = aaukVar.A();
        aafjVar.l(new aaes(this, 1));
    }

    @Override // defpackage.aaqm
    public final aamj a(String str) {
        if (this.w.C()) {
            return b(str);
        }
        return null;
    }

    public final aamj b(String str) {
        return ((aaew) this.i.io()).e(str);
    }

    @Override // defpackage.aaqm
    public final ListenableFuture c(String str) {
        return zik.ba(this.w.p(), new wci(this, str, 17), agdf.a, this.A ? MoreExecutors.directExecutor() : this.y);
    }

    @Override // defpackage.aaqm
    public final ListenableFuture d() {
        return zik.ba(this.w.p(), new rru(this, 11), agpi.a, this.y);
    }

    @Override // defpackage.aaqm
    public final Collection e() {
        return !this.w.C() ? agpi.a : f();
    }

    public final List f() {
        return ((aaew) this.i.io()).j();
    }

    final void g(String str, int i) {
        this.w.y(new aahk(str, i));
    }

    final void h(String str) {
        this.w.y(new aahm(str));
    }

    public final void i(aami aamiVar) {
        aamiVar.a();
        Object obj = aamiVar.b;
        int i = aamiVar.a;
        this.w.y(new aaho(aamiVar));
    }

    final void j(String str) {
        this.w.y(new aahs(str));
    }

    final void k(String str) {
        this.w.y(new aahn(str));
    }

    @Override // defpackage.aaqm
    public final void l(String str, sxu sxuVar) {
        typ.f(str);
        this.h.execute(new yag(this, sxuVar, str, 16));
    }

    @Override // defpackage.aaqm
    public final void m(String str, aoen aoenVar) {
        this.w.u(new yag((Object) this, (Object) str, (Object) aoenVar, 17, (char[]) null));
    }

    public final void n(String str, aoen aoenVar) {
        taq.c();
        k(str);
        if (((aaew) this.i.io()).v(str, aoenVar)) {
            h(str);
        } else {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/offline/client/DefaultOfflinePlaylistsStore", "removePlaylistInBackground", 1486, "DefaultOfflinePlaylistsStore.java")).w("[Offline] Failed removing playlist %s from database", str);
        }
    }

    public final void o(String str, String str2) {
        for (aaqw aaqwVar : ((aaqu) this.r.io()).c(str)) {
            synchronized (aaqwVar.d) {
                HashSet hashSet = aaqwVar.c;
                if (hashSet.remove(str)) {
                    aaqu aaquVar = aaqwVar.a;
                    aamh aamhVar = aaqwVar.b;
                    aaquVar.g(str, aamhVar.a);
                    int i = aamhVar.d;
                    if (i > 0) {
                        aaqwVar.j = i - hashSet.size();
                        aaqwVar.f = aaqwVar.g;
                        aaqwVar.g = (aaqwVar.j * 100) / i;
                    }
                    aaqwVar.e = null;
                    i(aaqwVar.a());
                }
            }
        }
        Map map = this.z;
        aamg aamgVar = (aamg) map.remove(str);
        if (aamgVar != null) {
            ((aaew) this.i.io()).S(str, aamgVar);
            if (!map.isEmpty() || str2 == null) {
                return;
            }
            this.w.y(new aahq(str2));
        }
    }

    @Override // defpackage.aaqm
    public final void p() {
        this.h.execute(new yas(this, 10, null));
    }

    @Override // defpackage.aaqm
    public final boolean q(final List list, final Map map, final Map map2, final int i, final long j) {
        aamj aamjVarE;
        aado aadoVar = this.w;
        if (!aadoVar.C()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            aami aamiVarA = null;
            if (aadoVar.C()) {
                awmd awmdVar = this.r;
                aaqw aaqwVarA = ((aaqu) awmdVar.io()).a(str);
                if (aaqwVarA == null && (aamjVarE = ((aaew) this.i.io()).e(str)) != null) {
                    aaqwVarA = ((aaqu) awmdVar.io()).b(aamjVarE.a, null);
                }
                if (aaqwVarA != null) {
                    aamiVarA = aaqwVarA.a();
                }
            }
            if (aamiVarA == null) {
                return false;
            }
        }
        aadoVar.u(new Runnable() { // from class: aadf
            /*  JADX ERROR: Type inference failed
                jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16681. Try increasing type updates limit count.
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 1668
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aadf.run():void");
            }
        });
        return true;
    }

    @Override // defpackage.aaqm
    public final int r(final String str, final aohx aohxVar, final aamn aamnVar, final byte[] bArr, final aogf aogfVar) {
        typ.f(str);
        aado aadoVar = this.w;
        if (!aadoVar.C()) {
            return 2;
        }
        typ.f(str);
        this.B.q(true);
        if (((aaew) this.i.io()).e(str) != null) {
            return 1;
        }
        aadoVar.u(new Runnable() { // from class: aadg
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
            @Override // java.lang.Runnable
            public final void run() {
                aadk aadkVar = this.a;
                long epochMilli = aadkVar.c.f().toEpochMilli();
                taq.c();
                boolean zM = ((aada) aadkVar.j.io()).m();
                String str2 = str;
                if (!zM) {
                    aadkVar.g(str2, 0);
                    return;
                }
                aaew aaewVar = (aaew) aadkVar.i.io();
                if (aaewVar.e(str2) != null) {
                    aadkVar.w.y(new aahl(str2));
                    return;
                }
                try {
                    aazo aazoVarA = ((abfv) aadkVar.g.io()).A(str2, Alert.DURATION_SHOW_INDEFINITELY);
                    if (aazoVarA == null) {
                        aadkVar.g(str2, 3);
                        return;
                    }
                    aogf aogfVar2 = aogfVar;
                    byte[] bArr2 = bArr;
                    aohx aohxVar2 = aohxVar;
                    aodp aodpVarD = ((aaqg) aadkVar.e.io()).d(aohxVar2);
                    Object obj = aazoVarA.b;
                    aamh aamhVar = (aamh) obj;
                    aohx aohxVar3 = aohxVar2;
                    if (!aaewVar.Y(aamhVar, aohxVar2, aodpVarD, bArr2, epochMilli, aogfVar2)) {
                        ((agrc) ((agrc) aadk.a.b()).k("com/google/android/libraries/youtube/offline/client/DefaultOfflinePlaylistsStore", "savePlaylistInBackground", 1129, "DefaultOfflinePlaylistsStore.java")).w("[Offline] Failed inserting playlist %s to database", str2);
                        aadkVar.g(str2, 2);
                        return;
                    }
                    elr elrVar = (elr) aadkVar.m.io();
                    aaok aaokVar = aamhVar.l;
                    if (aaokVar != null) {
                        elrVar.v(aaokVar);
                    }
                    aamn aamnVar2 = aamnVar;
                    aadkVar.w.y(new aahj(str2));
                    ?? r8 = aazoVarA.a;
                    Set setI = ((aady) aadkVar.n.io()).i(r8);
                    if (!aaewVar.D(aamhVar, r8, aohxVar3, aodpVarD, setI, aamnVar2, -1, bArr2, true)) {
                        ((agrc) ((agrc) aadk.a.b()).k("com/google/android/libraries/youtube/offline/client/DefaultOfflinePlaylistsStore", "savePlaylistInBackground", 1160, "DefaultOfflinePlaylistsStore.java")).w("[Offline] Failed inserting playlist %s to database", str2);
                        aadkVar.k(str2);
                        aihf aihfVarCreateBuilder = aoen.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        aoen aoenVar = (aoen) aihfVarCreateBuilder.instance;
                        str2.getClass();
                        aoenVar.b |= 2;
                        aoenVar.d = str2;
                        aihfVarCreateBuilder.copyOnWrite();
                        aoen aoenVar2 = (aoen) aihfVarCreateBuilder.instance;
                        aoenVar2.e = 10;
                        aoenVar2.b |= 4;
                        aaewVar.v(str2, (aoen) aihfVarCreateBuilder.build());
                        aadkVar.h(str2);
                        return;
                    }
                    taq.c();
                    try {
                        aalf aalfVar = (aalf) aadkVar.k.io();
                        aalfVar.m(((aamh) obj).a);
                        aalfVar.p((aamh) obj);
                        if (aaokVar != null) {
                            aalfVar.x(aaokVar);
                        }
                    } catch (IOException | ExecutionException e) {
                        ((agrc) ((agrc) ((agrc) aadk.a.c()).j(e)).k("com/google/android/libraries/youtube/offline/client/DefaultOfflinePlaylistsStore", "savePlaylistThumbnails", 1550, "DefaultOfflinePlaylistsStore.java")).w("[Offline] Failed saving playlist thumbnail for %s", aamhVar.a);
                    }
                    aaew aaewVar2 = (aaew) aadkVar.i.io();
                    String str3 = aamhVar.a;
                    aagj aagjVarQ = aaewVar2.b.q(str3);
                    if (aagjVarQ != null) {
                        aamh aamhVarA = aagjVarQ.a();
                        abuz abuzVarV = aaewVar2.c.v(str3, aagjVarQ.a().k);
                        String str4 = aamhVarA.a;
                        String str5 = aamhVarA.b;
                        aaok aaokVar2 = aamhVarA.l;
                        Uri uri = aamhVarA.c;
                        int i = aamhVarA.d;
                        boolean z = aamhVarA.e;
                        boolean z2 = aamhVarA.f;
                        Date date = aamhVarA.g;
                        aofu aofuVar = aamhVarA.h;
                        String str6 = aamhVarA.i;
                        alja aljaVar = aamhVarA.j;
                        aamh aamhVar2 = new aamh(str4, str5, aaokVar2, uri, abuzVarV, i, z, z2, date, aofuVar);
                        synchronized (aagjVarQ.c.k) {
                            ahno.F(aagjVarQ.a.a.equals(aamhVar2.a));
                            aagjVarQ.a = aamhVar2;
                            aagjVarQ.c();
                        }
                    }
                    aaqw aaqwVarB = ((aaqu) aadkVar.r.io()).b(aamhVar, setI);
                    aady aadyVar = (aady) aadkVar.n.io();
                    aaqx aaqxVar = (aaqx) aadkVar.q.io();
                    aaqxVar.f(aadyVar.s().size());
                    aaqxVar.b().c(setI);
                    aadkVar.w.y(new aaho(aaqwVarB.a()));
                    aadyVar.o(aaqxVar.b().a());
                    elrVar.o(r8);
                    aerj aerjVar = (aerj) aadkVar.l.io();
                    for (aamo aamoVar : r8) {
                        if (setI.remove(aamoVar.d())) {
                            aohx aohxVar4 = aohxVar3;
                            aodp aodpVar = aodpVarD;
                            aerjVar.j(aamoVar.d(), str2, null, aohxVar4, null, aodpVar, aamnVar2, 0, false, false, false, false, 1);
                            aohxVar3 = aohxVar4;
                            aodpVarD = aodpVar;
                        }
                    }
                } catch (ExecutionException e2) {
                    ((agrc) ((agrc) ((agrc) aadk.a.b()).j(e2)).k("com/google/android/libraries/youtube/offline/client/DefaultOfflinePlaylistsStore", "savePlaylistInBackground", (char) 1102, "DefaultOfflinePlaylistsStore.java")).w("[Offline] Failed requesting playlist %s for offline", str2);
                    aadkVar.g(str2, 1);
                }
            }
        });
        return 0;
    }

    @Override // defpackage.aaqm
    public final boolean s(String str, long j) {
        if (this.w.C()) {
            return q(Collections.singletonList(str), agkj.j(str, Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY)), agkj.j(str, 0), 0, j);
        }
        return false;
    }
}
