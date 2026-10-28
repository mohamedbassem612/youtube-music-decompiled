package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.application.backup.MusicBackupAgent;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gku implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gku(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r0v14, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v104, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v23, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v28, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v33, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v38, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v42, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v55, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v58, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v63, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v68, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v73, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v97, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [aunn, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                ((igr) ((gli) this.a).e.io()).a();
                break;
            case 1:
                ((aack) ((gli) this.a).a.io()).b();
                break;
            case 2:
                ((hvs) ((gli) this.a).g.io()).a();
                break;
            case 3:
                gli gliVar = (gli) this.a;
                acdo acdoVar = (acdo) gliVar.k.io();
                int i = gliVar.t;
                acdoVar.f = i;
                aunn aunnVar = gliVar.l;
                ((acdx) aunnVar.io()).g(i);
                if (aunnVar.io() instanceof hwm) {
                    ((hwm) aunnVar.io()).a();
                }
                break;
            case 4:
                jan janVar = (jan) this.a;
                ((tgg) janVar.h.io()).d();
                int i2 = tqr.a;
                if (janVar.d.k(1073828820)) {
                    ((tir) janVar.a.io()).d();
                }
                break;
            case 5:
                ((wps) ((jan) this.a).f.io()).c();
                break;
            case 6:
                ((sdr) ((jan) this.a).c.io()).h();
                break;
            case 7:
                zpw zpwVar = (zpw) this.a;
                zvp.g((zvr) zpwVar.a.io());
                ((tbt) zpwVar.j.io()).f(zpwVar.b.io());
                break;
            case 8:
                ((xfp) ((zpw) this.a).c.io()).e();
                break;
            case 9:
                ((aerj) ((gli) this.a).i.io()).o();
                break;
            case 10:
                ((woh) ((glb) this.a).d.io()).i();
                break;
            case 11:
                this.a.io();
                break;
            case 12:
                zpw zpwVar2 = (zpw) this.a;
                aerf aerfVar = (aerf) zpwVar2.m.io();
                Executor executor = (Executor) zpwVar2.g.io();
                if (aerfVar.c()) {
                    executor.execute(new acem(aerfVar, 6));
                }
                break;
            case 13:
                zpw zpwVar3 = (zpw) this.a;
                ((xds) zpwVar3.l.io()).g();
                ((zrn) zpwVar3.i.io()).g();
                break;
            case 14:
                String host = vyq.values()[0].h.getHost();
                if (host != null) {
                    ((tld) ((jan) this.a).e.io()).a(host);
                }
                break;
            case 15:
                ((sqs) ((dov) this.a).a.io()).b();
                break;
            case 16:
                Object obj = this.a;
                gkt gktVar = (gkt) obj;
                avmb avmbVar = gktVar.c;
                avlb avlbVarR = ((avlb) gktVar.e.d).w(300L, TimeUnit.SECONDS, avmbVar, null).r(avmbVar);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                timeUnit.getClass();
                avmbVar.getClass();
                avpv avpvVar = new avpv(avlbVarR, timeUnit, avmbVar);
                avnn avnnVar = atqp.p;
                avpvVar.F(new isg(obj, 1), new gem(obj, 2));
                break;
            case 17:
                final MusicBackupAgent musicBackupAgent = new MusicBackupAgent();
                musicBackupAgent.c((Context) ((jnj) this.a).d);
                if (MusicBackupAgent.a == null) {
                    MusicBackupAgent.a = new leh(musicBackupAgent, 1);
                    musicBackupAgent.e.registerOnSharedPreferenceChangeListener(MusicBackupAgent.a);
                }
                final String string = musicBackupAgent.e.getString(rmp.ACCOUNT_NAME, null);
                if (!musicBackupAgent.e.getBoolean("music_backed_up_identity_restored", true) && string != null) {
                    MusicBackupAgent.b = new tnh() { // from class: gkn
                        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
                        @Override // defpackage.tnh
                        public final void a(Object obj2) {
                            MusicBackupAgent.b = null;
                            Iterator it = ((xsc) obj2).b.iterator();
                            while (it.hasNext()) {
                                for (wnq wnqVar : ((ovo) it.next()).i()) {
                                    String str = string;
                                    if (wnqVar.g().equals(str)) {
                                        musicBackupAgent.f.h(wnqVar, null, null);
                                        return;
                                    }
                                }
                            }
                        }
                    };
                    musicBackupAgent.d.a(null, MusicBackupAgent.b);
                }
                musicBackupAgent.e.edit().putBoolean("music_backed_up_identity_restored", true).apply();
                break;
            case 18:
                ((ihm) ((gli) this.a).d.io()).c();
                break;
            case 19:
                jnj jnjVar = (jnj) this.a;
                syn synVar = (syn) jnjVar.c.io();
                vxu vxuVar = (vxu) jnjVar.b.io();
                tqj tqjVar = (tqj) jnjVar.e.io();
                aiqh aiqhVar = vxuVar.c().i;
                if (aiqhVar == null) {
                    aiqhVar = aiqh.a;
                }
                if (aiqhVar.e) {
                    synVar.d("AccountsRemovedTask", 0L, 2, 0, false, null, null, false);
                }
                int i3 = tqr.a;
                if (!tqjVar.k(1073830254)) {
                    synVar.d("IdentityStoreBackfillTask", 0L, 2, 0, false, null, null, false);
                } else {
                    synVar.b("IdentityStoreBackfillTask");
                }
                break;
            default:
                aeqn aeqnVar = (aeqn) ((zpw) this.a).f.io();
                ((tbt) aeqnVar.a.io()).f(aeqnVar);
                break;
        }
    }
}
