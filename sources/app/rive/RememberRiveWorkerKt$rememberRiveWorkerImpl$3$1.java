package app.rive;

import app.rive.core.AudioEngine;
import app.rive.core.CommandQueue;
import defpackage.alh;
import defpackage.atqp;
import defpackage.avkz;
import defpackage.awmh;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awut;
import defpackage.bob;
import defpackage.boc;
import defpackage.bog;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RememberRiveWorkerKt$rememberRiveWorkerImpl$3$1 extends awpk implements awqk {
    final /* synthetic */ bog $lifecycleOwner;
    final /* synthetic */ CommandQueue $worker;
    int label;

    /* JADX INFO: renamed from: app.rive.RememberRiveWorkerKt$rememberRiveWorkerImpl$3$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final class AnonymousClass1 extends awpk implements awqk {
        int label;

        public AnonymousClass1(awoq awoqVar) {
            super(2, awoqVar);
        }

        @Override // defpackage.awpe
        public final awoq create(Object obj, awoq awoqVar) {
            return new AnonymousClass1(awoqVar);
        }

        @Override // defpackage.awqk
        public final Object invoke(awut awutVar, awoq awoqVar) {
            return ((AnonymousClass1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
        }

        @Override // defpackage.awpe
        public final Object invokeSuspend(Object obj) throws Throwable {
            awox awoxVar = awox.a;
            int i = this.label;
            try {
                if (i == 0) {
                    atqp.j(obj);
                    AudioEngine.INSTANCE.acquire();
                    this.label = 1;
                    if (avkz.x(this) == awoxVar) {
                        return awoxVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    atqp.j(obj);
                }
                throw new awmh();
            } catch (Throwable th) {
                AudioEngine.INSTANCE.release();
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberRiveWorkerKt$rememberRiveWorkerImpl$3$1(CommandQueue commandQueue, bog bogVar, awoq awoqVar) {
        super(2, awoqVar);
        this.$worker = commandQueue;
        this.$lifecycleOwner = bogVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new RememberRiveWorkerKt$rememberRiveWorkerImpl$3$1(this.$worker, this.$lifecycleOwner, awoqVar);
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((RememberRiveWorkerKt$rememberRiveWorkerImpl$3$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.label;
        if (i == 0) {
            atqp.j(obj);
            if (this.$worker != null) {
                boc lifecycle = this.$lifecycleOwner.getLifecycle();
                bob bobVar = bob.e;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (alh.d(lifecycle, bobVar, anonymousClass1, this) == awoxVar) {
                    return awoxVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }
}
