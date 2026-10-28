package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xdg {
    final String a;
    final Optional b;
    final View c;
    final ViewGroup d;
    AnimatorSet e = null;
    final amen f;
    final amen g;
    final boolean h;
    public final Optional i;
    final Optional j;
    final Object k;

    public xdg(String str, Optional optional, View view, ViewGroup viewGroup, amen amenVar, amen amenVar2, boolean z, String str2, Optional optional2, Object obj) {
        this.a = str;
        this.b = optional;
        this.c = view;
        this.d = viewGroup;
        this.f = amenVar;
        this.g = amenVar2;
        this.h = z;
        this.i = z ? Optional.of(str2) : Optional.empty();
        this.j = optional2;
        this.k = obj;
    }
}
