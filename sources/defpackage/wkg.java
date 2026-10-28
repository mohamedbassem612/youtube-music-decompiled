package defpackage;

import com.google.protobuf.MessageLite;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wkg implements tha {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ aqi b;
    final /* synthetic */ aepb c;

    public wkg(AtomicBoolean atomicBoolean, aqi aqiVar, aepb aepbVar) {
        this.a = atomicBoolean;
        this.b = aqiVar;
        this.c = aepbVar;
    }

    @Override // defpackage.tha
    public final void a() {
        if (this.a.compareAndSet(false, true)) {
            this.b.d(new RuntimeException("Stream completed without a render chunk"));
        }
    }

    @Override // defpackage.tha
    public final void b(tnv tnvVar) {
        if (this.a.compareAndSet(false, true)) {
            this.b.d(tnvVar.a);
        }
    }

    @Override // defpackage.tha
    public final void c(tnw tnwVar) {
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean.get()) {
            return;
        }
        MessageLite messageLite = (MessageLite) tnwVar.a;
        if (messageLite == null) {
            if (atomicBoolean.compareAndSet(false, true)) {
                this.b.d(new IllegalStateException("Stream received null chunk"));
            }
        } else if (atomicBoolean.compareAndSet(false, true)) {
            ((AtomicBoolean) this.c.a).set(true);
            this.b.b(messageLite);
        }
    }
}
