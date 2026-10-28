package com.google.android.libraries.video.mediaengine.logging;

import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.blocks.runtime.ContainerInstanceProxy;
import com.google.android.libraries.blocks.runtime.JavaRuntime;
import defpackage.asbq;
import defpackage.asbr;
import defpackage.glz;
import defpackage.gma;
import defpackage.hop;
import defpackage.hoq;
import defpackage.maz;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class QosContainer implements maz {
    private final JavaRuntime.ManifestLoader a;
    private final TreeMap b;

    public QosContainer(JavaRuntime.ManifestLoader manifestLoader, gma gmaVar, hoq hoqVar, hoq hoqVar2) {
        TreeMap treeMap = new TreeMap();
        this.b = treeMap;
        treeMap.put(385812507, new JavaRuntime.DefaultNativeInstanceProxyCreator(new glz(gmaVar, 6)));
        treeMap.put(414514912, new JavaRuntime.DefaultNativeInstanceProxyCreator(new hop(hoqVar, 2)));
        treeMap.put(464566978, new JavaRuntime.DefaultNativeInstanceProxyCreator(new hop(hoqVar2, 4)));
        this.a = manifestLoader;
    }

    private native long nativeCreateContainerWithManifest(byte[] bArr, byte[] bArr2, int[] iArr, JavaRuntime.NativeInstanceProxyCreator[] nativeInstanceProxyCreatorArr, long j);

    @Override // defpackage.maz
    public final /* synthetic */ int a() {
        return 413973697;
    }

    @Override // defpackage.maz
    public final Container b(asbq asbqVar) {
        return c(asbqVar, null);
    }

    @Override // defpackage.maz
    public final Container c(asbq asbqVar, Container container) {
        try {
            return d(asbqVar, this.a.a(), container);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.maz
    public final Container d(asbq asbqVar, asbr asbrVar, Container container) {
        long nativeContainerInstance = container != null ? container.getNativeContainerInstance() : 0L;
        byte[] byteArray = asbqVar.toByteArray();
        byte[] byteArray2 = asbrVar.toByteArray();
        TreeMap treeMap = this.b;
        int[] iArr = new int[treeMap.size()];
        Iterator it = treeMap.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return new Container(new ContainerInstanceProxy(nativeCreateContainerWithManifest(byteArray, byteArray2, iArr, (JavaRuntime.NativeInstanceProxyCreator[]) treeMap.values().toArray(new JavaRuntime.NativeInstanceProxyCreator[0]), nativeContainerInstance)));
    }
}
