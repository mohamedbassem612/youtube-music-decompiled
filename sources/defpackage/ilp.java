package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ilp {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/radiostar/RadioStarCommentaryControllerImpl");
    public final Context b;
    public final icj c;
    public final ico d;
    public final aunn e;
    public final aunn f;
    public final aunn g;
    public final aunn h;
    public final aunn i;
    public final Executor j;
    public final aunn k;
    public ListenableFuture l;

    public ilp(Context context, icj icjVar, aunn aunnVar, aunn aunnVar2, ico icoVar, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, Executor executor) {
        this.b = context;
        this.c = icjVar;
        this.e = aunnVar;
        this.f = aunnVar2;
        this.d = icoVar;
        this.g = aunnVar3;
        this.h = aunnVar4;
        this.i = aunnVar5;
        this.j = executor;
        this.k = aunnVar6;
    }

    public final afxd a(zwa zwaVar) {
        afxd afxdVarF = afxd.f(tzk.e(((wco) this.g.io()).b(zwaVar).g(kro.aA()).g(apcq.class).v((avmb) this.k.io())));
        iii iiiVar = new iii(this, 3);
        Executor executor = this.j;
        return afxdVarF.g(iiiVar, executor).b(Throwable.class, new iam(15), executor);
    }
}
