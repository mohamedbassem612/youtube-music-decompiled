package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acub implements aheh {
    final /* synthetic */ boolean a;
    final /* synthetic */ ajwo b;
    final /* synthetic */ boolean c;
    final /* synthetic */ acuc d;

    public acub(acuc acucVar, boolean z, ajwo ajwoVar, boolean z2) {
        this.a = z;
        this.b = ajwoVar;
        this.c = z2;
        this.d = acucVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        ((agrc) ((agrc) ((agrc) acuc.a.b()).j(th)).k("com/google/android/libraries/youtube/reel/internal/player/ReelPlaybackRequester$3", "onFailure", (char) 643, "ReelPlaybackRequester.java")).w("Failed to fetch ReelItemWatchResponse from Streaming Watch. isPrefetch=%s", Boolean.valueOf(this.c));
    }

    @Override // defpackage.aheh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        acrx acrxVar = (acrx) obj;
        acuc acucVar = this.d;
        if (acucVar.g.bg() && !this.a && !acrxVar.a) {
            acucVar.b.f(this.b, (alqc) acrxVar.b, 0L);
        }
        actv actvVar = acucVar.d;
        ajwo ajwoVar = this.b;
        Object obj2 = acrxVar.b;
        boolean z = true;
        if (!this.a && !acrxVar.a) {
            z = false;
        }
        actvVar.A(ajwoVar, (alqc) obj2, z);
    }
}
