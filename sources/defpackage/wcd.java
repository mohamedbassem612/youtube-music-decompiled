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
/* JADX INFO: loaded from: classes2.dex */
public final class wcd extends ContextObserver implements wby, wek, wbd, wfb {
    public final wbx a;
    public final Map b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final wjr e;
    public final zik f;
    private final Executor g;
    private final boolean h;
    private final boolean i;
    private final agfr j;

    /* JADX WARN: Code duplicated, block: B:6:0x004b  */
    public wcd(hhb hhbVar, awmd awmdVar, Executor executor, zik zikVar, tqj tqjVar, vxz vxzVar, vxz vxzVar2) {
        boolean z;
        wjr wjrVar = new wjr(awmdVar, this);
        this.e = wjrVar;
        this.f = zikVar;
        this.g = new ahfg(executor);
        this.h = vxzVar.l(37, 45408412L, false);
        if (!vxzVar2.l(22, 45663193L, false)) {
            int i = tqr.a;
            z = tqjVar.k(1073815013);
        }
        this.i = z;
        this.j = aguu.al(new jxq(vxzVar, executor, 12));
        this.a = hhbVar.e(this, new wcc(this), wjrVar);
    }

    public static final awly q(Map map, Object obj) {
        awly awlyVarAz = (awly) map.get(obj);
        if (awlyVarAz == null) {
            synchronized (map) {
                awlyVarAz = (awly) map.get(obj);
                if (awlyVarAz == null) {
                    awlyVarAz = new wex(new lph(map, obj, 20, (char[]) null)).az();
                    map.put(obj, awlyVarAz);
                }
            }
        }
        return awlyVarAz;
    }

    @Override // defpackage.wbd
    public final avlb a(List list, aijp aijpVar, boolean z, agev agevVar) {
        TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext;
        if (list.isEmpty()) {
            avlb avlbVar = avpy.a;
            avnn avnnVar = atqp.p;
            return avlbVar;
        }
        if (z && this.h) {
            transactionContextOuterClass$TransactionContext = null;
        } else {
            aihh aihhVar = (aihh) TransactionContextOuterClass$TransactionContext.a.createBuilder();
            aihl aihlVar = aton.b;
            aihf aihfVarCreateBuilder = aton.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aton atonVar = (aton) aihfVarCreateBuilder.instance;
            atonVar.c |= 1;
            atonVar.d = !z;
            aihhVar.e(aihlVar, (aton) aihfVarCreateBuilder.build());
            transactionContextOuterClass$TransactionContext = (TransactionContextOuterClass$TransactionContext) aihhVar.build();
        }
        boolean z2 = this.i;
        wbx wbxVar = this.a;
        avlb avlbVarJ = z2 ? wbxVar.j(transactionContextOuterClass$TransactionContext, list, aijpVar) : wbxVar.i(transactionContextOuterClass$TransactionContext, list, aijpVar);
        agev agevVar2 = (agevVar.g() || !a.x()) ? agdf.a : (agev) this.j.io();
        if (agevVar2.g()) {
            avlbVarJ = avlbVarJ.v((avmb) agevVar2.c());
        }
        awlk awlkVar = new awlk();
        avlbVarJ.kp(awlkVar);
        return awlkVar;
    }

    @Override // defpackage.wby
    public final avlr b(Class cls) {
        return q(this.d, cls).H();
    }

    @Override // defpackage.wby
    public final avmc c() {
        wbx wbxVar = this.a;
        wbxVar.getClass();
        return avmc.s(new tsp(wbxVar, 18));
    }

    @Override // defpackage.wek
    public final weh d(String str) {
        return (weh) g(str).E();
    }

    @Override // defpackage.wek
    public final wer e() {
        return gzj.o(this, wez.a);
    }

    @Override // defpackage.wfb
    public final wfa f(aijp aijpVar) {
        return new wbh(new vwt((byte[]) null, (byte[]) null), this, aijpVar);
    }

    @Override // defpackage.wek
    public final avlm g(String str) {
        return avlm.p(new tsn(this, str, 18, null));
    }

    @Override // defpackage.wek
    public final avlm h(String str) {
        throw null;
    }

    @Override // defpackage.wek
    public final avlr i(Class cls) {
        return q(this.c, cls).H();
    }

    @Override // defpackage.wek
    public final avlr j(String str, boolean z) {
        return z ? avlr.q(new tsn(this, str, 19, null)) : q(this.b, str).H();
    }

    @Override // defpackage.wek
    public final avlr k(String str) {
        return avlr.q(new tsn(this, str, 20, null));
    }

    @Override // defpackage.wek
    public final avmc l() {
        wbx wbxVar = this.a;
        wbxVar.getClass();
        return avmc.s(new tsp(wbxVar, 19));
    }

    @Override // defpackage.wek
    public final avmc m(String str) {
        throw null;
    }

    @Override // defpackage.wek
    public final avmc n(Collection collection) {
        return avmc.s(new tsn(this, collection, 17, null));
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
        if (transactionContextOuterClass$TransactionContext != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aton.b);
            transactionContextOuterClass$TransactionContext.c(aihlVarCheckIsLite);
            Object objK = transactionContextOuterClass$TransactionContext.j.k(aihlVarCheckIsLite.d);
            if (((aton) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).d) {
                return Status.OK;
            }
        }
        this.g.execute(afwl.i(new wdd(this, transactionRecord, 1, (byte[]) null)));
        return Status.OK;
    }
}
