package defpackage;

import android.view.View;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class jmz extends xrw {
    final /* synthetic */ dii a;
    final /* synthetic */ jnc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmz(jnc jncVar, dii diiVar, xre xreVar, Boolean bool, dov dovVar, xrd xrdVar, tbt tbtVar, dii diiVar2) {
        super(diiVar, xreVar, bool, dovVar, xrdVar, tbtVar);
        this.a = diiVar2;
        this.b = jncVar;
    }

    @Override // defpackage.xrw
    public final void a() {
        jnc jncVar = this.b;
        ycp ycpVar = (ycp) jncVar.c.io();
        Optional optionalA = jncVar.a();
        if (ycpVar != null && jncVar.f() && optionalA.isPresent() && xrx.d(this.a, (dii) optionalA.get())) {
            ycpVar.f(amyv.MDX_SESSION_SOURCE_STC);
            ((xru) jncVar.b.io()).a((dii) optionalA.get());
            jncVar.b();
            jncVar.d();
            ((ydu) jncVar.d.io()).h(2);
            return;
        }
        if (ycpVar == null) {
            ((agrc) ((agrc) ((agrc) jnc.a.b().i(agso.a, "PlayerOverlayChip")).l(agsi.MEDIUM)).k("com/google/android/apps/youtube/music/watch/PlayerOverlayChipPresenter$1", "execute", 464, "PlayerOverlayChipPresenter.java")).t("Didn't select route after chip was clicked because store is null");
        }
        if (!jncVar.f()) {
            ((agrc) ((agrc) ((agrc) jnc.a.b().i(agso.a, "PlayerOverlayChip")).l(agsi.MEDIUM)).k("com/google/android/apps/youtube/music/watch/PlayerOverlayChipPresenter$1", "execute", 468, "PlayerOverlayChipPresenter.java")).t("Didn't select route after chip was clicked because a session is connected");
        }
        if (optionalA.isEmpty()) {
            ((agrc) ((agrc) ((agrc) jnc.a.b().i(agso.a, "PlayerOverlayChip")).l(agsi.MEDIUM)).k("com/google/android/apps/youtube/music/watch/PlayerOverlayChipPresenter$1", "execute", 472, "PlayerOverlayChipPresenter.java")).t("Didn't select route after chip was clicked because there is no target route");
        } else if (!xrx.d(this.a, (dii) optionalA.get())) {
            ((agrc) ((agrc) ((agrc) jnc.a.b().i(agso.a, "PlayerOverlayChip")).l(agsi.MEDIUM)).k("com/google/android/apps/youtube/music/watch/PlayerOverlayChipPresenter$1", "execute", 475, "PlayerOverlayChipPresenter.java")).t("Didn't select route after chip was clicked because the routes are not equal");
        }
        jncVar.e();
    }

    @Override // defpackage.xrw, android.view.View.OnClickListener
    public final void onClick(View view) {
        jnc jncVar = this.b;
        jncVar.c(this.a, jncVar.n);
        super.onClick(view);
    }
}
