package defpackage;

import j$.time.Duration;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class qup implements Cloneable, rjq {
    public final UUID a;
    public final qus b;
    public Duration c;
    public Duration d;

    static {
        rbm.c(qup.class);
    }

    protected qup(qup qupVar) {
        this.c = Duration.ZERO;
        this.d = Duration.ZERO;
        this.a = qupVar.a;
        this.c = qupVar.c;
        this.d = qupVar.d;
        this.b = qupVar.b.clone();
    }

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qup clone() {
        return new qup(this);
    }

    public final Duration b() {
        return this.c.plus(this.d);
    }

    public final void f(Duration duration) {
        this.d = nrb.e(duration);
    }

    public final void g(Duration duration) {
        this.c = nrb.e(duration);
    }

    @Override // defpackage.rjq
    public final Duration ir() {
        return this.c;
    }

    @Override // defpackage.rjq
    public final List is() {
        return this.b.b();
    }

    @Override // defpackage.rjq
    public final boolean it() {
        return this.b.g;
    }

    @Override // defpackage.rjq
    public final Duration iu() {
        return this.d;
    }

    public qup(qus qusVar, UUID uuid) {
        this.c = Duration.ZERO;
        this.d = Duration.ZERO;
        this.b = qusVar;
        this.a = uuid;
    }

    public qup(rfk rfkVar) {
        this(new rfj(), rfkVar.m);
        boolean z = rfkVar.k;
        boolean z2 = rfkVar.l;
    }
}
