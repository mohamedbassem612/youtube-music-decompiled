package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.BatteryManager;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import j$.util.Collection;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tpc implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ tpc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v14, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v19, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v38, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v63, types: [java.lang.Object, zwy] */
    /* JADX WARN: Type inference failed for: r9v68, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.agfr
    public final Object io() {
        Object wllVar;
        int i = 7;
        switch (this.$cid) {
            case 0:
                return Boolean.valueOf(((vxz) this.a).l(77, 45429759L, false));
            case 1:
                return Boolean.valueOf(((vxz) this.a).l(77, 45429759L, false));
            case 2:
                return ((trf) this.a).b();
            case 3:
                int i2 = twf.g;
                return Optional.ofNullable((BatteryManager) ((Context) this.a).getSystemService("batterymanager"));
            case 4:
                omn omnVar = (omn) this.a;
                ?? r8 = omnVar.d;
                ?? r7 = omnVar.i;
                ?? r6 = omnVar.j;
                Object obj = omnVar.b;
                ?? r4 = omnVar.k;
                ?? r3 = omnVar.e;
                wllVar = new wll(omnVar.f, omnVar.h, r3, r4, (ayq) obj, r6, r7, r8);
                break;
            case 5:
                wll wllVarA = ((omn) this.a).a();
                return new vyo(wllVarA.f.j, wllVarA);
            case 6:
                wll wllVarA2 = ((omn) this.a).a();
                wllVar = new vxu(wllVarA2.g.j.ao(), wllVarA2.h.j.ao(), wllVarA2);
                break;
            case 7:
                return Long.valueOf(((vwp) this.a).c.c(1, 45667808L, 60000L));
            case 8:
                return Long.valueOf(((vwp) this.a).c.c(2, 45668013L, 300L));
            case 9:
                int i3 = tqr.a;
                return Integer.valueOf(((vwp) this.a).b.a(1074404977));
            case 10:
                return (vxe) this.a.io();
            case 11:
                return (agkj) Collection.EL.stream(((ohp) this.a).h).collect(aghu.a(new rmm(6), new rmm(i)));
            case 12:
                asjf asjfVar = ((asje) ((wab) this.a).e.io()).c;
                if (asjfVar == null) {
                    asjfVar = asjf.a;
                }
                return agke.n(asjfVar.b);
            case 13:
                Object obj2 = this.a;
                wag wagVar = (wag) obj2;
                wagVar.e.io();
                ((wah) wagVar.d.io()).startLatencyActionSpan("DataPushEmbeddedGroupContainerInit");
                return afxd.f(((adak) ((afip) wagVar.b.io()).g).c()).h(new thc(obj2, i), MoreExecutors.directExecutor()).h(new thc(obj2, 8), wagVar.c);
            case 14:
                ((axfd) this.a).D();
                return null;
            case 15:
                return this.a.h();
            case 16:
                Object obj3 = this.a;
                afip afipVar = (afip) obj3;
                ListenableFuture listenableFutureC = ((adak) afipVar.g).c();
                vzs vzsVar = new vzs(obj3, 3);
                long j = afwl.a;
                afwi afwiVar = new afwi(afty.c(false), vzsVar);
                ?? r9 = afipVar.b;
                int i4 = ahcs.c;
                ahcr ahcrVar = new ahcr(listenableFutureC, afwiVar);
                listenableFutureC.addListener(ahcrVar, MoreExecutors.c(r9, ahcrVar));
                wllVar = ahcrVar;
                break;
            case 17:
                Object obj4 = this.a;
                afip afipVar2 = (afip) obj4;
                afxd afxdVarF = afxd.f((ListenableFuture) afipVar2.c.io());
                thc thcVar = new thc(obj4, 9);
                ?? r0 = afipVar2.b;
                return afxd.f(afxdVarF.h(thcVar, r0)).g(new vzs(obj4, 2), r0);
            case 18:
                qss qssVar = new qss();
                qssVar.a("CREATE TABLE entity_table(_id INTEGER PRIMARY KEY, key TEXT UNIQUE NOT NULL,last_modified_datetime INTEGER DEFAULT 0,data_type INTEGER DEFAULT 0,metadata BLOB,entity BLOB NOT NULL)");
                qssVar.a("ALTER TABLE entity_table ADD batch_update_timestamp INTEGER DEFAULT 0");
                aero aeroVar = new aero();
                ahno.K(true, "You should not include the PRAGMA in your statement: %s", "foreign_keys=ON");
                aeroVar.b.add("foreign_keys=ON");
                qssVar.c = aeroVar;
                qssVar.a("CREATE TABLE entity_associations(parent_entity_key TEXT NOT NULL, child_entity_key TEXT NOT NULL, PRIMARY KEY (parent_entity_key, child_entity_key))");
                web webVar = (web) this.a;
                final wjr wjrVar = (wjr) webVar.c;
                qssVar.a.h(new qsu() { // from class: wdo
                    @Override // defpackage.qsu
                    public final void a(omr omrVar) throws InterruptedException {
                        Cursor cursorE = omrVar.e("SELECT key, entity, metadata FROM entity_table", new String[0]);
                        wjr wjrVar2 = wjrVar;
                        while (cursorE.moveToNext()) {
                            try {
                                tzk.O(omrVar, wjrVar2.a(cursorE.getString(0), cursorE.getBlob(1)));
                            } catch (Throwable th) {
                                if (cursorE != null) {
                                    try {
                                        cursorE.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        }
                        if (cursorE != null) {
                            cursorE.close();
                        }
                    }
                });
                syn synVarB = qssVar.b();
                return ((wjr) webVar.e).J(webVar.d, synVarB);
            case 19:
                return ((wkn) this.a).a();
            default:
                return (InnertubeContext$ClientInfo) ((wkn) this.a).c().build();
        }
        return wllVar;
    }
}
