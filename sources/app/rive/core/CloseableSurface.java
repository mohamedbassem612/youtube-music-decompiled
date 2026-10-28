package app.rive.core;

import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface CloseableSurface extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    int getHeight();

    boolean getResizable();

    Surface getSurface();

    int getWidth();
}
