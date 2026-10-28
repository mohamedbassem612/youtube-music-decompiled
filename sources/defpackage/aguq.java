package defpackage;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class aguq extends agtu {
    private final aguo a;
    private final aguu b;
    private final agup c;
    private final agtt d;

    public aguq() {
        aguo aguoVar = (aguo) p(aguo.class, "flogger.backend_factory");
        this.a = aguoVar == null ? agur.a : aguoVar;
        aguu aguuVar = (aguu) p(aguu.class, "flogger.logging_context");
        this.b = aguuVar == null ? aguw.a : aguuVar;
        agup agupVar = (agup) p(agup.class, "flogger.clock");
        this.c = agupVar == null ? agut.a : agupVar;
        this.d = agus.a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6 A[LOOP:0: B:37:0x00c0->B:39:0x00c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    private static Object p(Class cls, String str) {
        String property;
        int i;
        Object objCast;
        ArrayList arrayList;
        Iterator it;
        int size;
        try {
            property = System.getProperty(str, null);
        } catch (SecurityException e) {
            agvp.a("cannot read property name %s: %s", str, e);
            property = null;
        }
        if (property != null) {
            int iIndexOf = property.indexOf(35);
            String strSubstring = iIndexOf == -1 ? property : property.substring(0, iIndexOf);
            String strSubstring2 = iIndexOf == -1 ? "getInstance" : property.substring(iIndexOf + 1);
            String str2 = strSubstring + '#' + strSubstring2 + "()";
            i = 0;
            try {
                Class<?> cls2 = Class.forName(strSubstring);
                try {
                    objCast = cls.cast(cls2.getMethod(strSubstring2, null).invoke(null, null));
                } catch (NoSuchMethodException e2) {
                    if (iIndexOf == -1 || !strSubstring2.equals("getInstance")) {
                        agvp.a("method '%s' does not exist: %s\n", property, e2);
                        objCast = null;
                    } else {
                        a.bT(strSubstring, "new ", "()");
                        objCast = cls.cast(cls2.getConstructor(null).newInstance(null));
                    }
                }
            } catch (ClassCastException e3) {
                agvp.a("cannot cast result of calling '%s' to '%s': %s\n", str2, cls.getName(), e3);
            } catch (ClassNotFoundException unused) {
            } catch (Exception e4) {
                agvp.a("cannot call expected no-argument constructor or static method '%s': %s\n", str2, e4);
            }
            if (objCast != null) {
                return objCast;
            }
            arrayList = new ArrayList();
            it = ServiceLoader.load(cls).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            size = arrayList.size();
            if (size != 0) {
                return null;
            }
            if (size != 1) {
                return arrayList.get(i);
            }
            PrintStream printStream = System.err;
            Object[] objArr = new Object[3];
            objArr[i] = cls.getName();
            objArr[1] = arrayList;
            objArr[2] = str;
            printStream.printf("Multiple implementations of service %s found on the classpath: %s%nEnsure only the service implementation you want to use is included on the classpath or else specify the service class at startup with the '%s' system property. The default implementation will be used instead.%n", objArr);
            return null;
        }
        i = 0;
        objCast = null;
        if (objCast != null) {
            return objCast;
        }
        arrayList = new ArrayList();
        it = ServiceLoader.load(cls).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        size = arrayList.size();
        if (size != 0) {
            return null;
        }
        if (size != 1) {
            return arrayList.get(i);
        }
        PrintStream printStream2 = System.err;
        Object[] objArr2 = new Object[3];
        objArr2[i] = cls.getName();
        objArr2[1] = arrayList;
        objArr2[2] = str;
        printStream2.printf("Multiple implementations of service %s found on the classpath: %s%nEnsure only the service implementation you want to use is included on the classpath or else specify the service class at startup with the '%s' system property. The default implementation will be used instead.%n", objArr2);
        return null;
    }

    @Override // defpackage.agtu
    protected final long c() {
        return this.c.a();
    }

    @Override // defpackage.agtu
    protected final agsw e(String str) {
        return this.a.a(str);
    }

    @Override // defpackage.agtu
    protected final agtt h() {
        return this.d;
    }

    @Override // defpackage.agtu
    protected final aguu j() {
        return this.b;
    }

    @Override // defpackage.agtu
    protected final String m() {
        return "Platform: " + getClass().getName() + "\nBackendFactory: " + this.a.toString() + "\nClock: " + this.c.toString() + "\nContextDataProvider: " + String.valueOf(this.b) + "\nLogCallerFinder: Default stack-based caller finder\n";
    }
}
