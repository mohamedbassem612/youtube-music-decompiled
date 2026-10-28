package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.ViewModelException;
import defpackage.a;
import defpackage.atqq;
import defpackage.awqk;
import defpackage.awrc;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelInstance extends NativeObject {
    public static final int $stable = 8;
    private Map children;
    private volatile ReentrantLock fileLock;
    private Map properties;

    /* JADX INFO: compiled from: PG */
    public final class Transfer {
        public static final int $stable = 8;
        private final ViewModelInstance instance;
        private boolean valid;

        public Transfer(ViewModelInstance viewModelInstance) throws ViewModelException {
            viewModelInstance.getClass();
            this.instance = viewModelInstance;
            this.valid = true;
            if (viewModelInstance.getRefCount() <= 0) {
                throw new ViewModelException("Cannot transfer a disposed ViewModelInstance.");
            }
            synchronized (viewModelInstance.fileLock) {
                viewModelInstance.cppRefInstance(viewModelInstance.getCppPointer());
            }
            viewModelInstance.acquire();
        }

        public final void dispose() throws ViewModelException {
            if (this.valid) {
                this.valid = false;
                this.instance.release();
            } else {
                throw new ViewModelException("Transfer of ViewModelInstance " + this.instance + " already ended. Cannot dispose.");
            }
        }

        public final ViewModelInstance end$third_party_java_android_libs_rive_rive_android() {
            if (this.valid) {
                this.valid = false;
                return this.instance;
            }
            throw new ViewModelException("Transfer of ViewModelInstance " + this.instance + " already ended. Cannot end transfer again.");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelInstance(long j, ReentrantLock reentrantLock) {
        super(j);
        reentrantLock.getClass();
        this.fileLock = reentrantLock;
        this.properties = new ConcurrentHashMap();
        this.children = new ConcurrentHashMap();
        synchronized (this.fileLock) {
            cppRefInstance(getCppPointer());
        }
    }

    private final native void cppDerefInstance(long j);

    private final native String cppName(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyArtboard(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyBoolean(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyColor(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyEnum(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyImage(long j, String str);

    private final native long cppPropertyInstance(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyList(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyNumber(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyString(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native long cppPropertyTrigger(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppRefInstance(long j);

    private final native boolean cppSetInstanceProperty(long j, String str, long j2);

    private final /* synthetic */ ViewModelProperty getProperty(String str, awqk awqkVar, awqk awqkVar2) throws ViewModelException {
        ViewModelProperty viewModelProperty;
        List listF = awrc.F(str, new String[]{"/"});
        List listSubList = listF.subList(0, listF.size() - 1);
        String str2 = (String) atqq.ab(listF);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            viewModelProperty = (ViewModelProperty) viewModelInstanceTraverse.properties.get(str2);
            if (viewModelProperty != null) {
                awrc.e();
            } else {
                long jLongValue = ((Number) awqkVar.invoke(Long.valueOf(viewModelInstanceTraverse.getCppPointer()), str2)).longValue();
                if (jLongValue == 0) {
                    throw new ViewModelException(a.ce(str, "Property not found: "));
                }
                viewModelProperty = (ViewModelProperty) awqkVar2.invoke(Long.valueOf(jLongValue), viewModelInstanceTraverse.fileLock);
                viewModelInstanceTraverse.properties.put(str2, viewModelProperty);
                getDependencies().add(viewModelProperty);
            }
        }
        return viewModelProperty;
    }

    private final ViewModelInstance traverse(List list) throws ViewModelException {
        if (list.isEmpty()) {
            return this;
        }
        String str = (String) atqq.X(list);
        Map map = this.children;
        Object objTraverse$createChildInstance = map.get(str);
        if (objTraverse$createChildInstance == null) {
            objTraverse$createChildInstance = traverse$createChildInstance(this, str);
            map.put(str, objTraverse$createChildInstance);
        }
        return ((ViewModelInstance) objTraverse$createChildInstance).traverse(list.subList(1, list.size()));
    }

    private static final ViewModelInstance traverse$createChildInstance(ViewModelInstance viewModelInstance, String str) throws ViewModelException {
        long jCppPropertyInstance;
        synchronized (viewModelInstance.fileLock) {
            jCppPropertyInstance = viewModelInstance.cppPropertyInstance(viewModelInstance.getCppPointer(), str);
        }
        if (jCppPropertyInstance == 0) {
            throw new ViewModelException("Property not found: ".concat(String.valueOf(str)));
        }
        ViewModelInstance viewModelInstance2 = new ViewModelInstance(jCppPropertyInstance, viewModelInstance.fileLock);
        viewModelInstance.children.put(str, viewModelInstance2);
        viewModelInstance.getDependencies().add(viewModelInstance2);
        return viewModelInstance2;
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public void cppDelete(long j) {
        synchronized (this.fileLock) {
            cppDerefInstance(j);
        }
    }

    public final ViewModelArtboardProperty getArtboardProperty(String str) throws ViewModelException {
        ViewModelProperty viewModelProperty;
        str.getClass();
        List listF = awrc.F(str, new String[]{"/"});
        List listSubList = listF.subList(0, listF.size() - 1);
        String str2 = (String) atqq.ab(listF);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            viewModelProperty = (ViewModelProperty) viewModelInstanceTraverse.properties.get(str2);
            if (viewModelProperty == null) {
                long jCppPropertyArtboard = cppPropertyArtboard(viewModelInstanceTraverse.getCppPointer(), str2);
                if (jCppPropertyArtboard == 0) {
                    throw new ViewModelException(a.ce(str, "Property not found: "));
                }
                ViewModelArtboardProperty viewModelArtboardProperty = new ViewModelArtboardProperty(jCppPropertyArtboard, viewModelInstanceTraverse.fileLock);
                viewModelInstanceTraverse.properties.put(str2, viewModelArtboardProperty);
                getDependencies().add(viewModelArtboardProperty);
                viewModelProperty = viewModelArtboardProperty;
            } else if (!(viewModelProperty instanceof ViewModelArtboardProperty)) {
                throw new ViewModelException(a.bT(str2, "Property '", "' exists but is not of the expected type."));
            }
        }
        return (ViewModelArtboardProperty) viewModelProperty;
    }

    public final ViewModelBooleanProperty getBooleanProperty(String str) throws ViewModelException {
        ViewModelProperty viewModelProperty;
        str.getClass();
        List listF = awrc.F(str, new String[]{"/"});
        List listSubList = listF.subList(0, listF.size() - 1);
        String str2 = (String) atqq.ab(listF);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            viewModelProperty = (ViewModelProperty) viewModelInstanceTraverse.properties.get(str2);
            if (viewModelProperty == null) {
                long jCppPropertyBoolean = cppPropertyBoolean(viewModelInstanceTraverse.getCppPointer(), str2);
                if (jCppPropertyBoolean == 0) {
                    throw new ViewModelException(a.ce(str, "Property not found: "));
                }
                ViewModelBooleanProperty viewModelBooleanProperty = new ViewModelBooleanProperty(jCppPropertyBoolean, viewModelInstanceTraverse.fileLock);
                viewModelInstanceTraverse.properties.put(str2, viewModelBooleanProperty);
                getDependencies().add(viewModelBooleanProperty);
                viewModelProperty = viewModelBooleanProperty;
            } else if (!(viewModelProperty instanceof ViewModelBooleanProperty)) {
                throw new ViewModelException(a.bT(str2, "Property '", "' exists but is not of the expected type."));
            }
        }
        return (ViewModelBooleanProperty) viewModelProperty;
    }

    protected final Map getChildren() {
        return this.children;
    }

    public final ViewModelColorProperty getColorProperty(String str) throws ViewModelException {
        ViewModelProperty viewModelProperty;
        str.getClass();
        List listF = awrc.F(str, new String[]{"/"});
        List listSubList = listF.subList(0, listF.size() - 1);
        String str2 = (String) atqq.ab(listF);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            viewModelProperty = (ViewModelProperty) viewModelInstanceTraverse.properties.get(str2);
            if (viewModelProperty == null) {
                long jCppPropertyColor = cppPropertyColor(viewModelInstanceTraverse.getCppPointer(), str2);
                if (jCppPropertyColor == 0) {
                    throw new ViewModelException(a.ce(str, "Property not found: "));
                }
                ViewModelColorProperty viewModelColorProperty = new ViewModelColorProperty(jCppPropertyColor, viewModelInstanceTraverse.fileLock);
                viewModelInstanceTraverse.properties.put(str2, viewModelColorProperty);
                getDependencies().add(viewModelColorProperty);
                viewModelProperty = viewModelColorProperty;
            } else if (!(viewModelProperty instanceof ViewModelColorProperty)) {
                throw new ViewModelException(a.bT(str2, "Property '", "' exists but is not of the expected type."));
            }
        }
        return (ViewModelColorProperty) viewModelProperty;
    }

    public final ViewModelEnumProperty getEnumProperty(String str) throws ViewModelException {
        ViewModelProperty viewModelProperty;
        str.getClass();
        List listF = awrc.F(str, new String[]{"/"});
        List listSubList = listF.subList(0, listF.size() - 1);
        String str2 = (String) atqq.ab(listF);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            viewModelProperty = (ViewModelProperty) viewModelInstanceTraverse.properties.get(str2);
            if (viewModelProperty == null) {
                long jCppPropertyEnum = cppPropertyEnum(viewModelInstanceTraverse.getCppPointer(), str2);
                if (jCppPropertyEnum == 0) {
                    throw new ViewModelException(a.ce(str, "Property not found: "));
                }
                ViewModelEnumProperty viewModelEnumProperty = new ViewModelEnumProperty(jCppPropertyEnum, viewModelInstanceTraverse.fileLock);
                viewModelInstanceTraverse.properties.put(str2, viewModelEnumProperty);
                getDependencies().add(viewModelEnumProperty);
                viewModelProperty = viewModelEnumProperty;
            } else if (!(viewModelProperty instanceof ViewModelEnumProperty)) {
                throw new ViewModelException(a.bT(str2, "Property '", "' exists but is not of the expected type."));
            }
        }
        return (ViewModelEnumProperty) viewModelProperty;
    }

    public final ViewModelImageProperty getImageProperty(String str) throws ViewModelException {
        ViewModelProperty viewModelProperty;
        str.getClass();
        List listF = awrc.F(str, new String[]{"/"});
        List listSubList = listF.subList(0, listF.size() - 1);
        String str2 = (String) atqq.ab(listF);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            viewModelProperty = (ViewModelProperty) viewModelInstanceTraverse.properties.get(str2);
            if (viewModelProperty == null) {
                long jCppPropertyImage = cppPropertyImage(viewModelInstanceTraverse.getCppPointer(), str2);
                if (jCppPropertyImage == 0) {
                    throw new ViewModelException(a.ce(str, "Property not found: "));
                }
                ViewModelImageProperty viewModelImageProperty = new ViewModelImageProperty(jCppPropertyImage, viewModelInstanceTraverse.fileLock);
                viewModelInstanceTraverse.properties.put(str2, viewModelImageProperty);
                getDependencies().add(viewModelImageProperty);
                viewModelProperty = viewModelImageProperty;
            } else if (!(viewModelProperty instanceof ViewModelImageProperty)) {
                throw new ViewModelException(a.bT(str2, "Property '", "' exists but is not of the expected type."));
            }
        }
        return (ViewModelImageProperty) viewModelProperty;
    }

    public final ViewModelInstance getInstanceProperty(String str) {
        str.getClass();
        return traverse(awrc.F(str, new String[]{"/"}));
    }

    public final ViewModelListProperty getListProperty(String str) throws ViewModelException {
        ViewModelProperty viewModelProperty;
        str.getClass();
        List listF = awrc.F(str, new String[]{"/"});
        List listSubList = listF.subList(0, listF.size() - 1);
        String str2 = (String) atqq.ab(listF);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            viewModelProperty = (ViewModelProperty) viewModelInstanceTraverse.properties.get(str2);
            if (viewModelProperty == null) {
                long jCppPropertyList = cppPropertyList(viewModelInstanceTraverse.getCppPointer(), str2);
                if (jCppPropertyList == 0) {
                    throw new ViewModelException(a.ce(str, "Property not found: "));
                }
                ViewModelListProperty viewModelListProperty = new ViewModelListProperty(jCppPropertyList, viewModelInstanceTraverse.fileLock);
                viewModelInstanceTraverse.properties.put(str2, viewModelListProperty);
                getDependencies().add(viewModelListProperty);
                viewModelProperty = viewModelListProperty;
            } else if (!(viewModelProperty instanceof ViewModelListProperty)) {
                throw new ViewModelException(a.bT(str2, "Property '", "' exists but is not of the expected type."));
            }
        }
        return (ViewModelListProperty) viewModelProperty;
    }

    public final String getName() {
        return cppName(getCppPointer());
    }

    public final ViewModelNumberProperty getNumberProperty(String str) throws ViewModelException {
        ViewModelProperty viewModelProperty;
        str.getClass();
        List listF = awrc.F(str, new String[]{"/"});
        List listSubList = listF.subList(0, listF.size() - 1);
        String str2 = (String) atqq.ab(listF);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            viewModelProperty = (ViewModelProperty) viewModelInstanceTraverse.properties.get(str2);
            if (viewModelProperty == null) {
                long jCppPropertyNumber = cppPropertyNumber(viewModelInstanceTraverse.getCppPointer(), str2);
                if (jCppPropertyNumber == 0) {
                    throw new ViewModelException(a.ce(str, "Property not found: "));
                }
                ViewModelNumberProperty viewModelNumberProperty = new ViewModelNumberProperty(jCppPropertyNumber, viewModelInstanceTraverse.fileLock);
                viewModelInstanceTraverse.properties.put(str2, viewModelNumberProperty);
                getDependencies().add(viewModelNumberProperty);
                viewModelProperty = viewModelNumberProperty;
            } else if (!(viewModelProperty instanceof ViewModelNumberProperty)) {
                throw new ViewModelException(a.bT(str2, "Property '", "' exists but is not of the expected type."));
            }
        }
        return (ViewModelNumberProperty) viewModelProperty;
    }

    protected final Map getProperties() {
        return this.properties;
    }

    public final ViewModelStringProperty getStringProperty(String str) throws ViewModelException {
        ViewModelProperty viewModelProperty;
        str.getClass();
        List listF = awrc.F(str, new String[]{"/"});
        List listSubList = listF.subList(0, listF.size() - 1);
        String str2 = (String) atqq.ab(listF);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            viewModelProperty = (ViewModelProperty) viewModelInstanceTraverse.properties.get(str2);
            if (viewModelProperty == null) {
                long jCppPropertyString = cppPropertyString(viewModelInstanceTraverse.getCppPointer(), str2);
                if (jCppPropertyString == 0) {
                    throw new ViewModelException(a.ce(str, "Property not found: "));
                }
                ViewModelStringProperty viewModelStringProperty = new ViewModelStringProperty(jCppPropertyString, viewModelInstanceTraverse.fileLock);
                viewModelInstanceTraverse.properties.put(str2, viewModelStringProperty);
                getDependencies().add(viewModelStringProperty);
                viewModelProperty = viewModelStringProperty;
            } else if (!(viewModelProperty instanceof ViewModelStringProperty)) {
                throw new ViewModelException(a.bT(str2, "Property '", "' exists but is not of the expected type."));
            }
        }
        return (ViewModelStringProperty) viewModelProperty;
    }

    public final ViewModelTriggerProperty getTriggerProperty(String str) throws ViewModelException {
        ViewModelProperty viewModelProperty;
        str.getClass();
        List listF = awrc.F(str, new String[]{"/"});
        List listSubList = listF.subList(0, listF.size() - 1);
        String str2 = (String) atqq.ab(listF);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        synchronized (viewModelInstanceTraverse.fileLock) {
            viewModelProperty = (ViewModelProperty) viewModelInstanceTraverse.properties.get(str2);
            if (viewModelProperty == null) {
                long jCppPropertyTrigger = cppPropertyTrigger(viewModelInstanceTraverse.getCppPointer(), str2);
                if (jCppPropertyTrigger == 0) {
                    throw new ViewModelException(a.ce(str, "Property not found: "));
                }
                ViewModelTriggerProperty viewModelTriggerProperty = new ViewModelTriggerProperty(jCppPropertyTrigger, viewModelInstanceTraverse.fileLock);
                viewModelInstanceTraverse.properties.put(str2, viewModelTriggerProperty);
                getDependencies().add(viewModelTriggerProperty);
                viewModelProperty = viewModelTriggerProperty;
            } else if (!(viewModelProperty instanceof ViewModelTriggerProperty)) {
                throw new ViewModelException(a.bT(str2, "Property '", "' exists but is not of the expected type."));
            }
        }
        return (ViewModelTriggerProperty) viewModelProperty;
    }

    public final void pollChanges$third_party_java_android_libs_rive_rive_android() {
        synchronized (this.fileLock) {
            Iterator it = this.properties.values().iterator();
            while (it.hasNext()) {
                ((ViewModelProperty) it.next()).pollChanges$third_party_java_android_libs_rive_rive_android();
            }
            Iterator it2 = this.children.values().iterator();
            while (it2.hasNext()) {
                ((ViewModelInstance) it2.next()).pollChanges$third_party_java_android_libs_rive_rive_android();
            }
        }
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject, app.rive.runtime.kotlin.core.RefCount
    public int release() {
        while (true) {
            ReentrantLock reentrantLock = this.fileLock;
            synchronized (reentrantLock) {
                if (this.fileLock == reentrantLock) {
                    return super.release();
                }
            }
        }
    }

    protected final void setChildren(Map map) {
        map.getClass();
        this.children = map;
    }

    public final void setInstanceProperty(String str, ViewModelInstance viewModelInstance) throws ViewModelException {
        str.getClass();
        viewModelInstance.getClass();
        List listF = awrc.F(str, new String[]{"/"});
        List listSubList = listF.subList(0, listF.size() - 1);
        String str2 = (String) atqq.ab(listF);
        ViewModelInstance viewModelInstanceTraverse = traverse(listSubList);
        ReentrantLock reentrantLock = viewModelInstanceTraverse.fileLock;
        viewModelInstance.updateFileLock$third_party_java_android_libs_rive_rive_android(reentrantLock);
        synchronized (reentrantLock) {
            if (!cppSetInstanceProperty(viewModelInstanceTraverse.getCppPointer(), str2, viewModelInstance.getCppPointer())) {
                throw new ViewModelException(a.bT(str, "Property not found: ", "; or instance is incompatible."));
            }
            viewModelInstanceTraverse.children.put(str2, viewModelInstance);
        }
    }

    protected final void setProperties(Map map) {
        map.getClass();
        this.properties = map;
    }

    public final Transfer transfer() {
        return new Transfer(this);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00a7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateFileLock$third_party_java_android_libs_rive_rive_android(java.util.concurrent.locks.ReentrantLock r7) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.rive.runtime.kotlin.core.ViewModelInstance.updateFileLock$third_party_java_android_libs_rive_rive_android(java.util.concurrent.locks.ReentrantLock):void");
    }
}
