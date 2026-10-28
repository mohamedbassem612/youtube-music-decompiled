package defpackage;

import com.google.android.libraries.youtube.media.player.exo2.platypus.SharedBandwidthSampleTrackerWrapper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yef implements zwj {
    public final zeh a;
    private final ytv b;
    private final yqy c;
    private final ygy d;
    private final zwi e;
    private final zjr f;
    private final aunn g;
    private final tbt h;
    private final aunn i;
    private final yha j;

    public yef(ytv ytvVar, yqy yqyVar, ygy ygyVar, zwi zwiVar, zjr zjrVar, aunn aunnVar, tbt tbtVar, zeh zehVar, yha yhaVar, aunn aunnVar2) {
        this.b = ytvVar;
        this.j = yhaVar;
        this.c = yqyVar;
        this.d = ygyVar;
        this.e = zwiVar;
        this.f = zjrVar;
        this.g = aunnVar;
        this.h = tbtVar;
        this.a = zehVar;
        this.i = aunnVar2;
    }

    public final void a() {
        this.e.e(this);
        this.h.f(this);
    }

    @Override // defpackage.zwj
    public final void b() {
        if (this.f.S().ac) {
            yha yhaVar = this.j;
            yhaVar.f.execute(afwl.i(new ygz(yhaVar, 0)));
            this.c.a.evictAll();
            this.d.a.b();
        }
    }

    public final void c(boolean z) {
        this.b.v(z);
        if (z || !this.f.bW()) {
            return;
        }
        SharedBandwidthSampleTrackerWrapper sharedBandwidthSampleTrackerWrapper = (SharedBandwidthSampleTrackerWrapper) this.i.io();
        if (sharedBandwidthSampleTrackerWrapper.a != null) {
            sharedBandwidthSampleTrackerWrapper.a.persistBandwidthSamples();
        }
    }

    @tcc
    public void onIdentityRemovedFromDevice(zwf zwfVar) {
        if (this.f.S().ae) {
            yha yhaVar = this.j;
            aihf aihfVarCreateBuilder = ajbt.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ajbt ajbtVar = (ajbt) aihfVarCreateBuilder.instance;
            ajbtVar.c = 1;
            ajbtVar.b |= 1;
            xeu xeuVar = yhaVar.d;
            if (!xeuVar.b) {
                yhaVar.f.execute(afwl.i(new xoy(yhaVar, aihfVarCreateBuilder, 10)));
                return;
            }
            yhaVar.f.execute(afwl.i(new ygz(yhaVar, 0)));
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.CACHE_WIPEOUT_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        }
    }

    @tcc
    public void onUserSignIn(zwt zwtVar) {
        ((zfs) this.g.io()).g();
    }

    @tcc
    public void onUserSignOut(zwu zwuVar) {
        ((zfs) this.g.io()).g();
    }
}
