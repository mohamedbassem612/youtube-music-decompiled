package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xdb {
    public final avlh d;
    public final avmb e;
    public final vxe f;
    public xdh g;
    public wwn h;
    final abzo i;
    final aaok j;
    private final ahey k;
    private final cf l;
    private final acxn m;
    private final zvl n;
    private final awly p;
    private final avlw q;
    private final xit r;
    private avlc s;
    private final vxz t;
    final Map a = new HashMap();
    final Set b = new HashSet();
    final Map c = new HashMap();
    private final awly o = new awlo().az();

    /* JADX WARN: Type inference failed for: r10v5, types: [avlw, java.lang.Object] */
    public xdb(cf cfVar, vwt vwtVar, ahey aheyVar, acxn acxnVar, adhv adhvVar, avmb avmbVar, xsc xscVar, vxe vxeVar, zvl zvlVar, aaok aaokVar, vxz vxzVar, xit xitVar) {
        new awlo();
        this.p = new awlo().az();
        this.l = cfVar;
        this.k = aheyVar;
        this.m = acxnVar;
        this.e = avmbVar;
        this.i = new abzo(cfVar, vwtVar, adhvVar, avmbVar, zvlVar, acxnVar, new xxj(this, null));
        this.d = (avlh) xscVar.c;
        this.f = vxeVar;
        this.n = zvlVar;
        this.j = aaokVar;
        this.q = xscVar.a;
        this.t = vxzVar;
        this.r = xitVar;
        vwtVar.D(new wko(this, 5));
    }

    private final avlc k() {
        if (this.s == null) {
            this.s = new xda(this, 0);
        }
        return this.s;
    }

    private final void l(String str) {
        zvj zvjVarA = zvk.a();
        zvjVarA.i = 220;
        zvjVarA.j = 33;
        zvjVarA.d(str);
        zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
        this.n.a(zvjVarA.a());
    }

    private final synchronized void m(String str, int i) {
        ahew ahewVarSchedule = this.k.schedule(new tln(this, str, 2), i, TimeUnit.MILLISECONDS);
        this.c.put(str, ahewVarSchedule);
        taf.m(this.l, ahewVarSchedule, new jco(20), new uny(this, 15));
    }

    public final void a(amej amejVar) {
        xdh xdhVar;
        String str;
        if ((yno.du(amejVar).c & 8) != 0) {
            if (!amejVar.h) {
                aaok aaokVar = this.j;
                if (aaokVar.p() && (xdhVar = this.g) != null && xdhVar.h(amejVar)) {
                    c(amejVar);
                    return;
                }
                aaokVar.n(amejVar);
                xdh xdhVar2 = this.g;
                if (xdhVar2 == null || !xdhVar2.h(amejVar)) {
                    return;
                }
                b();
                return;
            }
            xdh xdhVar3 = this.g;
            if (xdhVar3 != null) {
                if (xdhVar3.h(amejVar)) {
                    c(amejVar);
                    return;
                }
                Iterator it = this.a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    amer amerVar = (amer) it.next();
                    int iBh = a.bh(amerVar.d);
                    if (iBh == 0) {
                        iBh = 1;
                    }
                    if (iBh == 4) {
                        str = amerVar.e;
                        break;
                    }
                }
                if (str != null) {
                    f(str, false, false);
                    c(amejVar);
                    return;
                }
                aihf builder = amejVar.toBuilder();
                builder.copyOnWrite();
                amej amejVar2 = (amej) builder.instance;
                amejVar2.c |= 16;
                amejVar2.h = false;
                a((amej) builder.build());
            }
        }
    }

    public final synchronized void b() {
        xdh xdhVar = this.g;
        if (xdhVar != null) {
            Optional optionalQ = this.j.q(xdhVar);
            vrl vrlVar = new vrl(this, 19);
            if (true == optionalQ.isPresent()) {
                Object obj = optionalQ.get();
                Object obj2 = vrlVar.a;
                ((xdb) obj2).c((amej) obj);
                ((xdb) obj2).b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x011b  */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.List] */
    public final synchronized void c(amej amejVar) {
        int i;
        int iBh;
        Optional optionalEmpty;
        String str;
        ListenableFuture listenableFuture;
        Optional optionalEmpty2;
        if (this.g != null) {
            amer amerVarDu = yno.du(amejVar);
            Set set = this.b;
            if (set.contains(yno.dw(amerVarDu))) {
                b();
                return;
            }
            Optional optionalDv = yno.dv(amejVar);
            if (optionalDv.isPresent() && set.contains(yno.dw((amer) optionalDv.get()))) {
                aihf builder = amejVar.toBuilder();
                builder.copyOnWrite();
                amej amejVar2 = (amej) builder.instance;
                amejVar2.e = null;
                amejVar2.c &= -3;
                amejVar = (amej) builder.build();
            }
            if (this.g != null) {
                String str2 = amerVarDu.e;
                Map map = this.a;
                int i2 = 1;
                boolean z = !map.isEmpty() && map.containsKey(str2);
                int i3 = 8;
                if (z) {
                    if ((amerVarDu.c & 8) != 0) {
                        l("Tried to add an interactivity widget that already exists. Ephemeral widget.");
                    } else {
                        l("Tried to add an interactivity widget that already exists. Persistent widget.");
                    }
                    if (!((amer) map.get(str2)).equals(amerVarDu)) {
                    }
                } else if ((amerVarDu.c & 8) == 0 && (iBh = a.bh((i = amerVarDu.d))) != 0 && iBh != 1) {
                    int iBh2 = a.bh(i);
                    if (iBh2 == 0) {
                        iBh2 = 1;
                    }
                    if (map.isEmpty()) {
                        optionalEmpty = Optional.empty();
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (amer amerVar : map.values()) {
                            if ((amerVar.c & 8) == 0) {
                                int iBh3 = a.bh(amerVar.d);
                                if (iBh3 == 0) {
                                    iBh3 = 1;
                                }
                                if (iBh3 == iBh2) {
                                    arrayList.add(amerVar.e);
                                }
                            }
                        }
                        optionalEmpty = arrayList.isEmpty() ? Optional.empty() : Optional.of(arrayList);
                    }
                    if (optionalEmpty.isPresent() && !optionalEmpty.get().isEmpty()) {
                        int iBh4 = a.bh(amerVarDu.d);
                        if (iBh4 != 0) {
                            switch (iBh4) {
                                case 1:
                                    str = "INTERACTIVITY_WIDGET_TYPE_UNSPECIFIED";
                                    break;
                                case 2:
                                    str = "INTERACTIVITY_WIDGET_TYPE_PAID_STICKER";
                                    break;
                                case 3:
                                    str = "INTERACTIVITY_WIDGET_TYPE_PROMPT";
                                    break;
                                case 4:
                                    str = "INTERACTIVITY_WIDGET_TYPE_GIFT";
                                    break;
                                case 5:
                                    str = "INTERACTIVITY_WIDGET_TYPE_GIFT_COMBO_BUTTON";
                                    break;
                                case 6:
                                    str = "INTERACTIVITY_WIDGET_TYPE_POLL";
                                    break;
                                case 7:
                                    str = "INTERACTIVITY_WIDGET_TYPE_CREATOR_GOAL_CELEBRATION";
                                    break;
                                case 8:
                                    str = "INTERACTIVITY_WIDGET_TYPE_COUNTDOWN";
                                    break;
                                default:
                                    str = "INTERACTIVITY_WIDGET_TYPE_SHOWDOWN";
                                    break;
                            }
                        } else {
                            str = "INTERACTIVITY_WIDGET_TYPE_UNSPECIFIED";
                        }
                        l("Tried to add multiple persistent interactivity widgets with the same type. ".concat(str));
                        Collection.EL.stream(optionalEmpty.get()).forEach(new vnm(this, i3));
                    }
                }
                map.put(str2, amerVarDu);
                xdh xdhVar = this.g;
                if (xdhVar.h(amejVar)) {
                    if ((amejVar.c & 4) != 0) {
                        vxe vxeVar = xdhVar.c;
                        ajwo ajwoVar = amejVar.f;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        vxeVar.a(ajwoVar);
                    }
                    Optional optionalDv2 = yno.dv(amejVar);
                    amer amerVarDu2 = yno.du(amejVar);
                    String str3 = amerVarDu2.e;
                    Optional optionalOfNullable = true != optionalDv2.isPresent() ? optionalDv2 : Optional.ofNullable(xdh.i(((amer) optionalDv2.get()).e));
                    if ((amejVar.c & 8) != 0) {
                        ajwo ajwoVar2 = amejVar.g;
                        if (ajwoVar2 == null) {
                            ajwoVar2 = ajwo.a;
                        }
                        optionalEmpty2 = Optional.of(ajwoVar2);
                    } else {
                        optionalEmpty2 = Optional.empty();
                    }
                    xdhVar.c(amerVarDu2, str3, optionalOfNullable, optionalEmpty2);
                    xdd xddVar = new xdd(xdhVar, i2);
                    if (true == optionalDv2.isPresent()) {
                        Object obj = optionalDv2.get();
                        ((xdh) xddVar.a).c((amer) obj, xdh.i(((amer) obj).e), Optional.empty(), Optional.empty());
                    }
                }
                int iBh5 = a.bh(amerVarDu.d);
                if (iBh5 != 0 && iBh5 == 4) {
                    if (!z && this.h != null && this.t.m(49, 45681741L)) {
                        this.h.g.b();
                    }
                    xit xitVar = this.r;
                    Optional optionalB = xitVar.g().b(307, amerVarDu.e);
                    if (true == optionalB.isPresent()) {
                        ((xir) optionalB.get()).f(tau.GIFT_INTERACTIVITY_WIDGET_DISPLAYED);
                    }
                    xitVar.g().d(307, amerVarDu.e);
                }
                if ((amerVarDu.c & 8) == 0) {
                    this.q.kk(Boolean.TRUE);
                    return;
                }
                Map map2 = this.c;
                if (map2.containsKey(str2) && (listenableFuture = (ListenableFuture) map2.remove(str2)) != null) {
                    listenableFuture.cancel(false);
                }
                amen amenVarA = amen.a(amerVarDu.j);
                if (amenVarA == null) {
                    amenVarA = amen.INTERACTIVITY_WIDGET_ANIMATION_TYPE_UNSPECIFIED;
                }
                yno.dy(amenVarA);
                m(str2, amerVarDu.g + 300);
            }
        }
    }

    public final synchronized void d(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ammr.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ammr.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            e(((ammr) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).g);
            return;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(amms.b);
        ajwoVar.c(aihlVarCheckIsLite3);
        if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(amms.b);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            g(((amms) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).g);
            return;
        }
        aihl aihlVar = amqi.b;
        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite5);
        if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite6);
            Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
            g(((amqi) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3))).d);
        }
    }

    public final synchronized void e(String str) {
        f(str, true, true);
    }

    public final void f(String str, boolean z, boolean z2) {
        xdh xdhVar;
        ListenableFuture listenableFuture;
        Map map = this.a;
        if (map.isEmpty() || !map.containsKey(str) || (xdhVar = this.g) == null) {
            this.j.o(str);
            this.i.f(str);
            return;
        }
        amer amerVar = (amer) map.get(str);
        boolean z3 = (amerVar == null || (amerVar.c & 8) == 0) ? false : true;
        if (z3 && z) {
            avlb avlbVarA = xdhVar.a(str);
            if (z2) {
                avlbVarA.kp(k());
            }
        } else {
            xdhVar.e(str);
            if (!z3) {
                this.q.kk(Boolean.FALSE);
            }
        }
        map.remove(str);
        Map map2 = this.c;
        if (!map2.containsKey(str) || (listenableFuture = (ListenableFuture) map2.remove(str)) == null) {
            return;
        }
        listenableFuture.cancel(false);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    final synchronized void g(String str) {
        Map map = this.a;
        if (!map.isEmpty() && this.g != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                amer amerVar = (amer) it.next();
                apji apjiVar = amerVar.m;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
                apjiVar.c(aihlVarCheckIsLite);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                String strDN = yno.dN(this.m.a((akrn) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))));
                if (strDN != null && strDN.equals(str)) {
                    it.remove();
                    xdh xdhVar = this.g;
                    if (xdhVar != null) {
                        xdhVar.a(amerVar.e).kp(k());
                    }
                }
            }
        }
        aaok aaokVar = this.j;
        Iterable$EL.forEach(aaokVar.d.values(), new rew(aaokVar, str, 18, null));
        this.i.g(str);
    }

    public final synchronized void h() {
        Map map = this.c;
        if (!map.isEmpty()) {
            j$.util.Map.EL.forEach(map, new qzo(2));
        }
        this.b.clear();
        map.clear();
        this.j.m();
        this.a.clear();
        xdh xdhVar = this.g;
        if (xdhVar != null) {
            xdhVar.b();
        }
        this.i.h();
    }

    public final void i(boolean z) {
        this.p.kk(Boolean.valueOf(z));
    }

    public final void j() {
        xdh xdhVar = this.g;
        if (xdhVar != null) {
            this.o.kk(0);
            xdhVar.g(false);
        }
    }
}
