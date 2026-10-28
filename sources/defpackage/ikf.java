package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ikf extends adtv implements SharedPreferences.OnSharedPreferenceChangeListener, advc, adwk, iyx, xzf {
    public final tbt a;
    public boolean b;
    private final Context c;
    private final abjp d;
    private final icj e;
    private final ico f;
    private final icl g;
    private final adlq h;
    private final ike i;
    private final adku j;
    private final admu k;
    private final ike l;
    private final adku m;
    private final jkp n;
    private final int o;
    private boolean p;
    private final avmm q;
    private final ycp r;
    private final vxz s;
    private final vxz t;
    private final aesp u;

    public ikf(wnf wnfVar, aouj aoujVar, Context context, tbt tbtVar, ttm ttmVar, xgn xgnVar, abjp abjpVar, icj icjVar, ico icoVar, icl iclVar, aesp aespVar, jkp jkpVar, ycp ycpVar, vxz vxzVar, vxz vxzVar2, awkx awkxVar) {
        super(wnfVar, tbtVar, new Object(), ttmVar, xgnVar);
        avmm avmmVar = new avmm();
        this.q = avmmVar;
        this.c = context;
        this.a = tbtVar;
        this.e = icjVar;
        this.d = abjpVar;
        this.g = iclVar;
        this.u = aespVar;
        this.f = icoVar;
        this.n = jkpVar;
        this.r = ycpVar;
        this.s = vxzVar;
        this.t = vxzVar2;
        int i = aoujVar.r;
        this.o = i == 0 ? 10 : i;
        this.b = aoujVar.n;
        adlq adlqVar = new adlq(false);
        this.h = adlqVar;
        ike ikeVar = new ike(icoVar.b(0));
        this.i = ikeVar;
        adku adkuVar = new adku(ikeVar);
        this.j = adkuVar;
        int i2 = 1;
        ike ikeVar2 = new ike(icoVar.b(1));
        this.l = ikeVar2;
        adku adkuVar2 = new adku(ikeVar2);
        this.m = adkuVar2;
        admu admuVar = new admu();
        this.k = admuVar;
        n();
        adlqVar.m(-1, adkuVar, true);
        adlqVar.m(-1, admuVar, true);
        adlqVar.m(-1, adkuVar2, true);
        adkuVar.b(Alert.DURATION_SHOW_INDEFINITELY);
        ikeVar2.h(new xbl(this, 1));
        r(jkpVar.getBoolean(gzj.AUTOPLAY_ENABLED, true));
        jkpVar.registerOnSharedPreferenceChangeListener(this);
        int i3 = 5;
        avmmVar.c(aespVar.s().i(new abwr(i2)).al(new ifo(this, 7), new ido(i3)));
        avmmVar.c(awkxVar.i(new abwr(i2)).al(new ifo(this, 8), new ido(i3)));
        ycpVar.a(this);
        avmmVar.c(icjVar.e().ak(new ifo(this, 9)));
        if (u()) {
            tbtVar.f(this);
        }
    }

    private final void q() {
        Object obj;
        n();
        if (!u() || (obj = this.ae) == null) {
            return;
        }
        tbt tbtVar = this.a;
        acjw acjwVar = acjw.b;
        tbtVar.d(obj, new adtk(acjwVar, o(acjwVar), false), false);
    }

    private final void r(boolean z) {
        this.p = z;
        n();
    }

    private final boolean u() {
        return this.s.l(106, 45798002L, false);
    }

    private final boolean v(acjw acjwVar) {
        abjl abjlVarH = this.d.h();
        if (!(abjlVarH instanceof icj)) {
            return false;
        }
        icj icjVar = (icj) abjlVarH;
        acjw acjwVar2 = acjw.b;
        if (acjwVar != acjwVar2) {
            return false;
        }
        icl iclVar = icjVar.b;
        return (iclVar.b(acjwVar2) || icjVar.n || !iclVar.b(acjw.h)) ? false : true;
    }

    @Override // defpackage.advc
    public final adkz a() {
        return this.h;
    }

    @Override // defpackage.adtv
    protected final /* bridge */ /* synthetic */ Object c(apjh apjhVar) {
        return null;
    }

    public final void d() {
        jkp jkpVar = this.n;
        if (jkpVar.getBoolean(gzj.HAS_USER_CHANGED_DEFAULT_AUTOPLAY_MODE, false)) {
            r(jkpVar.getBoolean(gzj.AUTOPLAY_ENABLED, true));
            return;
        }
        ajik ajikVar = this.e.w;
        if (ajikVar == ajik.AUTOMIX_MODE_DEFAULT_ON) {
            jko jkoVarEdit = jkpVar.edit();
            jkoVarEdit.a(gzj.AUTOPLAY_ENABLED, true);
            jkoVarEdit.apply();
            r(true);
            return;
        }
        if (ajikVar != ajik.AUTOMIX_MODE_DEFAULT_OFF) {
            r(jkpVar.getBoolean(gzj.AUTOPLAY_ENABLED, true));
            return;
        }
        jko jkoVarEdit2 = jkpVar.edit();
        jkoVarEdit2.a(gzj.AUTOPLAY_ENABLED, false);
        jkoVarEdit2.apply();
        r(false);
    }

    @Override // defpackage.iyx
    public final void e(int i, int i2) {
        if (i != i2) {
            adlq adlqVar = this.h;
            adku adkuVar = this.j;
            int iL = adlqVar.l(adkuVar);
            int iA = adkuVar.a() + iL;
            if (iL > i || i >= iA || iL > i2 || i2 >= iA) {
                return;
            }
            this.i.g(i - iL, i2 - iL);
        }
    }

    @Override // defpackage.xzf
    public final void g(xzc xzcVar) {
        q();
    }

    @Override // defpackage.adtv
    public final acjx hQ(acjw acjwVar) {
        if (v(acjwVar)) {
            acjwVar = acjw.h;
        }
        return (acjx) this.g.b.get(acjwVar);
    }

    @Override // defpackage.adtv
    public final void hR(acjw acjwVar) {
        if (!u() || this.r.e == null) {
            if (v(acjwVar)) {
                agrx agrxVar = agso.a;
                acjwVar = acjw.h;
            }
            this.g.a(acjwVar, new gml(this, acjwVar, 5));
        }
    }

    @tcc
    public void handleMdxSwitchPlaybackQueueEvent(xyc xycVar) {
        if (!u() || xycVar.a) {
            return;
        }
        q();
    }

    @Override // defpackage.adtv, defpackage.twn
    public final void i() {
        super.i();
        this.q.b();
        this.l.i();
        this.i.i();
        this.n.unregisterOnSharedPreferenceChangeListener(this);
        this.r.d(this);
        if (u()) {
            this.a.l(this);
        }
    }

    @Override // defpackage.iyx
    public final void j(Object obj, int i) {
        ike ikeVar;
        int iB;
        int iB2;
        int i2;
        if (i != 0) {
            adku adkuVar = this.j;
            if (!adkuVar.contains(obj)) {
                adku adkuVar2 = this.m;
                if (!adkuVar2.contains(obj) || (iB2 = i + (iB = (ikeVar = this.l).b(obj))) < 0 || iB2 >= adkuVar2.a()) {
                    return;
                }
                ikeVar.g(iB, iB2);
                return;
            }
            ike ikeVar2 = this.i;
            int iB3 = ikeVar2.b(obj);
            if (iB3 >= adkuVar.a() || (i2 = i + iB3) < 0 || i2 >= adkuVar.a()) {
                return;
            }
            ikeVar2.g(iB3, i2);
        }
    }

    @Override // defpackage.xzf
    public final void jv(xzc xzcVar) {
        q();
    }

    @Override // defpackage.adwk
    public final void l(Object obj) {
        hyz hyzVar;
        if (obj instanceof ida) {
            hyzVar = (hyz) ((ida) obj).get();
        } else {
            hyzVar = obj instanceof hyz ? (hyz) obj : null;
        }
        if (hyzVar != null) {
            this.f.e(hyzVar);
            Context context = this.c;
            if (twb.c(context)) {
                aihh aihhVar = (aihh) aoda.a.createBuilder();
                alay alayVarC = ackj.c(context.getString(R.string.track_removed_toast));
                aihhVar.copyOnWrite();
                aoda aodaVar = (aoda) aihhVar.instance;
                alayVarC.getClass();
                aodaVar.c = alayVarC;
                aodaVar.b |= 1;
                this.a.c(vvr.a((aoda) aihhVar.build()));
            }
        }
    }

    public final void n() {
        aesp aespVar = this.u;
        yco ycoVar = this.r.e;
        boolean zEquals = aespVar.q().equals(ibv.LOOP_ALL);
        if (this.l.isEmpty() || zEquals || ycoVar != null || this.b) {
            this.m.b(0);
            this.k.clear();
            return;
        }
        this.m.b(this.p ? this.o : 0);
        if (this.t.l(241, 45799010L, false)) {
            this.k.clear();
        }
        admu admuVar = this.k;
        if (admuVar.isEmpty()) {
            icj icjVar = this.e;
            admuVar.add(0, new hed(icjVar.w, icjVar.f(), icjVar.y));
        }
    }

    @Override // defpackage.adtv
    public final boolean o(acjw acjwVar) {
        if (u() && this.r.e != null) {
            return false;
        }
        if (v(acjwVar)) {
            acjwVar = acjw.h;
        }
        return this.g.b(acjwVar);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        jkp jkpVar = this.n;
        if (TextUtils.equals(str, jkpVar.b(gzj.AUTOPLAY_ENABLED))) {
            r(sharedPreferences.getBoolean(jkpVar.b(gzj.AUTOPLAY_ENABLED), true));
        }
    }

    @Override // defpackage.xzf
    public final /* synthetic */ void h(xzc xzcVar) {
    }

    @Override // defpackage.advc
    public final void k(Configuration configuration) {
    }
}
