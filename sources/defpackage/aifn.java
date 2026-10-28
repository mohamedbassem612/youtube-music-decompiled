package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aifn {
    private static final ager b = new ager("-");
    final axlj a = new axlj();

    public final void a(int i) {
        axlj axljVar = this.a;
        Integer numValueOf = Integer.valueOf(i);
        aifl aiflVar = aifl.HEIGHT;
        axljVar.b(aiflVar, numValueOf);
        this.a.a(aiflVar);
    }

    public final void b() {
        axlj axljVar = this.a;
        Boolean bool = Boolean.TRUE;
        aifl aiflVar = aifl.SMART_CROP_USE_FACE;
        axljVar.b(aiflVar, bool);
        this.a.a(aiflVar);
    }

    public final void c(int i) {
        axlj axljVar = this.a;
        Integer numValueOf = Integer.valueOf(i);
        aifl aiflVar = aifl.WIDTH;
        axljVar.b(aiflVar, numValueOf);
        this.a.a(aiflVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final String d() {
        int i;
        Map.Entry entry;
        String str;
        String strJ;
        axlj axljVar = this.a;
        ?? r1 = axljVar.c;
        if (r1.size() == 0) {
            return "";
        }
        ?? r2 = axljVar.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = r2.entrySet().iterator();
        Iterator it2 = r1.entrySet().iterator();
        Map.Entry entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
        boolean z = false;
        Map.Entry entry3 = it2.hasNext() ? (Map.Entry) it2.next() : null;
        while (true) {
            Object obj = axljVar.a;
            if (entry2 == null && entry3 == null) {
                if (z) {
                    arrayList.add(((String) obj).substring(0, 0));
                }
                return !arrayList.isEmpty() ? "".concat(b.b(arrayList)) : "";
            }
            if (entry3 == null) {
                i = 1;
            } else if (entry2 == null) {
                i = 0;
            } else {
                int iCompareTo = ((aifl) entry2.getKey()).compareTo((aifl) entry3.getKey());
                i = iCompareTo >>> 31;
                if (iCompareTo == 0) {
                    entry2 = null;
                }
            }
            if (i != 0) {
                aifm aifmVar = (aifm) entry2.getValue();
                if (z) {
                    int i2 = aifmVar.a;
                    arrayList.add(((String) obj).substring(0, 0));
                    int i3 = aifmVar.a;
                    int i4 = aifmVar.b;
                } else {
                    int i5 = aifmVar.a;
                    int i6 = aifmVar.b;
                }
                z = true;
                entry2 = null;
            } else {
                aifl aiflVar = (aifl) entry3.getKey();
                auzk auzkVar = (auzk) entry3.getValue();
                if (z) {
                    arrayList.add(((String) obj).substring(0, 0));
                }
                if (auzkVar.b != null) {
                    boolean z2 = auzkVar.a;
                    String str2 = aiflVar.bg;
                    int i7 = aiflVar.bh;
                    int i8 = i7 - 1;
                    if (i7 == 0) {
                        throw null;
                    }
                    switch (i8) {
                        case 0:
                            agyg agygVarG = agyg.e.g();
                            long jLongValue = ((Long) ((auzk) entry3.getValue()).b).longValue();
                            char c = '\b';
                            byte[] bArr = new byte[8];
                            int i9 = 7;
                            while (i9 >= 0) {
                                char c2 = c;
                                bArr[i9] = (byte) (jLongValue & 255);
                                jLongValue >>= c2;
                                i9--;
                                c = c2;
                            }
                            entry = null;
                            strJ = agygVarG.j(bArr);
                            arrayList.add(String.valueOf(str2).concat(String.valueOf(strJ)));
                            break;
                        case 1:
                            strJ = "";
                            entry = null;
                            arrayList.add(String.valueOf(str2).concat(String.valueOf(strJ)));
                            break;
                        case 2:
                            strJ = ((String) ((auzk) entry3.getValue()).b).replace(';', ':');
                            entry = null;
                            arrayList.add(String.valueOf(str2).concat(String.valueOf(strJ)));
                            break;
                        case 3:
                            strJ = ((Integer) ((auzk) entry3.getValue()).b).toString();
                            entry = null;
                            arrayList.add(String.valueOf(str2).concat(String.valueOf(strJ)));
                            break;
                        case 4:
                            strJ = ((Long) ((auzk) entry3.getValue()).b).toString();
                            entry = null;
                            arrayList.add(String.valueOf(str2).concat(String.valueOf(strJ)));
                            break;
                        case 5:
                            strJ = ((Float) ((auzk) entry3.getValue()).b).toString();
                            entry = null;
                            arrayList.add(String.valueOf(str2).concat(String.valueOf(strJ)));
                            break;
                        case 6:
                            Integer num = (Integer) ((auzk) entry3.getValue()).b;
                            num.intValue();
                            strJ = "0x".concat(String.valueOf(String.format("%08x", num)));
                            entry = null;
                            arrayList.add(String.valueOf(str2).concat(String.valueOf(strJ)));
                            break;
                        case 7:
                            strJ = agyg.e.g().j(((String) ((auzk) entry3.getValue()).b).getBytes(StandardCharsets.ISO_8859_1)).replace('-', '~');
                            entry = null;
                            arrayList.add(String.valueOf(str2).concat(String.valueOf(strJ)));
                            break;
                        default:
                            switch (i7) {
                                case 1:
                                    str = "FIXED_LENGTH_BASE_64";
                                    break;
                                case 2:
                                    str = "BOOLEAN";
                                    break;
                                case 3:
                                    str = "STRING";
                                    break;
                                case 4:
                                    str = "INTEGER";
                                    break;
                                case 5:
                                    str = "LONG";
                                    break;
                                case 6:
                                    str = "FLOAT";
                                    break;
                                case 7:
                                    str = "PREFIX_HEX";
                                    break;
                                default:
                                    str = "FIFE_SAFE_BASE_64";
                                    break;
                            }
                            throw new IllegalStateException(a.bT(str, "OptionType ", " not handled."));
                    }
                } else {
                    entry = null;
                }
                entry3 = entry;
                z = false;
            }
            if (entry2 == null && it.hasNext()) {
                entry2 = (Map.Entry) it.next();
            }
            if (entry3 == null && it2.hasNext()) {
                entry3 = (Map.Entry) it2.next();
            }
        }
    }
}
