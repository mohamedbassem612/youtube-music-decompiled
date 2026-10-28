package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class dcb implements dbe {
    private final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public long c;
    private final ArrayDeque d;
    private dbz e;
    private long f;
    private long g;

    public dcb() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new dbz());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new dca(new cap() { // from class: dby
                @Override // defpackage.cap
                public final void a(caq caqVar) {
                    dca dcaVar = (dca) caqVar;
                    dcaVar.clear();
                    this.a.b.add(dcaVar);
                }
            }));
        }
        this.d = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    private final void e(dbz dbzVar) {
        dbzVar.clear();
        this.a.add(dbzVar);
    }

    protected abstract dbd a();

    @Override // defpackage.cam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public dbj dequeueOutputBuffer() {
        ArrayDeque arrayDeque = this.b;
        if (!arrayDeque.isEmpty()) {
            while (true) {
                ArrayDeque arrayDeque2 = this.d;
                if (!arrayDeque2.isEmpty()) {
                    dbz dbzVar = (dbz) arrayDeque2.peek();
                    int i = bwp.a;
                    if (dbzVar.timeUs > this.c) {
                        break;
                    }
                    dbz dbzVar2 = (dbz) arrayDeque2.poll();
                    if (dbzVar2.isEndOfStream()) {
                        dbj dbjVar = (dbj) arrayDeque.pollFirst();
                        dbjVar.addFlag(4);
                        e(dbzVar2);
                        return dbjVar;
                    }
                    c(dbzVar2);
                    if (d()) {
                        dbd dbdVarA = a();
                        dbj dbjVar2 = (dbj) arrayDeque.pollFirst();
                        dbjVar2.d(dbzVar2.timeUs, dbdVarA, Long.MAX_VALUE);
                        e(dbzVar2);
                        return dbjVar2;
                    }
                    e(dbzVar2);
                } else {
                    break;
                }
            }
        }
        return null;
    }

    protected abstract void c(dbi dbiVar);

    protected abstract boolean d();

    @Override // defpackage.cam
    public final /* bridge */ /* synthetic */ Object dequeueInputBuffer() {
        ahno.O(this.e == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        dbz dbzVar = (dbz) arrayDeque.pollFirst();
        this.e = dbzVar;
        return dbzVar;
    }

    @Override // defpackage.cam
    public void flush() {
        this.f = 0L;
        this.c = 0L;
        while (true) {
            ArrayDeque arrayDeque = this.d;
            if (arrayDeque.isEmpty()) {
                break;
            }
            dbz dbzVar = (dbz) arrayDeque.poll();
            int i = bwp.a;
            e(dbzVar);
        }
        dbz dbzVar2 = this.e;
        if (dbzVar2 != null) {
            e(dbzVar2);
            this.e = null;
        }
    }

    @Override // defpackage.dbe
    public final void l(long j) {
        this.c = j;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    @Override // defpackage.cam
    public final /* bridge */ /* synthetic */ void queueInputBuffer(Object obj) {
        dbi dbiVar = (dbi) obj;
        ahno.F(dbiVar == this.e);
        dbz dbzVar = (dbz) dbiVar;
        if (dbzVar.isEndOfStream()) {
            long j = this.f;
            this.f = 1 + j;
            dbzVar.b = j;
            this.d.add(dbzVar);
        } else {
            long j2 = dbzVar.timeUs;
            if (j2 != Long.MIN_VALUE) {
                long j3 = this.g;
                if (j3 == -9223372036854775807L || j2 >= j3) {
                    long j4 = this.f;
                    this.f = 1 + j4;
                    dbzVar.b = j4;
                    this.d.add(dbzVar);
                } else {
                    e(dbzVar);
                }
            } else {
                long j5 = this.f;
                this.f = 1 + j5;
                dbzVar.b = j5;
                this.d.add(dbzVar);
            }
        }
        this.e = null;
    }

    @Override // defpackage.cam
    public final void setOutputStartTimeUs(long j) {
        this.g = j;
    }

    @Override // defpackage.cam
    public void release() {
    }

    @Override // defpackage.cam
    public final /* synthetic */ void setCallback(cal calVar, Executor executor) {
    }
}
