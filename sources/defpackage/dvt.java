package defpackage;

import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebStorageBoundaryInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dvt implements WebStorageBoundaryInterface {
    final WebStorageBoundaryInterface a;

    public dvt(WebStorageBoundaryInterface webStorageBoundaryInterface) {
        this.a = webStorageBoundaryInterface;
    }

    @Override // org.chromium.support_lib_boundary.WebStorageBoundaryInterface
    public final void deleteBrowsingData(Executor executor, Runnable runnable) {
        this.a.deleteBrowsingData(executor, runnable);
    }

    @Override // org.chromium.support_lib_boundary.WebStorageBoundaryInterface
    public final String deleteBrowsingDataForSite(String str, Executor executor, Runnable runnable) {
        return this.a.deleteBrowsingDataForSite(str, executor, runnable);
    }
}
