package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class itu {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/sideloaded/service/SideloadedPlaylistService");
    public final Context b;
    public final iup c;
    public final Executor d;
    public final hef e;
    public final hfn f;
    public final hfn g;

    public itu(Context context, iup iupVar, hfn hfnVar, hef hefVar, Executor executor, hfn hfnVar2) {
        this.b = context;
        this.c = iupVar;
        this.g = hfnVar;
        this.e = hefVar;
        this.d = executor;
        this.f = hfnVar2;
    }

    public final ListenableFuture a(String str, String str2) {
        int iMatch = ish.q.match(Uri.parse(str));
        if (iMatch == 1) {
            return this.c.e(Uri.parse(str2), Uri.parse(str));
        }
        if (iMatch == 2) {
            return this.c.c(Uri.parse(str2), Uri.parse(str));
        }
        if (iMatch == 3 || iMatch == 6) {
            return this.c.d(Uri.parse(str2), Uri.parse(str));
        }
        ((agrc) ((agrc) a.b()).k("com/google/android/apps/youtube/music/sideloaded/service/SideloadedPlaylistService", "handleAddContentAction", 396, "SideloadedPlaylistService.java")).w("The content URI is not supported: %s", str);
        return ahng.m(new IllegalArgumentException());
    }

    public final ajwo b(String str, String str2) {
        return fhz.Q(str, this.b.getString(R.string.action_view), vxh.a(str2));
    }

    public final void c(String str, List list, sxu sxuVar) {
        ListenableFuture listenableFutureM;
        int iAU;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apyx apyxVar = (apyx) it.next();
            int i = apyxVar.b;
            if (i == 1) {
                this.f.ae(6);
                arrayList.add(a((apyxVar.b == 1 ? (apyv) apyxVar.c : apyv.a).c, str));
            } else if (i == 2) {
                this.f.ae(7);
                arrayList.add(this.c.D(Uri.parse(str), Uri.parse((apyxVar.b == 2 ? (apyz) apyxVar.c : apyz.a).c)));
            } else {
                Uri uri = null;
                if (i == 3) {
                    this.f.ae(8);
                    apyy apyyVar = apyxVar.b == 3 ? (apyy) apyxVar.c : apyy.a;
                    int i2 = apyyVar.b;
                    if ((i2 & 1) == 0 || (iAU = a.aU(apyyVar.c)) == 0 || iAU != 2) {
                        agrc agrcVar = (agrc) ((agrc) a.b()).k("com/google/android/apps/youtube/music/sideloaded/service/SideloadedPlaylistService", "handleMoveMemberAction", 419, "SideloadedPlaylistService.java");
                        int iAU2 = a.aU(apyyVar.c);
                        if (iAU2 == 0) {
                            iAU2 = 1;
                        }
                        agrcVar.u("The move type is not supported: %d", iAU2 - 1);
                        int iAU3 = a.aU(apyyVar.c);
                        int i3 = iAU3 != 0 ? iAU3 : 1;
                        StringBuilder sb = new StringBuilder("The move type is not supported: ");
                        sb.append(i3 - 1);
                        listenableFutureM = ahng.m(new IllegalArgumentException(sb.toString()));
                    } else {
                        if ((i2 & 4) != 0 && !apyyVar.e.isEmpty()) {
                            uri = Uri.parse(apyyVar.e);
                        }
                        listenableFutureM = this.c.C(Uri.parse(str), Uri.parse(apyyVar.d), uri);
                    }
                    arrayList.add(listenableFutureM);
                } else if (i != 4) {
                    ((agrc) ((agrc) a.b()).k("com/google/android/apps/youtube/music/sideloaded/service/SideloadedPlaylistService", "requestHandleEditActions", 286, "SideloadedPlaylistService.java")).w("The sideloaded edit action is not supported: %s", apyw.a(apyxVar.b));
                    sxuVar.iT(null, new toe("The sideloaded edit action is not supported: ".concat(String.valueOf(String.valueOf(apyw.a(apyxVar.b))))));
                    return;
                } else {
                    this.f.ae(4);
                    arrayList.add(this.c.F(Uri.parse(str), (apyxVar.b == 4 ? (apza) apyxVar.c : apza.a).c));
                }
            }
        }
        ahud ahudVarAu = ahno.au(arrayList);
        huo huoVar = new huo(arrayList, 10);
        Executor executor = this.d;
        taf.j(ahno.as(ahudVarAu.k(huoVar, executor), new iaj(this, str, list, sxuVar, 2), executor), new gou(this, sxuVar, 14));
    }
}
