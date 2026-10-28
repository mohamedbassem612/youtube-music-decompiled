package com.google.android.libraries.multiplatform.elements;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import defpackage.otb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface NodeViewInternalInterface {
    int W();

    void X(Canvas canvas);

    void Y(boolean z);

    void Z(GestureDetector gestureDetector);

    void aa(otb otbVar);

    boolean ab(MotionEvent motionEvent);

    Matrix getMatrix();
}
