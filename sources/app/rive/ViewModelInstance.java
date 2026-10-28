package app.rive;

import app.rive.core.ArtboardHandle;
import app.rive.core.CheckableAutoCloseable;
import app.rive.core.CloseOnce;
import app.rive.core.CommandQueue;
import app.rive.core.FileHandle;
import app.rive.core.FontHandle;
import app.rive.core.ImageHandle;
import app.rive.core.ViewModelInstanceHandle;
import app.rive.runtime.kotlin.core.ViewModel;
import defpackage.atqp;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awov;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awql;
import defpackage.awqx;
import defpackage.awrb;
import defpackage.awro;
import defpackage.awwd;
import defpackage.awyp;
import defpackage.awyv;
import defpackage.awyy;
import defpackage.awzc;
import defpackage.axae;
import defpackage.axah;
import defpackage.axal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelInstance implements CheckableAutoCloseable {
    private final axae _dirtyFlow;
    private final Map booleanFlows;
    private final axae closeFlow;
    private final CloseOnce closer;
    private final Map colorFlows;
    private final axah dirtyFlow;
    private final Map enumFlows;
    private final long fileHandle;
    private final long instanceHandle;
    private final Map numberFlows;
    private final PropertySubscriptions propertySubscriptions;
    private final CommandQueue riveWorker;
    private final Map stringFlows;
    private final Map triggerFlows;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$completeWhenClosed$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final class AnonymousClass1 extends awpk implements awqk {
        final /* synthetic */ awzc $this_completeWhenClosed;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ViewModelInstance this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(awzc awzcVar, ViewModelInstance viewModelInstance, awoq awoqVar) {
            super(2, awoqVar);
            this.$this_completeWhenClosed = awzcVar;
            this.this$0 = viewModelInstance;
        }

        @Override // defpackage.awpe
        public final awoq create(Object obj, awoq awoqVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_completeWhenClosed, this.this$0, awoqVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.awqk
        public final Object invoke(awyp awypVar, awoq awoqVar) {
            return ((AnonymousClass1) create(awypVar, awoqVar)).invokeSuspend(awmy.a);
        }

        @Override // defpackage.awpe
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            awwd awwdVar;
            awox awoxVar = awox.a;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                awwdVar = (awwd) this.L$0;
                try {
                    atqp.j(obj);
                    awwdVar.p(null);
                    return awmy.a;
                } catch (Throwable th2) {
                    th = th2;
                    awwdVar.p(null);
                    throw th;
                }
            }
            atqp.j(obj);
            awyp awypVar = (awyp) this.L$0;
            awwd awwdVarT = awro.t(awypVar, null, 4, new ViewModelInstance$completeWhenClosed$1$updatesJob$1(this.$this_completeWhenClosed, awypVar, null), 1);
            awwd awwdVarT2 = awro.t(awypVar, null, 4, new ViewModelInstance$completeWhenClosed$1$closeJob$1(this.this$0, awwdVarT, null), 1);
            try {
                this.L$0 = awwdVarT2;
                this.label = 1;
                if (awwdVarT.l(this) == awoxVar) {
                    return awoxVar;
                }
                awwdVar = awwdVarT2;
                awwdVar.p(null);
                return awmy.a;
            } catch (Throwable th3) {
                th = th3;
                awwdVar = awwdVarT2;
                awwdVar.p(null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getBooleanFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PG */
    final /* synthetic */ class C00131 extends awrb implements awql {
        public C00131(Object obj) {
            super(3, obj, CommandQueue.class, "getBooleanProperty", "getBooleanProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // defpackage.awql
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m326invokeiFQtAB8(((ViewModelInstanceHandle) obj).m584unboximpl(), (String) obj2, (awoq) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m326invokeiFQtAB8(long j, String str, awoq awoqVar) {
            return ((CommandQueue) this.receiver).m432getBooleanPropertyiFQtAB8(j, str, awoqVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getColorFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PG */
    final /* synthetic */ class C00141 extends awrb implements awql {
        public C00141(Object obj) {
            super(3, obj, CommandQueue.class, "getColorProperty", "getColorProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // defpackage.awql
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m327invokeiFQtAB8(((ViewModelInstanceHandle) obj).m584unboximpl(), (String) obj2, (awoq) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m327invokeiFQtAB8(long j, String str, awoq awoqVar) {
            return ((CommandQueue) this.receiver).m433getColorPropertyiFQtAB8(j, str, awoqVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getEnumFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PG */
    final /* synthetic */ class C00151 extends awrb implements awql {
        public C00151(Object obj) {
            super(3, obj, CommandQueue.class, "getEnumProperty", "getEnumProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // defpackage.awql
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m328invokeiFQtAB8(((ViewModelInstanceHandle) obj).m584unboximpl(), (String) obj2, (awoq) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m328invokeiFQtAB8(long j, String str, awoq awoqVar) {
            return ((CommandQueue) this.receiver).m435getEnumPropertyiFQtAB8(j, str, awoqVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getNumberFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PG */
    final /* synthetic */ class C00161 extends awrb implements awql {
        public C00161(Object obj) {
            super(3, obj, CommandQueue.class, "getNumberProperty", "getNumberProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // defpackage.awql
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m329invokeiFQtAB8(((ViewModelInstanceHandle) obj).m584unboximpl(), (String) obj2, (awoq) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m329invokeiFQtAB8(long j, String str, awoq awoqVar) {
            return ((CommandQueue) this.receiver).m439getNumberPropertyiFQtAB8(j, str, awoqVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$getStringFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PG */
    final /* synthetic */ class C00171 extends awrb implements awql {
        public C00171(Object obj) {
            super(3, obj, CommandQueue.class, "getStringProperty", "getStringProperty-iFQtAB8(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // defpackage.awql
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m330invokeiFQtAB8(((ViewModelInstanceHandle) obj).m584unboximpl(), (String) obj2, (awoq) obj3);
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final Object m330invokeiFQtAB8(long j, String str, awoq awoqVar) {
            return ((CommandQueue) this.receiver).m441getStringPropertyiFQtAB8(j, str, awoqVar);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setArtboard$2, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    final /* synthetic */ class AnonymousClass2 extends awrb implements awql {
        public AnonymousClass2(Object obj) {
            super(3, obj, CommandQueue.class, "setArtboardProperty", "setArtboardProperty-MFCOo3w(JLjava/lang/String;Lapp/rive/core/ArtboardHandle;)V", 0);
        }

        @Override // defpackage.awql
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m331invokeMFCOo3w(((ViewModelInstanceHandle) obj).m584unboximpl(), (String) obj2, (ArtboardHandle) obj3);
            return awmy.a;
        }

        /* JADX INFO: renamed from: invoke-MFCOo3w, reason: not valid java name */
        public final void m331invokeMFCOo3w(long j, String str, ArtboardHandle artboardHandle) {
            str.getClass();
            ((CommandQueue) this.receiver).m469setArtboardPropertyMFCOo3w(j, str, artboardHandle);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setBoolean$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PG */
    final /* synthetic */ class C00181 extends awrb implements awql {
        public C00181(Object obj) {
            super(3, obj, CommandQueue.class, "setBooleanProperty", "setBooleanProperty-iFQtAB8(JLjava/lang/String;Z)V", 0);
        }

        @Override // defpackage.awql
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m332invokeiFQtAB8(((ViewModelInstanceHandle) obj).m584unboximpl(), (String) obj2, ((Boolean) obj3).booleanValue());
            return awmy.a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m332invokeiFQtAB8(long j, String str, boolean z) {
            str.getClass();
            ((CommandQueue) this.receiver).m471setBooleanPropertyiFQtAB8(j, str, z);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setColor$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PG */
    final /* synthetic */ class C00191 extends awrb implements awql {
        public C00191(Object obj) {
            super(3, obj, CommandQueue.class, "setColorProperty", "setColorProperty-iFQtAB8(JLjava/lang/String;I)V", 0);
        }

        @Override // defpackage.awql
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m333invokeiFQtAB8(((ViewModelInstanceHandle) obj).m584unboximpl(), (String) obj2, ((Number) obj3).intValue());
            return awmy.a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m333invokeiFQtAB8(long j, String str, int i) {
            str.getClass();
            ((CommandQueue) this.receiver).m472setColorPropertyiFQtAB8(j, str, i);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setEnum$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PG */
    final /* synthetic */ class C00201 extends awrb implements awql {
        public C00201(Object obj) {
            super(3, obj, CommandQueue.class, "setEnumProperty", "setEnumProperty-iFQtAB8(JLjava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // defpackage.awql
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m334invokeiFQtAB8(((ViewModelInstanceHandle) obj).m584unboximpl(), (String) obj2, (String) obj3);
            return awmy.a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m334invokeiFQtAB8(long j, String str, String str2) {
            str.getClass();
            str2.getClass();
            ((CommandQueue) this.receiver).m473setEnumPropertyiFQtAB8(j, str, str2);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setFont$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PG */
    final /* synthetic */ class C00212 extends awrb implements awql {
        public C00212(Object obj) {
            super(3, obj, CommandQueue.class, "setFontProperty", "setFontProperty-po2uwC0(JLjava/lang/String;Lapp/rive/core/FontHandle;)V", 0);
        }

        @Override // defpackage.awql
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m335invokepo2uwC0(((ViewModelInstanceHandle) obj).m584unboximpl(), (String) obj2, (FontHandle) obj3);
            return awmy.a;
        }

        /* JADX INFO: renamed from: invoke-po2uwC0, reason: not valid java name */
        public final void m335invokepo2uwC0(long j, String str, FontHandle fontHandle) {
            str.getClass();
            ((CommandQueue) this.receiver).m474setFontPropertypo2uwC0(j, str, fontHandle);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setImage$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PG */
    final /* synthetic */ class C00222 extends awrb implements awql {
        public C00222(Object obj) {
            super(3, obj, CommandQueue.class, "setImageProperty", "setImageProperty-uYCTyf4(JLjava/lang/String;Lapp/rive/core/ImageHandle;)V", 0);
        }

        @Override // defpackage.awql
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m336invokeuYCTyf4(((ViewModelInstanceHandle) obj).m584unboximpl(), (String) obj2, (ImageHandle) obj3);
            return awmy.a;
        }

        /* JADX INFO: renamed from: invoke-uYCTyf4, reason: not valid java name */
        public final void m336invokeuYCTyf4(long j, String str, ImageHandle imageHandle) {
            str.getClass();
            ((CommandQueue) this.receiver).m476setImagePropertyuYCTyf4(j, str, imageHandle);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setNumber$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PG */
    final /* synthetic */ class C00231 extends awrb implements awql {
        public C00231(Object obj) {
            super(3, obj, CommandQueue.class, "setNumberProperty", "setNumberProperty-iFQtAB8(JLjava/lang/String;F)V", 0);
        }

        @Override // defpackage.awql
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m337invokeiFQtAB8(((ViewModelInstanceHandle) obj).m584unboximpl(), (String) obj2, ((Number) obj3).floatValue());
            return awmy.a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m337invokeiFQtAB8(long j, String str, float f) {
            str.getClass();
            ((CommandQueue) this.receiver).m478setNumberPropertyiFQtAB8(j, str, f);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setString$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PG */
    final /* synthetic */ class C00241 extends awrb implements awql {
        public C00241(Object obj) {
            super(3, obj, CommandQueue.class, "setStringProperty", "setStringProperty-iFQtAB8(JLjava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // defpackage.awql
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m338invokeiFQtAB8(((ViewModelInstanceHandle) obj).m584unboximpl(), (String) obj2, (String) obj3);
            return awmy.a;
        }

        /* JADX INFO: renamed from: invoke-iFQtAB8, reason: not valid java name */
        public final void m338invokeiFQtAB8(long j, String str, String str2) {
            str.getClass();
            str2.getClass();
            ((CommandQueue) this.receiver).m479setStringPropertyiFQtAB8(j, str, str2);
        }
    }

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$setViewModelInstance$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PG */
    final /* synthetic */ class C00252 extends awrb implements awql {
        public C00252(Object obj) {
            super(3, obj, CommandQueue.class, "setViewModelInstanceProperty", "setViewModelInstanceProperty-Y8k3COA(JLjava/lang/String;J)V", 0);
        }

        @Override // defpackage.awql
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m339invokeY8k3COA(((ViewModelInstanceHandle) obj).m584unboximpl(), (String) obj2, ((ViewModelInstanceHandle) obj3).m584unboximpl());
            return awmy.a;
        }

        /* JADX INFO: renamed from: invoke-Y8k3COA, reason: not valid java name */
        public final void m339invokeY8k3COA(long j, String str, long j2) {
            str.getClass();
            ((CommandQueue) this.receiver).m480setViewModelInstancePropertyY8k3COA(j, str, j2);
        }
    }

    private ViewModelInstance(long j, CommandQueue commandQueue, long j2) {
        commandQueue.getClass();
        this.instanceHandle = j;
        this.riveWorker = commandQueue;
        this.fileHandle = j2;
        this.closeFlow = axal.e(0, 6);
        this.propertySubscriptions = new PropertySubscriptions(commandQueue, j, null);
        this.closer = new CloseOnce(ViewModelInstanceHandle.m583toStringimpl(j), new Function0() { // from class: app.rive.ViewModelInstance$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewModelInstance.closer$lambda$0(this.f$0);
            }
        });
        axae axaeVarD = axal.d(1, 1, 2);
        this._dirtyFlow = axaeVarD;
        this.dirtyFlow = axaeVarD;
        this.numberFlows = new LinkedHashMap();
        this.stringFlows = new LinkedHashMap();
        this.booleanFlows = new LinkedHashMap();
        this.enumFlows = new LinkedHashMap();
        this.colorFlows = new LinkedHashMap();
        this.triggerFlows = new LinkedHashMap();
    }

    static final awmy closer$lambda$0(final ViewModelInstance viewModelInstance) {
        viewModelInstance.closeFlow.b(awmy.a);
        try {
            viewModelInstance.propertySubscriptions.closeAll();
            return awmy.a;
        } finally {
            RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new Function0() { // from class: app.rive.ViewModelInstance$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ViewModelInstance.closer$lambda$0$0(this.f$0);
                }
            });
            viewModelInstance.riveWorker.m422deleteViewModelInstancemBajs_U(viewModelInstance.instanceHandle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closer$lambda$0$0(ViewModelInstance viewModelInstance) {
        return "Deleting " + ViewModelInstanceHandle.m583toStringimpl(viewModelInstance.instanceHandle) + " (" + FileHandle.m533toStringimpl(viewModelInstance.fileHandle) + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final awzc completeWhenClosed(awzc awzcVar) {
        return awqx.u(new awyy(new AnonymousClass1(awzcVar, this, null), awov.a, -2, 1), 0, 1);
    }

    private final awzc getPropertyFlow(String str, Map map, awql awqlVar, axah axahVar, ViewModel.PropertyDataType propertyDataType) {
        this.closer.checkOpen();
        Object obj = map.get(str);
        if (obj == null) {
            awyv awyvVar = new awyv(new ViewModelInstance$getPropertyFlow$1$1(this, str, propertyDataType, axahVar, awqlVar, null));
            map.put(str, awyvVar);
            obj = awyvVar;
        }
        return (awzc) obj;
    }

    static final String setArtboard$lambda$1(String str, String str2, ViewModelInstance viewModelInstance) {
        return str + " for " + str2 + " (" + FileHandle.m533toStringimpl(viewModelInstance.fileHandle) + ')';
    }

    static final String setFont$lambda$1(String str, String str2, ViewModelInstance viewModelInstance) {
        return str + " for " + str2 + " (" + FileHandle.m533toStringimpl(viewModelInstance.fileHandle) + ')';
    }

    static final String setImage$lambda$1(String str, String str2, ViewModelInstance viewModelInstance) {
        return str + " for " + str2 + " (" + FileHandle.m533toStringimpl(viewModelInstance.fileHandle) + ')';
    }

    private final void setProperty(String str, Object obj, awql awqlVar) {
        this.closer.checkOpen();
        awqlVar.invoke(ViewModelInstanceHandle.m578boximpl(this.instanceHandle), str, obj);
        this._dirtyFlow.b(awmy.a);
    }

    static final String setViewModelInstance$lambda$0(ViewModelInstance viewModelInstance, String str, ViewModelInstance viewModelInstance2) {
        return "Assigning " + viewModelInstance + " to " + str + " (" + FileHandle.m533toStringimpl(viewModelInstance2.fileHandle) + ')';
    }

    public final void appendToList(String str, ViewModelInstance viewModelInstance) {
        str.getClass();
        viewModelInstance.getClass();
        this.closer.checkOpen();
        viewModelInstance.checkOpen$third_party_java_android_libs_rive_rive_android();
        viewModelInstance.requireOwnedBy$third_party_java_android_libs_rive_rive_android(this.riveWorker);
        this.riveWorker.m395appendToListY8k3COA(this.instanceHandle, str, viewModelInstance.instanceHandle);
        this._dirtyFlow.b(awmy.a);
    }

    public final void checkOpen$third_party_java_android_libs_rive_rive_android() {
        this.closer.checkOpen();
    }

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    public final void fireTrigger(String str) {
        str.getClass();
        this.closer.checkOpen();
        this.riveWorker.m428fireTriggerPropertyippgHXQ(this.instanceHandle, str);
        this._dirtyFlow.b(awmy.a);
    }

    public final awzc getBooleanFlow(String str) {
        str.getClass();
        this.closer.checkOpen();
        CommandQueue commandQueue = this.riveWorker;
        return getPropertyFlow(str, this.booleanFlows, new C00131(commandQueue), commandQueue.getBooleanPropertyFlow(), ViewModel.PropertyDataType.BOOLEAN);
    }

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    public final awzc getColorFlow(String str) {
        str.getClass();
        this.closer.checkOpen();
        CommandQueue commandQueue = this.riveWorker;
        return getPropertyFlow(str, this.colorFlows, new C00141(commandQueue), commandQueue.getColorPropertyFlow(), ViewModel.PropertyDataType.COLOR);
    }

    public final axah getDirtyFlow$third_party_java_android_libs_rive_rive_android() {
        return this.dirtyFlow;
    }

    public final awzc getEnumFlow(String str) {
        str.getClass();
        this.closer.checkOpen();
        CommandQueue commandQueue = this.riveWorker;
        return getPropertyFlow(str, this.enumFlows, new C00151(commandQueue), commandQueue.getEnumPropertyFlow(), ViewModel.PropertyDataType.ENUM);
    }

    /* JADX INFO: renamed from: getInstanceHandle-VPLto4w, reason: not valid java name */
    public final long m325getInstanceHandleVPLto4w() {
        return this.instanceHandle;
    }

    public final Object getListSize(String str, awoq awoqVar) {
        this.closer.checkOpen();
        return this.riveWorker.m438getListSizeiFQtAB8(this.instanceHandle, str, awoqVar);
    }

    public final Object getName(awoq awoqVar) {
        this.closer.checkOpen();
        return this.riveWorker.m442getViewModelInstanceNameippgHXQ(this.instanceHandle, awoqVar);
    }

    public final awzc getNumberFlow(String str) {
        str.getClass();
        this.closer.checkOpen();
        CommandQueue commandQueue = this.riveWorker;
        return getPropertyFlow(str, this.numberFlows, new C00161(commandQueue), commandQueue.getNumberPropertyFlow(), ViewModel.PropertyDataType.NUMBER);
    }

    public final awzc getStringFlow(String str) {
        str.getClass();
        this.closer.checkOpen();
        CommandQueue commandQueue = this.riveWorker;
        return getPropertyFlow(str, this.stringFlows, new C00171(commandQueue), commandQueue.getStringPropertyFlow(), ViewModel.PropertyDataType.STRING);
    }

    public final awzc getTriggerFlow(String str) {
        str.getClass();
        this.closer.checkOpen();
        Map map = this.triggerFlows;
        Object obj = map.get(str);
        if (obj == null) {
            awyv awyvVar = new awyv(new ViewModelInstance$getTriggerFlow$1$1(this, str, null));
            map.put(str, awyvVar);
            obj = awyvVar;
        }
        return (awzc) obj;
    }

    public final Object getViewModelName(awoq awoqVar) {
        this.closer.checkOpen();
        return this.riveWorker.m444getViewModelInstanceViewModelNameippgHXQ(this.instanceHandle, awoqVar);
    }

    public final void insertToListAtIndex(String str, int i, ViewModelInstance viewModelInstance) {
        str.getClass();
        viewModelInstance.getClass();
        this.closer.checkOpen();
        viewModelInstance.checkOpen$third_party_java_android_libs_rive_rive_android();
        viewModelInstance.requireOwnedBy$third_party_java_android_libs_rive_rive_android(this.riveWorker);
        this.riveWorker.m449insertToListAtIndex4ua1WBo(this.instanceHandle, str, i, viewModelInstance.instanceHandle);
        this._dirtyFlow.b(awmy.a);
    }

    public final void removeFromList(String str, ViewModelInstance viewModelInstance) {
        str.getClass();
        viewModelInstance.getClass();
        this.closer.checkOpen();
        viewModelInstance.checkOpen$third_party_java_android_libs_rive_rive_android();
        viewModelInstance.requireOwnedBy$third_party_java_android_libs_rive_rive_android(this.riveWorker);
        this.riveWorker.m460removeFromListY8k3COA(this.instanceHandle, str, viewModelInstance.instanceHandle);
        this._dirtyFlow.b(awmy.a);
    }

    public final void removeFromListAtIndex(String str, int i) {
        str.getClass();
        this.closer.checkOpen();
        this.riveWorker.m461removeFromListAtIndexiFQtAB8(this.instanceHandle, str, i);
        this._dirtyFlow.b(awmy.a);
    }

    public final void requireOwnedBy$third_party_java_android_libs_rive_rive_android(CommandQueue commandQueue) {
        commandQueue.getClass();
        if (this.riveWorker == commandQueue) {
            return;
        }
        throw new RiveIncompatibleResourceException("ViewModelInstance " + ViewModelInstanceHandle.m583toStringimpl(this.instanceHandle) + " is not owned by the required RiveWorker");
    }

    public final void setArtboard(final String str, Artboard artboard) {
        final String strConcat;
        str.getClass();
        this.closer.checkOpen();
        if (artboard != null) {
            artboard.checkOpen$third_party_java_android_libs_rive_rive_android();
            artboard.requireOwnedBy$third_party_java_android_libs_rive_rive_android(this.riveWorker);
            Objects.toString(artboard);
            strConcat = "Assigning ".concat(artboard.toString());
        } else {
            strConcat = "Clearing artboard";
        }
        RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new Function0() { // from class: app.rive.ViewModelInstance$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewModelInstance.setArtboard$lambda$1(strConcat, str, this);
            }
        });
        setProperty(str, artboard != null ? ArtboardHandle.m370boximpl(artboard.m269getArtboardHandlenSTdbJo()) : null, new AnonymousClass2(this.riveWorker));
    }

    public final void setBoolean(String str, boolean z) {
        str.getClass();
        setProperty(str, Boolean.valueOf(z), new C00181(this.riveWorker));
    }

    public final void setColor(String str, int i) {
        str.getClass();
        setProperty(str, Integer.valueOf(i), new C00191(this.riveWorker));
    }

    public final void setEnum(String str, String str2) {
        str.getClass();
        str2.getClass();
        setProperty(str, str2, new C00201(this.riveWorker));
    }

    public final void setFont(final String str, FontAsset fontAsset) {
        final String strConcat;
        str.getClass();
        this.closer.checkOpen();
        if (fontAsset != null) {
            fontAsset.checkOpen$third_party_java_android_libs_rive_rive_android();
            fontAsset.requireOwnedBy$third_party_java_android_libs_rive_rive_android(this.riveWorker);
            Objects.toString(fontAsset);
            strConcat = "Assigning ".concat(fontAsset.toString());
        } else {
            strConcat = "Clearing font";
        }
        RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new Function0() { // from class: app.rive.ViewModelInstance$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewModelInstance.setFont$lambda$1(strConcat, str, this);
            }
        });
        setProperty(str, fontAsset != null ? (FontHandle) fontAsset.getHandle() : null, new C00212(this.riveWorker));
    }

    public final void setImage(final String str, ImageAsset imageAsset) {
        final String strConcat;
        str.getClass();
        this.closer.checkOpen();
        if (imageAsset != null) {
            imageAsset.checkOpen$third_party_java_android_libs_rive_rive_android();
            imageAsset.requireOwnedBy$third_party_java_android_libs_rive_rive_android(this.riveWorker);
            Objects.toString(imageAsset);
            strConcat = "Assigning ".concat(imageAsset.toString());
        } else {
            strConcat = "Clearing image";
        }
        RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new Function0() { // from class: app.rive.ViewModelInstance$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewModelInstance.setImage$lambda$1(strConcat, str, this);
            }
        });
        setProperty(str, imageAsset != null ? (ImageHandle) imageAsset.getHandle() : null, new C00222(this.riveWorker));
    }

    public final void setNumber(String str, float f) {
        str.getClass();
        setProperty(str, Float.valueOf(f), new C00231(this.riveWorker));
    }

    public final void setString(String str, String str2) {
        str.getClass();
        str2.getClass();
        setProperty(str, str2, new C00241(this.riveWorker));
    }

    public final void setViewModelInstance(final String str, final ViewModelInstance viewModelInstance) {
        str.getClass();
        viewModelInstance.getClass();
        this.closer.checkOpen();
        viewModelInstance.checkOpen$third_party_java_android_libs_rive_rive_android();
        viewModelInstance.requireOwnedBy$third_party_java_android_libs_rive_rive_android(this.riveWorker);
        RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new Function0() { // from class: app.rive.ViewModelInstance$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewModelInstance.setViewModelInstance$lambda$0(this.f$0, str, this);
            }
        });
        setProperty(str, ViewModelInstanceHandle.m578boximpl(viewModelInstance.instanceHandle), new C00252(this.riveWorker));
    }

    public final void swapListItems(String str, int i, int i2) {
        str.getClass();
        this.closer.checkOpen();
        this.riveWorker.m483swapListItemsC5vwGj0(this.instanceHandle, str, i, i2);
        this._dirtyFlow.b(awmy.a);
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        static final String create$lambda$0(ViewModelInstanceSource viewModelInstanceSource, RiveFile riveFile) {
            return "Creating view model instance from source: " + viewModelInstanceSource + " (" + FileHandle.m533toStringimpl(riveFile.m289getFileHandleENT3xMk()) + ')';
        }

        static final String create$lambda$1(long j, ViewModelInstanceSource viewModelInstanceSource, RiveFile riveFile) {
            return "Created " + ViewModelInstanceHandle.m583toStringimpl(j) + " from source: " + viewModelInstanceSource + " (" + FileHandle.m533toStringimpl(riveFile.m289getFileHandleENT3xMk()) + ')';
        }

        static final String create$lambda$2(ViewModelInstanceSource viewModelInstanceSource, RiveFile riveFile) {
            return "View model instance creation was cancelled for source: " + viewModelInstanceSource + " (" + FileHandle.m533toStringimpl(riveFile.m289getFileHandleENT3xMk()) + ')';
        }

        static final String create$lambda$3(ViewModelInstanceSource viewModelInstanceSource, RiveFile riveFile) {
            return "Error creating view model instance from source: " + viewModelInstanceSource + " (" + FileHandle.m533toStringimpl(riveFile.m289getFileHandleENT3xMk()) + ')';
        }

        static final String fromFile$lambda$0(long j, ViewModelInstanceSource viewModelInstanceSource, RiveFile riveFile) {
            return "Created " + ViewModelInstanceHandle.m583toStringimpl(j) + " from source: " + viewModelInstanceSource + " (" + FileHandle.m533toStringimpl(riveFile.m289getFileHandleENT3xMk()) + ')';
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object create(final RiveFile riveFile, final ViewModelInstanceSource viewModelInstanceSource, awoq awoqVar) throws Exception {
            ViewModelInstance$Companion$create$1 viewModelInstance$Companion$create$1;
            if (awoqVar instanceof ViewModelInstance$Companion$create$1) {
                viewModelInstance$Companion$create$1 = (ViewModelInstance$Companion$create$1) awoqVar;
                int i = viewModelInstance$Companion$create$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    viewModelInstance$Companion$create$1.label = i - Integer.MIN_VALUE;
                } else {
                    viewModelInstance$Companion$create$1 = new ViewModelInstance$Companion$create$1(this, awoqVar);
                }
            } else {
                viewModelInstance$Companion$create$1 = new ViewModelInstance$Companion$create$1(this, awoqVar);
            }
            Object objM412createViewModelInstanceConfirmedWT1fHeI = viewModelInstance$Companion$create$1.result;
            awox awoxVar = awox.a;
            int i2 = viewModelInstance$Companion$create$1.label;
            try {
                if (i2 == 0) {
                    atqp.j(objM412createViewModelInstanceConfirmedWT1fHeI);
                    RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new Function0() { // from class: app.rive.ViewModelInstance$Companion$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ViewModelInstance.Companion.create$lambda$0(viewModelInstanceSource, riveFile);
                        }
                    });
                    riveFile.checkOpen$third_party_java_android_libs_rive_rive_android();
                    CommandQueue riveWorker = riveFile.getRiveWorker();
                    long jM289getFileHandleENT3xMk = riveFile.m289getFileHandleENT3xMk();
                    viewModelInstance$Companion$create$1.L$0 = riveFile;
                    viewModelInstance$Companion$create$1.L$1 = viewModelInstanceSource;
                    viewModelInstance$Companion$create$1.label = 1;
                    objM412createViewModelInstanceConfirmedWT1fHeI = riveWorker.m412createViewModelInstanceConfirmedWT1fHeI(jM289getFileHandleENT3xMk, viewModelInstanceSource, viewModelInstance$Companion$create$1);
                    if (objM412createViewModelInstanceConfirmedWT1fHeI == awoxVar) {
                        return awoxVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    viewModelInstanceSource = (ViewModelInstanceSource) viewModelInstance$Companion$create$1.L$1;
                    riveFile = (RiveFile) viewModelInstance$Companion$create$1.L$0;
                    atqp.j(objM412createViewModelInstanceConfirmedWT1fHeI);
                }
                final long jM584unboximpl = ((ViewModelInstanceHandle) objM412createViewModelInstanceConfirmedWT1fHeI).m584unboximpl();
                RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new Function0() { // from class: app.rive.ViewModelInstance$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ViewModelInstance.Companion.create$lambda$1(jM584unboximpl, viewModelInstanceSource, riveFile);
                    }
                });
                return new ViewModelInstance(jM584unboximpl, riveFile.getRiveWorker(), riveFile.m289getFileHandleENT3xMk(), null);
            } catch (CancellationException e) {
                RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new Function0() { // from class: app.rive.ViewModelInstance$Companion$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ViewModelInstance.Companion.create$lambda$2(viewModelInstanceSource, riveFile);
                    }
                });
                throw e;
            } catch (Exception e2) {
                RiveLog.INSTANCE.getLogger().e(ViewModelInstanceKt.VM_INSTANCE_TAG, e2, new Function0() { // from class: app.rive.ViewModelInstance$Companion$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ViewModelInstance.Companion.create$lambda$3(viewModelInstanceSource, riveFile);
                    }
                });
                throw e2;
            }
        }

        public final ViewModelInstance fromFile(final RiveFile riveFile, final ViewModelInstanceSource viewModelInstanceSource) {
            riveFile.getClass();
            viewModelInstanceSource.getClass();
            riveFile.checkOpen$third_party_java_android_libs_rive_rive_android();
            final long jM411createViewModelInstancej73Dd8U = riveFile.getRiveWorker().m411createViewModelInstancej73Dd8U(riveFile.m289getFileHandleENT3xMk(), viewModelInstanceSource);
            RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new Function0() { // from class: app.rive.ViewModelInstance$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ViewModelInstance.Companion.fromFile$lambda$0(jM411createViewModelInstancej73Dd8U, viewModelInstanceSource, riveFile);
                }
            });
            return new ViewModelInstance(jM411createViewModelInstancej73Dd8U, riveFile.getRiveWorker(), riveFile.m289getFileHandleENT3xMk(), null);
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }

    public /* synthetic */ ViewModelInstance(long j, CommandQueue commandQueue, long j2, awqx awqxVar) {
        this(j, commandQueue, j2);
    }
}
