package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aifk {
    public static final agfm a;
    public static final ager b;
    public static final ager c;
    private static final agfm d;
    private static final agfm e;
    private static final ager f;
    private static final agke g;

    /* JADX WARN: Type inference failed for: r2v0, types: [agfl, java.lang.Object] */
    static {
        agfm agfmVarA = agfm.b('=').a();
        a = new agfm(agfmVarA.d, agfmVarA.a, (agdw) agfmVarA.c, 2);
        d = agfm.b('/');
        e = agfm.b('-');
        b = new ager("/");
        f = new ager("-");
        c = new ager("=");
        g = agke.A(new aifj("s", false), new aifj("w", false), new aifj("c", true), new aifj("d", true), new aifj("h", false), new aifj("s", true), new aifj("h", true), new aifj("p", true), new aifj("pp", true), new aifj("pf", true), new aifj("n", true), new aifj("r", false), new aifj("r", true), new aifj("o", true), new aifj("o", false), new aifj("j", false), new aifj("x", false), new aifj("y", false), new aifj("z", false), new aifj("g", true), new aifj("e", false), new aifj("f", false), new aifj("k", true), new aifj("u", true), new aifj("ut", true), new aifj("i", true), new aifj("a", true), new aifj("b", true), new aifj("b", false), new aifj("c", false), new aifj("t", false), new aifj("nt0", false), new aifj("v", true), new aifj("q", false), new aifj("fh", true), new aifj("fv", true), new aifj("fg", true), new aifj("ci", true), new aifj("rw", true), new aifj("rwu", true), new aifj("rwa", true), new aifj("nw", true), new aifj("rh", true), new aifj("no", true), new aifj("ns", true), new aifj("k", false), new aifj("p", false), new aifj("l", false), new aifj("v", false), new aifj("nu", true), new aifj("ft", true), new aifj("cc", true), new aifj("nd", true), new aifj("ip", true), new aifj("nc", true), new aifj("a", false), new aifj("rj", true), new aifj("rp", true), new aifj("rg", true), new aifj("pd", true), new aifj("pa", true), new aifj("m", false), new aifj("vb", false), new aifj("vl", false), new aifj("lf", true), new aifj("mv", true), new aifj("id", true), new aifj("al", true), new aifj("ic", false), new aifj("pg", true), new aifj("mo", true), new aifj("iv", false), new aifj("il", false), new aifj("ba", false), new aifj("vm", false), new aifj("vf", false));
    }

    public static List a(String str, boolean z) {
        ahno.G(str != null, "options is null");
        ArrayList arrayList = new ArrayList();
        Iterator it = e.f(str).iterator();
        while (it.hasNext()) {
            String strG = (String) it.next();
            if (!strG.isEmpty()) {
                if (strG.startsWith("O") || strG.startsWith("J")) {
                    while (strG.length() < 12) {
                        strG = f.g(strG, it.hasNext() ? it.next() : "", new Object[0]);
                    }
                }
                if (strG.equals("pi") || strG.equals("ya") || strG.equals("ro")) {
                    strG = f.g(strG, it.hasNext() ? it.next() : "", new Object[0]);
                }
                if (!z || Character.isUpperCase(strG.charAt(0))) {
                    arrayList.add(strG);
                }
            }
        }
        return arrayList;
    }

    public static final List d(oal oalVar) {
        ArrayList arrayListR = aguu.r(d.f(oalVar.a()));
        return (arrayListR.size() <= 0 || !((String) arrayListR.get(0)).isEmpty()) ? arrayListR : arrayListR.subList(1, arrayListR.size());
    }

    public static String e(String str, String str2) {
        ahno.G(str != null, "oldOptions is null");
        if (str.isEmpty()) {
            return str2;
        }
        List<String> listA = a(str, true);
        if (listA.isEmpty()) {
            return str2;
        }
        listA.addAll(a(str2, false));
        aghn aghnVar = new aghn(null);
        ArrayList arrayList = new ArrayList();
        for (String str3 : listA) {
            agke agkeVar = g;
            int i = ((agpi) agkeVar).d;
            aifj aifjVar = null;
            for (int i2 = 0; i2 < i; i2++) {
                aifj aifjVar2 = (aifj) agkeVar.get(i2);
                String lowerCase = str3.toLowerCase(Locale.getDefault());
                String str4 = aifjVar2.a;
                if (lowerCase.startsWith(str4)) {
                    if (aifjVar2.b) {
                        if (str3.length() == str4.length()) {
                            aifjVar = aifjVar2;
                            break;
                        }
                    } else {
                        aifjVar = aifjVar2;
                    }
                }
            }
            if (aifjVar != null) {
                aghnVar.u(aifjVar, str3);
            } else {
                arrayList.add(str3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        agke agkeVar2 = g;
        int i3 = ((agpi) agkeVar2).d;
        for (int i4 = 0; i4 < i3; i4++) {
            String str5 = "";
            for (String str6 : aghnVar.c((aifj) agkeVar2.get(i4))) {
                if (Character.isUpperCase(str6.charAt(0))) {
                    arrayList2.add(str6);
                } else {
                    str5 = str6;
                }
            }
            if (!str5.isEmpty()) {
                arrayList2.add(str5);
            }
        }
        arrayList2.addAll(arrayList);
        return f.b(arrayList2);
    }

    public final boolean b(Uri uri) {
        String string = new oal(uri).toString();
        Pattern pattern = aifo.a;
        if (string != null) {
            return aifo.a.matcher(string).find();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (r1 > 6) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri c(defpackage.aifn r10, android.net.Uri r11) throws defpackage.oam {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aifk.c(aifn, android.net.Uri):android.net.Uri");
    }
}
