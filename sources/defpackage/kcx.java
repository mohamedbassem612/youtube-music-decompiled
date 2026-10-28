package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceView;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kcx implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ kcx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zll zllVar;
        switch (this.$cid) {
            case 0:
                kda kdaVar = (kda) this.a;
                kdb kdbVar = kdaVar.f;
                if (kdbVar != null) {
                    kdaVar.b.a(kdaVar.d.a(kdbVar), 223);
                }
                kdaVar.g();
                return;
            case 1:
                zlm zlmVar = ((juv) this.a).ae.M().b.l;
                if (zlmVar instanceof zkt) {
                    zlm zlmVar2 = ((zkt) zlmVar).d;
                    if (zlmVar2 instanceof zkn) {
                        zkn zknVar = (zkn) zlmVar2;
                        SurfaceView surfaceView = zknVar.i;
                        if (surfaceView == null) {
                            zknVar.E();
                            return;
                        }
                        Surface surface = surfaceView.getHolder().getSurface();
                        if (surface == null || !surface.isValid() || (zllVar = zknVar.c) == null) {
                            return;
                        }
                        zllVar.c();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                kdd kddVar = (kdd) this.a;
                Set set = kddVar.g;
                if (set.isEmpty()) {
                    return;
                }
                Set set2 = kddVar.h;
                long j = true != set2.equals(set) ? 86400000L : 172800000L;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = kddVar.i;
                if (j2 == 0 || jCurrentTimeMillis - j2 >= j) {
                    khn.e();
                    aihf aihfVarCreateBuilder = agzn.a.createBuilder();
                    String str = kdd.a;
                    aihfVarCreateBuilder.copyOnWrite();
                    agzn agznVar = (agzn) aihfVarCreateBuilder.instance;
                    str.getClass();
                    agznVar.b |= 2;
                    agznVar.d = str;
                    String str2 = kddVar.d;
                    aihfVarCreateBuilder.copyOnWrite();
                    agzn agznVar2 = (agzn) aihfVarCreateBuilder.instance;
                    str2.getClass();
                    agznVar2.b |= 1;
                    agznVar2.c = str2;
                    agzn agznVar3 = (agzn) aihfVarCreateBuilder.build();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(set);
                    aihf aihfVarCreateBuilder2 = agzm.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    agzm agzmVar = (agzm) aihfVarCreateBuilder2.instance;
                    aihv aihvVar = agzmVar.d;
                    if (!aihvVar.c()) {
                        agzmVar.d = aihn.mutableCopy(aihvVar);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        agzmVar.d.h(((agzl) it.next()).ag);
                    }
                    aihfVarCreateBuilder2.copyOnWrite();
                    agzm agzmVar2 = (agzm) aihfVarCreateBuilder2.instance;
                    agznVar3.getClass();
                    agzmVar2.c = agznVar3;
                    agzmVar2.b |= 1;
                    agzm agzmVar3 = (agzm) aihfVarCreateBuilder2.build();
                    aihf aihfVarCreateBuilder3 = agzp.a.createBuilder();
                    aihfVarCreateBuilder3.copyOnWrite();
                    agzp agzpVar = (agzp) aihfVarCreateBuilder3.instance;
                    agzmVar3.getClass();
                    agzpVar.n = agzmVar3;
                    agzpVar.c |= 16384;
                    kddVar.b.a((agzp) aihfVarCreateBuilder3.build(), 243);
                    SharedPreferences sharedPreferences = kddVar.c;
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (!set2.equals(set)) {
                        set2.clear();
                        set2.addAll(set);
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            String strH = kdd.h((agzl) it2.next());
                            String strD = kddVar.d(strH);
                            String strC = kdd.c("feature_usage_timestamp_reported_feature_", strH);
                            if (!TextUtils.equals(strD, strC)) {
                                long j3 = sharedPreferences.getLong(strD, 0L);
                                editorEdit.remove(strD);
                                if (j3 != 0) {
                                    editorEdit.putLong(strC, j3);
                                }
                            }
                        }
                    }
                    kddVar.i = jCurrentTimeMillis;
                    editorEdit.putLong("feature_usage_last_report_time", jCurrentTimeMillis).apply();
                    return;
                }
                return;
            case 3:
                ((kdv) this.a).J();
                return;
            case 4:
                ((kdv) this.a).I();
                return;
            case 5:
                kdz.a.a("transfer with type = %d has timed out", 0);
                khn.e();
                kdz kdzVar = (kdz) this.a;
                Iterator it3 = new HashSet(kdzVar.b).iterator();
                while (it3.hasNext()) {
                    ((hna) it3.next()).G();
                }
                kdzVar.a();
                return;
            case 6:
                kdz kdzVar2 = (kdz) this.a;
                kdy kdyVar = new kdy(kdzVar2);
                kcr kcrVar = kdzVar2.e;
                kro.l(kcrVar);
                kcrVar.c(kdyVar, kbu.class);
                return;
            case 7:
                int i = kec.a;
                khn.e();
                ((kjc) this.a).x(Boolean.FALSE);
                return;
            case 8:
                ((kfz) this.a).b(false);
                return;
            case 9:
                Object obj = this.a;
                synchronized (kht.a) {
                    if (((kht) obj).c()) {
                        ((kht) obj).d(15);
                        return;
                    }
                    return;
                }
            case 10:
                ((kkx) this.a).g("Service disconnected");
                return;
            case 11:
                Executor executor = kli.a;
                if (((kjc) this.a).w(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 12:
                kmt kmtVar = ((kol) ((qcb) this.a).a).b;
                kmtVar.v(String.valueOf(kmtVar.getClass().getName()).concat(" disconnecting because it was signed out."));
                return;
            case 13:
                ((kpf) this.a).f.b(new klo(1, 4, null, null, null, null));
                return;
            case 14:
                kxh kxhVar = (kxh) this.a;
                if (kxhVar.a()) {
                    Log.w("gH_GetSyncHelpPsd", "Getting sync help psd timed out.");
                    List listF = ksy.f(Pair.create("gms:googlehelp:sync_help_psd_failure", "timeout"));
                    GoogleHelp googleHelp = kxhVar.a;
                    ixt.U(listF, googleHelp);
                    kxhVar.b.a(googleHelp);
                    return;
                }
                return;
            case 15:
                ((kyk) this.a).c();
                return;
            case 16:
                ((ldr) this.a).i().ah("legacy_log_event");
                return;
            case 17:
                ((lbi) this.a).a.q().v(((Long) lcl.G.b(null)).longValue());
                return;
            case 18:
                ((ldf) this.a).a.V();
                return;
            case 19:
                Object obj2 = this.a;
                ldz ldzVar = (ldz) obj2;
                ldzVar.o();
                if (ldzVar.J().n.b()) {
                    ldzVar.aT().j.a("Deferred Deep Link already retrieved. Not fetching again.");
                    return;
                }
                long jA = ldzVar.J().o.a();
                ldzVar.J().o.b(1 + jA);
                if (jA >= 5) {
                    ldzVar.aT().f.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                    ldzVar.J().n.a(true);
                    return;
                } else {
                    ler lerVar = (ler) obj2;
                    if (lerVar.d == null) {
                        lerVar.d = new lem(lerVar, lerVar.t);
                    }
                    lerVar.d.c(0L);
                    return;
                }
            default:
                ((ler) this.a).ah("invalid_consent_type");
                return;
        }
    }

    public kcx(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
