package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.offline.views.OfflineBadgeView;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jdf implements adma, jbb {
    public static final /* synthetic */ int d = 0;
    private static final agkz e = agkz.q(aamp.TRANSFER_IN_PROGRESS, aamp.TRANSFER_PAUSED);
    private static final agkz f = agkz.u(aamp.ERROR_PENDING_PLAYABILITY_ACTION, aamp.ERROR_STREAMS_MISSING, aamp.ERROR_NOT_PLAYABLE, aamp.ERROR_POLICY, aamp.ERROR_EXPIRED, aamp.ERROR_NETWORK, aamp.ERROR_DISK, aamp.ERROR_GENERIC);
    private static final agkz g = agkz.s(aamp.TRANSFER_PENDING_NETWORK, aamp.TRANSFER_PENDING_STORAGE, aamp.TRANSFER_WAITING_IN_QUEUE, aamp.TRANSFER_PENDING_WIFI);
    public final RelativeLayout a;
    public final awku b;
    public agkz c;
    private final Context h;
    private final hpy i;
    private final hpk j;
    private final hpd k;
    private final iwt l;
    private final OfflineBadgeView m;
    private final avmb n;
    private final avmb o;
    private final avmm p = new avmm();
    private adly q;
    private String r;
    private String s;

    public jdf(Context context, hpy hpyVar, hpk hpkVar, hpd hpdVar, aduv aduvVar, avmb avmbVar, avmb avmbVar2) {
        this.h = context;
        hpyVar.getClass();
        this.i = hpyVar;
        hpkVar.getClass();
        this.j = hpkVar;
        hpdVar.getClass();
        this.k = hpdVar;
        avmbVar.getClass();
        this.n = avmbVar;
        avmbVar2.getClass();
        this.o = avmbVar2;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.a = relativeLayout;
        iwt iwtVar = new iwt(context, aduvVar);
        this.l = iwtVar;
        OfflineBadgeView offlineBadgeView = new OfflineBadgeView(context);
        this.m = offlineBadgeView;
        offlineBadgeView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        relativeLayout.addView(iwtVar);
        relativeLayout.addView(offlineBadgeView);
        this.b = awku.aC(Boolean.FALSE);
    }

    private final void p(boolean z) {
        tuk.l(this.a, true);
        tuk.l(this.l, z);
        tuk.l(this.m, !z);
        this.b.kk(Boolean.TRUE);
    }

    private final void q(aliz alizVar, String str) {
        iwt iwtVar = this.l;
        iwtVar.a(alizVar);
        adly adlyVar = this.q;
        if (adlyVar != null && jen.b(adlyVar, ajwd.COLLECTION_STYLE_ITEM_SIZE_MEDIUM) == ajwd.COLLECTION_STYLE_ITEM_SIZE_SMALL) {
            int dimensionPixelSize = this.h.getResources().getDimensionPixelSize(R.dimen.music_extra_small_icon_size);
            iwtVar.setLayoutParams(new RelativeLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        }
        iwtVar.setContentDescription(str);
        p(true);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.p.b();
        this.b.kk(Boolean.FALSE);
        this.q = null;
    }

    @Override // defpackage.jbb
    public final View d() {
        return this.a;
    }

    @Override // defpackage.jbb
    public final avlh e() {
        return this.b.P();
    }

    @Override // defpackage.jbb
    public final boolean f() {
        return Objects.equals(this.b.aD(), Boolean.TRUE);
    }

    public final void g() {
        tuk.l(this.a, false);
        tuk.l(this.l, false);
        tuk.l(this.m, false);
    }

    public final void h(Optional optional, Optional optional2, Optional optional3, Optional optional4, boolean z) {
        g();
        if (optional4.isEmpty()) {
            this.b.kk(Boolean.FALSE);
            return;
        }
        aamp aampVarD = this.k.d(optional, optional2, optional3);
        if (o() && e.contains(aampVarD)) {
            k(hpd.a(optional3));
            return;
        }
        if (this.c.contains(annn.MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_ERROR) && f.contains(aampVarD)) {
            this.m.f();
            p(false);
            return;
        }
        if (this.c.contains(annn.MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_WAITING) && g.contains(aampVarD)) {
            OfflineBadgeView offlineBadgeView = this.m;
            offlineBadgeView.c(R.drawable.ic_offline_07, offlineBadgeView.c);
            p(false);
            return;
        }
        if (this.c.contains(annn.MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_SYNC) && aampVarD == aamp.TRANSFER_PENDING_USER_APPROVAL) {
            this.m.g();
            p(false);
        } else if (m() && aampVarD == aamp.PLAYABLE && z) {
            j();
        } else if (n() && aampVarD == aamp.PLAYABLE) {
            l();
        } else {
            this.b.kk(Boolean.FALSE);
        }
    }

    @Override // defpackage.adma
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void hU(adly adlyVar, annl annlVar) {
        String str;
        this.q = adlyVar;
        String str2 = "";
        boolean z = true;
        if (!(annlVar.c == 2 ? (String) annlVar.d : "").isEmpty()) {
            if (!(annlVar.c == 1 ? (String) annlVar.d : "").isEmpty()) {
                throw new IllegalStateException("Download badge cannot have both playlist and video ID");
            }
        }
        if ((annlVar.c == 1 ? (String) annlVar.d : "").isEmpty()) {
            str = null;
        } else {
            str = annlVar.c == 1 ? (String) annlVar.d : "";
        }
        if ((annlVar.c == 2 ? (String) annlVar.d : "").isEmpty()) {
            str2 = null;
        } else if (annlVar.c == 2) {
            str2 = (String) annlVar.d;
        }
        if (Objects.equals(this.r, str) && Objects.equals(this.s, str2)) {
            z = false;
        }
        this.r = str;
        this.s = str2;
        if (z) {
            g();
        }
        this.c = agkz.n(new aihx(annlVar.e, annl.a));
        int iB = adlyVar.b("thumbnailOverlaySize", this.h.getResources().getDimensionPixelSize(R.dimen.music_icon_size));
        this.m.setLayoutParams(new RelativeLayout.LayoutParams(iB, iB));
        avmm avmmVar = this.p;
        avmmVar.b();
        String str3 = this.r;
        if (str3 == null) {
            String str4 = this.s;
            if (str4 != null) {
                hpy hpyVar = this.i;
                avmmVar.c(avlr.i(agke.r(gzj.ao(hpyVar, str4), gzj.ap(hpyVar, str4, this.o)), new hpr(17)).O(this.n).ag(new iwb(this, 13), new ido(20)));
                return;
            }
            return;
        }
        agjz agjzVar = new agjz(4);
        hpy hpyVar2 = this.i;
        agjzVar.h(hpyVar2.e(kro.aJ(str3)));
        agjzVar.h(hpyVar2.e(kro.av(str3)));
        agjzVar.h(hpyVar2.e(kro.aw(str3)));
        agjzVar.h(hpyVar2.e(kro.aI(str3)));
        if (m()) {
            agjzVar.h(hpyVar2.e(kro.aq()).K(new gnw(19)).r().X(new hpn(this.j, hpyVar2, 0)));
        }
        avmmVar.c(avlr.i(agjzVar.g(), new hpr(18)).O(this.n).ag(new gkr(this, str3, 16), new ido(20)));
    }

    public final void j() {
        q(aliz.MUSIC_AUTO_OFFLINE_BADGE, this.h.getString(R.string.state_auto_offlined));
    }

    public final void k(int i) {
        this.m.d(i);
        p(false);
    }

    public final void l() {
        q(aliz.OFFLINE_PIN, this.h.getString(R.string.state_offlined));
    }

    public final boolean m() {
        return this.c.contains(annn.MUSIC_ITEM_DOWNLOAD_STATE_AUTO_OFFLINE_COMPLETE);
    }

    public final boolean n() {
        return this.c.contains(annn.MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_COMPLETE);
    }

    public final boolean o() {
        return this.c.contains(annn.MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_IN_PROGRESS);
    }
}
