package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hnz extends aacn implements aacl {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/autooffline/DefaultMusicAutoOfflineController");
    private final syn A;
    public final Context b;
    public final Executor c;
    public final hlp d;
    public final aunn e;
    public final huf f;
    public final huh g;
    public final aany h;
    public final hpb i;
    public final hpk j;
    public final Integer k;
    public final vxz l;
    private final twf n;
    private final SharedPreferences o;
    private final zwb p;
    private final jkg q;
    private final aunn r;
    private final hnq s;
    private final hpy t;
    private final tbt u;
    private final hsz v;
    private final tfq w;
    private final abxv x;
    private final xow y;
    private final hfn z;

    public hnz(Context context, mbc mbcVar, twf twfVar, xow xowVar, aacm aacmVar, abxv abxvVar, SharedPreferences sharedPreferences, zwb zwbVar, jkg jkgVar, aunn aunnVar, Executor executor, hnq hnqVar, hlp hlpVar, tfq tfqVar, aunn aunnVar2, huh huhVar, huf hufVar, hfn hfnVar, aany aanyVar, hpy hpyVar, syn synVar, hpb hpbVar, hpk hpkVar, tbt tbtVar, Integer num, hsz hszVar, vxz vxzVar, aaeg aaegVar) {
        super(mbcVar, twfVar, xowVar, aacmVar, abxvVar, aaegVar);
        this.b = context;
        this.y = xowVar;
        this.n = twfVar;
        this.x = abxvVar;
        this.o = sharedPreferences;
        this.p = zwbVar;
        this.q = jkgVar;
        this.r = aunnVar;
        this.c = executor;
        this.s = hnqVar;
        this.d = hlpVar;
        this.w = tfqVar;
        this.e = aunnVar2;
        this.f = hufVar;
        this.z = hfnVar;
        this.g = huhVar;
        this.h = aanyVar;
        this.t = hpyVar;
        this.A = synVar;
        this.i = hpbVar;
        this.j = hpkVar;
        this.u = tbtVar;
        this.k = num;
        this.v = hszVar;
        this.l = vxzVar;
    }

    private final ListenableFuture o() {
        return ahno.as(this.A.n(this.p.e()), new hba(this, 12), this.c);
    }

    private final void p(wog wogVar) {
        boolean zBooleanValue;
        ListenableFuture listenableFutureA = this.t.a(kro.aq());
        vxz vxzVar = this.l;
        ListenableFuture listenableFutureO = o();
        if (vxzVar.l(66, 45858271L, false)) {
            try {
                zBooleanValue = ((Boolean) listenableFutureO.get(1L, TimeUnit.SECONDS)).booleanValue();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                ((agrc) ((agrc) ((agrc) a.c().i(agso.a, "DefaultMusicAutoOffline")).j(e)).k("com/google/android/apps/youtube/music/offline/autooffline/DefaultMusicAutoOfflineController", "maybeDecorateRequest", (char) 689, "DefaultMusicAutoOfflineController.java")).t("Failure to get enableSmartDownloadRecentMusic for GetAutoOfflineRequest");
                zBooleanValue = false;
            } catch (ExecutionException e2) {
                e = e2;
                ((agrc) ((agrc) ((agrc) a.c().i(agso.a, "DefaultMusicAutoOffline")).j(e)).k("com/google/android/apps/youtube/music/offline/autooffline/DefaultMusicAutoOfflineController", "maybeDecorateRequest", (char) 692, "DefaultMusicAutoOfflineController.java")).t("Failure to get enableSmartDownloadRecentMusic for GetAutoOfflineRequest");
                zBooleanValue = false;
            } catch (TimeoutException e3) {
                e = e3;
                ((agrc) ((agrc) ((agrc) a.c().i(agso.a, "DefaultMusicAutoOffline")).j(e)).k("com/google/android/apps/youtube/music/offline/autooffline/DefaultMusicAutoOfflineController", "maybeDecorateRequest", (char) 692, "DefaultMusicAutoOfflineController.java")).t("Failure to get enableSmartDownloadRecentMusic for GetAutoOfflineRequest");
                zBooleanValue = false;
            }
            g(wogVar, zBooleanValue);
        } else {
            wogVar = wogVar;
        }
        hba hbaVar = new hba(this, 13);
        Executor executor = this.c;
        ListenableFuture listenableFutureAs = ahno.as(listenableFutureO, hbaVar, executor);
        try {
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            zvp.b(zvn.b, zvm.C, "Cannot retrieve offline data to populate GetAutoOfflineRequest", e4);
        }
    }

    public final int a(aofh aofhVar, agke agkeVar, aaqn aaqnVar) {
        try {
            aajg.b(aofhVar, agkeVar, this.h.a(aofhVar), this.u, aaqnVar, 28);
            return 0;
        } catch (aaob e) {
            ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "DefaultMusicAutoOffline")).j(e)).k("com/google/android/apps/youtube/music/offline/autooffline/DefaultMusicAutoOfflineController", "enqueueOfflineOrchestrationAction", (char) 781, "DefaultMusicAutoOfflineController.java")).t("Failure to save or refresh playlist.");
            return 2;
        }
    }

    @Override // defpackage.aacn, defpackage.aacl
    public final synchronized int b(String str, aaqn aaqnVar) {
        return c(false, str, aaqnVar);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0131  */
    /* JADX WARN: Code duplicated, block: B:48:0x0134 A[Catch: all -> 0x0161, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0002, B:11:0x0031, B:16:0x003f, B:18:0x00d6, B:22:0x00df, B:29:0x00f4, B:33:0x0100, B:35:0x010f, B:39:0x011a, B:41:0x0122, B:43:0x0128, B:48:0x0134, B:50:0x013a, B:58:0x0152, B:53:0x0143, B:55:0x0149, B:10:0x0015), top: B:65:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x013a A[Catch: all -> 0x0161, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:11:0x0031, B:16:0x003f, B:18:0x00d6, B:22:0x00df, B:29:0x00f4, B:33:0x0100, B:35:0x010f, B:39:0x011a, B:41:0x0122, B:43:0x0128, B:48:0x0134, B:50:0x013a, B:58:0x0152, B:53:0x0143, B:55:0x0149, B:10:0x0015), top: B:65:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0143 A[Catch: all -> 0x0161, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0002, B:11:0x0031, B:16:0x003f, B:18:0x00d6, B:22:0x00df, B:29:0x00f4, B:33:0x0100, B:35:0x010f, B:39:0x011a, B:41:0x0122, B:43:0x0128, B:48:0x0134, B:50:0x013a, B:58:0x0152, B:53:0x0143, B:55:0x0149, B:10:0x0015), top: B:65:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0149 A[Catch: all -> 0x0161, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:11:0x0031, B:16:0x003f, B:18:0x00d6, B:22:0x00df, B:29:0x00f4, B:33:0x0100, B:35:0x010f, B:39:0x011a, B:41:0x0122, B:43:0x0128, B:48:0x0134, B:50:0x013a, B:58:0x0152, B:53:0x0143, B:55:0x0149, B:10:0x0015), top: B:65:0x0002 }] */
    public final synchronized int c(boolean z, String str, aaqn aaqnVar) {
        boolean zBooleanValue;
        try {
            zBooleanValue = ((Boolean) o().get()).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "DefaultMusicAutoOffline")).j(e)).k("com/google/android/apps/youtube/music/offline/autooffline/DefaultMusicAutoOfflineController", "runAutoOffline", (char) 249, "DefaultMusicAutoOfflineController.java")).t("Failure to get enableSmartDownloadRecentMusic");
            zBooleanValue = false;
        }
        boolean z2 = this.s.g() || zBooleanValue;
        boolean zIsEmpty = hna.b(this.o, this.p.e()).isEmpty();
        twf twfVar = this.n;
        jkg jkgVar = this.q;
        hlp hlpVar = this.d;
        tfq tfqVar = this.w;
        float fA = twfVar.a();
        boolean zB = twfVar.b();
        boolean zA = jkgVar.a();
        boolean zJ = hlpVar.j();
        boolean zJ2 = tfqVar.j(1);
        String.format("smartDownloadsClientEnabled=%s, ", Boolean.valueOf(z2));
        String.format("batteryLevel=%s, ", Float.valueOf(fA));
        String.format("batteryPluggedIn=%s, ", Boolean.valueOf(zB));
        String.format("forceSync=%s, ", Boolean.valueOf(z));
        String.format("feedbackTokensEmpty=%s, ", Boolean.valueOf(zIsEmpty));
        String.format("inForeground=%s, ", Boolean.valueOf(zA));
        String.format("canOfflineOverWifiOnly=%s, ", Boolean.valueOf(zJ));
        String.format("onWifiNetwork=%s", Boolean.valueOf(zJ2));
        if (!z2) {
            this.z.d(2);
            return 0;
        }
        if (!zIsEmpty) {
            agrx agrxVar = agso.a;
            this.z.e(2, 2);
        } else if (!z && fA < 0.2f && !zB) {
            agrx agrxVar2 = agso.a;
            this.z.e(2, 5);
        } else {
            if (z) {
                if (z) {
                    if (!hlpVar.k()) {
                        agrx agrxVar3 = agso.a;
                        this.z.e(2, 4);
                    }
                    agrx agrxVar4 = agso.a;
                    this.z.d(2);
                    return super.b(str, aaqnVar);
                }
                if (!hlpVar.l()) {
                    agrx agrxVar5 = agso.a;
                    this.z.e(2, 4);
                }
                agrx agrxVar6 = agso.a;
                this.z.d(2);
                return super.b(str, aaqnVar);
            }
            if (((abvk) this.r.io()).Z()) {
                agrx agrxVar7 = agso.a;
                this.z.e(2, 7);
            } else {
                if (!zA) {
                    if (z) {
                        if (!hlpVar.k()) {
                            agrx agrxVar8 = agso.a;
                            this.z.e(2, 4);
                        }
                        agrx agrxVar9 = agso.a;
                        this.z.d(2);
                        return super.b(str, aaqnVar);
                    }
                    if (!hlpVar.l()) {
                        agrx agrxVar10 = agso.a;
                        this.z.e(2, 4);
                    }
                    agrx agrxVar11 = agso.a;
                    this.z.d(2);
                    return super.b(str, aaqnVar);
                }
                Context context = this.b;
                if (txz.d(context) || txz.g(context)) {
                    if (z) {
                        if (!hlpVar.k()) {
                            agrx agrxVar12 = agso.a;
                            this.z.e(2, 4);
                        }
                        agrx agrxVar13 = agso.a;
                        this.z.d(2);
                        return super.b(str, aaqnVar);
                    }
                    if (!hlpVar.l()) {
                        agrx agrxVar14 = agso.a;
                        this.z.e(2, 4);
                    }
                    agrx agrxVar15 = agso.a;
                    this.z.d(2);
                    return super.b(str, aaqnVar);
                }
                agrx agrxVar16 = agso.a;
                this.z.e(2, 7);
            }
        }
        return 1;
    }

    @Override // defpackage.aacn
    protected final wog d(aaqn aaqnVar) {
        wog wogVarG = this.y.g();
        wogVarG.m();
        p(wogVarG);
        i(wogVarG, aaqnVar);
        return wogVarG;
    }

    @Override // defpackage.aacn
    protected final void e(allr allrVar, String str, aaqn aaqnVar) {
        int i = 17;
        Stream map = Collection.EL.stream(allrVar.e).filter(new gqk(i)).map(new hnf(i));
        int i2 = 18;
        ahno.at(this.i.m((List) map.filter(new gqk(i2)).map(new hnf(i2)).collect(Collectors.toCollection(new hcd(7))), false), new ilm(this, aaqnVar, str, allrVar, 1), this.c);
    }

    public final void f(aaqn aaqnVar, String str, allr allrVar, agkj agkjVar) {
        hsz hszVar = this.v;
        hszVar.c();
        HashSet hashSet = new HashSet();
        Collection.EL.stream(allrVar.e).filter(new gqk(19)).forEach(new hnw(this, agkjVar, aaqnVar, (Set) hashSet, 1));
        if (!hashSet.isEmpty()) {
            ahno.O(!hashSet.isEmpty());
            ahno.at(this.t.a(kro.aq()), new hhi(this, hashSet, 2), this.c);
        }
        Context context = this.b;
        if (!txz.d(context) && !txz.g(context)) {
            int i = 16;
            List list = (List) Collection.EL.stream(allrVar.e).filter(new gqk(i)).map(new hnf(i)).collect(Collectors.toCollection(new hcd(7)));
            if (!list.isEmpty()) {
                ahno.at(this.t.a(kro.aq()), new hhi(this, list, 3), this.c);
            }
        }
        hszVar.d(allrVar.c);
        m(allrVar, str);
    }

    public final void g(wog wogVar, boolean z) {
        aihf aihfVarCreateBuilder = alln.a.createBuilder();
        aihf aihfVarCreateBuilder2 = allu.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        allu alluVar = (allu) aihfVarCreateBuilder2.instance;
        alluVar.b |= 1;
        alluVar.c = z;
        boolean zG = this.s.g();
        aihfVarCreateBuilder2.copyOnWrite();
        allu alluVar2 = (allu) aihfVarCreateBuilder2.instance;
        alluVar2.b |= 2;
        alluVar2.d = zG;
        aihfVarCreateBuilder.copyOnWrite();
        alln allnVar = (alln) aihfVarCreateBuilder.instance;
        allu alluVar3 = (allu) aihfVarCreateBuilder2.build();
        alluVar3.getClass();
        allnVar.c = alluVar3;
        allnVar.b = 1;
        wogVar.b = (alln) aihfVarCreateBuilder.build();
    }

    public final boolean h(float f, boolean z) {
        twf twfVar = this.n;
        if (twfVar.a() < f && !twfVar.b() && !txz.d(this.b)) {
            agrx agrxVar = agso.a;
            return false;
        }
        if ((z && txz.d(this.b)) || this.d.k()) {
            return true;
        }
        agrx agrxVar2 = agso.a;
        return false;
    }

    @Override // defpackage.aacn
    protected final void i(wog wogVar, aaqn aaqnVar) {
        wogVar.c = this.x.a();
        n(wogVar);
        wogVar.e = 0;
        twf twfVar = this.n;
        wogVar.D = twfVar.b() ? 1.0f : twfVar.a();
        wogVar.E = (int) l();
    }

    public final void j(String str, aaqn aaqnVar) {
        this.c.execute(afwl.i(new gwb(this, str, aaqnVar, 6)));
    }

    @Override // defpackage.aacn
    protected final void k(aaqn aaqnVar, aihf aihfVar, Set set) {
    }
}
