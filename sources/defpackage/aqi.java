package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqi {
    public Object a;
    public aqm b;
    public aqo c = new aqo();
    private boolean d;

    private final void e() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void a(Runnable runnable, Executor executor) {
        aqo aqoVar = this.c;
        if (aqoVar != null) {
            aqoVar.addListener(runnable, executor);
        }
    }

    public final void b(Object obj) {
        this.d = true;
        aqm aqmVar = this.b;
        if (aqmVar == null || !aqmVar.b.e(obj)) {
            return;
        }
        e();
    }

    public final void c() {
        this.d = true;
        aqm aqmVar = this.b;
        if (aqmVar == null || !aqmVar.b.cancel(true)) {
            return;
        }
        e();
    }

    public final void d(Throwable th) {
        this.d = true;
        aqm aqmVar = this.b;
        if (aqmVar == null || !aqmVar.a(th)) {
            return;
        }
        e();
    }

    protected final void finalize() {
        aqo aqoVar;
        aqm aqmVar = this.b;
        if (aqmVar != null && !aqmVar.isDone()) {
            aqmVar.a(new aqj("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(String.valueOf(this.a)))));
        }
        if (this.d || (aqoVar = this.c) == null) {
            return;
        }
        aqoVar.e(null);
    }
}
