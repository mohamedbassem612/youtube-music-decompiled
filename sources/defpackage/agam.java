package defpackage;

import com.google.android.libraries.blocks.StatusException;
import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agam extends InstanceProxy {
    public final aamo a;

    public agam(aamo aamoVar) {
        this.a = aamoVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '379736582'."));
    }

    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        if (i != 1772744894) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '379736582'."));
        }
        RuntimeStreamWriter runtimeStreamWriter = new RuntimeStreamWriter(j, new afzk(5));
        aamo aamoVar = this.a;
        asgj asgjVar = (asgj) aihn.parseFrom(asgj.b, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        agkz agkzVarN = agkz.n(new aihx(asgjVar.d, asgj.a));
        if (agkzVarN.contains(asgh.CUE_RANGE_EVENT_TYPE_UNKNOWN)) {
            runtimeStreamWriter.c(new StatusException(ahxw.INVALID_ARGUMENT, "Invalid cue range event filter (CUE_RANGE_EVENT_TYPE_UNKNOWN)"));
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = asgjVar.c.iterator();
            while (it.hasNext()) {
                abac abacVar = new abac((asgf) it.next(), agkzVarN, runtimeStreamWriter, aamoVar.a);
                arrayList.add(abacVar);
                if (!((abmt) aamoVar.b).bS()) {
                    Object obj = aamoVar.e;
                    if (abacVar.o(((acga) obj).a())) {
                        abacVar.a(((acga) obj).u(), false, false);
                    }
                }
            }
            ((acga) aamoVar.e).h(arrayList);
            if (!((abmt) aamoVar.b).bj()) {
                aamoVar.c.add(runtimeStreamWriter);
                runtimeStreamWriter.a(new hrr(aamoVar, (List) arrayList, (mbb) runtimeStreamWriter, 16));
            } else {
                ?? r1 = aamoVar.d;
                r1.put(runtimeStreamWriter, arrayList);
                runtimeStreamWriter.a(new hrr((Object) r1, runtimeStreamWriter, aamoVar.e, 15, (char[]) null));
            }
        } catch (IllegalArgumentException e) {
            runtimeStreamWriter.c(new StatusException(ahxw.INVALID_ARGUMENT, "Invalid cue range (start time > end time, or empty cue range)", e.getStackTrace(), null, null));
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((acga) aamoVar.e).n((abac) arrayList.get(i2));
            }
        }
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 1772744894;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '379736582'."));
    }
}
