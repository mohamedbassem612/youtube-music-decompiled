package defpackage;

import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.Graph;
import com.google.mediapipe.framework.MediaPipeException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class atvq implements ahxl, atvg {
    private long b;
    public final AndroidPacketCreator g;
    protected final Graph h;
    private final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    protected final CopyOnWriteArraySet i = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet j = new CopyOnWriteArraySet();
    protected final CopyOnWriteArraySet k = new CopyOnWriteArraySet();
    protected final CopyOnWriteArraySet l = new CopyOnWriteArraySet();

    protected atvq(atth atthVar) {
        Graph graph = new Graph();
        this.h = graph;
        long j = atthVar.a;
        if (j != 0) {
            try {
                graph.b(j);
            } catch (MediaPipeException unused) {
            }
        }
        this.g = new AndroidPacketCreator(this.h);
    }

    public void c() {
        this.a.writeLock().lock();
        try {
            long j = this.b;
            if (j != 0) {
                iC(j);
                this.h.c();
            }
            this.b = 0L;
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void i(atur aturVar) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.l;
        copyOnWriteArraySet.clear();
        copyOnWriteArraySet.add(aturVar);
    }

    protected abstract void iC(long j);

    @Override // defpackage.atvg
    public final void iD(atvh atvhVar) {
        this.a.readLock().lock();
        try {
            atvhVar.a(this.b);
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void j(atus atusVar) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.k;
        copyOnWriteArraySet.clear();
        copyOnWriteArraySet.add(atusVar);
    }

    @Override // defpackage.ahxl
    public final void l(ahxk ahxkVar) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.i;
        copyOnWriteArraySet.clear();
        copyOnWriteArraySet.add(ahxkVar);
    }

    protected void m(long j) {
        this.a.writeLock().lock();
        try {
            this.b = j;
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
