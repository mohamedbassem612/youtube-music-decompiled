package com.google.android.libraries.youtube.media.player.exo2.platypus;

import com.google.android.apps.youtube.proto.streaming.SelectableFormatsOuterClass$SelectableFormats;
import com.google.android.libraries.youtube.media.interfaces.LiveMetadataCompatibilityRequirements;
import com.google.android.libraries.youtube.media.interfaces.OnesieResponseParams;
import com.google.android.libraries.youtube.media.interfaces.OnesieVideoData;
import com.google.android.libraries.youtube.media.interfaces.PlaybackController;
import com.google.android.libraries.youtube.media.interfaces.PlayerResponseCompatibilityRequirements;
import com.google.android.libraries.youtube.media.interfaces.Time;
import com.google.android.libraries.youtube.media.player.exo2.platypus.event.PlatypusException;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.BufferManagerImpl;
import defpackage.agke;
import defpackage.axo;
import defpackage.zcf;
import defpackage.zhq;
import defpackage.zhz;
import defpackage.zik;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class PlatypusOnesieVideoDataMediaFetchIntegration implements OnesieMediaFetchIntegration {
    private final OnesieVideoData a;
    private final BufferManagerImpl b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public PlatypusOnesieVideoDataMediaFetchIntegration(OnesieVideoData onesieVideoData, BufferManagerImpl bufferManagerImpl) {
        this.a = onesieVideoData;
        this.b = bufferManagerImpl;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.OnesieMediaFetchIntegration
    public final SelectableFormatsOuterClass$SelectableFormats a(String str) {
        SelectableFormatsOuterClass$SelectableFormats selectableFormats;
        synchronized (zik.class) {
            selectableFormats = this.a.getSelectableFormats();
        }
        return selectableFormats;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.OnesieMediaFetchIntegration
    public final OnesieResponseParams b() {
        boolean zIsOnesieActive;
        synchronized (zik.class) {
            zIsOnesieActive = this.a.isOnesieActive();
        }
        return new OnesieResponseParams(zIsOnesieActive, null);
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.OnesieMediaFetchIntegration
    public final BufferManagerImpl c() {
        if (this.c.get() || this.a.isDisposed()) {
            return null;
        }
        return this.b;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.OnesieMediaFetchIntegration
    public final void d() {
        synchronized (zik.class) {
            this.a.dispose();
        }
        this.c.set(true);
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.OnesieMediaFetchIntegration
    public final void e(final PlaybackControllerWrapper playbackControllerWrapper, PlaybackController playbackController) {
        synchronized (zik.class) {
            BufferManagerImpl bufferManagerImpl = this.b;
            if (bufferManagerImpl != null) {
                bufferManagerImpl.j(new axo() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.PlatypusOnesieVideoDataMediaFetchIntegration$$ExternalSyntheticLambda0
                    @Override // defpackage.axo
                    public final void accept(Object obj) {
                        playbackControllerWrapper.k((PlatypusException) obj);
                    }
                });
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.OnesieMediaFetchIntegration
    public final void f() {
        d();
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.OnesieMediaFetchIntegration
    public final boolean g(String str, long j, agke agkeVar, boolean z, boolean z2, String str2, int i, boolean z3, boolean z4) {
        Time time;
        boolean zIsCompatibleWithPlayerResponse;
        LiveMetadataCompatibilityRequirements liveMetadataCompatibilityRequirements = new LiveMetadataCompatibilityRequirements(z, z2, str2, i);
        ArrayList arrayList = new ArrayList(agkeVar);
        if (j == -2) {
            time = z3 ? Time.b : Time.a;
        } else {
            time = new Time(j, 1000L);
        }
        PlayerResponseCompatibilityRequirements playerResponseCompatibilityRequirements = new PlayerResponseCompatibilityRequirements(arrayList, time, liveMetadataCompatibilityRequirements, z4);
        synchronized (zik.class) {
            zIsCompatibleWithPlayerResponse = this.a.isCompatibleWithPlayerResponse(playerResponseCompatibilityRequirements);
        }
        return zIsCompatibleWithPlayerResponse;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.OnesieMediaFetchIntegration
    public final void i(zcf zcfVar) {
        boolean zK;
        BufferManagerImpl bufferManagerImpl = this.b;
        if (bufferManagerImpl != null) {
            long jA = zcfVar.a();
            long j = zcfVar.A.h * 1000;
            synchronized (zik.class) {
                zK = bufferManagerImpl.k(zcfVar.a, jA, j, zcfVar.aa, zcfVar.c, zcfVar.y.aD(), zcfVar.y.R(), zcfVar.A.E());
                if (!zK) {
                    d();
                }
            }
            if (zK) {
                zhq zhqVar = zhq.ABR;
            } else {
                zcfVar.Z.k(new zhz("onesie.ignored", zcfVar.g));
            }
        }
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.OnesieMediaFetchIntegration
    public final void h() {
    }
}
