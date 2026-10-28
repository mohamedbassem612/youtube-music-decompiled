package com.google.android.libraries.youtube.media.player.exo2.platypus;

import android.os.Handler;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.libraries.youtube.media.interfaces.LiveVideoDetails;
import com.google.android.libraries.youtube.media.interfaces.MediaFetchPlayerConfig;
import com.google.android.libraries.youtube.media.player.exo2.platypus.event.PlatypusException;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.BufferManagerImpl;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaParser$Factory$$ExternalSyntheticLambda0;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.MediaPushMediaSource;
import com.google.protos.youtube.api.innertube.LivePlayerConfigOuterClass$LivePlayerConfig;
import com.google.protos.youtube.api.innertube.ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig;
import com.google.protos.youtube.api.innertube.MediaCommonConfigOuterClass$MediaCommonConfig;
import defpackage.aae;
import defpackage.abxv;
import defpackage.ahey;
import defpackage.akjl;
import defpackage.aoqd;
import defpackage.axo;
import defpackage.jrm;
import defpackage.wja;
import defpackage.xeu;
import defpackage.ypz;
import defpackage.ytk;
import defpackage.zcf;
import defpackage.zeh;
import defpackage.zhz;
import defpackage.zjr;
import defpackage.zkk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class Factories {
    public final ErrorHandler a;
    private final zjr b;
    private final xeu c;
    private final ahey d;
    private final Handler e;
    private final zkk f;
    private final zeh g;
    private final ScheduledExecutorService h;
    private final abxv i;

    public Factories(zjr zjrVar, xeu xeuVar, ahey aheyVar, ScheduledExecutorService scheduledExecutorService, Handler handler, zkk zkkVar, ErrorHandler errorHandler, zeh zehVar, abxv abxvVar) {
        this.b = zjrVar;
        this.c = xeuVar;
        this.d = aheyVar;
        this.a = errorHandler;
        this.e = handler;
        this.f = zkkVar;
        this.g = zehVar;
        this.i = abxvVar;
        this.h = scheduledExecutorService;
    }

    static final LiveVideoDetails d(zcf zcfVar) {
        wja wjaVar = zcfVar.A;
        if (!wjaVar.D()) {
            return null;
        }
        boolean zAg = zcfVar.y.ag();
        akjl akjlVar = zcfVar.y.d.F;
        if (akjlVar == null) {
            akjlVar = akjl.a;
        }
        return new LiveVideoDetails(wjaVar.H(), wjaVar.F(), zAg, akjlVar.h);
    }

    static final MediaFetchPlayerConfig e(zcf zcfVar) {
        aoqd aoqdVar = zcfVar.y.d;
        int iB = ypz.c(zcfVar.a, zcfVar.H.eA()).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = zcfVar.y.f.iterator();
        while (it.hasNext()) {
            FormatIdOuterClass$FormatId defaultInstance = ((jrm) it.next()).c;
            if (defaultInstance == null) {
                defaultInstance = FormatIdOuterClass$FormatId.getDefaultInstance();
            }
            arrayList.add(Integer.valueOf(defaultInstance.c));
        }
        LivePlayerConfigOuterClass$LivePlayerConfig defaultInstance2 = aoqdVar.D;
        if (defaultInstance2 == null) {
            defaultInstance2 = LivePlayerConfigOuterClass$LivePlayerConfig.getDefaultInstance();
        }
        MediaCommonConfigOuterClass$MediaCommonConfig defaultInstance3 = aoqdVar.e;
        if (defaultInstance3 == null) {
            defaultInstance3 = MediaCommonConfigOuterClass$MediaCommonConfig.getDefaultInstance();
        }
        ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig defaultInstance4 = aoqdVar.G;
        if (defaultInstance4 == null) {
            defaultInstance4 = ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig.getDefaultInstance();
        }
        return new MediaFetchPlayerConfig(defaultInstance2, defaultInstance3, defaultInstance4, iB, new ArrayList(arrayList));
    }

    static final MediaPushMediaSource f(zcf zcfVar, BufferManagerImpl bufferManagerImpl, Handler handler) {
        return new MediaPushMediaSource(zcfVar, bufferManagerImpl, handler, zcfVar.aa, zcfVar.H);
    }

    final ytk a(zcf zcfVar) {
        return new ytk(zcfVar.b.b(), this.c, this.b);
    }

    final PlaybackControllerWrapper b(zcf zcfVar, MediaPushMediaSource mediaPushMediaSource, BufferManagerImpl bufferManagerImpl, PlaybackControllerWrapper.Callbacks callbacks) {
        ScheduledExecutorService scheduledExecutorService = this.h;
        ahey aheyVar = this.d;
        return new PlaybackControllerWrapper(zcfVar, this.c, mediaPushMediaSource, bufferManagerImpl, this.a, this.e, this.f, this.g, callbacks, scheduledExecutorService, aheyVar);
    }

    final BufferManagerImpl c(final zcf zcfVar) {
        long jA = zcfVar.a();
        if (jA == this.b.v()) {
            long j = zcfVar.e;
            if (j != -1) {
                jA = TimeUnit.MILLISECONDS.toMicros(j);
            }
        }
        return new BufferManagerImpl(zcfVar.aa, new aae(), new axo() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.Factories$$ExternalSyntheticLambda0
            @Override // defpackage.axo
            public final void accept(Object obj) {
                zcfVar.Z.k((zhz) obj);
            }
        }, new MediaParser$Factory$$ExternalSyntheticLambda0(), Math.max(jA, 0L), 1000 * zcfVar.A.h, new axo() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.Factories$$ExternalSyntheticLambda1
            @Override // defpackage.axo
            public final void accept(Object obj) {
                this.a.a.d((PlatypusException) obj, zcfVar);
            }
        }, zcfVar.j(), zcfVar.a, this.c, zcfVar.H, this.i, this.h, zcfVar.c, zcfVar.y.R(), zcfVar.A.E());
    }
}
