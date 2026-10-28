package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class adla {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    private final List g;

    public adla(int i, List list) {
        ahno.F(i > 0);
        this.a = i;
        list.getClass();
        this.g = list;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = -1;
    }

    public final Object a(int i) {
        if (i >= 0) {
            List list = this.g;
            if (i < list.size()) {
                return list.get(i);
            }
        }
        return null;
    }

    public final List b() {
        return new ArrayList(this.g);
    }

    public adla(int i, List list, int i2, int i3, int i4, int i5) {
        ahno.F(i > 0);
        this.a = i;
        list.getClass();
        this.g = list;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = 0;
    }
}
