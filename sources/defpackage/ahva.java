package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahva {
    public static final ahva a = new ahva();
    private final awmi b = new awmp(new aoh(20));
    private final AtomicBoolean c = new AtomicBoolean(false);

    public final void a() {
        ahvc ahvcVar;
        if (!this.c.compareAndSet(false, true) || (ahvcVar = (ahvc) this.b.a()) == null) {
            return;
        }
        ahvcVar.a();
    }
}
