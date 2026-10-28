package defpackage;

import j$.time.Duration;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qvc implements Cloneable {
    public final UUID c;
    public Duration d;
    public Duration e;
    public boolean f;
    public rbl g;

    static {
        rbm.c(qvc.class);
    }

    protected qvc(qvc qvcVar) {
        this.d = Duration.ZERO;
        this.e = Duration.ZERO;
        this.f = true;
        this.c = qvcVar.c;
        this.d = qvcVar.d;
        this.e = qvcVar.e;
        this.g = qvcVar.g;
        this.f = qvcVar.f;
    }

    @Override // 
    /* JADX INFO: renamed from: a */
    public abstract qvc clone();

    public abstract String c();

    public boolean e(Object obj) {
        if (!(obj instanceof qvc)) {
            return false;
        }
        qvc qvcVar = (qvc) obj;
        return c().equals(qvcVar.c()) && this.d.equals(qvcVar.d) && this.e.equals(qvcVar.e) && this.f == qvcVar.f;
    }

    public final String f(String str) {
        return str + '_' + (this.c.hashCode() + 2147483648L);
    }

    public final void g(Duration duration) {
        this.e = nrb.e(duration);
    }

    public final void h(Duration duration) {
        this.d = nrb.e(duration);
    }

    public Object iv() {
        return this.c;
    }

    public String toString() {
        return String.format(Locale.US, "Effect{startTime=%s, duration=%s, enabled=%b}", this.d, this.e, Boolean.valueOf(this.f));
    }

    public void d(qvk qvkVar) {
    }

    protected qvc() {
        this.d = Duration.ZERO;
        this.e = Duration.ZERO;
        this.f = true;
        this.c = UUID.randomUUID();
    }

    protected qvc(UUID uuid) {
        this.d = Duration.ZERO;
        this.e = Duration.ZERO;
        this.f = true;
        this.c = uuid;
    }
}
