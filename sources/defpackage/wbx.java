package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.ContextObserver;
import com.google.android.libraries.elements.interfaces.FaultObserver;
import com.google.android.libraries.elements.interfaces.FaultSubscription;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.Subscription;
import com.google.android.libraries.elements.interfaces.Transaction;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.elements.TransactionContextOuterClass$TransactionContext;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wbx {
    public final ByteStore a;
    public final int b;
    private final wfl c;
    private final agkj d;
    private final agev e;
    private final wbo f;
    private final wjr g;
    private final ContextObserver unusedContextObserver;
    private final FaultObserver unusedFaultObserver;
    private final FaultSubscription unusedFaultSubscription;
    private final Subscription unusedSubscription;

    public wbx(ByteStore byteStore, wfl wflVar, Map map, awmd awmdVar, vxz vxzVar, ContextObserver contextObserver, FaultObserver faultObserver, wjr wjrVar) {
        agev agfaVar;
        int i;
        this.a = byteStore;
        this.c = wflVar;
        this.d = agkj.h(map);
        this.g = wjrVar;
        wbo wboVar = new wbo(byteStore);
        this.f = wboVar;
        if (vxzVar.l(24, 45668681L, false)) {
            avmb avmbVar = (avmb) awmdVar.io();
            avmbVar.getClass();
            agfaVar = new agfa(avmbVar);
        } else {
            agfaVar = agdf.a;
        }
        this.e = agfaVar;
        if (vxzVar.l(111, 45801844L, false)) {
            i = 2;
        } else {
            i = vxzVar.l(112, 45801845L, false) ? 3 : 1;
        }
        this.b = i;
        boolean zL = vxzVar.l(118, 45827162L, false);
        this.unusedContextObserver = true != zL ? null : contextObserver;
        this.unusedFaultObserver = true != zL ? null : faultObserver;
        this.unusedSubscription = byteStore.subscribeWithContext(null, new wbn(wboVar, zL ? new wbv(contextObserver) : contextObserver));
        this.unusedFaultSubscription = byteStore.subscribeToFaults(zL ? new wbw(faultObserver) : faultObserver);
    }

    public static wej e(atom atomVar) {
        if (atomVar == null) {
            return wej.a;
        }
        akvf akvfVar = atomVar.c;
        if (akvfVar == null) {
            akvfVar = akvf.a;
        }
        return new wej(akvfVar);
    }

    private final Snapshot m() {
        return this.f.a;
    }

    private final weh n(String str, byte[] bArr) {
        if (bArr != null) {
            return this.g.a(str, bArr);
        }
        return null;
    }

    private final atom o(Snapshot snapshot, String str) {
        byte[] bArrRetrieveMetadata = snapshot.retrieveMetadata(str);
        if (bArrRetrieveMetadata == null) {
            return null;
        }
        try {
            return (atom) aihn.parseFrom(atom.a, bArrRetrieveMetadata, ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik unused) {
            l("Unparseable companion for ".concat(String.valueOf(str)));
            return null;
        }
    }

    private static final byte[] p(Snapshot snapshot, String str) {
        if (snapshot.contains(str)) {
            return snapshot.find(str);
        }
        return null;
    }

    public final long a() {
        return m().byteSize();
    }

    public final long b() {
        return m().size();
    }

    public final weh c(String str) {
        return d(m(), str);
    }

    public final weh d(Snapshot snapshot, String str) {
        return n(str, snapshot.find(str));
    }

    public final weo f(String str, Snapshot snapshot, Snapshot snapshot2) {
        byte[] bArrP = p(snapshot, str);
        byte[] bArrP2 = p(snapshot2, str);
        if (bArrP == null && bArrP2 == null) {
            l("Calculating update without parseable values for ".concat(String.valueOf(str)));
            return null;
        }
        wej wejVarE = e(o(snapshot, str));
        wej wejVarE2 = e(o(snapshot2, str));
        boolean zEquals = Arrays.equals(bArrP, bArrP2);
        if (zEquals && wejVarE.equals(wejVarE2)) {
            return null;
        }
        weh wehVarN = n(str, bArrP);
        weh wehVarN2 = !zEquals ? n(str, bArrP2) : wehVarN;
        aaun aaunVar = new aaun();
        aaunVar.d(str);
        aaunVar.f = wehVarN;
        aaunVar.b = wehVarN2;
        aaunVar.e(wejVarE);
        aaunVar.c(wejVarE2);
        return aaunVar.b();
    }

    public final weo g(String str) {
        Snapshot snapshotM = m();
        weh wehVarD = d(snapshotM, str);
        aaun aaunVar = new aaun();
        aaunVar.d(str);
        aaunVar.b = wehVarD;
        atom atomVarO = o(snapshotM, str);
        if (atomVarO != null) {
            akvf akvfVar = atomVarO.c;
            if (akvfVar == null) {
                akvfVar = akvf.a;
            }
            aaunVar.c(new wej(akvfVar));
        }
        return aaunVar.b();
    }

    public final agkz h(Collection collection) {
        return (agkz) j$.util.Collection.EL.stream(collection).flatMap(new hph(this, m(), 17, null)).collect(aghu.b);
    }

    public final avlb i(final TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext, final List list, final aijp aijpVar) {
        avlb avqaVar = list.isEmpty() ? avpy.a : new avqa(new avnd() { // from class: wbr
            /* JADX WARN: Code duplicated, block: B:14:0x002a A[Catch: wfe -> 0x002e, TRY_ENTER, TryCatch #3 {wfe -> 0x002e, blocks: (B:3:0x0008, B:14:0x002a, B:15:0x002d), top: B:24:0x0008 }] */
            @Override // defpackage.avnd
            public final void a() throws Throwable {
                wbx wbxVar = this.a;
                List list2 = list;
                TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext2 = transactionContextOuterClass$TransactionContext;
                aijp aijpVar2 = aijpVar;
                try {
                    Transaction transactionCreateTransactionWithContext = wbxVar.a.createTransactionWithContext(transactionContextOuterClass$TransactionContext2);
                    try {
                        try {
                            wbxVar.k(list2, aijpVar2, new wcb(transactionCreateTransactionWithContext));
                            transactionCreateTransactionWithContext.commit();
                        } catch (wfe e) {
                            transactionCreateTransactionWithContext.abort();
                            try {
                                wbxVar.l("ManagedTransaction closed without commit");
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                transactionCreateTransactionWithContext = null;
                                if (transactionCreateTransactionWithContext != null) {
                                    transactionCreateTransactionWithContext.abort();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (transactionCreateTransactionWithContext != null) {
                            transactionCreateTransactionWithContext.abort();
                        }
                        throw th;
                    }
                } catch (wfe e2) {
                    String strConcat = "Transaction aborted due to failed edit ".concat(e2.toString());
                    wbxVar.l(strConcat);
                    throw new wfe(strConcat, e2);
                }
            }
        });
        avnn avnnVar = atqp.p;
        return avqaVar;
    }

    public final avlb j(TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext, List list, aijp aijpVar) {
        if (list.isEmpty()) {
            return avlb.e();
        }
        avlb avlbVarG = avlb.g(new wbs(this, transactionContextOuterClass$TransactionContext, list, aijpVar, 0));
        agev agevVar = this.e;
        return agevVar.g() ? avlbVarG.r((avmb) agevVar.c()) : avlbVarG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(List list, aijp aijpVar, wbp wbpVar) throws wfe {
        atom atomVar;
        wbc watVar;
        wbi wbiVarB;
        byte[] bArrD;
        HashMap map = new HashMap(aguu.k(((agpi) list).d));
        agqs agqsVarListIterator = ((agke) list).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            wbf wbfVar = (wbf) agqsVarListIterator.next();
            j$.util.Map.EL.merge(map, wbfVar.a, wbfVar.b, new wbq());
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            wbe wbeVar = (wbe) entry.getValue();
            byte[] bArrE = wbpVar.e(str);
            if (bArrE == null) {
                atomVar = atom.a;
            } else {
                try {
                    atomVar = (atom) aihn.parseFrom(atom.a, bArrE, ExtensionRegistryLite.getGeneratedRegistry());
                } catch (aiik unused) {
                    atomVar = atom.a;
                }
            }
            aijp aijpVar2 = atomVar.d;
            if (aijpVar2 == null) {
                aijpVar2 = aijp.a;
            }
            aijp aijpVarA = wey.a(aijpVar2, aijpVar);
            if (aijpVarA != null) {
                wjr wjrVar = this.g;
                wbi wbiVar = wbeVar.a;
                wbk wbkVar = wbeVar.b;
                if (wbkVar == null) {
                    wbiVar.getClass();
                    watVar = new wat(wbiVar);
                } else if (wbiVar.d()) {
                    watVar = new wat(wbkVar.b(wbiVar.e() ? null : ((wbl) wbiVar.c()).d(), wjrVar));
                } else {
                    watVar = new was(wbkVar);
                }
                if (watVar.b() == 1) {
                    wbiVarB = watVar.c();
                } else {
                    wbiVarB = watVar.a().b(wbpVar.d(str), wjrVar);
                    if (wbiVarB.e()) {
                        throw new wfe("Updates may not delete the entity.");
                    }
                }
                wbi wbiVar2 = wbeVar.c;
                if (!wbiVarB.d() && !wbiVar2.d()) {
                    aijp aijpVar3 = atomVar.d;
                    if (aijpVar3 == null) {
                        aijpVar3 = aijp.a;
                    }
                    aijp aijpVarA2 = wey.a(aijpVar3, aijpVarA);
                    if (aijpVarA2 == null) {
                        aijpVarA2 = aijpVar3;
                    }
                    aijp aijpVar4 = aikz.a;
                    if (aiky.a(aijpVarA2, aijpVar3) > 0) {
                        aihf builder = atomVar.toBuilder();
                        builder.copyOnWrite();
                        atom atomVar2 = (atom) builder.instance;
                        atomVar2.d = aijpVarA;
                        atomVar2.b |= 2;
                        wbpVar.b(str, ((atom) builder.build()).toByteArray());
                    }
                } else if (wbiVarB.e()) {
                    wbpVar.a(str);
                } else {
                    aihf builder2 = atomVar.toBuilder();
                    if (wbiVar2.d()) {
                        if (wbiVar2.e()) {
                            builder2.copyOnWrite();
                            atom atomVar3 = (atom) builder2.instance;
                            atomVar3.c = null;
                            atomVar3.b &= -2;
                        } else {
                            akvf akvfVar = ((wej) wbiVar2.c()).b;
                            builder2.copyOnWrite();
                            atom atomVar4 = (atom) builder2.instance;
                            atomVar4.c = akvfVar;
                            atomVar4.b |= 1;
                        }
                    }
                    builder2.copyOnWrite();
                    atom atomVar5 = (atom) builder2.instance;
                    atomVar5.d = aijpVarA;
                    atomVar5.b |= 2;
                    byte[] byteArray = ((atom) builder2.build()).toByteArray();
                    if (wbiVarB.d()) {
                        wbl wblVar = (wbl) wbiVarB.c();
                        hef hefVar = (hef) this.d.get(wjrVar.b(str));
                        byte[] bArrD2 = (hefVar == null || (bArrD = wbpVar.d(str)) == null) ? wblVar.d() : hefVar.j(wjrVar.a(str, bArrD), wblVar.b() == 2 ? wjrVar.a(str, wblVar.a()) : wblVar.c()).c();
                        wbpVar.c(str, bArrD2, byteArray);
                    } else {
                        if (wbpVar.d(str) == null) {
                            throw new wfe("Cannot commit metadata without an existing entity");
                        }
                        wbpVar.b(str, byteArray);
                    }
                }
            }
        }
    }

    public final void l(String str) {
        this.c.a("InMemoryEntityStore", str);
    }
}
