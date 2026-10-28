package defpackage;

import android.content.Context;
import android.text.Spanned;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acwq {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/rendering/dialog/ModernConfirmDialogPresenterImpl");
    private final Context b;
    private final bog c;
    private final zwb d;
    private final zvl e;
    private final syn f;

    public acwq(Context context, bog bogVar, zwb zwbVar, syn synVar, zvl zvlVar) {
        this.b = context;
        this.c = bogVar;
        this.d = zwbVar;
        this.f = synVar;
        this.e = zvlVar;
    }

    public final Optional a() {
        Context context = this.b;
        if (!(context instanceof cf)) {
            return Optional.empty();
        }
        cc ccVarG = ((cf) context).getSupportFragmentManager().g("ConfirmDialogFragment");
        return !(ccVarG instanceof bp) ? Optional.empty() : Optional.of((bp) ccVarG);
    }

    public final void b(String str, Throwable th) {
        ((agrc) ((agrc) ((agrc) a.b()).j(th)).k("com/google/android/libraries/youtube/rendering/dialog/ModernConfirmDialogPresenterImpl", "logErrorAndShowToast", (char) 251, "ModernConfirmDialogPresenterImpl.java")).w("%s", str);
        tuk.n(this.b, R.string.common_error_generic, 0);
    }

    public final void c(affd affdVar, acwy acwyVar, acwv acwvVar, acwm acwmVar) {
        Context context = this.b;
        if (context instanceof cf) {
            cf cfVar = (cf) context;
            dd supportFragmentManager = cfVar.getSupportFragmentManager();
            if (cfVar.isDestroyed() || cfVar.isFinishing() || supportFragmentManager.A || supportFragmentManager.ad()) {
                return;
            }
            try {
                acwz acwzVar = new acwz();
                auom.f(acwzVar);
                afpu.e(acwzVar, affdVar);
                afpl.b(acwzVar, acwyVar);
                acwzVar.iR(acwyVar.e);
                acwzVar.h(supportFragmentManager, "ConfirmDialogFragment");
                if (acwvVar != null) {
                    acwzVar.peer().e = acwvVar.e;
                    acwzVar.peer().f = acwvVar.f;
                } else if (acwmVar != null) {
                    acwzVar.peer().e = acwmVar;
                }
            } catch (IllegalStateException e) {
                zvl zvlVar = this.e;
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
                zvjVarA.d("Error showing native modern dialog");
                zvjVarA.f(e);
                zvlVar.a(zvjVarA.a());
            }
        }
    }

    public final void d(acwv acwvVar) {
        acwq acwqVar;
        aihf aihfVarCreateBuilder = acwy.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        acwy acwyVar = (acwy) aihfVarCreateBuilder.instance;
        acwyVar.b |= 2;
        acwyVar.e = acwvVar.b;
        akdd akddVar = acwvVar.a;
        alay alayVar = akddVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        Spanned spannedK = ackj.k(null, alayVar, null, false);
        if (spannedK != null) {
            String string = spannedK.toString();
            aihfVarCreateBuilder.copyOnWrite();
            acwy acwyVar2 = (acwy) aihfVarCreateBuilder.instance;
            string.getClass();
            acwyVar2.b |= 1;
            acwyVar2.c = string;
        }
        if (akddVar.f.size() > 0) {
            aiie aiieVar = akddVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            acwy acwyVar3 = (acwy) aihfVarCreateBuilder.instance;
            acwyVar3.a();
            aifs.addAll(aiieVar, acwyVar3.d);
        }
        ajnf ajnfVarB = acfz.B(akddVar);
        if (ajnfVarB != null) {
            ajnf ajnfVarG = acfz.G((aihh) ajnfVarB.toBuilder());
            aihfVarCreateBuilder.copyOnWrite();
            acwy acwyVar4 = (acwy) aihfVarCreateBuilder.instance;
            ajnfVarG.getClass();
            acwyVar4.g = ajnfVarG;
            acwyVar4.b |= 8;
        }
        ajnf ajnfVarA = acfz.A(akddVar);
        if (ajnfVarA != null) {
            ajnf ajnfVarF = acfz.F((aihh) ajnfVarA.toBuilder());
            aihfVarCreateBuilder.copyOnWrite();
            acwy acwyVar5 = (acwy) aihfVarCreateBuilder.instance;
            ajnfVarF.getClass();
            acwyVar5.f = ajnfVarF;
            acwyVar5.b |= 4;
        }
        ajwo ajwoVar = acwvVar.h;
        if (ajwoVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            acwy acwyVar6 = (acwy) aihfVarCreateBuilder.instance;
            acwyVar6.h = ajwoVar;
            acwyVar6.b |= 16;
        }
        if (akddVar.k.size() > 0) {
            aiie aiieVar2 = akddVar.k;
            aihfVarCreateBuilder.copyOnWrite();
            acwy acwyVar7 = (acwy) aihfVarCreateBuilder.instance;
            aiie aiieVar3 = acwyVar7.i;
            if (!aiieVar3.c()) {
                acwyVar7.i = aihn.mutableCopy(aiieVar3);
            }
            aifs.addAll(aiieVar2, acwyVar7.i);
        }
        try {
            acwqVar = this;
            try {
                taf.m(this.c, this.f.n(this.d.e()), new aasz(this, 18), new gyr(acwqVar, aihfVarCreateBuilder, acwvVar, 20, (byte[]) null));
            } catch (RuntimeException e) {
                e = e;
                acwqVar.b("Something went wrong getting account ID", e);
            }
        } catch (RuntimeException e2) {
            e = e2;
            acwqVar = this;
        }
    }

    @Deprecated
    public final void e(mfx mfxVar) {
        boolean z = !Objects.equals(mfxVar.l, Boolean.FALSE);
        aihf aihfVarCreateBuilder = acwy.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        acwy acwyVar = (acwy) aihfVarCreateBuilder.instance;
        acwyVar.b |= 2;
        acwyVar.e = z;
        String str = mfxVar.a;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            acwy acwyVar2 = (acwy) aihfVarCreateBuilder.instance;
            acwyVar2.b |= 1;
            acwyVar2.c = str;
        }
        String str2 = mfxVar.b;
        if (str2 != null) {
            aihfVarCreateBuilder.ah(ackj.c(str2));
        }
        aihh aihhVarH = acfz.H(mfxVar.c, mfxVar.e);
        if (aihhVarH != null) {
            ajnf ajnfVarG = acfz.G(aihhVarH);
            aihfVarCreateBuilder.copyOnWrite();
            acwy acwyVar3 = (acwy) aihfVarCreateBuilder.instance;
            ajnfVarG.getClass();
            acwyVar3.g = ajnfVarG;
            acwyVar3.b |= 8;
        }
        aihh aihhVarH2 = acfz.H(mfxVar.d, mfxVar.f);
        int i = 4;
        if (aihhVarH2 != null) {
            ajnf ajnfVarF = acfz.F(aihhVarH2);
            aihfVarCreateBuilder.copyOnWrite();
            acwy acwyVar4 = (acwy) aihfVarCreateBuilder.instance;
            ajnfVarF.getClass();
            acwyVar4.f = ajnfVarF;
            acwyVar4.b |= 4;
        }
        ajwo ajwoVarD = aecm.D(mfxVar);
        if (ajwoVarD != null) {
            aihfVarCreateBuilder.copyOnWrite();
            acwy acwyVar5 = (acwy) aihfVarCreateBuilder.instance;
            acwyVar5.h = ajwoVarD;
            acwyVar5.b |= 16;
        }
        try {
            taf.m(this.c, this.f.n(this.d.e()), new aasz(this, 17), new acnq(this, aihfVarCreateBuilder, i));
        } catch (RuntimeException e) {
            b("Something went wrong getting account ID", e);
        }
    }

    public final void f(acww acwwVar) {
        try {
            taf.m(this.c, this.f.n(this.d.e()), new aasz(this, 19), new acnq(this, acwwVar, 5));
        } catch (RuntimeException e) {
            b("Something went wrong getting account ID", e);
        }
    }
}
