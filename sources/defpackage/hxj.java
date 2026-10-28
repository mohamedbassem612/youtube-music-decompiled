package defpackage;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.player.audiovideoswitcher.ui.AudioVideoSwitcherToggleView;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxj {
    private final ycp A;
    private final vxz B;
    private final jnj C;
    private final fdl D;
    private final jij E;
    public final xgn a;
    public final hxf b;
    final abji c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final hwz l;
    public final jnm m;
    private final abjp n;
    private final avlh o;
    private final avlh p;
    private final aunn r;
    private final abvn s;
    private final aunn t;
    private final View u;
    private final AudioVideoSwitcherToggleView v;
    private final float w;
    private final float x;
    private boolean y;
    private int z = 1;
    public final hhc k = new hhc(this);
    public final hxh j = new hxh(this);
    private final avmm q = new avmm();

    public hxj(FrameLayout frameLayout, hwz hwzVar, abjp abjpVar, jnm jnmVar, xgn xgnVar, ycp ycpVar, avlh avlhVar, jnj jnjVar, avlh avlhVar2, fdl fdlVar, vxz vxzVar, hxf hxfVar, aunn aunnVar, abvn abvnVar, jij jijVar, aunn aunnVar2) {
        this.u = frameLayout;
        this.l = hwzVar;
        this.n = abjpVar;
        this.m = jnmVar;
        this.a = xgnVar;
        this.A = ycpVar;
        this.o = avlhVar;
        this.C = jnjVar;
        this.p = avlhVar2;
        this.D = fdlVar;
        this.B = vxzVar;
        this.b = hxfVar;
        this.r = aunnVar;
        this.E = jijVar;
        this.s = abvnVar;
        this.t = aunnVar2;
        TypedValue typedValue = new TypedValue();
        frameLayout.getContext().getResources().getValue(R.dimen.active_icon_alpha, typedValue, true);
        this.w = typedValue.getFloat();
        frameLayout.getContext().getResources().getValue(R.dimen.disabled_icon_alpha, typedValue, true);
        this.x = typedValue.getFloat();
        AudioVideoSwitcherToggleView audioVideoSwitcherToggleView = (AudioVideoSwitcherToggleView) LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.audio_video_switch_toggle, frameLayout).findViewById(R.id.audio_video_switch_toggle);
        this.v = audioVideoSwitcherToggleView;
        audioVideoSwitcherToggleView.setOnClickListener(new hxg(this, 0));
        this.c = new ibi(this, 1);
    }

    private final void g() {
        this.v.setVisibility(4);
        this.z = 4;
    }

    private final void h(boolean z) {
        j(z);
        if (this.z != 3) {
            this.z = 3;
            AudioVideoSwitcherToggleView audioVideoSwitcherToggleView = this.v;
            audioVideoSwitcherToggleView.c(audioVideoSwitcherToggleView.b(true));
            audioVideoSwitcherToggleView.f(true);
            audioVideoSwitcherToggleView.e(true);
        }
    }

    private final void i(boolean z) {
        j(z);
        if (this.z != 2) {
            this.z = 2;
            AudioVideoSwitcherToggleView audioVideoSwitcherToggleView = this.v;
            audioVideoSwitcherToggleView.c(audioVideoSwitcherToggleView.b(false));
            audioVideoSwitcherToggleView.f(false);
            audioVideoSwitcherToggleView.e(false);
        }
    }

    private final void j(boolean z) {
        if (!this.B.l(95, 45762151L, false)) {
            this.v.setAlpha(z ? this.w : this.x);
        }
        this.h = z;
        AudioVideoSwitcherToggleView audioVideoSwitcherToggleView = this.v;
        if (z != audioVideoSwitcherToggleView.o) {
            audioVideoSwitcherToggleView.o = z;
            if (!audioVideoSwitcherToggleView.g() || audioVideoSwitcherToggleView.d == null) {
                return;
            }
            audioVideoSwitcherToggleView.f(audioVideoSwitcherToggleView.h());
        }
    }

    private final void k() {
        boolean z = this.i;
        AudioVideoSwitcherToggleView audioVideoSwitcherToggleView = this.v;
        if (!audioVideoSwitcherToggleView.g()) {
            audioVideoSwitcherToggleView.e.setText(z ? R.string.audio_video_switcher_toggle_audio_text : R.string.audio_video_switcher_toggle_song_text);
        }
        audioVideoSwitcherToggleView.j = z ? audioVideoSwitcherToggleView.i : audioVideoSwitcherToggleView.h;
        audioVideoSwitcherToggleView.l = String.format(audioVideoSwitcherToggleView.f, audioVideoSwitcherToggleView.j);
        if (audioVideoSwitcherToggleView.d != null) {
            audioVideoSwitcherToggleView.e(audioVideoSwitcherToggleView.h());
        }
    }

    private final boolean l() {
        return this.y || this.d;
    }

    public final void a() {
        this.a.d(new xgj(xhb.b(59372)));
    }

    public final void b() {
        avmm avmmVar = this.q;
        if (!avmmVar.b && avmmVar.a() > 0) {
            avmmVar.b();
        }
        if (this.B.l(81, 45739191L, false)) {
            this.b.h.b();
        } else {
            this.n.s(this.c);
        }
    }

    public final void c() {
        hwz hwzVar = this.l;
        int i = 1;
        int i2 = 17;
        avmn avmnVarAl = hwzVar.h().i(new abwr(i)).al(new hwd(this, 18), new hpw(i2));
        int i3 = 0;
        avlh avlhVarI = this.p.i(new abwr(i));
        AudioVideoSwitcherToggleView audioVideoSwitcherToggleView = this.v;
        audioVideoSwitcherToggleView.getClass();
        int i4 = 2;
        avmn[] avmnVarArr = {avmnVarAl, avlhVarI.al(new hxi(audioVideoSwitcherToggleView, i), new hpw(i2)), ((ayq) this.r.io()).v().i(new abwr(i)).al(new hwd(this, i2), new hpw(i2))};
        avmm avmmVar = this.q;
        avmmVar.e(avmnVarArr);
        vxz vxzVar = this.B;
        if (vxzVar.l(95, 45762151L, false)) {
            avlh avlhVarI2 = ((avlh) ((kwq) this.t.io()).c).p().i(new abwr(i));
            audioVideoSwitcherToggleView.getClass();
            avmmVar.c(avlhVarI2.al(new hva(audioVideoSwitcherToggleView, 14), new hpw(i2)));
        }
        int i5 = 10;
        int i6 = 9;
        if (!vxzVar.l(81, 45739191L, false)) {
            this.f = this.A.e != null;
            avmmVar.e(this.D.e().i(new abwr(i)).x(new hgu(i6)).H(new hbz(i5)).al(new hwd(this, 19), new hpw(i2)), this.o.i(new abwr(i)).al(new hwd(this, 20), new hpw(i2)));
            d((hyz) this.n.k(this.C.q()));
            return;
        }
        hxf hxfVar = this.b;
        avmm avmmVar2 = hxfVar.h;
        avlh avlhVarH = ((fdl) hxfVar.e.io()).e().x(new hxe(i3)).H(new hpr(7));
        avmb avmbVar = hxfVar.g;
        aunn aunnVar = hxfVar.a;
        avmmVar2.e(avlhVarH.L(avmbVar).al(new hva(hxfVar, 13), new hmd(i2)), ((avlh) ((abvn) aunnVar.io()).r().a).L(avmbVar).al(new hva(hxfVar, i6), new hmd(i2)), ((abvn) aunnVar.io()).P().L(avmbVar).al(new hva(hxfVar, i5), new hmd(i2)), ((tce) hxfVar.f.io()).a.L(avmbVar).al(new hva(hxfVar, 11), new hmd(i2)), ((ayq) hxfVar.d.io()).v().L(avmbVar).al(new hva(hxfVar, 12), new hmd(i2)));
        avmmVar.e(hwzVar.i().i(new abwr(i)).al(new hva(this, 15), new hpw(i2)), this.s.P().x(new hxe(i4)).i(new abwr(i)).al(new hva(this, 16), new hpw(i2)));
    }

    public final void d(hyz hyzVar) {
        this.y = !(hyzVar instanceof hzf);
        e();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e4  */
    public final void e() {
        if (this.B.l(81, 45739191L, false)) {
            return;
        }
        k();
        if (this.m.C() || this.i) {
            if (!this.e && !this.g) {
                abjp abjpVar = this.n;
                jnj jnjVar = this.C;
                if (abjpVar.k(jnjVar.q()) != null) {
                    Optional optionalOfNullable = Optional.ofNullable((hyz) abjpVar.k(jnjVar.q()));
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = Optional.ofNullable(Boolean.valueOf(gzj.X(((hyz) optionalOfNullable.get()).n())));
                    }
                    if (!((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue()) {
                    }
                }
                if (this.f) {
                    this.v.setVisibility(0);
                    j(false);
                } else if (!l() && hwz.l(this.l.f())) {
                    this.v.setVisibility(0);
                    if (this.b.f() || !this.D.g()) {
                        i(true);
                    } else {
                        i(false);
                    }
                } else if (l() || !hwz.k(this.l.f())) {
                    this.v.setVisibility(0);
                    h(false);
                } else {
                    this.v.setVisibility(0);
                    h(true);
                }
            }
            j(false);
            g();
        } else {
            hxf hxfVar = this.b;
            boolean z = hxfVar.b().isEmpty() && hxfVar.a().isEmpty();
            if (this.e || z) {
                j(false);
                g();
            } else if (this.f) {
                this.v.setVisibility(0);
                j(false);
            } else if (!l()) {
                if (l()) {
                    this.v.setVisibility(0);
                    h(false);
                } else {
                    this.v.setVisibility(0);
                    h(false);
                }
            } else if (l()) {
                this.v.setVisibility(0);
                h(false);
            } else {
                this.v.setVisibility(0);
                h(false);
            }
        }
        if (this.u.getVisibility() != 0 || this.z == 4) {
            return;
        }
        this.a.l(new xgj(xhb.b(59372)));
    }

    public final void f() {
        if (!this.B.l(81, 45739191L, false)) {
            e();
            return;
        }
        if (this.E.b()) {
            g();
            return;
        }
        hwz hwzVar = this.l;
        boolean z = hwzVar.g() == asfk.MUSIC_PLAYBACK_CONTENT_MODE_STATE_ACTIVE;
        boolean zL = hwz.l(hwzVar.f());
        int i = zL ? 2 : 3;
        k();
        AudioVideoSwitcherToggleView audioVideoSwitcherToggleView = this.v;
        if (audioVideoSwitcherToggleView.getVisibility() == 0 && this.h == z && this.z == i) {
            return;
        }
        audioVideoSwitcherToggleView.setVisibility(0);
        if (zL) {
            i(z);
        } else {
            h(z);
        }
    }
}
