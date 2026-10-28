package com.google.android.apps.youtube.music.blocks;

import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.blocks.runtime.ContainerInstanceProxy;
import com.google.android.libraries.blocks.runtime.JavaRuntime;
import defpackage.asbq;
import defpackage.asbr;
import defpackage.glz;
import defpackage.gma;
import defpackage.maz;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class YoutubeActivityAccountContainer implements maz {
    private final TreeMap a;

    public YoutubeActivityAccountContainer(gma gmaVar) {
        TreeMap treeMap = new TreeMap();
        this.a = treeMap;
        treeMap.put(619481007, new JavaRuntime.DefaultNativeInstanceProxyCreator(new glz(gmaVar, 10)));
    }

    private final int[] e() {
        TreeMap treeMap = this.a;
        int[] iArr = new int[treeMap.size()];
        Iterator it = treeMap.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    private native long nativeCreateContainer(byte[] bArr, int[] iArr, JavaRuntime.NativeInstanceProxyCreator[] nativeInstanceProxyCreatorArr, long j);

    private native long nativeCreateContainerWithManifest(byte[] bArr, byte[] bArr2, int[] iArr, JavaRuntime.NativeInstanceProxyCreator[] nativeInstanceProxyCreatorArr, long j);

    @Override // defpackage.maz
    public final /* synthetic */ int a() {
        return 1242;
    }

    @Override // defpackage.maz
    public final Container b(asbq asbqVar) {
        return c(asbqVar, null);
    }

    @Override // defpackage.maz
    public final Container c(asbq asbqVar, Container container) {
        return new Container(new ContainerInstanceProxy(nativeCreateContainer(asbqVar.toByteArray(), e(), (JavaRuntime.NativeInstanceProxyCreator[]) this.a.values().toArray(new JavaRuntime.NativeInstanceProxyCreator[0]), container != null ? container.getNativeContainerInstance() : 0L)));
    }

    @Override // defpackage.maz
    public final Container d(asbq asbqVar, asbr asbrVar, Container container) {
        return new Container(new ContainerInstanceProxy(nativeCreateContainerWithManifest(asbqVar.toByteArray(), asbrVar.toByteArray(), e(), (JavaRuntime.NativeInstanceProxyCreator[]) this.a.values().toArray(new JavaRuntime.NativeInstanceProxyCreator[0]), container != null ? container.getNativeContainerInstance() : 0L)));
    }
}
