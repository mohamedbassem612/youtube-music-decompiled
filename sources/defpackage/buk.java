package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class buk implements buj {
    protected bug b;
    protected bug c;
    public ByteBuffer d;
    private bug e;
    private bug f;
    private ByteBuffer g;
    private boolean h;

    public buk() {
        ByteBuffer byteBuffer = a;
        this.g = byteBuffer;
        this.d = byteBuffer;
        bug bugVar = bug.a;
        this.e = bugVar;
        this.f = bugVar;
        this.b = bugVar;
        this.c = bugVar;
    }

    @Override // defpackage.buj
    public final bug b(bug bugVar) {
        this.e = bugVar;
        this.f = k(bugVar);
        return h() ? this.f : bug.a;
    }

    @Override // defpackage.buj
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.d;
        this.d = a;
        return byteBuffer;
    }

    @Override // defpackage.buj
    @Deprecated
    public final void d() {
        throw null;
    }

    @Override // defpackage.buj
    public final void e() {
        this.h = true;
        n();
    }

    @Override // defpackage.buj
    public final void g() {
        ByteBuffer byteBuffer = a;
        this.d = byteBuffer;
        this.h = false;
        this.g = byteBuffer;
        bug bugVar = bug.a;
        this.e = bugVar;
        this.f = bugVar;
        this.b = bugVar;
        this.c = bugVar;
        o();
    }

    @Override // defpackage.buj
    public boolean h() {
        return this.f != bug.a;
    }

    @Override // defpackage.buj
    public boolean i() {
        return this.h && this.d == a;
    }

    @Override // defpackage.buj
    public final void j() {
        this.d = a;
        this.h = false;
        this.b = this.e;
        this.c = this.f;
        p();
    }

    protected bug k(bug bugVar) {
        throw null;
    }

    protected final ByteBuffer l(int i) {
        if (this.g.capacity() < i) {
            this.g = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        ByteBuffer byteBuffer = this.g;
        this.d = byteBuffer;
        return byteBuffer;
    }

    protected void p() {
        m();
    }

    @Deprecated
    protected void m() {
    }

    protected void n() {
    }

    protected void o() {
    }

    @Override // defpackage.buj
    public /* synthetic */ long a(long j) {
        return j;
    }
}
