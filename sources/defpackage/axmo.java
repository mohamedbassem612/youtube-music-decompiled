package defpackage;

import android.os.SystemClock;
import j$.util.Objects;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.base.JniAndroid;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.impl.CronetBidirectionalStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axmo extends ExperimentalBidirectionalStream {
    public CronetBidirectionalStream b;
    public final BidirectionalStream.Callback f;
    public final axmr g;
    public final axnk h;
    public final BidirectionalStream.Callback o;
    private final ScheduledExecutorService p;
    private final URI r;
    private final boolean s;
    public final Object a = new Object();
    public final AtomicReference e = new AtomicReference(null);
    private final AtomicReference q = new AtomicReference();
    public final axnc i = new axnc(axok.q);
    public final List j = new ArrayList();
    public final IdentityHashMap k = new IdentityHashMap();
    public final Set l = Collections.newSetFromMap(new IdentityHashMap());
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final Set n = Collections.newSetFromMap(new IdentityHashMap());
    public CronetBidirectionalStream d = null;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public axmo(BidirectionalStream.Callback callback, ScheduledExecutorService scheduledExecutorService, axmr axmrVar, URI uri, axnk axnkVar, boolean z) {
        this.p = scheduledExecutorService;
        this.f = new axot(callback);
        this.g = axmrVar;
        this.h = axnkVar;
        this.r = uri;
        this.s = z;
        this.o = z ? new axmm(this) : new axmn(this);
    }

    private final void d() {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.q.get();
        if (scheduledFuture == null) {
            CronetBidirectionalStream cronetBidirectionalStream = this.d;
            cronetBidirectionalStream.getClass();
            cronetBidirectionalStream.cancel();
        } else {
            if (scheduledFuture.cancel(false)) {
                return;
            }
            this.p.execute(new avgv(this, 19, null));
        }
    }

    public final void a(BidirectionalStream bidirectionalStream) {
        if (bidirectionalStream != this.b && bidirectionalStream != this.d) {
            throw new AssertionError("Callback stream neither primary nor fallback.");
        }
    }

    public final void b() {
        if (this.e.get() == null) {
            this.d.start();
            this.i.a(axnb.c);
        }
        if (this.q.getAndSet(null) == null) {
            throw new AssertionError("maybeScheduleFastFailover called without active failover future.");
        }
    }

    public final void c(BidirectionalStream bidirectionalStream) {
        ScheduledFuture scheduledFuture;
        CronetBidirectionalStream cronetBidirectionalStream = this.d;
        axnc axncVar = this.i;
        if (bidirectionalStream != cronetBidirectionalStream) {
            axncVar.c(axnd.b);
            d();
            return;
        }
        axncVar.c(axnd.c);
        this.b.cancel();
        axmr axmrVar = this.g;
        URI uri = this.r;
        long j = this.d.f;
        Long lValueOf = Long.valueOf(j);
        String host = uri.getHost();
        if (axmrVar.j != null) {
            String path = uri.getPath();
            lValueOf.getClass();
            StringBuilder sb = new StringBuilder("CRONET: Fallback used ");
            sb.append(host);
            sb.append(path);
            sb.append(" def: ");
            sb.append(j == -1 ? "Y" : "N");
            axmrVar.a(sb.toString());
        }
        Set<axmo> set = axmrVar.l;
        synchronized (set) {
            for (axmo axmoVar : set) {
                lValueOf.getClass();
                if (!axmoVar.isDone() && axmoVar.e.get() == null && Objects.equals(axmoVar.r.getHost(), uri.getHost()) && j == axmoVar.d.f && (scheduledFuture = (ScheduledFuture) axmoVar.q.get()) != null && scheduledFuture.cancel(false)) {
                    axmoVar.b();
                }
            }
        }
        lValueOf.getClass();
        if (j == -1) {
            axmrVar.k.remove(host);
            return;
        }
        Map map = axmrVar.k;
        JniAndroid jniAndroid = axmrVar.o;
        map.put(host, new axmq(lValueOf, SystemClock.elapsedRealtime() + 10000));
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void cancel() {
        d();
        CronetBidirectionalStream cronetBidirectionalStream = this.b;
        cronetBidirectionalStream.getClass();
        cronetBidirectionalStream.cancel();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void flush() {
        if (!this.s) {
            BidirectionalStream bidirectionalStream = (BidirectionalStream) this.e.get();
            bidirectionalStream.getClass();
            bidirectionalStream.flush();
        } else {
            synchronized (this.a) {
                Iterator it = this.n.iterator();
                while (it.hasNext()) {
                    ((BidirectionalStream) it.next()).flush();
                }
            }
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final boolean isDone() {
        AtomicReference atomicReference = this.e;
        if (atomicReference.get() != null) {
            return ((BidirectionalStream) atomicReference.get()).isDone();
        }
        return this.b.isDone() && this.d.isDone();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void read(ByteBuffer byteBuffer) {
        BidirectionalStream bidirectionalStream = (BidirectionalStream) this.e.get();
        bidirectionalStream.getClass();
        bidirectionalStream.read(byteBuffer);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void start() {
        axmr axmrVar = this.g;
        if (!axmrVar.l.add(this)) {
            throw new AssertionError("Stream is already registered as active.");
        }
        CronetBidirectionalStream cronetBidirectionalStream = this.b;
        cronetBidirectionalStream.getClass();
        cronetBidirectionalStream.start();
        this.i.b(axnb.c);
        this.d.getClass();
        this.q.set(this.p.schedule(new avgv(this, 20, null), axmrVar.g, TimeUnit.MILLISECONDS));
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void write(ByteBuffer byteBuffer, boolean z) {
        if (!this.s) {
            BidirectionalStream bidirectionalStream = (BidirectionalStream) this.e.get();
            bidirectionalStream.getClass();
            bidirectionalStream.write(byteBuffer, z);
            return;
        }
        synchronized (this.a) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
            byteBufferAllocateDirect.put(byteBuffer.duplicate());
            acrx acrxVar = new acrx(byteBuffer, byteBufferAllocateDirect, z);
            this.j.add(acrxVar);
            for (BidirectionalStream bidirectionalStream2 : this.n) {
                ByteBuffer byteBufferDuplicate = byteBufferAllocateDirect.duplicate();
                this.k.put(byteBufferDuplicate, acrxVar);
                bidirectionalStream2.write(byteBufferDuplicate, z);
            }
        }
    }
}
