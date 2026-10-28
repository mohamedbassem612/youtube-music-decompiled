package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.blocks.runtime.RuntimeSignal;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class hon extends awpk implements awqk {
    Object a;
    Object b;
    int c;
    final /* synthetic */ hoo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hon(hoo hooVar, awoq awoqVar) {
        super(2, awoqVar);
        this.d = hooVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new hon(this.d, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((hon) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[Catch: Exception -> 0x019c, TRY_LEAVE, TryCatch #0 {Exception -> 0x019c, blocks: (B:8:0x0017, B:28:0x008c, B:30:0x0096, B:48:0x0194, B:49:0x019b, B:26:0x0073), top: B:53:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x0102  */
    /* JADX WARN: Code duplicated, block: B:48:0x0194 A[Catch: Exception -> 0x019c, TRY_ENTER, TryCatch #0 {Exception -> 0x019c, blocks: (B:8:0x0017, B:28:0x008c, B:30:0x0096, B:48:0x0194, B:49:0x019b, B:26:0x0073), top: B:53:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        RuntimeSignal runtimeSignal;
        Object objAd;
        Object obj3;
        weh wehVar;
        annv annvVar;
        List listH;
        List listE;
        List listG;
        List listK;
        List listI;
        List listJ;
        awox awoxVar = awox.a;
        int i = this.c;
        try {
            if (i != 0) {
                if (i == 1) {
                    obj2 = this.a;
                    atqp.j(obj);
                } else if (i != 2) {
                    obj3 = this.b;
                    obj2 = this.a;
                    atqp.j(obj);
                } else {
                    obj2 = this.a;
                    atqp.j(obj);
                    wehVar = (weh) awrc.f((Optional) obj);
                    if (wehVar != null) {
                        throw new IllegalStateException("Downloads library is null.");
                    }
                    annvVar = (annv) wehVar;
                    listH = annvVar.h();
                    listH.getClass();
                    if (listH.isEmpty()) {
                        listE = annvVar.e();
                        listE.getClass();
                        if (listE.isEmpty()) {
                            listG = annvVar.g();
                            listG.getClass();
                            if (listG.isEmpty()) {
                                listK = annvVar.k();
                                listK.getClass();
                                if (listK.isEmpty()) {
                                    listI = annvVar.i();
                                    listI.getClass();
                                    if (listI.isEmpty()) {
                                        listJ = annvVar.j();
                                        listJ.getClass();
                                        if (listJ.isEmpty()) {
                                            ((awri) obj2).a = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    hoo hooVar = this.d;
                    ListenableFuture listenableFutureA = hooVar.m.a();
                    this.a = obj2;
                    runtimeSignal = hooVar.p;
                    this.b = runtimeSignal;
                    this.c = 3;
                    objAd = awrc.ad(listenableFutureA, this);
                    if (objAd == awoxVar) {
                        return awoxVar;
                    }
                    obj3 = runtimeSignal;
                    obj = objAd;
                }
                hoo hooVar2 = this.d;
                agab agabVar = (agab) obj;
                aihf aihfVarCreateBuilder = asfo.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                boolean z = ((awri) obj2).a;
                aihfVarCreateBuilder.copyOnWrite();
                asfo asfoVar = (asfo) aihfVarCreateBuilder.instance;
                asfoVar.b |= 1;
                asfoVar.c = z;
                Context context = hooVar2.d;
                String string = context.getString(R.string.smart_downloads_promo_title);
                string.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                asfo asfoVar2 = (asfo) aihfVarCreateBuilder.instance;
                asfoVar2.b |= 2;
                asfoVar2.d = string;
                String string2 = context.getString(R.string.smart_downloads_promo_subtitle);
                string2.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                asfo asfoVar3 = (asfo) aihfVarCreateBuilder.instance;
                asfoVar3.b |= 4;
                asfoVar3.e = string2;
                String string3 = context.getString(R.string.smart_downloads_promo_action_button_a11y_text);
                string3.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                asfo asfoVar4 = (asfo) aihfVarCreateBuilder.instance;
                asfoVar4.b |= 8;
                asfoVar4.f = string3;
                aihn aihnVarBuild = aihfVarCreateBuilder.build();
                aihnVarBuild.getClass();
                agabVar.i();
                asfn asfnVar = asfn.a;
                ((RuntimeSignal) obj3).b((asfn) agabVar.f(1424173928, (asfo) aihnVarBuild, aihn.getParserForClass(asfn.class)));
                return awmy.a;
            }
            atqp.j(obj);
            awri awriVar = new awri();
            hoo hooVar3 = this.d;
            if (!((jnm) hooVar3.h.io()).C() || hooVar3.f.g()) {
                awriVar.a = false;
                obj2 = awriVar;
                hoo hooVar4 = this.d;
                ListenableFuture listenableFutureA2 = hooVar4.m.a();
                this.a = obj2;
                runtimeSignal = hooVar4.p;
                this.b = runtimeSignal;
                this.c = 3;
                objAd = awrc.ad(listenableFutureA2, this);
                if (objAd == awoxVar) {
                    return awoxVar;
                }
                obj3 = runtimeSignal;
                obj = objAd;
                hoo hooVar5 = this.d;
                agab agabVar2 = (agab) obj;
                aihf aihfVarCreateBuilder2 = asfo.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                boolean z2 = ((awri) obj2).a;
                aihfVarCreateBuilder2.copyOnWrite();
                asfo asfoVar5 = (asfo) aihfVarCreateBuilder2.instance;
                asfoVar5.b |= 1;
                asfoVar5.c = z2;
                Context context2 = hooVar5.d;
                String string4 = context2.getString(R.string.smart_downloads_promo_title);
                string4.getClass();
                aihfVarCreateBuilder2.copyOnWrite();
                asfo asfoVar6 = (asfo) aihfVarCreateBuilder2.instance;
                asfoVar6.b |= 2;
                asfoVar6.d = string4;
                String string5 = context2.getString(R.string.smart_downloads_promo_subtitle);
                string5.getClass();
                aihfVarCreateBuilder2.copyOnWrite();
                asfo asfoVar7 = (asfo) aihfVarCreateBuilder2.instance;
                asfoVar7.b |= 4;
                asfoVar7.e = string5;
                String string6 = context2.getString(R.string.smart_downloads_promo_action_button_a11y_text);
                string6.getClass();
                aihfVarCreateBuilder2.copyOnWrite();
                asfo asfoVar8 = (asfo) aihfVarCreateBuilder2.instance;
                asfoVar8.b |= 8;
                asfoVar8.f = string6;
                aihn aihnVarBuild2 = aihfVarCreateBuilder2.build();
                aihnVarBuild2.getClass();
                agabVar2.i();
                asfn asfnVar2 = asfn.a;
                ((RuntimeSignal) obj3).b((asfn) agabVar2.f(1424173928, (asfo) aihnVarBuild2, aihn.getParserForClass(asfn.class)));
                return awmy.a;
            }
            ListenableFuture listenableFutureC = hooVar3.g.c();
            this.a = awriVar;
            this.c = 1;
            Object objAd2 = awrc.ad(listenableFutureC, this);
            if (objAd2 == awoxVar) {
                return awoxVar;
            }
            obj2 = awriVar;
            obj = objAd2;
            Long l = (Long) obj;
            if (l == null || l.longValue() != 0) {
                hpy hpyVar = this.d.b;
                String strAq = kro.aq();
                strAq.getClass();
                ListenableFuture listenableFutureA3 = hpyVar.a(strAq);
                this.a = obj2;
                this.c = 2;
                obj = awrc.ad(listenableFutureA3, this);
                if (obj == awoxVar) {
                    return awoxVar;
                }
                wehVar = (weh) awrc.f((Optional) obj);
                if (wehVar != null) {
                    throw new IllegalStateException("Downloads library is null.");
                }
                annvVar = (annv) wehVar;
                listH = annvVar.h();
                listH.getClass();
                if (listH.isEmpty()) {
                    listE = annvVar.e();
                    listE.getClass();
                    if (listE.isEmpty()) {
                        listG = annvVar.g();
                        listG.getClass();
                        if (listG.isEmpty()) {
                            listK = annvVar.k();
                            listK.getClass();
                            if (listK.isEmpty()) {
                                listI = annvVar.i();
                                listI.getClass();
                                if (listI.isEmpty()) {
                                    listJ = annvVar.j();
                                    listJ.getClass();
                                    if (listJ.isEmpty()) {
                                        ((awri) obj2).a = true;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                ((awri) obj2).a = true;
            }
            hoo hooVar6 = this.d;
            ListenableFuture listenableFutureA4 = hooVar6.m.a();
            this.a = obj2;
            runtimeSignal = hooVar6.p;
            this.b = runtimeSignal;
            this.c = 3;
            objAd = awrc.ad(listenableFutureA4, this);
            if (objAd == awoxVar) {
                return awoxVar;
            }
            obj3 = runtimeSignal;
            obj = objAd;
            hoo hooVar7 = this.d;
            agab agabVar3 = (agab) obj;
            aihf aihfVarCreateBuilder3 = asfo.a.createBuilder();
            aihfVarCreateBuilder3.getClass();
            boolean z3 = ((awri) obj2).a;
            aihfVarCreateBuilder3.copyOnWrite();
            asfo asfoVar9 = (asfo) aihfVarCreateBuilder3.instance;
            asfoVar9.b |= 1;
            asfoVar9.c = z3;
            Context context3 = hooVar7.d;
            String string7 = context3.getString(R.string.smart_downloads_promo_title);
            string7.getClass();
            aihfVarCreateBuilder3.copyOnWrite();
            asfo asfoVar10 = (asfo) aihfVarCreateBuilder3.instance;
            asfoVar10.b |= 2;
            asfoVar10.d = string7;
            String string8 = context3.getString(R.string.smart_downloads_promo_subtitle);
            string8.getClass();
            aihfVarCreateBuilder3.copyOnWrite();
            asfo asfoVar11 = (asfo) aihfVarCreateBuilder3.instance;
            asfoVar11.b |= 4;
            asfoVar11.e = string8;
            String string9 = context3.getString(R.string.smart_downloads_promo_action_button_a11y_text);
            string9.getClass();
            aihfVarCreateBuilder3.copyOnWrite();
            asfo asfoVar12 = (asfo) aihfVarCreateBuilder3.instance;
            asfoVar12.b |= 8;
            asfoVar12.f = string9;
            aihn aihnVarBuild3 = aihfVarCreateBuilder3.build();
            aihnVarBuild3.getClass();
            agabVar3.i();
            asfn asfnVar3 = asfn.a;
            ((RuntimeSignal) obj3).b((asfn) agabVar3.f(1424173928, (asfo) aihnVarBuild3, aihn.getParserForClass(asfn.class)));
            return awmy.a;
        } catch (Exception e) {
            ((agrc) ((agrc) hoo.a.b().i(agso.a, "MusicOfflineHomeBlock")).j(e).k("com/google/android/apps/youtube/music/offline/blocks/MusicOfflineHomeBlockImpl", "updateSmartDownloadsPromoSignal$<anonymous>", 244, "MusicOfflineHomeBlockImpl.kt")).t("Failed to fetch downloads library.");
            return awmy.a;
        }
    }
}
