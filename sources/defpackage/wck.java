package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.ContextObserver;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import com.google.protos.youtube.elements.TransactionContextOuterClass$TransactionContext;
import io.grpc.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wck extends ContextObserver implements wby, wek, wbd, wfb {
    public final Executor a;
    public final wbx b;
    public final Map c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;
    public final wjr f;
    private final boolean g;
    private final boolean h;
    private final awmi i;
    private final zik j;

    /* JADX WARN: Code duplicated, block: B:6:0x0046  */
    public wck(gzj gzjVar, Executor executor, zik zikVar, tqj tqjVar, hhb hhbVar, awmd awmdVar, vxz vxzVar, vxz vxzVar2) {
        boolean z;
        gzjVar.getClass();
        executor.getClass();
        tqjVar.getClass();
        hhbVar.getClass();
        awmdVar.getClass();
        vxzVar.getClass();
        vxzVar2.getClass();
        this.a = executor;
        this.j = zikVar;
        wjr wjrVar = new wjr(awmdVar, this);
        this.f = wjrVar;
        this.g = vxzVar.l(37, 45408412L, false);
        if (!vxzVar2.l(22, 45663193L, false)) {
            int i = tqr.a;
            z = tqjVar.k(1073815013);
        }
        this.h = z;
        this.b = hhbVar.e(this, new wcj(this), wjrVar);
        this.i = new awmp(new efi(vxzVar, this, 6));
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
    }

    public static final awly q(Map map, Object obj) {
        awly awlyVar;
        synchronized (map) {
            Object objAz = map.get(obj);
            if (objAz == null) {
                objAz = new wex(new uqd(map, obj, 15, null)).az();
                map.put(obj, objAz);
            }
            awlyVar = (awly) objAz;
        }
        return awlyVar;
    }

    @Override // defpackage.wbd
    public final avlb a(List list, aijp aijpVar, boolean z, agev agevVar) {
        TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext;
        list.getClass();
        aijpVar.getClass();
        if (list.isEmpty()) {
            return avlb.e();
        }
        if (z && this.g) {
            transactionContextOuterClass$TransactionContext = null;
        } else {
            aihh aihhVar = (aihh) TransactionContextOuterClass$TransactionContext.a.createBuilder();
            aihhVar.getClass();
            aihl aihlVar = aton.b;
            aihlVar.getClass();
            aihf aihfVarCreateBuilder = aton.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            aton atonVar = (aton) aihfVarCreateBuilder.instance;
            atonVar.c |= 1;
            atonVar.d = !z;
            aihn aihnVarBuild = aihfVarCreateBuilder.build();
            aihnVarBuild.getClass();
            aihhVar.e(aihlVar, (aton) aihnVarBuild);
            aihn aihnVarBuild2 = aihhVar.build();
            aihnVarBuild2.getClass();
            transactionContextOuterClass$TransactionContext = (TransactionContextOuterClass$TransactionContext) aihnVarBuild2;
        }
        boolean z2 = this.h;
        wbx wbxVar = this.b;
        avlb avlbVarJ = z2 ? wbxVar.j(transactionContextOuterClass$TransactionContext, list, aijpVar) : wbxVar.i(transactionContextOuterClass$TransactionContext, list, aijpVar);
        avmb avmbVar = a.x() ? (avmb) this.i.a() : null;
        if (avmbVar != null) {
            avlbVarJ = avlbVarJ.v(avmbVar);
        }
        awlk awlkVar = new awlk();
        avlbVarJ.kp(awlkVar);
        return awlkVar;
    }

    @Override // defpackage.wby
    public final avlr b(Class cls) {
        cls.getClass();
        return q(this.e, cls).H();
    }

    @Override // defpackage.wby
    public final avmc c() {
        return avmc.s(new tsp(this.b, 20));
    }

    @Override // defpackage.wek
    public final weh d(String str) {
        str.getClass();
        return (weh) g(str).E();
    }

    @Override // defpackage.wek
    public final wer e() {
        return gzj.o(this, wez.a);
    }

    @Override // defpackage.wfb
    public final wfa f(aijp aijpVar) {
        aijpVar.getClass();
        return gzj.o(this, aijpVar);
    }

    @Override // defpackage.wek
    public final avlm g(String str) {
        str.getClass();
        return avlm.p(new wci(this, str, 3));
    }

    @Override // defpackage.wek
    public final avlm h(String str) {
        throw null;
    }

    @Override // defpackage.wek
    public final avlr i(Class cls) {
        return q(this.d, cls).H();
    }

    @Override // defpackage.wek
    public final avlr j(String str, boolean z) {
        str.getClass();
        return z ? avlr.q(new wci(this, str, 1)) : q(this.c, str).H();
    }

    @Override // defpackage.wek
    public final avlr k(String str) {
        str.getClass();
        return avlr.q(new wci(this, str, 2));
    }

    @Override // defpackage.wek
    public final avmc l() {
        return avmc.s(new wko(this.b, 1));
    }

    @Override // defpackage.wek
    public final avmc m(String str) {
        throw null;
    }

    @Override // defpackage.wek
    public final avmc n(Collection collection) {
        collection.getClass();
        return avmc.s(new wci(this, collection, 0));
    }

    @Override // defpackage.wek
    public final avmc o(Collection collection) {
        throw null;
    }

    @Override // defpackage.wek
    public final avmc p(String str) {
        throw null;
    }

    @Override // com.google.android.libraries.elements.interfaces.ContextObserver
    public final Status storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord, TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext) {
        byteStore.getClass();
        transactionRecord.getClass();
        if (transactionContextOuterClass$TransactionContext != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aton.b);
            transactionContextOuterClass$TransactionContext.c(aihlVarCheckIsLite);
            Object objK = transactionContextOuterClass$TransactionContext.j.k(aihlVarCheckIsLite.d);
            if (((aton) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).d) {
                Status status = Status.OK;
                status.getClass();
                return status;
            }
        }
        this.a.execute(afwl.i(new uqd(this, transactionRecord, 14, null)));
        Status status2 = Status.OK;
        status2.getClass();
        return status2;
    }
}
