package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRouter2;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import android.util.Pair;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class blq implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public blq(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [axo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v75, types: [cfx, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        int i2;
        AudioManager audioManager;
        boolean z;
        long jR;
        int i3 = 13;
        short[] sArr = null;
        int i4 = 1;
        int iL = -1;
        switch (this.$cid) {
            case 0:
                bls blsVar = (bls) this.b;
                blsVar.e = (qcb) this.a;
                blsVar.a();
                return;
            case 1:
                this.a.accept(this.b);
                return;
            case 2:
                Object obj = this.a;
                Object obj2 = this.b;
                int i5 = bmy.a;
                Throwable th = (Throwable) obj;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat(String.valueOf(obj2)), th);
                throw th;
            case 3:
                bqi bqiVar = (bqi) this.a;
                boolean zF = bqiVar.f();
                Object obj3 = this.b;
                if (zF) {
                    bqiVar.b(obj3);
                } else {
                    bqiVar.c(obj3);
                }
                bqiVar.f = 3;
                return;
            case 4:
                bqs bqsVar = (bqs) this.b;
                List list = bqsVar.a;
                Object obj4 = this.a;
                if (!list.isEmpty()) {
                    eq eqVarA = ((MediaSessionCompat$Token) obj4).a();
                    if (eqVarA != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((Bundle) it.next()).putBinder("extra_session_binder", eqVarA.asBinder());
                        }
                    }
                    list.clear();
                }
                bqsVar.b.setSessionToken((MediaSession.Token) ((MediaSessionCompat$Token) obj4).b);
                return;
            case 5:
                bre breVar = ((bqs) this.a).d;
                afv afvVar = breVar.c;
                Iterator it2 = afvVar.keySet().iterator();
                while (it2.hasNext()) {
                    bqp bqpVar = (bqp) afvVar.get((IBinder) it2.next());
                    Object obj5 = this.b;
                    List list2 = (List) bqpVar.e.get(obj5);
                    if (list2 != null) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            Bundle bundle = (Bundle) ((axq) it3.next()).b;
                            if (bundle == null) {
                                i = -1;
                                i2 = -1;
                            } else {
                                i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                                i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                            }
                            if (i == -1 || i2 == -1 || ((i * i2) + i2) - 1 >= 0) {
                                breVar.g((String) obj5, bqpVar, bundle);
                            }
                        }
                    }
                }
                return;
            case 6:
                bqp bqpVar2 = (bqp) ((bre) ((qcb) this.a).a).c.remove(((zf) this.b).l());
                if (bqpVar2 != null) {
                    bqpVar2.h.l().unlinkToDeath(bqpVar2, 0);
                    return;
                }
                return;
            case 7:
                IBinder iBinderL = ((zf) this.b).l();
                bqp bqpVar3 = (bqp) ((bre) ((qcb) this.a).a).c.remove(iBinderL);
                if (bqpVar3 != null) {
                    iBinderL.unlinkToDeath(bqpVar3, 0);
                    return;
                }
                return;
            case 8:
                bvc bvcVar = (bvc) this.a;
                int i6 = bvcVar.d - 1;
                bvcVar.d = i6;
                if (i6 == 0) {
                    bvcVar.e(this.b);
                    return;
                }
                return;
            case 9:
                try {
                    this.b.run();
                    return;
                } catch (RuntimeException e) {
                    Object obj6 = this.a;
                    btv btvVar = new btv(e);
                    for (ctg ctgVar : ((cti) ((bvp) obj6).a.a).g) {
                        ctgVar.c.execute(new bf(ctgVar, ctgVar.b, btvVar, i3));
                    }
                    return;
                }
            case 10:
                Object obj7 = this.b;
                if (((AtomicBoolean) obj7).get()) {
                    new Thread(new blq(((bwq) this.a).a, obj7, 11, sArr), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 11:
                ((cso) this.a).j((AtomicBoolean) this.b);
                return;
            case 12:
                Object obj8 = this.b;
                if (((AtomicBoolean) obj8).get()) {
                    new Thread(new blq(((bwt) this.a).a, obj8, i3, sArr), "ExoPlayer:WifiLockManager").start();
                    return;
                }
                return;
            case 13:
                ((cso) this.a).h((AtomicBoolean) this.b);
                return;
            case 14:
                cbj cbjVar = (cbj) this.b;
                cbjVar.e.getClass();
                cbjVar.b = MediaRouter2.getInstance((Context) this.a);
                cbjVar.c = new cbh();
                bvc bvcVar2 = cbjVar.e;
                bvcVar2.getClass();
                cck cckVar = new cck(bvcVar2, i4);
                cbjVar.b.registerRouteCallback(cckVar, cbjVar.c, cbj.a);
                cbjVar.d = new cbi(cbjVar);
                cbjVar.b.registerControllerCallback(cckVar, cbjVar.d);
                cbjVar.e.d(Boolean.valueOf(cbj.c(cbjVar.b)));
                return;
            case 15:
                cbm cbmVar = (cbm) this.b;
                cbmVar.c.getClass();
                Context context = (Context) this.a;
                if (!bwp.af(context) || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
                    return;
                }
                cbmVar.a = audioManager;
                cbmVar.b = new cbl(cbmVar);
                AudioDeviceCallback audioDeviceCallback = cbmVar.b;
                Looper looperMyLooper = Looper.myLooper();
                looperMyLooper.getClass();
                audioManager.registerAudioDeviceCallback(audioDeviceCallback, new Handler(looperMyLooper));
                cbmVar.c.d(Boolean.valueOf(cbmVar.c()));
                return;
            case 16:
                ccm ccmVar = (ccm) this.a;
                int i7 = ccmVar.n;
                ccr ccrVar = (ccr) this.b;
                int i8 = i7 - ccrVar.c;
                ccmVar.n = i8;
                if (ccrVar.d) {
                    ccmVar.o = ccrVar.e;
                    ccmVar.p = true;
                }
                if (i8 == 0) {
                    btn btnVar = ccrVar.b.b;
                    if (!ccmVar.A.b.n() && btnVar.n()) {
                        ccmVar.B = -1;
                        ccmVar.C = 0L;
                    }
                    if (!btnVar.n()) {
                        List listAsList = Arrays.asList(((cau) btnVar).c);
                        int size = listAsList.size();
                        List list3 = ccmVar.g;
                        ahno.O(size == list3.size());
                        for (int i9 = 0; i9 < listAsList.size(); i9++) {
                            ((ccj) list3.get(i9)).a = (btn) listAsList.get(i9);
                        }
                    }
                    long j = -9223372036854775807L;
                    if (ccmVar.p) {
                        boolean z2 = ccrVar.b.b.n() && ccmVar.A.b.n();
                        boolean zB = ccrVar.b.c.b(ccmVar.A.c);
                        long j2 = ccrVar.b.e;
                        long j3 = ccmVar.A.t;
                        if (z2 || (zB && j2 == j3)) {
                            i4 = 0;
                        }
                        if (i4 != 0) {
                            iL = ccmVar.l();
                            if (btnVar.n() || ccrVar.b.c.c()) {
                                jR = ccrVar.b.e;
                            } else {
                                cdk cdkVar = ccrVar.b;
                                jR = ccmVar.R(btnVar, cdkVar.c, cdkVar.e);
                            }
                            j = jR;
                        }
                        z = i4;
                    } else {
                        z = 0;
                    }
                    ccmVar.p = false;
                    ccmVar.ac(ccrVar.b, 1, z, ccmVar.o, j, iL, false);
                    return;
                }
                return;
            case 17:
                Pair pair = (Pair) this.a;
                ((cdg) this.b).a.i.ge(((Integer) pair.first).intValue(), (cnm) pair.second);
                return;
            case 18:
                Pair pair2 = (Pair) this.a;
                ((cdg) this.b).a.i.e(((Integer) pair2.first).intValue(), (cnm) pair2.second);
                return;
            case 19:
                cfj cfjVar = ((cfg) this.a).a;
                AudioDeviceInfo audioDeviceInfo = cfjVar.g;
                int i10 = bwp.a;
                for (AudioDeviceInfo audioDeviceInfo2 : (AudioDeviceInfo[]) this.b) {
                    if (Objects.equals(audioDeviceInfo2, audioDeviceInfo)) {
                        cfjVar.g = null;
                        cfjVar.d();
                        return;
                    }
                }
                cfjVar.d();
                return;
            default:
                int i11 = bwp.a;
                ((boy) this.b).a.w();
                return;
        }
    }

    public /* synthetic */ blq(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public blq(Object obj, Object obj2, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ blq(Object obj, Object obj2, int i, short[] sArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
