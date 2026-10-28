package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qjr {
    private static final agfm d = agfm.b('/').a();
    static final qjq a = new qjp(1);
    static final qjq b = new qjp(0);
    static final qjq c = new qjp(2);

    public static List a(String str) {
        return aguu.u(d.h(str), new one(10));
    }

    static void b(qjq qjqVar, aiir aiirVar) {
        String strA = qjqVar.a(aiirVar);
        String strB = qjqVar.b(aiirVar);
        if (!strA.isEmpty() || strB.isEmpty()) {
            qjqVar.c(aiirVar, null);
        } else {
            qjqVar.c(aiirVar, aedi.t(strB));
        }
        qjqVar.d(aiirVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ahad c(ahad ahadVar) {
        String str = ahadVar.d;
        if (str.isEmpty()) {
            return ahadVar;
        }
        String str2 = ahadVar.c;
        boolean zStartsWith = true;
        switch (str2.hashCode()) {
            case -1940179375:
                if (str2.equals("java.lang.AbstractMethodError")) {
                    zStartsWith = str.startsWith("abstract method ");
                } else {
                    zStartsWith = false;
                }
                if (zStartsWith) {
                    return ahadVar;
                }
                aihf builder = ahadVar.toBuilder();
                long jLongValue = aedi.t(str).longValue();
                builder.copyOnWrite();
                ahad ahadVar2 = (ahad) builder.instance;
                ahadVar2.b |= 4;
                ahadVar2.e = jLongValue;
                builder.copyOnWrite();
                ahad ahadVar3 = (ahad) builder.instance;
                ahadVar3.b &= -3;
                ahadVar3.d = ahad.a.d;
                return (ahad) builder.build();
            case -1383341662:
                if (str2.equals("java.lang.StringIndexOutOfBoundsException")) {
                    zStartsWith = Pattern.matches("length=\\d+; index=\\d+", str);
                } else {
                    zStartsWith = false;
                }
                if (zStartsWith) {
                    return ahadVar;
                }
                aihf builder2 = ahadVar.toBuilder();
                long jLongValue2 = aedi.t(str).longValue();
                builder2.copyOnWrite();
                ahad ahadVar4 = (ahad) builder2.instance;
                ahadVar4.b |= 4;
                ahadVar4.e = jLongValue2;
                builder2.copyOnWrite();
                ahad ahadVar5 = (ahad) builder2.instance;
                ahadVar5.b &= -3;
                ahadVar5.d = ahad.a.d;
                return (ahad) builder2.build();
            case -823400207:
                if (str2.equals("java.lang.ArithmeticException")) {
                    zStartsWith = str.equals("divide by zero");
                } else {
                    zStartsWith = false;
                }
                if (zStartsWith) {
                    return ahadVar;
                }
                aihf builder3 = ahadVar.toBuilder();
                long jLongValue3 = aedi.t(str).longValue();
                builder3.copyOnWrite();
                ahad ahadVar6 = (ahad) builder3.instance;
                ahadVar6.b |= 4;
                ahadVar6.e = jLongValue3;
                builder3.copyOnWrite();
                ahad ahadVar7 = (ahad) builder3.instance;
                ahadVar7.b &= -3;
                ahadVar7.d = ahad.a.d;
                return (ahad) builder3.build();
            case -759901694:
                if (str2.equals("java.lang.IllegalAccessError")) {
                    if (Pattern.matches("Illegal class access: '.+' attempting to access .+'", str) || Pattern.matches("Illegal class access ('.+' attempting to access '.+') in attempt to invoke .+ method .+", str) || Pattern.matches("Method '.+' is inaccessible to class '.+'", str) || Pattern.matches("Field '.+' is inaccessible to class '.+'", str) || Pattern.matches("Final field '.+' cannot be written to by method '.+'", str) || Pattern.matches("Method '.+' implementing interface method '.+' is not public", str)) {
                    }
                    aihf builder4 = ahadVar.toBuilder();
                    long jLongValue4 = aedi.t(str).longValue();
                    builder4.copyOnWrite();
                    ahad ahadVar8 = (ahad) builder4.instance;
                    ahadVar8.b |= 4;
                    ahadVar8.e = jLongValue4;
                    builder4.copyOnWrite();
                    ahad ahadVar9 = (ahad) builder4.instance;
                    ahadVar9.b &= -3;
                    ahadVar9.d = ahad.a.d;
                    return (ahad) builder4.build();
                }
                zStartsWith = false;
                if (zStartsWith) {
                    return ahadVar;
                }
                aihf builder5 = ahadVar.toBuilder();
                long jLongValue5 = aedi.t(str).longValue();
                builder5.copyOnWrite();
                ahad ahadVar10 = (ahad) builder5.instance;
                ahadVar10.b |= 4;
                ahadVar10.e = jLongValue5;
                builder5.copyOnWrite();
                ahad ahadVar11 = (ahad) builder5.instance;
                ahadVar11.b &= -3;
                ahadVar11.d = ahad.a.d;
                return (ahad) builder5.build();
            case -437312173:
                if (str2.equals("java.lang.ArrayStoreException")) {
                    zStartsWith = Pattern.matches(".+ cannot be stored in an array of type .+", str);
                } else {
                    zStartsWith = false;
                }
                if (zStartsWith) {
                    return ahadVar;
                }
                aihf builder6 = ahadVar.toBuilder();
                long jLongValue6 = aedi.t(str).longValue();
                builder6.copyOnWrite();
                ahad ahadVar12 = (ahad) builder6.instance;
                ahadVar12.b |= 4;
                ahadVar12.e = jLongValue6;
                builder6.copyOnWrite();
                ahad ahadVar13 = (ahad) builder6.instance;
                ahadVar13.b &= -3;
                ahadVar13.d = ahad.a.d;
                return (ahad) builder6.build();
            case -37663348:
                if (str2.equals("java.lang.ClassCastException")) {
                    zStartsWith = Pattern.matches(".+ cannot be cast to .+", str);
                } else {
                    zStartsWith = false;
                }
                if (zStartsWith) {
                    return ahadVar;
                }
                aihf builder7 = ahadVar.toBuilder();
                long jLongValue7 = aedi.t(str).longValue();
                builder7.copyOnWrite();
                ahad ahadVar14 = (ahad) builder7.instance;
                ahadVar14.b |= 4;
                ahadVar14.e = jLongValue7;
                builder7.copyOnWrite();
                ahad ahadVar15 = (ahad) builder7.instance;
                ahadVar15.b &= -3;
                ahadVar15.d = ahad.a.d;
                return (ahad) builder7.build();
            case 145247949:
                if (str2.equals("java.lang.IncompatibleClassChangeError")) {
                    if (Pattern.matches("The method '.+' was expected to be of type .+ but instead was found to be of type .+", str) || Pattern.matches("Class '.+' does not implement interface '.+' in call to '.+'", str) || Pattern.matches("Expected '.+' to be a (?:static|instance) field rather than a (?:static|instance) field", str) || Pattern.matches("Conflicting default method implementations .+", str)) {
                    }
                    aihf builder8 = ahadVar.toBuilder();
                    long jLongValue8 = aedi.t(str).longValue();
                    builder8.copyOnWrite();
                    ahad ahadVar16 = (ahad) builder8.instance;
                    ahadVar16.b |= 4;
                    ahadVar16.e = jLongValue8;
                    builder8.copyOnWrite();
                    ahad ahadVar17 = (ahad) builder8.instance;
                    ahadVar17.b &= -3;
                    ahadVar17.d = ahad.a.d;
                    return (ahad) builder8.build();
                }
                zStartsWith = false;
                if (zStartsWith) {
                    return ahadVar;
                }
                aihf builder9 = ahadVar.toBuilder();
                long jLongValue9 = aedi.t(str).longValue();
                builder9.copyOnWrite();
                ahad ahadVar18 = (ahad) builder9.instance;
                ahadVar18.b |= 4;
                ahadVar18.e = jLongValue9;
                builder9.copyOnWrite();
                ahad ahadVar19 = (ahad) builder9.instance;
                ahadVar19.b &= -3;
                ahadVar19.d = ahad.a.d;
                return (ahad) builder9.build();
            case 287460082:
                if (str2.equals("java.io.InvalidClassException")) {
                    if (Pattern.matches("cannot bind .+ descriptor to .+", str) || Pattern.matches("Circular reference\\.", str) || Pattern.matches(".*class invalid for deserialization", str) || Pattern.matches("Class descriptor should be initialized", str) || Pattern.matches(".*enum descriptor has non-zero .+", str) || Pattern.matches(".*enum type", str) || Pattern.matches(".*incompatible types for field .+", str) || Pattern.matches(".*invalid descriptor for field .+", str) || Pattern.matches(".*local class incompatible: .+", str) || Pattern.matches(".*local class name incompatible with stream class .+", str) || Pattern.matches("multiple serializable fields named .+", str) || Pattern.matches(".*no valid constructor", str) || Pattern.matches(".*serializable and externalizable flags conflict", str) || Pattern.matches(".*Serializable incompatible with Externalizable", str) || Pattern.matches(".*unmatched serializable field(s) declared", str)) {
                    }
                    aihf builder10 = ahadVar.toBuilder();
                    long jLongValue10 = aedi.t(str).longValue();
                    builder10.copyOnWrite();
                    ahad ahadVar110 = (ahad) builder10.instance;
                    ahadVar110.b |= 4;
                    ahadVar110.e = jLongValue10;
                    builder10.copyOnWrite();
                    ahad ahadVar111 = (ahad) builder10.instance;
                    ahadVar111.b &= -3;
                    ahadVar111.d = ahad.a.d;
                    return (ahad) builder10.build();
                }
                zStartsWith = false;
                if (zStartsWith) {
                    return ahadVar;
                }
                aihf builder11 = ahadVar.toBuilder();
                long jLongValue11 = aedi.t(str).longValue();
                builder11.copyOnWrite();
                ahad ahadVar112 = (ahad) builder11.instance;
                ahadVar112.b |= 4;
                ahadVar112.e = jLongValue11;
                builder11.copyOnWrite();
                ahad ahadVar113 = (ahad) builder11.instance;
                ahadVar113.b &= -3;
                ahadVar113.d = ahad.a.d;
                return (ahad) builder11.build();
            case 1077344571:
                if (str2.equals("java.lang.WrongMethodTypeException")) {
                    zStartsWith = Pattern.matches("Expected .+ but was .+", str);
                } else {
                    zStartsWith = false;
                }
                if (zStartsWith) {
                    return ahadVar;
                }
                aihf builder12 = ahadVar.toBuilder();
                long jLongValue12 = aedi.t(str).longValue();
                builder12.copyOnWrite();
                ahad ahadVar114 = (ahad) builder12.instance;
                ahadVar114.b |= 4;
                ahadVar114.e = jLongValue12;
                builder12.copyOnWrite();
                ahad ahadVar115 = (ahad) builder12.instance;
                ahadVar115.b &= -3;
                ahadVar115.d = ahad.a.d;
                return (ahad) builder12.build();
            case 1270017459:
                if (str2.equals("java.lang.IndexOutOfBoundsException")) {
                    zStartsWith = Pattern.matches("length=\\d+; index=-?\\d+", str);
                } else {
                    zStartsWith = false;
                }
                if (zStartsWith) {
                    return ahadVar;
                }
                aihf builder13 = ahadVar.toBuilder();
                long jLongValue13 = aedi.t(str).longValue();
                builder13.copyOnWrite();
                ahad ahadVar116 = (ahad) builder13.instance;
                ahadVar116.b |= 4;
                ahadVar116.e = jLongValue13;
                builder13.copyOnWrite();
                ahad ahadVar117 = (ahad) builder13.instance;
                ahadVar117.b &= -3;
                ahadVar117.d = ahad.a.d;
                return (ahad) builder13.build();
            case 1625905794:
                if (str2.equals("java.lang.ArrayIndexOutOfBoundsException")) {
                    zStartsWith = Pattern.matches("length=\\d+; index=-?\\d+", str);
                } else {
                    zStartsWith = false;
                }
                if (zStartsWith) {
                    return ahadVar;
                }
                aihf builder14 = ahadVar.toBuilder();
                long jLongValue14 = aedi.t(str).longValue();
                builder14.copyOnWrite();
                ahad ahadVar118 = (ahad) builder14.instance;
                ahadVar118.b |= 4;
                ahadVar118.e = jLongValue14;
                builder14.copyOnWrite();
                ahad ahadVar119 = (ahad) builder14.instance;
                ahadVar119.b &= -3;
                ahadVar119.d = ahad.a.d;
                return (ahad) builder14.build();
            case 1879291277:
                if (str2.equals("java.lang.NullPointerException")) {
                    if (Pattern.matches("Attempt to (?:read from|write to) field '.+' on a null object reference in method '.+'", str) || Pattern.matches("Attempt to invoke .+ method '.+' on a null object reference", str) || str.equals("Attempt to read from null array") || str.equals("Attempt to write to null array") || str.equals("Attempt to get length of null array") || str.equals("Attempt to do a synchronize operation on a null object")) {
                    }
                    aihf builder15 = ahadVar.toBuilder();
                    long jLongValue15 = aedi.t(str).longValue();
                    builder15.copyOnWrite();
                    ahad ahadVar1110 = (ahad) builder15.instance;
                    ahadVar1110.b |= 4;
                    ahadVar1110.e = jLongValue15;
                    builder15.copyOnWrite();
                    ahad ahadVar1111 = (ahad) builder15.instance;
                    ahadVar1111.b &= -3;
                    ahadVar1111.d = ahad.a.d;
                    return (ahad) builder15.build();
                }
                zStartsWith = false;
                if (zStartsWith) {
                    return ahadVar;
                }
                aihf builder16 = ahadVar.toBuilder();
                long jLongValue16 = aedi.t(str).longValue();
                builder16.copyOnWrite();
                ahad ahadVar1112 = (ahad) builder16.instance;
                ahadVar1112.b |= 4;
                ahadVar1112.e = jLongValue16;
                builder16.copyOnWrite();
                ahad ahadVar1113 = (ahad) builder16.instance;
                ahadVar1113.b &= -3;
                ahadVar1113.d = ahad.a.d;
                return (ahad) builder16.build();
            default:
                zStartsWith = false;
                if (zStartsWith) {
                    return ahadVar;
                }
                aihf builder17 = ahadVar.toBuilder();
                long jLongValue17 = aedi.t(str).longValue();
                builder17.copyOnWrite();
                ahad ahadVar1114 = (ahad) builder17.instance;
                ahadVar1114.b |= 4;
                ahadVar1114.e = jLongValue17;
                builder17.copyOnWrite();
                ahad ahadVar1115 = (ahad) builder17.instance;
                ahadVar1115.b &= -3;
                ahadVar1115.d = ahad.a.d;
                return (ahad) builder17.build();
        }
    }
}
