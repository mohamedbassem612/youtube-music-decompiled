package j$.nio.channels;

import java.nio.channels.CompletionHandler;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements f {
    public final /* synthetic */ CompletionHandler a;

    public /* synthetic */ d(CompletionHandler completionHandler) {
        this.a = completionHandler;
    }

    public static /* synthetic */ f b(CompletionHandler completionHandler) {
        if (completionHandler == null) {
            return null;
        }
        return completionHandler instanceof e ? ((e) completionHandler).a : new d(completionHandler);
    }

    public final /* synthetic */ void a(Object obj, Object obj2) {
        this.a.completed(obj, obj2);
    }

    public final /* synthetic */ void c(Throwable th, Object obj) {
        this.a.failed(th, obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        CompletionHandler completionHandler = this.a;
        if (obj instanceof d) {
            obj = ((d) obj).a;
        }
        return completionHandler.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
