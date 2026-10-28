package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gn {
    final int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    public iq h;
    im i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    boolean n = false;
    boolean o;
    Bundle p;

    public gn(int i) {
        this.a = i;
    }

    final void a(iq iqVar) {
        im imVar;
        iq iqVar2 = this.h;
        if (iqVar != iqVar2) {
            if (iqVar2 != null) {
                iqVar2.m(this.i);
            }
            this.h = iqVar;
            if (iqVar == null || (imVar = this.i) == null) {
                return;
            }
            iqVar.g(imVar);
        }
    }
}
