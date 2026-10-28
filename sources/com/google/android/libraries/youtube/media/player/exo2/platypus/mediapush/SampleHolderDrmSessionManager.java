package com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush;

import android.os.Looper;
import defpackage.aae;
import defpackage.axo;
import defpackage.bse;
import defpackage.cfd;
import defpackage.cju;
import defpackage.cjy;
import defpackage.cjz;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class SampleHolderDrmSessionManager implements cjz {
    public cjz a = cjz.m;
    public final Supplier b;
    private final axo c;

    public SampleHolderDrmSessionManager(Supplier supplier, axo axoVar) {
        this.b = supplier;
        this.c = axoVar;
    }

    @Override // defpackage.cjz
    public final int a(bse bseVar) {
        return this.a.a(bseVar);
    }

    @Override // defpackage.cjz
    public final void e(Looper looper, cfd cfdVar) {
        this.a.e(looper, cfdVar);
    }

    @Override // defpackage.cjz
    public final cju f(aae aaeVar, bse bseVar) {
        if (bseVar.u != null && this.a.equals(cjz.m)) {
            Utils.QoeErrorBuilder qoeErrorBuilder = new Utils.QoeErrorBuilder("player.exception");
            qoeErrorBuilder.b("c", "DrmSessionFetchUsingPlaceholder");
            qoeErrorBuilder.a(this.c);
        }
        return this.a.f(aaeVar, bseVar);
    }

    @Override // defpackage.cjz
    public final cjy h(aae aaeVar, bse bseVar) {
        return this.a.h(aaeVar, bseVar);
    }

    @Override // defpackage.cjz
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.cjz
    public final /* synthetic */ void d() {
    }
}
