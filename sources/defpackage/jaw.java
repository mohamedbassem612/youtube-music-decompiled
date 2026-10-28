package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.rendering.ui.ScrollToTopLinearLayoutManager;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jaw {
    public final adxd a;
    public final RecyclerView b;
    public final np c;
    public final advn d;
    public final advn e;
    public final aecs f;
    public final wnf g;
    public final advd h;
    public final admk i;
    public final xgn j;
    public final adtq k;
    public final adww l;
    public final ViewGroup m;
    public final jau n;
    public final adwj o;
    public final ExtendedFloatingActionButton p;
    public final vwt q;
    private final aeod r;

    /* JADX WARN: Type inference failed for: r10v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [awmd, java.lang.Object] */
    public /* synthetic */ jaw(adxd adxdVar, RecyclerView recyclerView, np npVar, advn advnVar, advn advnVar2, aeod aeodVar, vwt vwtVar, wnf wnfVar, advd advdVar, admk admkVar, xgn xgnVar, adtq adtqVar, adww adwwVar, ViewGroup viewGroup, jau jauVar, adwj adwjVar, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        aecy aecyVar;
        np scrollToTopLinearLayoutManager = (i & 4) != 0 ? new ScrollToTopLinearLayoutManager(recyclerView.getContext()) : npVar;
        adxd adxdVar2 = 1 == (i & 1) ? null : adxdVar;
        advn advnVar3 = (i & 8) != 0 ? null : advnVar;
        advn advnVar4 = (i & 16) != 0 ? null : advnVar2;
        if ((i & SemanticState.Focused) != 0) {
            Optional optionalOfNullable = Optional.ofNullable(adxdVar2);
            abxv abxvVar = (abxv) aeodVar.a.io();
            abxvVar.getClass();
            ?? r10 = aeodVar.b;
            Optional optional = (Optional) aeodVar.c.io();
            optional.getClass();
            vwtVar.getClass();
            recyclerView.getClass();
            aecyVar = new aecy(abxvVar, r10, optional, vwtVar, recyclerView, optionalOfNullable);
        } else {
            aecyVar = null;
        }
        wnf wnfVar2 = (i & SemanticState.Hidden) != 0 ? wnf.q : wnfVar;
        adtq adtqVar2 = (i & SemanticState.Obscured) != 0 ? null : adtqVar;
        adww adwwVar2 = (i & SemanticState.Multiline) != 0 ? adww.yS : adwwVar;
        ViewGroup viewGroup2 = (i & 16384) != 0 ? null : viewGroup;
        jau jauVar2 = (32768 & i) != 0 ? null : jauVar;
        adwj adwjVar2 = (65536 & i) != 0 ? adwj.c : adwjVar;
        ExtendedFloatingActionButton extendedFloatingActionButton2 = (i & 131072) == 0 ? extendedFloatingActionButton : null;
        recyclerView.getClass();
        scrollToTopLinearLayoutManager.getClass();
        aeodVar.getClass();
        vwtVar.getClass();
        aecyVar.getClass();
        wnfVar2.getClass();
        advdVar.getClass();
        admkVar.getClass();
        xgnVar.getClass();
        adwwVar2.getClass();
        adwjVar2.getClass();
        this.a = adxdVar2;
        this.b = recyclerView;
        this.c = scrollToTopLinearLayoutManager;
        this.d = advnVar3;
        this.e = advnVar4;
        this.r = aeodVar;
        this.q = vwtVar;
        this.f = aecyVar;
        this.g = wnfVar2;
        this.h = advdVar;
        this.i = admkVar;
        this.j = xgnVar;
        this.k = adtqVar2;
        this.l = adwwVar2;
        this.m = viewGroup2;
        this.n = jauVar2;
        this.o = adwjVar2;
        this.p = extendedFloatingActionButton2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jaw) {
            jaw jawVar = (jaw) obj;
            if (awrc.c(this.a, jawVar.a) && awrc.c(this.b, jawVar.b) && awrc.c(this.c, jawVar.c) && awrc.c(this.d, jawVar.d) && awrc.c(this.e, jawVar.e) && awrc.c(this.r, jawVar.r) && awrc.c(this.q, jawVar.q) && awrc.c(this.f, jawVar.f) && awrc.c(this.g, jawVar.g) && awrc.c(this.h, jawVar.h) && awrc.c(this.i, jawVar.i) && awrc.c(this.j, jawVar.j) && awrc.c(this.k, jawVar.k) && awrc.c(this.l, jawVar.l) && awrc.c(this.m, jawVar.m) && awrc.c(this.n, jawVar.n) && awrc.c(this.o, jawVar.o) && awrc.c(this.p, jawVar.p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        adxd adxdVar = this.a;
        int iHashCode = ((((adxdVar == null ? 0 : adxdVar.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        advn advnVar = this.d;
        int iHashCode2 = ((iHashCode * 31) + (advnVar == null ? 0 : advnVar.hashCode())) * 31;
        advn advnVar2 = this.e;
        int iHashCode3 = (((((((((((((((iHashCode2 + (advnVar2 == null ? 0 : advnVar2.hashCode())) * 31) + this.r.hashCode()) * 31) + this.q.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31;
        adtq adtqVar = this.k;
        int iHashCode4 = (((iHashCode3 + (adtqVar == null ? 0 : adtqVar.hashCode())) * 31) + this.l.hashCode()) * 31;
        ViewGroup viewGroup = this.m;
        int iHashCode5 = (iHashCode4 + (viewGroup == null ? 0 : viewGroup.hashCode())) * 31;
        jau jauVar = this.n;
        int iHashCode6 = (((iHashCode5 + (jauVar == null ? 0 : jauVar.hashCode())) * 31) + this.o.hashCode()) * 31;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.p;
        return iHashCode6 + (extendedFloatingActionButton != null ? extendedFloatingActionButton.hashCode() : 0);
    }

    public final String toString() {
        return "MusicRecyclerViewSectionListControllerConfig(transientState=" + this.a + ", view=" + this.b + ", layoutManager=" + this.c + ", loadingStatusAdapter=" + this.d + ", previousLoadingStatusAdapter=" + this.e + ", sectionListLayoutControllerFactory=" + this.r + ", rxLifecycle=" + this.q + ", responsiveFeed=" + this.f + ", service=" + this.g + ", uiControllerFactory=" + this.h + ", viewPool=" + this.i + ", interactionLogger=" + this.j + ", continuationScreenLogger=" + this.k + ", sectionListRefresher=" + this.l + ", headerView=" + this.m + ", toolbarHeaderAttachedListener=" + this.n + ", refreshUiController=" + this.o + ", floatingActionButton=" + this.p + ')';
    }
}
