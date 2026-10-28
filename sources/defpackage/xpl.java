package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.Size;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import io.grpc.Status;
import j$.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xpl {
    public final Object a;
    public final Object b;

    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Map] */
    public xpl(Context context) {
        int i;
        this.b = new LinkedHashMap();
        this.a = new LinkedHashMap();
        agke agkeVar = vku.a.g;
        agkeVar.getClass();
        agke agkeVar2 = vku.b.g;
        agkeVar2.getClass();
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            agke agkeVar3 = (agke) agkeVar.get(i3);
            agke agkeVar4 = (agke) agkeVar2.get(i3);
            int iMin = Math.min(agkeVar3.size(), agkeVar4.size());
            for (int i4 = 0; i4 < iMin; i4++) {
                Object obj = agkeVar3.get(i4);
                obj.getClass();
                umg umgVarU = u(context, (vix) obj);
                Object obj2 = agkeVar4.get(i4);
                obj2.getClass();
                umg umgVarU2 = u(context, (vix) obj2);
                int i5 = umgVarU.a;
                agkj agkjVar = umh.a;
                this.b.put(Integer.valueOf(i5 | (-16777216)), umgVarU2);
                this.b.put(Integer.valueOf(umgVarU.c | (-16777216)), umgVarU2);
                this.a.put(Integer.valueOf(umgVarU2.a | (-16777216)), umgVarU);
                this.a.put(Integer.valueOf(umgVarU2.c | (-16777216)), umgVarU);
            }
        }
        agke agkeVar5 = (agke) agkeVar.get(2);
        agke agkeVar6 = (agke) agkeVar2.get(2);
        while (true) {
            if (i2 >= 4) {
                break;
            }
            if (i2 < agkeVar5.size() && i2 < agkeVar6.size()) {
                Object obj3 = agkeVar5.get(i2);
                obj3.getClass();
                umg umgVarU3 = u(context, (vix) obj3);
                Object obj4 = agkeVar6.get(i2);
                obj4.getClass();
                umg umgVarU4 = u(context, (vix) obj4);
                int i6 = umgVarU3.a;
                agkj agkjVar2 = umh.a;
                this.b.put(Integer.valueOf(i6 | (-16777216)), umgVarU4);
                this.b.put(Integer.valueOf(umgVarU3.c | (-16777216)), umgVarU4);
                this.a.put(Integer.valueOf(umgVarU4.a | (-16777216)), umgVarU3);
                this.a.put(Integer.valueOf(umgVarU4.c | (-16777216)), umgVarU3);
            }
            i2++;
        }
        if (agkeVar6.size() > 3) {
            Object obj5 = agkeVar6.get(3);
            obj5.getClass();
            umg umgVarU5 = u(context, (vix) obj5);
            int size = agkeVar5.size();
            for (i = 4; i < size; i++) {
                Object obj6 = agkeVar5.get(i);
                obj6.getClass();
                umg umgVarU6 = u(context, (vix) obj6);
                int i7 = umgVarU6.a;
                agkj agkjVar3 = umh.a;
                this.b.put(Integer.valueOf(i7 | (-16777216)), umgVarU5);
                this.b.put(Integer.valueOf(umgVarU6.c | (-16777216)), umgVarU5);
            }
        }
    }

    public static amyx b(String str, String str2) {
        aihf aihfVarCreateBuilder = amyx.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amyx amyxVar = (amyx) aihfVarCreateBuilder.instance;
        amyxVar.c = 2;
        amyxVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        amyx amyxVar2 = (amyx) aihfVarCreateBuilder.instance;
        amyxVar2.b |= 2;
        amyxVar2.d = str;
        aihfVarCreateBuilder.copyOnWrite();
        amyx amyxVar3 = (amyx) aihfVarCreateBuilder.instance;
        amyxVar3.b |= 4;
        amyxVar3.e = str2;
        return (amyx) aihfVarCreateBuilder.build();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:19:0x002a  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0034  */
    /* JADX WARN: Code duplicated, block: B:25:0x0039  */
    /* JADX WARN: Code duplicated, block: B:26:0x003c  */
    public static xpl t(alvl alvlVar, long j, wjb wjbVar) {
        arqd arqdVar;
        alvt alvtVar;
        alvk alvkVar;
        alvk alvkVar2;
        if (alvlVar == null) {
            arqdVar = null;
        } else {
            int i = alvlVar.c;
            aony aonyVarA = aony.a(i);
            if (aonyVarA == null) {
                aonyVarA = aony.OK;
            }
            if (aonyVarA == aony.UNPLAYABLE) {
                alvkVar = alvlVar.h;
                if (alvkVar == null) {
                    alvkVar = alvk.a;
                }
                if (alvkVar.b == 86164011) {
                    alvkVar2 = alvlVar.h;
                    if (alvkVar2 == null) {
                        alvkVar2 = alvk.a;
                    }
                    if (alvkVar2.b == 86164011) {
                        arqdVar = (arqd) alvkVar2.c;
                    } else {
                        arqdVar = arqd.a;
                    }
                } else {
                    arqdVar = null;
                }
            } else {
                aony aonyVarA2 = aony.a(i);
                if (aonyVarA2 == null) {
                    aonyVarA2 = aony.OK;
                }
                if (aonyVarA2 == aony.LIVE_STREAM_OFFLINE) {
                    alvkVar = alvlVar.h;
                    if (alvkVar == null) {
                        alvkVar = alvk.a;
                    }
                    if (alvkVar.b == 86164011) {
                        alvkVar2 = alvlVar.h;
                        if (alvkVar2 == null) {
                            alvkVar2 = alvk.a;
                        }
                        if (alvkVar2.b == 86164011) {
                            arqdVar = (arqd) alvkVar2.c;
                        } else {
                            arqdVar = arqd.a;
                        }
                    } else {
                        arqdVar = null;
                    }
                } else {
                    arqdVar = null;
                }
            }
        }
        if (arqdVar == null || arqdVar.b.d() <= 0 || (alvtVar = (alvt) wjr.F(arqdVar.b.G(), alvt.a)) == null) {
            return null;
        }
        wji wjiVar = new wji(alvtVar, j);
        if (wjbVar != null) {
            wjiVar = new wji(alvtVar, j, wjbVar);
        }
        return new xpl((Object) arqdVar, (Object) wjiVar, (byte[]) null);
    }

    private static final umg u(Context context, vix vixVar) {
        return new umg(context.getColor(vixVar.a), context.getColor(vixVar.d), context.getColor(vixVar.c), context.getColor(vixVar.e));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [agfr, java.lang.Object] */
    public final boolean a(int i, xod xodVar) {
        amyy amyyVar;
        int iAV;
        Iterator it = ((List) this.b.io()).iterator();
        do {
            if (!it.hasNext()) {
                amyyVar = null;
                break;
            }
            amyyVar = (amyy) it.next();
            iAV = a.aV(amyyVar.c);
            if (iAV == 0) {
                iAV = 1;
            }
        } while (iAV != i);
        if (amyyVar != null && amyyVar.d.size() != 0) {
            for (amyx amyxVar : amyyVar.d) {
                Object obj = this.a;
                amyxVar.getClass();
                int i2 = amyxVar.c;
                int iBc = a.bc(i2);
                if (iBc != 0 && iBc != 1) {
                    int i3 = xodVar.d;
                    int iBc2 = a.bc(i2);
                    if (iBc2 == 0) {
                        iBc2 = 1;
                    }
                    if (i3 != iBc2) {
                        continue;
                    }
                }
                elq elqVar = (elq) obj;
                if (elqVar.y(xodVar.a, amyxVar.d) && elqVar.y(xodVar.b, amyxVar.e) && elqVar.y(xodVar.c, amyxVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [bec, java.lang.Object] */
    public final Object c(awoq awoqVar) throws Throwable {
        xnj xnjVar;
        if (awoqVar instanceof xnj) {
            xnjVar = (xnj) awoqVar;
            int i = xnjVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xnjVar.b = i - Integer.MIN_VALUE;
            } else {
                xnjVar = new xnj(this, awoqVar);
            }
        } else {
            xnjVar = new xnj(this, awoqVar);
        }
        Object objO = xnjVar.a;
        awox awoxVar = awox.a;
        int i2 = xnjVar.b;
        if (i2 == 0) {
            atqp.j(objO);
            awzc awzcVarB = this.a.b();
            xnjVar.b = 1;
            objO = awqx.o(awzcVarB, xnjVar);
            if (objO == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objO);
        }
        amyt amytVarA = amyt.a(((xni) objO).c);
        return amytVarA == null ? amyt.MDX_LOCAL_NETWORK_PERMISSION_STATUS_UNSPECIFIED : amytVarA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [bec, java.lang.Object] */
    public final Object d(awoq awoqVar) throws Throwable {
        xnk xnkVar;
        if (awoqVar instanceof xnk) {
            xnkVar = (xnk) awoqVar;
            int i = xnkVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xnkVar.b = i - Integer.MIN_VALUE;
            } else {
                xnkVar = new xnk(this, awoqVar);
            }
        } else {
            xnkVar = new xnk(this, awoqVar);
        }
        Object objO = xnkVar.a;
        awox awoxVar = awox.a;
        int i2 = xnkVar.b;
        if (i2 == 0) {
            atqp.j(objO);
            awzc awzcVarB = this.a.b();
            xnkVar.b = 1;
            objO = awqx.o(awzcVarB, xnkVar);
            if (objO == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objO);
        }
        String str = ((xni) objO).d;
        str.getClass();
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [bec, java.lang.Object] */
    public final Object e(amyt amytVar, awoq awoqVar) throws Throwable {
        xnl xnlVar;
        if (awoqVar instanceof xnl) {
            xnlVar = (xnl) awoqVar;
            int i = xnlVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xnlVar.b = i - Integer.MIN_VALUE;
            } else {
                xnlVar = new xnl(this, awoqVar);
            }
        } else {
            xnlVar = new xnl(this, awoqVar);
        }
        Object obj = xnlVar.a;
        awox awoxVar = awox.a;
        int i2 = xnlVar.b;
        if (i2 == 0) {
            atqp.j(obj);
            ?? r5 = this.a;
            xnm xnmVar = new xnm(amytVar, (awoq) null, 0);
            xnlVar.b = 1;
            if (r5.a(xnmVar, xnlVar) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public final xhx f() {
        ((xgo) this.b.io()).getClass();
        ((Executor) this.a.io()).getClass();
        return new xhx();
    }

    public final boolean g() {
        return ((amoo) this.b).g && ((amve) this.a).k;
    }

    public final ListenableFuture h(zwa zwaVar) {
        return ahno.ar(((syn) this.b).n(zwaVar), new vdm(this, 18), MoreExecutors.directExecutor());
    }

    public final CharSequence i() {
        alay alayVar = ((arqd) this.a).c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        return ackj.k(null, alayVar, null, false);
    }

    public final aaqf j(zwa zwaVar) {
        return ((wuj) aguu.aw((Context) this.a, wuj.class, ((syn) this.b).m(zwaVar))).C();
    }

    public final Status k(byte[] bArr, byte[] bArr2) {
        Status status = (Status) this.b;
        return status.e() ? ((zj) this.a).n(bArr, bArr2) : status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ljt] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture l() {
        agrx agrxVar = agso.a;
        ljj ljjVar = (ljj) new lqa((char[]) null).a;
        ljjVar.a = "AIzaSyDHQ9ipnphqTzDqZsbtd8_Ru4_kiKVQe2k";
        return qnl.bp(this.b.a(ljjVar).a(this.a, new vlm(0)));
    }

    public final boolean m() {
        return ((vxz) this.b).m(11, 45755394L);
    }

    public final boolean n() {
        return ((vxz) this.a).m(26, 45815001L);
    }

    public final boolean o() {
        return ((vxz) this.b).m(13, 45804367L);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized aeiv p(String str) {
        return (aeiv) Map.EL.computeIfAbsent(this.b, str, new uot(this, 19));
    }

    public final void q() {
        taq.d();
        Context context = (Context) this.a;
        String string = context.getString(R.string.effects_retrieval_failed_body);
        acwr acwrVarF = ((abfv) this.b).f(context);
        acwrVarF.i(R.string.effects_retrieval_failed_title);
        acwrVarF.e(string);
        acwrVarF.setPositiveButton(android.R.string.ok, null);
        acwrVarF.create().show();
    }

    public final void r() {
        taq.d();
        Context context = (Context) this.a;
        String string = context.getString(R.string.effects_load_failed_body);
        acwr acwrVarF = ((abfv) this.b).f(context);
        acwrVarF.i(R.string.effects_load_failed_title);
        acwrVarF.e(string);
        acwrVarF.setPositiveButton(android.R.string.ok, null);
        acwrVarF.create().show();
    }

    public final PointF s() {
        float fD;
        View view = (View) this.b;
        int width = view.getWidth();
        int height = view.getHeight();
        float fC = 0.0f;
        if (width > height) {
            fC = ujt.c(new Size(width, height), Math.round((-view.getTranslationX()) + (((View) this.a).getWidth() / 2.0f)));
            fD = 0.0f;
        } else {
            fD = ujt.d(new Size(width, height), Math.round((-view.getTranslationY()) + (((View) this.a).getHeight() / 2.0f)));
        }
        return new PointF(fC, fD);
    }

    public xpl(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public xpl(Object obj, Object obj2, char[] cArr) {
        this.b = obj;
        this.a = obj2;
    }

    public xpl(Object obj, Object obj2, short[] sArr) {
        this.b = obj;
        this.a = obj2;
    }

    public xpl() {
        this.a = new awlo();
        this.b = new awlo();
    }

    public xpl(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public xpl(vyo vyoVar, byte[] bArr) {
        amoo amooVar;
        amve amveVar;
        vyoVar.getClass();
        alik alikVarB = vyoVar.b();
        if (alikVarB == null || (amooVar = alikVarB.e) == null) {
            amooVar = amoo.a;
        }
        this.b = amooVar;
        if (alikVarB == null || (amveVar = alikVarB.f) == null) {
            amveVar = amve.a;
        }
        this.a = amveVar;
    }

    public xpl(awmd awmdVar, awmd awmdVar2) {
        awmdVar.getClass();
        this.b = awmdVar;
        this.a = awmdVar2;
    }

    public xpl(ek ekVar) {
        this.a = ekVar;
        this.b = new HashMap();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [agfr, java.lang.Object] */
    public xpl(rnj rnjVar, aigj aigjVar) {
        zj zjVar = new zj();
        this.a = zjVar;
        Status statusM = zjVar.m("youtube_mobile_master_cert_2026_public_key", ((aigj) rnjVar.a.io()).G(), aigjVar.G());
        statusM.e();
        this.b = statusM;
    }

    public xpl(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, byte[] bArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
    }

    public xpl(awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        awmdVar3.getClass();
        this.a = awmdVar3;
    }

    public xpl(bec becVar, awut awutVar) {
        becVar.getClass();
        awutVar.getClass();
        this.a = becVar;
        this.b = awutVar;
    }

    public xpl(final vyo vyoVar) {
        this.b = aguu.al(new agfr() { // from class: xoe
            public final /* synthetic */ String b = "m";

            @Override // defpackage.agfr
            public final Object io() {
                amzd amzdVar = vyoVar.b().m;
                if (amzdVar == null) {
                    amzdVar = amzd.a;
                }
                amyw amywVar = amzdVar.f;
                if (amywVar == null) {
                    amywVar = amyw.a;
                }
                if (amywVar.b) {
                    return amywVar.c;
                }
                String str = this.b;
                amyy amyyVar = amyy.a;
                aihf aihfVarCreateBuilder = amyyVar.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                amyy amyyVar2 = (amyy) aihfVarCreateBuilder.instance;
                amyyVar2.c = 2;
                amyyVar2.b |= 1;
                aihfVarCreateBuilder.bC(xpl.b("^(?i)microsoft.*", "^(?i)xbox.*"));
                amyy amyyVar3 = (amyy) aihfVarCreateBuilder.build();
                if (!yno.cZ()) {
                    return agke.q(amyyVar3);
                }
                aihf aihfVarCreateBuilder2 = amyyVar.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                amyy amyyVar4 = (amyy) aihfVarCreateBuilder2.instance;
                amyyVar4.c = 1;
                amyyVar4.b |= 1;
                aihfVarCreateBuilder2.bC(xpl.b("^lge$", "(^476700$|^\\d\\d(lm|ls|pa|pm).*|^global$|^mediabh.*|^mediabp530.*|^tm.*)"));
                aihfVarCreateBuilder2.bC(xpl.b("^samsung$", "^(bd|ht)$"));
                aihfVarCreateBuilder2.bC(xpl.b("^vizio$", "^e.*_a0$"));
                aihfVarCreateBuilder2.bC(xpl.b("^sharp$", "^(le650u|le657e|le65xx|le747e|le757e|le757u|le857e)$"));
                aihfVarCreateBuilder2.bC(xpl.b("^funai$", "^philips$"));
                aihfVarCreateBuilder2.bC(xpl.b("^(tivo|tivo_comhem)$", "^series4$"));
                aihf aihfVarCreateBuilder3 = amyyVar.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                amyy amyyVar5 = (amyy) aihfVarCreateBuilder3.instance;
                amyyVar5.c = 3;
                amyyVar5.b |= 1;
                if ("m".equals(str)) {
                    aihfVarCreateBuilder2.bC(xpl.b("\\s*", "^(TiVo_DCX960)$"));
                    aihfVarCreateBuilder2.bC(xpl.b("\\s*", "^(Totalplay_DIW350 HD TP)$"));
                    aihfVarCreateBuilder2.bC(xpl.b("\\s*", "^(NEOBOX)$"));
                }
                if ("k".equals(str)) {
                    aihfVarCreateBuilder2.bC(xpl.b("^Amazon$", "^.*$"));
                    aihfVarCreateBuilder2.bC(xpl.b("^Element$", "^(EL4KAMZ4317|EL4KAMZ5017|EL4KAMZ5517|EL4KAMZ6517|EL4KAMZ4317T|EL4KAMZ5017T|EL4KAMZ5517T|EL4KAMZ6517T)$"));
                    aihfVarCreateBuilder2.bC(xpl.b("^Westinghouse$", "^(WA43UFA1001|WA50UFA1001|WA55UFA1001|WA65UFA1001|WA43UFT1001|WA50UFT1001|WA55UFT1001|WA65UFT1001)$"));
                    aihfVarCreateBuilder2.bC(xpl.b("^Toshiba$", "^(49LF421U19|43LF421U19|32LF221U19|49LF421C19|43LF421C19|32LF221C19|43LF621U19|50LF621U19|55LF621U19|43LF621C19|50LF621C19|55LF621C19|43LF711U20|50LF711U20|55LF711U20|43LF711C20|50LF711C20|55LF711C20)$"));
                    aihfVarCreateBuilder2.bC(xpl.b("^Insignia$", "^(NS-43DF710NA19|NS-50DF710NA19|NS-55DF710NA19|NS-43DF710CA19|NS-50DF710CA19|NS-55DF710CA19|NS-24DF310NA19|NS-32DF310NA19|NS-39DF510NA19|NS-24DF310CA19|NS-32DF310CA19|NS-39DF510CA19)$"));
                    aihfVarCreateBuilder2.bC(xpl.b("^Grundig$", "^(43 GUW 7060|43 GUB 7060|43 GUT 7060|43 GUB 7062|43 GUB 7065|43 GUB 7066|43 GUT 7099|43 GUB 7067|43 GUT 7077|43 VLX 7020|43 VLX 7010|49 GUW 7060|49 GUT 7060|49 GUB 7060|49 GUB 7062|49 GUB 7065|49 GUB 7066|49 GUT 7099|49 GUB 7067|49 GUT 7077|49 VLX 7020|49 VLX 7010|55 GUW 7060|55 GUT 7060|55 GUB 7060|55 GUB 7062|55 GUB 7065|55 GUB 7066|55 GUT 7099|55 GUB 7067|55 GUT 7077|55 VLX 7020|55 VLX 7010|65 GUB 7066|65 GUB 7060|65 GUW 7060|65 GUT 7060|65 GUB 7062|65 GUB 7065|65 GUT 7077|65 VLX 7020|65 VLX 7010|55 GOB 9099 OLED|65 GOB 9099 OLED|55 GOB 9089 OLED|65 GOB 9089 OLED|32 GFB 6062|32 GFB 6065|32 GFB 6066|32 GFB 6067|32 GFB 6060|32 GFW 6060|32 VLE 6020|32 GFB 6064|32 VLE 6010|40 GFB 6065|40 GFB 6062|40 GFB 6066|40 GFB 6067|40 GFB 6060|40 GFW 6060|40 VLE 6020|40 GFB 6064|40 VLE 6010|43 GFB 6060|43 GFB 6065|43 GFB 6062|43 GFB 6066|43 GFB 6067|43 GFW 6060|43 VLE 6020|43 GFB 6064|43 VLE 6010|43UHDEGA|49UHDEGA|55UHDEGA|55UHDNGA|65UHDNGA|55UHDOGA|65UHDOGA|32FHDCGA|40FHDCGA|43FHDCGA)$"));
                    aihfVarCreateBuilder2.bC(xpl.b("^(Onida)$", "^(32HIF|43FIF)$"));
                    aihfVarCreateBuilder2.bC(xpl.b("^(Anker)$", "^AK-D3000111$"));
                    aihfVarCreateBuilder2.bC(xpl.b("^(JVC)$", "^(LT-40CF890|LT-49CF890|LT-55CF890)$"));
                    aihfVarCreateBuilder2.bC(xpl.b("\\s*", "^(TiVo_DCX960)$"));
                    aihfVarCreateBuilder2.bC(xpl.b("\\s*", "^(Totalplay_DIW350 HD TP)$"));
                    aihfVarCreateBuilder2.bC(xpl.b("\\s*", "^(NEOBOX)$"));
                }
                if ("up".equals(str)) {
                    aihfVarCreateBuilder2.bC(xpl.b("^(?i)samsung.*", "(?i)(^(?!(UN32M4))(\\bU\\w{1}(\\d{2})[KM].*\\b))"));
                    aihfVarCreateBuilder2.bC(xpl.b("^(?i)sony.*", "(?i)(blu-ray disc player|Sony_KD-.*)"));
                    aihfVarCreateBuilder2.bC(xpl.b("^(?i)echostar.*", "(?i)(\\bXiP\\d{3}\\b)"));
                    aihfVarCreateBuilder3.bC(xpl.b("^(?i)samsung.*", "(?i)(^(?!(UN32M4))(\\bQN.*M\\b|\\bU\\w{1}(\\d{2})[EKM].*\\b))"));
                    aihfVarCreateBuilder3.bC(xpl.b("^(?i)vizio.*", "(?i)([DE].*-\\w{2}|\\b.*_A0\\b)"));
                    aihfVarCreateBuilder3.bC(xpl.b("^(?i)google.*", "(?i)(\\beureka dongle\\b)"));
                    aihfVarCreateBuilder3.bC(xpl.b("^(?i)compal.*", ".*"));
                    aihfVarCreateBuilder3.bC(xpl.b("^(?i)makena.*", ".*"));
                    aihfVarCreateBuilder3.bC(xpl.b("^(?i)mtc.*", ".*"));
                    aihfVarCreateBuilder3.bC(xpl.b("^(?i)sony.*", "(?i)(ps3|bravia.*|internet tv)"));
                    aihfVarCreateBuilder3.bC(xpl.b("^(?i)lge.*", "(?i)(LG Google TV.*)"));
                }
                return agke.s((amyy) aihfVarCreateBuilder2.build(), amyyVar3, (amyy) aihfVarCreateBuilder3.build());
            }
        });
        this.a = new elq((byte[]) null, (byte[]) null);
    }

    public xpl(byte[] bArr, AtomicBoolean atomicBoolean) {
        bArr.getClass();
        atomicBoolean.getClass();
        this.a = bArr;
        this.b = atomicBoolean;
    }
}
