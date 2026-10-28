package com.google.android.libraries.youtube.composition.api;

import com.google.android.libraries.youtube.composition.common.concurrency.Callback;
import com.google.android.libraries.youtube.composition.common.types.StatusOr;
import com.google.protos.youtube.client.composition.runtime.api.ClientDescriptorProto$ClientDescriptor;
import com.google.protos.youtube.client.composition.runtime.api.ExportInputConfigProto$ExportInputConfig;
import com.google.protos.youtube.client.composition.runtime.api.ExportOutputConfigProto$ExportOutputConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ExporterBuilder {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends ExporterBuilder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native void nativeDestroy(long j);

        private native StatusOr native_build(long j);

        private native void native_setClientDescriptor(long j, ClientDescriptorProto$ClientDescriptor clientDescriptorProto$ClientDescriptor);

        private native void native_setEnableTimeoutWatchdog(long j, boolean z);

        private native void native_setExportAttemptId(long j, Long l);

        private native void native_setExportFilePath(long j, String str);

        private native void native_setExportProgressInterval(long j, float f);

        private native void native_setInputConfig(long j, ExportInputConfigProto$ExportInputConfig exportInputConfigProto$ExportInputConfig);

        private native void native_setOnExportProgressChanged(long j, Callback callback);

        private native void native_setOutputConfig(long j, ExportOutputConfigProto$ExportOutputConfig exportOutputConfigProto$ExportOutputConfig);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.ExporterBuilder
        public StatusOr build() {
            return native_build(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.composition.api.ExporterBuilder
        public void setClientDescriptor(ClientDescriptorProto$ClientDescriptor clientDescriptorProto$ClientDescriptor) {
            native_setClientDescriptor(this.nativeRef, clientDescriptorProto$ClientDescriptor);
        }

        @Override // com.google.android.libraries.youtube.composition.api.ExporterBuilder
        public void setEnableTimeoutWatchdog(boolean z) {
            native_setEnableTimeoutWatchdog(this.nativeRef, z);
        }

        @Override // com.google.android.libraries.youtube.composition.api.ExporterBuilder
        public void setExportAttemptId(Long l) {
            native_setExportAttemptId(this.nativeRef, l);
        }

        @Override // com.google.android.libraries.youtube.composition.api.ExporterBuilder
        public void setExportFilePath(String str) {
            native_setExportFilePath(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.youtube.composition.api.ExporterBuilder
        public void setExportProgressInterval(float f) {
            native_setExportProgressInterval(this.nativeRef, f);
        }

        @Override // com.google.android.libraries.youtube.composition.api.ExporterBuilder
        public void setInputConfig(ExportInputConfigProto$ExportInputConfig exportInputConfigProto$ExportInputConfig) {
            native_setInputConfig(this.nativeRef, exportInputConfigProto$ExportInputConfig);
        }

        @Override // com.google.android.libraries.youtube.composition.api.ExporterBuilder
        public void setOnExportProgressChanged(Callback callback) {
            native_setOnExportProgressChanged(this.nativeRef, callback);
        }

        @Override // com.google.android.libraries.youtube.composition.api.ExporterBuilder
        public void setOutputConfig(ExportOutputConfigProto$ExportOutputConfig exportOutputConfigProto$ExportOutputConfig) {
            native_setOutputConfig(this.nativeRef, exportOutputConfigProto$ExportOutputConfig);
        }
    }

    public abstract StatusOr build();

    public abstract void setClientDescriptor(ClientDescriptorProto$ClientDescriptor clientDescriptorProto$ClientDescriptor);

    public abstract void setEnableTimeoutWatchdog(boolean z);

    public abstract void setExportAttemptId(Long l);

    public abstract void setExportFilePath(String str);

    public abstract void setExportProgressInterval(float f);

    public abstract void setInputConfig(ExportInputConfigProto$ExportInputConfig exportInputConfigProto$ExportInputConfig);

    public abstract void setOnExportProgressChanged(Callback callback);

    public abstract void setOutputConfig(ExportOutputConfigProto$ExportOutputConfig exportOutputConfigProto$ExportOutputConfig);
}
