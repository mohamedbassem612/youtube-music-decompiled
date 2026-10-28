package defpackage;

import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver;
import com.google.android.libraries.youtube.media.interfaces.TimeInterval;
import java.security.Key;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yhr implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ FormatIdOuterClass$FormatId a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ yhr(yhq yhqVar, yhg yhgVar, MediaPushReceiver mediaPushReceiver, jsk jskVar, FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, TimeInterval timeInterval, boolean z, boolean z2, int i) {
        this.$cid = i;
        this.f = yhqVar;
        this.d = yhgVar;
        this.h = mediaPushReceiver;
        this.e = jskVar;
        this.a = formatIdOuterClass$FormatId;
        this.g = timeInterval;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, yfp] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        bxs bxsVar;
        bxs bxsVar2 = null;
        if (this.$cid != 0) {
            afvx afvxVarAd = tym.ad(trx.PLATYPUS_CACHE_READ_ONLINE);
            boolean z = this.c;
            boolean z2 = this.b;
            Object obj = this.g;
            FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = this.a;
            Object obj2 = this.e;
            Object obj3 = this.f;
            try {
                if (!((yhq) obj3).e.get()) {
                    yhf yhfVar = ((yhq) obj3).c;
                    Object obj4 = ((yhs) yhfVar).d;
                    zjr zjrVar = ((yhs) yhfVar).a;
                    Key key = ((yhs) yhfVar).b;
                    zjx zjxVar = ((yhs) yhfVar).c;
                    jsk jskVarB = ((ablj) obj4).b();
                    if (jskVarB == null) {
                        bxsVar = null;
                    } else {
                        bxs bxsVar3 = new bxs(key.getEncoded(), new yfc(new agqj(jskVarB), zjrVar.e(), "PlatypusCacheRead"));
                        bxsVar3.e(zjxVar);
                        bxsVar = bxsVar3;
                    }
                    Object obj5 = this.h;
                    Object obj6 = this.d;
                    if (bxsVar == null) {
                        yhg.d((MediaPushReceiver) obj5, ((yhq) obj3).b);
                    } else {
                        ((yhg) obj6).b(new agqj(obj2), bxsVar, ((yhq) obj3).a, formatIdOuterClass$FormatId, ((TimeInterval) obj).a(), (MediaPushReceiver) obj5, ((yhq) obj3).b, z2, z);
                    }
                }
                afvxVarAd.close();
                return;
            } catch (Throwable th) {
                try {
                    afvxVarAd.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        afvx afvxVarAd2 = tym.ad(trx.PLATYPUS_CACHE_READ_OFFLINE);
        boolean z3 = this.c;
        boolean z4 = this.b;
        Object obj7 = this.h;
        FormatIdOuterClass$FormatId formatIdOuterClass$FormatId2 = this.a;
        ?? r3 = this.g;
        Object obj8 = this.d;
        try {
            if (!((yhu) obj8).g.get()) {
                yhf yhfVar2 = ((yhu) obj8).d;
                ?? r6 = ((yhs) yhfVar2).d;
                zjr zjrVar2 = ((yhs) yhfVar2).a;
                Key key2 = ((yhs) yhfVar2).b;
                zjx zjxVar2 = ((yhs) yhfVar2).c;
                ?? Io = r6.io();
                if (!Io.isEmpty()) {
                    yfc yfcVar = new yfc(agkz.n(Io), zjrVar2.e(), "PlatypusOfflineCacheRead");
                    byte[] encoded = key2.getEncoded();
                    if (encoded != null) {
                        bxsVar2 = new bxs(encoded, yfcVar);
                        bxsVar2.e(zjxVar2);
                    }
                }
                bxs bxsVar4 = bxsVar2;
                Object obj9 = this.f;
                Object obj10 = this.e;
                if (bxsVar4 == null) {
                    yhg.d((MediaPushReceiver) obj9, ((yhu) obj8).c);
                } else {
                    ((yhg) obj10).b(agkz.n(r3), bxsVar4, ((yhu) obj8).b, formatIdOuterClass$FormatId2, ((TimeInterval) obj7).a(), (MediaPushReceiver) obj9, ((yhu) obj8).c, z4, z3);
                }
            }
            afvxVarAd2.close();
        } catch (Throwable th3) {
            try {
                afvxVarAd2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public /* synthetic */ yhr(yhu yhuVar, yhg yhgVar, MediaPushReceiver mediaPushReceiver, List list, FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, TimeInterval timeInterval, boolean z, boolean z2, int i) {
        this.$cid = i;
        this.d = yhuVar;
        this.e = yhgVar;
        this.f = mediaPushReceiver;
        this.g = list;
        this.a = formatIdOuterClass$FormatId;
        this.h = timeInterval;
        this.b = z;
        this.c = z2;
    }
}
