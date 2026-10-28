package defpackage;

import io.grpc.Status;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avij extends avav {
    static final boolean a;
    public static final /* synthetic */ int b = 0;

    static {
        avbb avbbVar = avfp.a;
        a = auzn.a("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", false);
    }

    @Override // defpackage.avaj
    public final avat a(aval avalVar) {
        return a ? new avie(avalVar) : new avii(avalVar);
    }

    @Override // defpackage.avav
    public final avbp b(Map map) {
        try {
            Boolean boolG = avjt.g(map, "shuffleAddressList");
            return new avbp(a ? new avia(boolG) : new avig(boolG));
        } catch (RuntimeException e) {
            return new avbp(Status.m.c(e).withDescription("Failed parsing configuration for pick_first"));
        }
    }

    @Override // defpackage.avav
    public final String c() {
        return "pick_first";
    }

    @Override // defpackage.avav
    public final void d() {
    }

    @Override // defpackage.avav
    public final void e() {
    }
}
