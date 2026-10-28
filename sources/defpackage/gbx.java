package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gbx implements Callable {
    private final gbg a;
    private final fxg b;

    public gbx(gbg gbgVar, fxg fxgVar) {
        this.a = gbgVar;
        this.b = fxgVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws ExecutionException, InterruptedException {
        gbg gbgVar = this.a;
        if (gbgVar.d() != null) {
            gbgVar.d().get();
        }
        fxl fxlVarB = gbgVar.b();
        if (fxlVarB == null) {
            return null;
        }
        try {
            fxg fxgVar = this.b;
            synchronized (fxgVar) {
                try {
                    fxgVar.mergeFrom(fxlVarB.toByteArray(), ExtensionRegistryLite.a);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        } catch (aiik | NullPointerException unused) {
            return null;
        }
    }
}
