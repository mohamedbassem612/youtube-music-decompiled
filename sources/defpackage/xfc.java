package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xfc extends zsz {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/logging/event/EventLoggingFixedBatchRetryDelayedEventDispatcher");
    public final xdz b;
    public final xev c;
    public final xic d;
    public final ztf e;
    public final tag f;
    public final zsa g;
    public final zrs h;
    private final wrg l;
    private final zwb m;
    private final boolean n;
    private final double o;
    private final Executor p;
    private final ci q;

    public xfc(xdz xdzVar, xev xevVar, xic xicVar, wrg wrgVar, zwb zwbVar, ci ciVar, zrs zrsVar, tag tagVar, ztf ztfVar, Executor executor) {
        super(4);
        this.g = new xfb();
        this.b = xdzVar;
        this.l = wrgVar;
        this.c = xevVar;
        this.d = xicVar;
        this.m = zwbVar;
        this.q = ciVar;
        this.h = zrsVar;
        this.e = ztfVar;
        this.f = tagVar;
        this.n = zrsVar.k();
        this.o = zrsVar.k() ? zrsVar.a() : -1.0d;
        this.p = executor;
    }

    @Override // defpackage.zsz
    public final zsa a() {
        return this.g;
    }

    public final void b(String str, Exception exc) {
        agrf agrfVar = a;
        if (exc != null) {
            ((agrc) ((agrc) ((agrc) agrfVar.b()).j(exc)).k("com/google/android/libraries/youtube/logging/event/EventLoggingFixedBatchRetryDelayedEventDispatcher", "logErrorMessage", (char) 128, "EventLoggingFixedBatchRetryDelayedEventDispatcher.java")).w("%s", str);
            if (this.n) {
                zvp.f(zvn.a, zvm.m, "GEL_DELAYED_EVENT_DEBUG ".concat(str), exc, this.o);
                return;
            }
            return;
        }
        ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/logging/event/EventLoggingFixedBatchRetryDelayedEventDispatcher", "logErrorMessage", 139, "EventLoggingFixedBatchRetryDelayedEventDispatcher.java")).w("%s", str);
        if (this.n) {
            zvp.h(zvn.a, zvm.m, "GEL_DELAYED_EVENT_MONITORING_ERROR ".concat(str), this.o);
        }
    }

    @Override // defpackage.zsz
    public final String c() {
        return "event_logging_fixed_batch_retry";
    }

    @Override // defpackage.zsz
    public final void d(String str, zsr zsrVar, List list) {
        zwa zwaVarF = this.m.f(str);
        byte[] bArr = null;
        if (zwaVarF == null) {
            zwaVarF = zvz.a;
            b("Cannot resolve Identity from identityId in EventLoggingRequestRetryDelayedEventDispatcher. Dispatching as Identities.PSEUDONYMOUS.", null);
        }
        zvh zvhVar = ((zso) zsrVar).a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aihf aihfVar = (aihf) it.next();
            aihf aihfVarCreateBuilder = alow.a.createBuilder();
            try {
                aihfVarCreateBuilder.m54mergeFrom(((jrc) aihfVar.instance).e, ExtensionRegistryLite.getGeneratedRegistry());
                wrg wrgVar = this.l;
                wrf wrfVarA = wrgVar.a(zwaVarF, zvi.a(zvhVar, this.m, this.q), zvhVar.b);
                alow alowVar = (alow) aihfVarCreateBuilder.build();
                if (alowVar.f.size() != 0) {
                    wrfVarA.e = alowVar.f;
                }
                if ((alowVar.b & 4) != 0) {
                    alpa alpaVar = alowVar.e;
                    if (alpaVar == null) {
                        alpaVar = alpa.a;
                    }
                    wrfVarA.a = alpaVar.c;
                    alpa alpaVar2 = alowVar.e;
                    if (alpaVar2 == null) {
                        alpaVar2 = alpa.a;
                    }
                    wrfVarA.b = alpaVar2.d;
                }
                int i = 0;
                wrfVarA.l = false;
                if (!wrfVarA.e()) {
                    taf.i(wrgVar.b(wrfVarA), this.p, new xfa(this, aihfVar, i), new xwl(this, zwaVarF, 1, bArr), null);
                }
            } catch (aiik e) {
                b("EventLoggingRequestRetryDelayedEventDispatcher.dispatchEvents() could not deserialize EventLoggingRequest", e);
            }
        }
    }

    @Override // defpackage.zsz
    public final int jc() {
        return 1;
    }
}
