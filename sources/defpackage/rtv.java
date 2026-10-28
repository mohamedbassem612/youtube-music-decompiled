package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rtv implements rsu {
    final /* synthetic */ String a;
    final /* synthetic */ abzo b;

    public rtv(abzo abzoVar, String str) {
        this.a = str;
        this.b = abzoVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.rsu
    public final void c() {
        abzo abzoVar = this.b;
        ?? r1 = abzoVar.c;
        String str = this.a;
        rtz rtzVar = (rtz) r1.get(abzo.l(str));
        if (rtzVar != null) {
            rtzVar.h = null;
        }
        abzoVar.x(str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.rsu
    public final void s() {
        abzo abzoVar = this.b;
        ?? r1 = abzoVar.c;
        String str = this.a;
        rtz rtzVar = (rtz) r1.get(abzo.l(str));
        if (rtzVar != null) {
            rtzVar.h = null;
        }
        rmp.n(null, "CisaShimLegacyGaplessFlow: Error during fallback interstitial playback.");
        abzoVar.x(str);
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void Q() {
    }

    @Override // defpackage.rsu
    public final /* synthetic */ void R() {
    }
}
