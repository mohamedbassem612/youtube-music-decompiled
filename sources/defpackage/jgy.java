package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.offline.views.OfflineBadgeView;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jgy extends jca {
    public static final agrf c = agrf.h("com/google/android/apps/youtube/music/ui/presenter/VideoOfflineBadgePresenter");
    public final hpd d;
    private final cf e;
    private final OfflineBadgeView f;
    private final View g;
    private final View h;
    private aoia i;

    public jgy(cf cfVar, hpy hpyVar, hpd hpdVar, avmb avmbVar, OfflineBadgeView offlineBadgeView, View view, View view2) {
        super(hpyVar, avmbVar);
        this.f = offlineBadgeView;
        this.e = cfVar;
        this.g = view;
        this.d = hpdVar;
        this.h = view2;
        if (offlineBadgeView != null) {
            offlineBadgeView.setOnClickListener(null);
            offlineBadgeView.setClickable(false);
            offlineBadgeView.setFocusable(false);
            offlineBadgeView.setEnabled(false);
        }
    }

    private final void h(boolean z) {
        View view;
        boolean z2;
        if (this.i == null) {
            f();
            return;
        }
        OfflineBadgeView offlineBadgeView = this.f;
        boolean z3 = false;
        if (offlineBadgeView != null) {
            if (z) {
                view = this.g;
                z2 = true;
            } else {
                view = offlineBadgeView;
                z2 = false;
            }
            View view2 = z2 ? offlineBadgeView : this.g;
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
            }
            if (offlineBadgeView != this.g && view2.getVisibility() != 8) {
                view2.setVisibility(8);
            }
            z3 = z2;
        } else {
            View view3 = this.g;
            if (z) {
                view3.setVisibility(0);
                z3 = true;
            } else {
                view3.setVisibility(8);
            }
        }
        View view4 = this.h;
        if (view4 != null) {
            view4.setAlpha(true != z3 ? 0.5f : 1.0f);
        }
    }

    @Override // defpackage.jca, defpackage.adma
    public final void b(admh admhVar) {
        super.b(admhVar);
        this.i = null;
    }

    @Override // defpackage.jca
    public final Optional d(Object obj) {
        return obj == null ? Optional.empty() : Optional.ofNullable(fhz.ag(obj));
    }

    @Override // defpackage.jca
    public final void e(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5) {
        if (optional.isEmpty() || this.b == null) {
            f();
            return;
        }
        if (!((annv) optional.get()).h().contains(kro.aH(this.b)) && !((annv) optional.get()).f().contains(kro.aH(this.b))) {
            f();
            return;
        }
        hpd hpdVar = this.d;
        aamp aampVarD = hpdVar.d(optional3, optional4, optional5);
        if (this.f == null) {
            if (aampVarD.ordinal() != 1) {
                h(false);
                return;
            }
            View view = this.g;
            view.setContentDescription(view.getContext().getString(R.string.state_offlined));
            h(true);
            return;
        }
        if (hpdVar.r(optional3, optional4, optional5)) {
            taf.k(this.e, hpdVar.g(this.b), new jco(4), new iny(this, 13));
            return;
        }
        htg htgVar = new htg();
        htgVar.d(optional3);
        htgVar.b(optional4);
        htgVar.c(optional5);
        g(aampVarD, hpdVar.n(htgVar.a()), hpd.a(optional5));
    }

    @Override // defpackage.jca
    public final void f() {
        OfflineBadgeView offlineBadgeView = this.f;
        if (offlineBadgeView != null) {
            offlineBadgeView.e();
            tuk.l(offlineBadgeView, false);
        }
        View view = this.g;
        if (offlineBadgeView != view) {
            view.setVisibility(8);
        }
        View view2 = this.h;
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
    }

    public final void g(aamp aampVar, String str, int i) {
        OfflineBadgeView offlineBadgeView = this.f;
        if (offlineBadgeView != null) {
            offlineBadgeView.setContentDescription(str);
            if (aampVar.w) {
                offlineBadgeView.f();
                h(false);
                return;
            }
            int iOrdinal = aampVar.ordinal();
            if (iOrdinal == 1) {
                offlineBadgeView.c(offlineBadgeView.b, offlineBadgeView.d);
                View view = this.g;
                view.setContentDescription(view.getContext().getString(R.string.state_offlined));
                h(true);
                return;
            }
            if (iOrdinal != 9) {
                if (iOrdinal == 5) {
                    offlineBadgeView.g();
                    h(false);
                    return;
                } else if (iOrdinal != 6 && iOrdinal != 7) {
                    offlineBadgeView.d(i);
                    h(false);
                    return;
                }
            }
            offlineBadgeView.e();
            h(false);
        }
    }

    @Override // defpackage.jca, defpackage.adma
    public final void hU(adly adlyVar, Object obj) {
        super.hU(adlyVar, obj);
        this.i = obj != null ? fhz.Y(obj) : null;
    }
}
