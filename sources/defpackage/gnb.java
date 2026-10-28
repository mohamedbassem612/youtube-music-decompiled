package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class gnb implements adxu {
    final /* synthetic */ boolean a;
    final /* synthetic */ gnf b;

    public gnb(gnf gnfVar, boolean z) {
        this.a = z;
        this.b = gnfVar;
    }

    @Override // defpackage.adxu
    public final void a() {
        if (this.a) {
            gnf gnfVar = this.b;
            if (gnfVar.E) {
                gnfVar.F = true;
            } else {
                if (gnfVar.F) {
                    return;
                }
                gnfVar.m.c(new gnc(gnfVar, 1), 750L, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // defpackage.adxu
    public final void b(atxp atxpVar) {
        ((agrc) ((agrc) ((agrc) gnf.a.b()).j(new RuntimeException(atxpVar.c))).k("com/google/android/apps/youtube/music/browse/BrowseFragment$1", "onError", 798, "BrowseFragment.java")).y("BrowseFragment section list mutation operations error. Code: %s, %s", atxpVar.b, atxpVar.c);
    }
}
