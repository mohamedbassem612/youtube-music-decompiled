package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.LinkedList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aerd {
    public final awmd a;
    public final awmd b;
    public final awmd c;
    public final mbc d;
    public final ahey e;
    public final aqiz f;
    public final boolean g;
    public long j;
    public Runnable k;
    private ListenableFuture m;
    public final LinkedList h = new LinkedList();
    public long i = -1;
    public boolean l = false;

    public aerd(trf trfVar, mbc mbcVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, ahey aheyVar, aetb aetbVar, vxz vxzVar) {
        this.j = 0L;
        boolean z = false;
        this.d = mbcVar;
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.e = aheyVar;
        this.f = aetbVar.io();
        this.j = trfVar.b().toMillis();
        if (vxzVar.l(179, 45679021L, false)) {
            aqiw aqiwVar = aetbVar.io().j;
            float f = (aqiwVar == null ? aqiw.a : aqiwVar).d;
            if (f > 0.0f && f <= 1.0f && ThreadLocalRandom.current().nextFloat() < f) {
                z = true;
            }
        }
        this.g = z;
    }

    final synchronized void a(long j) {
        Runnable runnable;
        this.i = j;
        b();
        LinkedList linkedList = this.h;
        if (!linkedList.isEmpty() && (runnable = this.k) != null) {
            this.m = aewo.p(runnable, linkedList, this.d, this.e);
        }
    }

    final synchronized void b() {
        ListenableFuture listenableFuture = this.m;
        if (listenableFuture != null && !listenableFuture.isCancelled()) {
            this.m.cancel(false);
        }
        this.m = null;
    }
}
