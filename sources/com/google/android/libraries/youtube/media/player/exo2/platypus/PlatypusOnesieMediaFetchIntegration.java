package com.google.android.libraries.youtube.media.player.exo2.platypus;

import com.google.android.apps.youtube.proto.streaming.SelectableFormatsOuterClass$SelectableFormats;
import com.google.android.libraries.youtube.media.interfaces.LiveMetadataCompatibilityRequirements;
import com.google.android.libraries.youtube.media.interfaces.OnesieResponseParams;
import com.google.android.libraries.youtube.media.interfaces.OnesieResponseSelector;
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
public class PlatypusOnesieMediaFetchIntegration implements OnesieMediaFetchIntegration {
    private final OnesieResponseSelector a;
    private final BufferManagerImpl b;
    private final String c;
    private final AtomicBoolean d = new AtomicBoolean(false);

    public PlatypusOnesieMediaFetchIntegration(OnesieResponseSelector onesieResponseSelector, BufferManagerImpl bufferManagerImpl, String str) {
        this.a = onesieResponseSelector;
        this.b = bufferManagerImpl;
        this.c = str;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.OnesieMediaFetchIntegration
    public final SelectableFormatsOuterClass$SelectableFormats a(String str) {
        SelectableFormatsOuterClass$SelectableFormats selectableFormats;
        synchronized (zik.class) {
            selectableFormats = this.a.getSelectableFormats(str);
        }
        return selectableFormats;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.OnesieMediaFetchIntegration
    public final OnesieResponseParams b() {
        boolean zIsOnesieActiveForPlaybackControllerCreation;
        synchronized (zik.class) {
            zIsOnesieActiveForPlaybackControllerCreation = this.a.isOnesieActiveForPlaybackControllerCreation(this.c);
        }
        return new OnesieResponseParams(zIsOnesieActiveForPlaybackControllerCreation, null);
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.OnesieMediaFetchIntegration
    public final BufferManagerImpl c() {
        if (this.d.get()) {
            return null;
        }
        return this.b;
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.OnesieMediaFetchIntegration
    public final void d() {
        synchronized (zik.class) {
            this.a.unselectForPlaybackAndDispose(this.c);
        }
        this.d.set(true);
    }

    @Override // com.google.android.libraries.youtube.media.player.exo2.platypus.OnesieMediaFetchIntegration
    public final void e(final PlaybackControllerWrapper playbackControllerWrapper, PlaybackController playbackController) {
        synchronized (zik.class) {
            BufferManagerImpl bufferManagerImpl = this.b;
            if (bufferManagerImpl != null) {
                bufferManagerImpl.j(new axo() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.PlatypusOnesieMediaFetchIntegration$$ExternalSyntheticLambda0
                    @Override // defpackage.axo
                    public final void accept(Object obj) {
                        playbackControllerWrapper.k((PlatypusException) obj);
                    }
                });
            }
            this.a.selectForPlayback(this.c, playbackController);
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
            zIsCompatibleWithPlayerResponse = this.a.isCompatibleWithPlayerResponse(str, playerResponseCompatibilityRequirements);
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
