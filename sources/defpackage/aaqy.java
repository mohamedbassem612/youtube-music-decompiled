package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaqy implements aaqx {
    private aaqz b = null;
    private final HashSet a = new HashSet();
    private int c = 0;

    @Override // defpackage.aaqx
    public final synchronized int a() {
        return this.c;
    }

    @Override // defpackage.aaqx
    public final synchronized aaqz b() {
        aaqz aaqzVar = this.b;
        if (aaqzVar != null) {
            return aaqzVar;
        }
        aaqz aaqzVar2 = new aaqz(this, this.a);
        this.b = aaqzVar2;
        return aaqzVar2;
    }

    @Override // defpackage.aaqx
    public final synchronized void d(String str) {
        this.a.add(str);
    }

    @Override // defpackage.aaqx
    public final synchronized void e(String str) {
        this.a.remove(str);
    }

    @Override // defpackage.aaqx
    public final synchronized void f(int i) {
        aaqz aaqzVarB = b();
        synchronized (aaqzVarB.c) {
            try {
                aaqzVarB.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c = i;
    }

    @Override // defpackage.aaqx
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final synchronized HashSet c() {
        return this.a;
    }
}
