package app.rive;

import app.rive.core.ViewModelInstanceHandle;
import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoa;
import defpackage.awoq;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awro;
import defpackage.awut;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveKt$BindViewModelInstancesEffect$1$1 extends awpk implements awqk {
    final /* synthetic */ Map $globalViewModelInstances;
    final /* synthetic */ Function0 $requestPausedFrame;
    final /* synthetic */ StateMachine $stateMachine;
    final /* synthetic */ long $stateMachineHandle;
    final /* synthetic */ ViewModelInstance $viewModelInstance;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveKt$BindViewModelInstancesEffect$1$1(StateMachine stateMachine, ViewModelInstance viewModelInstance, Map map, Function0 function0, long j, awoq awoqVar) {
        super(2, awoqVar);
        this.$stateMachine = stateMachine;
        this.$viewModelInstance = viewModelInstance;
        this.$globalViewModelInstances = map;
        this.$requestPausedFrame = function0;
        this.$stateMachineHandle = j;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        RiveKt$BindViewModelInstancesEffect$1$1 riveKt$BindViewModelInstancesEffect$1$1 = new RiveKt$BindViewModelInstancesEffect$1$1(this.$stateMachine, this.$viewModelInstance, this.$globalViewModelInstances, this.$requestPausedFrame, this.$stateMachineHandle, awoqVar);
        riveKt$BindViewModelInstancesEffect$1$1.L$0 = obj;
        return riveKt$BindViewModelInstancesEffect$1$1;
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((RiveKt$BindViewModelInstancesEffect$1$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atqp.j(obj);
        awut awutVar = (awut) this.L$0;
        this.$stateMachine.bindViewModels$third_party_java_android_libs_rive_rive_android(this.$viewModelInstance, this.$globalViewModelInstances);
        ViewModelInstance viewModelInstance = this.$viewModelInstance;
        Map map = this.$globalViewModelInstances;
        awoa awoaVar = new awoa(10);
        if (viewModelInstance != null) {
            awoaVar.add(viewModelInstance);
        }
        awoaVar.addAll(map.values());
        List listF = awoaVar.f();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = ((awoa) listF).listIterator(0);
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            if (hashSet.add(ViewModelInstanceHandle.m578boximpl(((ViewModelInstance) next).m325getInstanceHandleVPLto4w()))) {
                arrayList.add(next);
            }
        }
        StateMachine stateMachine = this.$stateMachine;
        Function0 function0 = this.$requestPausedFrame;
        long j = this.$stateMachineHandle;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            awro.t(awutVar, null, 0, new RiveKt$BindViewModelInstancesEffect$1$1$1$1((ViewModelInstance) it.next(), stateMachine, function0, j, null), 3);
        }
        return awmy.a;
    }
}
