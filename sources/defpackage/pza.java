package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pza {
    private final Context a;
    private final piy b;
    private final aunn c;
    private final pcn d;

    static {
        agsn.h("GnpSdk");
    }

    public pza(Context context, piy piyVar, aunn aunnVar, pcn pcnVar) {
        context.getClass();
        piyVar.getClass();
        aunnVar.getClass();
        this.a = context;
        this.b = piyVar;
        this.c = aunnVar;
        this.d = pcnVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x029a  */
    /* JADX WARN: Code duplicated, block: B:104:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:107:0x02af  */
    /* JADX WARN: Code duplicated, block: B:110:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:83:0x021c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0277  */
    /* JADX WARN: Code duplicated, block: B:94:0x027f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0281  */
    /* JADX WARN: Code duplicated, block: B:98:0x028d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0297  */
    /* JADX WARN: Type inference failed for: r7v8, types: [awmd, java.lang.Object] */
    public final Object a(plx plxVar, pot potVar, aicg aicgVar, int i, awoq awoqVar) throws Throwable {
        pyz pyzVar;
        ozj ozjVarB;
        int i2;
        int i3;
        pzr pzrVar;
        plx plxVar2;
        int i4;
        Object pzrVar2;
        plx plxVar3;
        Object objH;
        int i5;
        Bundle bundle;
        qae qaeVar;
        pot potVar2;
        aicg aicgVar2;
        plx plxVar4;
        int i6;
        Intent intentB;
        int i7;
        int iK;
        int i8;
        plx plxVar5 = plxVar;
        pot potVar3 = potVar;
        aicg aicgVar3 = aicgVar;
        if (awoqVar instanceof pyz) {
            pyzVar = (pyz) awoqVar;
            int i9 = pyzVar.c;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                pyzVar.c = i9 - Integer.MIN_VALUE;
            } else {
                pyzVar = new pyz(this, awoqVar);
            }
        } else {
            pyzVar = new pyz(this, awoqVar);
        }
        Object objA = pyzVar.a;
        awox awoxVar = awox.a;
        int i10 = pyzVar.c;
        if (i10 == 0) {
            atqp.j(objA);
            String str = aicgVar3.c;
            ozjVarB = nvj.b(potVar3);
            if (auwe.c()) {
                i2 = i;
                if (i2 == 5) {
                    List listH = atqq.H(ozjVarB);
                    agev agevVar = ((pco) this.d).a;
                    if (agevVar.g()) {
                        int iK2 = aext.K(aicgVar3.f);
                        if (iK2 == 0 || iK2 != 3) {
                            aczl aczlVar = (aczl) agevVar.c();
                            pyzVar.g = plxVar5;
                            pyzVar.d = potVar3;
                            pyzVar.e = aicgVar3;
                            pyzVar.h = 5;
                            pyzVar.f = ozjVarB;
                            pyzVar.c = 2;
                            if (((vxz) aczlVar.c).l(21, 45699164L, false)) {
                                throw new IllegalStateException("getIhnrNegativeActionClickBehavior or getIhnrNegativeActionClickBehaviorAsync must be implemented, prefer the async version.");
                            }
                            ?? r7 = aczlVar.d;
                            if (r7 == 0) {
                                throw new IllegalStateException("The intent provider for opening the YouTube app is absent.");
                            }
                            Intent intent = new Intent((Intent) r7.io());
                            elr elrVar = (elr) aczlVar.g;
                            Optional optionalT = elrVar.t(listH);
                            if (optionalT.isEmpty()) {
                                pzrVar2 = new pzr(2, null, null);
                            } else {
                                Optional optionalS = elrVar.s((ozj) optionalT.get());
                                if (optionalS.isEmpty()) {
                                    pzrVar2 = new pzr(2, null, null);
                                } else {
                                    ajcr ajcrVar = ((ajcs) optionalS.get()).k;
                                    if (ajcrVar == null) {
                                        ajcrVar = ajcr.a;
                                    }
                                    if ((ajcrVar.b & 1) != 0) {
                                        ajcr ajcrVar2 = ((ajcs) optionalS.get()).k;
                                        if (ajcrVar2 == null) {
                                            ajcrVar2 = ajcr.a;
                                        }
                                        ajwo ajwoVar = ajcrVar2.c;
                                        if (ajwoVar == null) {
                                            ajwoVar = ajwo.a;
                                        }
                                        Optional optionalF = aczlVar.f(((ozj) optionalT.get()).a);
                                        zik.be(intent, ajwoVar, optionalF.isPresent() ? ((xgt) optionalF.get()).a : null);
                                        pzrVar2 = nra.b(agke.q(intent), aczl.g(optionalF));
                                    } else {
                                        pzrVar2 = new pzr(2, null, null);
                                    }
                                }
                            }
                            if (pzrVar2 == awoxVar) {
                                return awoxVar;
                            }
                            plxVar3 = plxVar5;
                            i4 = i2;
                            pzrVar = (pzr) pzrVar2;
                            plxVar2 = plxVar3;
                        } else {
                            aczl aczlVar2 = (aczl) agevVar.c();
                            pyzVar.g = plxVar5;
                            pyzVar.d = potVar3;
                            pyzVar.e = aicgVar3;
                            pyzVar.h = 5;
                            pyzVar.f = ozjVarB;
                            pyzVar.c = 1;
                            if (((vxz) aczlVar2.c).l(21, 45699164L, false)) {
                                throw new IllegalStateException("getIhnrPositiveActionClickBehavior or getIhnrPositiveActionClickBehaviorAsync must be implemented, prefer the async version.");
                            }
                            objH = aczlVar2.h(listH);
                            if (objH == awoxVar) {
                                return awoxVar;
                            }
                            plxVar3 = plxVar5;
                            i4 = i2;
                            pzrVar = (pzr) objH;
                            plxVar2 = plxVar3;
                        }
                    } else {
                        pzrVar = new pzr(2, null, null);
                        plxVar2 = plxVar5;
                        i4 = i2;
                    }
                    agke agkeVarA = pzrVar.a();
                    i3 = 1;
                    if (pzrVar.b != 1) {
                    }
                    i2 = i4;
                    plxVar5 = plxVar2;
                }
                if (auwe.c()) {
                }
                i5 = i2;
                bundle = null;
                intentB = this.b.b();
                pho.i(intentB, plxVar5);
                pho.p(intentB, potVar3);
                pho.l(intentB, 3);
                pho.j(intentB, aicgVar3.c);
                intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_NEXT_VIEW_INDEX", aicgVar3.e);
                if (auwe.c()) {
                    iK = aext.K(aicgVar3.f);
                    if (iK == 0) {
                        i8 = i3;
                    } else {
                        i8 = iK;
                    }
                    intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_ACTION_TYPE", aext.J(i8));
                    if (i5 != 0) {
                        intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_POST_CLICK_ACTION", aext.H(i5));
                    } else {
                        i5 = 0;
                    }
                    if (bundle != null) {
                        pho.k(intentB, bundle);
                    }
                }
                if ((aicgVar3.b & 2) != 0) {
                    intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_SCORE", aicgVar3.d);
                }
                if (i5 == 4) {
                    aihf aihfVarCreateBuilder = aiff.a.createBuilder();
                    aihfVarCreateBuilder.getClass();
                    aext.E(aihfVarCreateBuilder);
                    aext.C(aihfVarCreateBuilder);
                    aext.F(aiep.c, aihfVarCreateBuilder);
                    pho.q(intentB, aext.B(aihfVarCreateBuilder));
                }
                Context context = this.a;
                int iB = pjx.b(pjx.f(nvu.a(plxVar5), potVar3.a), aicgVar3.c, 3);
                if (Build.VERSION.SDK_INT < 34) {
                    i7 = 67108864;
                } else {
                    i7 = 67108864;
                }
                PendingIntent broadcast = PendingIntent.getBroadcast(context, iB, intentB, i7 | 1207959552);
                broadcast.getClass();
                return broadcast;
            }
            i2 = i;
            i3 = 1;
            if (auwe.c()) {
            }
            i5 = i2;
            bundle = null;
            intentB = this.b.b();
            pho.i(intentB, plxVar5);
            pho.p(intentB, potVar3);
            pho.l(intentB, 3);
            pho.j(intentB, aicgVar3.c);
            intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_NEXT_VIEW_INDEX", aicgVar3.e);
            if (auwe.c()) {
                iK = aext.K(aicgVar3.f);
                if (iK == 0) {
                    i8 = i3;
                } else {
                    i8 = iK;
                }
                intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_ACTION_TYPE", aext.J(i8));
                if (i5 != 0) {
                    intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_POST_CLICK_ACTION", aext.H(i5));
                } else {
                    i5 = 0;
                }
                if (bundle != null) {
                    pho.k(intentB, bundle);
                }
            }
            if ((aicgVar3.b & 2) != 0) {
                intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_SCORE", aicgVar3.d);
            }
            if (i5 == 4) {
                aihf aihfVarCreateBuilder2 = aiff.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                aext.E(aihfVarCreateBuilder2);
                aext.C(aihfVarCreateBuilder2);
                aext.F(aiep.c, aihfVarCreateBuilder2);
                pho.q(intentB, aext.B(aihfVarCreateBuilder2));
            }
            Context context2 = this.a;
            int iB2 = pjx.b(pjx.f(nvu.a(plxVar5), potVar3.a), aicgVar3.c, 3);
            if (Build.VERSION.SDK_INT < 34) {
                i7 = 67108864;
            } else {
                i7 = 67108864;
            }
            PendingIntent broadcast2 = PendingIntent.getBroadcast(context2, iB2, intentB, i7 | 1207959552);
            broadcast2.getClass();
            return broadcast2;
        }
        if (i10 == 1) {
            ozj ozjVar = pyzVar.f;
            int i11 = pyzVar.h;
            aicgVar3 = pyzVar.e;
            pot potVar4 = pyzVar.d;
            plxVar3 = pyzVar.g;
            atqp.j(objA);
            ozjVarB = ozjVar;
            i4 = i11;
            potVar3 = potVar4;
            objH = objA;
            pzrVar = (pzr) objH;
            plxVar2 = plxVar3;
            agke agkeVarA2 = pzrVar.a();
            i3 = 1;
            if (pzrVar.b != 1) {
            }
            i2 = i4;
            plxVar5 = plxVar2;
            if (auwe.c()) {
            }
            i5 = i2;
            bundle = null;
            intentB = this.b.b();
            pho.i(intentB, plxVar5);
            pho.p(intentB, potVar3);
            pho.l(intentB, 3);
            pho.j(intentB, aicgVar3.c);
            intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_NEXT_VIEW_INDEX", aicgVar3.e);
            if (auwe.c()) {
                iK = aext.K(aicgVar3.f);
                if (iK == 0) {
                    i8 = i3;
                } else {
                    i8 = iK;
                }
                intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_ACTION_TYPE", aext.J(i8));
                if (i5 != 0) {
                    intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_POST_CLICK_ACTION", aext.H(i5));
                } else {
                    i5 = 0;
                }
                if (bundle != null) {
                    pho.k(intentB, bundle);
                }
            }
            if ((aicgVar3.b & 2) != 0) {
                intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_SCORE", aicgVar3.d);
            }
            if (i5 == 4) {
                aihf aihfVarCreateBuilder3 = aiff.a.createBuilder();
                aihfVarCreateBuilder3.getClass();
                aext.E(aihfVarCreateBuilder3);
                aext.C(aihfVarCreateBuilder3);
                aext.F(aiep.c, aihfVarCreateBuilder3);
                pho.q(intentB, aext.B(aihfVarCreateBuilder3));
            }
            Context context3 = this.a;
            int iB3 = pjx.b(pjx.f(nvu.a(plxVar5), potVar3.a), aicgVar3.c, 3);
            if (Build.VERSION.SDK_INT < 34) {
                i7 = 67108864;
            } else {
                i7 = 67108864;
            }
            PendingIntent broadcast3 = PendingIntent.getBroadcast(context3, iB3, intentB, i7 | 1207959552);
            broadcast3.getClass();
            return broadcast3;
        }
        if (i10 == 2) {
            ozj ozjVar2 = pyzVar.f;
            int i12 = pyzVar.h;
            aicgVar3 = pyzVar.e;
            pot potVar5 = pyzVar.d;
            plxVar3 = pyzVar.g;
            atqp.j(objA);
            ozjVarB = ozjVar2;
            i4 = i12;
            potVar3 = potVar5;
            pzrVar2 = objA;
            pzrVar = (pzr) pzrVar2;
            plxVar2 = plxVar3;
            agke agkeVarA3 = pzrVar.a();
            i3 = 1;
            if (pzrVar.b != 1 && agkeVarA3 != null && !agkeVarA3.isEmpty()) {
                piy piyVar = this.b;
                String strF = pjx.f(nvu.a(plxVar2), potVar3.a);
                String str2 = aicgVar3.c;
                str2.getClass();
                List listH2 = atqq.H(potVar3);
                aihf aihfVarCreateBuilder4 = aiff.a.createBuilder();
                aihfVarCreateBuilder4.getClass();
                aext.E(aihfVarCreateBuilder4);
                aext.C(aihfVarCreateBuilder4);
                aext.F(aiep.c, aihfVarCreateBuilder4);
                return piyVar.a(strF, 3, str2, plxVar2, listH2, aext.B(aihfVarCreateBuilder4), atqq.ap(agkeVarA3), null, ahza.CLICKED_IN_SYSTEM_TRAY, pzrVar.a);
            }
            i2 = i4;
            plxVar5 = plxVar2;
            if (auwe.c() || (qaeVar = (qae) ((pcn) this.c.io()).a(ozjVarB).f()) == null) {
                i5 = i2;
                bundle = null;
            } else {
                int i13 = aicgVar3.f;
                pyzVar.g = plxVar5;
                pyzVar.d = potVar3;
                pyzVar.e = aicgVar3;
                pyzVar.h = i2;
                pyzVar.f = null;
                pyzVar.c = 3;
                objA = qaeVar.a();
                if (objA == awoxVar) {
                    return awoxVar;
                }
                aicg aicgVar4 = aicgVar3;
                potVar2 = potVar3;
                aicgVar2 = aicgVar4;
                plxVar4 = plxVar5;
                i6 = i2;
            }
            intentB = this.b.b();
            pho.i(intentB, plxVar5);
            pho.p(intentB, potVar3);
            pho.l(intentB, 3);
            pho.j(intentB, aicgVar3.c);
            intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_NEXT_VIEW_INDEX", aicgVar3.e);
            if (auwe.c()) {
                iK = aext.K(aicgVar3.f);
                if (iK == 0) {
                    i8 = i3;
                } else {
                    i8 = iK;
                }
                intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_ACTION_TYPE", aext.J(i8));
                if (i5 != 0) {
                    intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_POST_CLICK_ACTION", aext.H(i5));
                } else {
                    i5 = 0;
                }
                if (bundle != null) {
                    pho.k(intentB, bundle);
                }
            }
            if ((aicgVar3.b & 2) != 0) {
                intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_SCORE", aicgVar3.d);
            }
            if (i5 == 4) {
                aihf aihfVarCreateBuilder5 = aiff.a.createBuilder();
                aihfVarCreateBuilder5.getClass();
                aext.E(aihfVarCreateBuilder5);
                aext.C(aihfVarCreateBuilder5);
                aext.F(aiep.c, aihfVarCreateBuilder5);
                pho.q(intentB, aext.B(aihfVarCreateBuilder5));
            }
            Context context4 = this.a;
            int iB4 = pjx.b(pjx.f(nvu.a(plxVar5), potVar3.a), aicgVar3.c, 3);
            if (Build.VERSION.SDK_INT < 34 || auvv.c()) {
                i7 = 67108864;
            } else {
                i7 = a.aO() ? 33554432 : 0;
            }
            PendingIntent broadcast4 = PendingIntent.getBroadcast(context4, iB4, intentB, i7 | 1207959552);
            broadcast4.getClass();
            return broadcast4;
        }
        if (i10 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i6 = pyzVar.h;
        aicgVar2 = pyzVar.e;
        potVar2 = pyzVar.d;
        plxVar4 = pyzVar.g;
        atqp.j(objA);
        i3 = 1;
        bundle = (Bundle) objA;
        pot potVar6 = potVar2;
        aicgVar3 = aicgVar2;
        potVar3 = potVar6;
        i5 = i6;
        plxVar5 = plxVar4;
        intentB = this.b.b();
        pho.i(intentB, plxVar5);
        pho.p(intentB, potVar3);
        pho.l(intentB, 3);
        pho.j(intentB, aicgVar3.c);
        intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_NEXT_VIEW_INDEX", aicgVar3.e);
        if (auwe.c()) {
            iK = aext.K(aicgVar3.f);
            if (iK == 0) {
                i8 = i3;
            } else {
                i8 = iK;
            }
            intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_ACTION_TYPE", aext.J(i8));
            if (i5 != 0) {
                intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_POST_CLICK_ACTION", aext.H(i5));
            } else {
                i5 = 0;
            }
            if (bundle != null) {
                pho.k(intentB, bundle);
            }
        }
        if ((aicgVar3.b & 2) != 0) {
            intentB.putExtra("com.google.android.libraries.notifications.USER_FEEDBACK_SCORE", aicgVar3.d);
        }
        if (i5 == 4) {
            aihf aihfVarCreateBuilder6 = aiff.a.createBuilder();
            aihfVarCreateBuilder6.getClass();
            aext.E(aihfVarCreateBuilder6);
            aext.C(aihfVarCreateBuilder6);
            aext.F(aiep.c, aihfVarCreateBuilder6);
            pho.q(intentB, aext.B(aihfVarCreateBuilder6));
        }
        Context context5 = this.a;
        int iB5 = pjx.b(pjx.f(nvu.a(plxVar5), potVar3.a), aicgVar3.c, 3);
        if (Build.VERSION.SDK_INT < 34) {
            i7 = 67108864;
        } else {
            i7 = 67108864;
        }
        PendingIntent broadcast5 = PendingIntent.getBroadcast(context5, iB5, intentB, i7 | 1207959552);
        broadcast5.getClass();
        return broadcast5;
    }
}
