package defpackage;

import android.content.Context;
import android.text.Annotation;
import android.text.Spanned;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class hqz extends awpk implements awqk {
    Object a;
    int b;
    final /* synthetic */ hra c;
    final /* synthetic */ Runnable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqz(hra hraVar, Runnable runnable, awoq awoqVar) {
        super(2, awoqVar);
        this.c = hraVar;
        this.d = runnable;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new hqz(this.c, this.d, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((hqz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:31:0x0130  */
    /* JADX WARN: Code duplicated, block: B:32:0x0134  */
    /* JADX WARN: Code duplicated, block: B:35:0x0138  */
    /* JADX WARN: Code duplicated, block: B:36:0x0167  */
    /* JADX WARN: Code duplicated, block: B:38:0x0175  */
    /* JADX WARN: Code duplicated, block: B:41:0x0179  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x0244  */
    /* JADX WARN: Code duplicated, block: B:64:0x0270  */
    /* JADX WARN: Code duplicated, block: B:72:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        affd affdVar;
        Object objAd;
        Object obj2;
        CharSequence text;
        xgm xgmVar;
        Spanned spanned;
        Annotation[] annotationArr;
        xgm xgmVar2;
        alay alayVarI;
        int i;
        Annotation annotation;
        int spanStart;
        Annotation annotation2;
        ListenableFuture listenableFutureJ;
        hra hraVar;
        hqx hqxVar;
        Object objAd2;
        awox awoxVar = awox.a;
        int i2 = this.b;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    atqp.j(obj);
                    objAd2 = obj;
                } else if (i2 == 2 || i2 != 3) {
                    atqp.j(obj);
                } else {
                    Object obj3 = this.a;
                    atqp.j(obj);
                    objAd = obj;
                    obj2 = obj3;
                    obj2 = iqkVarF;
                    objAd.getClass();
                    if (((Number) objAd).intValue() >= 2) {
                        hraVar = this.c;
                        hqxVar = new hqx(this.d, (awoq) null, 3, (char[]) null);
                        this.a = null;
                        this.b = 4;
                        if (awro.p(hraVar.h, hqxVar, this) == awoxVar) {
                            return awoxVar;
                        }
                    } else {
                        hqw hqwVar = new hqw();
                        hra hraVar2 = this.c;
                        hraVar2.k.m(hqwVar, "");
                        acwq acwqVar = (acwq) hraVar2.e.io();
                        Runnable runnable = this.d;
                        Context context = hraVar2.d;
                        acwf acwfVarT = acww.t();
                        acwfVarT.a = context.getString(R.string.download_now_dialog_title);
                        text = context.getText(R.string.download_now_dialog_message);
                        text.getClass();
                        aihh aihhVar = (aihh) ajwo.a.createBuilder();
                        aihhVar.getClass();
                        aihl aihlVar = aklz.b;
                        aihlVar.getClass();
                        aihf aihfVarCreateBuilder = aklz.a.createBuilder();
                        aihfVarCreateBuilder.getClass();
                        xgmVar = hraVar2.g;
                        ajwo ajwoVarA = ixt.A();
                        xgj xgjVar = hra.c;
                        Object obj4 = obj2;
                        ajwo ajwoVarC = ixt.C(ajwoVarA, xgjVar, xgmVar.hB());
                        ajwoVarC.getClass();
                        aihfVarCreateBuilder.copyOnWrite();
                        aklz aklzVar = (aklz) aihfVarCreateBuilder.instance;
                        aklzVar.e = ajwoVarC;
                        aklzVar.c |= 2;
                        aihn aihnVarBuild = aihfVarCreateBuilder.build();
                        aihnVarBuild.getClass();
                        aihhVar.e(aihlVar, (aklz) aihnVarBuild);
                        ajwo ajwoVarW = atqp.W(aihhVar);
                        if (text instanceof Spanned) {
                            spanned = (Spanned) text;
                        } else {
                            spanned = null;
                        }
                        if (spanned == null) {
                            aihh aihhVar2 = (aihh) alay.a.createBuilder();
                            aihhVar2.getClass();
                            afyd.J(aihhVar2);
                            aihh aihhVar3 = (aihh) alba.a.createBuilder();
                            aihhVar3.getClass();
                            acfz.aQ(text.toString(), aihhVar3);
                            aihhVar2.f(acfz.aP(aihhVar3));
                            alayVarI = afyd.I(aihhVar2);
                            xgmVar2 = xgmVar;
                        } else {
                            annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                            if (annotationArr != null) {
                                i = 0;
                                while (true) {
                                    if (i < annotationArr.length) {
                                        xgmVar2 = xgmVar;
                                        annotation = null;
                                        break;
                                    }
                                    annotation2 = annotationArr[i];
                                    xgmVar2 = xgmVar;
                                    if (!awrc.c(annotation2.getKey(), "id") && awrc.c(annotation2.getValue(), "settings_link")) {
                                        annotation = annotation2;
                                        break;
                                    }
                                    i++;
                                    xgmVar = xgmVar2;
                                }
                                if (annotation != null) {
                                    spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    if (spanStart >= 0 || spanEnd < spanStart || spanEnd > text.length()) {
                                        aihh aihhVar4 = (aihh) alay.a.createBuilder();
                                        aihhVar4.getClass();
                                        afyd.J(aihhVar4);
                                        aihh aihhVar5 = (aihh) alba.a.createBuilder();
                                        aihhVar5.getClass();
                                        acfz.aQ(text.toString(), aihhVar5);
                                        aihhVar4.f(acfz.aP(aihhVar5));
                                        alayVarI = afyd.I(aihhVar4);
                                    } else {
                                        aihh aihhVar6 = (aihh) alay.a.createBuilder();
                                        aihhVar6.getClass();
                                        if (spanStart > 0) {
                                            afyd.J(aihhVar6);
                                            aihh aihhVar7 = (aihh) alba.a.createBuilder();
                                            aihhVar7.getClass();
                                            acfz.aQ(text.subSequence(0, spanStart).toString(), aihhVar7);
                                            aihhVar6.f(acfz.aP(aihhVar7));
                                        }
                                        if (spanStart < spanEnd) {
                                            afyd.J(aihhVar6);
                                            aihh aihhVar8 = (aihh) alba.a.createBuilder();
                                            aihhVar8.getClass();
                                            acfz.aQ(text.subSequence(spanStart, spanEnd).toString(), aihhVar8);
                                            aihhVar8.copyOnWrite();
                                            alba albaVar = (alba) aihhVar8.instance;
                                            albaVar.l = ajwoVarW;
                                            albaVar.b |= SemanticState.Modal;
                                            aihhVar6.f(acfz.aP(aihhVar8));
                                        }
                                        if (spanEnd < text.length()) {
                                            afyd.J(aihhVar6);
                                            aihh aihhVar9 = (aihh) alba.a.createBuilder();
                                            aihhVar9.getClass();
                                            acfz.aQ(text.subSequence(spanEnd, text.length()).toString(), aihhVar9);
                                            aihhVar6.f(acfz.aP(aihhVar9));
                                        }
                                        alayVarI = afyd.I(aihhVar6);
                                    }
                                }
                            } else {
                                xgmVar2 = xgmVar;
                            }
                            aihh aihhVar10 = (aihh) alay.a.createBuilder();
                            aihhVar10.getClass();
                            afyd.J(aihhVar10);
                            aihh aihhVar11 = (aihh) alba.a.createBuilder();
                            aihhVar11.getClass();
                            acfz.aQ(text.toString(), aihhVar11);
                            aihhVar10.f(acfz.aP(aihhVar11));
                            alayVarI = afyd.I(aihhVar10);
                        }
                        acwfVarT.b = alayVarI;
                        String string = context.getString(R.string.confirm_download);
                        ajnf ajnfVar = ajnf.a;
                        aihh aihhVar12 = (aihh) ajnfVar.createBuilder();
                        alay alayVarC = ackj.c(string);
                        aihhVar12.copyOnWrite();
                        ajnf ajnfVar2 = (ajnf) aihhVar12.instance;
                        alayVarC.getClass();
                        ajnfVar2.m = alayVarC;
                        ajnfVar2.b |= 64;
                        acwfVarT.c = acfz.G(aihhVar12);
                        String string2 = context.getString(R.string.dialog_negative_text);
                        aihh aihhVar13 = (aihh) ajnfVar.createBuilder();
                        alay alayVarC2 = ackj.c(string2);
                        aihhVar13.copyOnWrite();
                        ajnf ajnfVar3 = (ajnf) aihhVar13.instance;
                        alayVarC2.getClass();
                        ajnfVar3.m = alayVarC2;
                        ajnfVar3.b |= 64;
                        acwfVarT.d = acfz.F(aihhVar13);
                        acwfVarT.f = new hqy(hraVar2, runnable, hqwVar, 0);
                        acwqVar.f(acwfVarT.a());
                        xgn xgnVarHB = xgmVar2.hB();
                        xgnVarHB.l(hra.a);
                        xgnVarHB.l(hra.b);
                        xgnVarHB.l(xgjVar);
                        listenableFutureJ = ((ayq) ((iqk) obj4).a.io()).j(new iqi(1));
                        this.a = null;
                        this.b = 5;
                        if (awrc.ad(listenableFutureJ, this) == awoxVar) {
                            return awoxVar;
                        }
                    }
                }
                return awmy.a;
            }
            atqp.j(obj);
            hra hraVar3 = this.c;
            ListenableFuture listenableFutureN = hraVar3.j.n(hraVar3.f.e());
            this.b = 1;
            objAd2 = awrc.ad(listenableFutureN, this);
            if (objAd2 == awoxVar) {
                return awoxVar;
            }
            affdVar = (affd) objAd2;
        } catch (Exception unused) {
            affdVar = null;
        }
        hra hraVar4 = this.c;
        if (affdVar == null) {
            hqx hqxVar2 = new hqx(this.d, (awoq) null, 2, (byte[]) null);
            this.b = 2;
            if (awro.p(hraVar4.h, hqxVar2, this) == awoxVar) {
                return awoxVar;
            }
        } else {
            iqk iqkVarF = ((hqv) aguu.aw(hraVar4.d, hqv.class, affdVar)).f();
            ListenableFuture listenableFutureAr = ahno.ar(((ayq) iqkVarF.a.io()).i(), new iam(18), iqkVarF.b);
            this.a = iqkVarF;
            this.b = 3;
            objAd = awrc.ad(listenableFutureAr, this);
            if (objAd == awoxVar) {
                obj2 = iqkVarF;
                return awoxVar;
            }
            obj2 = iqkVarF;
            objAd.getClass();
            if (((Number) objAd).intValue() >= 2) {
                hraVar = this.c;
                hqxVar = new hqx(this.d, (awoq) null, 3, (char[]) null);
                this.a = null;
                this.b = 4;
                if (awro.p(hraVar.h, hqxVar, this) == awoxVar) {
                    return awoxVar;
                }
            } else {
                hqw hqwVar2 = new hqw();
                hra hraVar5 = this.c;
                hraVar5.k.m(hqwVar2, "");
                acwq acwqVar2 = (acwq) hraVar5.e.io();
                Runnable runnable2 = this.d;
                Context context2 = hraVar5.d;
                acwf acwfVarT2 = acww.t();
                acwfVarT2.a = context2.getString(R.string.download_now_dialog_title);
                text = context2.getText(R.string.download_now_dialog_message);
                text.getClass();
                aihh aihhVar14 = (aihh) ajwo.a.createBuilder();
                aihhVar14.getClass();
                aihl aihlVar2 = aklz.b;
                aihlVar2.getClass();
                aihf aihfVarCreateBuilder2 = aklz.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                xgmVar = hraVar5.g;
                ajwo ajwoVarA2 = ixt.A();
                xgj xgjVar2 = hra.c;
                Object obj5 = obj2;
                ajwo ajwoVarC2 = ixt.C(ajwoVarA2, xgjVar2, xgmVar.hB());
                ajwoVarC2.getClass();
                aihfVarCreateBuilder2.copyOnWrite();
                aklz aklzVar2 = (aklz) aihfVarCreateBuilder2.instance;
                aklzVar2.e = ajwoVarC2;
                aklzVar2.c |= 2;
                aihn aihnVarBuild2 = aihfVarCreateBuilder2.build();
                aihnVarBuild2.getClass();
                aihhVar14.e(aihlVar2, (aklz) aihnVarBuild2);
                ajwo ajwoVarW2 = atqp.W(aihhVar14);
                if (text instanceof Spanned) {
                    spanned = (Spanned) text;
                } else {
                    spanned = null;
                }
                if (spanned == null) {
                    aihh aihhVar15 = (aihh) alay.a.createBuilder();
                    aihhVar15.getClass();
                    afyd.J(aihhVar15);
                    aihh aihhVar16 = (aihh) alba.a.createBuilder();
                    aihhVar16.getClass();
                    acfz.aQ(text.toString(), aihhVar16);
                    aihhVar15.f(acfz.aP(aihhVar16));
                    alayVarI = afyd.I(aihhVar15);
                    xgmVar2 = xgmVar;
                } else {
                    annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                    if (annotationArr != null) {
                        i = 0;
                        while (true) {
                            if (i < annotationArr.length) {
                                xgmVar2 = xgmVar;
                                annotation = null;
                                break;
                            }
                            annotation2 = annotationArr[i];
                            xgmVar2 = xgmVar;
                            if (!awrc.c(annotation2.getKey(), "id")) {
                            }
                            i++;
                            xgmVar = xgmVar2;
                        }
                        if (annotation != null) {
                            spanStart = spanned.getSpanStart(annotation);
                            int spanEnd2 = spanned.getSpanEnd(annotation);
                            if (spanStart >= 0) {
                                aihh aihhVar17 = (aihh) alay.a.createBuilder();
                                aihhVar17.getClass();
                                afyd.J(aihhVar17);
                                aihh aihhVar18 = (aihh) alba.a.createBuilder();
                                aihhVar18.getClass();
                                acfz.aQ(text.toString(), aihhVar18);
                                aihhVar17.f(acfz.aP(aihhVar18));
                                alayVarI = afyd.I(aihhVar17);
                            } else {
                                aihh aihhVar19 = (aihh) alay.a.createBuilder();
                                aihhVar19.getClass();
                                afyd.J(aihhVar19);
                                aihh aihhVar110 = (aihh) alba.a.createBuilder();
                                aihhVar110.getClass();
                                acfz.aQ(text.toString(), aihhVar110);
                                aihhVar19.f(acfz.aP(aihhVar110));
                                alayVarI = afyd.I(aihhVar19);
                            }
                        }
                    } else {
                        xgmVar2 = xgmVar;
                    }
                    aihh aihhVar111 = (aihh) alay.a.createBuilder();
                    aihhVar111.getClass();
                    afyd.J(aihhVar111);
                    aihh aihhVar112 = (aihh) alba.a.createBuilder();
                    aihhVar112.getClass();
                    acfz.aQ(text.toString(), aihhVar112);
                    aihhVar111.f(acfz.aP(aihhVar112));
                    alayVarI = afyd.I(aihhVar111);
                }
                acwfVarT2.b = alayVarI;
                String string3 = context2.getString(R.string.confirm_download);
                ajnf ajnfVar4 = ajnf.a;
                aihh aihhVar113 = (aihh) ajnfVar4.createBuilder();
                alay alayVarC3 = ackj.c(string3);
                aihhVar113.copyOnWrite();
                ajnf ajnfVar5 = (ajnf) aihhVar113.instance;
                alayVarC3.getClass();
                ajnfVar5.m = alayVarC3;
                ajnfVar5.b |= 64;
                acwfVarT2.c = acfz.G(aihhVar113);
                String string4 = context2.getString(R.string.dialog_negative_text);
                aihh aihhVar114 = (aihh) ajnfVar4.createBuilder();
                alay alayVarC4 = ackj.c(string4);
                aihhVar114.copyOnWrite();
                ajnf ajnfVar6 = (ajnf) aihhVar114.instance;
                alayVarC4.getClass();
                ajnfVar6.m = alayVarC4;
                ajnfVar6.b |= 64;
                acwfVarT2.d = acfz.F(aihhVar114);
                acwfVarT2.f = new hqy(hraVar5, runnable2, hqwVar2, 0);
                acwqVar2.f(acwfVarT2.a());
                xgn xgnVarHB2 = xgmVar2.hB();
                xgnVarHB2.l(hra.a);
                xgnVarHB2.l(hra.b);
                xgnVarHB2.l(xgjVar2);
                listenableFutureJ = ((ayq) ((iqk) obj5).a.io()).j(new iqi(1));
                this.a = null;
                this.b = 5;
                if (awrc.ad(listenableFutureJ, this) == awoxVar) {
                    return awoxVar;
                }
            }
        }
        return awmy.a;
    }
}
