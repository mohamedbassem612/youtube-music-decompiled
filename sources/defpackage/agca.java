package defpackage;

import com.google.android.libraries.blocks.runtime.ClientCreatorProxy;
import com.google.android.libraries.blocks.runtime.Instance;
import com.google.android.libraries.blocks.runtime.InstanceProxy;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agca extends Instance {
    public final may d;
    public final Map b = new HashMap();
    public final List c = new ArrayList();
    private final AtomicInteger e = new AtomicInteger(1);
    public final AtomicReference a = new AtomicReference();

    public agca(may mayVar) {
        this.d = mayVar;
    }

    public final synchronized aigj a(aspi aspiVar) {
        aigj aigjVar;
        int i = aspiVar.b;
        if (i == 1) {
            int iIntValue = ((Integer) aspiVar.c).intValue();
            List list = this.c;
            ahno.W(iIntValue, list.size());
            aigjVar = (aigj) this.b.get(list.get(iIntValue));
            aigjVar.getClass();
        } else {
            String str = i == 2 ? (String) aspiVar.c : "";
            Map map = this.b;
            if (!map.containsKey(str)) {
                throw new avcg(Status.f.withDescription("Element not found for key: ".concat(String.valueOf(str))));
            }
            aigjVar = (aigj) map.get(str);
        }
        return aigjVar;
    }

    public final aigv b(aigv aigvVar) {
        agcc agccVar = (agcc) this.a.get();
        if (agccVar != null) {
            InstanceProxy instanceProxyD = agccVar.d();
            agce agceVar = instanceProxyD instanceof agcd ? ((agcd) instanceProxyD).a : null;
            if (agceVar != null) {
                agceVar.a();
            } else {
                aigv aigvVar2 = aigv.a;
            }
        }
        return aigv.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000d, B:6:0x001b, B:8:0x0021), top: B:16:0x0003 }] */
    public final synchronized void c(List list, Integer num) {
        List list2;
        int i;
        if (num == null) {
            num = Integer.valueOf(this.c.size());
            list2 = this.c;
            ahno.X(num.intValue(), list2.size());
            for (i = 0; i < list.size(); i++) {
                int andIncrement = this.e.getAndIncrement();
                StringBuilder sb = new StringBuilder();
                sb.append('k');
                sb.append(andIncrement);
                String string = sb.toString();
                this.b.put(string, (aigj) list.get(i));
                list2.add(num.intValue() + i, string);
            }
        } else {
            list2 = this.c;
            ahno.X(num.intValue(), list2.size());
            while (i < list.size()) {
                int andIncrement2 = this.e.getAndIncrement();
                StringBuilder sb2 = new StringBuilder();
                sb2.append('k');
                sb2.append(andIncrement2);
                String string2 = sb2.toString();
                this.b.put(string2, (aigj) list.get(i));
                list2.add(num.intValue() + i, string2);
            }
        }
        throw th;
    }

    public final void d(asph asphVar, Integer num) {
        aspk aspkVarA;
        ClientCreatorProxy clientCreatorProxy = this.d.a;
        agcf agcfVar = new agcf(clientCreatorProxy.nativeCreateFromMovableRef(clientCreatorProxy.a, asphVar.b));
        try {
            aigv aigvVar = aigv.a;
            InstanceProxy instanceProxyD = agcfVar.d();
            agcg agcgVar = instanceProxyD instanceof agch ? ((agch) instanceProxyD).a : null;
            if (agcgVar != null) {
                aspkVarA = agcgVar.a();
            } else {
                aspk aspkVar = aspk.a;
                aspkVarA = (aspk) agcfVar.f(1224759830, aigvVar, aihn.getParserForClass(aspk.class));
            }
            c(aspkVarA.b, num);
            agcfVar.close();
        } catch (Throwable th) {
            try {
                agcfVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final synchronized aigv e() {
        this.c.clear();
        this.b.clear();
        return aigv.a;
    }

    public final synchronized aspl f() {
        aihf aihfVarCreateBuilder;
        aihfVarCreateBuilder = aspl.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aspl asplVar = (aspl) aihfVarCreateBuilder.instance;
        aiie aiieVar = asplVar.b;
        if (!aiieVar.c()) {
            asplVar.b = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(this.c, asplVar.b);
        return (aspl) aihfVarCreateBuilder.build();
    }

    public final synchronized aijq g() {
        return aijq.a(this.c.size());
    }
}
