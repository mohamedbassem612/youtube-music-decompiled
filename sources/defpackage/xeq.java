package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class xeq extends xeu {
    private final xev a;
    private final zwb c;
    private final mbc d;
    private final tun g;
    private final tag h;
    private final Optional i;
    private final boolean j;
    private final xif k;
    private final boolean l;
    private final ci m;

    public xeq(xev xevVar, ztf ztfVar, xet xetVar, zwb zwbVar, ci ciVar, mbc mbcVar, tun tunVar, tag tagVar, Optional optional, vxz vxzVar, dov dovVar) {
        super(ztfVar, xetVar);
        this.a = xevVar;
        this.c = zwbVar;
        this.m = ciVar;
        this.d = mbcVar;
        this.g = tunVar;
        this.h = tagVar;
        this.i = optional;
        this.j = vxzVar.l(25, 45380409L, false);
        this.k = dovVar.Q("GEL_DELAYED_EVENT_DEBUG");
        this.l = ztfVar.p();
    }

    public static final alos m(Function function, alou alouVar) {
        alos alosVar = alouVar != null ? (alos) alouVar.toBuilder() : (alos) alou.a.createBuilder();
        return function != null ? (alos) function.apply(alosVar) : alosVar;
    }

    public static aihf n(alos alosVar, long j, long j2, String str, String str2, boolean z) {
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        alou alouVar2 = alou.a;
        alouVar.b |= 1;
        alouVar.e = j;
        alov alovVar = ((alou) alosVar.instance).f;
        if (alovVar == null) {
            alovVar = alov.a;
        }
        aihf builder = alovVar.toBuilder();
        builder.copyOnWrite();
        alov alovVar2 = (alov) builder.instance;
        alovVar2.b |= 1;
        alovVar2.c = j2;
        alosVar.copyOnWrite();
        alou alouVar3 = (alou) alosVar.instance;
        alov alovVar3 = (alov) builder.build();
        alovVar3.getClass();
        alouVar3.f = alovVar3;
        alouVar3.b |= 2;
        aihf aihfVarCreateBuilder = jrc.a.createBuilder();
        aigj byteString = ((alou) alosVar.build()).toByteString();
        aihfVarCreateBuilder.copyOnWrite();
        jrc jrcVar = (jrc) aihfVarCreateBuilder.instance;
        jrcVar.b |= 4;
        jrcVar.e = byteString;
        aihfVarCreateBuilder.copyOnWrite();
        jrc jrcVar2 = (jrc) aihfVarCreateBuilder.instance;
        jrcVar2.b |= 2;
        jrcVar2.d = "event_logging";
        aihfVarCreateBuilder.copyOnWrite();
        jrc jrcVar3 = (jrc) aihfVarCreateBuilder.instance;
        jrcVar3.b |= 16;
        jrcVar3.g = str;
        if (!TextUtils.isEmpty(str2)) {
            aihfVarCreateBuilder.copyOnWrite();
            jrc jrcVar4 = (jrc) aihfVarCreateBuilder.instance;
            str2.getClass();
            jrcVar4.b |= SemanticState.Focused;
            jrcVar4.j = str2;
        }
        aihfVarCreateBuilder.copyOnWrite();
        jrc jrcVar5 = (jrc) aihfVarCreateBuilder.instance;
        jrcVar5.b |= SemanticState.Hidden;
        jrcVar5.k = z;
        return aihfVarCreateBuilder;
    }

    private final void p(String str) {
        this.k.a(getClass().getCanonicalName() + " could not generate ClientEvent: " + str);
    }

    private final boolean q(alou alouVar, Function function, boolean z, long j, zwa zwaVar, zvh zvhVar, akku akkuVar, boolean z2) {
        String strAD;
        boolean zM;
        if (!this.a.a.c) {
            return false;
        }
        if (function == null) {
            if (alouVar == null) {
                p("Unspecified ClientEvent");
                return false;
            }
        } else if (alouVar != null) {
            p("Both clientEventPayloadSetter and clientEvent are set");
            return false;
        }
        long epochMilli = this.d.f().toEpochMilli();
        long j2 = j < 0 ? epochMilli : j;
        tun tunVar = this.g;
        long jB = tunVar.c.b();
        long j3 = tunVar.a;
        long j4 = j3 != -1 ? jB - j3 : -1L;
        zwa zwaVarE = zwaVar == null ? this.c.e() : zwaVar;
        String strK = zwaVarE.k();
        if (zvhVar != null) {
            String str = zvhVar.a;
            zM = zvhVar.b;
            strAD = str;
        } else {
            strAD = this.m.aD(zwaVarE);
            zM = zwaVarE.m();
        }
        if (z) {
            alos alosVarM = m(function, alouVar);
            if (!l(epochMilli, alot.a(((alou) alosVarM.instance).c))) {
                return false;
            }
            aihf aihfVarN = n(alosVarM, j2, j4, strK, strAD, zM);
            ztf ztfVar = this.e;
            if (this.l) {
                akku akkuVarA = akku.a(((jrc) aihfVarN.instance).l);
                if (akkuVarA == null) {
                    akkuVarA = akku.DELAYED_EVENT_TIER_UNSPECIFIED;
                }
                ztfVar.u(akkuVarA, aihfVarN, true, this.f);
            } else {
                ztfVar.v(aihfVarN);
            }
            this.i.isPresent();
        } else {
            long j5 = j2;
            if (z2 || this.j) {
                this.h.b(tai.b, afwl.i(new xep(this, function, alouVar, epochMilli, j5, j4, strK, strAD, zM, akkuVar)));
                return true;
            }
            alos alosVarM2 = m(function, alouVar);
            if (!l(epochMilli, alot.a(((alou) alosVarM2.instance).c))) {
                return false;
            }
            this.h.b(tai.b, new tcv(this, akkuVar, alot.a(((alou) alosVarM2.instance).c), n(alosVarM2, j5, j4, strK, strAD, zM), 2));
        }
        return true;
    }

    private final boolean r(alou alouVar, boolean z, long j, zwa zwaVar, zvh zvhVar, akku akkuVar) {
        if (alouVar != null) {
            return q(alouVar, null, z, j, zwaVar, zvhVar, akkuVar, false);
        }
        p("Unspecified ClientEvent");
        return false;
    }

    @Override // defpackage.xeu
    public final xff a(Object obj, alot alotVar) {
        throw new agfz("Not implemented");
    }

    @Override // defpackage.xeu
    public final boolean b(alou alouVar) {
        return r(alouVar, false, -1L, null, null, null);
    }

    @Override // defpackage.xeu
    public final boolean c(alou alouVar, long j) {
        return r(alouVar, false, j, null, null, null);
    }

    @Override // defpackage.xeu
    public final void d(alou alouVar, xel xelVar) {
        r(alouVar, false, xelVar.a, (zwa) xelVar.b.orElse(null), (zvh) xelVar.c.orElse(null), null);
    }

    @Override // defpackage.xeu
    public final void e(alou alouVar) {
        r(alouVar, true, -1L, null, null, null);
    }

    @Override // defpackage.xeu
    public final void f(Function function) {
        q(null, function, false, -1L, null, null, null, true);
    }

    @Override // defpackage.xeu
    public final void g(Function function, xel xelVar) {
        q(null, function, false, xelVar.a, (zwa) xelVar.b.orElse(null), (zvh) xelVar.c.orElse(null), null, true);
    }

    @Override // defpackage.xeu
    public final void h(alou alouVar, akku akkuVar) {
        r(alouVar, false, -1L, null, null, akkuVar);
    }

    @Override // defpackage.xeu
    public final void i(alou alouVar, zwa zwaVar) {
        r(alouVar, false, -1L, zwaVar, null, null);
    }

    @Override // defpackage.xeu
    @Deprecated
    public final void j(alou alouVar, zwa zwaVar, long j, zvh zvhVar) {
        r(alouVar, true, j, zwaVar, zvhVar, null);
    }

    public final boolean l(long j, alot alotVar) {
        if (alotVar != alot.PAYLOAD_NOT_SET) {
            return this.a.b(alotVar, j);
        }
        p("ClientEvent does not have one and only one payload set.");
        return false;
    }

    public final void o(akku akkuVar, alot alotVar, aihf aihfVar) {
        ztf ztfVar = this.e;
        xev xevVar = this.a;
        if (xevVar.f) {
            if (xevVar.a.i) {
                akkuVar = akku.DELAYED_EVENT_TIER_IMMEDIATE;
            } else if (akkuVar == null) {
                Map map = xevVar.e;
                Integer num = (Integer) map.get(alotVar);
                akkuVar = (!map.containsKey(alotVar) || num == null) ? akku.DELAYED_EVENT_TIER_DEFAULT : akku.a(num.intValue());
            }
            if (this.l) {
                ztfVar.u(akkuVar, aihfVar, false, this.f);
            } else {
                ztfVar.t(akkuVar, aihfVar);
            }
        } else if (this.l) {
            ztfVar.u(akku.DELAYED_EVENT_TIER_DEFAULT, aihfVar, false, this.f);
        } else {
            ztfVar.s(aihfVar);
        }
        this.i.isPresent();
    }
}
