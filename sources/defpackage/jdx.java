package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jdx implements adma, jbb {
    public final Context a;
    public final ViewGroup b;
    public final RelativeLayout c;
    public final awku d;
    public View e;
    public View f;
    public adly g;
    public anpz h;
    private final admh i;
    private final jgf j;
    private final avmm k;
    private final Set l = new afx(0);

    public jdx(Context context, admh admhVar) {
        this.a = context;
        this.i = admhVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.music_item_thumbnail_overlay, (ViewGroup) null);
        this.b = viewGroup;
        this.c = (RelativeLayout) viewGroup.findViewById(R.id.overlay);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.music_item_thumbnail_overlay_default_size);
        this.j = new jgf(dimensionPixelSize, dimensionPixelSize);
        this.d = awku.aC(Boolean.FALSE);
        this.k = new avmm();
    }

    private final void j(boolean z) {
        View childAt = this.c.getChildAt(0);
        if (childAt != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) childAt.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (z) {
                layoutParams2.width = -1;
                layoutParams2.height = -1;
            } else {
                int iAS = a.aS(this.h.e);
                if (iAS != 0 && iAS == 2) {
                    layoutParams2.addRule(13, -1);
                }
            }
            childAt.setLayoutParams(layoutParams2);
        }
    }

    @Override // defpackage.adma
    public final View a() {
        return this.b;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        Set set = this.l;
        afw afwVar = new afw((afx) set);
        while (afwVar.hasNext()) {
            ((adma) afwVar.next()).b(admhVar);
        }
        set.clear();
        this.k.b();
        RelativeLayout relativeLayout = this.c;
        kro.X(relativeLayout, admhVar);
        relativeLayout.setBackground(null);
        View view = this.e;
        if (view != null) {
            view.setBackground(null);
            this.e = null;
        }
        View view2 = this.f;
        if (view2 != null) {
            view2.setVisibility(0);
            View view3 = this.f;
            Boolean bool = Boolean.FALSE;
            view3.setTag(R.id.music_play_button, bool);
            this.f.setTag(R.id.offline_badge_over_thumbnail, bool);
            this.f = null;
        }
        this.g = null;
        this.h = null;
        this.d.kk(Boolean.FALSE);
    }

    @Override // defpackage.jbb
    public final View d() {
        return this.b;
    }

    @Override // defpackage.jbb
    public final avlh e() {
        return this.d.P();
    }

    @Override // defpackage.jbb
    public final boolean f() {
        awku awkuVar = this.d;
        return awkuVar.aG() && ((Boolean) awkuVar.aD()).booleanValue();
    }

    @Override // defpackage.adma
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void hU(adly adlyVar, anpz anpzVar) {
        int iAS;
        anld anldVar;
        apji apjiVar;
        apji apjiVar2;
        this.g = adlyVar;
        this.h = anpzVar;
        int iAS2 = a.aS(anpzVar.f);
        if (iAS2 == 0 || iAS2 != 2 || (iAS = a.aS(anpzVar.e)) == 0 || iAS != 2) {
            this.b.setVisibility(8);
            return;
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup.getLayoutParams() == null) {
            viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            viewGroup.getLayoutParams().height = -1;
            viewGroup.getLayoutParams().width = -1;
        }
        jgf jgfVar = this.j;
        Object objC = adlyVar.c("presenterSizeConstraint");
        if (objC instanceof jgf) {
            jgfVar = (jgf) objC;
        }
        RelativeLayout relativeLayout = this.c;
        jgfVar.b(relativeLayout);
        ((FrameLayout.LayoutParams) relativeLayout.getLayoutParams()).gravity = 16;
        apji apjiVar3 = null;
        if ((anpzVar.b & 1) != 0) {
            anldVar = anpzVar.c;
            if (anldVar == null) {
                anldVar = anld.a;
            }
        } else {
            anldVar = null;
        }
        ixt.i(adlyVar, relativeLayout, anldVar, false);
        relativeLayout.setVisibility(8);
        anpz anpzVar2 = this.h;
        if ((anpzVar2.b & 2) != 0) {
            apjiVar = anpzVar2.d;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
        } else {
            apjiVar = null;
        }
        Optional optionalH = kro.H(apjiVar, antr.a);
        anpz anpzVar3 = this.h;
        if ((anpzVar3.b & 2) != 0) {
            apjiVar2 = anpzVar3.d;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
        } else {
            apjiVar2 = null;
        }
        Optional optionalH2 = kro.H(apjiVar2, anpp.a);
        anpz anpzVar4 = this.h;
        if ((anpzVar4.b & 2) != 0 && (apjiVar3 = anpzVar4.d) == null) {
            apjiVar3 = apji.a;
        }
        Optional optionalH3 = kro.H(apjiVar3, annm.a);
        if (optionalH.isPresent()) {
            antp antpVar = (antp) optionalH.get();
            admh admhVar = this.i;
            jej jejVar = (jej) adul.e(admhVar, antpVar, relativeLayout);
            if (jejVar != null) {
                this.l.add(jejVar);
                relativeLayout.setVisibility(0);
                jejVar.hU(adlyVar, antpVar);
                View view = jejVar.a;
                view.setClickable(false);
                relativeLayout.addView(view);
                adul.j(view, jejVar, admhVar.a(antpVar));
                this.d.kk(Boolean.TRUE);
                avmm avmmVar = this.k;
                avmmVar.c(jejVar.c.P().p().i(new abwr(1)).al(new gkr(this, antpVar, 17), new jeh(1)));
                avmmVar.c(jejVar.d.P().p().i(new abwr(1)).al(new iwb(this, 15), new jeh(1)));
            }
            j(((antp) optionalH.get()).j);
            return;
        }
        if (optionalH2.isPresent()) {
            if (kro.P((anpo) optionalH2.get(), relativeLayout, this.i, adlyVar) != null) {
                relativeLayout.setVisibility(0);
                this.d.kk(Boolean.TRUE);
            }
            j(false);
            return;
        }
        if (optionalH3.isPresent()) {
            annl annlVar = (annl) optionalH3.get();
            admh admhVar2 = this.i;
            jdf jdfVar = (jdf) adul.e(admhVar2, annlVar, relativeLayout);
            if (jdfVar != null) {
                this.l.add(jdfVar);
                RelativeLayout relativeLayout2 = jdfVar.a;
                relativeLayout2.setTag(R.id.view_visibility, Integer.valueOf(relativeLayout2.getVisibility()));
                this.k.c(jdfVar.e().p().i(new abwr(1)).al(new iwb(this, 14), new jeh(1)));
                jdfVar.hU(adlyVar, annlVar);
                relativeLayout.addView(relativeLayout2);
                adul.j(relativeLayout2, jdfVar, admhVar2.a(annlVar));
            }
            j(false);
        }
    }

    final void h(View view) {
        this.f = view;
        Boolean bool = Boolean.FALSE;
        view.setTag(R.id.music_play_button, bool);
        view.setTag(R.id.offline_badge_over_thumbnail, bool);
    }

    public final boolean i() {
        return (this.f.getTag(R.id.always_hide_thumbnail_tag) instanceof Boolean) && ((Boolean) this.f.getTag(R.id.always_hide_thumbnail_tag)).booleanValue();
    }
}
