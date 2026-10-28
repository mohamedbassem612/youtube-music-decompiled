package com.google.android.libraries.multiplatform.elements.paintunit;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import defpackage.agfr;
import defpackage.atoc;
import defpackage.mew;
import defpackage.ovd;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface PaintUnit extends Closeable {
    void A();

    void B(mew mewVar);

    List C(mew mewVar);

    void b(Canvas canvas);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void e(boolean z);

    void f(PaintUnitOwner paintUnitOwner);

    void g(int i, int i2, int i3, int i4);

    boolean i();

    boolean ic();

    atoc m();

    boolean o(float f);

    int p();

    Rect q();

    PaintUnitOwner r();

    void t(int i, int i2, int i3, int i4);

    void u(int[] iArr, float f, float f2);

    void v(agfr agfrVar, ovd ovdVar);

    void w(int i);

    boolean x(long j, long j2, View view);

    boolean y(MotionEvent motionEvent, View view);

    mew z(float f, float f2, int i);
}
