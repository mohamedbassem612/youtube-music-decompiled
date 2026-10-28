package defpackage;

import android.graphics.SurfaceTexture;
import com.google.vr.cardboard.ExternalSurfaceManager;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class aujb implements aujg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ExternalSurfaceManager a;

    public /* synthetic */ aujb(ExternalSurfaceManager externalSurfaceManager, int i) {
        this.$cid = i;
        this.a = externalSurfaceManager;
    }

    @Override // defpackage.aujg
    public final void a(auje aujeVar) {
        if (this.$cid == 0) {
            if (!aujeVar.i || aujeVar.d.getAndSet(0) <= 0) {
                return;
            }
            ExternalSurfaceManager externalSurfaceManager = this.a;
            aujeVar.g.updateTexImage();
            SurfaceTexture surfaceTexture = aujeVar.g;
            float[] fArr = aujeVar.c;
            surfaceTexture.getTransformMatrix(fArr);
            long timestamp = aujeVar.g.getTimestamp();
            externalSurfaceManager.a.a(aujeVar.a, aujeVar.f[0], timestamp, fArr);
            return;
        }
        if (aujeVar.i) {
            AtomicInteger atomicInteger = aujeVar.d;
            if (atomicInteger.get() > 0) {
                ExternalSurfaceManager externalSurfaceManager2 = this.a;
                atomicInteger.decrementAndGet();
                aujeVar.g.updateTexImage();
                SurfaceTexture surfaceTexture2 = aujeVar.g;
                float[] fArr2 = aujeVar.c;
                surfaceTexture2.getTransformMatrix(fArr2);
                long timestamp2 = aujeVar.g.getTimestamp();
                externalSurfaceManager2.a.a(aujeVar.a, aujeVar.f[0], timestamp2, fArr2);
            }
        }
    }
}
