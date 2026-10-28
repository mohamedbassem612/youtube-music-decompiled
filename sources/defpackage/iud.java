package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.libraries.blocks.Container;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iud implements ahcx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ iud(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v45, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v1, types: [agfr, java.lang.Object] */
    @Override // defpackage.ahcx
    public final ListenableFuture a() {
        int i;
        int i2 = 19;
        int i3 = 20;
        int i4 = 3;
        byte[] bArr = null;
        int i5 = 2;
        int i6 = 0;
        int i7 = 1;
        switch (this.$cid) {
            case 0:
                return ((klc) ((iuf) this.a).h.io()).f();
            case 1:
                return ahng.n(((Container) ((goy) this.a).b.io()).a(new afyq(7)));
            case 2:
                ?? r0 = this.a;
                int i8 = mef.a;
                return ahng.r(r0, MoreExecutors.directExecutor());
            case 3:
                int i9 = onb.a;
                ooi ooiVarD = ooi.d(aher.a);
                Object obj = this.a;
                oll ollVar = new oll(obj, i6);
                Executor executor = ((olp) obj).g;
                return ooiVarD.f(ollVar, executor).f(new oll(obj, i5), executor).f(new oll(obj, i4), executor);
            case 4:
                return ((omn) this.a).b();
            case 5:
                aerj aerjVar = (aerj) this.a;
                agev agevVar = (agev) aerjVar.g.io();
                boolean zG = agevVar.g();
                Object objIo = aerjVar.f.io();
                if (zG) {
                    agev agevVar2 = (agev) objIo;
                    if (agevVar2.g()) {
                        qfr qfrVar = new qfr((File) agevVar.c(), (String) agevVar2.c());
                        int iA = qfrVar.a();
                        qfrVar.b().delete();
                        qfrVar.b = 0;
                        qfrVar.c = true;
                        if (iA < ((qfs) aerjVar.c.io()).c) {
                            return aher.a;
                        }
                        Object obj2 = aerjVar.e;
                        qfc qfcVarA = qfd.a();
                        aihf aihfVarCreateBuilder = axhz.a.createBuilder();
                        aihf aihfVarCreateBuilder2 = axhy.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        axhy axhyVar = (axhy) aihfVarCreateBuilder2.instance;
                        axhyVar.c = 6;
                        axhyVar.b |= 1;
                        aihfVarCreateBuilder.copyOnWrite();
                        axhz axhzVar = (axhz) aihfVarCreateBuilder.instance;
                        axhy axhyVar2 = (axhy) aihfVarCreateBuilder2.build();
                        axhyVar2.getClass();
                        axhzVar.r = axhyVar2;
                        axhzVar.b |= 16777216;
                        qfcVarA.g((axhz) aihfVarCreateBuilder.build());
                        return ((qfg) obj2).a(qfcVarA.a());
                    }
                }
                return aher.a;
            case 6:
                return aher.a;
            case 7:
                return ((qib) this.a).c();
            case 8:
                return ahng.o(rmp.B(((qrg) this.a).b));
            case 9:
                qrg qrgVar = (qrg) this.a;
                return qrgVar.c((Uri) ahng.v(qrgVar.b), new qrd(qrgVar, i7));
            case 10:
            case 11:
            case 12:
                return this.a;
            case 13:
                return ahng.n(((aaew) ((aady) this.a).h.io()).ao());
            case 14:
                Object obj3 = this.a;
                aajt aajtVar = (aajt) obj3;
                Context context = aajtVar.c;
                azs.l(context);
                aajv aajvVar = aajtVar.g;
                azs.l(aajvVar);
                Executor executor2 = aajtVar.h;
                azs.l(executor2);
                xsc xscVar = new xsc((Object) context, (Object) executor2, (Object) aajvVar, (byte[]) null);
                ?? r2 = xscVar.c;
                tz tzVar = tz.a;
                ListenableFuture listenableFutureL = ed.l(r2, new ub(xscVar, i7));
                afxd afxdVarG = afxd.f(listenableFutureL).h(new oly(9), executor2).g(new aakt(i7), MoreExecutors.directExecutor());
                return ahng.j(listenableFutureL, afxdVarG, afxd.f(listenableFutureL).h(new aajs(obj3, i6), executor2).c(Throwable.class, new row(obj3, listenableFutureL, i3, bArr), MoreExecutors.directExecutor())).a(new vtq(obj3, listenableFutureL, afxdVarG, 11, (byte[]) null), executor2);
            case 15:
                return ((acpc) this.a).b();
            case 16:
                Object obj4 = this.a;
                acpc acpcVar = (acpc) obj4;
                if (acpcVar.c) {
                    return aher.a;
                }
                int i10 = acpcVar.e + 1;
                acpcVar.e = i10;
                apfi apfiVar = acpcVar.g;
                if ((apfiVar.b & 2) != 0 && (i = apfiVar.d) > 0 && i10 >= i) {
                    acpcVar.c = true;
                }
                if (!acpcVar.f.equals("")) {
                    return acpcVar.h.a(new aaoz(obj4, i2), acpcVar.a);
                }
                Log.e("YT", "storeSwipeCountAndPermanentlyDisabled method: storage key equals STORAGE_KEY_UNSPECIFIED");
                return aher.a;
            case 17:
                return ((acpc) this.a).b();
            case 18:
                Object obj5 = this.a;
                acpc acpcVar2 = (acpc) obj5;
                if (acpcVar2.c) {
                    apfi apfiVar2 = acpcVar2.g;
                    if ((apfiVar2.b & 2) != 0 && apfiVar2.d > 0) {
                        return aher.a;
                    }
                }
                acpcVar2.d++;
                if (!acpcVar2.f.equals("")) {
                    return acpcVar2.h.a(new acpb(obj5, i6), acpcVar2.a);
                }
                Log.e("YT", "storeImpressionCount method: storage key equals STORAGE_KEY_UNSPECIFIED");
                return aher.a;
            case 19:
                return ((axlj) ((aeiy) this.a).g).l(Arrays.asList("Default"), true);
            default:
                Object obj6 = this.a;
                try {
                    String canonicalPath = new File(((Context) ((aeiy) obj6).c).getDataDir(), "app_webview").getCanonicalPath();
                    aeiy aeiyVar = (aeiy) obj6;
                    aeiv aeivVar = (aeiv) aeiyVar.d;
                    aeivVar.c("ds_scs");
                    long jA = aeiyVar.a(new File(canonicalPath), canonicalPath, new HashSet());
                    aeivVar.d(32);
                    aeivVar.c("ds_scc");
                    if (jA <= (((vxz) aeiyVar.f).c(5, 121548029L, 500L) << 20)) {
                        return aher.a;
                    }
                    aeivVar.d(33);
                    aeivVar.c("ds_es");
                    ListenableFuture listenableFutureAq = ahno.aq(new iud(obj6, i2), aeiyVar.b);
                    aajs aajsVar = new aajs(obj6, 13);
                    ?? r3 = aeiyVar.a;
                    ListenableFuture listenableFutureAs = ahno.as(listenableFutureAq, aajsVar, r3);
                    ahno.at(listenableFutureAs, new ryh(obj6, 11), r3);
                    ahno.at(listenableFutureAs, new adao(2), MoreExecutors.directExecutor());
                    return listenableFutureAs;
                } catch (IOException unused) {
                    twu.d("WebViewDataStoreManager", 6, "Could not get canonical path for webview directory.", null);
                    return aher.a;
                }
        }
    }
}
