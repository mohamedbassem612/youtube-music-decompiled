package com.google.android.apps.youtube.music.blocks;

import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.blocks.runtime.ContainerInstanceProxy;
import com.google.android.libraries.blocks.runtime.JavaRuntime;
import defpackage.asbq;
import defpackage.asbr;
import defpackage.glz;
import defpackage.gma;
import defpackage.maz;
import defpackage.mgw;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class YoutubeMusicProdContainer implements maz {
    private final TreeMap a;

    public YoutubeMusicProdContainer(gma gmaVar, gma gmaVar2, gma gmaVar3, gma gmaVar4, gma gmaVar5, gma gmaVar6, gma gmaVar7, gma gmaVar8, gma gmaVar9, gma gmaVar10) {
        TreeMap treeMap = new TreeMap();
        this.a = treeMap;
        treeMap.put(429754717, new JavaRuntime.DefaultNativeInstanceProxyCreator(new glz(gmaVar, 3)));
        treeMap.put(983280355, new JavaRuntime.DefaultNativeInstanceProxyCreator(new glz(gmaVar2, 4)));
        treeMap.put(395487482, new JavaRuntime.DefaultNativeInstanceProxyCreator(new glz(gmaVar3, 5)));
        treeMap.put(566747923, new JavaRuntime.DefaultNativeInstanceProxyCreator(new mgw(1)));
        treeMap.put(568245535, new JavaRuntime.DefaultNativeInstanceProxyCreator(new mgw(0)));
        treeMap.put(385812507, new JavaRuntime.DefaultNativeInstanceProxyCreator(new glz(gmaVar4, 6)));
        treeMap.put(382814680, new JavaRuntime.DefaultNativeInstanceProxyCreator(new glz(gmaVar5, 7)));
        treeMap.put(366354626, new JavaRuntime.DefaultNativeInstanceProxyCreator(new glz(gmaVar6, 8)));
        treeMap.put(824631238, new JavaRuntime.DefaultNativeInstanceProxyCreator(new mgw(2)));
        treeMap.put(427886809, new JavaRuntime.DefaultNativeInstanceProxyCreator(new glz(gmaVar7, 11)));
        treeMap.put(444687476, new JavaRuntime.DefaultNativeInstanceProxyCreator(new glz(gmaVar8, 12)));
        treeMap.put(467789049, new JavaRuntime.DefaultNativeInstanceProxyCreator(new glz(gmaVar9, 14)));
        treeMap.put(419837186, new JavaRuntime.DefaultNativeInstanceProxyCreator(new mgw(3)));
        treeMap.put(906540920, new JavaRuntime.DefaultNativeInstanceProxyCreator(new glz(gmaVar10, 15)));
        treeMap.put(859775155, new JavaRuntime.DefaultNativeInstanceProxyCreator(new mgw(4)));
        treeMap.put(797361349, new JavaRuntime.DefaultNativeInstanceProxyCreator(new mgw(5)));
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
        return 42;
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
