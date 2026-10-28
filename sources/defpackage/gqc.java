package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.youtube.android.libraries.elements.StatusOr;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gqc implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gqc(abzn abznVar, zwa zwaVar, String str, boolean z, int i) {
        this.$cid = i;
        this.c = abznVar;
        this.b = zwaVar;
        this.d = str;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v35, types: [java.lang.Object, ywn] */
    /* JADX WARN: Type inference failed for: r14v36, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, zwa] */
    @Override // java.lang.Runnable
    public final void run() {
        yha yhaVar;
        int i = this.$cid;
        boolean z = false;
        z = false;
        if (i == 0) {
            byte[] byteArray = ((wfy) this.c).a.toByteArray();
            Object obj = this.b;
            gqh gqhVar = (gqh) obj;
            StatusOr statusOrRehydrateResponse = ((adak) gqhVar.b.io()).b().rehydrateResponse(byteArray);
            boolean z2 = statusOrRehydrateResponse.hasValue;
            String strA = gzj.a((woo) this.d);
            if (z2) {
                byte[] bArr = (byte[]) statusOrRehydrateResponse.value;
                if (bArr != null) {
                    byteArray = bArr;
                }
                try {
                    boolean zJ = ((gqh) obj).e.j(strA, (almd) aihn.parseFrom(almd.a, byteArray));
                    if (this.a != zJ) {
                        ((agrc) ((agrc) gqh.a.c()).k("com/google/android/apps/youtube/music/browse/PersistentBrowseService", "processNetworkResponse", 553, "PersistentBrowseService.java")).t(zJ ? "Successfully cached BrowseResponse, but expected to fail." : "Failed to cache BrowseResponse, but expected to succeed.");
                    }
                } catch (aiik e) {
                    ((agrc) ((agrc) ((agrc) ((agrc) gqh.a.b()).l(agsi.MEDIUM)).j(e)).k("com/google/android/apps/youtube/music/browse/PersistentBrowseService", "processNetworkResponse", (char) 559, "PersistentBrowseService.java")).t("IllegalArgumentException from rehydrated Browse response.");
                }
            } else {
                ((agrc) ((agrc) ((agrc) gqh.a.b()).l(agsi.LARGE)).k("com/google/android/apps/youtube/music/browse/PersistentBrowseService", "processNetworkResponse", 563, "PersistentBrowseService.java")).t("Hydration has failed.");
            }
            if (gqhVar.i.l(25, 45731046L, false)) {
                return;
            }
            return;
        }
        if (i == 1) {
            Object obj2 = this.d;
            Object obj3 = this.c;
            Object obj4 = this.b;
            int i2 = 12;
            if (!this.a) {
                try {
                    ((AudioTrack) obj4).flush();
                } catch (Throwable th) {
                    Handler handler = (Handler) obj3;
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new bkn(obj2, i2));
                    }
                    synchronized (cgo.a) {
                        int i3 = cgo.c - 1;
                        cgo.c = i3;
                        if (i3 == 0) {
                            ScheduledExecutorService scheduledExecutorService = cgo.b;
                            scheduledExecutorService.getClass();
                            scheduledExecutorService.shutdown();
                            cgo.b = null;
                        }
                        throw th;
                    }
                }
            }
            ((AudioTrack) obj4).release();
            Handler handler2 = (Handler) obj3;
            if (handler2.getLooper().getThread().isAlive()) {
                handler2.post(new bkn(obj2, i2));
            }
            synchronized (cgo.a) {
                int i4 = cgo.c - 1;
                cgo.c = i4;
                if (i4 == 0) {
                    ScheduledExecutorService scheduledExecutorService2 = cgo.b;
                    scheduledExecutorService2.getClass();
                    scheduledExecutorService2.shutdown();
                    cgo.b = null;
                }
            }
            return;
        }
        if (i == 2) {
            Object obj5 = this.d;
            lff lffVar = (lff) obj5;
            lco lcoVar = lffVar.b;
            if (lcoVar == null) {
                ((ldz) obj5).aT().c.a("Discarding data. Failed to send conditional user property to service");
                return;
            } else {
                lffVar.D(lcoVar, (kry) (this.a ? null : this.c), (lbg) this.b);
                lffVar.A();
                return;
            }
        }
        if (i == 3) {
            boolean z3 = this.a;
            if (z3) {
                wja wjaVar = (wja) this.b;
                Iterator it = wjaVar.t.iterator();
                while (true) {
                    Object obj6 = this.d;
                    boolean zHasNext = it.hasNext();
                    yhaVar = ((zeu) obj6).d;
                    if (!zHasNext) {
                        break;
                    } else if (zeu.e((wgs) it.next(), yhaVar)) {
                        z = true;
                        break;
                    }
                }
                Iterator it2 = wjaVar.s.iterator();
                while (it2.hasNext()) {
                    if (zeu.e((wgs) it2.next(), yhaVar)) {
                        z = true;
                        break;
                    }
                }
            }
            ?? r14 = this.c;
            zhq zhqVar = zhq.ABR;
            r14.p(z3, z);
            return;
        }
        Object obj7 = this.c;
        abzn abznVar = (abzn) obj7;
        akki akkiVar = abznVar.j;
        ?? r6 = this.b;
        if (akkiVar == null || !akkiVar.c || abznVar.l.h()) {
            abznVar.b(r6);
            return;
        }
        boolean z4 = this.a;
        ?? r15 = this.d;
        zta ztaVar = abznVar.i;
        if (ztaVar != null) {
            abzk abzkVar = new abzk(obj7, z ? 1 : 0);
            int i5 = zte.a;
            zuf zufVar = new zuf(abzkVar, zvb.a, ztaVar);
            zufVar.n = r6.k();
            zufVar.o = (String) r15;
            zufVar.p = z4;
            ztf ztfVar = zufVar.k.e;
            zufVar.l = ztfVar.a();
            ztfVar.k(zufVar);
            return;
        }
        aihf aihfVarCreateBuilder = ajgs.a.createBuilder();
        aihf aihfVarCreateBuilder2 = ajgr.a.createBuilder();
        String str = abznVar.e;
        aihfVarCreateBuilder2.copyOnWrite();
        ajgr ajgrVar = (ajgr) aihfVarCreateBuilder2.instance;
        ajgrVar.b |= 2;
        ajgrVar.d = str;
        String str2 = abznVar.f;
        aihfVarCreateBuilder2.copyOnWrite();
        ajgr ajgrVar2 = (ajgr) aihfVarCreateBuilder2.instance;
        ajgrVar2.b |= 1;
        ajgrVar2.c = str2;
        aihfVarCreateBuilder.copyOnWrite();
        ajgs ajgsVar = (ajgs) aihfVarCreateBuilder.instance;
        ajgr ajgrVar3 = (ajgr) aihfVarCreateBuilder2.build();
        ajgrVar3.getClass();
        ajgsVar.c = ajgrVar3;
        ajgsVar.b = 1;
        ajgs ajgsVar2 = (ajgs) aihfVarCreateBuilder.build();
        ztf ztfVar2 = abznVar.h;
        aihf aihfVarCreateBuilder3 = jrc.a.createBuilder();
        aigj byteString = ajgsVar2.toByteString();
        aihfVarCreateBuilder3.copyOnWrite();
        jrc jrcVar = (jrc) aihfVarCreateBuilder3.instance;
        jrcVar.b |= 4;
        jrcVar.e = byteString;
        aihfVarCreateBuilder3.copyOnWrite();
        jrc jrcVar2 = (jrc) aihfVarCreateBuilder3.instance;
        jrcVar2.b |= 2;
        jrcVar2.d = "attestation";
        String strK = r6.k();
        aihfVarCreateBuilder3.copyOnWrite();
        jrc jrcVar3 = (jrc) aihfVarCreateBuilder3.instance;
        jrcVar3.b |= 16;
        jrcVar3.g = strK;
        if (!TextUtils.isEmpty(r15)) {
            aihfVarCreateBuilder3.copyOnWrite();
            jrc jrcVar4 = (jrc) aihfVarCreateBuilder3.instance;
            r15.getClass();
            jrcVar4.b |= SemanticState.Focused;
            jrcVar4.j = (String) r15;
        }
        aihfVarCreateBuilder3.copyOnWrite();
        jrc jrcVar5 = (jrc) aihfVarCreateBuilder3.instance;
        jrcVar5.b |= SemanticState.Hidden;
        jrcVar5.k = z4;
        ztfVar2.s(((jrc) aihfVarCreateBuilder3.build()).toBuilder());
    }

    public /* synthetic */ gqc(gqh gqhVar, wfy wfyVar, woo wooVar, boolean z, int i) {
        this.$cid = i;
        this.b = gqhVar;
        this.c = wfyVar;
        this.d = wooVar;
        this.a = z;
    }

    public gqc(lff lffVar, lbg lbgVar, boolean z, lbq lbqVar, int i) {
        this.$cid = i;
        this.b = lbgVar;
        this.a = z;
        this.c = lbqVar;
        this.d = lffVar;
    }

    public /* synthetic */ gqc(zeu zeuVar, wja wjaVar, boolean z, ywn ywnVar, int i) {
        this.$cid = i;
        this.d = zeuVar;
        this.b = wjaVar;
        this.a = z;
        this.c = ywnVar;
    }

    public /* synthetic */ gqc(boolean z, AudioTrack audioTrack, Handler handler, dje djeVar, int i) {
        this.$cid = i;
        this.a = z;
        this.b = audioTrack;
        this.c = handler;
        this.d = djeVar;
    }
}
