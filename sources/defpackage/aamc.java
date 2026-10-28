package defpackage;

import java.io.File;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aamc implements jsk {
    public final String a;
    private final jsk b;

    public aamc(jsk jskVar, String str) {
        if (jskVar == null) {
            throw new IllegalArgumentException();
        }
        this.b = jskVar;
        this.a = str;
    }

    @Override // defpackage.jsk
    public final long a() {
        return this.b.a();
    }

    @Override // defpackage.jsk
    public final jsp b(String str, long j) {
        return this.b.b(str, j);
    }

    @Override // defpackage.jsk
    public final jsp c(String str, long j) {
        try {
            return this.b.c(str, j);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // defpackage.jsk
    public final jsu d(String str) {
        return this.b.d(str);
    }

    @Override // defpackage.jsk
    public final File e(String str, long j, long j2) {
        return this.b.e(str, j, j2);
    }

    @Override // defpackage.jsk
    public final /* synthetic */ File f(String str, long j, long j2, ypq ypqVar) {
        return e(str, j, j2);
    }

    @Override // defpackage.jsk
    public final NavigableSet g(String str) {
        return this.b.g(str);
    }

    @Override // defpackage.jsk
    public final Set h() {
        return this.b.h();
    }

    @Override // defpackage.jsk
    public final void i(File file, long j) {
        this.b.i(file, j);
    }

    @Override // defpackage.jsk
    public final /* synthetic */ void j(File file, long j, ypq ypqVar) {
        i(file, j);
    }

    @Override // defpackage.jsk
    public final void k() {
        this.b.k();
    }

    @Override // defpackage.jsk
    public final void l(jsp jspVar) {
        this.b.l(jspVar);
    }

    @Override // defpackage.jsk
    public final void m(jsp jspVar) {
        String str = jspVar.a;
        if (str != null) {
            String strBx = zik.bx(str);
            String strBw = zik.bw(str);
            String string = Long.toString(zik.bq(str));
            zvp.a(zvn.a, zvm.f, "OfflineCache removeSpan for video videoId=" + strBx + "  formatId=" + strBw + " lastModifiedTime=" + string);
        }
        this.b.m(jspVar);
    }

    @Override // defpackage.jsk
    public final boolean n(jsj jsjVar) {
        return this.b.n(jsjVar);
    }

    @Override // defpackage.jsk
    public final boolean o(String str, long j, long j2) {
        return this.b.o(str, j, j2);
    }

    @Override // defpackage.jsk
    public final boolean p(jsj jsjVar) {
        return this.b.p(jsjVar);
    }

    @Override // defpackage.jsk
    public final void q(String str, kyr kyrVar) {
        this.b.q(str, kyrVar);
    }

    public final boolean r() {
        jsk jskVar = this.b;
        if (!(jskVar instanceof jtc)) {
            return true;
        }
        try {
            ((jtc) jskVar).t();
            return true;
        } catch (jsi unused) {
            return false;
        }
    }
}
