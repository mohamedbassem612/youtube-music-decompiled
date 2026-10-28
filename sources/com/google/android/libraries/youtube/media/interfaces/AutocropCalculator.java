package com.google.android.libraries.youtube.media.interfaces;

import com.google.protos.youtube.api.innertube.AutocropConfigOuterClass$AutocropConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AutocropCalculator {

    /* JADX INFO: compiled from: PG */
    final class CppProxy extends AutocropCalculator {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public static native AutocropCalculator create();

        public static native void nativeDestroy(long j);

        private native AutocropFrame native_calculateFrame(long j, Time time, AutocropFormat autocropFormat);

        private native void native_setAutocropConfig(long j, AutocropConfigOuterClass$AutocropConfig autocropConfigOuterClass$AutocropConfig);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.AutocropCalculator
        public AutocropFrame calculateFrame(Time time, AutocropFormat autocropFormat) {
            return native_calculateFrame(this.nativeRef, time, autocropFormat);
        }

        protected void finalize() throws Throwable {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.youtube.media.interfaces.AutocropCalculator
        public void setAutocropConfig(AutocropConfigOuterClass$AutocropConfig autocropConfigOuterClass$AutocropConfig) {
            native_setAutocropConfig(this.nativeRef, autocropConfigOuterClass$AutocropConfig);
        }
    }

    public static AutocropCalculator create() {
        return CppProxy.create();
    }

    public abstract AutocropFrame calculateFrame(Time time, AutocropFormat autocropFormat);

    public abstract void setAutocropConfig(AutocropConfigOuterClass$AutocropConfig autocropConfigOuterClass$AutocropConfig);
}
