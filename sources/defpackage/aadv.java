package defpackage;

import android.database.sqlite.SQLiteFullException;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aadv implements aaqr {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/client/DefaultOfflineVideoPolicyStore");
    public long b;
    public final mbc c;
    public final String d;
    public final awmd e;
    public final awmd f;
    public final awmd g;
    public final awmd h;
    public final awmd i;
    public final Set j;
    public final aado k;
    private final awmd m;
    private final aada n;
    private final awmd o;
    private final awmd p;
    private final awmd q;
    private final agkz r;
    private final aauk s;
    private final wjr t;

    public aadv(mbc mbcVar, String str, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, aada aadaVar, awmd awmdVar4, aado aadoVar, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, Set set, wjr wjrVar, Set set2, aauk aaukVar) {
        this.c = mbcVar;
        this.d = str;
        this.m = awmdVar;
        this.e = awmdVar2;
        this.f = awmdVar3;
        this.n = aadaVar;
        this.g = awmdVar4;
        this.k = aadoVar;
        this.h = awmdVar5;
        this.i = awmdVar6;
        this.o = awmdVar7;
        this.p = awmdVar8;
        this.q = awmdVar9;
        this.j = set;
        this.t = wjrVar;
        this.r = agkz.n(set2);
        this.s = aaukVar;
    }

    private final wjf k(aamt aamtVar) throws aaiq, aain, aaim, aaip {
        wjf wjfVarI;
        boolean z;
        if (aamtVar == null) {
            throw new aain();
        }
        if (aamtVar.m()) {
            throw new aaim();
        }
        if (aamtVar.n()) {
            aams aamsVar = aamtVar.m;
            if (aamsVar == null || !aamsVar.e()) {
                throw new aaip();
            }
            throw new aaiq();
        }
        aaew aaewVar = (aaew) this.g.io();
        String strB = aamtVar.b();
        aauk aaukVar = this.s;
        wjf wjfVarD = (aaukVar.w() || aaukVar.x()) ? aaewVar.d(strB) : aaewVar.c(strB);
        boolean zF = aaukVar.f();
        if (wjfVarD == null || (!zF && ((wji) wjfVarD).c == null)) {
            throw new aaim();
        }
        wji wjiVar = (wji) wjfVarD;
        aihh aihhVar = (aihh) wjiVar.a.toBuilder();
        alvw alvwVar = wjiVar.a.g;
        if (alvwVar == null) {
            alvwVar = alvw.a;
        }
        aihf builder = alvwVar.toBuilder();
        builder.copyOnWrite();
        alvw alvwVar2 = (alvw) builder.instance;
        alvwVar2.b &= -9;
        alvwVar2.f = false;
        builder.copyOnWrite();
        alvw alvwVar3 = (alvw) builder.instance;
        alvwVar3.b &= -17;
        alvwVar3.g = false;
        alvw alvwVar4 = (alvw) builder.build();
        aihhVar.copyOnWrite();
        alvt alvtVar = (alvt) aihhVar.instance;
        alvwVar4.getClass();
        alvtVar.g = alvwVar4;
        alvtVar.b |= 8;
        alvt alvtVar2 = (alvt) aihhVar.build();
        mbc mbcVar = this.c;
        awmd awmdVar = this.p;
        wji wjiVar2 = new wji(alvtVar2, mbcVar.b(), (wjb) awmdVar.io());
        agqr it = this.r.iterator();
        while (it.hasNext()) {
            alvt alvtVarA = ((aaql) it.next()).a();
            if (alvtVarA != null) {
                wjiVar2 = new wji(alvtVarA, mbcVar.b(), (wjb) awmdVar.io());
            }
        }
        awmd awmdVar2 = this.o;
        long j = aael.b;
        aadr aadrVar = (aadr) awmdVar2.io();
        awmd awmdVar3 = this.m;
        wji wjiVar3 = wjiVar2;
        aamm aammVarG = aadrVar.g(strB, new axmq((abtd) awmdVar3.io(), mbcVar.b() + 18000000));
        if (aammVarG != null) {
            awmd awmdVar4 = awmdVar3;
            wjfVarI = isi.I(wjiVar3, (wjb) awmdVar.io(), aammVarG.c(), aammVarG.a(), mbcVar.b(), j, false, aaukVar);
            wji wjiVar4 = (wji) wjfVarI;
            if (wjiVar4.a.C.size() > 0) {
                alvt alvtVar3 = wjiVar4.a;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = alvtVar3.C.iterator();
                while (it2.hasNext()) {
                    amfb amfbVar = (amfb) it2.next();
                    if (amfbVar.b.size() != 0) {
                        aihf builder2 = amfbVar.toBuilder();
                        builder2.copyOnWrite();
                        ((amfb) builder2.instance).b = amfb.emptyProtobufList();
                        Iterator it3 = amfbVar.b.iterator();
                        while (it3.hasNext()) {
                            alvt alvtVar4 = (alvt) this.t.D(((amfa) it3.next()).c.G(), alvt.a);
                            if (alvtVar4 != null) {
                                aihh aihhVar2 = (aihh) alvtVar4.toBuilder();
                                StreamingDataOuterClass$StreamingData defaultInstance = ((alvt) aihhVar2.instance).h;
                                if (defaultInstance == null) {
                                    defaultInstance = StreamingDataOuterClass$StreamingData.getDefaultInstance();
                                }
                                aihf builder3 = defaultInstance.toBuilder();
                                builder3.copyOnWrite();
                                alvt alvtVar5 = alvtVar3;
                                ((StreamingDataOuterClass$StreamingData) builder3.instance).f = StreamingDataOuterClass$StreamingData.emptyProtobufList();
                                builder3.copyOnWrite();
                                ((StreamingDataOuterClass$StreamingData) builder3.instance).e = StreamingDataOuterClass$StreamingData.emptyProtobufList();
                                aadr aadrVar2 = (aadr) awmdVar2.io();
                                alvw alvwVar5 = alvtVar4.g;
                                if (alvwVar5 == null) {
                                    alvwVar5 = alvw.a;
                                }
                                awmd awmdVar5 = awmdVar4;
                                Iterator it4 = it2;
                                boolean z2 = zF;
                                mbc mbcVar2 = mbcVar;
                                aamm aammVarG2 = aadrVar2.g(alvwVar5.c, new axmq((abtd) awmdVar5.io(), mbcVar.b() + 18000000));
                                if (aammVarG2 != null) {
                                    alvw alvwVar6 = alvtVar4.g;
                                    if (alvwVar6 == null) {
                                        alvwVar6 = alvw.a;
                                    }
                                    aada aadaVar = this.n;
                                    boolean z3 = alvwVar6.q;
                                    wgs wgsVarD = aammVarG2.d(aadaVar.i(), z3);
                                    wgs wgsVarB = aammVarG2.b(aadaVar.i(), z3);
                                    if (wgsVarD != null && (!wgsVarD.G() || wgsVarB != null)) {
                                        long jMax = Math.max(0L, j);
                                        builder3.copyOnWrite();
                                        StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData = (StreamingDataOuterClass$StreamingData) builder3.instance;
                                        streamingDataOuterClass$StreamingData.c |= 1;
                                        streamingDataOuterClass$StreamingData.d = jMax;
                                        if (wgsVarD.G()) {
                                            builder3.cp(wgsVarD.b);
                                        } else {
                                            builder3.cq(wgsVarD.b);
                                        }
                                        if (wgsVarB != null) {
                                            builder3.cp(wgsVarB.b);
                                        }
                                        StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData2 = (StreamingDataOuterClass$StreamingData) builder3.build();
                                        aihhVar2.copyOnWrite();
                                        alvt alvtVar6 = (alvt) aihhVar2.instance;
                                        streamingDataOuterClass$StreamingData2.getClass();
                                        alvtVar6.h = streamingDataOuterClass$StreamingData2;
                                        alvtVar6.b |= 16;
                                        alvtVar4 = (alvt) aihhVar2.build();
                                    }
                                }
                                aihh aihhVar3 = (aihh) amfa.a.createBuilder();
                                aigj byteString = alvtVar4.toByteString();
                                aihhVar3.copyOnWrite();
                                amfa amfaVar = (amfa) aihhVar3.instance;
                                amfaVar.b |= 1;
                                amfaVar.c = byteString;
                                builder2.bw(aihhVar3);
                                awmdVar4 = awmdVar5;
                                alvtVar3 = alvtVar5;
                                zF = z2;
                                it2 = it4;
                                mbcVar = mbcVar2;
                            }
                        }
                        arrayList.add((amfb) builder2.build());
                        alvtVar3 = alvtVar3;
                    }
                }
                z = zF;
                aihh aihhVar4 = (aihh) alvtVar3.toBuilder();
                aihhVar4.copyOnWrite();
                ((alvt) aihhVar4.instance).C = alvt.emptyProtobufList();
                aihhVar4.h(arrayList);
                wjfVarI = new wji((alvt) aihhVar4.build(), mbcVar.b(), (wjb) awmdVar.io());
            }
            if (z || ((wji) wjfVarI).c != null) {
                return wjfVarI;
            }
            throw new aaim();
        }
        wjfVarI = wjiVar3;
        z = zF;
        if (z) {
        }
        return wjfVarI;
    }

    @Override // defpackage.aaqr
    public final wjf a(aalx aalxVar) throws aaim {
        if (aalxVar instanceof aamt) {
            return k((aamt) aalxVar);
        }
        String strB = aalxVar.b();
        taq.c();
        if (this.k.C()) {
            return k(((aady) this.i.io()).b(strB, true));
        }
        throw new aaim();
    }

    @Override // defpackage.aaqr
    public final aams b(String str) {
        taq.c();
        if (this.k.C()) {
            aaew aaewVar = (aaew) this.g.io();
            typ.f(str);
            aagl aaglVarS = aaewVar.b.s(str);
            if (aaglVarS != null) {
                return aaglVarS.d();
            }
        }
        return null;
    }

    @Override // defpackage.aaqr
    public final void c(String str) {
        ((aaew) this.g.io()).I(str);
        aafu aafuVar = (aafu) this.o.io();
        aamm aammVarG = aafuVar.g(str, null);
        if (aammVarG != null) {
            aaml aamlVar = aammVarG.b;
            if (aamlVar != null) {
                aafuVar.c(str, aamlVar.a());
            }
            aaml aamlVar2 = aammVarG.a;
            if (aamlVar2 != null) {
                aafuVar.c(str, aamlVar2.a());
            }
        }
    }

    public final void d(String str) {
        aaew aaewVar = (aaew) this.g.io();
        aamt aamtVarF = aaewVar.f(str);
        if (aamtVarF == null) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/offline/client/DefaultOfflineVideoPolicyStore", "createStreamTransferTask", 586, "DefaultOfflineVideoPolicyStore.java")).w("Refresh video failed because snapshot invalid for %s", str);
        } else {
            aohx aohxVarAn = aaewVar.an(str);
            ((aerj) this.h.io()).j(str, null, null, aohxVarAn, null, ((aaqg) this.e.io()).d(aohxVarAn), aamtVarF.o, 1, true, true, false, aamtVarF.k(), 1);
        }
    }

    public final void e(String str) {
        if (((aady) this.i.io()).b(str, true) != null) {
            aaew aaewVar = (aaew) this.g.io();
            awmd awmdVar = this.q;
            ((abqq) awmdVar.io()).f(str);
            try {
                aaewVar.B(str, ((abqq) awmdVar.io()).j(str, aofb.OFFLINE_NOW, aaewVar.au(str), null, null), this.c.f().toEpochMilli(), true, (wjb) this.p.io());
            } catch (SQLiteFullException | wno unused) {
            }
        }
    }

    @Override // defpackage.aaqr
    public final void f(String str) {
        this.k.u(new aadi(this, str, 8));
    }

    @Override // defpackage.aaqr
    public final void g(String str) {
        this.k.u(new aadi(this, str, 10));
    }

    @Override // defpackage.aaqr
    public final void h(String str) {
        this.k.u(new aadi(this, str, 7));
    }

    @Override // defpackage.aaqr
    public final void i(String str) {
        typ.f(str);
        this.k.u(new aadi(this, str, 9));
    }

    @Override // defpackage.aaqr
    public final boolean j(aams aamsVar) {
        taq.c();
        if (!this.k.C()) {
            return false;
        }
        String str = aamsVar.b;
        aaew aaewVar = (aaew) this.g.io();
        aauk aaukVar = this.s;
        wjf wjfVarD = (aaukVar.w() || aaukVar.x()) ? aaewVar.d(str) : aaewVar.c(str);
        if (wjfVarD == null) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/offline/client/DefaultOfflineVideoPolicyStore", "updateVideoPolicyBlocking", 171, "DefaultOfflineVideoPolicyStore.java")).w("No player response found for video: %s", str);
            return false;
        }
        awmd awmdVar = this.p;
        wjb wjbVar = (wjb) awmdVar.io();
        aogq aogqVar = aamsVar.c;
        wji wjiVar = (wji) wjfVarD;
        aihh aihhVar = (aihh) wjiVar.a.toBuilder();
        aihhVar.copyOnWrite();
        alvt alvtVar = (alvt) aihhVar.instance;
        alvtVar.l = aogqVar;
        alvtVar.b |= SemanticState.Focused;
        alvt alvtVar2 = (alvt) aihhVar.build();
        alvt alvtVar3 = (alvt) aihhVar.build();
        long j = wjiVar.b;
        boolean zB = aaewVar.B(str, new wji(alvtVar2, j, wji.ai(wjbVar, alvtVar3, j)), aamsVar.e, false, (wjb) awmdVar.io());
        if (!zB) {
            return zB;
        }
        ((aady) this.i.io()).m(str);
        return true;
    }
}
