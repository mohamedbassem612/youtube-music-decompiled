package com.google.android.libraries.youtube.composition.api;

import com.google.protos.youtube.api.innertube.CompositionProto$Composition;
import com.google.protos.youtube.client.composition.runtime.api.ClientDescriptorProto$ClientDescriptor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C2paEmbedRequest {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends C2paEmbedRequest {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native C2paEmbedRequest create();

        public static native void nativeDestroy(long j);

        private native ClientDescriptorProto$ClientDescriptor native_getClientDescriptor(long j);

        private native CompositionProto$Composition native_getComposition(long j);

        private native String native_getFilePath(long j);

        private native C2paEmbedFileType native_getFileType(long j);

        private native TimestampOption native_getTimestampOption(long j);

        private native void native_setClientDescriptor(long j, ClientDescriptorProto$ClientDescriptor clientDescriptorProto$ClientDescriptor);

        private native void native_setComposition(long j, CompositionProto$Composition compositionProto$Composition);

        private native void native_setFilePath(long j, String str);

        private native void native_setFileType(long j, C2paEmbedFileType c2paEmbedFileType);

        private native void native_setTimestampOption(long j, TimestampOption timestampOption);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.composition.api.C2paEmbedRequest
        public ClientDescriptorProto$ClientDescriptor getClientDescriptor() {
            return native_getClientDescriptor(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.C2paEmbedRequest
        public CompositionProto$Composition getComposition() {
            return native_getComposition(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.C2paEmbedRequest
        public String getFilePath() {
            return native_getFilePath(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.C2paEmbedRequest
        public C2paEmbedFileType getFileType() {
            return native_getFileType(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.C2paEmbedRequest
        public TimestampOption getTimestampOption() {
            return native_getTimestampOption(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.composition.api.C2paEmbedRequest
        public void setClientDescriptor(ClientDescriptorProto$ClientDescriptor clientDescriptorProto$ClientDescriptor) {
            native_setClientDescriptor(this.nativeRef, clientDescriptorProto$ClientDescriptor);
        }

        @Override // com.google.android.libraries.youtube.composition.api.C2paEmbedRequest
        public void setComposition(CompositionProto$Composition compositionProto$Composition) {
            native_setComposition(this.nativeRef, compositionProto$Composition);
        }

        @Override // com.google.android.libraries.youtube.composition.api.C2paEmbedRequest
        public void setFilePath(String str) {
            native_setFilePath(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.youtube.composition.api.C2paEmbedRequest
        public void setFileType(C2paEmbedFileType c2paEmbedFileType) {
            native_setFileType(this.nativeRef, c2paEmbedFileType);
        }

        @Override // com.google.android.libraries.youtube.composition.api.C2paEmbedRequest
        public void setTimestampOption(TimestampOption timestampOption) {
            native_setTimestampOption(this.nativeRef, timestampOption);
        }
    }

    public static C2paEmbedRequest create() {
        return CppProxy.create();
    }

    public abstract ClientDescriptorProto$ClientDescriptor getClientDescriptor();

    public abstract CompositionProto$Composition getComposition();

    public abstract String getFilePath();

    public abstract C2paEmbedFileType getFileType();

    public abstract TimestampOption getTimestampOption();

    public abstract void setClientDescriptor(ClientDescriptorProto$ClientDescriptor clientDescriptorProto$ClientDescriptor);

    public abstract void setComposition(CompositionProto$Composition compositionProto$Composition);

    public abstract void setFilePath(String str);

    public abstract void setFileType(C2paEmbedFileType c2paEmbedFileType);

    public abstract void setTimestampOption(TimestampOption timestampOption);
}
