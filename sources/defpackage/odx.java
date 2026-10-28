package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class odx {
    public final obc a;
    public final boolean b;
    public final long c;
    public final long d;
    public final omj e;
    public final xsc f;
    private final ablj g;
    private final aczl h;

    public odx(ablj abljVar, aczl aczlVar, xsc xscVar, omj omjVar, obc obcVar, boolean z, long j, long j2) {
        this.g = abljVar;
        this.h = aczlVar;
        this.f = xscVar;
        this.e = omjVar;
        this.a = obcVar;
        this.b = z;
        this.c = j;
        this.d = j2;
    }

    public final ListenableFuture a() {
        ListenableFuture listenableFutureE = ahbz.e(aheo.p(this.f.aj()), Throwable.class, new kke(9), MoreExecutors.directExecutor());
        ablj abljVar = this.g;
        abljVar.getClass();
        return ((aheo) listenableFutureE).q(new iun(abljVar, 8), MoreExecutors.directExecutor()).r(new ods(this, 0), MoreExecutors.directExecutor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture b(int i) {
        final aczl aczlVar = this.h;
        Object obj = aczlVar.a;
        obj.getClass();
        iug iugVar = new iug(obj, 16);
        ?? r1 = aczlVar.f;
        ListenableFuture listenableFutureE = ahbz.e(aheo.p(ahng.r(iugVar, r1)).q(new iun(aczlVar, 11), MoreExecutors.directExecutor()).r(new ods(aczlVar, 4), MoreExecutors.directExecutor()).q(new agek() { // from class: oeh
            /* JADX WARN: Code duplicated, block: B:76:0x019a  */
            /* JADX WARN: Type inference failed for: r5v0, types: [aunn, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v19, types: [aunn, java.lang.Object] */
            @Override // defpackage.agek
            public final Object apply(Object obj2) {
                int i2;
                obp obpVar = (obp) obj2;
                String str = (obpVar.c == 1 ? (gcz) obpVar.d : gcz.a).c;
                gcz gczVar = obpVar.c == 1 ? (gcz) obpVar.d : gcz.a;
                aczl aczlVar2 = aczlVar;
                Object obj3 = aczlVar2.b;
                String str2 = gczVar.d;
                ofb ofbVarH = ((omj) obj3).h(15203);
                try {
                    ofbVarH.c();
                    kws kwsVarAa = ixt.aa((Context) aczlVar2.d, (gcw) aczlVar2.a.io(), str, str2, (kwc) aczlVar2.c);
                    ofbVarH.a();
                    if (kwsVarAa.c == 2) {
                        ((omj) aczlVar2.b).j(15208);
                        return aczl.t(4);
                    }
                    byte[] bArr = kwsVarAa.b;
                    if (bArr == null || bArr.length == 0) {
                        ((omj) aczlVar2.b).j(5010);
                        return aczl.t(8);
                    }
                    try {
                        gcx gcxVar = (gcx) aihn.parseFrom(gcx.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
                        gcz gczVar2 = gcxVar.b;
                        if (gczVar2 == null) {
                            gczVar2 = gcz.a;
                        }
                        if (gczVar2.c.isEmpty()) {
                            ((omj) aczlVar2.b).j(15207);
                        } else {
                            gcz gczVar3 = gcxVar.b;
                            if (gczVar3 == null) {
                                gczVar3 = gcz.a;
                            }
                            if (!gczVar3.d.isEmpty() && gcxVar.d.G().length != 0) {
                                obp obpVar2 = obp.a;
                                if (!obpVar.equals(obpVar2)) {
                                    String str3 = (obpVar.c == 1 ? (gcz) obpVar.d : gcz.a).c;
                                    gcz gczVar4 = gcxVar.b;
                                    if (gczVar4 == null) {
                                        gczVar4 = gcz.a;
                                    }
                                    if (TextUtils.equals(str3, gczVar4.c)) {
                                        String str4 = (obpVar.c == 1 ? (gcz) obpVar.d : gcz.a).d;
                                        gcz gczVar5 = gcxVar.b;
                                        if (gczVar5 == null) {
                                            gczVar5 = gcz.a;
                                        }
                                        if (TextUtils.equals(str4, gczVar5.d)) {
                                            ((omj) aczlVar2.b).j(15209);
                                        }
                                    }
                                }
                                int i3 = kwsVarAa.c;
                                if (i3 == 4) {
                                    if (!((xsc) aczlVar2.e).am(gcxVar.c.G())) {
                                        ((omj) aczlVar2.b).j(15206);
                                        return aczl.t(12);
                                    }
                                    i3 = 4;
                                }
                                aihf aihfVarCreateBuilder = obo.a.createBuilder();
                                if (i3 != 2) {
                                    i2 = 3;
                                    if (i3 == 3) {
                                        i2 = 2;
                                    } else if (i3 != 4) {
                                        i2 = i3 != 6 ? 1 : 5;
                                    }
                                } else {
                                    i2 = 4;
                                }
                                aihfVarCreateBuilder.copyOnWrite();
                                obo oboVar = (obo) aihfVarCreateBuilder.instance;
                                oboVar.f = i2 - 1;
                                oboVar.b |= 8;
                                aihf aihfVarCreateBuilder2 = obpVar2.createBuilder();
                                gcz gczVar6 = gcxVar.b;
                                if (gczVar6 == null) {
                                    gczVar6 = gcz.a;
                                }
                                aihfVarCreateBuilder2.copyOnWrite();
                                obp obpVar3 = (obp) aihfVarCreateBuilder2.instance;
                                gczVar6.getClass();
                                obpVar3.d = gczVar6;
                                obpVar3.c = 1;
                                gcw gcwVar = (gcw) aczlVar2.a.io();
                                aihfVarCreateBuilder2.copyOnWrite();
                                obp obpVar4 = (obp) aihfVarCreateBuilder2.instance;
                                obpVar4.e = gcwVar.h;
                                obpVar4.b |= 1;
                                obp obpVar5 = (obp) aihfVarCreateBuilder2.build();
                                aihfVarCreateBuilder.copyOnWrite();
                                obo oboVar2 = (obo) aihfVarCreateBuilder.instance;
                                obpVar5.getClass();
                                oboVar2.c = obpVar5;
                                oboVar2.b |= 1;
                                aigj aigjVar = gcxVar.c;
                                aihfVarCreateBuilder.copyOnWrite();
                                obo oboVar3 = (obo) aihfVarCreateBuilder.instance;
                                aigjVar.getClass();
                                oboVar3.b |= 4;
                                oboVar3.e = aigjVar;
                                aigj aigjVar2 = gcxVar.d;
                                aihfVarCreateBuilder.copyOnWrite();
                                obo oboVar4 = (obo) aihfVarCreateBuilder.instance;
                                aigjVar2.getClass();
                                oboVar4.b |= 2;
                                oboVar4.d = aigjVar2;
                                return (obo) aihfVarCreateBuilder.build();
                            }
                            ((omj) aczlVar2.b).j(15207);
                        }
                        return aczl.t(11);
                    } catch (aiik e) {
                        ((omj) aczlVar2.b).i(15205, e);
                        return aczl.t(9);
                    } catch (NullPointerException unused) {
                        ((omj) aczlVar2.b).j(15210);
                        return aczl.t(10);
                    }
                } catch (Throwable th) {
                    try {
                        ofbVarH.b(th);
                        throw th;
                    } catch (Throwable th2) {
                        ofbVarH.a();
                        throw th2;
                    }
                }
            }
        }, r1), oei.class, new kke(12), MoreExecutors.directExecutor());
        ((omj) aczlVar.b).m(15202, listenableFutureE);
        int i2 = 7;
        int i3 = 2;
        ListenableFuture listenableFutureE2 = ahbz.e(ahbz.e(ahbz.e(aheo.p(listenableFutureE).q(new iun(this, i2), MoreExecutors.directExecutor()).r(new ods(this, i3), MoreExecutors.directExecutor()).q(new kke(6), MoreExecutors.directExecutor()), odu.class, new kke(i2), MoreExecutors.directExecutor()), odv.class, new kke(8), MoreExecutors.directExecutor()), odt.class, new gvw(this, i, i3), MoreExecutors.directExecutor());
        this.e.m(1002, listenableFutureE2);
        return listenableFutureE2;
    }
}
