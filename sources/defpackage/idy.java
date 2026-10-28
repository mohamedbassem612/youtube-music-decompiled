package defpackage;

import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class idy {
    private static final agrf i = agrf.h("com/google/android/apps/youtube/music/player/queue/persistence/QueueHydrationControllerImpl");
    public final aunn a;
    public final abvn b;
    public final idr c;
    public final aunn d;
    public avmn e;
    public avmn f;
    public boolean g;
    public final wjr h;
    private final Optional j;
    private final Executor k;

    public idy(aunn aunnVar, abvn abvnVar, idr idrVar, Optional optional, wjr wjrVar, aunn aunnVar2, Executor executor) {
        this.a = aunnVar;
        this.b = abvnVar;
        this.c = idrVar;
        this.j = optional;
        this.h = wjrVar;
        this.d = aunnVar2;
        this.k = executor;
        agrx agrxVar = agso.a;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [aunn, java.lang.Object] */
    public final StatusOr a(byte[] bArr) {
        byte[] bArr2;
        Optional optional = this.j;
        if (optional.isEmpty()) {
            return StatusOr.fromStatus(Status.i);
        }
        StatusOr statusOrRehydrateResponse = ((adak) optional.get().io()).b().rehydrateResponse(bArr);
        if (statusOrRehydrateResponse.hasValue && (bArr2 = (byte[]) statusOrRehydrateResponse.value) != null) {
            return StatusOr.fromValue(bArr2);
        }
        ((agrc) ((agrc) ((agrc) i.b().i(agso.a, "QueueHydrationCtlr")).l(agsi.LARGE)).k("com/google/android/apps/youtube/music/player/queue/persistence/QueueHydrationControllerImpl", "rehydrateResponse", 154, "QueueHydrationControllerImpl.java")).t("Hydration has failed.");
        return StatusOr.fromStatus(Status.l);
    }

    public final void b(amae amaeVar) {
        if (amaeVar != null) {
            boolean z = (amaeVar.b & 4) != 0;
            aouj aoujVarAb = fhz.ab(amaeVar);
            StatusOr statusOrA = a(amaeVar.toByteArray());
            if (statusOrA.hasValue) {
                if (z || aoujVarAb != null) {
                    idr idrVar = this.c;
                    byte[] bArr = (byte[]) statusOrA.value;
                    bArr.getClass();
                    idrVar.r(aigj.v(bArr));
                    if (z) {
                        return;
                    }
                }
                Executor executor = this.k;
                byte[] bArr2 = (byte[]) statusOrA.value;
                bArr2.getClass();
                executor.execute(afwl.i(new hhy(this, aigj.v(bArr2), 7)));
            }
        }
    }
}
