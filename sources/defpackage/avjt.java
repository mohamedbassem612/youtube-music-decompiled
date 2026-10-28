package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class avjt {
    private avjt() {
    }

    public static Set d(Map map, String str) {
        Status.Code code;
        List listL = l(map, str);
        if (listL == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(Status.Code.class);
        for (Object obj : listL) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int iIntValue = d.intValue();
                aguu.ai(((double) iIntValue) == d.doubleValue(), "Status code %s is not integral", obj);
                code = Status.fromCodeValue(iIntValue).getCode();
                aguu.ai(code.value() == d.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new agfz("Can not convert status code " + String.valueOf(obj) + " to Status.Code, because its type is " + String.valueOf(obj.getClass()));
                }
                try {
                    Status.Code code2 = Status.Code.OK;
                    code = (Status.Code) Enum.valueOf(Status.Code.class, (String) obj);
                } catch (IllegalArgumentException e) {
                    throw new agfz(enb.b(obj, "Status code ", " is not valid"), e);
                }
            }
            enumSetNoneOf.add(code);
        }
        return DesugarCollections.unmodifiableSet(enumSetNoneOf);
    }

    public static PasswordAuthentication e(String str, InetAddress inetAddress, int i) {
        URL url;
        try {
            url = new URL("https", str, i, "");
        } catch (MalformedURLException unused) {
            avik.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", str});
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i, "https", "", null, url, Authenticator.RequestorType.PROXY);
    }

    public static avgh f() {
        return avir.a == null ? new avir() : new avde();
    }

    public static Boolean g(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static Double h(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Integer i(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d = (Double) obj;
        int iIntValue = d.intValue();
        if (iIntValue == d.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        throw new ClassCastException("Number expected to be integer: ".concat(String.valueOf(d)));
    }

    public static Long j(Map map, String str) {
        boolean z;
        int iCharAt;
        String strK = k(map, str);
        if (strK == null) {
            return null;
        }
        try {
            if (strK.isEmpty() || strK.charAt(strK.length() - 1) != 's') {
                throw new ParseException("Invalid duration string: ".concat(strK), 0);
            }
            if (strK.charAt(0) == '-') {
                strK = strK.substring(1);
                z = true;
            } else {
                z = false;
            }
            String strSubstring = strK.substring(0, strK.length() - 1);
            String strSubstring2 = "";
            int iIndexOf = strSubstring.indexOf(46);
            if (iIndexOf != -1) {
                strSubstring2 = strSubstring.substring(iIndexOf + 1);
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            long jD = Long.parseLong(strSubstring);
            if (strSubstring2.isEmpty()) {
                iCharAt = 0;
            } else {
                iCharAt = 0;
                for (int i = 0; i < 9; i++) {
                    iCharAt *= 10;
                    if (i < strSubstring2.length()) {
                        if (strSubstring2.charAt(i) < '0' || strSubstring2.charAt(i) > '9') {
                            throw new ParseException("Invalid nanoseconds.", 0);
                        }
                        iCharAt += strSubstring2.charAt(i) - '0';
                    }
                }
            }
            if (jD < 0) {
                throw new ParseException("Invalid duration string: ".concat(String.valueOf(strK)), 0);
            }
            if (z) {
                jD = -jD;
                iCharAt = -iCharAt;
            }
            if (iCharAt <= -1000000000 || iCharAt >= 1000000000) {
                try {
                    jD = a.d(jD, iCharAt / 1000000000);
                    iCharAt %= 1000000000;
                } catch (IllegalArgumentException unused) {
                    throw new ParseException("Duration value is out of range.", 0);
                }
            }
            if (jD > 0 && iCharAt < 0) {
                iCharAt += 1000000000;
                jD--;
            }
            if (jD < 0 && iCharAt > 0) {
                iCharAt -= 1000000000;
                jD++;
            }
            if (!a.aG(jD, iCharAt)) {
                throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(jD), Integer.valueOf(iCharAt)));
            }
            long nanos = TimeUnit.SECONDS.toNanos(jD);
            long j = iCharAt;
            long j2 = nanos + j;
            if ((((j ^ nanos) > 0L ? 1 : ((j ^ nanos) == 0L ? 0 : -1)) | (((nanos ^ j2) > 0L ? 1 : ((nanos ^ j2) == 0L ? 0 : -1)) ^ (-1))) >= 0) {
                j2 = ((j2 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
            return Long.valueOf(j2);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static String k(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static List l(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List m(Map map, String str) {
        List listL = l(map, str);
        if (listL == null) {
            return null;
        }
        p(listL);
        return listL;
    }

    public static List n(Map map, String str) {
        List listL = l(map, str);
        if (listL == null) {
            return null;
        }
        for (int i = 0; i < listL.size(); i++) {
            if (!(listL.get(i) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listL.get(i), Integer.valueOf(i), listL));
            }
        }
        return listL;
    }

    public static Map o(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static void p(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
    }

    public static List q(Class cls, Iterator it, agfr agfrVar, avcc avccVar) {
        if (!(it instanceof ListIterator)) {
            if (r(cls.getClassLoader())) {
                Iterable<Class> iterable = (Iterable) agfrVar.io();
                ArrayList arrayList = new ArrayList();
                for (Class cls2 : iterable) {
                    Object objNewInstance = null;
                    try {
                        objNewInstance = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                    } catch (ClassCastException unused) {
                    } catch (Throwable th) {
                        throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                    }
                    if (objNewInstance != null) {
                        arrayList.add(objNewInstance);
                    }
                }
                it = arrayList.iterator();
            } else if (!it.hasNext()) {
                it = ServiceLoader.load(cls).iterator();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        while (it.hasNext()) {
            Object next = it.next();
            avccVar.b(next);
            arrayList2.add(next);
        }
        Collections.sort(arrayList2, Collections.reverseOrder(new fui(avccVar, 14)));
        return DesugarCollections.unmodifiableList(arrayList2);
    }

    public static boolean r(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static axst s(int i) {
        return new axst(ByteBuffer.allocateDirect(Math.min(1048576, i)));
    }

    public avjt(char[] cArr) {
    }

    public void c(long j) {
    }
}
