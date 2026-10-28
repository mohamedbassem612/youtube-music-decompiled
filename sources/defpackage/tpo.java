package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tpo implements Runnable {
    private final /* synthetic */ int $cid;

    public /* synthetic */ tpo(int i) {
        this.$cid = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 3) {
            ((agrc) ((agrc) uql.a.c()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/effects/MediaEngineEffectsController", "onSegmentTap", 1220, "MediaEngineEffectsController.java")).t("Received tap on sticker that could not be resolved.");
            return;
        }
        if (i == 6) {
            agkj agkjVar = vgw.a;
            return;
        }
        if (i == 10) {
            Duration duration = vwd.a;
            return;
        }
        if (i == 11) {
            Duration duration2 = vwd.a;
            return;
        }
        if (i != 13) {
            if (i == 14) {
                Boolean.FALSE.booleanValue();
            }
        } else {
            try {
                cma.k("video/avc");
                cma.k("video/x-vnd.on2.vp9");
                cma.k("video/av01");
            } catch (Throwable th) {
                zhr.c(zhq.EXO, th, "Failed to pre-warm MediaCodecUtil", new Object[0]);
            }
        }
    }
}
