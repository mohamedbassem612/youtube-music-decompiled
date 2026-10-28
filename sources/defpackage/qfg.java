package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qfg {
    public final qfe a;
    public final awmd b;
    public final qji c;
    public final awmd d;
    public final aunn e;
    private final qcs f;
    private final Executor g;

    /* JADX WARN: Type inference failed for: r10v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [awmd, java.lang.Object] */
    public qfg(qfe qfeVar, awmd awmdVar, qcs qcsVar, rrq rrqVar, awmd awmdVar2, Executor executor, aunn aunnVar, awmd awmdVar3) {
        this.a = qfeVar;
        this.f = qcsVar;
        this.b = awmdVar;
        this.g = executor;
        this.d = new glj(awmdVar2, 7);
        Context context = (Context) rrqVar.f.io();
        context.getClass();
        Executor executor2 = (Executor) rrqVar.c.io();
        executor2.getClass();
        qjk qjkVar = (qjk) rrqVar.d.io();
        qjkVar.getClass();
        Boolean bool = (Boolean) rrqVar.b.io();
        bool.getClass();
        boolean zBooleanValue = bool.booleanValue();
        agev agevVar = (agev) ((aupo) rrqVar.a).b;
        agevVar.getClass();
        ahek ahekVar = (ahek) rrqVar.e.io();
        ahekVar.getClass();
        this.c = new qji(context, executor2, qjkVar, aunnVar, zBooleanValue, agevVar, awmdVar3, ahekVar);
        this.e = aunnVar;
    }

    public final ListenableFuture a(final qfd qfdVar) {
        return this.f.a ? ahng.l() : ahng.s(new ahcx() { // from class: qff
            /* JADX WARN: Type inference failed for: r0v9, types: [agfr, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v9, types: [agfr, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v29, types: [awmd, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v33, types: [awmd, java.lang.Object] */
            @Override // defpackage.ahcx
            public final ListenableFuture a() {
                axhi axhiVarA;
                String strC;
                qfd qfdVar2 = qfdVar;
                boolean z = qfdVar2.g;
                qfg qfgVar = this.a;
                if (z) {
                    aihf aihfVarCreateBuilder = axhi.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    axhi axhiVar = (axhi) aihfVarCreateBuilder.instance;
                    axhiVar.e = 2;
                    axhiVar.b |= 2;
                    axhiVarA = (axhi) aihfVarCreateBuilder.build();
                } else {
                    axhiVarA = qfgVar.c.a(qfdVar2.f);
                }
                qjj qjjVar = qjj.a;
                if (axhiVarA.c != 2 || ((Integer) axhiVarA.d).intValue() != -1) {
                    if ((axhiVarA.c == 4 ? (axhh) axhiVarA.d : axhh.a).c != -1) {
                        qfi qfiVar = (qfi) qfgVar.b.io();
                        axhz axhzVar = qfdVar2.c;
                        aihf builder = axhzVar.toBuilder();
                        aihf aihfVarCreateBuilder2 = axhl.a.createBuilder();
                        int i = qfiVar.l;
                        aihfVarCreateBuilder2.copyOnWrite();
                        axhl axhlVar = (axhl) aihfVarCreateBuilder2.instance;
                        axhlVar.e = i - 1;
                        axhlVar.b |= 4;
                        String str = qfiVar.b;
                        if (str != null) {
                            aihfVarCreateBuilder2.copyOnWrite();
                            axhl axhlVar2 = (axhl) aihfVarCreateBuilder2.instance;
                            axhlVar2.b |= 1;
                            axhlVar2.c = str;
                        }
                        aihfVarCreateBuilder2.copyOnWrite();
                        axhl axhlVar3 = (axhl) aihfVarCreateBuilder2.instance;
                        axhlVar3.b |= 8;
                        axhlVar3.f = -1L;
                        String str2 = qfiVar.d;
                        if (str2 != null) {
                            aihfVarCreateBuilder2.copyOnWrite();
                            axhl axhlVar4 = (axhl) aihfVarCreateBuilder2.instance;
                            axhlVar4.b |= 2;
                            axhlVar4.d = str2;
                        }
                        axgp axgpVar = axhzVar.f;
                        if (axgpVar == null) {
                            axgpVar = axgp.a;
                        }
                        axhg axhgVar = axgpVar.d;
                        if (axhgVar == null) {
                            axhgVar = axhg.a;
                        }
                        axhf axhfVar = axhgVar.c;
                        if (axhfVar == null) {
                            axhfVar = axhf.a;
                        }
                        if ((axhfVar.b & 8) == 0 || !((Boolean) qfiVar.h.io()).booleanValue()) {
                            strC = qfiVar.c;
                        } else {
                            axgp axgpVar2 = axhzVar.f;
                            if (axgpVar2 == null) {
                                axgpVar2 = axgp.a;
                            }
                            axhg axhgVar2 = axgpVar2.d;
                            if (axhgVar2 == null) {
                                axhgVar2 = axhg.a;
                            }
                            axhf axhfVar2 = axhgVar2.c;
                            if (axhfVar2 == null) {
                                axhfVar2 = axhf.a;
                            }
                            strC = qel.c(str, axhfVar2.f);
                        }
                        if (strC != null) {
                            aihfVarCreateBuilder2.copyOnWrite();
                            axhl axhlVar5 = (axhl) aihfVarCreateBuilder2.instance;
                            axhlVar5.b |= 16;
                            axhlVar5.g = strC;
                        }
                        xsc xscVar = qfiVar.m;
                        int i2 = axhzVar.b;
                        if ((i2 & 64) != 0 || (((i2 & 65536) != 0 && ((Boolean) xscVar.a.io()).booleanValue()) || ((Boolean) xscVar.c.io()).booleanValue())) {
                            agev agevVar = (agev) ((ijt) xscVar.b).a.io();
                            if (agevVar.g()) {
                                String str3 = (String) agevVar.c();
                                if (str3.equals("com.android.vending")) {
                                    aihfVarCreateBuilder2.copyOnWrite();
                                    axhl axhlVar6 = (axhl) aihfVarCreateBuilder2.instance;
                                    axhlVar6.b |= 64;
                                    axhlVar6.h = true;
                                } else {
                                    aihfVarCreateBuilder2.copyOnWrite();
                                    axhl axhlVar7 = (axhl) aihfVarCreateBuilder2.instance;
                                    axhlVar7.b |= SemanticState.Focused;
                                    axhlVar7.i = str3;
                                }
                            }
                        }
                        builder.copyOnWrite();
                        axhz axhzVar2 = (axhz) builder.instance;
                        axhl axhlVar8 = (axhl) aihfVarCreateBuilder2.build();
                        axhlVar8.getClass();
                        axhzVar2.q = axhlVar8;
                        axhzVar2.b |= 8388608;
                        if (mef.i(qfiVar.a)) {
                            aihf aihfVarCreateBuilder3 = axhr.a.createBuilder();
                            long freeSpace = qfiVar.e.a().getFreeSpace() / 1024;
                            aihfVarCreateBuilder3.copyOnWrite();
                            axhr axhrVar = (axhr) aihfVarCreateBuilder3.instance;
                            axhrVar.b |= 1;
                            axhrVar.c = freeSpace;
                            long jLongValue = ((Long) qfiVar.f.io()).longValue();
                            aihfVarCreateBuilder3.copyOnWrite();
                            axhr axhrVar2 = (axhr) aihfVarCreateBuilder3.instance;
                            axhrVar2.b |= 2;
                            axhrVar2.d = jLongValue;
                            builder.copyOnWrite();
                            axhz axhzVar3 = (axhz) builder.instance;
                            axhr axhrVar3 = (axhr) aihfVarCreateBuilder3.build();
                            axhrVar3.getClass();
                            axhzVar3.s = axhrVar3;
                            axhzVar3.b |= 33554432;
                        }
                        agfr agfrVar = qfiVar.g;
                        if (qfdVar2.i != null) {
                            agev agevVar2 = qfiVar.i;
                        }
                        agev agevVar3 = qfiVar.j;
                        RuntimeException runtimeException = null;
                        if (qfdVar2.h != null) {
                            throw null;
                        }
                        agev agevVar4 = qfiVar.k;
                        aihf builder2 = ((axhz) builder.build()).toBuilder();
                        builder2.copyOnWrite();
                        axhz axhzVar4 = (axhz) builder2.instance;
                        axhiVarA.getClass();
                        axhzVar4.p = axhiVarA;
                        axhzVar4.b |= 2097152;
                        String str4 = qfdVar2.a;
                        if (qfdVar2.b) {
                            if (str4 != null) {
                                builder2.copyOnWrite();
                                axhz axhzVar5 = (axhz) builder2.instance;
                                axhzVar5.b |= 4;
                                axhzVar5.e = str4;
                            } else {
                                builder2.copyOnWrite();
                                axhz axhzVar6 = (axhz) builder2.instance;
                                axhzVar6.b &= -5;
                                axhzVar6.e = axhz.a.e;
                            }
                        } else if (str4 != null) {
                            builder2.copyOnWrite();
                            axhz axhzVar7 = (axhz) builder2.instance;
                            axhzVar7.b |= 2;
                            axhzVar7.d = str4;
                        } else {
                            builder2.copyOnWrite();
                            axhz axhzVar8 = (axhz) builder2.instance;
                            axhzVar8.b &= -3;
                            axhzVar8.d = axhz.a.d;
                        }
                        qfgVar.d.io();
                        axgh axghVar = axgh.a;
                        aihh aihhVar = (aihh) axghVar.createBuilder();
                        axgh axghVar2 = qfdVar2.d;
                        ((qen) qfgVar.e.io()).c();
                        if (axghVar2 != null) {
                            aihhVar.mergeFrom((aihn) axghVar2);
                        }
                        axgh axghVar3 = (axgh) aihhVar.build();
                        if (true == axghVar3.equals(axghVar)) {
                            axghVar3 = null;
                        }
                        if (axghVar3 != null) {
                            builder2.copyOnWrite();
                            axhz axhzVar9 = (axhz) builder2.instance;
                            axhzVar9.t = axghVar3;
                            axhzVar9.b |= 67108864;
                        }
                        String str5 = qfdVar2.e;
                        if (str5 != null) {
                            aihf aihfVarCreateBuilder4 = axhj.a.createBuilder();
                            aihfVarCreateBuilder4.copyOnWrite();
                            axhj axhjVar = (axhj) aihfVarCreateBuilder4.instance;
                            axhjVar.b |= 1;
                            axhjVar.c = str5;
                            builder2.copyOnWrite();
                            axhz axhzVar10 = (axhz) builder2.instance;
                            axhj axhjVar2 = (axhj) aihfVarCreateBuilder4.build();
                            axhjVar2.getClass();
                            axhzVar10.u = axhjVar2;
                            axhzVar10.b |= 134217728;
                        }
                        qfe qfeVar = qfgVar.a;
                        axhz axhzVar11 = (axhz) builder2.build();
                        agke agkeVar = (agke) qfeVar.a.io();
                        agjz agjzVarF = agke.f(agkeVar.size());
                        int size = agkeVar.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            try {
                                agjzVarF.h(((qjo) agkeVar.get(i3)).a(axhzVar11));
                            } catch (RuntimeException e) {
                                ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e)).k("com/google/android/libraries/performance/primes/metrics/core/MetricDispatcher", "dispatch", '<', "MetricDispatcher.java")).t("One transmitter failed to send message");
                                if (runtimeException == null) {
                                    runtimeException = e;
                                } else {
                                    runtimeException.addSuppressed(e);
                                }
                            }
                        }
                        if (runtimeException != null) {
                            throw runtimeException;
                        }
                        ListenableFuture listenableFutureA = ahng.i(agjzVarF.g()).a(new fxv(8), MoreExecutors.directExecutor());
                        qfgVar.c.c.a();
                        return listenableFutureA;
                    }
                }
                return aher.a;
            }
        }, this.g);
    }

    public final boolean b(String str) {
        return !c(str).f();
    }

    public final qjj c(String str) {
        if (this.f.a) {
            return qjj.b;
        }
        qji qjiVar = this.c;
        if (qjiVar.c.b()) {
            return qjj.b;
        }
        return qjiVar.b ? qjiVar.a.d(str) : qjj.b;
    }
}
