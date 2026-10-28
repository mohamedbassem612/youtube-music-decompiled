package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rpa {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/account/offline/OfflineAccountSwitcherStoreImpl");
    public final Context b;
    public final Executor c;
    public final Executor d;
    public final rmd e;
    public final aerv f;
    public final afho g;
    public final syn h;

    public rpa(Context context, Executor executor, Executor executor2, rmd rmdVar, syn synVar, aerv aervVar, afho afhoVar) {
        this.b = context;
        this.c = executor;
        this.d = executor2;
        this.e = rmdVar;
        this.h = synVar;
        this.f = aervVar;
        this.g = afhoVar;
    }

    public final rou a(affd affdVar) {
        affdVar.getClass();
        return ((roz) aguu.aw(this.b, roz.class, affdVar)).k();
    }
}
