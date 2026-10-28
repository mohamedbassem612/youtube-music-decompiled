package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pox implements aupn {
    public static aiew b() {
        aihf aihfVarCreateBuilder = aiew.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        aiew aiewVar = (aiew) aihfVarCreateBuilder.instance;
        aiewVar.b |= 524288;
        aiewVar.k = true;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        return (aiew) aihnVarBuild;
    }

    public static aiew c() {
        aihf aihfVarCreateBuilder = aiew.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        aiew aiewVar = (aiew) aihfVarCreateBuilder.instance;
        aiewVar.b |= SemanticState.Modal;
        aiewVar.h = true;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        return (aiew) aihnVarBuild;
    }

    public static klt d() {
        klt kltVar = klt.a;
        kltVar.getClass();
        return kltVar;
    }

    public static SharedPreferences e(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("fcm_registration_data", 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    public static bec f(Context context, awut awutVar, SharedPreferences sharedPreferences, pxh pxhVar, pfz pfzVar) {
        context.getClass();
        sharedPreferences.getClass();
        pxhVar.getClass();
        pxhVar.a(context);
        ArrayList arrayList = new ArrayList(new awnl(new bdx[]{psp.a(sharedPreferences)}, true));
        if (auvj.a.io().e()) {
            arrayList.add(psp.a);
        }
        String strA = pfzVar.a(context, "fcm_registration_data.pb", false);
        aihf aihfVarCreateBuilder = pym.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        return azt.e(new bgd((pym) aihnVarBuild), new bgr(new bfu(10)), arrayList, awutVar, new ebk(strA, 13));
    }

    public static GnpRoomDatabase g(Context context, awou awouVar, pfz pfzVar) {
        context.getClass();
        awouVar.getClass();
        dmo dmoVarG = azt.g(context, GnpRoomDatabase.class, pfzVar.a(context, "gnp_fcm_database", true));
        dmoVarG.b((doc[]) Arrays.copyOf(new doc[]{GnpRoomDatabase.l}, 1));
        dmoVarG.c();
        dmoVarG.d(awouVar);
        GnpRoomDatabase gnpRoomDatabase = (GnpRoomDatabase) dmoVarG.a();
        gnpRoomDatabase.getClass();
        return gnpRoomDatabase;
    }

    public static pve h(aunn aunnVar, awou awouVar) {
        aunnVar.getClass();
        awouVar.getClass();
        return new pvo(new pwa(aunnVar, 0), awouVar);
    }

    public static pwf i(Context context, ahey aheyVar) {
        context.getClass();
        aheyVar.getClass();
        return new pwf(aheyVar, new qta(context, "STREAMZ_GNP_ANDROID"), (Application) context);
    }

    public static Set j() {
        Set setSingleton = auwe.a.io().b() ? Collections.singleton(ahxx.USER_FEEDBACK_IHNR_ACTION_BUTTONS) : Collections.EMPTY_SET;
        setSingleton.getClass();
        return setSingleton;
    }

    public static aiew k() {
        aihf aihfVarCreateBuilder = aiew.a.createBuilder();
        if (auwe.a.io().c()) {
            aihfVarCreateBuilder.copyOnWrite();
            aiew aiewVar = (aiew) aihfVarCreateBuilder.instance;
            aiewVar.b |= 16384;
            aiewVar.i = true;
        }
        aiew aiewVar2 = (aiew) aihfVarCreateBuilder.build();
        aiewVar2.getClass();
        return aiewVar2;
    }

    public static aiew l() {
        int iAS;
        aihf aihfVarCreateBuilder = aiew.a.createBuilder();
        auuw auuwVar = auuw.a;
        if (auuwVar.io().f() && (iAS = a.aS(auuwVar.io().e().b)) != 0 && iAS != 1) {
            aihf aihfVarCreateBuilder2 = aiev.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aiev aievVar = (aiev) aihfVarCreateBuilder2.instance;
            aievVar.b |= 1;
            aievVar.c = true;
            aihfVarCreateBuilder.copyOnWrite();
            aiew aiewVar = (aiew) aihfVarCreateBuilder.instance;
            aiev aievVar2 = (aiev) aihfVarCreateBuilder2.build();
            aievVar2.getClass();
            aiewVar.c = aievVar2;
            aiewVar.b |= 1;
        }
        aiew aiewVar2 = (aiew) aihfVarCreateBuilder.build();
        aiewVar2.getClass();
        return aiewVar2;
    }

    public static void m(qck qckVar) {
        qck.b(qckVar);
        qckVar.getClass();
    }

    public static rkt n(Activity activity, Map map) {
        awmd awmdVar = (awmd) map.get(activity.getClass());
        activity.getClass().getName();
        awmdVar.getClass();
        rkt rktVar = (rkt) awmdVar.io();
        rktVar.getClass();
        return rktVar;
    }

    public static agke o(rrb rrbVar) {
        Object[] objArr = {rrbVar};
        aguu.j(objArr, 1);
        return new agpi(objArr, 1);
    }

    public static rrh p(awmd awmdVar, awmd awmdVar2, tqj tqjVar) {
        rrh rrhVar = wkv.a(tqjVar).c(wkt.SIGNALS_REQUEST_CONTEXT) ? (rrh) awmdVar2.io() : (rrh) awmdVar.io();
        rrhVar.getClass();
        return rrhVar;
    }

    public static rrl q(awmd awmdVar, awmd awmdVar2, tqj tqjVar) {
        rrl rrlVar = wkv.a(tqjVar).c(wkt.SIGNALS_REQUEST_CONTEXT) ? (rrl) awmdVar2.io() : (rrl) awmdVar.io();
        rrlVar.getClass();
        return rrlVar;
    }

    public static sek r(awmd awmdVar) {
        sej sejVar = (sej) awmdVar.io();
        sejVar.a.getClass();
        return new sek(sejVar);
    }

    public static tpq s(Context context, awmd awmdVar, String str, ahey aheyVar, Optional optional) {
        optional.isPresent();
        boolean zBooleanValue = ((Boolean) optional.orElse(Boolean.TRUE)).booleanValue();
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("ads");
        qpqVar.d("ads.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        atoq atoqVar = atoq.a;
        qrlVarA.e(atoqVar);
        qrlVarA.g(zBooleanValue);
        qrlVarA.f(uriA);
        qrn qrnVar = new qrn(context.getApplicationContext(), aheyVar);
        qrnVar.c = str;
        qrnVar.b();
        qrnVar.d("last_ad_time", "last_ad_signals_adid", "last_ad_signals_lat", "last_ad_signals_identity", "last_ad_signals_timestamp");
        qrnVar.e(new tpi(1));
        qrlVarA.b(qrnVar.a());
        return new tpn(omj.U(((rrq) awmdVar.io()).c(qrlVarA.a())), atoqVar);
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    public static File t(Context context, Optional optional, Object obj) {
        File fileA = sxf.a("CacheDir", context.getCacheDir());
        for (int i = 0; i < 5 && fileA == null; i++) {
            Thread.yield();
            fileA = sxf.a(a.bR(i, "CacheDir"), context.getCacheDir());
        }
        if (fileA == null) {
            fileA = sxf.a("ExternalCacheDir", context.getExternalCacheDir());
        }
        File file = new File(System.getProperty("java.io.tmpdir") + '/' + context.getPackageName());
        if (fileA == null) {
            fileA = new File(file, "failovercache-" + System.currentTimeMillis());
            fileA.getPath();
            fileA.mkdirs();
        } else if (file.isDirectory()) {
            ((vwt) obj).a.execute(new sxk(obj, file, 1));
        }
        optional.isPresent();
        return fileA;
    }

    public static omm u(aunn aunnVar, awou awouVar) {
        aunnVar.getClass();
        awouVar.getClass();
        return new omm(aunnVar, awouVar, null);
    }

    public static lmm v(Context context) {
        jze jzeVar = new jze(new Bundle());
        khn khnVar = jzd.a;
        return new lmm(context, jzeVar);
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}
