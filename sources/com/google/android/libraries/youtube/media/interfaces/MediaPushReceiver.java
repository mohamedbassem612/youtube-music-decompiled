package com.google.android.libraries.youtube.media.interfaces;

import com.google.android.apps.youtube.proto.FormatInitializationMetadataOuterClass$FormatInitializationMetadata;
import com.google.android.apps.youtube.proto.MediaHeaderOuterClass$MediaHeader;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MediaPushReceiver {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends MediaPushReceiver {
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

        private native void native_donePushing(long j, QoeError qoeError, boolean z);

        private native void native_pushFormatInitializationMetadata(long j, FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata);

        private native void native_pushSegmentCompleted(long j);

        private native void native_pushSegmentData(long j, ByteBuffer byteBuffer);

        private native void native_startPushSegment(long j, MediaHeaderOuterClass$MediaHeader mediaHeaderOuterClass$MediaHeader);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver
        public void donePushing(QoeError qoeError, boolean z) {
            native_donePushing(this.nativeRef, qoeError, z);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver
        public void pushFormatInitializationMetadata(FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata) {
            native_pushFormatInitializationMetadata(this.nativeRef, formatInitializationMetadataOuterClass$FormatInitializationMetadata);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver
        public void pushSegmentCompleted() {
            native_pushSegmentCompleted(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver
        public void pushSegmentData(ByteBuffer byteBuffer) {
            native_pushSegmentData(this.nativeRef, byteBuffer);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.MediaPushReceiver
        public void startPushSegment(MediaHeaderOuterClass$MediaHeader mediaHeaderOuterClass$MediaHeader) {
            native_startPushSegment(this.nativeRef, mediaHeaderOuterClass$MediaHeader);
        }
    }

    public abstract void donePushing(QoeError qoeError, boolean z);

    public abstract void pushFormatInitializationMetadata(FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadata);

    public abstract void pushSegmentCompleted();

    public abstract void pushSegmentData(ByteBuffer byteBuffer);

    public abstract void startPushSegment(MediaHeaderOuterClass$MediaHeader mediaHeaderOuterClass$MediaHeader);
}
