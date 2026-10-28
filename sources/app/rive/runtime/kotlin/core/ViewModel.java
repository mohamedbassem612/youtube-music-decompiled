package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.ViewModelException;
import defpackage.a;
import defpackage.atqq;
import defpackage.awpl;
import defpackage.awqx;
import defpackage.awrc;
import defpackage.awro;
import internal.org.jni_zero.JniZero;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewModel extends NativeObject {
    public static final int $stable = 8;
    private final ReentrantLock fileLock;

    /* JADX INFO: compiled from: PG */
    public final class Property {
        public static final int $stable = 0;
        private final String name;
        private final PropertyDataType type;

        public Property(PropertyDataType propertyDataType, String str) {
            propertyDataType.getClass();
            str.getClass();
            this.type = propertyDataType;
            this.name = str;
        }

        public static /* synthetic */ Property copy$default(Property property, PropertyDataType propertyDataType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                propertyDataType = property.type;
            }
            if ((i & 2) != 0) {
                str = property.name;
            }
            return property.copy(propertyDataType, str);
        }

        public final PropertyDataType component1() {
            return this.type;
        }

        public final String component2() {
            return this.name;
        }

        public final Property copy(PropertyDataType propertyDataType, String str) {
            propertyDataType.getClass();
            str.getClass();
            return new Property(propertyDataType, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Property) {
                Property property = (Property) obj;
                if (this.type == property.type && awrc.c(this.name, property.name)) {
                    return true;
                }
            }
            return false;
        }

        public final String getName() {
            return this.name;
        }

        public final PropertyDataType getType() {
            return this.type;
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.name.hashCode();
        }

        public String toString() {
            return "Property(type=" + this.type + ", name=" + this.name + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModel(long j, ReentrantLock reentrantLock) {
        super(j);
        reentrantLock.getClass();
        this.fileLock = reentrantLock;
    }

    private final native long cppCreateDefaultInstance(long j);

    private final native long cppCreateInstanceFromIndex(long j, int i);

    private final native long cppCreateInstanceFromName(long j, String str);

    private final native List cppGetProperties(long j);

    private final native int cppInstanceCount(long j);

    private final native String cppName(long j);

    private final native int cppPropertyCount(long j);

    protected final native long cppCreateBlankInstance(long j);

    public final ViewModelInstance createBlankInstance() throws ViewModelException {
        long jCppCreateBlankInstance;
        synchronized (this.fileLock) {
            jCppCreateBlankInstance = cppCreateBlankInstance(getCppPointer());
        }
        if (jCppCreateBlankInstance == 0) {
            throw new ViewModelException("Could not create a blank ViewModel instance");
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateBlankInstance, this.fileLock);
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    public final ViewModelInstance createDefaultInstance() throws ViewModelException {
        long jCppCreateDefaultInstance;
        synchronized (this.fileLock) {
            jCppCreateDefaultInstance = cppCreateDefaultInstance(getCppPointer());
        }
        if (jCppCreateDefaultInstance == 0) {
            throw new ViewModelException("Could not create default ViewModel instance");
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateDefaultInstance, this.fileLock);
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    public final ViewModelInstance createInstanceFromIndex(int i) throws ViewModelException {
        long jCppCreateInstanceFromIndex;
        synchronized (this.fileLock) {
            jCppCreateInstanceFromIndex = cppCreateInstanceFromIndex(getCppPointer(), i);
        }
        if (jCppCreateInstanceFromIndex == 0) {
            throw new ViewModelException(a.bR(i, "ViewModel instance not found: "));
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateInstanceFromIndex, this.fileLock);
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    public final ViewModelInstance createInstanceFromName(String str) throws ViewModelException {
        long jCppCreateInstanceFromName;
        str.getClass();
        synchronized (this.fileLock) {
            jCppCreateInstanceFromName = cppCreateInstanceFromName(getCppPointer(), str);
        }
        if (jCppCreateInstanceFromName == 0) {
            throw new ViewModelException("ViewModel instance not found: ".concat(str));
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateInstanceFromName, this.fileLock);
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    protected final ReentrantLock getFileLock() {
        return this.fileLock;
    }

    public final int getInstanceCount() {
        return cppInstanceCount(getCppPointer());
    }

    public final String getName() {
        return cppName(getCppPointer());
    }

    public final List getProperties() {
        return cppGetProperties(getCppPointer());
    }

    public final int getPropertyCount() {
        return cppPropertyCount(getCppPointer());
    }

    /* JADX INFO: compiled from: PG */
    public enum PropertyDataType {
        NONE(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        COLOR(4),
        LIST(5),
        ENUM(6),
        TRIGGER(7),
        VIEW_MODEL(8),
        INTEGER(9),
        SYMBOL_LIST_INDEX(10),
        ASSET_IMAGE(11),
        ARTBOARD(12),
        ASSET_FONT(13),
        ASSET_BLOB(14);

        private static final Map map;
        private final int value;
        private static final /* synthetic */ awpl $ENTRIES = JniZero.m(values());
        public static final Companion Companion = new Companion(null);

        static {
            awpl entries = getEntries();
            LinkedHashMap linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(entries, 10)), 16));
            for (Object obj : entries) {
                linkedHashMap.put(Integer.valueOf(((PropertyDataType) obj).value), obj);
            }
            map = linkedHashMap;
        }

        PropertyDataType(int i) {
            this.value = i;
        }

        public static final PropertyDataType fromInt(int i) {
            return Companion.fromInt(i);
        }

        public static awpl getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }

        /* JADX INFO: compiled from: PG */
        public final class Companion {
            private Companion() {
            }

            public final PropertyDataType fromInt(int i) {
                return (PropertyDataType) PropertyDataType.map.get(Integer.valueOf(i));
            }

            public /* synthetic */ Companion(awqx awqxVar) {
                this();
            }
        }
    }
}
