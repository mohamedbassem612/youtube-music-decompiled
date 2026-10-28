package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.media.player.exo2.platypus.AsyncMediaFetchControllerWrapper;
import com.google.android.libraries.youtube.media.player.exo2.platypus.DefaultMediaFetchControllerWrapper;
import com.google.android.libraries.youtube.media.player.exo2.platypus.MetadataStoreImpl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yys extends twv {
    final /* synthetic */ zjr a;
    final /* synthetic */ yyv b;
    final /* synthetic */ yza c;
    final /* synthetic */ MetadataStoreImpl d;
    final /* synthetic */ String e;
    final /* synthetic */ zdt f;
    final /* synthetic */ tgr g;
    final /* synthetic */ abxv h;

    public yys(zjr zjrVar, zdt zdtVar, yyv yyvVar, yza yzaVar, tgr tgrVar, abxv abxvVar, MetadataStoreImpl metadataStoreImpl, String str) {
        this.a = zjrVar;
        this.f = zdtVar;
        this.b = yyvVar;
        this.c = yzaVar;
        this.g = tgrVar;
        this.h = abxvVar;
        this.d = metadataStoreImpl;
        this.e = str;
    }

    @Override // defpackage.twv
    protected final /* bridge */ /* synthetic */ Object b() {
        ytp defaultMediaFetchControllerWrapper;
        if (this.a.bz()) {
            zdt zdtVar = this.f;
            zdtVar.a.v.c(this.b);
            return zdtVar;
        }
        yza yzaVar = this.c;
        yyv yyvVar = this.b;
        tgr tgrVar = this.g;
        abxv abxvVar = this.h;
        MetadataStoreImpl metadataStoreImpl = this.d;
        String str = this.e;
        yye yyeVar = yyvVar.h;
        zjr zjrVar = yyeVar.d;
        if (zjrVar.dK()) {
            Handler handler = yyvVar.k;
            xeu xeuVar = yzaVar.j;
            zeh zehVar = yyvVar.j;
            defaultMediaFetchControllerWrapper = new AsyncMediaFetchControllerWrapper(yyvVar, handler, xeuVar, zehVar, yzaVar.g, yzaVar.a, yzaVar.b, yzaVar.c, yyvVar.T, yyeVar.f, zjrVar, yyvVar.D, yzaVar.f, yyvVar.M, yzaVar.h, abxvVar, tgrVar, metadataStoreImpl, yzaVar.p, str, yzaVar.n);
            defaultMediaFetchControllerWrapper.g(zehVar);
        } else {
            Handler handler2 = yyvVar.k;
            xeu xeuVar2 = yzaVar.j;
            zeh zehVar2 = yyvVar.j;
            defaultMediaFetchControllerWrapper = new DefaultMediaFetchControllerWrapper(yyvVar, handler2, xeuVar2, zehVar2, yzaVar.g, yzaVar.a, yzaVar.b, yzaVar.c, yyvVar.T, yyeVar.f, zjrVar, yyvVar.D, yzaVar.f, yyvVar.M, yzaVar.h, abxvVar, tgrVar, metadataStoreImpl, yzaVar.p, str, yzaVar.n);
            defaultMediaFetchControllerWrapper.g(zehVar2);
        }
        return defaultMediaFetchControllerWrapper;
    }
}
