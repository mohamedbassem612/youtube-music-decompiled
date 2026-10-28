package com.google.android.libraries.multiplatform.elements;

import android.graphics.Rect;
import android.view.View;
import defpackage.agfr;
import defpackage.atoc;
import defpackage.ota;
import defpackage.otc;
import defpackage.oul;
import defpackage.ovd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface NodeViewInterface {
    void B(NodeTreeProcessor nodeTreeProcessor);

    void C(int i);

    void E(float f);

    void F(float f);

    void L(long j);

    void M(boolean z);

    void N(agfr agfrVar, ovd ovdVar);

    void O(float f, int i, float f2, float f3);

    void P(boolean z);

    void Q(Rect rect);

    void R(int i);

    void S(int i);

    boolean T();

    void U();

    atoc V();

    float a();

    int b();

    int c();

    int d();

    long g();

    ElementsServices h();

    NodeTreeProcessor m();

    ota n();

    oul o();

    String p(NodeTreeProcessor nodeTreeProcessor);

    void r(otc otcVar);

    void setClickable(boolean z);

    void setContextClickable(boolean z);

    void setLongClickable(boolean z);

    void setOnContextClickListener(View.OnContextClickListener onContextClickListener);

    void t(int i, int i2, int i3, int i4);

    void x();

    void y();

    void z(Object obj);
}
