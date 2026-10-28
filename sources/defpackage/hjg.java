package defpackage;

import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hjg implements acel, acdp {
    private static final agrf e = agrf.h("com/google/android/apps/youtube/music/mediabrowser/plugins/PlaybackRateMediaSessionActionPlugin");
    public final aunn a;
    public arbl[] b = new arbl[0];
    public Optional c = Optional.empty();
    public String d = "";
    private final aunn f;
    private final aunn g;
    private final aunn h;
    private final abvn i;
    private acek j;
    private final vxz k;

    public hjg(aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, abvn abvnVar, vxz vxzVar) {
        this.f = aunnVar;
        this.g = aunnVar2;
        this.h = aunnVar3;
        this.a = aunnVar4;
        this.i = abvnVar;
        this.k = vxzVar;
        hhc hhcVar = new hhc(this);
        new avmm().e(((avlh) abvnVar.r().g).x(new hgu(2)).P().al(new hjd(hhcVar, 4), new gfh(15)), ((avlh) abvnVar.r().o).x(new hgu(3)).P().ak(new hjd(hhcVar, 5)));
        ((acdq) aunnVar.io()).w(this);
        if (vxzVar.l(44, 45682398L, false)) {
            ((ibs) aunnVar5.io()).a();
        }
    }

    private final float l() {
        float fA;
        Optional optional = this.c;
        try {
            fA = ((abvk) this.a.io()).a();
        } catch (IllegalStateException e2) {
            ((agrc) ((agrc) ((agrc) e.c().i(agso.a, "PlaybackRatePlugin")).j(e2)).k("com/google/android/apps/youtube/music/mediabrowser/plugins/PlaybackRateMediaSessionActionPlugin", "getCurrentPlaybackRateFromPlayer", (char) 232, "PlaybackRateMediaSessionActionPlugin.java")).w("'playbackRateInterface.getCurrentPlaybackRate' failed. isBackgroundThread: %s", Boolean.valueOf(taq.e()));
            fA = 1.0f;
        }
        return ((Float) optional.orElse(Float.valueOf(fA))).floatValue();
    }

    @Override // defpackage.acel
    public final int b() {
        aunn aunnVar = this.g;
        return ((aerz) aunnVar.io()).d(l());
    }

    @Override // defpackage.acel
    public final int c() {
        float fL = l();
        if (fL == 0.5f) {
            return R.string.accessibility_playback_rate_05;
        }
        if (fL == 0.8f) {
            return R.string.accessibility_playback_rate_08;
        }
        if (fL == 1.0f) {
            return R.string.accessibility_playback_rate_10;
        }
        if (fL == 1.2f) {
            return R.string.accessibility_playback_rate_12;
        }
        if (fL == 1.5f) {
            return R.string.accessibility_playback_rate_15;
        }
        if (fL == 1.8f) {
            return R.string.accessibility_playback_rate_18;
        }
        if (fL == 2.0f) {
            return R.string.accessibility_playback_rate_20;
        }
        if (fL == 2.5f) {
            return R.string.accessibility_playback_rate_25;
        }
        return fL == 3.0f ? R.string.accessibility_playback_rate_30 : R.string.accessibility_playback_rate;
    }

    @Override // defpackage.acel
    public final int d() {
        return 256988;
    }

    @Override // defpackage.acel
    public final String e() {
        return "playback_rate_action";
    }

    public final void f() {
        acek acekVar = this.j;
        if (acekVar != null) {
            acekVar.a();
        }
    }

    @Override // defpackage.acel
    public final void g(acek acekVar) {
        this.j = acekVar;
    }

    @Override // defpackage.acdp
    public final void gU(int i) {
        if (!hgm.b(this.d) || (i & 262144) == 0) {
            return;
        }
        f();
    }

    @Override // defpackage.acel
    public final boolean h() {
        if (!((aerz) this.g.io()).a) {
            agrx agrxVar = agso.a;
            return false;
        }
        if (!this.i.o().ab()) {
            agrx agrxVar2 = agso.a;
            return false;
        }
        if (!hgm.b(this.d) || ((acdq) this.f.io()).D()) {
            agrx agrxVar3 = agso.a;
            return true;
        }
        agrx agrxVar4 = agso.a;
        return false;
    }

    @Override // defpackage.acel
    public final void i() {
        int length;
        arbl arblVar;
        int length2;
        if (this.b.length != 0) {
            vxz vxzVar = this.k;
            if (vxzVar.l(44, 45682398L, false)) {
                float fL = l();
                arbl[] arblVarArr = this.b;
                int i = 0;
                int i2 = -1;
                while (true) {
                    length2 = arblVarArr.length;
                    if (i >= length2 || Float.compare(arblVarArr[i].d, fL) > 0) {
                        break;
                    }
                    i2 = i;
                    i++;
                }
                arblVar = i2 == length2 + (-1) ? arblVarArr[0] : arblVarArr[i2 + 1];
            } else {
                float fL2 = l();
                arbl[] arblVarArr2 = this.b;
                int i3 = 0;
                while (true) {
                    length = arblVarArr2.length;
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    } else if (Float.compare(arblVarArr2[i3].d, fL2) == 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                arblVar = i3 == length + (-1) ? arblVarArr2[0] : arblVarArr2[i3 + 1];
            }
            float f = arblVar.d;
            if (k()) {
                ((abvk) this.a.io()).J(f);
            } else {
                this.c = Optional.of(Float.valueOf(f));
                f();
            }
            if (vxzVar.l(44, 45682398L, false)) {
                return;
            }
            taf.j(((jij) this.h.io()).p(f), new glo(18));
        }
    }

    public final boolean k() {
        return !this.i.o().aa();
    }

    @Override // defpackage.acel
    public final void j() {
    }
}
