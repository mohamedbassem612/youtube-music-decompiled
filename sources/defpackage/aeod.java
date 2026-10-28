package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j$.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeod {
    public final Object a;
    public final Object b;
    public final Object c;

    public aeod(afip afipVar) {
        this.c = afipVar;
        this.b = new aazj(abob.a, null, null, null, null, null, false);
        this.a = new aazn(4);
    }

    public static /* synthetic */ void d(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            view.getContext();
            zvn zvnVar = zvn.b;
            zvm zvmVar = zvm.b;
            zvp.a(zvnVar, zvmVar, "View must not have a parent when recycled.");
            if (parent instanceof ViewGroup) {
                if (parent instanceof RecyclerView) {
                    zvp.a(zvnVar, zvmVar, "Cannot call removeView on a RecyclerView parent.");
                } else {
                    ((ViewGroup) parent).removeView(view);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
    public final void a(aqih aqihVar, boolean z) {
        synchronized (this.b) {
            aepv aepvVar = (aepv) this.c.io();
            aihf builder = aqihVar.toBuilder();
            aepvVar.g(builder);
            aepvVar.f(builder);
            aqih aqihVar2 = (aqih) builder.build();
            for (aesy aesyVar : this.a.values()) {
                if (aesyVar.c) {
                    if (z) {
                        try {
                            xeu xeuVar = (xeu) aesyVar.b.io();
                            aihf aihfVarCreateBuilder = aqig.a.createBuilder();
                            aihfVarCreateBuilder.copyOnWrite();
                            aqig aqigVar = (aqig) aihfVarCreateBuilder.instance;
                            aqihVar2.getClass();
                            aqigVar.c = aqihVar2;
                            aqigVar.b |= 1;
                            if (xeuVar.b) {
                                xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.SYSTEM_HEALTH_CAPTURED);
                                ztf ztfVar = xffVarA.k.e;
                                xffVarA.l = ztfVar.a();
                                ztfVar.l(xffVarA);
                            } else {
                                alos alosVar = (alos) alou.a.createBuilder();
                                alosVar.copyOnWrite();
                                alou alouVar = (alou) alosVar.instance;
                                aqig aqigVar2 = (aqig) aihfVarCreateBuilder.build();
                                aqigVar2.getClass();
                                alouVar.d = aqigVar2;
                                alouVar.c = 3;
                                xeuVar.e((alou) alosVar.build());
                            }
                        } catch (Exception e) {
                            ((agrc) ((agrc) ((agrc) aesy.a.b()).j(e)).k("com/google/android/libraries/youtube/systemhealth/transmitters/EventLoggingTransmitter", "sendCritical", 'F', "EventLoggingTransmitter.java")).t("UncaughtException error occurred in critical transmission path.");
                        }
                    } else {
                        xeu xeuVar2 = (xeu) aesyVar.b.io();
                        aihf aihfVarCreateBuilder2 = aqig.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        aqig aqigVar3 = (aqig) aihfVarCreateBuilder2.instance;
                        aqihVar2.getClass();
                        aqigVar3.c = aqihVar2;
                        aqigVar3.b |= 1;
                        if (xeuVar2.b) {
                            xff xffVarA2 = xeuVar2.a(aihfVarCreateBuilder2, alot.SYSTEM_HEALTH_CAPTURED);
                            ztf ztfVar2 = xffVarA2.k.e;
                            xffVarA2.l = ztfVar2.a();
                            ztfVar2.k(xffVarA2);
                        } else {
                            alos alosVar2 = (alos) alou.a.createBuilder();
                            alosVar2.copyOnWrite();
                            alou alouVar2 = (alou) alosVar2.instance;
                            aqig aqigVar4 = (aqig) aihfVarCreateBuilder2.build();
                            aqigVar4.getClass();
                            alouVar2.d = aqigVar4;
                            alouVar2.c = 3;
                            xeuVar2.b((alou) alosVar2.build());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public final adyy b(adyx adyxVar) {
        xgn xgnVar = (xgn) this.b.io();
        xgnVar.getClass();
        xgm xgmVar = (xgm) this.c.io();
        xgmVar.getClass();
        vxz vxzVar = (vxz) this.a.io();
        vxzVar.getClass();
        return new adyy(xgnVar, xgmVar, vxzVar, adyxVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final adme c(Class cls) {
        aha ahaVar = (aha) this.a;
        int iC = ahaVar.c(cls);
        if (iC >= 0) {
            return (adme) ahaVar.g(iC);
        }
        ?? r2 = this.b;
        if (!r2.containsKey(cls)) {
            return null;
        }
        adme admeVar = (adme) ((awmd) r2.get(cls)).io();
        ahaVar.put(cls, admeVar);
        return admeVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Map] */
    public final adhf e(akzv akzvVar, adhe adheVar) {
        aeod aeodVar = (aeod) this.b;
        vxe vxeVar = (vxe) aeodVar.c.io();
        vxeVar.getClass();
        wbz wbzVar = (wbz) aeodVar.b.io();
        wbzVar.getClass();
        avmb avmbVar = (avmb) aeodVar.a.io();
        avmbVar.getClass();
        ?? r5 = this.c;
        r5.getClass();
        akzvVar.getClass();
        adhf adhfVar = new adhf(vxeVar, wbzVar, avmbVar, r5, akzvVar, adheVar);
        ((List) Map.EL.computeIfAbsent(this.a, akzvVar.c, new accu(10))).add(adhfVar);
        return adhfVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final List f(String str) {
        return (List) this.a.get(str);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void g(adhf adhfVar) {
        adhfVar.d();
        ?? r2 = this.a;
        String str = adhfVar.f;
        if (r2.containsKey(str)) {
            List list = (List) r2.get(str);
            list.remove(adhfVar);
            if (list.isEmpty()) {
                r2.remove(str);
            }
        }
    }

    public aeod(abxu abxuVar, abvy abvyVar, abmt abmtVar) {
        abxuVar.getClass();
        abvyVar.getClass();
        abmtVar.getClass();
        this.c = abxuVar;
        this.a = abvyVar;
        this.b = abmtVar;
    }

    public aeod(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, char[] cArr) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.a = awmdVar3;
    }

    public aeod(aeod aeodVar, zwb zwbVar) {
        this.b = aeodVar;
        this.a = new HashMap();
        this.c = zwbVar;
    }

    public aeod(awmd awmdVar, zwn zwnVar, awmd awmdVar2, Set set) {
        this.c = awmdVar;
        this.a = zwnVar;
        this.b = aguu.al(new jxq(awmdVar2, set, 18, null));
    }

    public aeod(java.util.Map map, java.util.Map map2) {
        this.b = map;
        this.c = map2;
        this.a = new aha(0);
    }

    public aeod(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        this.a = awmdVar3;
    }

    public aeod(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, byte[] bArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
    }

    public aeod(aenx aenxVar, aunn aunnVar, tre treVar) {
        aunnVar.getClass();
        treVar.getClass();
        this.a = aenxVar;
        this.b = aunnVar;
        this.c = treVar;
    }

    public aeod(awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
    }

    public aeod(awmd awmdVar) {
        this.b = new Object();
        this.a = new HashMap();
        this.c = awmdVar;
    }
}
