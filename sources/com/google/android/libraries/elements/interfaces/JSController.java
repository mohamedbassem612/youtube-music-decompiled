package com.google.android.libraries.elements.interfaces;

import com.google.android.libraries.youtube.client.mobile.executor.JsExecutor;
import com.google.protos.youtube.elements.ExecuteJsFunctionCommand$ExecuteJSFunctionCommand;
import com.youtube.android.libraries.elements.StatusOr;
import defpackage.agp;
import defpackage.nuz;
import io.grpc.Status;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class JSController {
    private static final agp proxyMap = new agp(6);

    public static JSController create(PerformanceLogger performanceLogger, ClientErrorLoggerAdapter clientErrorLoggerAdapter, JSModuleCache jSModuleCache, ExecutorRegistry executorRegistry, JSControllerConfig jSControllerConfig) {
        return CppProxy.create(performanceLogger, clientErrorLoggerAdapter, jSModuleCache, executorRegistry, jSControllerConfig);
    }

    private static CppProxy createProxy(long j) {
        CppProxy existingProxy = getExistingProxy(j);
        if (existingProxy != null) {
            return existingProxy;
        }
        CppProxy cppProxy = new CppProxy(j, null);
        proxyMap.d(j, new WeakReference(cppProxy));
        return cppProxy;
    }

    private static CppProxy getExistingProxy(long j) {
        agp agpVar = proxyMap;
        WeakReference weakReference = (WeakReference) agpVar.a(j);
        if (weakReference == null) {
            return null;
        }
        CppProxy cppProxy = (CppProxy) weakReference.get();
        if (cppProxy != null) {
            return cppProxy;
        }
        agpVar.e(j);
        return null;
    }

    public abstract boolean controllerCanBeCreated(String str);

    public abstract boolean controllerIsInitialized(String str);

    public abstract Status createController(String str);

    public abstract Status destroyAndUnregisterController(String str);

    public abstract StatusOr executeFfiFunction(String str, String str2, byte[] bArr);

    public abstract void executeFunction(ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand, byte[] bArr, ByteStore byteStore, JSCommandResolver jSCommandResolver, JSCommandData jSCommandData, JSFutureHandler jSFutureHandler);

    public abstract Status executePreloadInstruction(byte[] bArr);

    public abstract JSControllerConfig getConfig();

    public abstract JsExecutor getJsExecutor();

    public abstract Status loadModulesForCommand(ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand);

    public abstract Status notifyModelUpdate(String str);

    public abstract void onControllerInitialized(String str, JSFutureHandler jSFutureHandler);

    public abstract void prewarmExecutor(boolean z);

    public abstract Status registerController(ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand, ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand2, ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand3, ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand4, boolean z, JSStateHolder jSStateHolder, JSCommandResolver jSCommandResolver, JSBlocksContainerProvider jSBlocksContainerProvider, String str);

    public abstract void registerFunctionBinding(int i, JSFunctionBinding jSFunctionBinding);

    public abstract void setDebuggerClient(DebuggerClient debuggerClient);

    public abstract void setPreloader(ResourcePreloader resourcePreloader);

    public abstract void updateCommandResolver(String str, JSCommandResolver jSCommandResolver);

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends JSController {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        private CppProxy(long j) {
            this.destroyed = new AtomicBoolean(false);
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native JSController create(PerformanceLogger performanceLogger, ClientErrorLoggerAdapter clientErrorLoggerAdapter, JSModuleCache jSModuleCache, ExecutorRegistry executorRegistry, JSControllerConfig jSControllerConfig);

        public static native void nativeDestroy(long j);

        private native boolean native_controllerCanBeCreated(long j, String str);

        private native boolean native_controllerIsInitialized(long j, String str);

        private native Status native_createController(long j, String str);

        private native Status native_destroyAndUnregisterController(long j, String str);

        private native StatusOr native_executeFfiFunction(long j, String str, String str2, byte[] bArr);

        private native void native_executeFunction(long j, ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand, byte[] bArr, ByteStore byteStore, JSCommandResolver jSCommandResolver, JSCommandData jSCommandData, JSFutureHandler jSFutureHandler);

        private native Status native_executePreloadInstruction(long j, byte[] bArr);

        private native JSControllerConfig native_getConfig(long j);

        private native JsExecutor native_getJsExecutor(long j);

        private native Status native_loadModulesForCommand(long j, ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand);

        private native Status native_notifyModelUpdate(long j, String str);

        private native void native_onControllerInitialized(long j, String str, JSFutureHandler jSFutureHandler);

        private native void native_prewarmExecutor(long j, boolean z);

        private native Status native_registerController(long j, ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand, ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand2, ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand3, ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand4, boolean z, JSStateHolder jSStateHolder, JSCommandResolver jSCommandResolver, JSBlocksContainerProvider jSBlocksContainerProvider, String str);

        private native void native_registerFunctionBinding(long j, int i, JSFunctionBinding jSFunctionBinding);

        private native void native_setDebuggerClient(long j, DebuggerClient debuggerClient);

        private native void native_setPreloader(long j, ResourcePreloader resourcePreloader);

        private native void native_updateCommandResolver(long j, String str, JSCommandResolver jSCommandResolver);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public boolean controllerCanBeCreated(String str) {
            return native_controllerCanBeCreated(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public boolean controllerIsInitialized(String str) {
            return native_controllerIsInitialized(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public Status createController(String str) {
            return native_createController(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public Status destroyAndUnregisterController(String str) {
            return native_destroyAndUnregisterController(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public StatusOr executeFfiFunction(String str, String str2, byte[] bArr) {
            return native_executeFfiFunction(this.nativeRef, str, str2, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public void executeFunction(ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand, byte[] bArr, ByteStore byteStore, JSCommandResolver jSCommandResolver, JSCommandData jSCommandData, JSFutureHandler jSFutureHandler) {
            native_executeFunction(this.nativeRef, executeJsFunctionCommand$ExecuteJSFunctionCommand, bArr, byteStore, jSCommandResolver, jSCommandData, jSFutureHandler);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public Status executePreloadInstruction(byte[] bArr) {
            return native_executePreloadInstruction(this.nativeRef, bArr);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public JSControllerConfig getConfig() {
            return native_getConfig(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public JsExecutor getJsExecutor() {
            return native_getJsExecutor(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public Status loadModulesForCommand(ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand) {
            return native_loadModulesForCommand(this.nativeRef, executeJsFunctionCommand$ExecuteJSFunctionCommand);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public Status notifyModelUpdate(String str) {
            return native_notifyModelUpdate(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public void onControllerInitialized(String str, JSFutureHandler jSFutureHandler) {
            native_onControllerInitialized(this.nativeRef, str, jSFutureHandler);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public void prewarmExecutor(boolean z) {
            native_prewarmExecutor(this.nativeRef, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public Status registerController(ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand, ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand2, ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand3, ExecuteJsFunctionCommand$ExecuteJSFunctionCommand executeJsFunctionCommand$ExecuteJSFunctionCommand4, boolean z, JSStateHolder jSStateHolder, JSCommandResolver jSCommandResolver, JSBlocksContainerProvider jSBlocksContainerProvider, String str) {
            return native_registerController(this.nativeRef, executeJsFunctionCommand$ExecuteJSFunctionCommand, executeJsFunctionCommand$ExecuteJSFunctionCommand2, executeJsFunctionCommand$ExecuteJSFunctionCommand3, executeJsFunctionCommand$ExecuteJSFunctionCommand4, z, jSStateHolder, jSCommandResolver, jSBlocksContainerProvider, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public void registerFunctionBinding(int i, JSFunctionBinding jSFunctionBinding) {
            native_registerFunctionBinding(this.nativeRef, i, jSFunctionBinding);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public void setDebuggerClient(DebuggerClient debuggerClient) {
            native_setDebuggerClient(this.nativeRef, debuggerClient);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public void setPreloader(ResourcePreloader resourcePreloader) {
            native_setPreloader(this.nativeRef, resourcePreloader);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public void updateCommandResolver(String str, JSCommandResolver jSCommandResolver) {
            native_updateCommandResolver(this.nativeRef, str, jSCommandResolver);
        }

        public /* synthetic */ CppProxy(long j, nuz nuzVar) {
            this(j);
        }
    }
}
