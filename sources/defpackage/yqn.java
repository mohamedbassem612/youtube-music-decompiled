package defpackage;

import com.google.android.libraries.youtube.media.interfaces.HttpRequest;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yqn {
    public final HttpRequest a;
    public final ListenableFuture b;
    public final boolean c;

    public yqn(HttpRequest httpRequest, ListenableFuture listenableFuture, boolean z) {
        this.a = httpRequest;
        this.b = listenableFuture;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yqn) {
            yqn yqnVar = (yqn) obj;
            HttpRequest httpRequest = this.a;
            if (httpRequest != null ? httpRequest.equals(yqnVar.a) : yqnVar.a == null) {
                ListenableFuture listenableFuture = this.b;
                if (listenableFuture != null ? listenableFuture.equals(yqnVar.b) : yqnVar.b == null) {
                    if (this.c == yqnVar.c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        HttpRequest httpRequest = this.a;
        int iHashCode = httpRequest == null ? 0 : httpRequest.hashCode();
        ListenableFuture listenableFuture = this.b;
        return ((((iHashCode ^ 1000003) * 1000003) ^ (listenableFuture != null ? listenableFuture.hashCode() : 0)) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        ListenableFuture listenableFuture = this.b;
        return "RequestData{platypusHttpRequest=" + String.valueOf(this.a) + ", dataSpecFuture=" + String.valueOf(listenableFuture) + ", authorityExists=" + this.c + '}';
    }

    public yqn() {
        throw null;
    }
}
