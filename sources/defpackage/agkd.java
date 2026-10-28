package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agkd extends agke {
    final transient int a;
    final transient int b;
    final /* synthetic */ agke c;

    public agkd(agke agkeVar, int i, int i2) {
        this.c = agkeVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.agke
    /* JADX INFO: renamed from: c */
    public final agke subList(int i, int i2) {
        ahno.N(i, i2, this.b);
        int i3 = this.a;
        return this.c.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.agjw
    public final int d() {
        return this.c.e() + this.a + this.b;
    }

    @Override // defpackage.agjw
    public final int e() {
        return this.c.e() + this.a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ahno.W(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // defpackage.agjw
    public final boolean l() {
        return true;
    }

    @Override // defpackage.agjw
    public final Object[] m() {
        return this.c.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.agke, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.agke, defpackage.agjw
    public Object writeReplace() {
        return super.writeReplace();
    }
}
