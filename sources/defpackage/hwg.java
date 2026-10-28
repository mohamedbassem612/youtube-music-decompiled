package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hwg extends abge implements abdz, acdp {
    private final aunn Z;
    public final hwc a;
    private final xgn aa;
    private final abea ab;
    private final aunn ac;
    private final acdq ad;
    private final avmm ae;
    private final jbm af;
    private final hvz ag;
    private final hwy ah;
    private final hvw ai;
    public final awmd b;
    public final hfk c;
    public final aefv d;
    public final aunn e;
    public final aunn f;
    public final avmb g;
    public final cf h;
    public final acxn i;
    public final abmt j;
    public final hwf k;
    public final hwe l;
    public final adly m;
    public final iqv n;
    public final ImageView o;
    public final jbm p;
    public aefl q;
    public aqof r;
    public aefl s;
    public ajnf t;
    public amks u;
    public boolean v;
    public final vxz w;

    public hwg(hwc hwcVar, cf cfVar, abvk abvkVar, abmt abmtVar, ci ciVar, aefv aefvVar, awmd awmdVar, xgn xgnVar, hfk hfkVar, aunn aunnVar, yha yhaVar, ScheduledExecutorService scheduledExecutorService, Executor executor, avmb avmbVar, abea abeaVar, aunn aunnVar2, aunn aunnVar3, acdq acdqVar, aunn aunnVar4, acxn acxnVar, jij jijVar, axfd axfdVar, jnj jnjVar, jnm jnmVar, vxz vxzVar, abgo abgoVar, hhb hhbVar, vxz vxzVar2, vxz vxzVar3) {
        super(abvkVar, ciVar, hwcVar, yhaVar, scheduledExecutorService, executor, abmtVar, vxzVar, abgoVar, vxzVar3);
        this.k = new hwf(this);
        this.l = new hwe(this);
        this.ae = new avmm();
        adly adlyVar = new adly();
        this.m = adlyVar;
        this.h = cfVar;
        this.a = hwcVar;
        this.d = aefvVar;
        this.b = awmdVar;
        this.c = hfkVar;
        this.Z = aunnVar;
        this.aa = xgnVar;
        this.g = avmbVar;
        this.ab = abeaVar;
        this.e = aunnVar2;
        this.ac = aunnVar3;
        this.ad = acdqVar;
        this.f = aunnVar4;
        this.i = acxnVar;
        this.j = abmtVar;
        this.w = vxzVar2;
        adlyVar.a(xgnVar);
        jbm jbmVarA = jijVar.a(new ImageButton(cfVar), null, null, null, false);
        this.af = jbmVarA;
        hwcVar.c(jbmVarA.a);
        View view = jbmVarA.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            int dimension = (int) cfVar.getResources().getDimension(R.dimen.remix_generic_button_size);
            layoutParams.width = dimension;
            layoutParams.height = dimension;
            view.setLayoutParams(layoutParams);
        }
        jbmVarA.a.setBackground(cfVar.getDrawable(R.drawable.circle_thumbnail_ripple));
        View viewFindViewById = hwcVar.findViewById(R.id.overlay_queue_shuffle_button_view);
        ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.playback_control_indicator);
        View viewFindViewById2 = hwcVar.findViewById(R.id.overlay_queue_loop_button_view);
        ImageView imageView2 = (ImageView) viewFindViewById2.findViewById(R.id.playback_control_indicator);
        hwy hwyVarAl = axfdVar.al(imageView, viewFindViewById);
        this.ah = hwyVarAl;
        if (hwyVarAl != null) {
            hwyVarAl.c();
        }
        hvz hvzVarZ = jnjVar.z(imageView2, viewFindViewById2);
        this.ag = hvzVarZ;
        if (hvzVarZ != null) {
            hvzVarZ.c();
        }
        this.ai = hhbVar.c((YouTubeButton) hwcVar.findViewById(R.id.playback_rate_text_button));
        ImageView imageView3 = (ImageView) hwcVar.findViewById(R.id.fullscreen_ask_music_global_entry_button);
        this.o = imageView3;
        this.p = jijVar.a(imageView3, null, null, null, false);
        this.n = jnmVar.c(cfVar);
    }

    private final void r(int i) {
        this.aa.l(new xgj(xhb.b(i)));
    }

    public final View c() {
        boolean zL = this.w.l(95, 45762151L, false);
        hwc hwcVar = this.a;
        if (!zL) {
            return hwcVar;
        }
        View view = hwcVar.e;
        tuk.l(view, true);
        return ((kwq) hwcVar.K.io()).k() == ibt.FILL ? view : hwcVar.d;
    }

    public final void d() {
        aefl aeflVar = this.q;
        if (aeflVar != null) {
            this.d.e(aeflVar);
            this.q = null;
        }
        aefl aeflVar2 = this.s;
        if (aeflVar2 != null) {
            this.d.e(aeflVar2);
            this.s = null;
        }
        this.r = null;
    }

    public final void e() {
        this.af.hU(this.m, (this.t == null || ((hfn) this.e.io()).x() != hww.h) ? ajnf.a : this.t);
    }

    @Override // defpackage.abge
    public final void f() {
        super.f();
        hwy hwyVar = this.ah;
        if (hwyVar != null) {
            hwyVar.d();
        }
        hvz hvzVar = this.ag;
        if (hvzVar != null) {
            hvzVar.d();
        }
        if (this.w.l(44, 45682398L, false)) {
            this.ai.b(null);
        }
        d();
        this.ab.j(this);
        kro.X((ViewGroup) this.a.findViewById(R.id.info_panel_overview_element_container), ((jer) this.f.io()).a);
        this.p.b(null);
        this.ad.y(this);
        this.ae.b();
    }

    @Override // defpackage.abge
    public final void g() {
        super.g();
        hwy hwyVar = this.ah;
        if (hwyVar != null) {
            hwyVar.e();
        }
        hvz hvzVar = this.ag;
        if (hvzVar != null) {
            hvzVar.e();
        }
        int i = 0;
        if (this.w.l(44, 45682398L, false)) {
            hvw hvwVar = this.ai;
            new adly();
            hvwVar.f();
        }
        h();
        this.ab.e(this);
        avmm avmmVar = this.ae;
        avlh avlhVarY = ((hfn) this.e.io()).y();
        avmb avmbVar = this.g;
        int i2 = 6;
        avmmVar.c(avlhVarY.L(avmbVar).al(new hwd(this, 1), new hpw(i2)));
        avmmVar.c(((igk) this.Z.io()).b().L(avmbVar).al(new hwd(this, i), new hpw(i2)));
        this.ad.w(this);
    }

    @Override // defpackage.acdp
    public final void gU(int i) {
        if ((262144 & i) != 0) {
            this.a.K();
        }
        if ((i & 32768) != 0) {
            this.a.G();
        }
    }

    public final void h() {
        boolean z = ((ycp) this.b.io()).e != null;
        hwc hwcVar = this.a;
        hwcVar.l = z;
        hwcVar.K();
        hwcVar.F();
    }

    @Override // defpackage.abdz
    public final void hn(abdy abdyVar) {
        if (Objects.equals(abdyVar, abdy.b)) {
            r(202381);
            r(28240);
            r(28239);
            r(36842);
            r(56386);
            r(54319);
            r(54318);
            if (this.w.l(95, 45762151L, false)) {
                r(((kwq) this.ac.io()).k().d);
            }
        }
    }

    public final boolean i() {
        if (this.a.I() && this.u != null && ((hfn) this.e.io()).x().b(hww.c)) {
            return !this.w.l(95, 45762151L, false) || this.r == null;
        }
        return false;
    }
}
