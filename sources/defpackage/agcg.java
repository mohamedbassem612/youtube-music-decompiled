package defpackage;

import com.google.android.libraries.blocks.runtime.Instance;
import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agcg extends Instance {
    public final Object a;

    public agcg() {
        this.a = new AtomicReference();
    }

    public final aspk a() {
        AtomicReference atomicReference = (AtomicReference) this.a;
        List list = (List) atomicReference.get();
        if (list == null || list.isEmpty()) {
            return aspk.a;
        }
        aihf aihfVarCreateBuilder = aspk.a.createBuilder();
        Iterable iterable = (Iterable) atomicReference.get();
        aihfVarCreateBuilder.copyOnWrite();
        aspk aspkVar = (aspk) aihfVarCreateBuilder.instance;
        aiie aiieVar = aspkVar.b;
        if (!aiieVar.c()) {
            aspkVar.b = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(iterable, aspkVar.b);
        return (aspk) aihfVarCreateBuilder.build();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aunn, java.lang.Object] */
    public final aihd b() {
        return aihd.a(((SecureRandom) this.a.io()).nextFloat());
    }

    public agcg(Object obj) {
        this.a = obj;
    }

    public agcg(aclk aclkVar) {
        this.a = aclkVar;
        System.identityHashCode(aclkVar);
    }
}
