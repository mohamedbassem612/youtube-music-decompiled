package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qre extends qrz {
    public static final qrz a = new qre();

    @Override // defpackage.qrz
    public final String a() {
        return "multiproc";
    }

    @Override // defpackage.qrz
    public final /* synthetic */ qry b(qrm qrmVar, String str, Executor executor, ayq ayqVar) {
        ahno.F(false);
        return new qrg(str, ahng.n(qrmVar.a), new qsc(qrmVar.b, qrmVar.e ? ExtensionRegistryLite.getGeneratedRegistry() : ExtensionRegistryLite.a), executor, ayqVar, qrmVar.c, new afub());
    }
}
