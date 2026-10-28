package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.ArrayMap;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aep {
    public static final Map a;
    private static final Map b;
    private static final Map c;

    static {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Boolean.class, "bool");
        arrayMap.put(Byte.class, "byte");
        arrayMap.put(Short.class, "short");
        arrayMap.put(Integer.class, "int");
        arrayMap.put(Long.class, "long");
        arrayMap.put(Double.class, "double");
        arrayMap.put(Float.class, "float");
        arrayMap.put(String.class, "string");
        arrayMap.put(Parcelable.class, "parcelable");
        arrayMap.put(Map.class, "map");
        arrayMap.put(List.class, "list");
        arrayMap.put(IconCompat.class, "image");
        b = arrayMap;
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put(0, "primitive");
        arrayMap2.put(1, "iInterface");
        arrayMap2.put(9, "iBinder");
        arrayMap2.put(2, "map");
        arrayMap2.put(3, "set");
        arrayMap2.put(4, "list");
        arrayMap2.put(5, "object");
        arrayMap2.put(6, "image");
        a = arrayMap2;
        c = new HashMap();
    }

    private aep() {
    }

    public static Bundle a(Object obj, String str, aen aenVar) throws ael {
        Bundle bundleA;
        if (obj != null) {
            Iterator it = aenVar.a.iterator();
            while (it.hasNext()) {
                if (((aem) it.next()).a == obj) {
                    throw new ael("Found cycle while bundling type ".concat(String.valueOf(obj.getClass().getSimpleName())), aenVar);
                }
            }
        }
        aen aenVarB = aen.b(obj, str, aenVar);
        try {
            if (obj == null) {
                throw new aeo("Bundling of null object is not supported", aenVarB);
            }
            if (obj instanceof IconCompat) {
                bundleA = new Bundle(2);
                bundleA.putInt("tag_class_type", 6);
                bundleA.putBundle("tag_value", ((IconCompat) obj).d());
            } else {
                boolean z = obj instanceof Boolean;
                int i = 0;
                if (z || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof String) || (obj instanceof Parcelable)) {
                    Bundle bundle = new Bundle(2);
                    bundle.putInt("tag_class_type", 0);
                    if (z) {
                        bundle.putBoolean("tag_value", ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte("tag_value", ((Byte) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar("tag_value", ((Character) obj).charValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort("tag_value", ((Short) obj).shortValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt("tag_value", ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong("tag_value", ((Long) obj).longValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble("tag_value", ((Double) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat("tag_value", ((Float) obj).floatValue());
                    } else if (obj instanceof String) {
                        bundle.putString("tag_value", (String) obj);
                    } else {
                        if (!(obj instanceof Parcelable)) {
                            throw new aeo("Unsupported primitive type: ".concat(String.valueOf(obj.getClass().getName())), aenVarB);
                        }
                        bundle.putParcelable("tag_value", (Parcelable) obj);
                    }
                    bundleA = bundle;
                } else if (obj instanceof IInterface) {
                    IInterface iInterface = (IInterface) obj;
                    bundleA = new Bundle(3);
                    String name = iInterface.getClass().getName();
                    bundleA.putInt("tag_class_type", 1);
                    bundleA.putBinder("tag_value", iInterface.asBinder());
                    bundleA.putString("tag_class_name", name);
                } else if (obj instanceof IBinder) {
                    bundleA = new Bundle(2);
                    bundleA.putInt("tag_class_type", 9);
                    bundleA.putBinder("tag_value", (IBinder) obj);
                } else if (obj instanceof Map) {
                    bundleA = new Bundle(2);
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        Bundle bundle2 = new Bundle(2);
                        bundle2.putBundle("tag_1", a(entry.getKey(), a.ci((byte) 62, i, "<key "), aenVarB));
                        if (entry.getValue() != null) {
                            bundle2.putBundle("tag_2", a(entry.getValue(), a.ci((byte) 62, i, "<value "), aenVarB));
                        }
                        i++;
                        arrayList.add(bundle2);
                    }
                    bundleA.putInt("tag_class_type", 2);
                    bundleA.putParcelableArrayList("tag_value", arrayList);
                } else if (obj instanceof List) {
                    bundleA = e((List) obj, aenVarB);
                    bundleA.putInt("tag_class_type", 4);
                } else if (obj instanceof Set) {
                    bundleA = e((Set) obj, aenVarB);
                    bundleA.putInt("tag_class_type", 3);
                } else if (obj.getClass().isEnum()) {
                    bundleA = f(obj, aenVarB);
                } else if (obj instanceof Class) {
                    bundleA = new Bundle(2);
                    bundleA.putInt("tag_class_type", 8);
                    bundleA.putString("tag_value", ((Class) obj).getName());
                } else {
                    if (obj.getClass().isArray()) {
                        throw new aeo("Object serializing contains an array, use a list or a set instead", aenVarB);
                    }
                    if (obj instanceof avc) {
                        bundleA = ((avc) obj).a();
                        bundleA.putInt("tag_class_type", 10);
                    } else {
                        String name2 = obj.getClass().getName();
                        if (!obj.getClass().isAnnotationPresent(yf.class)) {
                            throw new aeo("Invalid class not marked as CarProtocol: ".concat(String.valueOf(name2)), aenVarB);
                        }
                        try {
                            obj.getClass().getDeclaredConstructor(null);
                            List<Field> listL = l(obj.getClass());
                            Bundle bundle3 = new Bundle(listL.size() + 2);
                            bundle3.putInt("tag_class_type", 5);
                            bundle3.putString("tag_class_name", name2);
                            for (Field field : listL) {
                                field.setAccessible(true);
                                String strC = c(field);
                                try {
                                    Object obj2 = field.get(obj);
                                    if (obj2 != null) {
                                        bundle3.putParcelable(strC, a(obj2, field.getName(), aenVarB));
                                    }
                                } catch (IllegalAccessException e) {
                                    throw new aeo("Field is not accessible: ".concat(strC), aenVarB, e);
                                }
                            }
                            bundleA = bundle3;
                        } catch (NoSuchMethodException e2) {
                            throw new aeo("Class to deserialize is missing a no args constructor: ".concat(String.valueOf(name2)), aenVarB, e2);
                        }
                    }
                }
            }
            aenVarB.close();
            return bundleA;
        } catch (Throwable th) {
            try {
                aenVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.HashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.Collection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public static Object b(Bundle bundle, aen aenVar) {
        ?? map;
        ?? I;
        ClassLoader classLoader = aep.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        int i = bundle.getInt("tag_class_type");
        String str = (String) a.get(Integer.valueOf(bundle.getInt("tag_class_type")));
        if (str == null) {
            str = "unknown";
        }
        aen aenVarB = aen.b(bundle, str, aenVar);
        try {
            switch (i) {
                case 0:
                    Object obj = bundle.get("tag_value");
                    I = obj;
                    if (obj == null) {
                        throw new aeo("Bundle is missing the primitive value", aenVarB);
                    }
                    I = iconCompatE;
                    aenVarB.close();
                    return I;
                case 1:
                    I = i(bundle, aenVarB);
                    I = iconCompatE;
                    aenVarB.close();
                    return I;
                case 2:
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
                    if (parcelableArrayList == null) {
                        throw new aeo("Bundle is missing the map", aenVarB);
                    }
                    map = new HashMap();
                    int size = parcelableArrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Bundle bundle2 = (Bundle) ((Parcelable) parcelableArrayList.get(i2));
                        Bundle bundle3 = bundle2.getBundle("tag_1");
                        Bundle bundle4 = bundle2.getBundle("tag_2");
                        if (bundle3 == null) {
                            throw new aeo("Bundle is missing key", aenVarB);
                        }
                        map.put(b(bundle3, aenVarB), bundle4 == null ? null : b(bundle4, aenVarB));
                    }
                    I = map;
                    I = iconCompatE;
                    aenVarB.close();
                    return I;
                case 3:
                    map = new HashSet();
                    m(bundle, map, aenVarB);
                    I = map;
                    I = iconCompatE;
                    aenVarB.close();
                    return I;
                case 4:
                    map = new ArrayList();
                    m(bundle, map, aenVarB);
                    I = map;
                    I = iconCompatE;
                    aenVarB.close();
                    return I;
                case 5:
                    I = j(bundle, aenVarB);
                    I = iconCompatE;
                    aenVarB.close();
                    return I;
                case 6:
                    Bundle bundle5 = bundle.getBundle("tag_value");
                    if (bundle5 == null) {
                        throw new aeo("IconCompat bundle is null", aenVarB);
                    }
                    IconCompat iconCompatE = IconCompat.e(bundle5);
                    if (iconCompatE == null) {
                        I = iconCompatE;
                        throw new aeo("Failed to create IconCompat from bundle", aenVarB);
                    }
                    I = iconCompatE;
                    aenVarB.close();
                    return I;
                case 7:
                    I = h(bundle, aenVarB);
                    I = iconCompatE;
                    aenVarB.close();
                    return I;
                case 8:
                    String string = bundle.getString("tag_value");
                    if (string == null) {
                        throw new aeo("Class is missing the class name", aenVarB);
                    }
                    try {
                        I = g(string);
                        I = iconCompatE;
                        aenVarB.close();
                        return I;
                    } catch (ClassNotFoundException e) {
                        throw new aeo("Class name is unknown: ".concat(string), aenVarB, e);
                    }
                case 9:
                    IBinder binder = bundle.getBinder("tag_value");
                    I = binder;
                    if (binder == null) {
                        throw new aeo("Bundle is missing the binder", aenVarB);
                    }
                    I = iconCompatE;
                    aenVarB.close();
                    return I;
                case 10:
                    I = avc.b(bundle);
                    I = iconCompatE;
                    aenVarB.close();
                    return I;
                default:
                    throw new aeo(a.bR(i, "Unsupported class type in bundle: "), aenVarB);
            }
        } catch (Throwable th) {
            try {
                aenVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static String c(Field field) {
        return String.valueOf(field.getDeclaringClass().getName()).concat(String.valueOf(field.getName()));
    }

    static String d(Class cls) {
        String str = (String) b.get(cls);
        if (str != null) {
            return str;
        }
        if (List.class.isAssignableFrom(cls)) {
            return "<List>";
        }
        if (Map.class.isAssignableFrom(cls)) {
            return "<Map>";
        }
        return Set.class.isAssignableFrom(cls) ? "<Set>" : cls.getSimpleName();
    }

    private static Bundle e(Collection collection, aen aenVar) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(a(it.next(), a.ci((byte) 62, i, "<item "), aenVar));
            i++;
        }
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    private static Bundle f(Object obj, aen aenVar) throws aeo {
        Bundle bundle = new Bundle(3);
        bundle.putInt("tag_class_type", 7);
        try {
            bundle.putString("tag_value", (String) k(obj.getClass(), "name", aenVar).invoke(obj, null));
            bundle.putString("tag_class_name", obj.getClass().getName());
            return bundle;
        } catch (ReflectiveOperationException e) {
            throw new aeo("Enum missing name method", aenVar, e);
        }
    }

    private static Class g(String str) {
        Class<?> cls;
        Map map = c;
        synchronized (map) {
            cls = (Class) map.get(str);
            if (cls == null) {
                cls = Class.forName(str, false, aep.class.getClassLoader());
                map.put(str, cls);
            }
        }
        return cls;
    }

    private static Object h(Bundle bundle, aen aenVar) throws aeo {
        String string = bundle.getString("tag_value");
        if (string == null) {
            throw new aeo("Missing enum name [null]", aenVar);
        }
        String string2 = bundle.getString("tag_class_name");
        if (string2 == null) {
            throw new aeo("Missing enum className [null]", aenVar);
        }
        try {
            Class clsG = g(string2);
            if (clsG.isEnum()) {
                return k(clsG, "valueOf", aenVar).invoke(null, string);
            }
            throw new aeo(a.bT(string2, "Class ", " is not an enum"), aenVar);
        } catch (ClassNotFoundException e) {
            throw new aeo(a.bT(string2, "Enum class [", "] not found"), aenVar, e);
        } catch (IllegalArgumentException e2) {
            throw new aeo(a.ch((byte) 93, string2, string, "Enum value [", "] does not exist in enum class ["), aenVar, e2);
        } catch (ReflectiveOperationException e3) {
            throw new aeo(a.bT(string2, "Enum of class [", "] missing valueOf method"), aenVar, e3);
        }
    }

    private static Object i(Bundle bundle, aen aenVar) throws aeo {
        IBinder binder = bundle.getBinder("tag_value");
        if (binder == null) {
            throw new aeo("Bundle is missing the binder", aenVar);
        }
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new aeo("Bundle is missing IInterface class name", aenVar);
        }
        try {
            Class clsG = g(string);
            if (!IInterface.class.isAssignableFrom(clsG)) {
                throw new aeo(a.bT(string, "Interface class ", " does not implement IInterface"), aenVar);
            }
            Object objInvoke = k(clsG, "asInterface", aenVar).invoke(null, binder);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new aeo("Failed to get interface from binder", aenVar);
        } catch (ClassNotFoundException e) {
            throw new aeo("Binder for unknown IInterface: ".concat(string), aenVar, e);
        } catch (ReflectiveOperationException e2) {
            throw new aeo("Method to create IInterface from a Binder is not accessible for interface: ".concat(string), aenVar, e2);
        }
    }

    private static Object j(Bundle bundle, aen aenVar) throws aeo {
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new aeo("Bundle is missing the class name", aenVar);
        }
        try {
            Class clsG = g(string);
            if (!clsG.isAnnotationPresent(yf.class)) {
                throw new aeo(a.ce(string, "Invalid class not marked as CarProtocol: "), aenVar);
            }
            Constructor declaredConstructor = clsG.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(null);
            for (Field field : l(clsG)) {
                field.setAccessible(true);
                String strC = c(field);
                Object obj = bundle.get(strC);
                if (obj == null) {
                    obj = bundle.get(strC.replaceAll("androidx.core.graphics.drawable.IconCompat", "androidx.core.graphics.drawable.IconCompat"));
                }
                if (obj instanceof Bundle) {
                    field.set(objNewInstance, b((Bundle) obj, aenVar));
                }
            }
            return objNewInstance;
        } catch (ClassNotFoundException e) {
            throw new aeo("Object for unknown class: ".concat(string), aenVar, e);
        } catch (IllegalArgumentException e2) {
            throw new aeo("Failed to deserialize class: ".concat(string), aenVar, e2);
        } catch (NoSuchMethodException e3) {
            throw new aeo("Object missing no args constructor: ".concat(string), aenVar, e3);
        } catch (ReflectiveOperationException e4) {
            throw new aeo("Constructor or field is not accessible: ".concat(string), aenVar, e4);
        }
    }

    private static Method k(Class cls, String str, aen aenVar) throws aeo {
        if (cls == null || cls == Object.class) {
            throw new aeo("No method " + str + " in class " + cls, aenVar);
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return k(cls.getSuperclass(), str, aenVar);
    }

    private static List l(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (cls != null && cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            arrayList.addAll(l(cls.getSuperclass()));
        }
        return arrayList;
    }

    private static void m(Bundle bundle, Collection collection, aen aenVar) throws aeo {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new aeo("Bundle is missing the collection", aenVar);
        }
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            collection.add(b((Bundle) ((Parcelable) parcelableArrayList.get(i)), aenVar));
        }
    }
}
