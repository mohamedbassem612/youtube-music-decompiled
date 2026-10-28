package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dbj extends caq implements dbd {
    private dbd a;
    private long b;

    @Override // defpackage.dbd
    public final int a() {
        dbd dbdVar = this.a;
        dbdVar.getClass();
        return dbdVar.a();
    }

    @Override // defpackage.dbd
    public final int b(long j) {
        dbd dbdVar = this.a;
        dbdVar.getClass();
        return dbdVar.b(j - this.b);
    }

    @Override // defpackage.dbd
    public final long c(int i) {
        dbd dbdVar = this.a;
        dbdVar.getClass();
        return dbdVar.c(i) + this.b;
    }

    @Override // defpackage.caq, defpackage.cai
    public final void clear() {
        super.clear();
        this.a = null;
    }

    public final void d(long j, dbd dbdVar, long j2) {
        this.timeUs = j;
        this.a = dbdVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.b = j;
    }

    @Override // defpackage.dbd
    public final List e(long j) {
        dbd dbdVar = this.a;
        dbdVar.getClass();
        return dbdVar.e(j - this.b);
    }
}
