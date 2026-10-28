package defpackage;

import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.interfaces.BlockDataSourceDelegateFactory;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.DataSourceDelegate;
import com.google.android.libraries.elements.interfaces.ElementsDataSourceDelegateFactory;
import com.google.android.libraries.elements.interfaces.Fetcher;
import com.google.android.libraries.elements.interfaces.FetcherFactory;
import com.google.android.libraries.elements.interfaces.FetcherProvider;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class orj extends FetcherProvider {
    private final org a;
    private final Set b;
    private volatile Map c = new HashMap();
    private volatile Map d = new HashMap();
    private final kjc e;

    public orj(org orgVar, Set set, kjc kjcVar) {
        this.a = orgVar;
        this.b = set;
        this.e = kjcVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [aunn, java.lang.Object] */
    public final orf a(ElementsServices elementsServices, atba atbaVar, String str, oph ophVar) {
        StatusOr delegate;
        DataSourceDelegate dataSourceDelegate;
        DataSourceDelegate dataSourceDelegate2;
        agev agevVarI;
        agev agevVarI2;
        if (str == null) {
            return null;
        }
        if (atbaVar.g == null && (Memory.peekByte(atbaVar.c + 8) & 1) == 0) {
            return null;
        }
        try {
            byte[] bArrF = atbaVar.aU().f();
            org orgVar = this.a;
            mew mewVarAU = atbaVar.aU();
            if (mewVarAU.e(atgk.d)) {
                StatusOr delegate2 = ElementsDataSourceDelegateFactory.getDelegate(bArrF, orgVar, (ByteStore) elementsServices.p().io(), str, this, true);
                if (delegate2.hasValue) {
                    dataSourceDelegate = (DataSourceDelegate) delegate2.value;
                    dataSourceDelegate2 = dataSourceDelegate;
                } else {
                    dataSourceDelegate2 = null;
                }
            } else {
                kjc kjcVar = this.e;
                mep mepVar = aszm.d;
                if (mepVar != null && mewVarAU.e(mepVar)) {
                    aszm aszmVar = (aszm) mewVarAU.d(mepVar);
                    aspr asprVar = aszmVar.e;
                    long j = aszmVar.c + 8;
                    if ((Memory.peekByte(j) & 1) == 0 && (Memory.peekByte(j) & 2) == 0) {
                        delegate = StatusOr.fromStatus(Status.i.withDescription("BlockDataSourceConfig without CollectionDataBlockWeakRef or CollectionDataBlockKey."));
                    } else {
                        agfr agfrVar = ophVar.h;
                        delegate = BlockDataSourceDelegateFactory.getDelegate((Container) kjcVar.a.io(), orgVar, aszmVar.f(), null, agfrVar != null ? new ore(agfrVar) : null, false);
                    }
                    if (delegate.hasValue) {
                        dataSourceDelegate = (DataSourceDelegate) delegate.value;
                        dataSourceDelegate2 = dataSourceDelegate;
                    }
                }
                dataSourceDelegate2 = null;
            }
            if (dataSourceDelegate2 == null) {
                return null;
            }
            if (atbaVar.d == null && (Memory.peekByte(atbaVar.c + 8) & 2) == 0) {
                agevVarI = agdf.a;
            } else {
                if (atbaVar.d == null && (Memory.peekByte(atbaVar.c + 8) & 2) != 0) {
                    atbaVar.d = new atkv(atbaVar.cp(true != atba.a ? 16 : 24, atku.a));
                }
                agevVarI = agev.i(atbaVar.d == null ? atkt.a : atbaVar.d);
            }
            agev agevVar = agevVarI;
            agev agevVarI3 = atbaVar.aR() ? agev.i(atbaVar.aT()) : agdf.a;
            if (atbaVar.aS()) {
                if (atbaVar.f == null && (Memory.peekByte(atbaVar.c + 8) & 8) != 0) {
                    atbaVar.f = new atla(atbaVar.cp(true == atba.a ? 40 : 24, atkz.a));
                }
                agevVarI2 = agev.i(atbaVar.f == null ? atky.a : atbaVar.f);
            } else {
                agevVarI2 = agdf.a;
            }
            orf orfVar = new orf(dataSourceDelegate2, orgVar, agevVar, agevVarI3, agevVarI2);
            if (orfVar.identifiers().isEmpty() && orfVar.b >= 0) {
                mew mewVar = orfVar.g;
                if (mewVar != null) {
                    elementsServices.l().d(mewVar, ors.b().a());
                } else {
                    orfVar.loadMore();
                }
            }
            return orfVar;
        } catch (IllegalStateException | UnsupportedOperationException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007b A[Catch: all -> 0x00bb, TryCatch #0 {, blocks: (B:7:0x0014, B:9:0x001e, B:10:0x0022, B:12:0x0025, B:14:0x002d, B:16:0x0035, B:17:0x0041, B:19:0x0043, B:20:0x004e, B:22:0x0054, B:23:0x006d, B:24:0x006f, B:26:0x007b, B:32:0x00b6, B:27:0x008c, B:29:0x009f, B:31:0x00a3), top: B:39:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x008c A[Catch: all -> 0x00bb, TryCatch #0 {, blocks: (B:7:0x0014, B:9:0x001e, B:10:0x0022, B:12:0x0025, B:14:0x002d, B:16:0x0035, B:17:0x0041, B:19:0x0043, B:20:0x004e, B:22:0x0054, B:23:0x006d, B:24:0x006f, B:26:0x007b, B:32:0x00b6, B:27:0x008c, B:29:0x009f, B:31:0x00a3), top: B:39:0x0014 }] */
    @Override // com.google.android.libraries.elements.interfaces.FetcherProvider
    public final StatusOr getFetcher(int i, byte[] bArr) {
        Map map;
        Integer numValueOf;
        StatusOr statusOrCreate;
        Map map2 = this.c;
        Integer numValueOf2 = Integer.valueOf(i);
        Fetcher fetcher = (Fetcher) map2.get(numValueOf2);
        if (fetcher != null) {
            return StatusOr.fromValue(fetcher);
        }
        synchronized (this) {
            Fetcher fetcher2 = (Fetcher) this.c.get(numValueOf2);
            if (fetcher2 != null) {
                statusOrCreate = StatusOr.fromValue(fetcher2);
            } else if (this.d.isEmpty()) {
                Set set = this.b;
                if (set.isEmpty()) {
                    statusOrCreate = StatusOr.fromStatus(Status.l.withDescription("No fetcher factory provided."));
                } else {
                    HashMap map3 = new HashMap();
                    agqr it = ((agpr) set).iterator();
                    while (it.hasNext()) {
                        orh orhVar = (orh) it.next();
                        map3.put(Integer.valueOf(orhVar.a().a), new ori(orhVar));
                    }
                    this.d = map3;
                    map = this.d;
                    numValueOf = Integer.valueOf(i);
                    if (map.containsKey(numValueOf)) {
                        FetcherFactory fetcherFactory = (FetcherFactory) this.d.get(numValueOf);
                        fetcherFactory.getClass();
                        statusOrCreate = fetcherFactory.create(i, bArr);
                        if (statusOrCreate.hasValue && statusOrCreate.value != null) {
                            HashMap map4 = new HashMap(this.c);
                            Fetcher fetcher3 = (Fetcher) statusOrCreate.value;
                            fetcher3.getClass();
                            map4.put(numValueOf, fetcher3);
                            this.c = map4;
                        }
                    } else {
                        statusOrCreate = StatusOr.fromStatus(Status.l.withDescription(a.bR(i, "Fetcher factory not found for extension number: ")));
                    }
                }
            } else {
                map = this.d;
                numValueOf = Integer.valueOf(i);
                if (map.containsKey(numValueOf)) {
                    statusOrCreate = StatusOr.fromStatus(Status.l.withDescription(a.bR(i, "Fetcher factory not found for extension number: ")));
                } else {
                    FetcherFactory fetcherFactory2 = (FetcherFactory) this.d.get(numValueOf);
                    fetcherFactory2.getClass();
                    statusOrCreate = fetcherFactory2.create(i, bArr);
                    if (statusOrCreate.hasValue) {
                        HashMap map5 = new HashMap(this.c);
                        Fetcher fetcher4 = (Fetcher) statusOrCreate.value;
                        fetcher4.getClass();
                        map5.put(numValueOf, fetcher4);
                        this.c = map5;
                    }
                }
            }
        }
        return statusOrCreate;
    }
}
