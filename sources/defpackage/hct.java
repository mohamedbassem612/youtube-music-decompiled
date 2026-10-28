package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.youtube.music.R;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hct {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/feedback/HelpClient");
    public final cf b;
    public final zwb c;
    public final aeql d;
    public final String e = "music_android_default";
    public final Uri f;
    public final awmd g;
    public final omj h;
    private final Executor i;
    private final ScheduledExecutorService j;
    private final vxz k;
    private final hef l;

    public hct(cf cfVar, omj omjVar, zwb zwbVar, aeql aeqlVar, hef hefVar, awmd awmdVar, ScheduledExecutorService scheduledExecutorService, Executor executor, vxz vxzVar, Uri uri) {
        this.b = cfVar;
        this.h = omjVar;
        this.c = zwbVar;
        this.d = aeqlVar;
        this.l = hefVar;
        this.g = awmdVar;
        this.j = scheduledExecutorService;
        this.i = executor;
        this.k = vxzVar;
        this.f = uri;
    }

    public final void a(final String str, final Bundle bundle) {
        Bitmap bitmapE;
        try {
            bitmapE = lmm.e(this.b.getWindow().getDecorView().getRootView());
        } catch (Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            bitmapE = null;
        }
        final Bitmap bitmap = bitmapE;
        hef hefVar = this.l;
        vxz vxzVar = this.k;
        ListenableFuture listenableFutureI = hefVar.i();
        agke agkeVar = agpi.a;
        long jC = vxzVar.c(1, 45747240L, 0L);
        if (jC > 0) {
            listenableFutureI = ahng.u(listenableFutureI, jC, TimeUnit.MILLISECONDS, this.j);
        }
        gmv gmvVar = new gmv(agkeVar, 9);
        Executor executor = this.i;
        final ListenableFuture listenableFutureAm = ahno.am(listenableFutureI, Exception.class, gmvVar, executor);
        ahno.ax(listenableFutureAm).k(new Callable() { // from class: hcr
            /* JADX WARN: Type inference failed for: r0v17, types: [agfr, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = (List) ahng.v(listenableFutureAm);
                hct hctVar = this.a;
                kvm kvmVar = (kvm) hctVar.g.io();
                Bundle bundle2 = bundle;
                kvmVar.b(new hcs(bundle2, list));
                kvmVar.a = bitmap;
                GoogleHelp googleHelp = new GoogleHelp(23, str, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 3, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, 200, null, false, null, false, null, false, new ArrayList(), null, 0, 0, new ArrayList(), null, null, new ArrayList());
                googleHelp.q = hctVar.f;
                kvv kvvVar = new kvv(3, 0);
                kvvVar.a = 3;
                googleHelp.s = kvvVar;
                cf cfVar = hctVar.b;
                googleHelp.a(0, cfVar.getString(R.string.pref_terms_of_service), sxy.a(Uri.parse(cfVar.getString(R.string.uri_youtube_terms))));
                googleHelp.a(1, cfVar.getString(R.string.pref_privacy_policy), sxy.a(Uri.parse(cfVar.getString(R.string.uri_privacy_policy))));
                googleHelp.a(2, cfVar.getString(R.string.open_source_licenses_title), new Intent(cfVar, (Class<?>) LicenseMenuActivity.class));
                googleHelp.S = new qcb(bundle2);
                zwb zwbVar = hctVar.c;
                if (zwbVar.u()) {
                    try {
                        Account accountM = hctVar.h.M(zwbVar.e());
                        if (accountM != null) {
                            googleHelp.c = accountM;
                        }
                    } catch (RemoteException | kmj | kmk e2) {
                        ((agrc) ((agrc) ((agrc) hct.a.b()).j(e2)).k("com/google/android/apps/youtube/music/feedback/HelpClient", "launchHelpInternal", (char) 185, "HelpClient.java")).t("Error getting account");
                    }
                } else {
                    kvmVar.b = "anonymous";
                }
                kvn kvnVarA = kvmVar.a();
                cf cfVar2 = hctVar.b;
                File cacheDir = cfVar2.getCacheDir();
                googleHelp.R = kvnVarA.u;
                googleHelp.v = new ErrorReport(kvnVarA, cacheDir);
                googleHelp.v.X = "GoogleHelp";
                kyr kyrVar = new kyr((Activity) cfVar2);
                Intent intentPutExtra = new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", googleHelp);
                if (!intentPutExtra.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intentPutExtra.hasExtra("EXTRA_GOOGLE_HELP")) {
                    throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
                }
                Object obj = kyrVar.b;
                Context context = (Context) obj;
                int iB = kml.b(context, 11925000);
                if (iB == 0) {
                    ((kxs) kyrVar.a.io()).a(intentPutExtra);
                } else {
                    Intent data = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) intentPutExtra.getParcelableExtra("EXTRA_GOOGLE_HELP")).q);
                    if (iB == 7) {
                        iB = 7;
                    } else if (!((Activity) obj).getPackageManager().queryIntentActivities(data, 0).isEmpty()) {
                        new afkg(Looper.getMainLooper(), (byte[]) null).post(new jmi(kyrVar, data, 14, (char[]) null));
                    }
                    if (iB == 1 && true == kml.f(context)) {
                        iB = 18;
                    }
                    klt.a.i((Activity) obj, iB, 0, null);
                }
                return null;
            }
        }, executor);
    }
}
