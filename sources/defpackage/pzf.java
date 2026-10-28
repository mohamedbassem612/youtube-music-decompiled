package defpackage;

import android.app.Notification;
import android.app.PendingIntent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pzf implements pyu {
    private static final agsn a = agsn.h("GnpSdk");
    private final pza b;

    public pzf(pza pzaVar) {
        this.b = pzaVar;
    }

    @Override // defpackage.pyu
    public final aich a() {
        return aich.a;
    }

    @Override // defpackage.pyu
    public final boolean b() {
        if (auwe.a.io().a()) {
            return true;
        }
        ((agsj) a.c()).t("iHNR surveys are disabled by feature flag");
        return false;
    }

    @Override // defpackage.pyu
    public final Object c(atr atrVar, plx plxVar, pot potVar, aici aiciVar, awoq awoqVar) {
        if (b()) {
            return d(atrVar, plxVar, potVar, aiciVar, awoqVar);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:65:0x0104  */
    /* JADX WARN: Code duplicated, block: B:68:0x010d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0117  */
    /* JADX WARN: Code duplicated, block: B:74:0x0138  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object d(atr atrVar, plx plxVar, pot potVar, aici aiciVar, awoq awoqVar) throws Throwable {
        pze pzeVar;
        plx plxVar2;
        pot potVar2;
        aief aiefVar;
        atr atrVar2;
        String str;
        aiee aieeVar;
        String str2;
        aiee aieeVar2;
        aicg aicgVar;
        aiee aieeVar3;
        CharSequence charSequence;
        atr atrVar3;
        atr atrVar4 = atrVar;
        if (awoqVar instanceof pze) {
            pzeVar = (pze) awoqVar;
            int i = pzeVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pzeVar.d = i - Integer.MIN_VALUE;
            } else {
                pzeVar = new pze(this, awoqVar);
            }
        } else {
            pzeVar = new pze(this, awoqVar);
        }
        pze pzeVar2 = pzeVar;
        Object objA = pzeVar2.b;
        awox awoxVar = awox.a;
        int i2 = pzeVar2.d;
        if (i2 != 0) {
            if (i2 == 1) {
                String str3 = pzeVar2.i;
                atr atrVar5 = pzeVar2.h;
                aiefVar = pzeVar2.g;
                potVar2 = pzeVar2.f;
                plxVar2 = (plx) pzeVar2.a;
                atrVar2 = pzeVar2.e;
                atqp.j(objA);
                str = str3;
                atrVar4 = atrVar5;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                charSequence = (CharSequence) pzeVar2.a;
                atrVar3 = pzeVar2.e;
                atqp.j(objA);
            }
            atrVar3.f(0, charSequence, (PendingIntent) objA);
            return ahzt.IHNR;
        }
        atqp.j(objA);
        aief aiefVar2 = aiciVar.b == 1 ? (aief) aiciVar.c : aief.a;
        aiefVar2.getClass();
        if (auwe.c() && aiefVar2.e) {
            atrVar4.b.clear();
            atrVar4.getClass();
        } else {
            Notification.Action[] actionArr = atrVar4.a().actions;
            if (actionArr != null && actionArr.length != 0) {
                return null;
            }
        }
        if ((aiefVar2.b & 2) != 0) {
            aiee aieeVar4 = aiefVar2.c;
            if (aieeVar4 == null) {
                aieeVar4 = aiee.a;
            }
            pza pzaVar = this.b;
            str = aieeVar4.c;
            aiee aieeVar5 = aiefVar2.c;
            if (aieeVar5 == null) {
                aieeVar5 = aiee.a;
            }
            aicg aicgVar2 = aieeVar5.b;
            if (aicgVar2 == null) {
                aicgVar2 = aicg.a;
            }
            aicg aicgVar3 = aicgVar2;
            aicgVar3.getClass();
            aiee aieeVar6 = aiefVar2.c;
            if (aieeVar6 == null) {
                aieeVar6 = aiee.a;
            }
            int iAW = a.aW(aieeVar6.d);
            int i3 = iAW == 0 ? 1 : iAW;
            pzeVar2.e = atrVar4;
            pzeVar2.a = plxVar;
            pzeVar2.f = potVar;
            pzeVar2.g = aiefVar2;
            pzeVar2.h = atrVar4;
            pzeVar2.i = str;
            pzeVar2.d = 1;
            Object objA2 = pzaVar.a(plxVar, potVar, aicgVar3, i3, pzeVar2);
            if (objA2 == awoxVar) {
                return awoxVar;
            }
            plxVar2 = plxVar;
            potVar2 = potVar;
            objA = objA2;
            aiefVar = aiefVar2;
            atrVar2 = atrVar4;
        } else {
            plxVar2 = plxVar;
            potVar2 = potVar;
            aiefVar = aiefVar2;
            atrVar2 = atrVar4;
        }
        if ((aiefVar.b & 4) != 0) {
            aieeVar = aiefVar.d;
            if (aieeVar == null) {
                aieeVar = aiee.a;
            }
            pza pzaVar2 = this.b;
            str2 = aieeVar.c;
            aieeVar2 = aiefVar.d;
            if (aieeVar2 == null) {
                aieeVar2 = aiee.a;
            }
            aicgVar = aieeVar2.b;
            if (aicgVar == null) {
                aicgVar = aicg.a;
            }
            aicgVar.getClass();
            aieeVar3 = aiefVar.d;
            if (aieeVar3 == null) {
                aieeVar3 = aiee.a;
            }
            int iAW2 = a.aW(aieeVar3.d);
            int i4 = iAW2 != 0 ? iAW2 : 1;
            pzeVar2.e = atrVar2;
            pzeVar2.a = str2;
            pzeVar2.f = null;
            pzeVar2.g = null;
            pzeVar2.h = null;
            pzeVar2.i = null;
            pzeVar2.d = 2;
            objA = pzaVar2.a(plxVar2, potVar2, aicgVar, i4, pzeVar2);
            if (objA != awoxVar) {
                return awoxVar;
            }
            charSequence = str2;
            atrVar3 = atrVar2;
            atrVar3.f(0, charSequence, (PendingIntent) objA);
        }
        return ahzt.IHNR;
        atrVar4.f(0, str, (PendingIntent) objA);
        if ((aiefVar.b & 4) != 0) {
            aieeVar = aiefVar.d;
            if (aieeVar == null) {
                aieeVar = aiee.a;
            }
            pza pzaVar3 = this.b;
            str2 = aieeVar.c;
            aieeVar2 = aiefVar.d;
            if (aieeVar2 == null) {
                aieeVar2 = aiee.a;
            }
            aicgVar = aieeVar2.b;
            if (aicgVar == null) {
                aicgVar = aicg.a;
            }
            aicgVar.getClass();
            aieeVar3 = aiefVar.d;
            if (aieeVar3 == null) {
                aieeVar3 = aiee.a;
            }
            int iAW3 = a.aW(aieeVar3.d);
            if (iAW3 != 0) {
            }
            pzeVar2.e = atrVar2;
            pzeVar2.a = str2;
            pzeVar2.f = null;
            pzeVar2.g = null;
            pzeVar2.h = null;
            pzeVar2.i = null;
            pzeVar2.d = 2;
            objA = pzaVar3.a(plxVar2, potVar2, aicgVar, i4, pzeVar2);
            if (objA != awoxVar) {
                return awoxVar;
            }
            charSequence = str2;
            atrVar3 = atrVar2;
            atrVar3.f(0, charSequence, (PendingIntent) objA);
        }
        return ahzt.IHNR;
    }
}
