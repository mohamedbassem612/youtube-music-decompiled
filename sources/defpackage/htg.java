package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class htg {
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    private Optional d = Optional.empty();
    private Optional e = Optional.empty();
    private Optional f = Optional.empty();

    public final hth a() {
        return new htc(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final void b(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null offlineVideoPolicy");
        }
        this.e = optional;
    }

    public final void c(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null offlineVideoStreams");
        }
        this.f = optional;
    }

    public final void d(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null transfer");
        }
        this.d = optional;
    }
}
