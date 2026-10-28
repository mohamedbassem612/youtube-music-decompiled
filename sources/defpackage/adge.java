package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.ComponentSharedResources;
import com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay;
import com.google.android.libraries.elements.interfaces.SubscriptionProcessorRegistrarUpb;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.runtime.ReaperThreadJniWrapper;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class adge implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ adge(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v22, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [awmd, java.lang.Object] */
    @Override // defpackage.agfr
    public final Object io() {
        switch (this.$cid) {
            case 0:
                return (ComponentSharedResources) this.a.io();
            case 1:
                return (ByteStore) this.a.io();
            case 2:
                return (opq) this.a.io();
            case 3:
                return (SubscriptionProcessorRegistrarUpb) this.a.io();
            case 4:
                return (UnifiedTemplateResolver) this.a.io();
            case 5:
                return (ReaperThreadJniWrapper) this.a.io();
            case 6:
                return (DirectUpdateDataRelay) this.a.io();
            case 7:
                return (ElementsServices) this.a.io();
            case 8:
                long jC = ((vxz) this.a).c(4, 45694088L, 0L);
                return Integer.valueOf(jC > 0 ? (int) jC : 30);
            case 9:
                return agke.q(this.a);
            case 10:
                File file = new File(((aeoo) this.a).a);
                return (file.exists() && file.canRead()) ? agke.p(file.listFiles(new zhi(2))) : agpi.a;
            case 11:
                return Double.valueOf(((vxz) this.a).b(2, 45417707L));
            default:
                return String.format("Node %s that was used to generate this set is no longer in the graph.", this.a);
        }
    }
}
