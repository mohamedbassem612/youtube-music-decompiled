package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.media.interfaces.BandaidConnectionOpener;
import com.google.android.libraries.youtube.media.interfaces.BandaidConnectionOpenerConfig;
import com.google.android.libraries.youtube.media.interfaces.PrewarmedHostInfo;
import com.google.android.libraries.youtube.media.player.exo2.platypus.PlatypusNativeLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yrd extends yqg {
    public static final /* synthetic */ int c = 0;
    public final BandaidConnectionOpener a;
    public final tgr b;
    private volatile avmn d;

    public yrd(hhb hhbVar, aojm aojmVar, aojo aojoVar, xeu xeuVar, zjr zjrVar, yqu yquVar, agfr agfrVar, avlh avlhVar, tgr tgrVar) {
        Collection collection;
        hhbVar.getClass();
        xeuVar.getClass();
        zjrVar.getClass();
        agfrVar.getClass();
        avlhVar.getClass();
        tgrVar.getClass();
        this.b = tgrVar;
        PlatypusNativeLoader.a();
        ypf ypfVar = new ypf(null, new ypb(zjrVar.q(), zjrVar.r(), false), xeuVar, ywn.b, hhbVar);
        long j = aojmVar.m;
        long j2 = (aojoVar == null || (aojoVar.b & 4) == 0) ? aojmVar.n : aojoVar.e;
        long j3 = aojmVar.q;
        int i = aojmVar.r;
        aihx aihxVar = new aihx(aojmVar.o, aojm.a);
        ArrayList arrayList = new ArrayList(atqq.N(aihxVar, 10));
        Iterator<E> it = aihxVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((ajuf) it.next()).p));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        boolean zAS = ((wis) agfrVar).io().aS();
        long j4 = (aojoVar == null || (aojoVar.b & 1) == 0) ? aojmVar.h : aojoVar.c;
        String str = aojmVar.f;
        str.getClass();
        BandaidConnectionOpener bandaidConnectionOpenerCreate = BandaidConnectionOpener.create(ypfVar, yquVar, new BandaidConnectionOpenerConfig(j, j2 * 1000, j3 * 1000, i, arrayList2, zAS, j4 * 1000, str, new ArrayList((aojoVar == null || (collection = aojoVar.d) == null) ? awno.a : collection)));
        if (bandaidConnectionOpenerCreate == null) {
            throw new IllegalStateException("Failed to instantiate DjinniBandaidConnectionOpener native implementation.");
        }
        this.a = bandaidConnectionOpenerCreate;
        avlhVar.ak(new xul(new uwk(this, 20), 15));
        bandaidConnectionOpenerCreate.onNetworkActiveStateChanged(this.b.c());
    }

    private final synchronized void h() {
        if (this.d != null) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int i = avlh.a;
        this.d = avlh.F(0L, 1L, timeUnit, awlg.a()).H(new yrb(new yrc(this, 1), 0)).p().ak(new xul(new yrc(this, 0), 16));
    }

    private final synchronized void i() {
        Object obj = this.d;
        if (obj != null) {
            awka.f((AtomicReference) obj);
        }
        this.d = null;
    }

    @Override // defpackage.yqg
    public final long a() {
        return this.a.getBackoffDelayMs();
    }

    @Override // defpackage.yqg
    public final long b() {
        return this.a.getCreatedRealTimeMs();
    }

    @Override // defpackage.yqg
    public final long c() {
        return this.a.getLastStartedRealTimeMs();
    }

    @Override // defpackage.yqg
    public final yth d() {
        PrewarmedHostInfo openedPrewarmedHostInfo = this.a.getOpenedPrewarmedHostInfo();
        if (openedPrewarmedHostInfo == null) {
            return null;
        }
        String openedHost = openedPrewarmedHostInfo.getOpenedHost();
        int rttMs = openedPrewarmedHostInfo.getRttMs();
        String validBandaidUri = openedPrewarmedHostInfo.getValidBandaidUri();
        return new yth(openedHost, rttMs, validBandaidUri != null ? Uri.parse(validBandaidUri) : null);
    }

    @Override // defpackage.yqg
    public final String e() {
        return this.a.getStopReason();
    }

    @Override // defpackage.yqg
    public final void f(Uri uri) {
        String string;
        if (uri == null || (string = uri.toString()) == null) {
            return;
        }
        this.a.addValidBandaidUri(string);
    }

    @Override // defpackage.yqg
    public final void g(String str) {
        i();
        this.a.stop(str);
    }

    @Override // defpackage.yqg
    public final void j() {
        this.a.start(1500L);
        h();
    }
}
