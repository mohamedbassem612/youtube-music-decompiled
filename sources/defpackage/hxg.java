package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.watch.WatchFragment;
import com.google.android.apps.youtube.music.watchpage.MusicPlaybackControls;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import j$.util.Optional;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hxg implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public hxg(aumt aumtVar, int i) {
        this.$cid = i;
        this.a = aumtVar;
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [bog, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [aunn, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        sog sogVar;
        sog sogVar2;
        amdd amddVar = null;
        int i = 1;
        switch (this.$cid) {
            case 0:
                hxj hxjVar = (hxj) this.a;
                if (hxjVar.m.C() || hxjVar.i) {
                    if (!hxjVar.h) {
                        hxjVar.b.c();
                    } else {
                        xgn xgnVar = hxjVar.a;
                        ameb amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
                        xgj xgjVar = new xgj(xhb.b(59372));
                        ibh ibhVar = hwz.k(hxjVar.l.f()) ? ibh.OMV_PREFERRED_USER_TRIGGERED : ibh.ATV_PREFERRED_USER_TRIGGERED;
                        int i2 = hwz.k(ibhVar) ? 2 : hwz.l(ibhVar) ? 3 : 1;
                        if (i2 != 1) {
                            aihf aihfVarCreateBuilder = amdd.a.createBuilder();
                            aihf aihfVarCreateBuilder2 = amdt.a.createBuilder();
                            aihfVarCreateBuilder2.copyOnWrite();
                            amdt amdtVar = (amdt) aihfVarCreateBuilder2.instance;
                            amdtVar.c = i2 - 1;
                            amdtVar.b |= 1;
                            aihfVarCreateBuilder.copyOnWrite();
                            amdd amddVar2 = (amdd) aihfVarCreateBuilder.instance;
                            amdt amdtVar2 = (amdt) aihfVarCreateBuilder2.build();
                            amdtVar2.getClass();
                            amddVar2.p = amdtVar2;
                            amddVar2.c |= 8;
                            amddVar = (amdd) aihfVarCreateBuilder.build();
                        }
                        xgnVar.o(amebVar, xgjVar, amddVar);
                    }
                }
                hxjVar.b.d();
                break;
            case 1:
                hwc hwcVar = (hwc) this.a;
                hwcVar.V.x(hwcVar.x, appa.SEEK_SOURCE_START_PLAYBACK_SEEK_TO_END);
                hwcVar.Q.e(true);
                break;
            case 2:
                ivn ivnVar = (ivn) this.a;
                ivnVar.l = true;
                ivnVar.f.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(21538)), null);
                ivnVar.f();
                break;
            case 3:
                ?? r8 = this.a;
                taf.k(r8, ((ayq) ((hef) ((ivn) r8).j.io()).a.io()).j(new iqi(6)), new jco(i), new iny(r8, 9));
                break;
            case 4:
                hwc hwcVar2 = ((WatchFragment) this.a).z;
                if (hwcVar2 != null) {
                    hwcVar2.D();
                }
                break;
            case 5:
                MusicPlaybackControls musicPlaybackControls = (MusicPlaybackControls) this.a;
                musicPlaybackControls.s.x(musicPlaybackControls.i.a, appa.SEEK_SOURCE_START_PLAYBACK_SEEK_TO_END);
                break;
            case 6:
                joz jozVar = (joz) this.a;
                Optional optionalAh = ((axfd) jozVar.f.io()).ah();
                hyw hywVar = (!optionalAh.isPresent() || ((hyw) optionalAh.get()).c() == null) ? null : (hyw) optionalAh.get();
                anfy anfyVarU = ((hfn) jozVar.L.io()).u(hywVar);
                if (anfyVarU != null) {
                    if (((jnj) jozVar.N.io()).j(anfyVarU)) {
                        adyr adyrVar = (adyr) jozVar.am.io();
                        adyp adypVar = new adyp();
                        adypVar.b(agpn.b);
                        adypVar.c(anfyVarU);
                        adypVar.d(false);
                        adyrVar.a(adypVar.a());
                    } else {
                        izr izrVar = (izr) jozVar.I.io();
                        if (hywVar == null) {
                            hywVar = anfyVarU;
                        }
                        izrVar.k(anfyVarU, view, hywVar, (xgn) jozVar.G.io());
                    }
                    jozVar.j(xhb.b(189495));
                    if (jozVar.aw.l(137, 45858970L, false) && hfn.w(anfyVarU)) {
                        jozVar.j(xhb.b(141877));
                    }
                    ((xgn) jozVar.G.io()).o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(16499)), null);
                }
                break;
            case 7:
                WatchWhileLayout watchWhileLayout = (WatchWhileLayout) this.a;
                if (watchWhileLayout.ac()) {
                    if (!watchWhileLayout.bW.s()) {
                        watchWhileLayout.K();
                    } else {
                        watchWhileLayout.M();
                    }
                    break;
                } else if (watchWhileLayout.Y() && !watchWhileLayout.bW.s()) {
                    watchWhileLayout.L(false);
                    break;
                }
                break;
            case 8:
                WatchWhileLayout watchWhileLayout2 = (WatchWhileLayout) this.a;
                if (watchWhileLayout2.Y()) {
                    watchWhileLayout2.A();
                }
                if (watchWhileLayout2.W()) {
                    ((vor) watchWhileLayout2.l.io()).u(true);
                }
                hhb hhbVar = watchWhileLayout2.bZ;
                if (hhbVar != null && !watchWhileLayout2.bC) {
                    get getVar = (get) hhbVar.a;
                    if (getVar.j.af()) {
                        getVar.j.C();
                    }
                    break;
                }
                break;
            case 9:
                ((WatchWhileLayout) this.a).D();
                break;
            case 10:
                ruf rufVarJ = ((abfx) this.a).i.j();
                if (rufVarJ != null && (sogVar = rufVarJ.e) != null) {
                    sogVar.v();
                    break;
                }
                break;
            case 11:
                ruf rufVarJ2 = ((abfx) this.a).i.j();
                if (rufVarJ2 != null && (sogVar2 = rufVarJ2.e) != null) {
                    sogVar2.t();
                    break;
                }
                break;
            case 12:
                ruf rufVarJ3 = ((spi) this.a).h.j();
                if (rufVarJ3 != null) {
                    rufVarJ3.g();
                }
                break;
            case 13:
                ((adtv) this.a).hR(acjw.b);
                break;
            case 14:
                ((aumt) this.a).setVisibility(8);
                break;
            default:
                aumt aumtVar = (aumt) this.a;
                axoz axozVar = new axoz(true != aumtVar.a ? "AUDIOKIT_BANNER_START_CLICKED" : "AUDIOKIT_BANNER_NAV_CLICKED");
                ((HashMap) axozVar.a).put("PARTNER_NAME", aumtVar.getContext().getPackageName());
                if (aumt.l()) {
                    ((auna) auna.b.get()).d(axozVar);
                } else {
                    aumtVar.b.add(axozVar);
                }
                aumtVar.h();
                break;
        }
    }

    public /* synthetic */ hxg(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
