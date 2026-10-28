package app.rive.runtime.kotlin.core;

import defpackage.awmy;
import defpackage.awrc;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelListProperty extends ViewModelProperty {
    public static final int $stable = 8;
    private Map cachedItems;

    /* JADX INFO: compiled from: PG */
    final class CacheEntry {
        private int count;
        private final ViewModelInstance instance;

        public CacheEntry(ViewModelInstance viewModelInstance, int i) {
            viewModelInstance.getClass();
            this.instance = viewModelInstance;
            this.count = i;
        }

        public static /* synthetic */ CacheEntry copy$default(CacheEntry cacheEntry, ViewModelInstance viewModelInstance, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                viewModelInstance = cacheEntry.instance;
            }
            if ((i2 & 2) != 0) {
                i = cacheEntry.count;
            }
            return cacheEntry.copy(viewModelInstance, i);
        }

        public final ViewModelInstance component1() {
            return this.instance;
        }

        public final int component2() {
            return this.count;
        }

        public final CacheEntry copy(ViewModelInstance viewModelInstance, int i) {
            viewModelInstance.getClass();
            return new CacheEntry(viewModelInstance, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CacheEntry) {
                CacheEntry cacheEntry = (CacheEntry) obj;
                if (awrc.c(this.instance, cacheEntry.instance) && this.count == cacheEntry.count) {
                    return true;
                }
            }
            return false;
        }

        public final int getCount() {
            return this.count;
        }

        public final ViewModelInstance getInstance() {
            return this.instance;
        }

        public int hashCode() {
            return (this.instance.hashCode() * 31) + this.count;
        }

        public final void setCount(int i) {
            this.count = i;
        }

        public String toString() {
            return "CacheEntry(instance=" + this.instance + ", count=" + this.count + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelListProperty(long j, ReentrantLock reentrantLock) {
        super(j, reentrantLock);
        reentrantLock.getClass();
        this.cachedItems = new LinkedHashMap();
    }

    private final void boundsCheck(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("Index out of bounds for ViewModelListProperty.");
        }
    }

    private final native void cppAdd(long j, long j2);

    private final native void cppAddAt(long j, int i, long j2);

    static final awmy cppDelete$lambda$0(ViewModelListProperty viewModelListProperty, long j) {
        super.cppDelete(j);
        Iterator it = viewModelListProperty.cachedItems.values().iterator();
        while (it.hasNext()) {
            ((CacheEntry) it.next()).getInstance().release();
        }
        viewModelListProperty.cachedItems.clear();
        return awmy.a;
    }

    private final native long cppElementAt(long j, int i);

    private final native void cppRemove(long j, long j2);

    private final native void cppRemoveAt(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public final native int cppSize(long j);

    private final native void cppSwap(long j, int i, int i2);

    static final ViewModelInstance elementAt$lambda$0(ViewModelListProperty viewModelListProperty, int i) {
        ViewModelInstance cacheEntry;
        viewModelListProperty.boundsCheck(i);
        long jCppElementAt = viewModelListProperty.cppElementAt(viewModelListProperty.getCppPointer(), i);
        Map map = viewModelListProperty.cachedItems;
        Long lValueOf = Long.valueOf(jCppElementAt);
        CacheEntry cacheEntry2 = (CacheEntry) map.get(lValueOf);
        if (cacheEntry2 != null && (cacheEntry = cacheEntry2.getInstance()) != null) {
            return cacheEntry;
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppElementAt, viewModelListProperty.getFileLock());
        viewModelListProperty.cachedItems.put(lValueOf, new CacheEntry(viewModelInstance, 1));
        return viewModelInstance;
    }

    static final awmy pollChanges$lambda$0(ViewModelListProperty viewModelListProperty) {
        super.pollChanges$third_party_java_android_libs_rive_rive_android();
        Iterator it = viewModelListProperty.cachedItems.values().iterator();
        while (it.hasNext()) {
            ((CacheEntry) it.next()).getInstance().pollChanges$third_party_java_android_libs_rive_rive_android();
        }
        return awmy.a;
    }

    static final awmy remove$lambda$0(ViewModelInstance viewModelInstance, ViewModelListProperty viewModelListProperty) {
        if (!viewModelInstance.getHasCppObject()) {
            throw new IllegalArgumentException("Cannot remove a disposed ViewModelProperty from ViewModelListProperty.");
        }
        CacheEntry cacheEntry = (CacheEntry) viewModelListProperty.cachedItems.remove(Long.valueOf(viewModelInstance.getCppPointer()));
        if (cacheEntry != null) {
            cacheEntry.getInstance().release();
        }
        viewModelListProperty.cppRemove(viewModelListProperty.getCppPointer(), viewModelInstance.getCppPointer());
        return awmy.a;
    }

    static final awmy removeAt$lambda$0(ViewModelListProperty viewModelListProperty, int i) {
        CacheEntry cacheEntry;
        viewModelListProperty.boundsCheck(i);
        long jCppElementAt = viewModelListProperty.cppElementAt(viewModelListProperty.getCppPointer(), i);
        Map map = viewModelListProperty.cachedItems;
        Long lValueOf = Long.valueOf(jCppElementAt);
        CacheEntry cacheEntry2 = (CacheEntry) map.get(lValueOf);
        if (cacheEntry2 != null) {
            cacheEntry2.setCount(cacheEntry2.getCount() - 1);
            if (cacheEntry2.getCount() == 0 && (cacheEntry = (CacheEntry) viewModelListProperty.cachedItems.remove(lValueOf)) != null) {
                cacheEntry.getInstance().release();
            }
        }
        viewModelListProperty.cppRemoveAt(viewModelListProperty.getCppPointer(), i);
        return awmy.a;
    }

    static final awmy swap$lambda$0(ViewModelListProperty viewModelListProperty, int i, int i2) {
        viewModelListProperty.boundsCheck(i);
        viewModelListProperty.boundsCheck(i2);
        if (i == i2) {
            return awmy.a;
        }
        viewModelListProperty.cppSwap(viewModelListProperty.getCppPointer(), i, i2);
        return awmy.a;
    }

    public final void add(int i, ViewModelInstance viewModelInstance) {
        viewModelInstance.getClass();
        if (!viewModelInstance.getHasCppObject()) {
            throw new IllegalArgumentException("Cannot add a disposed ViewModelProperty to ViewModelListProperty.");
        }
        ReentrantLock fileLock = getFileLock();
        viewModelInstance.updateFileLock$third_party_java_android_libs_rive_rive_android(fileLock);
        synchronized (fileLock) {
            boundsCheck(i, cppSize(getCppPointer()));
            Map map = this.cachedItems;
            Long lValueOf = Long.valueOf(viewModelInstance.getCppPointer());
            Object cacheEntry = map.get(lValueOf);
            if (cacheEntry == null) {
                viewModelInstance.acquire();
                cacheEntry = new CacheEntry(viewModelInstance, 0);
                map.put(lValueOf, cacheEntry);
            }
            CacheEntry cacheEntry2 = (CacheEntry) cacheEntry;
            cacheEntry2.setCount(cacheEntry2.getCount() + 1);
            cppAddAt(getCppPointer(), i, viewModelInstance.getCppPointer());
        }
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public void cppDelete(final long j) {
        withLock(new Function0() { // from class: app.rive.runtime.kotlin.core.ViewModelListProperty$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewModelListProperty.cppDelete$lambda$0(this.f$0, j);
            }
        });
    }

    public final ViewModelInstance elementAt(final int i) {
        return (ViewModelInstance) withLock(new Function0() { // from class: app.rive.runtime.kotlin.core.ViewModelListProperty$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewModelListProperty.elementAt$lambda$0(this.f$0, i);
            }
        });
    }

    public final ViewModelInstance get(int i) {
        return elementAt(i);
    }

    public final int getSize() {
        return ((Number) withLock(new Function0() { // from class: app.rive.runtime.kotlin.core.ViewModelListProperty$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelListProperty viewModelListProperty = this.f$0;
                return Integer.valueOf(viewModelListProperty.cppSize(viewModelListProperty.getCppPointer()));
            }
        })).intValue();
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ Object nativeGetValue() {
        return awmy.a;
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void pollChanges$third_party_java_android_libs_rive_rive_android() {
        withLock(new Function0() { // from class: app.rive.runtime.kotlin.core.ViewModelListProperty$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewModelListProperty.pollChanges$lambda$0(this.f$0);
            }
        });
    }

    public final void remove(final ViewModelInstance viewModelInstance) {
        viewModelInstance.getClass();
        withLock(new Function0() { // from class: app.rive.runtime.kotlin.core.ViewModelListProperty$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewModelListProperty.remove$lambda$0(viewModelInstance, this);
            }
        });
    }

    public final void removeAt(final int i) {
        withLock(new Function0() { // from class: app.rive.runtime.kotlin.core.ViewModelListProperty$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewModelListProperty.removeAt$lambda$0(this.f$0, i);
            }
        });
    }

    public final void swap(final int i, final int i2) {
        withLock(new Function0() { // from class: app.rive.runtime.kotlin.core.ViewModelListProperty$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewModelListProperty.swap$lambda$0(this.f$0, i, i2);
            }
        });
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0094 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x00d6 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0137 */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateFileLock$third_party_java_android_libs_rive_rive_android(java.util.concurrent.locks.ReentrantLock r8) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.rive.runtime.kotlin.core.ViewModelListProperty.updateFileLock$third_party_java_android_libs_rive_rive_android(java.util.concurrent.locks.ReentrantLock):void");
    }

    /* JADX INFO: renamed from: nativeGetValue, reason: collision with other method in class */
    protected void m592nativeGetValue() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(awmy awmyVar) {
        awmyVar.getClass();
    }

    private final void boundsCheck(int i) {
        boundsCheck(i, getSize());
    }

    public final void add(ViewModelInstance viewModelInstance) {
        viewModelInstance.getClass();
        if (viewModelInstance.getHasCppObject()) {
            ReentrantLock fileLock = getFileLock();
            viewModelInstance.updateFileLock$third_party_java_android_libs_rive_rive_android(fileLock);
            synchronized (fileLock) {
                Map map = this.cachedItems;
                Long lValueOf = Long.valueOf(viewModelInstance.getCppPointer());
                Object cacheEntry = map.get(lValueOf);
                if (cacheEntry == null) {
                    viewModelInstance.acquire();
                    cacheEntry = new CacheEntry(viewModelInstance, 0);
                    map.put(lValueOf, cacheEntry);
                }
                CacheEntry cacheEntry2 = (CacheEntry) cacheEntry;
                cacheEntry2.setCount(cacheEntry2.getCount() + 1);
                cppAdd(getCppPointer(), viewModelInstance.getCppPointer());
            }
            return;
        }
        throw new IllegalArgumentException("Cannot add a disposed ViewModelProperty to ViewModelListProperty.");
    }
}
