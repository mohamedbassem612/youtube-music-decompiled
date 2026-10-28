package com.google.cardboard.sdk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class HeadTracker {
    private long nativeHeadTracker = nativeHeadTrackerCreate();

    private native long nativeHeadTrackerCreate();

    private native void nativeHeadTrackerDestroy(long j);

    private native void nativeHeadTrackerGetPose(long j, long j2, int i, float[] fArr, float[] fArr2);

    private native void nativeHeadTrackerPause(long j);

    private native void nativeHeadTrackerResume(long j);

    public void close() {
        nativeHeadTrackerDestroy(this.nativeHeadTracker);
        this.nativeHeadTracker = 0L;
    }

    protected void finalize() throws Throwable {
        close();
        super.finalize();
    }

    public void getPose(long j, int i, float[] fArr, float[] fArr2) {
        nativeHeadTrackerGetPose(this.nativeHeadTracker, j, i, fArr, fArr2);
    }

    public void pause() {
        nativeHeadTrackerPause(this.nativeHeadTracker);
    }

    public void resume() {
        nativeHeadTrackerResume(this.nativeHeadTracker);
    }
}
