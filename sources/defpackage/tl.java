package defpackage;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class tl extends vm {
    public final int a;
    public final List b;
    public final List c;
    public final Bundle d;
    public final int e;
    public final Bundle f;
    public final Bundle g;
    public final String h;
    public final List i;
    public final List j;
    public final List k;
    public final List l;
    public final List m;
    private final List p;

    public tl(int i, List list, List list2, Bundle bundle, List list3, int i2, Bundle bundle2, Bundle bundle3, List list4, List list5, List list6, List list7, List list8) {
        super((byte[]) null);
        this.a = i;
        azs.l(list);
        this.b = DesugarCollections.unmodifiableList(list);
        azs.l(list2);
        this.c = DesugarCollections.unmodifiableList(list2);
        azs.l(bundle);
        this.d = bundle;
        azs.l(list3);
        this.p = DesugarCollections.unmodifiableList(list3);
        this.e = i2;
        azs.l(bundle2);
        this.f = bundle2;
        azs.l(bundle3);
        this.g = bundle3;
        this.h = "";
        this.i = DesugarCollections.unmodifiableList(list4);
        if (list5 != null) {
            this.j = DesugarCollections.unmodifiableList(list5);
        } else {
            this.j = Collections.EMPTY_LIST;
        }
        if (list6 != null) {
            this.k = DesugarCollections.unmodifiableList(list6);
        } else {
            this.k = Collections.EMPTY_LIST;
        }
        this.l = list7 != null ? DesugarCollections.unmodifiableList(list7) : Collections.EMPTY_LIST;
        this.m = list8 != null ? DesugarCollections.unmodifiableList(list8) : Collections.EMPTY_LIST;
    }

    public final List a() {
        List list = this.p;
        return list == null ? Collections.EMPTY_LIST : list;
    }
}
