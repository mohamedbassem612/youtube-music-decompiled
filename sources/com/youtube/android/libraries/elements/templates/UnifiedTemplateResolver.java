package com.youtube.android.libraries.elements.templates;

import com.google.android.libraries.elements.interfaces.CapabilitiesStore;
import com.google.android.libraries.elements.interfaces.ClientTemplateProvider;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.PerformanceLogger;
import com.google.android.libraries.elements.interfaces.TemplateResolver;
import com.google.android.libraries.elements.interfaces.ThemeStore;
import com.google.android.libraries.elements.interfaces.WasmTemplateProvider;
import defpackage.meg;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class UnifiedTemplateResolver {
    public static byte[] a;
    private static final AtomicBoolean b;

    static {
        meg.a();
        b = new AtomicBoolean(false);
    }

    public UnifiedTemplateResolver(ClientTemplateProvider clientTemplateProvider, DebuggerClient debuggerClient, int i, int i2, WasmTemplateProvider wasmTemplateProvider, boolean z, PerformanceLogger performanceLogger, boolean z2, CapabilitiesStore capabilitiesStore, ThemeStore themeStore, boolean z3, boolean z4, boolean z5, boolean z6) {
        clientTemplateProvider.getClass();
        if (b.compareAndSet(false, true)) {
            if (i > 0) {
                a = new byte[i];
            }
            jni_init(clientTemplateProvider, debuggerClient, i2, wasmTemplateProvider, z, performanceLogger, z2, capabilitiesStore, themeStore, z3, z4, z5, z6);
        }
    }

    private native void jni_init(ClientTemplateProvider clientTemplateProvider, DebuggerClient debuggerClient, int i, WasmTemplateProvider wasmTemplateProvider, boolean z, PerformanceLogger performanceLogger, boolean z2, CapabilitiesStore capabilitiesStore, ThemeStore themeStore, boolean z3, boolean z4, boolean z5, boolean z6);

    private native Status jni_setFragment(String str, byte[] bArr);

    private native Status jni_setTemplateConfig(String str, byte[] bArr);

    private native Status jni_setWasmFragment(String str, byte[] bArr);

    public native TemplateResolver jni_getTemplateResolver();
}
