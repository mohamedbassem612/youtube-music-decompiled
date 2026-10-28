package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hff implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hff(Object obj, Object obj2, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        abbu abbuVar;
        switch (this.$cid) {
            case 0:
                hfk hfkVar = (hfk) this.b;
                gsg gsgVar = hfkVar.k;
                Object obj = this.c;
                if (gsgVar != null && obj != null) {
                    amlh amlhVar = ((amks) ((aihh) obj).instance).c;
                    if (amlhVar == null) {
                        amlhVar = amlh.a;
                    }
                    if (TextUtils.equals(gsgVar.a, amlhVar.c)) {
                        return;
                    }
                }
                hfkVar.k = null;
                aihh aihhVar = (aihh) obj;
                hfkVar.o = aihhVar;
                for (hfj hfjVar : hfkVar.c) {
                    if (this.a) {
                        boolean z = hfjVar.c;
                    }
                    hfkVar.g(hfjVar, aihhVar);
                }
                return;
            case 1:
                ((grf) this.c).Z((RecyclerView) this.b, this.a);
                return;
            case 2:
                Object obj2 = this.c;
                Object obj3 = this.b;
                if (this.a) {
                    ((vor) obj3).y((String) obj2);
                    return;
                } else {
                    ((vor) obj3).K((String) obj2);
                    return;
                }
            case 3:
                ((wws) this.b).b(((ammo) this.c).d, this.a);
                return;
            case 4:
                ((wws) this.b).b(((ammo) this.c).d, this.a);
                return;
            case 5:
                ((yal) this.c).a.s.aB(this.a);
                ((ConditionVariable) this.b).open();
                return;
            case 6:
                Object obj4 = this.b;
                String str = ((aamw) obj4).a;
                aarz aarzVar = ((aasw) this.c).a;
                aatc aatcVar = (aatc) aarzVar;
                aatcVar.c.put(str, obj4);
                aatcVar.k(new aasz(obj4, 0));
                aatcVar.p.execute(new aadw(aarzVar, obj4, 15, (byte[]) null));
                return;
            case 7:
                Object obj5 = this.c;
                Object obj6 = this.b;
                if (obj6 != null) {
                    abbd abbdVar = (abbd) obj5;
                    if (abbdVar.e != null && (abbuVar = abbdVar.f) != null) {
                        try {
                            int i = ((wiz) obj6).a() ? this.a ? 2 : 3 : 1;
                            abbuVar.f.k((wiz) obj6, i);
                            abbuVar.j = i;
                            Iterator it = abbuVar.g.iterator();
                            if (it.hasNext()) {
                                throw null;
                            }
                            try {
                                int i2 = ((abbd) obj5).f.j;
                                try {
                                    abak abakVar = ((abbd) obj5).e;
                                    if (i2 == 0) {
                                        throw null;
                                    }
                                    abakVar.h = i2;
                                    return;
                                } catch (NullPointerException e) {
                                    int iK = abbd.k(abbdVar.e, abbdVar.f) - 1;
                                    if (iK == 0) {
                                        throw new abaw(e);
                                    }
                                    if (iK == 1) {
                                        throw new abaz(e);
                                    }
                                    if (iK == 2) {
                                        throw new abbc(e);
                                    }
                                    throw new abat(e);
                                }
                            } catch (NullPointerException e2) {
                                int iK2 = abbd.k(abbdVar.e, abbdVar.f) - 1;
                                if (iK2 == 0) {
                                    throw new abau(e2);
                                }
                                if (iK2 == 1) {
                                    throw new abax(e2);
                                }
                                if (iK2 == 2) {
                                    throw new abba(e2);
                                }
                                throw new abar(e2);
                            }
                        } catch (abbx e3) {
                            abbdVar.l(e3);
                            return;
                        } catch (NullPointerException e4) {
                            int iK3 = abbd.k(abbdVar.e, abbdVar.f) - 1;
                            if (iK3 == 0) {
                                throw new abav(e4);
                            }
                            if (iK3 == 1) {
                                throw new abay(e4);
                            }
                            if (iK3 == 2) {
                                throw new abbb(e4);
                            }
                            throw new abas(e4);
                        }
                    }
                }
                abbd abbdVar2 = (abbd) obj5;
                ((agrc) ((agrc) abbd.a.b()).k("com/google/android/libraries/youtube/player/features/gl/GlScene", "queueRenderingMode", 945, "GlScene.java")).E("Null rendering mode. RM: %s, CR: %s, SG: %s", obj6, abbdVar2.e, abbdVar2.f);
                return;
            case 8:
                abmc abmcVar = (abmc) this.b;
                abmcVar.h = null;
                boolean z2 = this.a;
                if (z2) {
                    ((jin) abmcVar.m.a).b();
                }
                arnj arnjVar = (arnj) this.c;
                ajwo ajwoVar = arnjVar.n;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajwm.b);
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    ajwo ajwoVar2 = arnjVar.n;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajwm.b);
                    ajwoVar2.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
                    abmcVar.e.b(((ajwm) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c);
                }
                abmcVar.h(24, arnjVar);
                if (!z2) {
                    abmcVar.g(arnjVar);
                }
                abmcVar.f(arnjVar);
                return;
            default:
                Object obj7 = this.c;
                Object obj8 = this.b;
                try {
                    if (ahno.f((Context) obj8)) {
                        SharedPreferences.Editor editorEdit = ahno.C((Context) obj8).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) ((Context) obj8).getSystemService(NotificationManager.class);
                        if (this.a) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + ((Context) obj8).getPackageName());
                    }
                    return;
                } finally {
                    ((kjc) obj7).x(null);
                }
        }
    }

    public /* synthetic */ hff(Object obj, Object obj2, boolean z, int i, byte[] bArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = z;
    }

    public /* synthetic */ hff(Object obj, boolean z, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
        this.c = obj2;
    }

    public /* synthetic */ hff(yal yalVar, boolean z, ConditionVariable conditionVariable, int i) {
        this.$cid = i;
        this.c = yalVar;
        this.a = z;
        this.b = conditionVariable;
    }

    public /* synthetic */ hff(boolean z, vor vorVar, String str, int i) {
        this.$cid = i;
        this.a = z;
        this.b = vorVar;
        this.c = str;
    }
}
