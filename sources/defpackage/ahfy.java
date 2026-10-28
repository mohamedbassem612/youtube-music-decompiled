package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahfy {
    private final List a;
    private final Map b;

    private ahfy(List list, Map map) {
        this.a = list;
        this.b = map;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    public static final ahfy e(byte[] bArr, ahfu ahfuVar) {
        ahiq ahiqVar;
        int iBd;
        String str;
        try {
            ahir ahirVar = (ahir) aihn.parseFrom(ahir.a, bArr, ExtensionRegistryLite.a);
            Iterator it = ahirVar.c.iterator();
            do {
                boolean z = false;
                if (!it.hasNext()) {
                    if (ahirVar == null || ahirVar.c.size() <= 0) {
                        throw new GeneralSecurityException("empty keyset");
                    }
                    List<ahfx> listI = i(ahirVar, ahfuVar);
                    if (j(ahfuVar)) {
                        HashSet hashSet = new HashSet();
                        for (ahfx ahfxVar : listI) {
                            int i = ahfxVar.c;
                            Integer numValueOf = Integer.valueOf(i);
                            if (hashSet.contains(numValueOf)) {
                                throw new GeneralSecurityException(a.bP(i, "KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                            }
                            hashSet.add(numValueOf);
                            z |= ahfxVar.d;
                        }
                        if (!z) {
                            throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                        }
                    }
                    return new ahfy(listI, new HashMap());
                }
                ahiqVar = (ahiq) it.next();
                ahip ahipVar = ahiqVar.c;
                if (ahipVar == null) {
                    ahipVar = ahip.a;
                }
                int iBd2 = a.bd(ahipVar.d);
                if (iBd2 != 0 && iBd2 == 2) {
                    break;
                }
                ahip ahipVar2 = ahiqVar.c;
                int iBd3 = a.bd((ahipVar2 == null ? ahip.a : ahipVar2).d);
                if (iBd3 != 0 && iBd3 == 3) {
                    break;
                }
                if (ahipVar2 == null) {
                    ahipVar2 = ahip.a;
                }
                iBd = a.bd(ahipVar2.d);
                if (iBd == 0) {
                    iBd = 1;
                }
            } while (iBd != 4);
            ahip ahipVar3 = ahiqVar.c;
            int iBd4 = a.bd((ahipVar3 == null ? ahip.a : ahipVar3).d);
            if (iBd4 == 0) {
                str = "UNRECOGNIZED";
            } else if (iBd4 == 2) {
                str = "UNKNOWN_KEYMATERIAL";
            } else if (iBd4 == 3) {
                str = "SYMMETRIC";
            } else if (iBd4 == 4) {
                str = "ASYMMETRIC_PRIVATE";
            } else if (iBd4 == 5) {
                str = "ASYMMETRIC_PUBLIC";
            } else if (iBd4 != 6) {
                str = "UNRECOGNIZED";
            } else {
                str = "REMOTE";
            }
            if (ahipVar3 == null) {
                ahipVar3 = ahip.a;
            }
            throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", str, ahipVar3.b));
        } catch (aiik unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    private static ahgb h(ahiq ahiqVar) throws GeneralSecurityException {
        int i = ahiqVar.e;
        int iBa = a.ba(ahiqVar.f);
        Integer numValueOf = (iBa == 0 || iBa != 5) ? Integer.valueOf(i) : null;
        ahip ahipVar = ahiqVar.c;
        if (ahipVar == null) {
            ahipVar = ahip.a;
        }
        String str = ahipVar.b;
        ahip ahipVar2 = ahiqVar.c;
        aigj aigjVar = (ahipVar2 == null ? ahip.a : ahipVar2).c;
        if (ahipVar2 == null) {
            ahipVar2 = ahip.a;
        }
        int iBd = a.bd(ahipVar2.d);
        if (iBd == 0) {
            iBd = 1;
        }
        ahfz ahfzVarR = agvp.r(iBd);
        int iBa2 = a.ba(ahiqVar.f);
        return ahgb.a(str, aigjVar, ahfzVarR, agvp.s(iBa2 != 0 ? iBa2 : 1), numValueOf);
    }

    private static List i(ahir ahirVar, ahfu ahfuVar) throws GeneralSecurityException {
        ahfv ahhcVar;
        boolean z;
        ArrayList arrayList = new ArrayList(ahirVar.c.size());
        for (ahiq ahiqVar : ahirVar.c) {
            int i = ahiqVar.e;
            try {
                ahgb ahgbVarH = h(ahiqVar);
                ahgc ahgcVar = (ahgc) ahfuVar.a(ahgc.class);
                if (ahgcVar == null) {
                    throw new GeneralSecurityException("Passed in configuration cannot be used to serialize into proto keyset format.");
                }
                ahhcVar = ahgcVar.a(ahgbVarH, ahgj.a);
                z = false;
            } catch (GeneralSecurityException e) {
                if (j(ahfuVar)) {
                    throw e;
                }
                ahhcVar = new ahhc(h(ahiqVar), ahgj.a);
                z = true;
            }
            if (j(ahfuVar)) {
                int iAW = a.aW(ahiqVar.d);
                if (iAW == 0) {
                    iAW = 1;
                }
                if (!k(iAW)) {
                    throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
                }
            }
            int iAW2 = a.aW(ahiqVar.d);
            if (iAW2 == 0) {
                iAW2 = 1;
            }
            arrayList.add(new ahfx(ahhcVar, iAW2, i, i == ahirVar.b, z));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private static boolean j(ahfu ahfuVar) {
        return ahfuVar.a(ahib.class) == null;
    }

    private static boolean k(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public final int a() {
        return this.a.size();
    }

    public final ahft b(Class cls) {
        return (ahft) this.b.get(cls);
    }

    public final ahfx c(int i) {
        if (i < 0 || i >= a()) {
            throw new IndexOutOfBoundsException("Invalid index " + i + " for keyset of size " + a());
        }
        List list = this.a;
        ahfx ahfxVar = (ahfx) list.get(i);
        if (!k(ahfxVar.f)) {
            throw new IllegalStateException(a.bP(i, "Keyset-Entry at position ", " has wrong status"));
        }
        if (ahfxVar.e) {
            throw new IllegalStateException(a.bP(i, "Keyset-Entry at position ", " didn't parse correctly"));
        }
        return (ahfx) list.get(i);
    }

    public final ahfx d() {
        for (ahfx ahfxVar : this.a) {
            if (ahfxVar != null && ahfxVar.d) {
                if (ahfxVar.b == ahfw.a) {
                    return ahfxVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    @Deprecated
    final ahit f() {
        int i;
        try {
            ahfu ahfuVar = ahgi.b;
            aihf aihfVarCreateBuilder = ahir.a.createBuilder();
            for (ahfx ahfxVar : this.a) {
                ahfv ahfvVar = ahfxVar.a;
                int i2 = ahfxVar.f;
                int i3 = ahfxVar.c;
                ahgc ahgcVar = (ahgc) ahfuVar.a(ahgc.class);
                if (ahgcVar == null) {
                    throw new GeneralSecurityException("Passed in configuration cannot be used to parse and serialize proto keysets.");
                }
                ahgb ahgbVarB = ahgcVar.b(ahfvVar, ahgj.a);
                Integer numA = ahfvVar.a();
                if (numA != null && numA.intValue() != i3) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                aihf aihfVarCreateBuilder2 = ahiq.a.createBuilder();
                aihf aihfVarCreateBuilder3 = ahip.a.createBuilder();
                Object obj = ahgbVarB.a;
                aihfVarCreateBuilder3.copyOnWrite();
                ahip ahipVar = (ahip) aihfVarCreateBuilder3.instance;
                obj.getClass();
                ahipVar.b = (String) obj;
                Object obj2 = ahgbVarB.b;
                aihfVarCreateBuilder3.copyOnWrite();
                ahip ahipVar2 = (ahip) aihfVarCreateBuilder3.instance;
                obj2.getClass();
                ahipVar2.c = (aigj) obj2;
                int iT = agvp.t((ahfz) ahgbVarB.c);
                aihfVarCreateBuilder3.copyOnWrite();
                ((ahip) aihfVarCreateBuilder3.instance).d = iT - 2;
                aihfVarCreateBuilder2.copyOnWrite();
                ahiq ahiqVar = (ahiq) aihfVarCreateBuilder2.instance;
                ahip ahipVar3 = (ahip) aihfVarCreateBuilder3.build();
                ahipVar3.getClass();
                ahiqVar.c = ahipVar3;
                ahiqVar.b |= 1;
                aihfVarCreateBuilder2.copyOnWrite();
                ((ahiq) aihfVarCreateBuilder2.instance).d = agvp.n(i2);
                aihfVarCreateBuilder2.copyOnWrite();
                ((ahiq) aihfVarCreateBuilder2.instance).e = i3;
                Object obj3 = ahgbVarB.d;
                if (obj3.equals(ahga.a)) {
                    i = 2;
                } else if (obj3.equals(ahga.b)) {
                    i = 3;
                } else if (obj3.equals(ahga.c)) {
                    i = 4;
                } else if (obj3.equals(ahga.d)) {
                    i = 5;
                } else if (obj3.equals(ahga.e)) {
                    i = 6;
                } else {
                    if (!obj3.equals(ahga.f)) {
                        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(((ahga) obj3).g));
                    }
                    i = 7;
                }
                aihfVarCreateBuilder2.copyOnWrite();
                ((ahiq) aihfVarCreateBuilder2.instance).f = agvp.m(i);
                ahiq ahiqVar2 = (ahiq) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder.copyOnWrite();
                ahir ahirVar = (ahir) aihfVarCreateBuilder.instance;
                ahiqVar2.getClass();
                aiie aiieVar = ahirVar.c;
                if (!aiieVar.c()) {
                    ahirVar.c = aihn.mutableCopy(aiieVar);
                }
                ahirVar.c.add(ahiqVar2);
                if (ahfxVar.d) {
                    aihfVarCreateBuilder.copyOnWrite();
                    ((ahir) aihfVarCreateBuilder.instance).b = i3;
                }
            }
            ahir ahirVar2 = (ahir) aihfVarCreateBuilder.build();
            int i4 = ahgk.a;
            aihf aihfVarCreateBuilder4 = ahit.a.createBuilder();
            int i5 = ahirVar2.b;
            aihfVarCreateBuilder4.copyOnWrite();
            ((ahit) aihfVarCreateBuilder4.instance).b = i5;
            for (ahiq ahiqVar3 : ahirVar2.c) {
                aihf aihfVarCreateBuilder5 = ahis.a.createBuilder();
                ahip ahipVar4 = ahiqVar3.c;
                if (ahipVar4 == null) {
                    ahipVar4 = ahip.a;
                }
                String str = ahipVar4.b;
                aihfVarCreateBuilder5.copyOnWrite();
                ahis ahisVar = (ahis) aihfVarCreateBuilder5.instance;
                str.getClass();
                ahisVar.b = str;
                int iAW = a.aW(ahiqVar3.d);
                if (iAW == 0) {
                    iAW = 1;
                }
                aihfVarCreateBuilder5.copyOnWrite();
                ((ahis) aihfVarCreateBuilder5.instance).c = agvp.n(iAW);
                int iBa = a.ba(ahiqVar3.f);
                if (iBa == 0) {
                    iBa = 1;
                }
                aihfVarCreateBuilder5.copyOnWrite();
                ((ahis) aihfVarCreateBuilder5.instance).e = agvp.m(iBa);
                int i6 = ahiqVar3.e;
                aihfVarCreateBuilder5.copyOnWrite();
                ((ahis) aihfVarCreateBuilder5.instance).d = i6;
                ahis ahisVar2 = (ahis) aihfVarCreateBuilder5.build();
                aihfVarCreateBuilder4.copyOnWrite();
                ahit ahitVar = (ahit) aihfVarCreateBuilder4.instance;
                ahisVar2.getClass();
                aiie aiieVar2 = ahitVar.c;
                if (!aiieVar2.c()) {
                    ahitVar.c = aihn.mutableCopy(aiieVar2);
                }
                ahitVar.c.add(ahisVar2);
            }
            return (ahit) aihfVarCreateBuilder4.build();
        } catch (GeneralSecurityException e) {
            throw new IllegalArgumentException("Cannot get keyset info: key cannot be serialized", e);
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [ahhx, java.lang.Object] */
    public final Object g(ahfu ahfuVar, Class cls) throws GeneralSecurityException {
        for (int i = 0; i < a(); i++) {
            List list = this.a;
            ahfw ahfwVar = ((ahfx) list.get(i)).b;
            ahfw ahfwVar2 = ahfw.a;
            if (ahfwVar == ahfwVar2) {
                for (int i2 = 0; i2 < a(); i2++) {
                    if (((ahfx) list.get(i2)).e || !k(((ahfx) list.get(i2)).f)) {
                        ahfv ahfvVar = ((ahfx) list.get(i2)).a;
                        throw new GeneralSecurityException("Key parsing of key with index " + i2 + " and type_url " + ((String) (ahfvVar instanceof ahhc ? ((ahhc) ahfvVar).c(ahgj.a).a : "(unknown)")) + " failed, unable to get primitive");
                    }
                }
                int i3 = ahgk.a;
                boolean z = false;
                for (int i4 = 0; i4 < a(); i4++) {
                    ahfx ahfxVarC = c(i4);
                    if (ahfxVarC.b == ahfwVar2 && ahfxVarC.d) {
                        if (z) {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                        z = true;
                    }
                }
                ahtv ahtvVar = (ahtv) ((ahhq) ahfuVar).b.get(cls);
                if (ahtvVar != null) {
                    return ahtvVar.a.a(this, new ahhp(ahfuVar, ahtvVar));
                }
                throw new GeneralSecurityException("No wrapper registered for primitive class: ".concat(String.valueOf(cls.getName())));
            }
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }

    public final String toString() {
        return f().toString();
    }
}
