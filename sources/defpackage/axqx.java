package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.chromium.base.version_info.VersionConstantsBridge;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axqx {
    public static final /* synthetic */ int a = 0;
    private static final char[] b;

    static {
        char[] cArr = new char[80];
        b = cArr;
        Arrays.fill(cArr, ' ');
    }

    static void a(StringBuilder sb, int i, String str, Object obj) {
        String strReplace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i, sb);
        sb.append(a.ah(str));
        if (!(obj instanceof String)) {
            if (obj instanceof axpo) {
                sb.append(": \"");
                sb.append(VersionConstantsBridge.a((axpo) obj));
                sb.append('\"');
                return;
            }
            if (obj instanceof axqf) {
                sb.append(" {");
                b((axqf) obj, sb, i + 2);
                sb.append('\n');
                c(i, sb);
                sb.append('}');
                return;
            }
            if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
                return;
            }
            int i2 = i + 2;
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            a(sb, i2, "key", entry.getKey());
            a(sb, i2, "value", entry.getValue());
            sb.append('\n');
            c(i, sb);
            sb.append('}');
            return;
        }
        sb.append(": \"");
        String strReplace2 = (String) obj;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < strReplace2.length(); i3++) {
            char cCharAt = strReplace2.charAt(i3);
            if (cCharAt < ' ' || cCharAt > '~') {
                strReplace = a.ad(strReplace2.getBytes(StandardCharsets.UTF_8));
                sb.append(strReplace);
                sb.append('\"');
            } else {
                if (cCharAt == '\"') {
                    z3 = true;
                } else if (cCharAt == '\'') {
                    z2 = true;
                } else if (cCharAt == '\\') {
                    z = true;
                }
            }
        }
        if (z) {
            strReplace2 = strReplace2.replace("\\", "\\\\");
        }
        strReplace = z2 ? strReplace2.replace("'", "\\'") : strReplace2;
        if (z3) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        sb.append(strReplace);
        sb.append('\"');
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fc  */
    public static void b(axqv axqvVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = axqvVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    String strSubstring2 = strSubstring.substring(0, strSubstring.length() - 4);
                    Map map2 = axqf.defaultInstanceMap;
                    a(sb, i, strSubstring2, a.am(method2, axqvVar, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                String strSubstring3 = strSubstring.substring(0, strSubstring.length() - 3);
                Map map3 = axqf.defaultInstanceMap;
                a(sb, i, strSubstring3, a.am(method, axqvVar, new Object[0]));
            } else if (hashSet.contains("set".concat(String.valueOf(strSubstring))) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(String.valueOf(strSubstring)));
                if (method4 != null) {
                    Map map4 = axqf.defaultInstanceMap;
                    Object objAm = a.am(method4, axqvVar, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) a.am(method5, axqvVar, new Object[0])).booleanValue();
                    } else if (objAm instanceof Boolean) {
                        if (((Boolean) objAm).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objAm instanceof Integer) {
                        if (((Integer) objAm).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objAm instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) objAm).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objAm instanceof Double)) {
                        if (objAm instanceof String) {
                            zEquals = objAm.equals("");
                        } else if (objAm instanceof axpo) {
                            zEquals = objAm.equals(axpo.d);
                        } else if (!(objAm instanceof axqv) ? !((objAm instanceof Enum) && ((Enum) objAm).ordinal() == 0) : objAm != ((axqv) objAm).e()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (Double.doubleToRawLongBits(((Double) objAm).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        a(sb, i, strSubstring, objAm);
                    }
                }
            }
            i2 = i3;
        }
        if (axqvVar instanceof axqe) {
            Iterator itB = ((axqe) axqvVar).extensions.b();
            if (itB.hasNext()) {
                throw null;
            }
        }
        axrm axrmVar = ((axqf) axqvVar).unknownFields;
        if (axrmVar != null) {
            for (int i5 = 0; i5 < axrmVar.b; i5++) {
                a(sb, i, String.valueOf(axrmVar.c[i5] >>> 3), axrmVar.d[i5]);
            }
        }
    }

    private static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(b, 0, i2);
            i -= i2;
        }
    }
}
