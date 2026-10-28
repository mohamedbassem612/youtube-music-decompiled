package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.ArtboardException;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import defpackage.a;
import defpackage.atqq;
import defpackage.awns;
import defpackage.awqx;
import defpackage.awrc;
import defpackage.awro;
import defpackage.awrz;
import defpackage.awsa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class File extends NativeObject {
    public static final int $stable = 8;
    private final ReentrantLock fileLock;
    private final RendererType rendererType;

    /* JADX INFO: compiled from: PG */
    public final class Enum {
        public static final int $stable = 8;
        private final String name;
        private final List values;

        public Enum(String str, List list) {
            str.getClass();
            list.getClass();
            this.name = str;
            this.values = list;
        }

        public static /* synthetic */ Enum copy$default(Enum r0, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.name;
            }
            if ((i & 2) != 0) {
                list = r0.values;
            }
            return r0.copy(str, list);
        }

        public final String component1() {
            return this.name;
        }

        public final List component2() {
            return this.values;
        }

        public final Enum copy(String str, List list) {
            str.getClass();
            list.getClass();
            return new Enum(str, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Enum) {
                Enum r5 = (Enum) obj;
                if (awrc.c(this.name, r5.name) && awrc.c(this.values, r5.values)) {
                    return true;
                }
            }
            return false;
        }

        public final String getName() {
            return this.name;
        }

        public final List getValues() {
            return this.values;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.values.hashCode();
        }

        public String toString() {
            return "Enum(name=" + this.name + ", values=" + this.values + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public File(byte[] bArr, RendererType rendererType, FileAssetLoader fileAssetLoader) {
        super(0L);
        bArr.getClass();
        rendererType.getClass();
        this.rendererType = rendererType;
        if (fileAssetLoader != null) {
            fileAssetLoader.setRendererType(rendererType);
            fileAssetLoader.acquire();
            getDependencies().add(fileAssetLoader);
        }
        setCppPointer(m589import(bArr, bArr.length, rendererType.getValue(), fileAssetLoader != null ? fileAssetLoader.getCppPointer() : 0L));
        getRefs().incrementAndGet();
        this.fileLock = new ReentrantLock();
    }

    private final native long cppArtboardByName(long j, String str);

    private final native int cppArtboardCount(long j);

    private final native String cppArtboardNameByIndex(long j, int i);

    private final native long cppCreateBindableArtboardByName(long j, String str);

    private final native long cppCreateDefaultBindableArtboard(long j);

    private final native long cppDefaultViewModelForArtboard(long j, long j2);

    private final native List cppEnums(long j);

    private final native long cppViewModelByIndex(long j, int i);

    private final native int cppViewModelCount(long j);

    public static /* synthetic */ BindableArtboard createBindableArtboardByName$default(File file, String str, ViewModelInstance viewModelInstance, int i, Object obj) {
        if ((i & 2) != 0) {
            viewModelInstance = null;
        }
        return file.createBindableArtboardByName(str, viewModelInstance);
    }

    public static /* synthetic */ BindableArtboard createDefaultBindableArtboard$default(File file, ViewModelInstance viewModelInstance, int i, Object obj) {
        if (1 == (i & 1)) {
            viewModelInstance = null;
        }
        return file.createDefaultBindableArtboard(viewModelInstance);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    private final native long m589import(byte[] bArr, int i, int i2, long j);

    public final Artboard artboard(String str) throws ArtboardException {
        str.getClass();
        long jCppArtboardByName = cppArtboardByName(getCppPointer(), str);
        if (jCppArtboardByName != 0) {
            Artboard artboard = new Artboard(jCppArtboardByName, this.fileLock, this);
            getDependencies().add(artboard);
            return artboard;
        }
        List artboardNames = getArtboardNames();
        ArrayList arrayList = new ArrayList(atqq.N(artboardNames, 10));
        Iterator it = artboardNames.iterator();
        while (it.hasNext()) {
            arrayList.add("\"" + ((String) it.next()) + '\"');
        }
        throw new ArtboardException("Artboard \"" + str + "\" not found. Available Artboards: " + arrayList);
    }

    protected final native long cppArtboardByIndex(long j, int i);

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j);

    protected final native long cppViewModelByName(long j, String str);

    public final BindableArtboard createBindableArtboardByName(String str, ViewModelInstance viewModelInstance) throws ArtboardException {
        str.getClass();
        long jCppCreateBindableArtboardByName = cppCreateBindableArtboardByName(getCppPointer(), str);
        if (jCppCreateBindableArtboardByName == 0) {
            throw new ArtboardException(a.bU((byte) 46, str, "No BindableArtboard found with name "));
        }
        BindableArtboard bindableArtboard = new BindableArtboard(jCppCreateBindableArtboardByName, viewModelInstance);
        getDependencies().add(bindableArtboard);
        return bindableArtboard;
    }

    public final BindableArtboard createDefaultBindableArtboard(ViewModelInstance viewModelInstance) throws ArtboardException {
        long jCppCreateDefaultBindableArtboard = cppCreateDefaultBindableArtboard(getCppPointer());
        if (jCppCreateDefaultBindableArtboard == 0) {
            throw new ArtboardException("No default BindableArtboard.");
        }
        BindableArtboard bindableArtboard = new BindableArtboard(jCppCreateDefaultBindableArtboard, viewModelInstance);
        getDependencies().add(bindableArtboard);
        return bindableArtboard;
    }

    public final ViewModel defaultViewModelForArtboard(Artboard artboard) throws ViewModelException {
        artboard.getClass();
        long jCppDefaultViewModelForArtboard = cppDefaultViewModelForArtboard(getCppPointer(), artboard.getCppPointer());
        if (jCppDefaultViewModelForArtboard != 0) {
            ViewModel viewModel = new ViewModel(jCppDefaultViewModelForArtboard, this.fileLock);
            getDependencies().add(viewModel);
            return viewModel;
        }
        throw new ViewModelException("No default ViewModel found for artboard " + artboard.getName() + '.');
    }

    public final int getArtboardCount() {
        return cppArtboardCount(getCppPointer());
    }

    public final List getArtboardNames() {
        awsa awsaVarL = awro.l(0, getArtboardCount());
        ArrayList arrayList = new ArrayList(atqq.N(awsaVarL, 10));
        awns it = awsaVarL.iterator();
        while (((awrz) it).a) {
            arrayList.add(cppArtboardNameByIndex(getCppPointer(), it.a()));
        }
        return arrayList;
    }

    public final List getEnums() {
        return cppEnums(getCppPointer());
    }

    public final ReentrantLock getFileLock$third_party_java_android_libs_rive_rive_android() {
        return this.fileLock;
    }

    public final Artboard getFirstArtboard() {
        return artboard(0);
    }

    public final ReentrantLock getLock() {
        return this.fileLock;
    }

    public final RendererType getRendererType() {
        return this.rendererType;
    }

    public final ViewModel getViewModelByIndex(int i) throws ViewModelException {
        long jCppViewModelByIndex = cppViewModelByIndex(getCppPointer(), i);
        if (jCppViewModelByIndex == 0) {
            throw new ViewModelException(a.ci((byte) 46, i, "No ViewModel found at index "));
        }
        ViewModel viewModel = new ViewModel(jCppViewModelByIndex, this.fileLock);
        getDependencies().add(viewModel);
        return viewModel;
    }

    public final ViewModel getViewModelByName(String str) throws ViewModelException {
        str.getClass();
        long jCppViewModelByName = cppViewModelByName(getCppPointer(), str);
        if (jCppViewModelByName == 0) {
            throw new ViewModelException(a.bU((byte) 46, str, "No ViewModel found with name "));
        }
        ViewModel viewModel = new ViewModel(jCppViewModelByName, this.fileLock);
        getDependencies().add(viewModel);
        return viewModel;
    }

    public final int getViewModelCount() {
        return cppViewModelCount(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject, app.rive.runtime.kotlin.core.RefCount
    public int release() {
        int iRelease;
        synchronized (this.fileLock) {
            iRelease = super.release();
        }
        return iRelease;
    }

    public /* synthetic */ File(byte[] bArr, RendererType rendererType, FileAssetLoader fileAssetLoader, int i, awqx awqxVar) {
        this(bArr, (i & 2) != 0 ? Rive.INSTANCE.getDefaultRendererType() : rendererType, (i & 4) != 0 ? null : fileAssetLoader);
    }

    public final Artboard artboard(int i) throws ArtboardException {
        long jCppArtboardByIndex = cppArtboardByIndex(getCppPointer(), i);
        if (jCppArtboardByIndex != 0) {
            Artboard artboard = new Artboard(jCppArtboardByIndex, this.fileLock, this);
            getDependencies().add(artboard);
            return artboard;
        }
        throw new ArtboardException(a.ci((byte) 46, i, "No Artboard found at index "));
    }
}
