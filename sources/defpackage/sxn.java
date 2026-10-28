package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sxn {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/common/activity/GoodIntentions");
    public final awmd a;
    private final boolean c;
    private final Context d;
    private final tqj f;
    private final ScheduledExecutorService g;
    private final aunn i;
    private final aunn j;
    private final dov l;
    private final Object e = new Object();
    private final Map k = new HashMap();
    private final agm h = new agm(5);

    public sxn(Context context, Optional optional, awmd awmdVar, awmd awmdVar2, tqj tqjVar, ScheduledExecutorService scheduledExecutorService, aunn aunnVar, aunn aunnVar2) {
        this.d = context;
        this.a = awmdVar;
        this.f = tqjVar;
        this.g = scheduledExecutorService;
        this.i = aunnVar;
        this.j = aunnVar2;
        this.l = new dov((Object) awmdVar2, (byte[]) null);
        this.c = ((Boolean) optional.orElse(Boolean.FALSE)).booleanValue();
        Optional optional2 = sxo.a;
        sxo.a = Optional.of(this);
    }

    public static sxn a(Context context) {
        return ((sxl) aguu.av(context, sxl.class)).V();
    }

    private final ajbq d(String str, Object obj) {
        aihf aihfVarCreateBuilder = ajbq.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajbq ajbqVar = (ajbq) aihfVarCreateBuilder.instance;
        str.getClass();
        ajbqVar.b |= 1;
        ajbqVar.e = str;
        int i = tqr.a;
        if (this.f.k(72318)) {
            return (ajbq) aihfVarCreateBuilder.build();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (bArr.length > 2048) {
                aigj aigjVarW = aigj.w(bArr, 0, SemanticState.Modal);
                aihfVarCreateBuilder.copyOnWrite();
                ajbq ajbqVar2 = (ajbq) aihfVarCreateBuilder.instance;
                aigjVarW.getClass();
                ajbqVar2.c = 2;
                ajbqVar2.d = aigjVarW;
                aihfVarCreateBuilder.copyOnWrite();
                ajbq ajbqVar3 = (ajbq) aihfVarCreateBuilder.instance;
                ajbqVar3.b |= 2;
                ajbqVar3.f = true;
            } else {
                aigj aigjVarV = aigj.v(bArr);
                aihfVarCreateBuilder.copyOnWrite();
                ajbq ajbqVar4 = (ajbq) aihfVarCreateBuilder.instance;
                aigjVarV.getClass();
                ajbqVar4.c = 2;
                ajbqVar4.d = aigjVarV;
            }
        } else if (obj instanceof String) {
            String strE = e((String) obj);
            aihfVarCreateBuilder.copyOnWrite();
            ajbq ajbqVar5 = (ajbq) aihfVarCreateBuilder.instance;
            strE.getClass();
            ajbqVar5.c = 4;
            ajbqVar5.d = strE;
        } else if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            num.intValue();
            aihfVarCreateBuilder.copyOnWrite();
            ajbq ajbqVar6 = (ajbq) aihfVarCreateBuilder.instance;
            ajbqVar6.c = 3;
            ajbqVar6.d = num;
        } else if (obj != null) {
            String strE2 = e(obj.toString());
            aihfVarCreateBuilder.copyOnWrite();
            ajbq ajbqVar7 = (ajbq) aihfVarCreateBuilder.instance;
            strE2.getClass();
            ajbqVar7.c = 5;
            ajbqVar7.d = strE2;
        }
        return (ajbq) aihfVarCreateBuilder.build();
    }

    private static String e(String str) {
        return str.length() > 2048 ? str.substring(0, SemanticState.Modal) : str;
    }

    private final void f(Intent intent, sxm sxmVar, int i) {
        aihf aihfVarG = g(intent);
        aihf aihfVarCreateBuilder = ajbs.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajbs ajbsVar = (ajbs) aihfVarCreateBuilder.instance;
        ajbsVar.b |= 1;
        ajbsVar.c = false;
        aihfVarG.copyOnWrite();
        ajbn ajbnVar = (ajbn) aihfVarG.instance;
        ajbs ajbsVar2 = (ajbs) aihfVarCreateBuilder.build();
        ajbn ajbnVar2 = ajbn.a;
        ajbsVar2.getClass();
        ajbnVar.g = ajbsVar2;
        ajbnVar.b |= 8;
        if (i == 2) {
            aihfVarG.copyOnWrite();
            ajbn ajbnVar3 = (ajbn) aihfVarG.instance;
            ajbnVar3.b |= 16;
            ajbnVar3.h = true;
            i = 2;
        }
        i(aihfVarG, intent);
        k(aihfVarG, sxmVar, i);
        j(aihfVarG);
    }

    private static aihf g(Intent intent) {
        return h(intent.getComponent(), intent.getAction(), intent.getDataString(), intent.getFlags());
    }

    private static aihf h(ComponentName componentName, String str, String str2, int i) {
        aihf aihfVarCreateBuilder = ajbn.a.createBuilder();
        if (componentName != null) {
            aihf aihfVarCreateBuilder2 = ajbo.a.createBuilder();
            String packageName = componentName.getPackageName();
            aihfVarCreateBuilder2.copyOnWrite();
            ajbo ajboVar = (ajbo) aihfVarCreateBuilder2.instance;
            packageName.getClass();
            ajboVar.b |= 1;
            ajboVar.c = packageName;
            String className = componentName.getClassName();
            aihfVarCreateBuilder2.copyOnWrite();
            ajbo ajboVar2 = (ajbo) aihfVarCreateBuilder2.instance;
            className.getClass();
            ajboVar2.b |= 2;
            ajboVar2.d = className;
            ajbo ajboVar3 = (ajbo) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            ajbn ajbnVar = (ajbn) aihfVarCreateBuilder.instance;
            ajboVar3.getClass();
            ajbnVar.c = ajboVar3;
            ajbnVar.b |= 1;
        }
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            ajbn ajbnVar2 = (ajbn) aihfVarCreateBuilder.instance;
            ajbnVar2.b |= 2;
            ajbnVar2.d = str;
        }
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            ajbn ajbnVar3 = (ajbn) aihfVarCreateBuilder.instance;
            ajbnVar3.b |= 32;
            ajbnVar3.i = str2;
        }
        aihfVarCreateBuilder.copyOnWrite();
        ajbn ajbnVar4 = (ajbn) aihfVarCreateBuilder.instance;
        ajbnVar4.b |= 4;
        ajbnVar4.e = i;
        return aihfVarCreateBuilder;
    }

    private final void i(aihf aihfVar, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                aihfVar.aK(d(str, extras.get(str)));
            }
        }
    }

    private final void j(aihf aihfVar) {
        awmd awmdVar = this.a;
        if (!((xeu) awmdVar.io()).b) {
            this.g.execute(afwl.i(new sxk(this, aihfVar, 0)));
            return;
        }
        xff xffVarA = ((xeu) awmdVar.io()).a(aihfVar, alot.ANDROID_INTENT_EVENT);
        ztf ztfVar = xffVarA.k.e;
        xffVarA.l = ztfVar.a();
        ztfVar.k(xffVarA);
    }

    private static final void k(aihf aihfVar, sxm sxmVar, int i) {
        aihf aihfVarCreateBuilder = ajbp.a.createBuilder();
        aihfVarCreateBuilder.aL(sxmVar.b);
        if (i == 3) {
            aihfVarCreateBuilder.aL(5);
        } else if (i == 4) {
            aihfVarCreateBuilder.aL(7);
        }
        ajbp ajbpVar = (ajbp) aihfVarCreateBuilder.build();
        aihfVar.copyOnWrite();
        ajbn ajbnVar = (ajbn) aihfVar.instance;
        ajbn ajbnVar2 = ajbn.a;
        ajbpVar.getClass();
        ajbnVar.k = ajbpVar;
        ajbnVar.b |= SemanticState.Focused;
    }

    public final void b(Intent intent, Class cls) {
        int i = tqr.a;
        if (this.f.k(72327)) {
            synchronized (this) {
                agm agmVar = this.h;
                if (agmVar.b(intent) == null) {
                    intent.putExtra("GIBB_ID", ThreadLocalRandom.current().nextLong());
                    aihf aihfVarG = g(intent);
                    aihfVarG.copyOnWrite();
                    ajbn ajbnVar = (ajbn) aihfVarG.instance;
                    ajbn ajbnVar2 = ajbn.a;
                    ajbnVar.b |= 64;
                    ajbnVar.j = true;
                    i(aihfVarG, intent);
                    String canonicalName = cls.getCanonicalName();
                    if (canonicalName != null) {
                        aihfVarG.copyOnWrite();
                        ajbn ajbnVar3 = (ajbn) aihfVarG.instance;
                        ajbnVar3.b |= SemanticState.Hidden;
                        ajbnVar3.l = canonicalName;
                    }
                    xeu xeuVar = (xeu) this.a.io();
                    if (xeuVar.b) {
                        xff xffVarA = xeuVar.a(aihfVarG, alot.ANDROID_INTENT_EVENT);
                        ztf ztfVar = xffVarA.k.e;
                        xffVarA.l = ztfVar.a();
                        ztfVar.k(xffVarA);
                    } else {
                        alos alosVar = (alos) alou.a.createBuilder();
                        alosVar.copyOnWrite();
                        alou alouVar = (alou) alosVar.instance;
                        ajbn ajbnVar4 = (ajbn) aihfVarG.build();
                        ajbnVar4.getClass();
                        alouVar.d = ajbnVar4;
                        alouVar.c = 488;
                        xeuVar.b((alou) alosVar.build());
                    }
                    agmVar.c(intent, Boolean.TRUE);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, java.util.List] */
    public final Intent c(Class cls, Intent intent, int i) {
        ActivityInfo activityInfo;
        sxm sxmVar;
        int i2 = i;
        if (!this.c) {
            return intent;
        }
        tqj tqjVar = this.f;
        int i3 = tqr.a;
        if (tqjVar.k(72283)) {
            return intent;
        }
        ComponentName component = null;
        if (intent == null) {
            return null;
        }
        ComponentName component2 = intent.getComponent();
        char c = '\b';
        int i4 = 2;
        int i5 = 0;
        if (component2 == null) {
            cls.getName();
            sxmVar = new sxm(false, 2);
        } else {
            Optional optional = (Optional) this.i.io();
            if (optional.isPresent() && ((agkz) optional.get()).contains(component2)) {
                sxmVar = new sxm(true, 8);
            } else {
                Optional optional2 = (Optional) this.j.io();
                if (optional2.isPresent() && ((agkz) optional2.get()).contains(component2)) {
                    sxmVar = new sxm(false, 9);
                } else {
                    synchronized (this.e) {
                        try {
                            activityInfo = (ActivityInfo) this.k.get(component2);
                            if (activityInfo == null) {
                                try {
                                    activityInfo = this.d.getPackageManager().getActivityInfo(component2, 0);
                                    if (activityInfo != null) {
                                        this.k.put(component2, activityInfo);
                                    }
                                } catch (PackageManager.NameNotFoundException unused) {
                                    sxmVar = new sxm(false, 3);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    sxmVar = (activityInfo == null || activityInfo.exported) ? new sxm(false, 4) : new sxm(true, 6);
                }
            }
        }
        if (sxmVar.a) {
            if (!this.f.k(72322)) {
                return intent;
            }
            f(intent, sxmVar, i2);
            return intent;
        }
        boolean z = i2 == 2;
        if (z) {
            String packageName = this.d.getPackageName();
            String canonicalName = cls.getCanonicalName();
            if (packageName != null && canonicalName != null) {
                component = new ComponentName(packageName, canonicalName);
            }
        } else {
            component = intent.getComponent();
        }
        ahsm ahsmVarAw = this.l.aw(intent, component, z, z && this.f.k(72282));
        int iNextInt = ThreadLocalRandom.current().nextInt(100000);
        tqj tqjVar2 = this.f;
        boolean z2 = ahsmVarAw.a;
        boolean zK = tqjVar2.k(72321);
        if (z2) {
            if (iNextInt >= tqjVar2.a(1120877) || zK) {
                ?? r10 = ahsmVarAw.b;
                if (((agke) r10).isEmpty()) {
                    agrc agrcVar = (agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/common/activity/GoodIntentions", "logResult", 217, "GoodIntentions.java");
                    Intent intent2 = (Intent) ahsmVarAw.c;
                    agrcVar.w("GI: poison %s", intent2.getComponent());
                    aihf aihfVarG = g(intent2);
                    if (i2 == 2) {
                        aihfVarG.copyOnWrite();
                        ajbn ajbnVar = (ajbn) aihfVarG.instance;
                        ajbn ajbnVar2 = ajbn.a;
                        ajbnVar.b |= 16;
                        ajbnVar.h = true;
                        i2 = 2;
                    }
                    k(aihfVarG, sxmVar, i2);
                    aihf aihfVarCreateBuilder = ajbs.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    ajbs ajbsVar = (ajbs) aihfVarCreateBuilder.instance;
                    ajbsVar.b |= 1;
                    ajbsVar.c = true;
                    aihfVarCreateBuilder.copyOnWrite();
                    ajbs ajbsVar2 = (ajbs) aihfVarCreateBuilder.instance;
                    ajbsVar2.b |= 2;
                    ajbsVar2.d = true;
                    aihfVarG.copyOnWrite();
                    ajbn ajbnVar3 = (ajbn) aihfVarG.instance;
                    ajbs ajbsVar3 = (ajbs) aihfVarCreateBuilder.build();
                    ajbn ajbnVar4 = ajbn.a;
                    ajbsVar3.getClass();
                    ajbnVar3.g = ajbsVar3;
                    ajbnVar3.b |= 8;
                    j(aihfVarG);
                } else {
                    aihf aihfVarH = h(component, intent.getAction(), intent.getDataString(), intent.getFlags());
                    aihf aihfVarCreateBuilder2 = ajbs.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    ajbs ajbsVar4 = (ajbs) aihfVarCreateBuilder2.instance;
                    ajbsVar4.b |= 1;
                    ajbsVar4.c = true;
                    int i6 = ((agpi) r10).d;
                    while (i5 < i6) {
                        tld tldVar = (tld) r10.get(i5);
                        aihf aihfVarCreateBuilder3 = ajbr.a.createBuilder();
                        char c2 = c;
                        Object obj = tldVar.a;
                        Object obj2 = tldVar.b;
                        String str = (String) obj;
                        int i7 = i4;
                        ajbq ajbqVarD = d(str, obj2);
                        aihfVarCreateBuilder3.copyOnWrite();
                        int i8 = i5;
                        ajbr ajbrVar = (ajbr) aihfVarCreateBuilder3.instance;
                        ajbqVarD.getClass();
                        ajbrVar.c = ajbqVarD;
                        ajbrVar.b |= 2;
                        aihfVarCreateBuilder2.copyOnWrite();
                        ajbs ajbsVar5 = (ajbs) aihfVarCreateBuilder2.instance;
                        ajbr ajbrVar2 = (ajbr) aihfVarCreateBuilder3.build();
                        ajbrVar2.getClass();
                        aiie aiieVar = ajbsVar5.e;
                        if (!aiieVar.c()) {
                            ajbsVar5.e = aihn.mutableCopy(aiieVar);
                        }
                        ajbsVar5.e.add(ajbrVar2);
                        Object obj3 = ahsmVarAw.c;
                        aihfVarH.aK(d(str, obj2));
                        Intent intent3 = (Intent) obj3;
                        ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/common/activity/GoodIntentions", "logResult", 238, "GoodIntentions.java")).E("GI: dropped extra %s, action %s, key %s", intent3.getComponent(), intent3.getAction(), obj);
                        i5 = i8 + 1;
                        c = c2;
                        i4 = i7;
                    }
                    i(aihfVarH, intent);
                    int i9 = i4;
                    if (i2 == i9) {
                        aihfVarH.copyOnWrite();
                        ajbn ajbnVar5 = (ajbn) aihfVarH.instance;
                        ajbn ajbnVar6 = ajbn.a;
                        ajbnVar5.b |= 16;
                        ajbnVar5.h = true;
                    } else {
                        i9 = i2;
                    }
                    k(aihfVarH, sxmVar, i9);
                    aihfVarH.copyOnWrite();
                    ajbn ajbnVar7 = (ajbn) aihfVarH.instance;
                    ajbs ajbsVar6 = (ajbs) aihfVarCreateBuilder2.build();
                    ajbn ajbnVar8 = ajbn.a;
                    ajbsVar6.getClass();
                    ajbnVar7.g = ajbsVar6;
                    ajbnVar7.b |= 8;
                    j(aihfVarH);
                }
            }
        } else if (iNextInt < tqjVar2.a(1120860) || zK) {
            f(intent, sxmVar, i2);
        }
        return (Intent) ahsmVarAw.c;
    }
}
