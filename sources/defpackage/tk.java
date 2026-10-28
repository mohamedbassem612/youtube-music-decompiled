package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class tk {
    public List a = new ArrayList();
    private List d = new ArrayList();
    private Bundle e = new Bundle();
    public List b = new ArrayList();
    private final afx f = new afx(0);
    private Bundle g = new Bundle();
    private Bundle h = new Bundle();
    private List i = new ArrayList();
    private List j = new ArrayList();
    public List c = new ArrayList();
    private int k = 10;
    private int l = 2;
    private List m = new ArrayList();
    private boolean n = false;

    public final tl a() {
        if (!this.h.isEmpty()) {
            throw new IllegalArgumentException("Property weights are only compatible with the RANKING_STRATEGY_RELEVANCE_SCORE and RANKING_STRATEGY_ADVANCED_RANKING_EXPRESSION ranking strategies.");
        }
        this.n = true;
        return new tl(this.l, this.a, this.d, this.e, this.b, this.k, this.g, this.h, new ArrayList(this.f), this.i, this.m, this.j, this.c);
    }

    public final void b() {
        if (this.n) {
            this.a = new ArrayList(this.a);
            this.e = vm.d(this.e);
            this.d = new ArrayList(this.d);
            this.b = new ArrayList(this.b);
            this.g = vm.d(this.g);
            this.h = vm.d(this.h);
            this.i = new ArrayList(this.i);
            this.m = new ArrayList(this.m);
            this.j = new ArrayList(this.j);
            this.c = new ArrayList(this.c);
            this.n = false;
        }
    }

    public final void c(int i) {
        azs.i(i, 0, 10000, "resultCountPerPage");
        b();
        this.k = i;
    }

    public final void d(int i) {
        azs.i(i, 1, 2, "Term match type");
        b();
        this.l = i;
    }

    public final void e(String... strArr) {
        b();
        List listAsList = Arrays.asList(strArr);
        azs.l(listAsList);
        b();
        this.d.addAll(listAsList);
    }
}
