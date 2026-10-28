package defpackage;

import com.google.android.libraries.blocks.runtime.Instance;
import com.google.android.libraries.blocks.runtime.RuntimeSignal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afzh extends Instance {
    private final RuntimeSignal a;

    public afzh(may mayVar) {
        asdp asdpVar = asdp.a;
        aihn.getParserForClass(asdp.class);
        RuntimeSignal runtimeSignal = new RuntimeSignal(2114090927, mayVar.a);
        runtimeSignal.b(asdpVar);
        this.a = runtimeSignal;
    }

    public final aigv a(asdq asdqVar) {
        asdp asdpVar = asdqVar.c;
        if (asdpVar == null) {
            asdpVar = asdp.a;
        }
        this.a.b(asdpVar);
        return aigv.a;
    }
}
