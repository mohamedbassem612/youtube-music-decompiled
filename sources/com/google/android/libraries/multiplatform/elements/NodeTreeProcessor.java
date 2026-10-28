package com.google.android.libraries.multiplatform.elements;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import android.util.SparseArray;
import defpackage.atdg;
import defpackage.atgg;
import defpackage.mew;
import defpackage.mqt;
import defpackage.ooy;
import defpackage.oph;
import java.io.Closeable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface NodeTreeProcessor extends AutoCloseable {
    void A(Rect rect, Point point);

    boolean B(int i, int i2);

    boolean C();

    void D(int i, int i2);

    void E(atgg atggVar, int i, int i2, ElementsRetainedState elementsRetainedState);

    void F(atgg atggVar, int i, int i2, ElementsRetainedState elementsRetainedState);

    mew G(int i, int i2, float f, float f2);

    int a(int i);

    int b();

    int c(int i, float f, float f2, long j);

    int d(float f, float f2);

    long e(float f, float f2);

    Rect f(int i);

    Size g();

    Size h(int i, int i2);

    SparseArray i();

    mqt j(NodeViewInterface nodeViewInterface);

    ElementsServices k();

    oph l();

    atdg m(int i);

    Object n(int i);

    String o(int i);

    String p(int i);

    void q(Closeable closeable);

    void r(int i, Object obj);

    void s(byte[] bArr, int i, int i2, ElementsRetainedState elementsRetainedState);

    void t(ooy ooyVar);

    void u();

    void v();

    void w(int i, Object obj);

    void x(Closeable closeable);

    void y(NodeViewInterface nodeViewInterface, mqt mqtVar);

    void z(int i, int i2, int i3);
}
