package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aadb implements aadc {
    public volatile aadc a = null;

    @Override // defpackage.yfp
    public final List b() {
        return this.a != null ? this.a.b() : agpi.a;
    }

    @Override // defpackage.aadc
    public final aamc c() {
        throw null;
    }

    @Override // defpackage.aadc
    public final aamc d() {
        throw null;
    }

    @Override // defpackage.aadc
    public final aamc e() {
        throw null;
    }

    @Override // defpackage.aadc
    public final File f() {
        throw null;
    }

    @Override // defpackage.aadc
    public final File g(String str) {
        throw null;
    }

    @Override // defpackage.agfr
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final synchronized List io() {
        return this.a != null ? ((aada) this.a).io() : agpi.a;
    }

    @Override // defpackage.aadc
    public final synchronized List i() {
        return this.a != null ? this.a.i() : agpi.a;
    }

    public final synchronized void j(aadc aadcVar) {
        this.a = aadcVar;
    }
}
