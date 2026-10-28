package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hoe extends aarg {
    public static final /* synthetic */ int d = 0;
    private static final agrf f = agrf.h("com/google/android/apps/youtube/music/offline/autooffline/MusicPlaylistAutoSyncController");
    private static final Duration g = Duration.ofSeconds(1);
    public final hpb a;
    public final Executor b;
    public final xsc c;
    private final Context h;
    private final hlp i;
    private final twf j;
    private final jkg k;
    private final abvk l;
    private final SharedPreferences m;
    private final zwb n;
    private final aari o;
    private final hpy p;
    private final huz q;
    private final hfn r;

    public hoe(Context context, aari aariVar, abfv abfvVar, hlp hlpVar, tfq tfqVar, mbc mbcVar, twf twfVar, jkg jkgVar, abvk abvkVar, SharedPreferences sharedPreferences, abxv abxvVar, zwb zwbVar, hpb hpbVar, huz huzVar, xsc xscVar, hfn hfnVar, hpy hpyVar, Executor executor, vxz vxzVar) {
        super(aariVar, abfvVar, hlpVar, tfqVar, mbcVar, twfVar, abxvVar, vxzVar);
        this.h = context;
        this.i = hlpVar;
        this.j = twfVar;
        this.k = jkgVar;
        this.l = abvkVar;
        this.m = sharedPreferences;
        this.n = zwbVar;
        this.a = hpbVar;
        this.q = huzVar;
        this.c = xscVar;
        this.o = aariVar;
        this.r = hfnVar;
        this.p = hpyVar;
        this.b = executor;
        this.e = true;
    }

    @Override // defpackage.aarg
    public final synchronized int a(String str, aaqn aaqnVar, final boolean z) {
        hux huxVar;
        taq.c();
        Context context = this.h;
        if (txz.g(context)) {
            this.i.j();
        }
        huz huzVar = this.q;
        huzVar.a("Starting sync precondition checks for initiator: %s", "auto-sync");
        StringBuilder sb = new StringBuilder("Device state: ");
        twf twfVar = huzVar.c;
        float fA = twfVar.a();
        sb.append("batteryLevel: ");
        sb.append(fA);
        sb.append(", ");
        huz.d(sb, "isPluggedIn", twfVar.b());
        abxv abxvVar = huzVar.i;
        huz.c(sb, "totalStorageBytes", abxvVar.d());
        huz.c(sb, "freeStorageBytes", abxvVar.b());
        long jA = abxvVar.a();
        sb.append("usedOfflineStorageBytes: ");
        sb.append(jA);
        huzVar.a(sb.toString(), new Object[0]);
        StringBuilder sb2 = new StringBuilder("Network state: ");
        tfq tfqVar = huzVar.f;
        huz.d(sb2, "isNetworkAvailable", tfqVar.h());
        huz.d(sb2, "onWifiNetwork", tfqVar.j(1));
        if (Build.VERSION.SDK_INT >= 30) {
            huz.d(sb2, "isOnEligibleUnmeteredCarrierNetwork", huzVar.j.z());
            huz.d(sb2, "isNetworkTemporarilyUnmetered", tfqVar.k());
        }
        huz.e(sb2, "canOfflineOverWifiOnly", huzVar.h.j());
        huzVar.a(sb2.toString(), new Object[0]);
        StringBuilder sb3 = new StringBuilder("Application state: ");
        huz.d(sb3, "hasActivityInForeground", huzVar.b.a());
        huz.e(sb3, "playbackServiceIsPlayingOrBufferingContentClip", huzVar.d.Z());
        huzVar.a(sb3.toString(), new Object[0]);
        if (this.l.Z()) {
            this.r.e(5, 7);
            return 1;
        }
        if (!this.i.l()) {
            huzVar.b("Retrying later due to lack of wifi or unmetered network");
            agrx agrxVar = agso.a;
            this.r.e(5, 4);
            return 1;
        }
        if (!hna.b(this.m, this.n.e()).isEmpty()) {
            huzVar.b("Don't sync until all pending feedback tokens have been sent to server.");
            agrx agrxVar2 = agso.a;
            this.r.e(5, 2);
            return 1;
        }
        agrx agrxVar3 = agso.a;
        if (!z) {
            twf twfVar2 = this.j;
            if (twfVar2.a() < 0.2f && !twfVar2.b()) {
                huzVar.b("Retrying later because battery level is low.");
                this.r.e(5, 5);
                return 1;
            }
        }
        if (!z && this.k.a() && !txz.g(context)) {
            this.q.b("Retry later when the user isn't fidgeting with the app.");
            this.r.e(5, 7);
            return 1;
        }
        ListenableFuture listenableFutureA = this.p.a(kro.aq());
        hdn hdnVar = new hdn(17);
        Executor executor = this.b;
        try {
            huxVar = (hux) ahno.as(ahno.ar(listenableFutureA, hdnVar, executor), new ahcy() { // from class: hoc
                /* JADX WARN: Type inference failed for: r0v8, types: [awmd, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r10v0, types: [aunn, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r11v0, types: [aunn, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r14v0, types: [aunn, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v18, types: [awmd, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v19, types: [awmd, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v20, types: [awmd, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v22, types: [awmd, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v25, types: [awmd, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v28, types: [awmd, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v30, types: [awmd, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v31, types: [awmd, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v33, types: [awmd, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v35, types: [awmd, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v0, types: [aunn, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r9v0, types: [aunn, java.lang.Object] */
                @Override // defpackage.ahcy
                public final ListenableFuture a(Object obj) {
                    Object obj2;
                    String str2;
                    huv huvVar = new huv();
                    int i = 0;
                    huvVar.a(false);
                    huvVar.b = "auto-sync";
                    huvVar.a = 1;
                    huvVar.d = (byte) (huvVar.d | 1);
                    huvVar.e = agke.n((agke) obj);
                    huvVar.a(z);
                    if (huvVar.d != 3 || (obj2 = huvVar.e) == null || (str2 = huvVar.b) == null) {
                        StringBuilder sb4 = new StringBuilder();
                        if (huvVar.e == null) {
                            sb4.append(" playlistConfigs");
                        }
                        if ((huvVar.d & 1) == 0) {
                            sb4.append(" actionTriggerParam");
                        }
                        if (huvVar.b == null) {
                            sb4.append(" initiator");
                        }
                        if ((huvVar.d & 2) == 0) {
                            sb4.append(" forceSync");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb4.toString()));
                    }
                    hoe hoeVar = this.a;
                    huw huwVar = new huw((agke) obj2, huvVar.a, str2, huvVar.c);
                    xsc xscVar = hoeVar.c;
                    ?? r9 = xscVar.a;
                    ?? r8 = xscVar.b;
                    Object obj3 = xscVar.c;
                    r8.getClass();
                    r9.getClass();
                    abzo abzoVar = (abzo) obj3;
                    ?? Io = abzoVar.e.io();
                    Io.getClass();
                    ?? Io2 = abzoVar.k.io();
                    Io2.getClass();
                    Context context2 = (Context) abzoVar.c.io();
                    context2.getClass();
                    ((kro) abzoVar.f.io()).getClass();
                    ((gzj) abzoVar.i.io()).getClass();
                    aany aanyVar = (aany) abzoVar.a.io();
                    aanyVar.getClass();
                    ?? Io3 = abzoVar.b.io();
                    Io3.getClass();
                    Integer num = (Integer) abzoVar.g.io();
                    num.getClass();
                    Executor executor2 = (Executor) abzoVar.d.io();
                    executor2.getClass();
                    tbt tbtVar = (tbt) abzoVar.h.io();
                    tbtVar.getClass();
                    ahbw ahbwVar = (ahbw) abzoVar.j.io();
                    ahbwVar.getClass();
                    hvb hvbVar = new hvb(huwVar, r8, r9, Io, Io2, context2, aanyVar, Io3, num, executor2, tbtVar, ahbwVar);
                    if (txz.g(hvbVar.b)) {
                        ((hlp) hvbVar.j.io()).j();
                    }
                    agke agkeVar = hvbVar.c.a;
                    if (agkeVar.isEmpty()) {
                        return ahng.n(new hux(Optional.empty()));
                    }
                    HashSet hashSet = new HashSet();
                    Instant instantA = hvbVar.i.a();
                    int size = agkeVar.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        huu huuVar = (huu) agkeVar.get(i2);
                        String str3 = huuVar.a;
                        if (hashSet.add(str3)) {
                            tzk.d(((wco) hvbVar.g.io()).b(((zwb) hvbVar.h.io()).e()).g(kro.aB(str3)).g(aphh.class)).p(new gto(hvbVar, instantA, huuVar, 5, (char[]) null)).o(new hva(huuVar, i)).H();
                        }
                    }
                    return ahng.n(new hux(Optional.of(-1)));
                }
            }, executor).get();
        } catch (InterruptedException | ExecutionException e) {
            ((agrc) ((agrc) ((agrc) f.b().i(agso.a, "MusicPlaylistAutoSyncCt")).j(e)).k("com/google/android/apps/youtube/music/offline/autooffline/MusicPlaylistAutoSyncController", "runPlaylistAutoSync", (char) 236, "MusicPlaylistAutoSyncController.java")).t("Unable to retrieve result of sync");
            huxVar = null;
        }
        if (huxVar != null) {
            Optional optional = huxVar.a;
            boolean zIsPresent = optional.isPresent();
            aari aariVar = this.o;
            if (zIsPresent) {
                ((Integer) optional.get()).intValue();
                aariVar.c(str, -1L);
            } else {
                aariVar.d();
            }
        }
        this.r.d(5);
        return 0;
    }

    @Override // defpackage.aarg
    protected final List b(aaew aaewVar) {
        try {
            return (List) ahno.as(this.p.a(kro.aq()), new hba(this, 14), this.b).get(g.toSeconds(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((agrc) ((agrc) ((agrc) f.b().i(agso.a, "MusicPlaylistAutoSyncCt")).j(e)).k("com/google/android/apps/youtube/music/offline/autooffline/MusicPlaylistAutoSyncController", "generatePlaylistSyncCheckRequestData", (char) 288, "MusicPlaylistAutoSyncController.java")).t("Failure to generatePlaylistSyncCheckRequestData.");
            return agpi.a;
        }
    }
}
