package defpackage;

import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.interfaces.BlockDataSourceDelegateFactory;
import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.DataSourceDelegate;
import com.google.android.libraries.elements.interfaces.ElementsDataSourceDelegateFactory;
import com.google.android.libraries.elements.interfaces.Fetcher;
import com.google.android.libraries.elements.interfaces.FetcherFactory;
import com.google.android.libraries.elements.interfaces.FetcherProvider;
import com.google.protobuf.ExtensionRegistryLite;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mnc extends FetcherProvider {
    public final nuc a;
    public final tld b;
    private final awmd c;
    private final agev d;
    private final Set e;
    private final ExtensionRegistryLite f;
    private final awmd g;
    private volatile Map h = new HashMap();
    private volatile Map i = new HashMap();
    private final elr j;

    public mnc(awmd awmdVar, nuc nucVar, elr elrVar, tld tldVar, agev agevVar, Set set, ExtensionRegistryLite extensionRegistryLite, awmd awmdVar2) {
        this.c = awmdVar;
        this.a = nucVar;
        this.j = elrVar;
        this.b = tldVar;
        this.d = agevVar;
        this.e = set;
        this.f = extensionRegistryLite;
        this.g = awmdVar2;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [awmd, java.lang.Object] */
    public final nro a(myr myrVar, nsl nslVar, String str) {
        mnc mncVar;
        nsl nslVar2;
        DataSourceDelegate dataSourceDelegate;
        String str2;
        BlockRegistryProvider blockRegistryProvider;
        StatusOr delegate;
        if (str == null) {
            this.a.c(aslh.LOG_TYPE_CONFIGURATION_ERROR, nslVar, "Unique collection key is required", new Object[0]);
            return null;
        }
        if (!myrVar.l()) {
            this.a.c(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar, "Failed to write data source config to byte arra.", new Object[0]);
            return null;
        }
        try {
            byte[] bArrF = myrVar.g().f();
            mna mnaVar = (mna) this.c.io();
            try {
                asmf asmfVar = (asmf) aihn.parseFrom(asmf.a, bArrF, this.f);
                agqr it = ((agqj) this.e).iterator();
                while (true) {
                    if (it.hasNext()) {
                        elr elrVar = (elr) it.next();
                        aihl aihlVar = askx.b;
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                        asmfVar.c(aihlVarCheckIsLite);
                        if (asmfVar.j.n(aihlVarCheckIsLite.d)) {
                            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                            asmfVar.c(aihlVarCheckIsLite2);
                            Object objK = asmfVar.j.k(aihlVarCheckIsLite2.d);
                            askx askxVar = (askx) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                            int i = askxVar.c;
                            if ((i & 1) == 0 && (i & 2) == 0) {
                                delegate = StatusOr.fromStatus(Status.i.withDescription("BlockDataSourceConfig without CollectionDataBlockWeakRef or CollectionDataBlockKey."));
                            } else {
                                if (nslVar != null) {
                                    str2 = nslVar.G;
                                    blockRegistryProvider = nslVar.H;
                                } else {
                                    str2 = null;
                                    blockRegistryProvider = null;
                                }
                                delegate = BlockDataSourceDelegateFactory.getDelegate((Container) elrVar.a.io(), mnaVar, askxVar.toByteArray(), str2, blockRegistryProvider, false);
                                mnaVar = mnaVar;
                            }
                            if (delegate.hasValue) {
                                dataSourceDelegate = (DataSourceDelegate) delegate.value;
                                mncVar = this;
                            } else {
                                aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                                aslh aslhVar = aslh.LOG_TYPE_INTERNAL_ERROR;
                                aihfVarCreateBuilder.copyOnWrite();
                                asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
                                asncVar.d = aslhVar.I;
                                asncVar.b |= 2;
                                aihfVarCreateBuilder.cC(aihlVar.a());
                                this.a.g((asnc) aihfVarCreateBuilder.build(), nslVar, delegate.status.asException(), "Error getting DataSourceDelegate from DataSourceDelegateFactory.", new Object[0]);
                                mncVar = this;
                                dataSourceDelegate = null;
                            }
                        }
                    } else {
                        StatusOr delegate2 = ElementsDataSourceDelegateFactory.getDelegate(bArrF, mnaVar, (ByteStore) ((agfa) this.d).a.io(), str, this, true);
                        mncVar = this;
                        if (delegate2.hasValue) {
                            nslVar2 = nslVar;
                            Object obj = delegate2.value;
                            if (obj == null) {
                                mncVar.a.c(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar2, "Received null DataSourceDelegate from JNI.", new Object[0]);
                                nslVar = nslVar2;
                                dataSourceDelegate = null;
                            } else {
                                nslVar = nslVar2;
                                dataSourceDelegate = (DataSourceDelegate) obj;
                            }
                        } else {
                            mncVar.a.f(aslh.LOG_TYPE_CONFIGURATION_ERROR, nslVar, delegate2.status.asException(), "Error getting DataSourceDelegate from JNI", new Object[0]);
                            dataSourceDelegate = null;
                        }
                    }
                    if (dataSourceDelegate == null) {
                        return null;
                    }
                    elr elrVar2 = mncVar.j;
                    agev agevVarI = myrVar.o() ? agev.i(myrVar.j()) : agdf.a;
                    agev agevVarI2 = myrVar.m() ? agev.i(myrVar.h()) : agdf.a;
                    agev agevVarI3 = myrVar.p() ? agev.i(myrVar.k()) : agdf.a;
                    agev agevVarI4 = myrVar.n() ? agev.i(myrVar.i()) : agdf.a;
                    mna mnaVar2 = mnaVar;
                    omj omjVar = (omj) elrVar2.a.io();
                    omjVar.getClass();
                    nslVar.getClass();
                    mnaVar2.getClass();
                    return new nro(omjVar, nslVar, dataSourceDelegate, mnaVar2, agevVarI, agevVarI2, agevVarI3, agevVarI4);
                }
            } catch (aiik unused) {
                mncVar = this;
                nslVar2 = nslVar;
                mncVar.a.c(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar2, "Error parsing DataSourceConfig bytes.", new Object[0]);
            }
        } catch (IllegalStateException | UnsupportedOperationException unused2) {
            this.a.c(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar, "Failed to write data source config to byte array.", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0084 A[Catch: all -> 0x00c4, TryCatch #0 {, blocks: (B:7:0x0014, B:9:0x001e, B:10:0x0022, B:12:0x0025, B:14:0x002d, B:16:0x0037, B:18:0x003d, B:19:0x0046, B:21:0x004c, B:22:0x0067, B:23:0x006a, B:24:0x0076, B:26:0x0078, B:28:0x0084, B:34:0x00bf, B:29:0x0095, B:31:0x00a8, B:33:0x00ac), top: B:41:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0095 A[Catch: all -> 0x00c4, TryCatch #0 {, blocks: (B:7:0x0014, B:9:0x001e, B:10:0x0022, B:12:0x0025, B:14:0x002d, B:16:0x0037, B:18:0x003d, B:19:0x0046, B:21:0x004c, B:22:0x0067, B:23:0x006a, B:24:0x0076, B:26:0x0078, B:28:0x0084, B:34:0x00bf, B:29:0x0095, B:31:0x00a8, B:33:0x00ac), top: B:41:0x0014 }] */
    @Override // com.google.android.libraries.elements.interfaces.FetcherProvider
    public final StatusOr getFetcher(int i, byte[] bArr) {
        Map map;
        Integer numValueOf;
        StatusOr statusOrCreate;
        Map map2 = this.i;
        Integer numValueOf2 = Integer.valueOf(i);
        Fetcher fetcher = (Fetcher) map2.get(numValueOf2);
        if (fetcher != null) {
            return StatusOr.fromValue(fetcher);
        }
        synchronized (this) {
            Fetcher fetcher2 = (Fetcher) this.i.get(numValueOf2);
            if (fetcher2 != null) {
                statusOrCreate = StatusOr.fromValue(fetcher2);
            } else if (this.h.isEmpty()) {
                Set<nsn> set = (Set) ((aupo) this.g).b;
                if (set == null || set.isEmpty()) {
                    statusOrCreate = StatusOr.fromStatus(Status.l.withDescription("No fetcher factory provided."));
                } else {
                    HashMap map3 = new HashMap();
                    for (nsn nsnVar : set) {
                        map3.put(Integer.valueOf(nsnVar.a().a()), new mnb(this, nsnVar));
                    }
                    this.h = map3;
                    map = this.h;
                    numValueOf = Integer.valueOf(i);
                    if (map.containsKey(numValueOf)) {
                        FetcherFactory fetcherFactory = (FetcherFactory) this.h.get(numValueOf);
                        fetcherFactory.getClass();
                        statusOrCreate = fetcherFactory.create(i, bArr);
                        if (statusOrCreate.hasValue) {
                            HashMap map4 = new HashMap(this.i);
                            Fetcher fetcher3 = (Fetcher) statusOrCreate.value;
                            fetcher3.getClass();
                            map4.put(numValueOf, fetcher3);
                            this.i = map4;
                        }
                    } else {
                        statusOrCreate = StatusOr.fromStatus(Status.l.withDescription(a.bR(i, "Fetcher factory not found for extension number: ")));
                    }
                }
            } else {
                map = this.h;
                numValueOf = Integer.valueOf(i);
                if (map.containsKey(numValueOf)) {
                    statusOrCreate = StatusOr.fromStatus(Status.l.withDescription(a.bR(i, "Fetcher factory not found for extension number: ")));
                } else {
                    FetcherFactory fetcherFactory2 = (FetcherFactory) this.h.get(numValueOf);
                    fetcherFactory2.getClass();
                    statusOrCreate = fetcherFactory2.create(i, bArr);
                    if (statusOrCreate.hasValue && statusOrCreate.value != null) {
                        HashMap map5 = new HashMap(this.i);
                        Fetcher fetcher4 = (Fetcher) statusOrCreate.value;
                        fetcher4.getClass();
                        map5.put(numValueOf, fetcher4);
                        this.i = map5;
                    }
                }
            }
        }
        return statusOrCreate;
    }
}
