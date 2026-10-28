package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahbh {
    private static final agdw c = agdw.h(".。．｡");
    private static final agfm d = agfm.b('.');
    private static final agdw e;
    private static final agdw f;
    private static final agdw g;
    private static final agdw h;
    public final String a;
    public final agke b;
    private int i = -2;

    static {
        agdw agdwVarH = agdw.h("-_");
        e = agdwVarH;
        agdm agdmVar = new agdm('0', '9');
        f = agdmVar;
        agdu agduVar = new agdu(new agdm('a', 'z'), new agdm('A', 'Z'));
        g = agduVar;
        h = new agdu(new agdu(agdmVar, agduVar), agdwVarH);
    }

    public ahbh(String str) {
        String strAe = ahno.ae(c.f(str));
        boolean z = false;
        strAe = strAe.endsWith(".") ? strAe.substring(0, strAe.length() - 1) : strAe;
        ahno.K(strAe.length() <= 253, "Domain name too long: '%s':", strAe);
        this.a = strAe;
        agke agkeVarJ = agke.j(d.f(strAe));
        this.b = agkeVarJ;
        ahno.K(agkeVarJ.size() <= 127, "Domain has too many parts: '%s'", strAe);
        int size = agkeVarJ.size() - 1;
        if (b((String) agkeVarJ.get(size), true)) {
            for (int i = 0; i < size; i++) {
                if (b((String) agkeVarJ.get(i), false)) {
                }
            }
            z = true;
        }
        ahno.K(z, "Not a valid domain name: '%s'", strAe);
    }

    private static boolean b(String str, boolean z) {
        if (str.length() <= 0 || str.length() > 63) {
            return false;
        }
        if (!h.l(new agds(agdk.a).j(str))) {
            return false;
        }
        agdw agdwVar = e;
        if (agdwVar.b(str.charAt(0)) || agdwVar.b(str.charAt(str.length() - 1))) {
            return false;
        }
        return (z && f.b(str.charAt(0))) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence, java.lang.Object] */
    public final int a() {
        agke agkeVar;
        axoz axozVar;
        int i;
        int i2 = this.i;
        if (i2 != -2) {
            return i2;
        }
        agke agkeVar2 = this.b;
        axoz axozVar2 = atyt.a;
        int i3 = -1;
        int size = agkeVar2.size() - 1;
        int i4 = -1;
        int i5 = 0;
        while (size >= 0) {
            ?? r8 = axozVar2.b;
            int i6 = i5 * 3;
            int iCharAt = r8.charAt(i6 + 1);
            int iCharAt2 = r8.charAt(i6 + 2) & 2047;
            String str = (String) agkeVar2.get(size);
            int i7 = iCharAt2 + iCharAt + i3;
            while (true) {
                if (iCharAt > i7) {
                    agkeVar = agkeVar2;
                    axozVar = axozVar2;
                    i5 = -1;
                    break;
                }
                int i8 = (iCharAt + i7) >>> 1;
                char cCharAt = r8.charAt(i8 * 3);
                int length = str.length();
                ?? r15 = axozVar2.a;
                char cCharAt2 = r15.charAt(cCharAt);
                int iMin = Math.min((int) cCharAt2, length);
                int i9 = 0;
                while (true) {
                    agkeVar = agkeVar2;
                    if (i9 >= iMin) {
                        axozVar = axozVar2;
                        i = length - cCharAt2;
                        break;
                    }
                    char cCharAt3 = str.charAt(i9);
                    axozVar = axozVar2;
                    char cCharAt4 = r15.charAt(cCharAt + 1 + i9);
                    if (cCharAt3 != cCharAt4) {
                        i = cCharAt3 - cCharAt4;
                        break;
                    }
                    i9++;
                    agkeVar2 = agkeVar;
                    axozVar2 = axozVar;
                }
                if (i >= 0) {
                    if (i <= 0) {
                        i5 = i8;
                        break;
                    }
                    iCharAt = i8 + 1;
                } else {
                    i7 = i8 - 1;
                }
                agkeVar2 = agkeVar;
                axozVar2 = axozVar;
            }
            if (i5 == -1) {
                break;
            }
            char cCharAt5 = r8.charAt((i5 * 3) + 2);
            if (((cCharAt5 >> 11) & 1) != 0) {
                i4 = size + 1;
            }
            if (true == axoz.f(axoz.e(cCharAt5 >> 14))) {
                i4 = size;
            }
            int i10 = (cCharAt5 >> '\f') & 3;
            if (size > 0 && axoz.f(axoz.e(i10))) {
                i4 = size - 1;
            }
            size--;
            i3 = -1;
            agkeVar2 = agkeVar;
            axozVar2 = axozVar;
        }
        this.i = i4;
        return i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahbh) {
            return this.a.equals(((ahbh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    public ahbh(String str, agke agkeVar) {
        ahno.G(!agkeVar.isEmpty(), "Cannot create an InternetDomainName with zero parts.");
        this.a = str;
        this.b = agkeVar;
    }
}
