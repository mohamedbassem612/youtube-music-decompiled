package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mdz {
    private static final String[] c = {"COLLECTION_BASIS_VERIFIER"};
    public static boolean a = false;
    public static final Object b = new Object();

    public static void a(mdr mdrVar, yz yzVar) {
        final ExecutorService threadPoolExecutor;
        khn khnVar = lll.a;
        Context context = mdrVar.a;
        final llq llqVar = new llq(context);
        String strValueOf = String.valueOf(context.getPackageName());
        if (yzVar.a == null) {
            try {
                yzVar.a = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                yzVar.a = -1;
            }
        }
        final String strConcat = "com.google.android.libraries.consentverifier#".concat(strValueOf);
        lpa lpaVarF = llqVar.f(strConcat, ((Integer) yzVar.a).intValue(), c);
        if (mdu.a(mdrVar.a)) {
            ksy ksyVar = kyq.a;
            threadPoolExecutor = ksy.an(10);
        } else {
            RejectedExecutionHandler rejectedExecutionHandler = mec.a;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
            ahfi ahfiVar = new ahfi();
            ahfiVar.c("ConsentVerifierLibraryThread-%d");
            threadPoolExecutor = new ThreadPoolExecutor(0, 10, 10L, TimeUnit.SECONDS, linkedBlockingQueue, ahfi.a(ahfiVar), mec.a);
        }
        try {
            lpaVarF.n(threadPoolExecutor, new low() { // from class: mdy
                @Override // defpackage.low
                public final void e(Object obj) {
                    boolean z = mdz.a;
                    llq llqVar2 = llqVar;
                    String str = strConcat;
                    llqVar2.d(str).m(threadPoolExecutor, new kea(str, 7));
                }
            });
            lpaVarF.m(threadPoolExecutor, new kea(strConcat, 6));
        } catch (RejectedExecutionException e) {
            Log.w("CBVerifier", String.format("Execution failure when updating phenotypeflags for %s. %s", strConcat, e));
        }
    }
}
