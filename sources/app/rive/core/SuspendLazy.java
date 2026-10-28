package app.rive.core;

import defpackage.atqp;
import defpackage.awmj;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpg;
import defpackage.awqg;
import defpackage.awrc;
import defpackage.axff;
import defpackage.axfi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SuspendLazy {
    public static final int $stable = 8;
    private final awqg block;
    private final axff mutex;
    private volatile DeferredResult result;

    /* JADX INFO: renamed from: app.rive.core.SuspendLazy$await$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final class AnonymousClass1 extends awpg {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(awoq awoqVar) {
            super(awoqVar);
        }

        @Override // defpackage.awpe
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SuspendLazy.this.await(this);
        }
    }

    public SuspendLazy(awqg awqgVar) {
        awqgVar.getClass();
        this.block = awqgVar;
        this.result = DeferredResult.Uninitialized.INSTANCE;
        this.mutex = new axfi(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object await(awoq awoqVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        axff axffVar;
        axff axffVar2;
        Throwable th;
        Object value;
        if (awoqVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) awoqVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(awoqVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(awoqVar);
        }
        Object obj = anonymousClass1.result;
        awox awoxVar = awox.a;
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                DeferredResult deferredResult = this.result;
                if (deferredResult instanceof DeferredResult.Success) {
                    return ((DeferredResult.Success) deferredResult).getValue();
                }
                if (deferredResult instanceof DeferredResult.Failure) {
                    throw ((DeferredResult.Failure) deferredResult).getError();
                }
                if (!awrc.c(deferredResult, DeferredResult.Uninitialized.INSTANCE)) {
                    throw new awmj();
                }
                axffVar = this.mutex;
                anonymousClass1.L$0 = axffVar;
                anonymousClass1.label = 1;
                if (axffVar.a(anonymousClass1) == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    axffVar2 = (axff) anonymousClass1.L$0;
                    try {
                        atqp.j(obj);
                        this.result = new DeferredResult.Success(obj);
                        value = obj;
                        axffVar = axffVar2;
                        axffVar.c();
                        return value;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            this.result = new DeferredResult.Failure(th);
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            axffVar = axffVar2;
                            axffVar.c();
                            throw th;
                        }
                    }
                }
                axff axffVar3 = (axff) anonymousClass1.L$0;
                atqp.j(obj);
                axffVar = axffVar3;
            }
            DeferredResult deferredResult2 = this.result;
            if (deferredResult2 instanceof DeferredResult.Success) {
                value = ((DeferredResult.Success) deferredResult2).getValue();
            } else {
                if (deferredResult2 instanceof DeferredResult.Failure) {
                    throw ((DeferredResult.Failure) deferredResult2).getError();
                }
                if (!awrc.c(deferredResult2, DeferredResult.Uninitialized.INSTANCE)) {
                    throw new awmj();
                }
                try {
                    awqg awqgVar = this.block;
                    anonymousClass1.L$0 = axffVar;
                    anonymousClass1.label = 2;
                    Object objInvoke = awqgVar.invoke(anonymousClass1);
                    if (objInvoke == awoxVar) {
                        return awoxVar;
                    }
                    axffVar2 = axffVar;
                    obj = objInvoke;
                    this.result = new DeferredResult.Success(obj);
                    value = obj;
                    axffVar = axffVar2;
                } catch (Throwable th4) {
                    axffVar2 = axffVar;
                    th = th4;
                    this.result = new DeferredResult.Failure(th);
                    throw th;
                }
            }
            axffVar.c();
            return value;
        } catch (Throwable th5) {
            th = th5;
            axffVar.c();
            throw th;
        }
    }
}
