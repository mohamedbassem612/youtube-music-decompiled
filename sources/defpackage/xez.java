package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xez extends xet {
    public static final agrf b = agrf.h("com/google/android/libraries/youtube/logging/event/EventLoggingDelayedEventDispatcher");
    private final awmd c;
    private final awmd d;
    private final awmd e;
    private final awmd f;
    private final zwb g;
    private final awmd h;
    private final awmd l;
    private final awmd m;
    private final awmd n;
    private final awmd o;
    private final Executor p;
    private final awmd q;

    public xez(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, zwb zwbVar, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, Executor executor) {
        this.c = awmdVar;
        this.d = awmdVar2;
        this.e = awmdVar3;
        this.f = awmdVar4;
        this.g = zwbVar;
        this.h = awmdVar5;
        this.l = awmdVar6;
        this.m = awmdVar8;
        this.n = awmdVar7;
        this.o = awmdVar9;
        this.p = executor;
        this.q = awmdVar10;
    }

    @Override // defpackage.zsz
    public final zsa a() {
        akkl akklVar;
        zrs zrsVar = (zrs) this.l.io();
        if (zrsVar.b == null) {
            akkk akkkVarC = zrsVar.c();
            if ((akkkVarC.b & SemanticState.Focused) != 0) {
                akklVar = akkkVarC.d;
                if (akklVar == null) {
                    akklVar = akkl.a;
                }
            } else {
                akklVar = null;
            }
            zrsVar.b = new zrt(akklVar);
        }
        return zrsVar.b;
    }

    @Override // defpackage.xet
    public final long b(long j) {
        long j2 = ((tun) this.q.io()).a;
        if (j2 != -1) {
            return j - j2;
        }
        return -1L;
    }

    @Override // defpackage.zsz
    public final String c() {
        return "event_logging";
    }

    @Override // defpackage.zsz
    public final void d(final String str, zsr zsrVar, List list) {
        List<aihf> list2;
        xev xevVar;
        xev xevVar2 = (xev) this.e.io();
        final wrg wrgVar = (wrg) this.d.io();
        ci ciVar = (ci) this.h.io();
        final zrs zrsVar = (zrs) this.l.io();
        final tag tagVar = (tag) this.n.io();
        final ztf ztfVar = (ztf) this.m.io();
        xic xicVar = (xic) this.f.io();
        xdz xdzVar = (xdz) this.c.io();
        Set set = xevVar2.c;
        if (set == null || set.isEmpty()) {
            list2 = list;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aihf aihfVar = (aihf) it.next();
                try {
                    if (!xevVar2.b(alot.a(((alou) aihn.parseFrom(alou.a, ((jrc) aihfVar.instance).e, ExtensionRegistryLite.getGeneratedRegistry())).c), xevVar2.b.f().toEpochMilli())) {
                        arrayList.add(aihfVar);
                    }
                } catch (aiik unused) {
                    arrayList.add(aihfVar);
                }
            }
            list2 = list;
            list2.removeAll(arrayList);
        }
        zwb zwbVar = this.g;
        zwa zwaVarF = zwbVar.f(str);
        if (zwaVarF == null) {
            zwaVarF = zvz.a;
            g("Cannot resolve Identity from identityId. Dispatching as Identities.PSEUDONYMOUS.", null);
        }
        zwa zwaVar = zwaVarF;
        zso zsoVar = (zso) zsrVar;
        final zvh zvhVar = zsoVar.a;
        h();
        final wrf wrfVarA = wrgVar.a(zwaVar, zvi.a(zvhVar, zwbVar, ciVar), zvhVar.b);
        for (aihf aihfVar2 : list2) {
            alos alosVar = (alos) alou.a.createBuilder();
            try {
                xevVar = xevVar2;
                try {
                    alosVar.m54mergeFrom(((jrc) aihfVar2.instance).e, ExtensionRegistryLite.getGeneratedRegistry());
                    if (alosVar == null) {
                        g("clientEvent is null", null);
                    }
                    wrfVarA.F((alou) alosVar.build());
                } catch (aiik e) {
                    e = e;
                    g(String.valueOf(getClass().getCanonicalName()).concat(" could not deserialize ClientEvent"), e);
                }
            } catch (aiik e2) {
                e = e2;
                xevVar = xevVar2;
            }
            xevVar2 = xevVar;
        }
        final xev xevVar3 = xevVar2;
        h();
        if (wrfVarA.e()) {
            return;
        }
        axmq axmqVarE = xdzVar.e(zwaVar.k());
        if (axmqVarE != null) {
            wrfVarA.G((String) axmqVarE.b, axmqVarE.a);
        }
        wrfVarA.c = zsoVar.b;
        h();
        final List list3 = list2;
        taf.i(wrgVar.b(wrfVarA), this.p, new tab() { // from class: xew
            @Override // defpackage.twi
            /* JADX INFO: renamed from: b */
            public final void a(Throwable th) {
                ((agrc) ((agrc) ((agrc) xez.b.b()).j(th)).k("com/google/android/libraries/youtube/logging/event/EventLoggingDelayedEventDispatcher", "dispatchEvents", (char) 231, "EventLoggingDelayedEventDispatcher.java")).w("Volley request failed for type %s", alox.class.getCanonicalName());
                xez xezVar = this.a;
                wrf wrfVar = wrfVarA;
                if (th instanceof toe) {
                    tnm tnmVar = ((toe) th).b;
                    if (tnmVar != null) {
                        int i = tnmVar.d;
                        if (i == 415) {
                            wrgVar.c = false;
                            zvp.e(zvn.a, zvm.m, "415 received from compressed request", th);
                            return;
                        } else if (i == 400 && wrfVar.l) {
                            zvp.e(zvn.a, zvm.m, "400 received from compressed request", th);
                        }
                    } else if (zrsVar.a && (th.getCause() instanceof IllegalStateException)) {
                        xezVar.g("!Dispatch", (Exception) th.getCause());
                        return;
                    }
                }
                ztf ztfVar2 = ztfVar;
                zvh zvhVar2 = zvhVar;
                String str2 = str;
                xev xevVar4 = xevVar3;
                List list4 = list3;
                tag tagVar2 = tagVar;
                String.valueOf(th);
                xezVar.h();
                tagVar2.b(tai.b, new xey(xezVar, wrfVar, list4, xevVar4, str2, zvhVar2, ztfVar2, th));
            }
        }, new xex(tagVar, xevVar3, xicVar, xdzVar, zwaVar, 0), null);
    }

    public final void g(String str, Exception exc) {
        awmd awmdVar = this.l;
        boolean zK = ((zrs) awmdVar.io()).k();
        double dA = ((zrs) awmdVar.io()).a();
        agrf agrfVar = b;
        if (exc != null) {
            ((agrc) ((agrc) ((agrc) agrfVar.b()).j(exc)).k("com/google/android/libraries/youtube/logging/event/EventLoggingDelayedEventDispatcher", "logErrorMessage", '|', "EventLoggingDelayedEventDispatcher.java")).w("%s", str);
            if (zK) {
                zvp.f(zvn.a, zvm.m, "GEL_DELAYED_EVENT_DEBUG ".concat(str), exc, dA);
                return;
            }
            return;
        }
        ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/logging/event/EventLoggingDelayedEventDispatcher", "logErrorMessage", 135, "EventLoggingDelayedEventDispatcher.java")).w("%s", str);
        if (zK) {
            zvp.h(zvn.a, zvm.m, "GEL_DELAYED_EVENT_MONITORING_ERROR ".concat(str), dA);
        }
    }

    public final void h() {
        taf.g(zzg.d(), new ixb(this, 14));
    }

    @Override // defpackage.zsz
    public final int jc() {
        return 1;
    }
}
