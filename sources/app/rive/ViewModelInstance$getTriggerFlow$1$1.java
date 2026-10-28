package app.rive;

import app.rive.core.CommandQueue;
import app.rive.core.ViewModelInstanceHandle;
import app.rive.runtime.kotlin.core.ViewModel;
import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awqx;
import defpackage.awrc;
import defpackage.awri;
import defpackage.awzc;
import defpackage.awzd;
import defpackage.axbb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ViewModelInstance$getTriggerFlow$1$1 extends awpk implements awqk {
    final /* synthetic */ String $propertyPath;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ViewModelInstance this$0;

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getTriggerFlow$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final class AnonymousClass1 extends awpk implements awqk {
        final /* synthetic */ awri $subscriptionAcquired;
        final /* synthetic */ PropertySubscriptionKey $subscriptionKey;
        int label;
        final /* synthetic */ ViewModelInstance this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(awri awriVar, ViewModelInstance viewModelInstance, PropertySubscriptionKey propertySubscriptionKey, awoq awoqVar) {
            super(2, awoqVar);
            this.$subscriptionAcquired = awriVar;
            this.this$0 = viewModelInstance;
            this.$subscriptionKey = propertySubscriptionKey;
        }

        @Override // defpackage.awpe
        public final awoq create(Object obj, awoq awoqVar) {
            return new AnonymousClass1(this.$subscriptionAcquired, this.this$0, this.$subscriptionKey, awoqVar);
        }

        @Override // defpackage.awqk
        public final Object invoke(awzd awzdVar, awoq awoqVar) {
            return ((AnonymousClass1) create(awzdVar, awoqVar)).invokeSuspend(awmy.a);
        }

        @Override // defpackage.awpe
        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
            awri awriVar = this.$subscriptionAcquired;
            ViewModelInstance viewModelInstance = this.this$0;
            awriVar.a = viewModelInstance.propertySubscriptions.acquire(this.$subscriptionKey);
            return awmy.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelInstance$getTriggerFlow$1$1(ViewModelInstance viewModelInstance, String str, awoq awoqVar) {
        super(2, awoqVar);
        this.this$0 = viewModelInstance;
        this.$propertyPath = str;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        ViewModelInstance$getTriggerFlow$1$1 viewModelInstance$getTriggerFlow$1$1 = new ViewModelInstance$getTriggerFlow$1$1(this.this$0, this.$propertyPath, awoqVar);
        viewModelInstance$getTriggerFlow$1$1.L$0 = obj;
        return viewModelInstance$getTriggerFlow$1$1;
    }

    @Override // defpackage.awqk
    public final Object invoke(awzd awzdVar, awoq awoqVar) {
        return ((ViewModelInstance$getTriggerFlow$1$1) create(awzdVar, awoqVar)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awri awriVar;
        PropertySubscriptionKey propertySubscriptionKey;
        awox awoxVar = awox.a;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awriVar = (awri) this.L$1;
            propertySubscriptionKey = (PropertySubscriptionKey) this.L$0;
            try {
                atqp.j(obj);
                if (awriVar.a) {
                    this.this$0.propertySubscriptions.release(propertySubscriptionKey);
                }
                return awmy.a;
            } catch (Throwable th) {
                th = th;
                if (awriVar.a) {
                    this.this$0.propertySubscriptions.release(propertySubscriptionKey);
                }
                throw th;
            }
        }
        atqp.j(obj);
        awzd awzdVar = (awzd) this.L$0;
        this.this$0.closer.checkOpen();
        PropertySubscriptionKey propertySubscriptionKey2 = new PropertySubscriptionKey(this.$propertyPath, ViewModel.PropertyDataType.TRIGGER);
        awri awriVar2 = new awri();
        try {
            ViewModelInstance viewModelInstance = this.this$0;
            final axbb axbbVar = new axbb(viewModelInstance.riveWorker.getTriggerPropertyFlow(), new AnonymousClass1(awriVar2, this.this$0, propertySubscriptionKey2, null));
            final ViewModelInstance viewModelInstance2 = this.this$0;
            final String str = this.$propertyPath;
            final awzc awzcVar = new awzc() { // from class: app.rive.ViewModelInstance$getTriggerFlow$1$1$invokeSuspend$$inlined$filter$1
                @Override // defpackage.awzc
                public Object collect(final awzd awzdVar2, awoq awoqVar) {
                    final ViewModelInstance viewModelInstance3 = viewModelInstance2;
                    final String str2 = str;
                    Object objCollect = axbbVar.collect(new awzd() { // from class: app.rive.ViewModelInstance$getTriggerFlow$1$1$invokeSuspend$$inlined$filter$1.2
                        @Override // defpackage.awzd
                        public final Object emit(Object obj2, awoq awoqVar2) {
                            Object objEmit;
                            CommandQueue.PropertyUpdate propertyUpdate = (CommandQueue.PropertyUpdate) obj2;
                            return (ViewModelInstanceHandle.m581equalsimpl0(propertyUpdate.m489getHandleVPLto4w(), viewModelInstance3.m325getInstanceHandleVPLto4w()) && awrc.c(propertyUpdate.getPropertyPath(), str2) && (objEmit = awzdVar2.emit(obj2, awoqVar2)) == awox.a) ? objEmit : awmy.a;
                        }
                    }, awoqVar);
                    return objCollect != awox.a ? awmy.a : objCollect;
                }
            };
            awzc awzcVarCompleteWhenClosed = viewModelInstance.completeWhenClosed(awqx.u(new awzc() { // from class: app.rive.ViewModelInstance$getTriggerFlow$1$1$invokeSuspend$$inlined$map$1
                @Override // defpackage.awzc
                public Object collect(final awzd awzdVar2, awoq awoqVar) {
                    Object objCollect = awzcVar.collect(new awzd() { // from class: app.rive.ViewModelInstance$getTriggerFlow$1$1$invokeSuspend$$inlined$map$1.2
                        @Override // defpackage.awzd
                        public final Object emit(Object obj2, awoq awoqVar2) {
                            awzd awzdVar3 = awzdVar2;
                            awmy awmyVar = awmy.a;
                            Object objEmit = awzdVar3.emit(awmyVar, awoqVar2);
                            return objEmit == awox.a ? objEmit : awmyVar;
                        }
                    }, awoqVar);
                    return objCollect != awox.a ? awmy.a : objCollect;
                }
            }, 32, 2));
            this.L$0 = propertySubscriptionKey2;
            this.L$1 = awriVar2;
            this.label = 1;
            if (awqx.x(awzdVar, awzcVarCompleteWhenClosed, this) == awoxVar) {
                return awoxVar;
            }
            awriVar = awriVar2;
            propertySubscriptionKey = propertySubscriptionKey2;
            if (awriVar.a) {
                this.this$0.propertySubscriptions.release(propertySubscriptionKey);
            }
            return awmy.a;
        } catch (Throwable th2) {
            th = th2;
            awriVar = awriVar2;
            propertySubscriptionKey = propertySubscriptionKey2;
            if (awriVar.a) {
                this.this$0.propertySubscriptions.release(propertySubscriptionKey);
            }
            throw th;
        }
    }
}
