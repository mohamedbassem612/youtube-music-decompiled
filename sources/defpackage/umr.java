package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class umr implements umk {
    private final Context a;
    private final ExtensionRegistryLite b;
    private final ukp c;
    private final zvl d;
    private final zdj e;
    private final aeiv f;

    public umr(Context context, ExtensionRegistryLite extensionRegistryLite, ukp ukpVar, zdj zdjVar, aeiv aeivVar, zvl zvlVar) {
        context.getClass();
        extensionRegistryLite.getClass();
        ukpVar.getClass();
        zdjVar.getClass();
        aeivVar.getClass();
        zvlVar.getClass();
        this.a = context;
        this.b = extensionRegistryLite;
        this.c = ukpVar;
        this.e = zdjVar;
        this.f = aeivVar;
        this.d = zvlVar;
    }

    @Override // defpackage.afkj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        String str = (String) obj;
        twu.d("EditorCmpFuturesMixin", 6, "CompositionFuturesMixinResult failed", th);
        if (str != null) {
            this.f.u(str);
        }
    }

    @Override // defpackage.afkj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = (String) obj;
        if (str != null) {
            this.f.t(new ugn(str, "EditorCmpFuturesMixin", 62));
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x012f  */
    @Override // defpackage.afkj
    public final /* synthetic */ void c(Object obj, Object obj2) {
        aufa aufaVarH;
        boolean z;
        String str = (String) obj;
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) obj2;
        protoParsers$InternalDontUse.getClass();
        try {
            umo umoVar = (umo) protoParsers$InternalDontUse.a(umo.a, this.b);
            int i = umoVar.b;
            if (nuo.b(i) == 0) {
                throw null;
            }
            int iB = nuo.b(i);
            int i2 = iB - 1;
            if (iB == 0) {
                throw null;
            }
            if (i2 == 0) {
                umn umnVar = i == 1 ? (umn) umoVar.c : umn.a;
                umnVar.getClass();
                ukq ukqVarA = this.c.a();
                if (ukqVarA == null) {
                    twu.d("EditorCmpFuturesMixin", 6, "CompositionSupplier has no composition manager, ignoring CompositionFuturesMixinResult", null);
                } else {
                    usd usdVar = ukqVarA.a;
                    Context context = this.a;
                    auey aueyVar = umnVar.c;
                    if (aueyVar == null) {
                        aueyVar = auey.a;
                    }
                    aueyVar.getClass();
                    if (usdVar.h(new umq(context, umnVar, this.d))) {
                        ukqVarA.t();
                    } else {
                        twu.d("EditorCmpFuturesMixin", 6, "Transaction to update video ID asset failed", null);
                    }
                }
            } else if (i2 == 1) {
                zdj zdjVar = this.e;
                aufa aufaVar = (i == 2 ? (umm) umoVar.c : umm.a).b;
                if (aufaVar == null) {
                    aufaVar = aufa.a;
                }
                aufaVar.getClass();
                Object obj3 = zdjVar.b;
                if (obj3 != null) {
                    usd usdVar2 = ((uqf) obj3).a;
                    auhs auhsVarC = usdVar2.c();
                    auhsVarC.getClass();
                    aufa aufaVarGm = yno.gm(auhsVarC);
                    Object obj4 = zdjVar.a;
                    boolean z2 = ((vxz) ((aaok) obj4).b).l(451, 45737994L, false) && aufaVarGm != null;
                    zf zfVar = ((uqf) obj3).c;
                    Duration durationL = usj.l(auhsVarC);
                    durationL.getClass();
                    float fFloatValue = ((Float) usj.q(((usd) zfVar.a).c(), arfu.VOLUME_TYPE_ADDED_MUSIC).orElse(Float.valueOf(1.0f))).floatValue();
                    if (z2) {
                        aigu aiguVar = aufaVarGm.f;
                        if (aiguVar == null) {
                            aiguVar = aigu.a;
                        }
                        aiguVar.getClass();
                        Comparable comparableGE = yno.gE(aufaVar, durationL, aext.v(aiguVar));
                        aiie aiieVar = aufaVarGm.k;
                        aiieVar.getClass();
                        aihl aihlVar = auft.b;
                        aihlVar.getClass();
                        auft auftVar = (auft) yno.gh(aiieVar, aihlVar);
                        if (auftVar == null || (auftVar.c & SemanticState.Hidden) == 0) {
                            z = false;
                        } else {
                            aigu aiguVar2 = aufaVarGm.g;
                            if (aiguVar2 == null) {
                                aiguVar2 = aigu.a;
                            }
                            aigu aiguVar3 = auftVar.k;
                            if (aiguVar3 == null) {
                                aiguVar3 = aigu.a;
                            }
                            if (awrc.c(aiguVar2, aiguVar3)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        aigu aiguVar4 = aufaVarGm.f;
                        if (aiguVar4 == null) {
                            aiguVar4 = aigu.a;
                        }
                        aiguVar4.getClass();
                        Duration durationV = aext.v(aiguVar4);
                        aigu aiguVar5 = aufaVarGm.g;
                        if (aiguVar5 == null) {
                            aiguVar5 = aigu.a;
                        }
                        aiguVar5.getClass();
                        if (!awrc.c(durationV.plus(aext.v(aiguVar5)), durationL) && !z) {
                            aigu aiguVar6 = aufaVarGm.g;
                            if (aiguVar6 == null) {
                                aiguVar6 = aigu.a;
                            }
                            aiguVar6.getClass();
                            comparableGE = atqq.h(comparableGE, aext.v(aiguVar6));
                        }
                        aihf builder = aufaVar.toBuilder();
                        builder.getClass();
                        atqo.j(aufaVarGm.e, builder);
                        atqo.n(fFloatValue, builder);
                        atqo.l(aiguVar, builder);
                        atqo.i(aext.u((Duration) comparableGE), builder);
                        aufaVarH = atqo.h(builder);
                    } else {
                        aihf builder2 = aufaVar.toBuilder();
                        builder2.getClass();
                        atqo.j(aufaVarGm != null ? aufaVarGm.e : usdVar2.a(), builder2);
                        atqo.n(fFloatValue, builder2);
                        aigu aiguVar7 = aikw.a;
                        aiguVar7.getClass();
                        atqo.l(aiguVar7, builder2);
                        Duration duration = Duration.ZERO;
                        duration.getClass();
                        atqo.i(aext.u(yno.gE(aufaVar, durationL, duration)), builder2);
                        aufaVarH = atqo.h(builder2);
                    }
                    if (usdVar2.h(new uup(aufaVarH, 0))) {
                        urt urtVar = ((uqf) obj3).b;
                        if (((aaok) obj4).K() && urtVar != null) {
                            urtVar.m(null);
                        }
                    } else {
                        twu.d("AddedSoundCompCtrl", 6, "Mutation failed to upsert added sound segment from CreationAudioSegment.", null);
                    }
                } else {
                    twu.d("AddedSoundCompCtrl", 5, "Controller is not initialized, ignoring request.", null);
                }
            } else if (i2 == 2) {
                uml umlVar = i == 3 ? (uml) umoVar.c : uml.a;
                umlVar.getClass();
                ukq ukqVarA2 = this.c.a();
                if (ukqVarA2 == null) {
                    twu.d("EditorCmpFuturesMixin", 6, "CompositionSupplier has no composition manager, ignoring CompositionFuturesMixinResult", null);
                } else {
                    usd usdVar3 = ukqVarA2.a;
                    long j = umlVar.c;
                    auft auftVar2 = umlVar.d;
                    if (auftVar2 == null) {
                        auftVar2 = auft.a;
                    }
                    auftVar2.getClass();
                    if (usdVar3.h(new ump(j, auftVar2))) {
                        ukqVarA2.t();
                    } else {
                        twu.d("EditorCmpFuturesMixin", 6, "Transaction to update derived source mixin failed", null);
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new awmj();
                }
                twu.d("EditorCmpFuturesMixin", 6, "Unrecognized CompositionFuturesMixinResult", null);
            }
            if (str != null) {
                this.f.u(str);
            }
        } catch (Throwable th) {
            if (str != null) {
                this.f.u(str);
            }
            throw th;
        }
    }
}
