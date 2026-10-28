package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gtl implements zza {
    final /* synthetic */ Object a;
    final /* synthetic */ akkw b;
    final /* synthetic */ boolean c;
    final /* synthetic */ gtm d;

    public gtl(gtm gtmVar, Object obj, akkw akkwVar, boolean z) {
        this.a = obj;
        this.b = akkwVar;
        this.c = z;
        this.d = gtmVar;
    }

    @Override // defpackage.tnh
    public final /* synthetic */ void a(Object obj) {
        akkw akkwVar = this.b;
        gsd gsdVar = new gsd(Optional.ofNullable(this.a), akkwVar.d);
        gtm gtmVar = this.d;
        gtmVar.d.c(gsdVar);
        if (gtm.e(akkwVar)) {
            return;
        }
        if (this.c) {
            jin jinVar = gtmVar.f;
            Context context = gtmVar.b;
            jio jioVarE = jin.e();
            ((jik) jioVarE).k(context.getText(R.string.playlist_deleted_msg));
            jinVar.d(jioVarE.b());
        }
        gtmVar.g.l(true);
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        ((agrc) ((agrc) ((agrc) gtm.a.c().i(agso.a, "DeletePlaylistCommand")).j(toeVar)).k("com/google/android/apps/youtube/music/command/DeletePlaylistCommandResolver$2", "onErrorResponse", (char) 195, "DeletePlaylistCommandResolver.java")).t("Failed to delete playlist.");
        gtm gtmVar = this.d;
        ttm ttmVar = gtmVar.c;
        jio jioVarE = jin.e();
        ((jik) jioVarE).k(ttmVar.b(toeVar));
        gtmVar.f.d(jioVarE.b());
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
