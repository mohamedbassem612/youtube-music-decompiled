package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apb {
    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final long b(int i, int i2) {
        if (((i ^ (-1)) & (i2 ^ (-1))) >= 0) {
            api.a(a.cj(i2, i, "width(", ") and height(", ") must be >= 0"));
        }
        return ape.b(i, i, i2, i2);
    }

    public static final String c(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        float fPow = (float) Math.pow(10.0d, 1.0d);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        return String.valueOf(i / fPow);
    }

    public static final Object d(Class cls) {
        String name;
        Package r0 = cls.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            canonicalName.getClass();
        }
        canonicalName.getClass();
        String strReplace = canonicalName.replace('.', '_');
        strReplace.getClass();
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls2 = Class.forName(name.length() == 0 ? strConcat : a.cl(strConcat, (byte) 46, name), true, cls.getClassLoader());
            cls2.getClass();
            return cls2.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor ".concat(String.valueOf(cls.getCanonicalName())), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of ".concat(String.valueOf(cls.getCanonicalName())), e3);
        }
    }

    public static final Object e(dmq dmqVar, boolean z, awoq awoqVar) {
        dmx dmxVar = (dmx) awoqVar.getContext().get(dmx.b);
        awou awouVar = dmxVar != null ? dmxVar.a : null;
        if (!dmqVar.q()) {
            awou awouVarK = dmqVar.k();
            if (awouVar == null) {
                awouVar = awov.a;
            }
            return awouVarK.plus(awouVar);
        }
        if (awouVar != null) {
            return dmqVar.k().plus(awouVar);
        }
        if (!z) {
            return dmqVar.k();
        }
        awou awouVar2 = dmqVar.b;
        if (awouVar2 != null) {
            return awouVar2;
        }
        awrc.b("transactionContext");
        return null;
    }

    public static final Object f(dmq dmqVar, boolean z, boolean z2, awqg awqgVar) {
        dmqVar.l();
        if (dmqVar.q() && !dmqVar.r()) {
            awou awouVar = (awou) dmqVar.g.get();
            if ((awouVar != null ? (dmx) awouVar.get(dmx.b) : null) != null) {
                throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
            }
        }
        awou awouVar2 = (awou) dmqVar.g.get();
        if (awouVar2 == null) {
            awouVar2 = awov.a;
        }
        return dms.e(new dof(awouVar2, dmqVar, z2, z, awqgVar, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [awqg] */
    /* JADX WARN: Type inference failed for: r14v2 */
    public static final Object g(dmq dmqVar, boolean z, boolean z2, awqg awqgVar, awoq awoqVar) throws Throwable {
        doh dohVar;
        boolean z3;
        Object objE;
        boolean z4;
        ?? r14;
        Object obj;
        if (awoqVar instanceof doh) {
            dohVar = (doh) awoqVar;
            int i = dohVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                dohVar.f = i - Integer.MIN_VALUE;
            } else {
                dohVar = new doh(awoqVar);
            }
        } else {
            dohVar = new doh(awoqVar);
        }
        doh dohVar2 = dohVar;
        Object obj2 = dohVar2.e;
        awox awoxVar = awox.a;
        int i2 = dohVar2.f;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    z3 = dohVar2.d;
                    boolean z5 = dohVar2.c;
                    Object obj3 = dohVar2.b;
                    Object obj4 = dohVar2.a;
                    atqp.j(obj2);
                    z4 = z5;
                    r14 = obj3;
                    objE = obj2;
                    obj = obj4;
                } else if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            atqp.j(obj2);
            return obj2;
        }
        atqp.j(obj2);
        if (dmqVar.q() && dmqVar.s() && dmqVar.r()) {
            doi doiVar = new doi(z2, z, dmqVar, null, awqgVar, 0);
            dohVar2.f = 1;
            Object objV = dmqVar.v(doiVar, dohVar2);
            if (objV != awoxVar) {
                return objV;
            }
        } else {
            dmq dmqVar2 = dmqVar;
            z3 = z2;
            dohVar2.a = dmqVar2;
            dohVar2.b = awqgVar;
            dohVar2.c = z;
            dohVar2.d = z3;
            dohVar2.f = 2;
            objE = e(dmqVar2, z3, dohVar2);
            if (objE != awoxVar) {
                z4 = z;
                r14 = awqgVar;
                obj = dmqVar2;
            }
        }
        return awoxVar;
        dog dogVar = new dog((awoq) null, (dmq) obj, z4, z3, (awqg) r14, 0);
        dohVar2.a = null;
        dohVar2.b = null;
        dohVar2.f = 3;
        Object objP = awro.p((awou) objE, dogVar, dohVar2);
        if (objP != awoxVar) {
            return objP;
        }
        return awoxVar;
    }

    public static final void h(dpt dptVar) throws Exception {
        awoa awoaVar = new awoa(10);
        dpb dpbVarA = dptVar.a("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (dpbVarA.l()) {
            try {
                awoaVar.add(dpbVarA.d(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        dpbVarA.close();
                    } catch (Throwable th3) {
                        avkz.d(th, th3);
                    }
                    throw th2;
                }
            }
        }
        dpbVarA.close();
        ListIterator listIterator = ((awoa) awoaVar.f()).listIterator(0);
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            str.getClass();
            if (str.startsWith("room_fts_content_sync_")) {
                azu.i(dptVar, "DROP TRIGGER IF EXISTS ".concat(String.valueOf(str)));
            }
        }
    }

    public static void i(dob dobVar, dpt dptVar) {
        dobVar.a(dptVar.a);
    }
}
