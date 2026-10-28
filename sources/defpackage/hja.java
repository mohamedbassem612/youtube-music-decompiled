package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hja {
    public aill a;
    public boolean b = false;
    public boolean c = false;
    public final ReentrantReadWriteLock d = new ReentrantReadWriteLock();
    public final Queue e = new ArrayDeque();
    private final zwb f;
    private final Executor g;
    private final qrx h;

    public hja(Executor executor, qrx qrxVar, zwb zwbVar) {
        this.g = executor;
        this.h = qrxVar;
        this.f = zwbVar;
        c();
    }

    public final ailm a(zne zneVar, String str) {
        ailm ailmVar = ailm.a;
        if (this.a == null) {
            c();
        } else {
            this.d.readLock().lock();
            try {
                ailmVar = (ailm) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((ailk) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(this.a.b), b(zneVar), ailk.a)).b), str, ailmVar);
            } finally {
                this.d.readLock().unlock();
            }
        }
        return ailmVar;
    }

    final String b(zne zneVar) {
        zwa zwaVarE = this.f.e();
        return !zwaVarE.h() ? zneVar.b.concat(zwaVarE.i()) : zneVar.b.concat("signedout");
    }

    public final void c() {
        if (this.a != null || this.b) {
            return;
        }
        this.b = true;
        qrx qrxVar = this.h;
        taf.i(qrxVar.c(), this.g, new gtq(this, 15), new gln(this, 16), null);
    }

    public final void d(final int i) {
        if (this.a == null || this.c || i <= 0) {
            return;
        }
        this.c = true;
        qrx qrxVar = this.h;
        gmv gmvVar = new gmv(this, 18);
        Executor executor = this.g;
        taf.i(qrxVar.a(gmvVar, executor), executor, new tab() { // from class: hiy
            @Override // defpackage.twi
            /* JADX INFO: renamed from: b */
            public final void a(Throwable th) {
                hja hjaVar = this.a;
                hjaVar.c = false;
                hjaVar.d(i - 1);
            }
        }, new gln(this, 17), null);
    }

    public final void e(final zne zneVar, final String str) {
        UnaryOperator unaryOperator = new UnaryOperator() { // from class: hiz
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public final /* synthetic */ Function mo840andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aijp aijpVarB;
                zne zneVar2 = zneVar;
                String str2 = str;
                hja hjaVar = this.a;
                aill aillVar = (aill) obj;
                String strB = hjaVar.b(zneVar2);
                ailm ailmVarA = hjaVar.a(zneVar2, str2);
                int i = (ailmVarA.b & 1) != 0 ? ailmVarA.c + 1 : 1;
                aihf builder = ailmVarA.toBuilder();
                builder.copyOnWrite();
                ailm ailmVar = (ailm) builder.instance;
                ailmVar.b |= 1;
                ailmVar.c = i;
                Method method = aikz.b;
                if (method != null) {
                    try {
                        Object objInvoke = method.invoke(null, null);
                        aijpVarB = aikz.c(((Long) aikz.c.invoke(objInvoke, null)).longValue(), ((Integer) aikz.d.invoke(objInvoke, null)).intValue());
                    } catch (Throwable th) {
                        throw new AssertionError(th);
                    }
                } else {
                    aijpVarB = aikz.b(System.currentTimeMillis());
                }
                builder.copyOnWrite();
                ailm ailmVar2 = (ailm) builder.instance;
                aijpVarB.getClass();
                ailmVar2.d = aijpVarB;
                ailmVar2.b |= 2;
                ailm ailmVar3 = (ailm) builder.build();
                aihf builder2 = ((ailk) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(aillVar.b), strB, ailk.a)).toBuilder();
                str2.getClass();
                ailmVar3.getClass();
                builder2.copyOnWrite();
                ailk ailkVar = (ailk) builder2.instance;
                aiip aiipVar = ailkVar.b;
                if (!aiipVar.b) {
                    ailkVar.b = aiipVar.a();
                }
                ailkVar.b.put(str2, ailmVar3);
                ailk ailkVar2 = (ailk) builder2.build();
                aihf builder3 = aillVar.toBuilder();
                ailkVar2.getClass();
                builder3.copyOnWrite();
                aill aillVar2 = (aill) builder3.instance;
                aiip aiipVar2 = aillVar2.b;
                if (!aiipVar2.b) {
                    aillVar2.b = aiipVar2.a();
                }
                aillVar2.b.put(strB, ailkVar2);
                return (aill) builder3.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        };
        aill aillVar = this.a;
        ReentrantReadWriteLock reentrantReadWriteLock = this.d;
        if (aillVar == null) {
            reentrantReadWriteLock.writeLock().lock();
            try {
                this.e.add(unaryOperator);
                c();
                return;
            } finally {
                this.d.writeLock().unlock();
            }
        }
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.a = (aill) unaryOperator.apply(this.a);
            this.d.writeLock().unlock();
            d(3);
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }
}
