package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.chromium.net.NetError;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahrn {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public ahrn(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6) {
        awmdVar.getClass();
        this.b = awmdVar;
        this.e = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.d = awmdVar5;
        awmdVar6.getClass();
        this.f = awmdVar6;
    }

    public static final lpa b(lpa lpaVar) {
        return lpaVar.a(ahri.a, new klg(2));
    }

    private final String i() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(((ahnr) this.a).g().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    private final void j(aflm aflmVar, dzu dzuVar) {
        agqr it = aflmVar.i.iterator();
        while (it.hasNext()) {
            dzuVar.b((String) it.next());
        }
        agev agevVar = aflmVar.e;
        if (agevVar.g() && (dzuVar instanceof dzo)) {
            dzo dzoVar = (dzo) dzuVar;
            long jLongValue = ((Long) agevVar.c()).longValue();
            if (jLongValue == Long.MAX_VALUE) {
                throw new IllegalArgumentException("Cannot set Long.MAX_VALUE as the schedule override time");
            }
            ees eesVar = dzoVar.c;
            eesVar.u = jLongValue;
            eesVar.v = 1;
        }
        dov dovVar = new dov((byte[]) null);
        dovVar.h(aflmVar.f);
        agev agevVar2 = aflmVar.l;
        if (agevVar2.g()) {
            Object obj = this.d;
            ComponentName componentName = (ComponentName) ((agfa) obj).a.get(agevVar2.c());
            dovVar.k("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", componentName.getPackageName());
            dovVar.k("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", componentName.getClassName());
        }
        dzuVar.f(dovVar.g());
        String strE = e(aflmVar.a);
        int length = strE.length();
        Pattern pattern = afly.a;
        dzuVar.c("TikTokWorker#".concat(String.valueOf(strE.substring(Math.max(0, length + NetError.ERR_SSL_RENEGOTIATION_REQUESTED)))));
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [ahrs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [ahrw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [ahrs, java.lang.Object] */
    public final lpa a(String str, String str2, String str3, Bundle bundle) {
        int iB;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", ((ahnr) this.a).e().b);
        afts aftsVar = (afts) this.f;
        bundle.putString("gmsv", Integer.toString(aftsVar.j()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", aftsVar.k());
        bundle.putString("app_ver_name", aftsVar.l());
        bundle.putString("firebase-app-name-hash", i());
        try {
            String str4 = ((ahsa) mda.n(this.e.l())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        bundle.putString("cliv", "fiid-21.1.1");
        ahrd ahrdVar = (ahrd) this.d.a();
        ahuh ahuhVar = (ahuh) this.c.a();
        if (ahrdVar != null && ahuhVar != null && (iB = ahrdVar.b()) != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(iB - 1));
            bundle.putString("Firebase-Client", ahuhVar.a());
        }
        return ((kli) this.b).b(bundle);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aflp, java.lang.Object] */
    public final ListenableFuture c(UUID uuid) {
        return ((jij) this.a).L(this.c.b(uuid), new oly(15));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aflp, java.lang.Object] */
    public final ListenableFuture d(String str) {
        ListenableFuture listenableFutureG = this.c.g(new dov((Object) atqq.aR(new String[]{str})));
        abzy abzyVar = new abzy(15);
        int i = ahcs.c;
        ?? r2 = this.f;
        ahcr ahcrVar = new ahcr(listenableFutureG, abzyVar);
        listenableFutureG.addListener(ahcrVar, MoreExecutors.c(r2, ahcrVar));
        return ahcrVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final String e(Class cls) {
        String str = (String) this.e.get(cls);
        cls.toString();
        str.getClass();
        return str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [awmd, java.lang.Object] */
    public final aecp f(xgn xgnVar, amdd amddVar) {
        Context context = (Context) this.b.io();
        context.getClass();
        acxn acxnVar = (acxn) this.c.io();
        acxnVar.getClass();
        nuc nucVar = (nuc) this.a.io();
        nucVar.getClass();
        ElementsServices elementsServices = (ElementsServices) this.d.io();
        elementsServices.getClass();
        abxu abxuVar = (abxu) this.f.io();
        abxuVar.getClass();
        xgnVar.getClass();
        return new aecp(context, this.e, acxnVar, nucVar, elementsServices, abxuVar, xgnVar, amddVar, false);
    }

    public final ayq g(aflm aflmVar, aflk aflkVar) {
        if (!aflmVar.g.g()) {
            throw new IllegalStateException();
        }
        dzo dzoVar = new dzo(TikTokListenableWorker.class, aflkVar.a, aflkVar.b);
        j(aflmVar, dzoVar);
        dzoVar.d(aflmVar.b);
        aflk aflkVar2 = aflmVar.d;
        dzoVar.e(aflkVar2.a, aflkVar2.b);
        return dzoVar.g();
    }

    public final ayq h(aflm aflmVar) {
        ahno.O(!aflmVar.g.g());
        dzg dzgVar = new dzg(TikTokListenableWorker.class);
        dzgVar.d(aflmVar.b);
        aflk aflkVar = aflmVar.d;
        dzgVar.e(aflkVar.a, aflkVar.b);
        dzgVar.f(aflmVar.f);
        j(aflmVar, dzgVar);
        return dzgVar.g();
    }

    public ahrn(Context context, aflp aflpVar, Map map, Executor executor, agev agevVar, jij jijVar) {
        this.b = context;
        this.c = aflpVar;
        this.e = map;
        this.f = executor;
        this.d = agevVar;
        this.a = jijVar;
    }

    public ahrn(ahnr ahnrVar, afts aftsVar, kli kliVar, ahrs ahrsVar, ahrs ahrsVar2, ahrw ahrwVar) {
        this.a = ahnrVar;
        this.f = aftsVar;
        this.b = kliVar;
        this.c = ahrsVar;
        this.d = ahrsVar2;
        this.e = ahrwVar;
    }
}
