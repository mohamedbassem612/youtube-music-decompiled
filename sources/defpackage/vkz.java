package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Handler;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import java.security.SecureRandom;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vkz implements aupn {
    public static vkk b(cc ccVar) {
        ccVar.getClass();
        Object objF = awrc.f(nsj.k(ccVar, vkk.class));
        if (objF != null) {
            return (vkk) objF;
        }
        Objects.toString(ccVar);
        throw new IllegalStateException("TextUiShowingCallback not found in fragment: ".concat(ccVar.toString()));
    }

    public static tgg c(vvn vvnVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, tqj tqjVar) {
        vvnVar.getClass();
        awmdVar.getClass();
        awmdVar2.getClass();
        awmdVar3.getClass();
        tqjVar.getClass();
        int i = tqr.a;
        if (tqjVar.k(1073815016)) {
            Object objIo = awmdVar3.io();
            objIo.getClass();
            return (tgg) objIo;
        }
        Object objIo2 = awmdVar.io();
        objIo2.getClass();
        return (tgg) objIo2;
    }

    public static tir d(vvn vvnVar, awmd awmdVar, awmd awmdVar2) {
        vvnVar.getClass();
        awmdVar.getClass();
        awmdVar2.getClass();
        Object objIo = awmdVar.io();
        objIo.getClass();
        return (tir) objIo;
    }

    public static tir e(vvn vvnVar, tgm tgmVar, tmo tmoVar, Optional optional, tgl tglVar, ExecutorService executorService, awut awutVar, ExecutorService executorService2, awut awutVar2) {
        tgh tghVarA = tgi.a();
        tghVarA.b(tmoVar);
        tghVarA.c(optional);
        tghVarA.f(tglVar);
        int i = vvnVar.c;
        tghVarA.g();
        tghVarA.e = "bg-innertube";
        tghVarA.a = Optional.of(executorService);
        tghVarA.b = Optional.of(awutVar);
        tghVarA.c = Optional.of(executorService2);
        tghVarA.d = Optional.of(awutVar2);
        tghVarA.d(executorService2);
        tghVarA.e(true);
        tir tirVar = (tir) tgmVar.a(tghVarA.a());
        tirVar.getClass();
        return tirVar;
    }

    public static tgg f(tqj tqjVar, aunn aunnVar, aunn aunnVar2) {
        int i = tqr.a;
        tgg tggVarU = tzk.U(tqjVar, 1073829876, aunnVar, aunnVar2);
        tggVarU.getClass();
        return tggVarU;
    }

    public static tir g(vvn vvnVar, tgm tgmVar, tmo tmoVar, Optional optional, tgl tglVar, ExecutorService executorService, awut awutVar, ExecutorService executorService2, awut awutVar2, Executor executor) {
        tgh tghVarA = tgi.a();
        tghVarA.b(tmoVar);
        tghVarA.c(optional);
        tghVarA.f(tglVar);
        int i = vvnVar.c;
        tghVarA.g();
        tghVarA.e = "ui-innertube";
        tghVarA.a = Optional.of(executorService);
        tghVarA.b = Optional.of(awutVar);
        tghVarA.c = Optional.of(executorService2);
        tghVarA.d = Optional.of(awutVar2);
        tghVarA.d(executor);
        tghVarA.e(true);
        tir tirVar = (tir) tgmVar.a(tghVarA.a());
        tirVar.getClass();
        return tirVar;
    }

    public static zrx h(zrw zrwVar) {
        zrx zrxVarF = zrwVar.f();
        zrxVarF.getClass();
        return zrxVarF;
    }

    public static afqy i() {
        afqx afqxVarA = afqy.a();
        afqxVarA.a = "MdxDeviceScopedSchema";
        aihf aihfVarCreateBuilder = xni.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        yno.dh(amyt.MDX_LOCAL_NETWORK_PERMISSION_STATUS_NOT_ASKED, aihfVarCreateBuilder);
        afqxVarA.c(yno.dg(aihfVarCreateBuilder));
        afqxVarA.b(new bgr(new uhd(19)));
        return afqxVarA.a();
    }

    public static xoq j(Object obj) {
        return new xoq((xow) obj);
    }

    public static tgg k(tgm tgmVar, zry zryVar, mbc mbcVar, Executor executor, ExecutorService executorService, awut awutVar, tqj tqjVar) {
        tgl tglVar = new tgl(zik.bN(5000, 10000), new zyc(zryVar, mbcVar));
        int i = tqr.a;
        long jC = tqjVar.c(1075839383) & 1073741824;
        tgh tghVarA = tgi.a();
        tghVarA.b(new tnn());
        tghVarA.f(tglVar);
        tghVarA.e = "mdx-insecure";
        boolean z = jC != 0;
        tghVarA.a = z ? Optional.of(executorService) : Optional.empty();
        tghVarA.b = Optional.of(awutVar);
        tghVarA.c = z ? Optional.of(executorService) : Optional.empty();
        tghVarA.d = Optional.of(awutVar);
        tghVarA.d(executor);
        tghVarA.e(true);
        tgg tggVarA = tgmVar.a(tghVarA.a());
        tggVarA.d();
        tggVarA.getClass();
        return tggVarA;
    }

    public static xxk l(xyb xybVar, xmr xmrVar) {
        boolean z = xmrVar.h;
        xybVar.getClass();
        return xybVar;
    }

    public static ydy m(SharedPreferences sharedPreferences) {
        ydy ydyVar;
        String string = sharedPreferences.getString("MdxServerSelection", ydy.e.name());
        try {
            ydyVar = (ydy) Enum.valueOf(ydy.class, string);
        } catch (IllegalArgumentException e) {
            ((agrc) ((agrc) ((agrc) xwe.a.b().i(agso.a, "MDX.MdxModule")).j(e)).k("com/google/android/libraries/youtube/mdx/module/MdxSharedModule$SharedModule", "provideMdxServerSelection", 528, "MdxSharedModule.java")).B("Bogus value in shared preferences for key %s value %s, returning default value.", "MdxServerSelection", string);
            ydyVar = ydy.e;
        }
        ydyVar.getClass();
        return ydyVar;
    }

    public static ListenableFuture n(SharedPreferences sharedPreferences, SecureRandom secureRandom, vxu vxuVar, awmd awmdVar) {
        anim animVar = vxuVar.c().n;
        if (animVar == null) {
            animVar = anim.a;
        }
        apbr apbrVar = animVar.e;
        if (apbrVar == null) {
            apbrVar = apbr.a;
        }
        boolean z = apbrVar.b;
        agrx agrxVar = agso.a;
        ListenableFuture listenableFutureO = z ? ahng.o(ahcs.e(((qrx) awmdVar.io()).c(), afwl.a(new tvm(secureRandom, awmdVar, 12)), MoreExecutors.directExecutor())) : ahng.o(afxd.f(ahng.n(sharedPreferences.getString("remote_id", ""))).g(new tvm(secureRandom, sharedPreferences, 13, null), MoreExecutors.directExecutor()));
        listenableFutureO.getClass();
        return listenableFutureO;
    }

    public static qrx o(Context context, ahex ahexVar, String str, awmd awmdVar, rrq rrqVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("videoeffects");
        qpqVar.d("videoeffects.pb");
        Uri uriA = qpqVar.a();
        qrn qrnVarD = qrp.d(context, ahexVar);
        qrnVarD.d("TEXT_COLOR", "BACKGROUND_COLOR", "ALIGNMENT", "FONT_FAMILY");
        qrnVarD.b();
        qrnVarD.c = str;
        qrnVarD.e(new vlf(0));
        qrp qrpVarA = qrnVarD.a();
        qrn qrnVarD2 = qrp.d(context, ahexVar);
        qrnVarD2.d("MOST_RECENT_PRESET_EFFECT_ID");
        qrnVarD2.b();
        qrnVarD2.c = str;
        qrnVarD2.e(new vlf(2));
        qrp qrpVarA2 = qrnVarD2.a();
        qrn qrnVarD3 = qrp.d(context, ahexVar);
        qrnVarD3.d("recent_stickers");
        qrnVarD3.b();
        qrnVarD3.c = str;
        qrnVarD3.e(new vlf(3));
        qrp qrpVarA3 = qrnVarD3.a();
        qrn qrnVarD4 = qrp.d(context, ahexVar);
        qrnVarD4.d("REEL_WELCOME_V2_ALREADY_SEEN");
        qrnVarD4.b();
        qrnVarD4.c = str;
        qrnVarD4.e(new vlf(4));
        qrp qrpVarA4 = qrnVarD4.a();
        tpr tprVar = new tpr(awmdVar, new bym(18), new sdp(11), new ulo(12), new heo(9), ahexVar);
        qrl qrlVarA = qrm.a();
        qrlVarA.e(vlg.a);
        qrlVarA.b(qrpVarA);
        qrlVarA.b(qrpVarA2);
        qrlVarA.b(qrpVarA3);
        qrlVarA.b(qrpVarA4);
        qrlVarA.b(tprVar);
        qrlVarA.f(uriA);
        qrx qrxVarC = rrqVar.c(qrlVarA.a());
        qrxVarC.getClass();
        return qrxVarC;
    }

    public static aefv p(aerj aerjVar, vxe vxeVar, xgm xgmVar) {
        vxeVar.getClass();
        xgmVar.getClass();
        return new aefv(aerjVar, vxeVar, xgmVar);
    }

    public static afip q(acez acezVar) {
        acezVar.getClass();
        return acezVar.a(agpr.a);
    }

    public static wxq r(Handler handler, zs zsVar, acyx acyxVar, avmb avmbVar) {
        handler.getClass();
        zsVar.getClass();
        acyxVar.getClass();
        avmbVar.getClass();
        return new wyq(handler, zsVar, acyxVar, avmbVar);
    }

    public static wwk s(Activity activity, Executor executor, avmb avmbVar, wbz wbzVar, aaok aaokVar, vxz vxzVar, vxz vxzVar2) {
        activity.getClass();
        executor.getClass();
        avmbVar.getClass();
        wbzVar.getClass();
        aaokVar.getClass();
        vxzVar.getClass();
        vxzVar2.getClass();
        return new wwk(activity, executor, avmbVar, wbzVar, aaokVar, vxzVar, vxzVar2);
    }

    public static vkr t(Context context, zs zsVar, aaok aaokVar) {
        agke agkeVar;
        auir auirVar;
        boolean zD = aaokVar.D();
        zs zsVar2 = new zs((byte[]) null, (byte[]) null, (byte[]) null, (char[]) null);
        if (zD) {
            auir auirVar2 = vkn.a;
            auir auirVar3 = auir.CLASSIC_INTER_TIGHT;
            Paint.Join join = vkq.a;
            vkp vkpVar = new vkp(auirVar3, R.string.reel_advanced_text_font_classic, 16);
            vkpVar.c(0.16666667f);
            vkpVar.b("name=Inter Tight&weight=700");
            vkpVar.e(0.075f);
            vkpVar.d(Paint.Join.ROUND);
            vkpVar.b = Optional.of(Float.valueOf(2.0f));
            vkq vkqVarA = vkpVar.a();
            vkp vkpVar2 = new vkp(auir.LIGHT_INTER_TIGHT, R.string.reel_advanced_text_font_light, 17);
            vkpVar2.c(0.16666667f);
            vkpVar2.b("name=Inter Tight&weight=300");
            vkpVar2.e(0.07f);
            vkpVar2.d(Paint.Join.ROUND);
            vkpVar2.b = Optional.empty();
            vkq vkqVarA2 = vkpVar2.a();
            vkp vkpVar3 = new vkp(auir.MARKER, R.string.reel_advanced_text_font_marker, 18);
            vkpVar3.c(0.16666667f);
            vkpVar3.b("name=Sriracha");
            vkpVar3.e(0.075f);
            vkpVar3.d(Paint.Join.ROUND);
            vkpVar3.b = Optional.empty();
            vkq vkqVarA3 = vkpVar3.a();
            vkp vkpVar4 = new vkp(auir.SCRIPT, R.string.reel_advanced_text_font_script, 19);
            vkpVar4.c(1.0f);
            vkpVar4.b("name=Petit Formal Script");
            vkpVar4.e(0.07f);
            vkpVar4.d(Paint.Join.ROUND);
            vkpVar4.b = Optional.empty();
            vkpVar4.f();
            vkq vkqVarA4 = vkpVar4.a();
            vkp vkpVar5 = new vkp(auir.PRINTER, R.string.reel_advanced_text_font_printer, 20);
            vkpVar5.c(0.0f);
            vkpVar5.b("name=Google Sans Mono&weight=500");
            vkpVar5.e(0.07f);
            vkpVar5.d(Paint.Join.ROUND);
            vkpVar5.b = Optional.empty();
            vkq vkqVarA5 = vkpVar5.a();
            vkp vkpVar6 = new vkp(auir.NARROW, R.string.reel_advanced_text_font_narrow, 4);
            vkpVar6.c(0.0f);
            vkpVar6.b("name=Oswald&weight=700");
            vkpVar6.e(0.07f);
            vkpVar6.d(Paint.Join.ROUND);
            vkpVar6.b = Optional.empty();
            vkq vkqVarA6 = vkpVar6.a();
            vkp vkpVar7 = new vkp(auir.COZY, R.string.reel_advanced_text_font_cozy, 21);
            vkpVar7.c(1.0f);
            vkpVar7.b("name=Gaegu");
            vkpVar7.e(0.07f);
            vkpVar7.d(Paint.Join.ROUND);
            vkpVar7.b = Optional.empty();
            vkpVar7.f();
            vkq vkqVarA7 = vkpVar7.a();
            vkp vkpVar8 = new vkp(auir.JOURNAL, R.string.reel_advanced_text_font_journal, 22);
            vkpVar8.c(0.0f);
            vkpVar8.b("name=Crimson Pro&weight=500");
            vkpVar8.e(0.07f);
            vkpVar8.d(Paint.Join.ROUND);
            vkpVar8.b = Optional.empty();
            vkq vkqVarA8 = vkpVar8.a();
            vkp vkpVar9 = new vkp(auir.CHISEL, R.string.reel_advanced_text_font_chisel, 23);
            vkpVar9.c(0.16666667f);
            vkpVar9.b("name=Platypi&weight=800");
            vkpVar9.e(0.075f);
            vkpVar9.d(Paint.Join.ROUND);
            vkpVar9.b = Optional.empty();
            agke agkeVarY = agke.y(vkqVarA, vkqVarA2, vkqVarA3, vkqVarA4, vkqVarA5, vkqVarA6, vkqVarA7, vkqVarA8, vkpVar9.a());
            agjz agjzVar = new agjz(4);
            Set set = vkn.d;
            synchronized (set) {
                agjzVar.j((Iterable) Collection.EL.stream(set).map(new ush(20)).flatMap(new ush(19)).collect(aghu.a));
            }
            agjz agjzVar2 = new agjz(4);
            agjzVar2.j(agkeVarY);
            agjzVar2.j(agjzVar.g());
            Iterable$EL.forEach(agjzVar2.g(), new usf(zsVar2, 18));
        }
        auir auirVar4 = vkn.a;
        auir auirVar5 = auir.YOUTUBE_SANS;
        Paint.Join join2 = vkq.a;
        vkp vkpVar10 = new vkp(auirVar5, R.string.reel_advanced_text_font_youtube_sans, 8);
        vkpVar10.c(0.25f);
        vkpVar10.a = Optional.of(ackm.YOUTUBE_SANS_BOLD.c(context, 1));
        vkq vkqVarA9 = vkpVar10.a();
        vkp vkpVar11 = new vkp(auir.HEAVY, R.string.reel_advanced_text_font_heavy, 9);
        vkpVar11.c(0.25f);
        vkpVar11.b("name=Bangers");
        vkq vkqVarA10 = vkpVar11.a();
        vkp vkpVar12 = new vkp(auir.HANDWRITING, R.string.reel_advanced_text_font_handwriting, 10);
        vkpVar12.c(0.25f);
        vkpVar12.b("name=Satisfy");
        vkq vkqVarA11 = vkpVar12.a();
        vkp vkpVar13 = new vkp(auir.TYPEWRITER, R.string.reel_advanced_text_font_typewriter, 11);
        vkpVar13.c(0.25f);
        vkpVar13.b("name=Courier Prime&weight=700");
        vkq vkqVarA12 = vkpVar13.a();
        vkp vkpVar14 = new vkp(auir.MEME, R.string.reel_advanced_text_font_meme, 12);
        vkpVar14.c(0.25f);
        vkpVar14.b("name=Anton");
        vkq vkqVarA13 = vkpVar14.a();
        vkp vkpVar15 = new vkp(auir.FUN, R.string.reel_advanced_text_font_fun, 13);
        vkpVar15.c(0.25f);
        vkpVar15.b("name=Comic Neue&weight=700");
        vkq vkqVarA14 = vkpVar15.a();
        vkp vkpVar16 = new vkp(auir.LIGHT, R.string.reel_advanced_text_font_light, 14);
        vkpVar16.c(0.25f);
        vkpVar16.b("name=YouTube Sans&weight=300");
        vkq vkqVarA15 = vkpVar16.a();
        vkp vkpVar17 = new vkp(auir.CLASSY, R.string.reel_advanced_text_font_classy, 15);
        vkpVar17.c(0.25f);
        vkpVar17.b("name=Bodoni Moda&weight=600");
        agke agkeVarX = agke.x(vkqVarA9, vkqVarA10, vkqVarA11, vkqVarA12, vkqVarA13, vkqVarA14, vkqVarA15, vkpVar17.a());
        agjz agjzVar3 = new agjz(4);
        Set set2 = vkn.c;
        synchronized (set2) {
            agjzVar3.j((Iterable) Collection.EL.stream(set2).map(new ush(18)).flatMap(new ush(19)).collect(aghu.a));
        }
        agjz agjzVar4 = new agjz(4);
        agjzVar4.j(agkeVarX);
        agjzVar4.j(agjzVar3.g());
        Iterable$EL.forEach(agjzVar4.g(), new usf(zsVar2, 18));
        zs zsVar3 = new zs((byte[]) null, (byte[]) null, (char[]) null);
        vkm vkmVar = new vkm(zsVar2, zsVar3, (vko) zsVar.a);
        vkmVar.execute(context);
        if (zD) {
            agkeVar = vkn.f;
            auirVar = vkn.b;
        } else {
            agkeVar = vkn.e;
            auirVar = vkn.a;
        }
        return new vkr(zsVar2, agkeVar, auirVar, vkmVar, ape.f(new sdf(zsVar3, 7)), zD);
    }

    public static wdc u(Context context, hhb hhbVar, tbt tbtVar, zwb zwbVar, Executor executor, Object obj) {
        return new wdc(context, hhbVar, tbtVar, zwbVar, executor, (wjr) obj);
    }

    public static xdb v(cf cfVar, vwt vwtVar, ahey aheyVar, acxn acxnVar, adhv adhvVar, avmb avmbVar, xsc xscVar, ahgb ahgbVar, ttm ttmVar, vxe vxeVar, mbc mbcVar, wrb wrbVar, Executor executor, zvl zvlVar, vxz vxzVar, xit xitVar) {
        cfVar.getClass();
        vwtVar.getClass();
        aheyVar.getClass();
        acxnVar.getClass();
        adhvVar.getClass();
        avmbVar.getClass();
        xscVar.getClass();
        ahgbVar.getClass();
        ttmVar.getClass();
        vxeVar.getClass();
        mbcVar.getClass();
        wrbVar.getClass();
        executor.getClass();
        zvlVar.getClass();
        vxzVar.getClass();
        xitVar.getClass();
        return new xdb(cfVar, vwtVar, aheyVar, acxnVar, adhvVar, avmbVar, xscVar, vxeVar, zvlVar, new aaok(mbcVar, acxnVar), vxzVar, xitVar);
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}
