package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.player.indicator.RoundedPlayingIndicatorView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jej implements adma {
    public final View a;
    public final avmm b;
    public final awku c;
    public final awku d;
    public final avlh e;
    public antp f;
    public avmn g;
    public final ycp h;
    public final yx i;
    private final Context j;
    private final ImageView k;
    private final RoundedPlayingIndicatorView l;
    private final aduv m;
    private final ggd n;
    private final avlh o;
    private final avlh p;
    private ggd q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;

    public jej(Context context, aduv aduvVar, abvn abvnVar, avlh avlhVar, yx yxVar, ycp ycpVar) {
        this.j = context;
        this.m = aduvVar;
        this.o = avlhVar;
        this.p = abvnVar.N();
        this.e = (avlh) abvnVar.r().n;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.music_play_button, (ViewGroup) null);
        this.a = viewInflate;
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon);
        this.k = imageView;
        this.l = (RoundedPlayingIndicatorView) viewInflate.findViewById(R.id.now_playing_indicator);
        this.i = yxVar;
        this.h = ycpVar;
        ggd ggdVar = new ggd(imageView);
        this.n = ggdVar;
        ggdVar.b = 100;
        this.b = new avmm();
        this.c = awku.aC(jei.a);
        this.d = awku.aC(Boolean.FALSE);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.a.setBackground(null);
        ggd ggdVar = this.q;
        if (ggdVar != null) {
            ggdVar.a();
        }
        this.n.a();
        this.b.b();
        this.c.kk(jei.a);
        this.d.kk(Boolean.FALSE);
    }

    public final void d(alja aljaVar) {
        ggd ggdVar = this.q;
        if (ggdVar != null) {
            ggdVar.a();
        }
        if (aljaVar == null) {
            this.n.a();
            return;
        }
        aduv aduvVar = this.m;
        aliz alizVarA = aliz.a(aljaVar.c);
        if (alizVarA == null) {
            alizVarA = aliz.UNKNOWN;
        }
        int iA = aduvVar.a(alizVarA);
        if (iA != 0) {
            aduk adukVar = new aduk(this.j, iA);
            int i = this.r;
            adukVar.c(i, i);
            adukVar.b(this.s);
            this.k.setImageDrawable(adukVar.a());
            this.n.b();
        }
    }

    @Override // defpackage.adma
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void hU(adly adlyVar, antp antpVar) {
        this.f = antpVar;
        Context context = this.j;
        this.r = adlyVar.b("playButtonSize", adlyVar.b("thumbnailOverlaySize", context.getResources().getDimensionPixelSize(R.dimen.music_icon_size)));
        this.t = adlyVar.b("animatedEqualizerSize", adlyVar.b("thumbnailOverlaySize", context.getResources().getDimensionPixelSize(R.dimen.music_icon_size)));
        this.u = adlyVar.b("nowPlayingIndicatorSize", adlyVar.b("thumbnailOverlaySize", context.getResources().getDimensionPixelSize(R.dimen.music_icon_size)));
        this.v = adlyVar.b("nowPlayingIndicatorMargin", context.getResources().getDimensionPixelSize(R.dimen.item_extra_small_spacing));
        this.s = adlyVar.b("thumbnailOverlayColor", context.getColor(R.color.quantum_white_100));
        if (antpVar.i != 0) {
            View view = this.a;
            aduk adukVar = new aduk(context, R.drawable.music_play_button_background);
            adukVar.b(antpVar.i);
            view.setBackground(adukVar.a());
        }
        int i = this.r;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        this.k.setLayoutParams(layoutParams);
        RoundedPlayingIndicatorView roundedPlayingIndicatorView = this.l;
        ggd ggdVar = new ggd(roundedPlayingIndicatorView);
        this.q = ggdVar;
        ggdVar.b = 100;
        int i2 = this.f.j ? this.u : this.t;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams2.gravity = true != this.f.j ? 17 : 8388693;
        if (this.f.j) {
            layoutParams2.setMargins(0, 0, 0, this.v);
            layoutParams2.setMarginEnd(this.v);
        }
        roundedPlayingIndicatorView.setLayoutParams(layoutParams2);
        f();
        this.b.e(this.p.i(new abwr(1)).al(new iwb(this, 16), new jeh(0)), this.o.i(new abwr(1)).al(new iwb(this, 17), new jeh(0)));
    }

    public final void f() {
        alja aljaVar;
        antp antpVar = this.f;
        if ((antpVar.b & 16) != 0) {
            aljaVar = antpVar.h;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
        } else {
            aljaVar = null;
        }
        d(aljaVar);
        this.c.kk((this.f.b & 16) != 0 ? jei.b : jei.a);
        this.d.kk(Boolean.FALSE);
    }

    public final void g(boolean z, float f) {
        this.n.a();
        this.l.a(z, f);
        ggd ggdVar = this.q;
        if (ggdVar != null) {
            ggdVar.b();
        }
    }
}
