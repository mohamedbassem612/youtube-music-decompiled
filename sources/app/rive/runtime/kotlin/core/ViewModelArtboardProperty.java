package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.RiveException;
import defpackage.awmy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelArtboardProperty extends ViewModelProperty {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelArtboardProperty(long j, ReentrantLock reentrantLock) {
        super(j, reentrantLock);
        reentrantLock.getClass();
    }

    private final native void cppSetArtboard(long j, long j2, long j3);

    private final native void cppSetBindableArtboard(long j, long j2, long j3);

    static final awmy pollChanges$lambda$0(ViewModelArtboardProperty viewModelArtboardProperty) {
        super.pollChanges$third_party_java_android_libs_rive_rive_android();
        List dependencies = viewModelArtboardProperty.getDependencies();
        ArrayList arrayList = new ArrayList();
        for (Object obj : dependencies) {
            if (obj instanceof BindableArtboard) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ViewModelInstance viewModelInstance = ((BindableArtboard) it.next()).getViewModelInstance();
            if (viewModelInstance != null) {
                viewModelInstance.pollChanges$third_party_java_android_libs_rive_rive_android();
            }
        }
        return awmy.a;
    }

    static final awmy set$lambda$0(Artboard artboard, ViewModelArtboardProperty viewModelArtboardProperty) throws RiveException {
        if (!artboard.getHasCppObject()) {
            throw new RiveException("Cannot set a disposed Artboard to a ViewModelArtboardProperty.");
        }
        if (artboard.getFile$third_party_java_android_libs_rive_rive_android() == null) {
            throw new RiveException("Cannot set an Artboard with no File reference to a ViewModelArtboardProperty.");
        }
        File file$third_party_java_android_libs_rive_rive_android = artboard.getFile$third_party_java_android_libs_rive_rive_android();
        file$third_party_java_android_libs_rive_rive_android.getClass();
        if (!file$third_party_java_android_libs_rive_rive_android.getHasCppObject()) {
            throw new RiveException("Cannot set an Artboard whose File has been disposed to a ViewModelArtboardProperty.");
        }
        long cppPointer = viewModelArtboardProperty.getCppPointer();
        File file$third_party_java_android_libs_rive_rive_android2 = artboard.getFile$third_party_java_android_libs_rive_rive_android();
        file$third_party_java_android_libs_rive_rive_android2.getClass();
        viewModelArtboardProperty.cppSetArtboard(cppPointer, file$third_party_java_android_libs_rive_rive_android2.getCppPointer(), artboard.getCppPointer());
        return awmy.a;
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ Object nativeGetValue() {
        return awmy.a;
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void pollChanges$third_party_java_android_libs_rive_rive_android() {
        withLock(new Function0() { // from class: app.rive.runtime.kotlin.core.ViewModelArtboardProperty$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewModelArtboardProperty.pollChanges$lambda$0(this.f$0);
            }
        });
    }

    public final void set(BindableArtboard bindableArtboard) {
        ReentrantLock fileLock = getFileLock();
        ViewModelInstance viewModelInstance = bindableArtboard != null ? bindableArtboard.getViewModelInstance() : null;
        if (viewModelInstance != null) {
            viewModelInstance.updateFileLock$third_party_java_android_libs_rive_rive_android(fileLock);
        }
        synchronized (fileLock) {
            cppSetBindableArtboard(getCppPointer(), bindableArtboard != null ? bindableArtboard.getCppPointer() : 0L, viewModelInstance != null ? viewModelInstance.getCppPointer() : 0L);
            List dependencies = getDependencies();
            ArrayList<BindableArtboard> arrayList = new ArrayList();
            for (Object obj : dependencies) {
                if (obj instanceof BindableArtboard) {
                    arrayList.add(obj);
                }
            }
            for (BindableArtboard bindableArtboard2 : arrayList) {
                bindableArtboard2.release();
                getDependencies().remove(bindableArtboard2);
            }
            if (bindableArtboard != null) {
                bindableArtboard.acquire();
                getDependencies().add(bindableArtboard);
            }
        }
    }

    /* JADX INFO: renamed from: nativeGetValue, reason: collision with other method in class */
    protected void m590nativeGetValue() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(awmy awmyVar) {
        awmyVar.getClass();
    }

    public final void set(final Artboard artboard) {
        artboard.getClass();
        withLock(new Function0() { // from class: app.rive.runtime.kotlin.core.ViewModelArtboardProperty$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ViewModelArtboardProperty.set$lambda$0(artboard, this);
            }
        });
    }
}
