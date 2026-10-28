package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.Subscription;
import com.google.android.libraries.elements.interfaces.TaskQueue;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agbx extends InstanceProxy {
    public final asiu a;
    public final agcl b;

    public agbx(agcl agclVar, asiu asiuVar) {
        this.b = agclVar;
        this.a = asiuVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* synthetic */ mew a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        if (i != 77296450) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '395487482'."));
        }
        aspb aspbVar = (aspb) aihn.parseFrom(aspb.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        ?? r2 = this.b.a;
        SettableFuture settableFutureCreate = SettableFuture.create();
        ((ByteStore) r2.io()).transact(null, new mfm(aspbVar), null, new mfn(settableFutureCreate));
        return ahcs.f(settableFutureCreate, new agbg(4), MoreExecutors.directExecutor());
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [awmd, java.lang.Object] */
    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        if (i != -1997309435) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '395487482'."));
        }
        RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(j, new afzk(17));
        agcl agclVar = this.b;
        asoz asozVar = (asoz) aihn.parseFrom(asoz.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        mfo mfoVar = new mfo(asozVar, runtimeStreamWriter);
        agev agevVar = (agev) agclVar.b;
        Subscription subscriptionSubscribeOnQueue = agevVar.g() ? ((ByteStore) agclVar.a.io()).subscribeOnQueue(asozVar.b, (TaskQueue) agevVar.c(), mfoVar) : ((ByteStore) agclVar.a.io()).subscribe(asozVar.b, mfoVar);
        if (subscriptionSubscribeOnQueue != null) {
            runtimeStreamWriter.a(new kjk(subscriptionSubscribeOnQueue, 3));
        }
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 1 || i == -764866051 || i == 77296450 || i == -1997309435 || i == 1862151975;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        byte[] bArrFindNoCopy;
        if (i != 1) {
            if (i == -764866051) {
                aspb aspbVar = (aspb) aihn.parseFrom(aspb.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
                ((ByteStore) this.b.a.io()).legacySet(aspbVar.c, (aspbVar.b & 2) != 0 ? aspbVar.d.G() : null);
                return aigv.a.toByteArray();
            }
            if (i == 1862151975) {
                return aifz.a(((ByteStore) this.b.a.io()).snapshot().contains(((asoz) aihn.parseFrom(asoz.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).b)).toByteArray();
            }
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '395487482'."));
        }
        asoz asozVar = (asoz) aihn.parseFrom(asoz.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        Snapshot snapshot = ((ByteStore) this.b.a.io()).snapshot();
        aihf aihfVarCreateBuilder = aspa.a.createBuilder();
        if (snapshot != null && (bArrFindNoCopy = snapshot.findNoCopy(asozVar.b)) != null) {
            aigj aigjVarV = aigj.v(bArrFindNoCopy);
            aihfVarCreateBuilder.copyOnWrite();
            aspa aspaVar = (aspa) aihfVarCreateBuilder.instance;
            aigjVarV.getClass();
            aspaVar.b |= 1;
            aspaVar.c = aigjVarV;
        }
        return ((aspa) aihfVarCreateBuilder.build()).toByteArray();
    }
}
