package com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush;

import defpackage.agkz;
import defpackage.agpr;
import defpackage.agqr;
import defpackage.jqz;
import defpackage.zhq;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class StartPositionTracker {
    private final ArrayList c = new ArrayList();
    public final Map a = new EnumMap(jqz.class);
    public agkz b = agpr.a;
    private volatile boolean d = false;
    private final AtomicBoolean e = new AtomicBoolean(false);

    private final synchronized Optional c() {
        Optional optionalEmpty;
        if (this.b.isEmpty()) {
            optionalEmpty = Optional.empty();
        } else {
            agqr it = this.b.iterator();
            boolean z = true;
            long jMax = Long.MIN_VALUE;
            while (it.hasNext()) {
                jqz jqzVar = (jqz) it.next();
                Map map = this.a;
                if (map.containsKey(jqzVar)) {
                    jMax = Math.max(jMax, ((Long) map.get(jqzVar)).longValue());
                } else {
                    z = false;
                }
            }
            optionalEmpty = (jMax <= Long.MIN_VALUE || !z) ? Optional.empty() : Optional.of(Long.valueOf(jMax));
        }
        return optionalEmpty;
    }

    public final void a() {
        boolean z = this.d;
        Optional.empty();
        new ArrayList();
        synchronized (this) {
            ArrayList arrayList = this.c;
            if (arrayList.isEmpty()) {
                return;
            }
            Optional optionalC = c();
            if (!optionalC.isPresent() || this.e.getAndSet(true)) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                MediaPushMediaSource mediaPushMediaSource = (MediaPushMediaSource) arrayList.get(i);
                long jLongValue = ((Long) optionalC.get()).longValue();
                if (mediaPushMediaSource.e == mediaPushMediaSource.g.H.v()) {
                    zhq zhqVar = zhq.ABR;
                    mediaPushMediaSource.M(jLongValue);
                    mediaPushMediaSource.O(jLongValue);
                }
            }
        }
    }

    public final void b(MediaPushMediaSource mediaPushMediaSource) {
        synchronized (this) {
            this.c.add(mediaPushMediaSource);
        }
        a();
    }
}
