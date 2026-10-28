package com.google.android.libraries.multiplatform.elements.paintunit;

import android.graphics.drawable.Drawable;
import java.io.Closeable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface PaintUnitOwner {
    void G();

    void H();

    int ig();

    PaintUnit ih(int i);

    void ii(PaintUnit paintUnit, int i);

    void ij(int i);

    void ik(int i);

    void il(Drawable drawable, Runnable runnable, long j);

    void im(Drawable drawable, Runnable runnable);

    PaintUnit j(int i);

    void k(Closeable closeable);

    void l(PaintUnit paintUnit);

    void s(boolean z);
}
