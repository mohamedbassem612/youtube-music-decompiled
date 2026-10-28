package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class bra {
    private boolean a;
    public final Object e;
    public boolean f;
    public boolean g;
    public int h;

    public bra(Object obj) {
        this.e = obj;
    }

    public void b() {
        if (this.a) {
            Object obj = this.e;
            Objects.toString(obj);
            throw new IllegalStateException("detach() called when detach() had already been called for: ".concat(String.valueOf(obj)));
        }
        if (this.f) {
            Object obj2 = this.e;
            Objects.toString(obj2);
            throw new IllegalStateException("detach() called when sendResult() had already been called for: ".concat(String.valueOf(obj2)));
        }
        if (!this.g) {
            this.a = true;
        } else {
            Object obj3 = this.e;
            Objects.toString(obj3);
            throw new IllegalStateException("detach() called when sendError() had already been called for: ".concat(String.valueOf(obj3)));
        }
    }

    public final void c(Object obj) {
        if (this.f || this.g) {
            Object obj2 = this.e;
            Objects.toString(obj2);
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: ".concat(String.valueOf(obj2)));
        }
        this.f = true;
        a(obj);
    }

    public final boolean d() {
        return this.a || this.f || this.g;
    }

    public void a(Object obj) {
    }
}
