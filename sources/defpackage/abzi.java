package defpackage;

import android.content.Context;
import com.google.android.libraries.blocks.Container;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abzi {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public abzi(Context context, vxe vxeVar, aapw aapwVar, ttm ttmVar, tbt tbtVar, omj omjVar, vxz vxzVar, xeu xeuVar, zwb zwbVar, wbz wbzVar, avmb avmbVar, Executor executor, vxz vxzVar2) {
        this.a = context;
        vxeVar.getClass();
        this.f = vxeVar;
        aapwVar.getClass();
        this.b = aapwVar;
        ttmVar.getClass();
        this.d = ttmVar;
        tbtVar.getClass();
        this.i = tbtVar;
        omjVar.getClass();
        this.c = omjVar;
        this.j = vxzVar;
        xeuVar.getClass();
        this.g = xeuVar;
        zwbVar.getClass();
        this.k = zwbVar;
        wbzVar.getClass();
        this.e = wbzVar;
        avmbVar.getClass();
        this.m = avmbVar;
        this.l = executor;
        vxzVar2.getClass();
        this.h = vxzVar2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0150  */
    /* JADX WARN: Code duplicated, block: B:31:0x0160  */
    /* JADX WARN: Code duplicated, block: B:33:0x017c  */
    /* JADX WARN: Code duplicated, block: B:35:0x019f  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:42:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:45:0x0230  */
    /* JADX WARN: Code duplicated, block: B:46:0x0233  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [awmd, java.lang.Object] */
    public final abzh a(String str, String str2, int i, wjf wjfVar) {
        long j;
        Optional optionalEmpty;
        int i2;
        int i3;
        boolean z;
        wja wjaVarG;
        int iIntValue;
        wja wjaVarG2;
        int iIntValue2;
        boolean z2;
        int i4;
        Optional optionalFindFirst;
        Optional optionalFindFirst2;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.j.io();
        scheduledExecutorService.getClass();
        tfq tfqVar = (tfq) this.a.io();
        tfqVar.getClass();
        xeu xeuVar = (xeu) this.b.io();
        xeuVar.getClass();
        tyw tywVar = (tyw) this.k.io();
        tywVar.getClass();
        mbc mbcVar = (mbc) this.c.io();
        mbcVar.getClass();
        aboi aboiVar = (aboi) this.d.io();
        aboiVar.getClass();
        abnc abncVar = (abnc) this.e.io();
        abncVar.getClass();
        arif arifVar = (arif) this.l.io();
        abmt abmtVar = (abmt) this.f.io();
        abmtVar.getClass();
        ((aawa) this.g.io()).getClass();
        Map map = (Map) ((aupo) this.h).b;
        map.getClass();
        abnp abnpVar = (abnp) ((aupo) this.i).b;
        abzj abzjVar = (abzj) this.m.io();
        abzjVar.getClass();
        str2.getClass();
        String strG = wjfVar.G();
        int i5 = typ.a;
        long millis = TimeUnit.SECONDS.toMillis(wjfVar.a());
        if (wjfVar.X()) {
            j = millis;
            optionalEmpty = Collection.EL.stream(wjfVar.g().r).filter(new aaep(14)).filter(new aaep(15)).findFirst();
            if (true == optionalEmpty.isPresent()) {
                optionalEmpty = Optional.ofNullable(((wgs) optionalEmpty.get()).v());
            }
        } else {
            j = millis;
            optionalEmpty = Optional.empty();
        }
        long j2 = j;
        appa appaVar = appa.SEEK_SOURCE_UNKNOWN;
        Optional optional = optionalEmpty;
        int iG = aawo.g(wjfVar.h().c, aboiVar.l(), wjfVar.Z(), abzh.m(i), abmtVar.ah());
        int i6 = tywVar.b;
        if (abzh.m(i)) {
            wiu wiuVarF = wjfVar.f();
            i2 = 0;
            if (abncVar.s == 2 || (wiuVarF != null && (wiuVarF.aO() || (wiuVarF.aQ() && abncVar.s == 1)))) {
                i3 = 1;
            }
            if (abzh.m(i) || !aboiVar.l()) {
                z = i2;
            } else {
                z = 1;
            }
            boolean Z = wjfVar.Z();
            boolean zV = wjfVar.V();
            wjaVarG = wjfVar.g();
            if (wjaVarG != null) {
                optionalFindFirst2 = Collection.EL.stream(wjaVarG.r).filter(new aaep(13)).findFirst();
                if (true == optionalFindFirst2.isPresent()) {
                    optionalFindFirst2 = Optional.ofNullable(Integer.valueOf(((wgs) optionalFindFirst2.get()).e()));
                }
                iIntValue = ((Integer) optionalFindFirst2.orElse(Integer.valueOf(i2))).intValue();
            } else {
                iIntValue = i2;
            }
            wjaVarG2 = wjfVar.g();
            if (wjaVarG2 != null) {
                optionalFindFirst = Collection.EL.stream(wjaVarG2.r).filter(new aaep(14)).filter(new aaep(15)).findFirst();
                if (true == optionalFindFirst.isPresent()) {
                    optionalFindFirst = Optional.ofNullable(Integer.valueOf(((wgs) optionalFindFirst.get()).e()));
                }
                iIntValue2 = ((Integer) optionalFindFirst.orElse(Integer.valueOf(i2))).intValue();
            } else {
                iIntValue2 = i2;
            }
            aboa aboaVar = abncVar.r;
            aaxo aaxoVarC = abncVar.c();
            wjn wjnVar = wjfVar.h().j;
            long jB = mbcVar.b();
            aihf aihfVarCreateBuilder = arja.a.createBuilder();
            arjb arjbVar = arjb.a;
            aihf aihfVarCreateBuilder2 = arjbVar.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            arjb arjbVar2 = (arjb) aihfVarCreateBuilder2.instance;
            arjbVar2.b |= 4;
            arjbVar2.f = -1.0f;
            if (wjfVar.k().f() == 2) {
                z2 = 1;
            } else {
                z2 = i2;
            }
            boolean zM = abmtVar.i.m(22, 45375646L);
            boolean zAZ = abmtVar.aZ();
            boolean zCa = abmtVar.ca();
            i4 = -1;
            if (abzh.m(i) && abnpVar != null) {
                i4 = abnpVar.j;
            }
            return new abzh(scheduledExecutorService, tfqVar, xeuVar, tywVar, mbcVar, arifVar, abmtVar, map, abzjVar, str2, strG, str, typ.c(null), 1.0f, 1.0f, j2, "-", optional, appaVar, iG, i6, -1L, i3, z, Z, zV, iIntValue, iIntValue2, aboaVar, aaxoVarC, wjnVar, false, jB, aihfVarCreateBuilder, aihfVarCreateBuilder2, arjbVar, -1L, z2, false, 10, zM, zAZ, zCa, false, false, i4, wjfVar.h().d(), wjfVar.h().c());
        }
        i2 = 0;
        i3 = i2;
        if (abzh.m(i)) {
            z = i2;
        } else {
            z = i2;
        }
        boolean Z2 = wjfVar.Z();
        boolean zV2 = wjfVar.V();
        wjaVarG = wjfVar.g();
        if (wjaVarG != null) {
            optionalFindFirst2 = Collection.EL.stream(wjaVarG.r).filter(new aaep(13)).findFirst();
            if (true == optionalFindFirst2.isPresent()) {
                optionalFindFirst2 = Optional.ofNullable(Integer.valueOf(((wgs) optionalFindFirst2.get()).e()));
            }
            iIntValue = ((Integer) optionalFindFirst2.orElse(Integer.valueOf(i2))).intValue();
        } else {
            iIntValue = i2;
        }
        wjaVarG2 = wjfVar.g();
        if (wjaVarG2 != null) {
            optionalFindFirst = Collection.EL.stream(wjaVarG2.r).filter(new aaep(14)).filter(new aaep(15)).findFirst();
            if (true == optionalFindFirst.isPresent()) {
                optionalFindFirst = Optional.ofNullable(Integer.valueOf(((wgs) optionalFindFirst.get()).e()));
            }
            iIntValue2 = ((Integer) optionalFindFirst.orElse(Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = i2;
        }
        aboa aboaVar2 = abncVar.r;
        aaxo aaxoVarC2 = abncVar.c();
        wjn wjnVar2 = wjfVar.h().j;
        long jB2 = mbcVar.b();
        aihf aihfVarCreateBuilder3 = arja.a.createBuilder();
        arjb arjbVar3 = arjb.a;
        aihf aihfVarCreateBuilder4 = arjbVar3.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        arjb arjbVar4 = (arjb) aihfVarCreateBuilder4.instance;
        arjbVar4.b |= 4;
        arjbVar4.f = -1.0f;
        if (wjfVar.k().f() == 2) {
            z2 = 1;
        } else {
            z2 = i2;
        }
        boolean zM2 = abmtVar.i.m(22, 45375646L);
        boolean zAZ2 = abmtVar.aZ();
        boolean zCa2 = abmtVar.ca();
        i4 = -1;
        if (abzh.m(i)) {
            i4 = abnpVar.j;
        }
        return new abzh(scheduledExecutorService, tfqVar, xeuVar, tywVar, mbcVar, arifVar, abmtVar, map, abzjVar, str2, strG, str, typ.c(null), 1.0f, 1.0f, j2, "-", optional, appaVar, iG, i6, -1L, i3, z, Z2, zV2, iIntValue, iIntValue2, aboaVar2, aaxoVarC2, wjnVar2, false, jB2, aihfVarCreateBuilder3, aihfVarCreateBuilder4, arjbVar3, -1L, z2, false, 10, zM2, zAZ2, zCa2, false, false, i4, wjfVar.h().d(), wjfVar.h().c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void b(ajqf ajqfVar) {
        aapw aapwVar = (aapw) this.b;
        wor worVarI = aapwVar.i();
        worVarI.a = ajqfVar.d;
        int iAq = ahng.aq(ajqfVar.f);
        if (iAq != 0 && iAq == 58 && (ajqfVar.c & 16) != 0) {
            int iAS = a.aS(ajqfVar.h);
            if (iAS == 0) {
                iAS = 2;
            }
            worVarI.d = iAS;
        }
        ?? r2 = this.l;
        taf.i(aapwVar.j(worVarI, r2), r2, new ijj(this.d, 17), new itt(this, ajqfVar, 4), null);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v19, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v21, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v23, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v9, types: [awmd, java.lang.Object] */
    public final hoj c(may mayVar) {
        hpy hpyVar = (hpy) this.h.io();
        hpyVar.getClass();
        Container container = (Container) this.i.io();
        container.getClass();
        avmb avmbVar = (avmb) this.g.io();
        avmbVar.getClass();
        Executor executor = (Executor) this.b.io();
        executor.getClass();
        avmb avmbVar2 = (avmb) this.c.io();
        avmbVar2.getClass();
        Executor executor2 = (Executor) this.a.io();
        executor2.getClass();
        Context context = (Context) this.d.io();
        context.getClass();
        hbf hbfVar = (hbf) this.j.io();
        hbfVar.getClass();
        wek wekVar = (wek) this.e.io();
        wekVar.getClass();
        tfq tfqVar = (tfq) this.m.io();
        tfqVar.getClass();
        hlz hlzVar = (hlz) this.l.io();
        hlzVar.getClass();
        hpb hpbVar = (hpb) this.f.io();
        hpbVar.getClass();
        vxz vxzVar = (vxz) this.k.io();
        vxzVar.getClass();
        return new hoj(hpyVar, container, avmbVar, executor, avmbVar2, executor2, context, hbfVar, wekVar, tfqVar, hlzVar, hpbVar, vxzVar);
    }

    public abzi(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13, byte[] bArr) {
        awmdVar.getClass();
        this.d = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        this.e = awmdVar3;
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.j = awmdVar5;
        this.g = awmdVar6;
        this.b = awmdVar7;
        awmdVar8.getClass();
        this.l = awmdVar8;
        this.m = awmdVar9;
        awmdVar10.getClass();
        this.f = awmdVar10;
        awmdVar11.getClass();
        this.h = awmdVar11;
        awmdVar12.getClass();
        this.k = awmdVar12;
        awmdVar13.getClass();
        this.i = awmdVar13;
    }

    public abzi(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.h = awmdVar;
        this.i = awmdVar2;
        awmdVar3.getClass();
        this.g = awmdVar3;
        awmdVar4.getClass();
        this.b = awmdVar4;
        awmdVar5.getClass();
        this.c = awmdVar5;
        awmdVar6.getClass();
        this.a = awmdVar6;
        awmdVar7.getClass();
        this.d = awmdVar7;
        this.j = awmdVar8;
        this.e = awmdVar9;
        this.m = awmdVar10;
        awmdVar11.getClass();
        this.l = awmdVar11;
        awmdVar12.getClass();
        this.f = awmdVar12;
        awmdVar13.getClass();
        this.k = awmdVar13;
    }

    public abzi(tbt tbtVar, Executor executor, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, abix abixVar, vxu vxuVar, agev agevVar, Map map, abvc abvcVar, xit xitVar, abmt abmtVar) {
        tbtVar.getClass();
        this.h = tbtVar;
        executor.getClass();
        this.g = executor;
        awmdVar.getClass();
        this.l = awmdVar;
        awmdVar2.getClass();
        this.m = awmdVar2;
        this.k = awmdVar3;
        awmdVar4.getClass();
        this.j = awmdVar4;
        abixVar.getClass();
        this.f = abixVar;
        this.c = vxuVar;
        this.d = agevVar;
        this.i = map;
        this.e = abvcVar;
        this.b = xitVar;
        this.a = abmtVar;
    }

    public abzi(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13) {
        awmdVar.getClass();
        this.j = awmdVar;
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.b = awmdVar3;
        awmdVar4.getClass();
        this.k = awmdVar4;
        awmdVar5.getClass();
        this.c = awmdVar5;
        this.d = awmdVar6;
        this.e = awmdVar7;
        this.l = awmdVar8;
        awmdVar9.getClass();
        this.f = awmdVar9;
        awmdVar10.getClass();
        this.g = awmdVar10;
        awmdVar11.getClass();
        this.h = awmdVar11;
        this.i = awmdVar12;
        this.m = awmdVar13;
    }
}
