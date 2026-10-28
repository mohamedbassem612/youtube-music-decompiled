package app.rive;

import android.graphics.Bitmap;
import app.rive.core.RiveSurface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface HardwareFrameSource {

    /* JADX INFO: compiled from: PG */
    public interface Listener {
        void onFailure(Throwable th);

        void onFrame(Bitmap bitmap);
    }

    RiveSurface getSurface();

    void setListener(Listener listener);

    void stop();
}
