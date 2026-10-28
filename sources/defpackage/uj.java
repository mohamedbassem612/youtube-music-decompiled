package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class uj extends vk {
    public long A;
    public boolean B;
    public int C;
    int a;
    public int b;
    int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int E = 1;
    public luv w = luv.UNKNOWN;
    public List x = new ArrayList();
    public List y = new ArrayList();
    public List z = new ArrayList();
    public boolean D = false;

    public final void a() {
        if (this.D) {
            this.x = new ArrayList(this.x);
            this.y = new ArrayList(this.y);
            this.z = new ArrayList(this.z);
            this.D = false;
        }
    }

    public final void b(int i) {
        a();
        this.c = i;
    }

    public final void c(int i) {
        a();
        this.a = i;
    }
}
