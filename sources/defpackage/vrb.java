package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.libraries.youtube.share.endpoint.ShareLoggingBroadcastReceiver;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vrb implements vxc {
    private final /* synthetic */ int $cid;
    private final Object a;

    public vrb(Context context, int i) {
        this.$cid = i;
        context.getClass();
        this.a = context;
    }

    private final void d(Intent intent, ajdj ajdjVar) {
        ((Context) this.a).startActivity(Intent.createChooser(intent, ajdjVar.f));
    }

    @Override // defpackage.vxc
    public final void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r9v22, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.vxc
    public final /* synthetic */ void c(ajwo ajwoVar, Map map) {
        String str;
        akuc akucVarA;
        String str2;
        vun vunVar;
        vor vorVarB;
        String str3;
        aqhr aqhrVarA;
        Optional optionalEmpty;
        akuc akucVar = null;
        str = null;
        String str4 = null;
        switch (this.$cid) {
            case 0:
                vun vunVar2 = vun.d;
                aihl aihlVar = apkk.b;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                ajwoVar.c(aihlVarCheckIsLite);
                if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVar2 = apkl.b;
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar2);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
                        ajwoVar.c(aihlVarCheckIsLite3);
                        Object objK = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                        apkl apklVar = (apkl) (objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK));
                        akucVarA = akuc.a((apklVar.c == 2 ? (akud) apklVar.d : akud.a).c);
                        if (akucVarA == null) {
                            akucVarA = akuc.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
                        }
                        int i = apklVar.c;
                        if (((i == 2 ? (akud) apklVar.d : akud.a).b & 2) != 0) {
                            str2 = (i == 2 ? (akud) apklVar.d : akud.a).d;
                        } else {
                            if (i == 1) {
                                str2 = (String) apklVar.d;
                            }
                            vunVar = vun.c;
                        }
                        str4 = str2;
                        vunVar = vun.c;
                    } else {
                        str = null;
                    }
                    if (akucVar == null && str != null && (vorVarB = ((hed) this.a).b(akucVar)) != null && vorVarB.I() && Objects.equals(vorVarB.k(), str)) {
                        vorVarB.d.f.a(vunVar2);
                        break;
                    }
                } else {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
                    ajwoVar.c(aihlVarCheckIsLite4);
                    Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                    apkk apkkVar = (apkk) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                    akucVarA = akuc.a((apkkVar.c == 2 ? (akud) apkkVar.d : akud.a).c);
                    if (akucVarA == null) {
                        akucVarA = akuc.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
                    }
                    int i2 = apkkVar.c;
                    if (((i2 == 2 ? (akud) apkkVar.d : akud.a).b & 2) != 0) {
                        str3 = (i2 == 2 ? (akud) apkkVar.d : akud.a).d;
                    } else {
                        if (i2 == 1) {
                            str3 = (String) apkkVar.d;
                        }
                        vunVar = vun.a;
                    }
                    str4 = str3;
                    vunVar = vun.a;
                }
                akuc akucVar2 = akucVarA;
                vunVar2 = vunVar;
                str = str4;
                akucVar = akucVar2;
                if (akucVar == null) {
                }
                break;
            case 1:
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ajpe.b);
                ajwoVar.c(aihlVarCheckIsLite5);
                Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite5.d);
                boolean z = ((ajpe) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3))).c;
                Object obj = this.a;
                if (z) {
                    ((syn) obj).f();
                } else {
                    ((syn) obj).e();
                }
                break;
            case 2:
                aihl aihlVarCheckIsLite6 = aihn.checkIsLite(anex.b);
                ajwoVar.c(aihlVarCheckIsLite6);
                if (ajwoVar.j.n(aihlVarCheckIsLite6.d)) {
                    Object obj2 = this.a;
                    xql xqlVar = (xql) obj2;
                    avmm avmmVar = xqlVar.m;
                    avmmVar.b();
                    xqlVar.l();
                    if (xqlVar.v.l(160, 45662068L, false)) {
                        xqlVar.t.f(xqlVar.s);
                    }
                    abvn abvnVar = xqlVar.j;
                    avmmVar.c(((avlh) abvnVar.r().a).ak(new aawl(new xbo(obj2, 13), "MHDDM", 1)));
                    avmmVar.c(((avlh) abvnVar.r().n).ak(new xbo(obj2, 14)));
                    abvn abvnVar2 = xqlVar.r;
                }
                break;
            case 3:
                aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aney.b);
                ajwoVar.c(aihlVarCheckIsLite7);
                if (ajwoVar.j.n(aihlVarCheckIsLite7.d)) {
                    xql xqlVar2 = (xql) this.a;
                    xqlVar2.m.b();
                    xqlVar2.w.e();
                    if (xqlVar2.v.l(160, 45662068L, false)) {
                        xqlVar2.t.n(xqlVar2.s);
                    }
                    xqlVar2.m();
                }
                break;
            case 4:
                aihl aihlVar3 = algy.b;
                aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar3);
                ajwoVar.c(aihlVarCheckIsLite8);
                ahno.F(ajwoVar.j.n(aihlVarCheckIsLite8.d));
                aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aihlVar3);
                ajwoVar.c(aihlVarCheckIsLite9);
                Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite9.d);
                ((elr) this.a).A(new zpy((algy) (objK4 == null ? aihlVarCheckIsLite9.b : aihlVarCheckIsLite9.c(objK4)), 0));
                break;
            case 5:
                aihl aihlVar4 = anfm.b;
                aihl aihlVarCheckIsLite10 = aihn.checkIsLite(aihlVar4);
                ajwoVar.c(aihlVarCheckIsLite10);
                ahno.F(ajwoVar.j.n(aihlVarCheckIsLite10.d));
                aihl aihlVarCheckIsLite11 = aihn.checkIsLite(aihlVar4);
                ajwoVar.c(aihlVarCheckIsLite11);
                Object objK5 = ajwoVar.j.k(aihlVarCheckIsLite11.d);
                ((elr) this.a).A(new zpy((anfm) (objK5 == null ? aihlVarCheckIsLite11.b : aihlVarCheckIsLite11.c(objK5)), 2));
                break;
            case 6:
                aihl aihlVarCheckIsLite12 = aihn.checkIsLite(aqhk.b);
                ajwoVar.c(aihlVarCheckIsLite12);
                Object objK6 = ajwoVar.j.k(aihlVarCheckIsLite12.d);
                aqhk aqhkVar = (aqhk) (objK6 == null ? aihlVarCheckIsLite12.b : aihlVarCheckIsLite12.c(objK6));
                int i3 = aqhkVar.c;
                if ((i3 & 1) != 0) {
                    if ((i3 & 8) == 0) {
                        aqhs aqhsVar = aqhkVar.e;
                        if (aqhsVar == null) {
                            aqhsVar = aqhs.a;
                        }
                        if ((aqhsVar.b & 2) == 0) {
                            ((axlj) this.a).y(aqhkVar.d);
                        }
                    }
                    String str5 = aqhkVar.d;
                    if ((aqhkVar.c & 8) != 0) {
                        aqhrVarA = aqhr.a(aqhkVar.g);
                        if (aqhrVarA == null) {
                            aqhrVarA = aqhr.FETCH_BEHAVIOR_UNSPECIFIED;
                        }
                    } else {
                        aqhs aqhsVar2 = aqhkVar.e;
                        if (aqhsVar2 == null) {
                            aqhsVar2 = aqhs.a;
                        }
                        aqhrVarA = aqhr.a(aqhsVar2.f);
                        if (aqhrVarA == null) {
                            aqhrVarA = aqhr.FETCH_BEHAVIOR_UNSPECIFIED;
                        }
                    }
                    if (aqhrVarA == aqhr.FETCH_BEHAVIOR_ONLY_IF_NEEDED) {
                        if (((aigj) ((axlj) this.a).u(str5, "suspense_content_data_key")) != null) {
                        }
                    } else if (aqhrVarA != aqhr.FETCH_BEHAVIOR_FORCE_FETCH) {
                    }
                    int iAS = a.aS(aqhkVar.f);
                    int i4 = iAS != 0 ? iAS : 1;
                    axlj axljVar = (axlj) this.a;
                    if (acfz.ar(i4, axljVar, str5)) {
                        axljVar.z(str5, "suspense_placeholder_data_key", false);
                    }
                    if ((aqhkVar.c & 16) != 0) {
                        alap alapVar = aqhkVar.h;
                        if (alapVar == null) {
                            alapVar = alap.a;
                        }
                        optionalEmpty = Optional.of(alapVar);
                    } else {
                        optionalEmpty = Optional.empty();
                    }
                    adcw adcwVar = (adcw) axljVar.a.get(str5);
                    if (adcwVar != null) {
                        adcwVar.d(str5, (alap) optionalEmpty.orElse(null));
                    }
                    break;
                } else if ((i3 & 32) != 0 && (i3 & 64) != 0) {
                    ((axlj) this.a).z(aqhkVar.i, aqhkVar.j, false);
                    break;
                }
                break;
            default:
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                aihl aihlVarCheckIsLite13 = aihn.checkIsLite(ajdj.b);
                ajwoVar.c(aihlVarCheckIsLite13);
                Object objK7 = ajwoVar.j.k(aihlVarCheckIsLite13.d);
                ajdj ajdjVar = (ajdj) (objK7 == null ? aihlVarCheckIsLite13.b : aihlVarCheckIsLite13.c(objK7));
                for (amgu amguVar : ajdjVar.d) {
                    intent.putExtra(amguVar.e, amguVar.c == 2 ? (String) amguVar.d : "");
                }
                intent.setType(ajdjVar.e);
                int i5 = ajdjVar.c;
                if ((i5 & 4) == 0 && (i5 & 8) == 0) {
                    d(intent, ajdjVar);
                } else {
                    Context context = (Context) this.a;
                    PendingIntent pendingIntentA = qof.a(context, 0, new Intent(context, (Class<?>) ShareLoggingBroadcastReceiver.class).putExtra("YTShare_Logging_Share_Intent_Endpoint_Byte_Array", ajwoVar.toByteArray()), (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 134217728, 1);
                    if (pendingIntentA == null) {
                        d(intent, ajdjVar);
                    } else {
                        context.startActivity(Intent.createChooser(intent, ajdjVar.f, pendingIntentA.getIntentSender()));
                    }
                }
                break;
        }
    }

    public vrb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public vrb(axlj axljVar, int i) {
        this.$cid = i;
        this.a = axljVar;
    }
}
