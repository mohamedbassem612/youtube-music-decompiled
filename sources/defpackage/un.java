package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class un extends vk {
    public long A;
    public long B;
    public int C;
    public int D;
    Set E = new afx(0);
    final String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    final int g;
    public boolean h;
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
    public int w;
    public int x;
    public us y;
    public us z;

    public un(int i, String str) {
        this.g = i;
        this.a = str;
    }

    public final uo a() {
        if (this.b == null) {
            azs.h(this.g != 1, "database can not be null if visibilityScope is local.");
        }
        return new uo(this);
    }

    public final void b(Set set) {
        afx afxVar = new afx(((afx) set).c);
        this.E = afxVar;
        afxVar.addAll(set);
    }
}
