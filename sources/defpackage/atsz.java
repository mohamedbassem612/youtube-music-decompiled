package defpackage;

import com.google.research.xeno.effect.CapabilitiesManifest;
import com.google.research.xeno.effect.Effect;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atsz implements atvz {
    final /* synthetic */ atta a;
    final /* synthetic */ ExecutorService b;
    final /* synthetic */ CapabilitiesManifest c;
    final /* synthetic */ atso d;
    final /* synthetic */ String e;

    public atsz(atta attaVar, ExecutorService executorService, CapabilitiesManifest capabilitiesManifest, atso atsoVar, String str) {
        this.a = attaVar;
        this.b = executorService;
        this.c = capabilitiesManifest;
        this.d = atsoVar;
        this.e = str;
    }

    @Override // defpackage.atvz
    public final void a(final long j) {
        if (j == 0) {
            Effect.c(this.a, null, "RemoteAssetManager failed to natively load", this.b);
            return;
        }
        CapabilitiesManifest capabilitiesManifest = this.c;
        final atso atsoVar = this.d;
        final String str = this.e;
        final atta attaVar = this.a;
        final ExecutorService executorService = this.b;
        capabilitiesManifest.iD(new atvh() { // from class: atsx
            @Override // defpackage.atvh
            public final void a(long j2) {
                Effect.nativeLoadCapabilityWithRemoteAssetManager(atsoVar.toByteArray(), j, j2, str, new atsy(attaVar, executorService, 0));
            }
        });
    }
}
