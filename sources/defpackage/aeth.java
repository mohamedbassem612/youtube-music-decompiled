package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeth {
    public final avmm a = new avmm();
    public final abvn b;
    public String c;
    public List d;
    public avmn e;
    public aetn f;

    public aeth(abvn abvnVar) {
        this.b = abvnVar;
    }

    public final void a() {
        Object obj;
        aetn aetnVar = this.f;
        if (aetnVar != null && (obj = aetnVar.c) != null) {
            ((aetd) obj).b();
        }
        b();
    }

    public final void b() {
        this.c = null;
        this.d = null;
        this.f = null;
        this.a.b();
        Object obj = this.e;
        if (obj != null) {
            awka.f((AtomicReference) obj);
            this.e = null;
        }
    }
}
