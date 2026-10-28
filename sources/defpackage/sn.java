package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class sn {
    private static volatile sn a;
    private final Map b = new HashMap();

    private sn() {
    }

    public static sn b() {
        if (a == null) {
            synchronized (sn.class) {
                if (a == null) {
                    a = new sn();
                }
            }
        }
        return a;
    }

    private final sm c(Class cls) throws ts {
        String strConcat;
        Package r0 = cls.getPackage();
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new ts(2, a.bV(cls, "Failed to find simple name for document class \"", "\". Perhaps it is anonymous?"), null);
        }
        if (r0 != null) {
            strConcat = String.valueOf(r0.getName()).concat(".");
            canonicalName = canonicalName.substring(strConcat.length()).replace(".", "$$__");
        } else {
            strConcat = "";
        }
        String strCd = a.cd(canonicalName, strConcat, "$$__AppSearch__");
        try {
            try {
                return (sm) Class.forName(strCd).getDeclaredConstructor(null).newInstance(null);
            } catch (Exception e) {
                throw new ts(2, a.bU((byte) 34, strCd, "Failed to construct document class converter \""), e);
            }
        } catch (ClassNotFoundException e2) {
            Class superclass = cls.getSuperclass();
            Class<?>[] interfaces = cls.getInterfaces();
            Class cls2 = superclass != Object.class ? superclass : null;
            int length = interfaces.length;
            if (cls2 != null) {
                length++;
            }
            if (length == 1) {
                return cls2 != null ? c(cls2) : c(interfaces[0]);
            }
            String strBT = a.bT(strCd, "Failed to find document class converter \"", "\". Perhaps the annotation processor was not run or the class was proguarded out?");
            if (length > 1) {
                strBT = strBT.concat(" Or, this class may not have been annotated with @Document, and there is an ambiguity to determine a unique @Document annotated parent class/interface.");
            }
            throw new ts(2, strBT, e2);
        }
    }

    public final sm a(Class cls) throws ts {
        sm smVarC;
        azs.l(cls);
        synchronized (this) {
            smVarC = (sm) this.b.get(cls);
        }
        if (smVarC == null) {
            smVarC = c(cls);
            synchronized (this) {
                Map map = this.b;
                sm smVar = (sm) map.get(cls);
                if (smVar == null) {
                    map.put(cls, smVarC);
                } else {
                    smVarC = smVar;
                }
            }
        }
        return smVarC;
    }
}
