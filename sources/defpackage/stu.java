package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class stu implements sxt {
    public final zwb a;
    public final Context b;
    final Set c = new HashSet();
    final Set d = new HashSet();
    public final Set e = new HashSet();
    public final xeu f;
    public aigj g;
    public aigj h;
    public aigj i;
    public final mgk j;

    public stu(mgk mgkVar, zwb zwbVar, xeu xeuVar, Context context) {
        this.j = mgkVar;
        this.a = zwbVar;
        this.f = xeuVar;
        this.b = context;
    }

    public static final Intent e(Context context, String str, String str2, int i) {
        Intent intentPutExtra = new Intent().setClassName(context, "com.google.android.libraries.families.FamilyActivity").putExtra("extra.accountName", str);
        int i2 = 10;
        switch (str2.hashCode()) {
            case -124920250:
                if (str2.equals("ytm-tandem")) {
                    i2 = 18;
                }
                break;
            case 119985:
                if (str2.equals("ytl")) {
                    i2 = 22;
                }
                break;
            case 119986:
                if (str2.equals("ytm")) {
                    i2 = 9;
                }
                break;
            case 119991:
                str2.equals("ytr");
                break;
            case 119994:
                if (str2.equals("ytu")) {
                    i2 = 2;
                }
                break;
            case 808543459:
                if (str2.equals("ytp-tandem")) {
                    i2 = 19;
                }
                break;
            case 1045810109:
                if (str2.equals("yt-tandem")) {
                    i2 = 16;
                }
                break;
        }
        return intentPutExtra.putExtra("appId", i2).putExtra("flowType", i - 1).putExtra("utmSource", "youtubecommerce").putExtra("utmMedium", str2);
    }

    public final void a(str strVar) {
        this.c.add(strVar);
    }

    public final void b(sts stsVar) {
        this.d.add(stsVar);
    }

    public final void c(sts stsVar) {
        this.d.remove(stsVar);
    }

    @Override // defpackage.sxt
    public final boolean d(int i, int i2, Intent intent) {
        switch (i) {
            case 2000:
                if (intent == null || !intent.getBooleanExtra("familyChanged", false)) {
                    aigj aigjVar = this.g;
                    if (aigjVar != null) {
                        xeu xeuVar = this.f;
                        aihf aihfVarJ = nsg.j(aigjVar);
                        if (xeuVar.b) {
                            xff xffVarA = xeuVar.a(aihfVarJ, alot.YPC_FAMILY_CREATE_FLOW_CANCELLED);
                            ztf ztfVar = xffVarA.k.e;
                            xffVarA.l = ztfVar.a();
                            ztfVar.k(xffVarA);
                        } else {
                            alos alosVar = (alos) alou.a.createBuilder();
                            alosVar.copyOnWrite();
                            alou alouVar = (alou) alosVar.instance;
                            aroe aroeVar = (aroe) aihfVarJ.build();
                            aroeVar.getClass();
                            alouVar.d = aroeVar;
                            alouVar.c = 259;
                            xeuVar.b((alou) alosVar.build());
                        }
                    }
                    Iterator it = this.c.iterator();
                    while (it.hasNext()) {
                        str strVar = (str) it.next();
                        strVar.d();
                        strVar.f();
                        it.remove();
                    }
                } else {
                    aigj aigjVar2 = this.g;
                    if (aigjVar2 != null) {
                        xeu xeuVar2 = this.f;
                        aihf aihfVarJ2 = nsg.j(aigjVar2);
                        if (xeuVar2.b) {
                            xff xffVarA2 = xeuVar2.a(aihfVarJ2, alot.YPC_FAMILY_CREATE_FLOW_SUCCEEDED);
                            ztf ztfVar2 = xffVarA2.k.e;
                            xffVarA2.l = ztfVar2.a();
                            ztfVar2.k(xffVarA2);
                        } else {
                            alos alosVar2 = (alos) alou.a.createBuilder();
                            alosVar2.copyOnWrite();
                            alou alouVar2 = (alou) alosVar2.instance;
                            aroe aroeVar2 = (aroe) aihfVarJ2.build();
                            aroeVar2.getClass();
                            alouVar2.d = aroeVar2;
                            alouVar2.c = 260;
                            xeuVar2.b((alou) alosVar2.build());
                        }
                    }
                    Iterator it2 = this.c.iterator();
                    while (it2.hasNext()) {
                        str strVar2 = (str) it2.next();
                        strVar2.e();
                        strVar2.f();
                        it2.remove();
                    }
                }
                return false;
            case 2001:
                aigj aigjVar3 = this.h;
                if (aigjVar3 != null) {
                    xeu xeuVar3 = this.f;
                    aihf aihfVarI = nsg.i(aigjVar3);
                    if (xeuVar3.b) {
                        xff xffVarA3 = xeuVar3.a(aihfVarI, alot.YPC_FAMILY_MANAGE_FLOW_SUCCEEDED);
                        ztf ztfVar3 = xffVarA3.k.e;
                        xffVarA3.l = ztfVar3.a();
                        ztfVar3.k(xffVarA3);
                    } else {
                        alos alosVar3 = (alos) alou.a.createBuilder();
                        alosVar3.copyOnWrite();
                        alou alouVar3 = (alou) alosVar3.instance;
                        arof arofVar = (arof) aihfVarI.build();
                        arofVar.getClass();
                        alouVar3.d = arofVar;
                        alouVar3.c = 264;
                        xeuVar3.b((alou) alosVar3.build());
                    }
                }
                Iterator it3 = this.d.iterator();
                while (it3.hasNext()) {
                    sts stsVar = (sts) it3.next();
                    stsVar.d(intent == null ? false : intent.getBooleanExtra("familyChanged", false));
                    if (stsVar.f()) {
                        it3.remove();
                    }
                }
                return false;
            case 2002:
                if (i2 != 4) {
                    aigj aigjVar4 = this.i;
                    if (aigjVar4 != null) {
                        xeu xeuVar4 = this.f;
                        aihf aihfVarI2 = nsg.i(aigjVar4);
                        if (xeuVar4.b) {
                            xff xffVarA4 = xeuVar4.a(aihfVarI2, alot.YPC_FAMILY_MANAGE_FLOW_SUCCEEDED);
                            ztf ztfVar4 = xffVarA4.k.e;
                            xffVarA4.l = ztfVar4.a();
                            ztfVar4.k(xffVarA4);
                        } else {
                            alos alosVar4 = (alos) alou.a.createBuilder();
                            alosVar4.copyOnWrite();
                            alou alouVar4 = (alou) alosVar4.instance;
                            arof arofVar2 = (arof) aihfVarI2.build();
                            arofVar2.getClass();
                            alouVar4.d = arofVar2;
                            alouVar4.c = 264;
                            xeuVar4.b((alou) alosVar4.build());
                        }
                    }
                    Iterator it4 = this.e.iterator();
                    while (it4.hasNext()) {
                        svw svwVar = (svw) it4.next();
                        ajwo ajwoVar = svwVar.a;
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqta.b);
                        ajwoVar.c(aihlVarCheckIsLite);
                        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                        aqta aqtaVar = (aqta) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                        if ((aqtaVar.c & 4) != 0) {
                            vxe vxeVar = svwVar.b.b;
                            ajwo ajwoVar2 = aqtaVar.e;
                            if (ajwoVar2 == null) {
                                ajwoVar2 = ajwo.a;
                            }
                            vxeVar.a(ajwoVar2);
                        }
                        it4.remove();
                    }
                } else {
                    Iterator it5 = this.e.iterator();
                    while (it5.hasNext()) {
                        svw svwVar2 = (svw) it5.next();
                        ajwo ajwoVar3 = svwVar2.a;
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aqta.b);
                        ajwoVar3.c(aihlVarCheckIsLite2);
                        Object objK2 = ajwoVar3.j.k(aihlVarCheckIsLite2.d);
                        aqta aqtaVar2 = (aqta) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
                        if ((aqtaVar2.c & 8) != 0) {
                            vxe vxeVar2 = svwVar2.b.b;
                            ajwo ajwoVar4 = aqtaVar2.f;
                            if (ajwoVar4 == null) {
                                ajwoVar4 = ajwo.a;
                            }
                            vxeVar2.a(ajwoVar4);
                        }
                        it5.remove();
                    }
                }
                return false;
            default:
                return false;
        }
    }
}
