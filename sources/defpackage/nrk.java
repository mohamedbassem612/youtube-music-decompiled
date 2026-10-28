package defpackage;

import j$.time.Duration;
import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nrk {
    public static final aixl a(int i) {
        if (i == 0) {
            return aixl.PHASE_AD_PLAYBACK_TERMINATION_EVENT_AD_PLAYBACK_ENDED_NORMAL;
        }
        if (i == 1) {
            return aixl.PHASE_AD_PLAYBACK_TERMINATION_EVENT_AD_PLAYBACK_ENDED_ERROR;
        }
        if (i != 2) {
            return i != 4 ? aixl.PHASE_AD_PLAYBACK_TERMINATION_EVENT_UNSPECIFIED : aixl.PHASE_AD_PLAYBACK_TERMINATION_EVENT_AD_PLAYBACK_ENDED_ABANDONED;
        }
        return aixl.PHASE_AD_PLAYBACK_TERMINATION_EVENT_AD_PLAYBACK_ENDED_SKIP;
    }

    public static final void b(spv spvVar, smr smrVar, skh skhVar, aixn aixnVar, Object obj, sko skoVar) {
        spvVar.getClass();
        obj.getClass();
        c(spvVar, smrVar, skhVar, aixnVar, obj, skoVar, 0);
    }

    public static final void c(spv spvVar, smr smrVar, skh skhVar, aixn aixnVar, Object obj, sko skoVar, int i) {
        spvVar.getClass();
        slz slzVar = skhVar.b;
        String str = slzVar != null ? slzVar.a : "";
        sgu sguVar = skhVar.c;
        aihf aihfVarCreateBuilder = aixv.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aixv aixvVar = (aixv) aihfVarCreateBuilder.instance;
        aixvVar.b |= 1;
        aixvVar.e = sguVar.a;
        aihfVarCreateBuilder.copyOnWrite();
        aixv aixvVar2 = (aixv) aihfVarCreateBuilder.instance;
        aixvVar2.b |= 2;
        aixvVar2.f = str;
        Objects.checkIndex(0, 4);
        if (obj instanceof aixk) {
            aihfVarCreateBuilder.copyOnWrite();
            aixv aixvVar3 = (aixv) aihfVarCreateBuilder.instance;
            aixvVar3.d = Integer.valueOf(((aixk) obj).h);
            aixvVar3.c = 4;
        } else if (obj instanceof aixj) {
            aihfVarCreateBuilder.copyOnWrite();
            aixv aixvVar4 = (aixv) aihfVarCreateBuilder.instance;
            aixvVar4.d = Integer.valueOf(((aixj) obj).g);
            aixvVar4.c = 5;
        } else if (obj instanceof aixl) {
            aihfVarCreateBuilder.copyOnWrite();
            aixv aixvVar5 = (aixv) aihfVarCreateBuilder.instance;
            aixvVar5.d = Integer.valueOf(((aixl) obj).g);
            aixvVar5.c = 6;
        }
        if (i != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            aixv aixvVar6 = (aixv) aihfVarCreateBuilder.instance;
            aixvVar6.g = acfz.bu(i);
            aixvVar6.b |= 4;
        }
        aihf aihfVarCreateBuilder2 = aizg.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aizg aizgVar = (aizg) aihfVarCreateBuilder2.instance;
        aizgVar.e = aixnVar.C;
        aizgVar.b |= 1;
        aixv aixvVar7 = (aixv) aihfVarCreateBuilder.build();
        aihfVarCreateBuilder2.copyOnWrite();
        aizg aizgVar2 = (aizg) aihfVarCreateBuilder2.instance;
        aixvVar7.getClass();
        aizgVar2.d = aixvVar7;
        aizgVar2.c = 12;
        aihn aihnVarBuild = aihfVarCreateBuilder2.build();
        aihnVarBuild.getClass();
        spvVar.a((aizg) aihnVarBuild, skhVar, smrVar, skoVar);
    }

    public static void d(sol solVar, sgv sgvVar, apzz apzzVar, amud amudVar, sgn sgnVar, wjf wjfVar, slm slmVar, boolean z, int i, int i2, boolean z2, boolean z3) {
        int i3;
        soy soyVarB = soz.b();
        if (apzzVar != null) {
            soyVarB.o(apzzVar);
        }
        if (amudVar != null) {
            int i4 = amudVar.c;
            if ((i4 & 1) != 0) {
                if ((i4 & 8) != 0) {
                    ajuz ajuzVar = amudVar.h;
                    if (ajuzVar == null) {
                        ajuzVar = ajuz.a;
                    }
                    i3 = ajuzVar.d;
                } else {
                    i3 = 0;
                }
                aihh aihhVar = (aihh) ajuz.a.createBuilder();
                aihhVar.copyOnWrite();
                ajuz ajuzVar2 = (ajuz) aihhVar.instance;
                ajuzVar2.b |= 1;
                ajuzVar2.c = 31738;
                aihhVar.copyOnWrite();
                ajuz ajuzVar3 = (ajuz) aihhVar.instance;
                ajuzVar3.b |= 2;
                ajuzVar3.d = i3;
                ajuz ajuzVar4 = (ajuz) aihhVar.build();
                aihf aihfVarCreateBuilder = argh.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                argh arghVar = (argh) aihfVarCreateBuilder.instance;
                arghVar.b |= 1;
                arghVar.c = 4L;
                argh arghVar2 = (argh) aihfVarCreateBuilder.build();
                aihh aihhVar2 = (aihh) amud.b.createBuilder();
                aihhVar2.copyOnWrite();
                amud amudVar2 = (amud) aihhVar2.instance;
                ajuzVar4.getClass();
                amudVar2.h = ajuzVar4;
                amudVar2.c |= 8;
                aihhVar2.copyOnWrite();
                amud amudVar3 = (amud) aihhVar2.instance;
                arghVar2.getClass();
                amudVar3.e = arghVar2;
                amudVar3.c |= 2;
                aigj aigjVar = amudVar.d;
                aihhVar2.copyOnWrite();
                amud amudVar4 = (amud) aihhVar2.instance;
                aigjVar.getClass();
                amudVar4.c |= 1;
                amudVar4.d = aigjVar;
                soyVarB.e((amud) aihhVar2.build());
            }
        }
        soyVarB.b(sgnVar);
        soyVarB.f(new spb(wjfVar.F(), wjfVar.af()));
        boolean z4 = z && i > 7;
        soyVarB.p(true != z4 ? 2 : 0);
        if (z4) {
            soyVarB.s(i2);
        }
        soyVarB.q((int) TimeUnit.MILLISECONDS.convert(i, TimeUnit.SECONDS));
        soyVarB.i(z2);
        soyVarB.d(slmVar);
        soyVarB.h(z3);
        if (z4 && sgvVar.b) {
            float f = sgvVar.c;
            int i5 = sgvVar.d;
            if (f == 0.0f || i5 == 0) {
                zvp.a(zvn.b, zvm.a, String.format(Locale.ENGLISH, "Unexpected custom dimensions: scaling factor %f, padding %d", Float.valueOf(f), Integer.valueOf(i5)));
            } else {
                soyVarB.g(true);
                soyVarB.n(f);
                soyVarB.m(i5);
            }
        }
        solVar.a = soyVarB.a();
    }

    public static boolean e(sol solVar, abnr abnrVar) {
        boolean z = solVar.f().j;
        boolean z2 = abnrVar == abnr.FULLSCREEN;
        if (z == z2) {
            return false;
        }
        soy soyVarA = solVar.f().a();
        soyVarA.j(z2);
        solVar.a = soyVarA.a();
        return true;
    }

    public static boolean f(sol solVar) {
        if (solVar.f().d == 2 || solVar.f().e) {
            return false;
        }
        soy soyVarA = solVar.f().a();
        soyVarA.k(true);
        solVar.a = soyVarA.a();
        return true;
    }

    public static boolean g(sol solVar, int i, int i2, int i3, boolean z, boolean z2, Duration duration) {
        soz sozVarF = solVar.f();
        soy soyVarA = sozVarF.a();
        soyVarA.q(((int) TimeUnit.MILLISECONDS.convert(i, TimeUnit.SECONDS)) - i2);
        soyVarA.c(z);
        soyVarA.l(z2);
        soyVarA.r(duration.minusMillis(i2));
        boolean z3 = false;
        if (sozVarF.d != 0) {
            solVar.a = soyVarA.a();
        } else {
            int i4 = i3 - i2;
            if (i4 <= 0) {
                soyVarA.p(1);
                soyVarA.s(0);
                z3 = true;
            } else {
                soyVarA.s(i4);
            }
            solVar.a = soyVarA.a();
        }
        return z3;
    }

    public static boolean h(sol solVar, int i, int i2, int i3) {
        return g(solVar, i, i2, i3, false, false, Duration.ZERO);
    }
}
