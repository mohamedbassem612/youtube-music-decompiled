package defpackage;

import com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mnn implements nwm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ mnn(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, nuc] */
    @Override // defpackage.nwm
    public final Object a() {
        Object heeVar;
        int i = this.$cid;
        if (i == 0) {
            heeVar = new hee(this.a, null);
        } else {
            if (i != 1) {
                return ((UnifiedTemplateResolver) this.a).jni_getTemplateResolver();
            }
            meg.a();
            heeVar = DirectUpdateDataRelay.create();
            if (heeVar == null) {
                this.a.c(aslh.LOG_TYPE_INTERNAL_ERROR, nsl.a, "Failed to create DirectUpdateDataRelay", new Object[0]);
                return new mnf();
            }
        }
        return heeVar;
    }
}
