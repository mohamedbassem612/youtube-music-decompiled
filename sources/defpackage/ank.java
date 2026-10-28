package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ank implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ank(int i) {
        this.$cid = i;
        this.a = "SELECT * FROM workspec WHERE state IN (0, 1) AND schedule_requested_at<>-1";
    }

    /* JADX WARN: Type inference failed for: r6v16, types: [anl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r6v46, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v55, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        switch (this.$cid) {
            case 0:
                anl anlVar = (anl) obj;
                if (anlVar.f() == Integer.MAX_VALUE) {
                    return awmy.a;
                }
                Object obj2 = this.a;
                if (anlVar.t().a) {
                    if (((vbq) obj2).c.j()) {
                        boolean zJ = anlVar.j();
                        anlVar.i(true);
                        anlVar.h();
                        anlVar.i(zJ);
                    } else {
                        anlVar.h();
                    }
                }
                Iterator it = anlVar.t().b.entrySet().iterator();
                if (!it.hasNext()) {
                    anlVar.g();
                    throw null;
                }
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getValue()).intValue();
                anlVar.g();
                float f = iIntValue;
                ape.e((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
                throw null;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                View view = (View) entry2.getValue();
                int i = bac.a;
                return Boolean.valueOf(atqq.ay(this.a, view.getTransitionName()));
            case 2:
                ((amg) obj).a().a();
                ((apq) this.a).a.getVisibility();
                return awmy.a;
            case 3:
                ((apq) this.a).g = (awqg) obj;
                return awmy.a;
            case 4:
                ((Context) obj).getClass();
                MeasurementManager measurementManager = MeasurementManager.get((Context) this.a);
                measurementManager.getClass();
                return new dlu(measurementManager);
            case 5:
                dpd dpdVar = (dpd) obj;
                dpdVar.getClass();
                ((dlv) this.a).e = dpdVar;
                return awmy.a;
            case 6:
                ((dpt) obj).getClass();
                return this.a.invoke();
            case 7:
                return eol.d((String) this.a, (dpt) obj);
            case 8:
                dpt dptVar = (dpt) obj;
                dptVar.getClass();
                dpb dpbVarA = dptVar.a((String) this.a);
                try {
                    return Integer.valueOf(dpbVarA.l() ? (int) dpbVarA.b(0) : 0);
                } finally {
                    dpbVarA.close();
                }
            case 9:
                wer werVar = (wer) obj;
                werVar.getClass();
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    werVar.j((String) it2.next());
                }
                return awmy.a;
            case 10:
                wer werVar2 = (wer) obj;
                werVar2.getClass();
                werVar2.m((tzk) this.a);
                return awmy.a;
            case 11:
                ((agrc) ((agrc) hcc.a.c()).j((Throwable) obj).k("com/google/android/apps/youtube/music/entities/data/MusicPersistentEntityStoreWriterImpl", "addOrReplaceEntity$<anonymous>", 37, "MusicPersistentEntityStoreWriterImpl.kt")).w("Failed to write entity %s", this.a.getClass());
                return awmy.a;
            case 12:
                wer werVar3 = (wer) obj;
                werVar3.getClass();
                Iterator it3 = this.a.iterator();
                while (it3.hasNext()) {
                    werVar3.m((tzk) it3.next());
                }
                return awmy.a;
            case 13:
                wer werVar4 = (wer) obj;
                werVar4.getClass();
                werVar4.a((String) this.a);
                return awmy.a;
            case 14:
                ((agrc) ((agrc) hcc.a.c()).j((Throwable) obj).k("com/google/android/apps/youtube/music/entities/data/MusicPersistentEntityStoreWriterImpl", "removeCascading$<anonymous>", 65, "MusicPersistentEntityStoreWriterImpl.kt")).w("Failed to remove cascading entity with key %s", this.a);
                return awmy.a;
            case 15:
                affd affdVar = (affd) obj;
                affdVar.getClass();
                return (hcc) ((hce) aguu.aw((Context) ((hef) this.a).a, hce.class, affdVar)).r().orElseThrow(new hcd(0));
            case 16:
                Object obj3 = this.a;
                ReentrantLock reentrantLock = ((hie) obj3).n;
                Map map = (Map) obj;
                reentrantLock.lock();
                try {
                    ConcurrentHashMap concurrentHashMap = ((hie) obj3).r;
                    map.getClass();
                    ((hie) obj3).d(concurrentHashMap, map);
                    return awmy.a;
                } finally {
                    reentrantLock.unlock();
                }
            case 17:
                ((znf) obj).getClass();
                hie hieVar = (hie) this.a;
                return tzk.c((avg.c(hieVar.a, jkx.a()) == 0 && ((hlp) hieVar.c.io()).m()) ? ((isr) hieVar.e.io()).b() : ahng.n(awnp.a)).x(awnp.a);
            case 18:
                Object obj4 = this.a;
                ReentrantLock reentrantLock2 = ((hie) obj4).n;
                Map map2 = (Map) obj;
                reentrantLock2.lock();
                try {
                    ConcurrentHashMap concurrentHashMap2 = ((hie) obj4).q;
                    map2.getClass();
                    ((hie) obj4).d(concurrentHashMap2, map2);
                    return awmy.a;
                } finally {
                    reentrantLock2.unlock();
                }
            case 19:
                ((znf) obj).getClass();
                return tzk.c(((jgc) ((hie) this.a).d.io()).f()).x(awnp.a);
            default:
                ((hoo) this.a).a();
                return awmy.a;
        }
    }

    public /* synthetic */ ank(int i, byte[] bArr) {
        this.$cid = i;
        this.a = "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)";
    }

    public /* synthetic */ ank(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
