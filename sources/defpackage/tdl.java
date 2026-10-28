package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tdl implements bnu, tpv, tpz {
    static final agkj a = agkj.l(tdo.a, boa.ON_CREATE, tdo.b, boa.ON_START, tdo.c, boa.ON_RESUME);
    public static final /* synthetic */ int b = 0;
    private final tre d;
    private final Map c = new HashMap();
    private final Set e = new HashSet();
    private agev f = agdf.a;

    public tdl(tre treVar) {
        this.d = treVar;
    }

    private final void b(boa boaVar) {
        boaVar.getClass();
        this.f = new agfa(boaVar);
        int iOrdinal = boaVar.ordinal();
        if (iOrdinal == 0) {
            d(tdo.a);
            return;
        }
        if (iOrdinal == 1) {
            d(tdo.b);
            return;
        }
        if (iOrdinal == 2) {
            d(tdo.c);
            return;
        }
        if (iOrdinal == 3) {
            e(tdo.c);
        } else if (iOrdinal == 4) {
            e(tdo.b);
        } else if (iOrdinal == 5) {
            e(tdo.a);
        }
    }

    private final void c(tdh tdhVar) {
        tdhVar.a();
        this.e.add(tdhVar);
    }

    private final void d(tdo tdoVar) {
        Iterator it = ((Set) j$.util.Map.EL.getOrDefault(this.c, tdoVar, agpr.a)).iterator();
        while (it.hasNext()) {
            c((tdh) it.next());
        }
    }

    private final void e(tdo tdoVar) {
        for (tdh tdhVar : (Set) j$.util.Map.EL.getOrDefault(this.c, tdoVar, agpr.a)) {
            Set set = this.e;
            if (set.contains(tdhVar)) {
                tdhVar.gY();
                set.remove(tdhVar);
            }
        }
    }

    @Override // defpackage.tpv
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        boa boaVar;
        tdp tdpVar = (tdp) obj;
        if (((Set) j$.util.Map.EL.computeIfAbsent(this.c, tdpVar.c(), new rmm(4))).add(tdpVar) && this.f.g()) {
            if (((boa) this.f.c()).compareTo(boa.ON_PAUSE) >= 0 || (boaVar = (boa) a.get(tdpVar.c())) == null || boaVar.compareTo((Enum) this.f.c()) > 0) {
                return;
            }
            c(tdpVar);
        }
    }

    @Override // defpackage.tpz
    public final /* bridge */ /* synthetic */ void iU(Object obj) {
        tdp tdpVar = (tdp) obj;
        Set set = (Set) this.c.get(tdpVar.c());
        if (set != null) {
            set.remove(tdpVar);
        }
        this.e.remove(tdpVar);
    }

    @Override // defpackage.bnu
    public final void onCreate(bog bogVar) {
        tre treVar = this.d;
        treVar.h.r(27);
        b(boa.ON_CREATE);
        treVar.h.i(27);
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        b(boa.ON_DESTROY);
        this.c.clear();
        this.e.clear();
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        b(boa.ON_PAUSE);
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        tre treVar = this.d;
        treVar.h.r(29);
        b(boa.ON_RESUME);
        treVar.h.i(29);
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        tre treVar = this.d;
        treVar.h.r(28);
        b(boa.ON_START);
        treVar.h.i(28);
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        b(boa.ON_STOP);
    }
}
