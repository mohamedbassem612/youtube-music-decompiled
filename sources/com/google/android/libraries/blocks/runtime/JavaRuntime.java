package com.google.android.libraries.blocks.runtime;

import android.content.Context;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihn;
import defpackage.asbr;
import defpackage.may;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class JavaRuntime {

    /* JADX INFO: compiled from: PG */
    public final class AndroidManifestLoader implements ManifestLoader {
        private final Context a;

        public AndroidManifestLoader(Context context) {
            this.a = context;
        }

        @Override // com.google.android.libraries.blocks.runtime.JavaRuntime.ManifestLoader
        public final asbr a() throws IOException {
            return (asbr) aihn.parseFrom(asbr.a, this.a.getAssets().open("qos_container_manifest"), ExtensionRegistryLite.getGeneratedRegistry());
        }
    }

    /* JADX INFO: compiled from: PG */
    public interface InstanceProxyFactory {
        InstanceProxy a(may mayVar);

        InstanceProxy b(may mayVar);
    }

    /* JADX INFO: compiled from: PG */
    public interface JavaRegistration {
    }

    /* JADX INFO: compiled from: PG */
    public interface ManifestLoader {
        asbr a();
    }

    /* JADX INFO: compiled from: PG */
    public interface NativeInstanceProxyCreator {
        InstanceProxy create(long j, String str);

        InstanceProxy create(long j, String str, byte[] bArr);
    }

    private JavaRuntime() {
    }

    private native void nativeRegisterContainerManifest(byte[] bArr);

    public native void nativeRegister(int i, int i2, NativeInstanceProxyCreator nativeInstanceProxyCreator);

    /* JADX INFO: renamed from: com.google.android.libraries.blocks.runtime.JavaRuntime$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes3.dex */
    class AnonymousClass1 implements NativeInstanceProxyCreator {
        @Override // com.google.android.libraries.blocks.runtime.JavaRuntime.NativeInstanceProxyCreator
        public final InstanceProxy create(long j, String str) {
            throw null;
        }

        @Override // com.google.android.libraries.blocks.runtime.JavaRuntime.NativeInstanceProxyCreator
        public final InstanceProxy create(long j, String str, byte[] bArr) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class DefaultNativeInstanceProxyCreator implements NativeInstanceProxyCreator {
        private final InstanceProxyFactory a;

        public DefaultNativeInstanceProxyCreator(InstanceProxyFactory instanceProxyFactory) {
            this.a = instanceProxyFactory;
        }

        @Override // com.google.android.libraries.blocks.runtime.JavaRuntime.NativeInstanceProxyCreator
        public final InstanceProxy create(long j, String str) {
            return this.a.a(new may(new ClientCreatorProxy(j)));
        }

        @Override // com.google.android.libraries.blocks.runtime.JavaRuntime.NativeInstanceProxyCreator
        public final InstanceProxy create(long j, String str, byte[] bArr) {
            return this.a.b(new may(new ClientCreatorProxy(j)));
        }
    }
}
