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
import defpackage.awql;
import defpackage.awqx;
import defpackage.awrc;
import defpackage.awri;
import defpackage.awzc;
import defpackage.awzd;
import defpackage.awzf;
import defpackage.axah;
import defpackage.axbb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ViewModelInstance$getPropertyFlow$1$1 extends awpk implements awqk {
    final /* synthetic */ awql $getter;
    final /* synthetic */ String $propertyPath;
    final /* synthetic */ ViewModel.PropertyDataType $propertyType;
    final /* synthetic */ axah $updateFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ViewModelInstance this$0;

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getPropertyFlow$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final class AnonymousClass1 extends awpk implements awqk {
        final /* synthetic */ awql $getter;
        final /* synthetic */ String $propertyPath;
        final /* synthetic */ awri $subscriptionAcquired;
        final /* synthetic */ PropertySubscriptionKey $subscriptionKey;
        int label;
        final /* synthetic */ ViewModelInstance this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(awri awriVar, ViewModelInstance viewModelInstance, PropertySubscriptionKey propertySubscriptionKey, awql awqlVar, String str, awoq awoqVar) {
            super(2, awoqVar);
            this.$subscriptionAcquired = awriVar;
            this.this$0 = viewModelInstance;
            this.$subscriptionKey = propertySubscriptionKey;
            this.$getter = awqlVar;
            this.$propertyPath = str;
        }

        @Override // defpackage.awpe
        public final awoq create(Object obj, awoq awoqVar) {
            return new AnonymousClass1(this.$subscriptionAcquired, this.this$0, this.$subscriptionKey, this.$getter, this.$propertyPath, awoqVar);
        }

        @Override // defpackage.awqk
        public final Object invoke(awzd awzdVar, awoq awoqVar) {
            return ((AnonymousClass1) create(awzdVar, awoqVar)).invokeSuspend(awmy.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v9 */
        @Override // defpackage.awpe
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objInvoke;
            awox awoxVar = awox.a;
            int i = this.label;
            try {
                if (i == 0) {
                    atqp.j(obj);
                    awri awriVar = this.$subscriptionAcquired;
                    ViewModelInstance viewModelInstance = this.this$0;
                    awriVar.a = viewModelInstance.propertySubscriptions.acquire(this.$subscriptionKey);
                    if (this.$subscriptionAcquired.a) {
                        awql awqlVar = this.$getter;
                        ViewModelInstanceHandle viewModelInstanceHandleM578boximpl = ViewModelInstanceHandle.m578boximpl(this.this$0.m325getInstanceHandleVPLto4w());
                        String str = this.$propertyPath;
                        this.label = 1;
                        objInvoke = awqlVar.invoke(viewModelInstanceHandleM578boximpl, str, this);
                        if (objInvoke == awoxVar) {
                            this = objInvoke;
                            return awoxVar;
                        }
                    }
                    return awmy.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj);
                this = this;
                this = objInvoke;
            } catch (RiveViewModelInstanceException e) {
                if (!this.this$0.closer.getClosed()) {
                    throw e;
                }
            }
            return awmy.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelInstance$getPropertyFlow$1$1(ViewModelInstance viewModelInstance, String str, ViewModel.PropertyDataType propertyDataType, axah axahVar, awql awqlVar, awoq awoqVar) {
        super(2, awoqVar);
        this.this$0 = viewModelInstance;
        this.$propertyPath = str;
        this.$propertyType = propertyDataType;
        this.$updateFlow = axahVar;
        this.$getter = awqlVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        ViewModelInstance$getPropertyFlow$1$1 viewModelInstance$getPropertyFlow$1$1 = new ViewModelInstance$getPropertyFlow$1$1(this.this$0, this.$propertyPath, this.$propertyType, this.$updateFlow, this.$getter, awoqVar);
        viewModelInstance$getPropertyFlow$1$1.L$0 = obj;
        return viewModelInstance$getPropertyFlow$1$1;
    }

    @Override // defpackage.awqk
    public final Object invoke(awzd awzdVar, awoq awoqVar) {
        return ((ViewModelInstance$getPropertyFlow$1$1) create(awzdVar, awoqVar)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:? A[SYNTHETIC] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
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
            } catch (Throwable th2) {
                th = th2;
                if (awriVar.a) {
                    throw th;
                }
                this.this$0.propertySubscriptions.release(propertySubscriptionKey);
                throw th;
            }
        }
        atqp.j(obj);
        awzd awzdVar = (awzd) this.L$0;
        this.this$0.closer.checkOpen();
        PropertySubscriptionKey propertySubscriptionKey2 = new PropertySubscriptionKey(this.$propertyPath, this.$propertyType);
        awri awriVar2 = new awri();
        try {
            ViewModelInstance viewModelInstance = this.this$0;
            final axbb axbbVar = new axbb(this.$updateFlow, new AnonymousClass1(awriVar2, viewModelInstance, propertySubscriptionKey2, this.$getter, this.$propertyPath, null));
            final ViewModelInstance viewModelInstance2 = this.this$0;
            final String str = this.$propertyPath;
            final awzc awzcVar = new awzc() { // from class: app.rive.ViewModelInstance$getPropertyFlow$1$1$invokeSuspend$$inlined$filter$1
                @Override // defpackage.awzc
                public Object collect(final awzd awzdVar2, awoq awoqVar) {
                    final ViewModelInstance viewModelInstance3 = viewModelInstance2;
                    final String str2 = str;
                    Object objCollect = axbbVar.collect(new awzd() { // from class: app.rive.ViewModelInstance$getPropertyFlow$1$1$invokeSuspend$$inlined$filter$1.2
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
            awzc awzcVarCompleteWhenClosed = viewModelInstance.completeWhenClosed(awzf.a(new awzc() { // from class: app.rive.ViewModelInstance$getPropertyFlow$1$1$invokeSuspend$$inlined$map$1
                @Override // defpackage.awzc
                public Object collect(final awzd awzdVar2, awoq awoqVar) {
                    Object objCollect = awzcVar.collect(new awzd() { // from class: app.rive.ViewModelInstance$getPropertyFlow$1$1$invokeSuspend$$inlined$map$1.2
                        @Override // defpackage.awzd
                        public final Object emit(Object obj2, awoq awoqVar2) {
                            Object objEmit = awzdVar2.emit(((CommandQueue.PropertyUpdate) obj2).getValue(), awoqVar2);
                            return objEmit != awox.a ? awmy.a : objEmit;
                        }
                    }, awoqVar);
                    return objCollect != awox.a ? awmy.a : objCollect;
                }
            }));
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
        } catch (Throwable th3) {
            th = th3;
            awriVar = awriVar2;
            propertySubscriptionKey = propertySubscriptionKey2;
            if (awriVar.a) {
                throw th;
            }
            this.this$0.propertySubscriptions.release(propertySubscriptionKey);
            throw th;
        }
    }
}
