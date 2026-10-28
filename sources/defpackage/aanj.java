package defpackage;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aanj implements aaqx {
    public static final aamu a = new aamu(0, 0, 0);
    private aaqz b = null;

    @Override // defpackage.aaqx
    public final int a() {
        return 0;
    }

    @Override // defpackage.aaqx
    public final aaqz b() {
        aaqz aaqzVar = this.b;
        if (aaqzVar != null) {
            return aaqzVar;
        }
        aani aaniVar = new aani(this, new HashSet());
        this.b = aaniVar;
        return aaniVar;
    }

    @Override // defpackage.aaqx
    public final /* synthetic */ Set c() {
        return agpr.a;
    }

    @Override // defpackage.aaqx
    public final void d(String str) {
    }

    @Override // defpackage.aaqx
    public final void e(String str) {
    }

    @Override // defpackage.aaqx
    public final void f(int i) {
    }
}
