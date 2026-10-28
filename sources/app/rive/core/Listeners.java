package app.rive.core;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class Listeners implements AutoCloseable {
    public static final int $stable = 0;
    private final long artboardListener;
    private final long audioListener;
    private final long fileListener;
    private final long fontListener;
    private final long imageListener;
    private final long stateMachineListener;
    private final long viewModelInstanceListener;

    public Listeners(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.fileListener = j;
        this.artboardListener = j2;
        this.stateMachineListener = j3;
        this.viewModelInstanceListener = j4;
        this.imageListener = j5;
        this.audioListener = j6;
        this.fontListener = j7;
    }

    private final native void cppDelete(long j, long j2, long j3, long j4, long j5, long j6, long j7);

    @Override // java.lang.AutoCloseable
    public void close() {
        cppDelete(this.fileListener, this.artboardListener, this.stateMachineListener, this.viewModelInstanceListener, this.imageListener, this.audioListener, this.fontListener);
    }

    public final long component1() {
        return this.fileListener;
    }

    public final long component2() {
        return this.artboardListener;
    }

    public final long component3() {
        return this.stateMachineListener;
    }

    public final long component4() {
        return this.viewModelInstanceListener;
    }

    public final long component5() {
        return this.imageListener;
    }

    public final long component6() {
        return this.audioListener;
    }

    public final long component7() {
        return this.fontListener;
    }

    public final Listeners copy(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        return new Listeners(j, j2, j3, j4, j5, j6, j7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Listeners) {
            Listeners listeners = (Listeners) obj;
            if (this.fileListener == listeners.fileListener && this.artboardListener == listeners.artboardListener && this.stateMachineListener == listeners.stateMachineListener && this.viewModelInstanceListener == listeners.viewModelInstanceListener && this.imageListener == listeners.imageListener && this.audioListener == listeners.audioListener && this.fontListener == listeners.fontListener) {
                return true;
            }
        }
        return false;
    }

    public final long getArtboardListener() {
        return this.artboardListener;
    }

    public final long getAudioListener() {
        return this.audioListener;
    }

    public final long getFileListener() {
        return this.fileListener;
    }

    public final long getFontListener() {
        return this.fontListener;
    }

    public final long getImageListener() {
        return this.imageListener;
    }

    public final long getStateMachineListener() {
        return this.stateMachineListener;
    }

    public final long getViewModelInstanceListener() {
        return this.viewModelInstanceListener;
    }

    public int hashCode() {
        int iM = Listeners$$ExternalSyntheticBackport0.m(this.fileListener);
        long j = this.fontListener;
        long j2 = this.audioListener;
        long j3 = this.imageListener;
        long j4 = this.viewModelInstanceListener;
        return (((((((((((iM * 31) + Listeners$$ExternalSyntheticBackport0.m(this.artboardListener)) * 31) + Listeners$$ExternalSyntheticBackport0.m(this.stateMachineListener)) * 31) + Listeners$$ExternalSyntheticBackport0.m(j4)) * 31) + Listeners$$ExternalSyntheticBackport0.m(j3)) * 31) + Listeners$$ExternalSyntheticBackport0.m(j2)) * 31) + Listeners$$ExternalSyntheticBackport0.m(j);
    }

    public String toString() {
        return "Listeners(fileListener=" + this.fileListener + ", artboardListener=" + this.artboardListener + ", stateMachineListener=" + this.stateMachineListener + ", viewModelInstanceListener=" + this.viewModelInstanceListener + ", imageListener=" + this.imageListener + ", audioListener=" + this.audioListener + ", fontListener=" + this.fontListener + ')';
    }
}
