package defpackage;

import com.google.android.libraries.youtube.media.interfaces.MediaFetchController;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acom {
    public Object a;

    public acom(aunn aunnVar) {
        aunnVar.getClass();
    }

    public final aaiw a() {
        Object obj = this.a;
        if (obj != null) {
            return new aajd((aamo) obj, null);
        }
        throw new IllegalStateException("Missing required properties: offlineVideo");
    }

    public final void b(aamo aamoVar) {
        if (aamoVar == null) {
            throw new NullPointerException("Null offlineVideo");
        }
        this.a = aamoVar;
    }

    public final synchronized List c() {
        ArrayList bandwidthSamples;
        if (this.a == null) {
            return new ArrayList();
        }
        synchronized (zik.class) {
            try {
                bandwidthSamples = ((MediaFetchController) this.a).getBandwidthSamples();
            } catch (Throwable th) {
                throw th;
            }
        }
        return bandwidthSamples;
    }

    public final synchronized void d(MediaFetchController mediaFetchController) {
        this.a = mediaFetchController;
    }

    @tcc
    public final void handleReplaceEnclosingEvent(vvv vvvVar) {
        vvvVar.getClass();
        throw null;
    }

    @tcc
    public final void handleServiceResponseUndoEvent(wpy wpyVar) {
        wpyVar.getClass();
        throw null;
    }

    public acom() {
    }
}
