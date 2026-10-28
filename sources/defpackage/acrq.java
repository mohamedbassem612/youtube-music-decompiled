package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acrq implements tdz {
    public final acuw a;
    public final mbc b;
    public final tqj c;
    public final actm d;
    public final AtomicBoolean e = new AtomicBoolean(true);
    public final Object f = new Object();
    public final acsj g;
    public volatile acqf h;
    private final awmd i;
    private final aeid j;
    private final aeid k;
    private final hno l;

    public acrq(acuw acuwVar, mbc mbcVar, hno hnoVar, awmd awmdVar, tqj tqjVar, actm actmVar, acsj acsjVar, aeid aeidVar, aeid aeidVar2, awmd awmdVar2) {
        this.a = acuwVar;
        this.b = mbcVar;
        this.l = hnoVar;
        int i = tqr.a;
        this.i = new tbp(awmdVar, tqjVar.k(1073830924));
        this.c = tqjVar;
        this.d = actmVar;
        this.g = acsjVar;
        this.k = aeidVar;
        this.j = aeidVar2;
        if (tqjVar == null || !tqjVar.l(1074420144, 4)) {
            return;
        }
        ((tes) awmdVar2.io()).b(this, tew.e);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:49:0x0111  */
    /* JADX WARN: Type inference failed for: r13v13, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [awqg, java.lang.Object] */
    public final acux b(String str, String str2, Optional optional, apfu apfuVar) {
        boolean zA;
        Optional optionalC;
        adha adhaVar;
        Optional optionalOfNullable;
        abyy abyyVar;
        String.valueOf(optional);
        acuw acuwVar = this.a;
        agfr agfrVar = acuwVar.h;
        if (((Boolean) agfrVar.io()).booleanValue()) {
            zA = false;
        } else {
            vxu vxuVar = acuwVar.i;
            if (vxuVar.c() != null) {
                anhb anhbVar = vxuVar.c().j;
                if (anhbVar == null) {
                    anhbVar = anhb.a;
                }
                ajdh ajdhVar = anhbVar.q;
                if (ajdhVar == null) {
                    ajdhVar = ajdh.a;
                }
                zA = ajdhVar.c;
            } else {
                zA = false;
            }
        }
        if (((Boolean) agfrVar.io()).booleanValue()) {
            zA = vys.a(acuwVar.i);
        }
        int i = 1;
        acux acuxVar = new acux(acuwVar.b, acuwVar.c.e(), zA, (((Boolean) agfrVar.io()).booleanValue() || acuwVar.j.l(148, 45852159L, false)) ? false : true);
        acuxVar.e = apfuVar;
        if (!ahno.aa(str)) {
            acuxVar.b = str;
        }
        if (!ahno.aa(str2)) {
            acuxVar.a = str2;
        }
        acrj acrjVar = new acrj(acuxVar, 2);
        if (true == optional.isPresent()) {
            ((wkf) acrjVar.a).n((aigj) optional.get());
        }
        hno hnoVar = this.l;
        if (!hnoVar.bf()) {
        }
        acuxVar.c = hnoVar.at() ? Optional.of(Boolean.FALSE) : Optional.empty();
        acsj acsjVar = this.g;
        apfu apfuVar2 = acuxVar.e;
        if (apfuVar2 != null) {
            Object obj = acsjVar.b;
            if (hno.bi(apfuVar2)) {
                optionalC = acsjVar.c(acsj.g(acuxVar.u));
                adhaVar = new adha(new achf(15), i);
                if (true != optionalC.isPresent()) {
                    optionalOfNullable = optionalC;
                } else {
                    optionalOfNullable = Optional.ofNullable(adhaVar.a.invoke(optionalC.get()));
                }
                Objects.toString(optionalOfNullable.orElse(0));
                abyyVar = new abyy(new acsc(acuxVar, i), 19);
                if (true == optionalC.isPresent()) {
                    abyyVar.a.invoke(optionalC.get());
                }
            }
        } else {
            optionalC = acsjVar.c(acsj.g(acuxVar.u));
            adhaVar = new adha(new achf(15), i);
            if (true != optionalC.isPresent()) {
                optionalOfNullable = optionalC;
            } else {
                optionalOfNullable = Optional.ofNullable(adhaVar.a.invoke(optionalC.get()));
            }
            Objects.toString(optionalOfNullable.orElse(0));
            abyyVar = new abyy(new acsc(acuxVar, i), 19);
            if (true == optionalC.isPresent()) {
                abyyVar.a.invoke(optionalC.get());
            }
        }
        if (hnoVar.l() && ((vxz) hnoVar.m).l(SemanticState.Focused, 45859446L, false)) {
            aihf aihfVarCreateBuilder = aooe.a.createBuilder();
            int i2 = true != this.k.a ? 4 : 3;
            aihfVarCreateBuilder.copyOnWrite();
            aooe aooeVar = (aooe) aihfVarCreateBuilder.instance;
            aooeVar.o = i2 - 1;
            aooeVar.b |= 8388608;
            if (this.j.a) {
                int i3 = abnr.PICTURE_IN_PICTURE.i;
                aihfVarCreateBuilder.copyOnWrite();
                aooe aooeVar2 = (aooe) aihfVarCreateBuilder.instance;
                aooeVar2.b |= 32;
                aooeVar2.g = i3;
            }
            aihf aihfVarCreateBuilder2 = aooi.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aooi aooiVar = (aooi) aihfVarCreateBuilder2.instance;
            aooe aooeVar3 = (aooe) aihfVarCreateBuilder.build();
            aooeVar3.getClass();
            aooiVar.c = aooeVar3;
            aooiVar.b |= 1;
            acuxVar.E = (aooi) aihfVarCreateBuilder2.build();
        }
        return acuxVar;
    }

    public final ListenableFuture d(acux acuxVar, Executor executor) {
        wlt wltVarG;
        this.d.f("r_sqs");
        acuw acuwVar = this.a;
        int i = 13;
        if (((Boolean) acuwVar.h.io()).booleanValue() || acuwVar.j.l(148, 45852159L, false)) {
            ahfi ahfiVarB = wlt.b(0L);
            ahfiVarB.a = new hyl(acuwVar.f, 5);
            ahfiVarB.i(new hsb(acuwVar, i));
            wltVarG = ahfiVarB.g();
        } else {
            wltVarG = acuwVar.d.d();
        }
        ListenableFuture listenableFutureB = acuwVar.e.b(acuxVar, executor, wltVarG);
        taf.i(listenableFutureB, MoreExecutors.directExecutor(), new wuy(this, 18), new xwl(this, acuxVar, i, null), null);
        return listenableFutureB;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, mbc] */
    public final ListenableFuture e(String str) {
        synchronized (this.f) {
            acqf acqfVar = this.h;
            if (acqfVar != null) {
                if (j$.util.Objects.equals(acqfVar.a, str) && acqfVar.d.f().isBefore(((Instant) acqfVar.b).plusSeconds(60L))) {
                    return acqfVar.c;
                }
                f();
            }
            return null;
        }
    }

    public final void f() {
        synchronized (this.f) {
            this.h = null;
        }
    }

    @Override // defpackage.tdz
    public final /* synthetic */ Object jC() {
        return nsi.l(this);
    }

    @Override // defpackage.tdz
    public final void jz() {
        f();
    }
}
