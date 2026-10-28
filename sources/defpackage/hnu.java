package defpackage;

import j$.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class hnu implements aheh {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ aofu c;
    final /* synthetic */ aaqn d;
    final /* synthetic */ hnz e;

    public hnu(hnz hnzVar, String str, int i, aofu aofuVar, aaqn aaqnVar) {
        this.a = str;
        this.b = i;
        this.c = aofuVar;
        this.d = aaqnVar;
        this.e = hnzVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        ((agrc) ((agrc) ((agrc) hnz.a.b().i(agso.a, "DefaultMusicAutoOffline")).j(th)).k("com/google/android/apps/youtube/music/offline/autooffline/DefaultMusicAutoOfflineController$3", "onFailure", (char) 608, "DefaultMusicAutoOfflineController.java")).t("Failure to get track entity keys for playlist.");
    }

    @Override // defpackage.aheh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = this.a;
        int i = this.b;
        hnz hnzVar = this.e;
        hnzVar.a(hna.e(str, i, hnzVar.k.intValue(), this.c), (agke) Collection.EL.stream((agke) obj).map(new hnv(1)).collect(aghu.a), this.d);
    }
}
