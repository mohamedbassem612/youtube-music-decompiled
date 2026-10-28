package defpackage;

import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class osn {
    public Consumer a;
    public nay b;
    public boolean c = false;

    public final synchronized nay a() {
        return this.b;
    }

    public final synchronized Runnable b(final Consumer consumer) {
        if (this.a != null) {
            return null;
        }
        this.a = consumer;
        return new Runnable() { // from class: osm
            @Override // java.lang.Runnable
            public final void run() {
                osn osnVar = this.a;
                synchronized (osnVar) {
                    if (osnVar.a == consumer) {
                        osnVar.a = null;
                    }
                }
            }
        };
    }
}
