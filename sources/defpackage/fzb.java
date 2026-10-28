package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fzb implements Iterable, fyy {
    public final String a;

    public fzb(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.a = str;
    }

    @Override // defpackage.fyy
    public final fyy d() {
        return new fzb(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fzb) {
            return this.a.equals(((fzb) obj).a);
        }
        return false;
    }

    @Override // defpackage.fyy
    public final Boolean g() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:106:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:109:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:111:0x02dd A[LOOP:0: B:110:0x02db->B:111:0x02dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:116:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:118:0x0307  */
    /* JADX WARN: Code duplicated, block: B:119:0x031b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0325  */
    /* JADX WARN: Code duplicated, block: B:123:0x0332  */
    /* JADX WARN: Code duplicated, block: B:126:0x0342  */
    /* JADX WARN: Code duplicated, block: B:127:0x0355  */
    /* JADX WARN: Code duplicated, block: B:130:0x0364  */
    /* JADX WARN: Code duplicated, block: B:131:0x036f  */
    /* JADX WARN: Code duplicated, block: B:133:0x038c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0398  */
    /* JADX WARN: Code duplicated, block: B:137:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:138:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:141:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:144:0x03da  */
    /* JADX WARN: Code duplicated, block: B:146:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:148:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:149:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:151:0x0404  */
    /* JADX WARN: Code duplicated, block: B:152:0x0415  */
    /* JADX WARN: Code duplicated, block: B:154:0x0421  */
    /* JADX WARN: Code duplicated, block: B:156:0x042c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0443  */
    /* JADX WARN: Code duplicated, block: B:160:0x0446  */
    /* JADX WARN: Code duplicated, block: B:163:0x045f  */
    /* JADX WARN: Code duplicated, block: B:164:0x0462  */
    /* JADX WARN: Code duplicated, block: B:166:0x0477  */
    /* JADX WARN: Code duplicated, block: B:168:0x0481  */
    /* JADX WARN: Code duplicated, block: B:169:0x0492  */
    /* JADX WARN: Code duplicated, block: B:171:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:173:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:176:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:177:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:179:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:181:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:182:0x0504  */
    /* JADX WARN: Code duplicated, block: B:184:0x0510  */
    /* JADX WARN: Code duplicated, block: B:186:0x0516  */
    /* JADX WARN: Code duplicated, block: B:189:0x0524 A[LOOP:1: B:187:0x051e->B:189:0x0524, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x0542  */
    /* JADX WARN: Code duplicated, block: B:194:0x0550  */
    /* JADX WARN: Code duplicated, block: B:196:0x055a  */
    /* JADX WARN: Code duplicated, block: B:197:0x0573  */
    /* JADX WARN: Code duplicated, block: B:204:0x0590  */
    /* JADX WARN: Code duplicated, block: B:206:0x059a  */
    /* JADX WARN: Code duplicated, block: B:207:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:209:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:211:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:213:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:215:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:216:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:225:0x060a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00da  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:54:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0139  */
    /* JADX WARN: Code duplicated, block: B:60:0x014f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0163  */
    /* JADX WARN: Code duplicated, block: B:65:0x0167  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:79:0x0209  */
    /* JADX WARN: Code duplicated, block: B:83:0x0239  */
    /* JADX WARN: Code duplicated, block: B:85:0x0245  */
    /* JADX WARN: Code duplicated, block: B:87:0x0250  */
    /* JADX WARN: Code duplicated, block: B:89:0x025c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0268  */
    /* JADX WARN: Code duplicated, block: B:92:0x026d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0282  */
    /* JADX WARN: Code duplicated, block: B:95:0x0299  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fyy
    public final fyy gR(String str, kwq kwqVar, List list) {
        String str2;
        int i;
        String str3;
        String strI;
        int i2;
        String str4;
        fyy fyyVarV;
        int i3;
        fzb fzbVar;
        int i4;
        fyy fzbVar2;
        int iA;
        StringBuilder sb;
        int i5;
        Matcher matcher;
        double dDoubleValue;
        double dA;
        fyy fyrVar;
        int i6;
        int i7;
        String strI2;
        Matcher matcher2;
        String str5;
        double dDoubleValue2;
        double dA2;
        double dMin;
        double length;
        double dA3;
        double dMin2;
        fzb fzbVar3;
        String str6;
        ArrayList arrayList;
        String strI3;
        long jC;
        String[] strArrSplit;
        int length2;
        int i8;
        int i9;
        boolean zIsEmpty;
        String str7;
        int iA2;
        int length3;
        fyy fyyVarA;
        String str8;
        String str9;
        int iIndexOf;
        kwq kwqVar2;
        double dDoubleValue3;
        if (!"charAt".equals(str) && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !"match".equals(str) && !"replace".equals(str) && !"search".equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !"toString".equals(str) && !"toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
            i = 0;
            if (!str2.equals(str)) {
                str3 = "trim";
                if (!str3.equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
            }
            strI = "undefined";
            switch (str.hashCode()) {
                case -1789698943:
                    i2 = i;
                    if (str.equals("hasOwnProperty")) {
                        fxw.i("hasOwnProperty", 1, list);
                        str4 = this.a;
                        fyyVarV = kwqVar.v((fyy) list.get(i2));
                        if ("length".equals(fyyVarV.i())) {
                            return fyp.k;
                        }
                        double dDoubleValue4 = fyyVarV.h().doubleValue();
                        return (dDoubleValue4 == Math.floor(dDoubleValue4) || (i3 = (int) dDoubleValue4) < 0 || i3 >= str4.length()) ? fyp.l : fyp.k;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -1776922004:
                    fzbVar = this;
                    i4 = i;
                    if (str.equals("toString")) {
                        fxw.i("toString", i4, list);
                        return fzbVar;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -1464939364:
                    if (str.equals("toLocaleLowerCase")) {
                        fxw.i("toLocaleLowerCase", 0, list);
                        fzbVar2 = new fzb(this.a.toLowerCase());
                        return fzbVar2;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -1361633751:
                    if (str.equals("charAt")) {
                        fxw.l("charAt", 1, list);
                        if (list.isEmpty()) {
                            iA = 0;
                        } else {
                            iA = (int) fxw.a(kwqVar.v((fyy) list.get(0)).h().doubleValue());
                        }
                        String str10 = this.a;
                        if (iA >= 0 || iA >= str10.length()) {
                            return fyy.m;
                        }
                        fzbVar2 = new fzb(String.valueOf(str10.charAt(iA)));
                        return fzbVar2;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -1354795244:
                    fzbVar = this;
                    if (str.equals("concat")) {
                        if (!list.isEmpty()) {
                            sb = new StringBuilder(fzbVar.a);
                            for (i5 = 0; i5 < list.size(); i5++) {
                                sb.append(kwqVar.v((fyy) list.get(i5)).i());
                            }
                            return new fzb(sb.toString());
                        }
                        return fzbVar;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -1137582698:
                    if (str.equals("toLowerCase")) {
                        fxw.i("toLowerCase", 0, list);
                        fzbVar2 = new fzb(this.a.toLowerCase(Locale.ENGLISH));
                        return fzbVar2;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -906336856:
                    if (str.equals("search")) {
                        fxw.l("search", 1, list);
                        matcher = Pattern.compile(list.isEmpty() ? "undefined" : kwqVar.v((fyy) list.get(0)).i()).matcher(this.a);
                        if (matcher.find()) {
                            return new fyr(Double.valueOf(-1.0d));
                        }
                        fzbVar2 = new fyr(Double.valueOf(matcher.start()));
                        return fzbVar2;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -726908483:
                    if (str.equals(str2)) {
                        fxw.i(str2, 0, list);
                        fzbVar2 = new fzb(this.a.toUpperCase());
                        return fzbVar2;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        fxw.l("lastIndexOf", 2, list);
                        String str11 = this.a;
                        String strI4 = list.size() > 0 ? kwqVar.v((fyy) list.get(0)).i() : "undefined";
                        if (list.size() < 2) {
                            dDoubleValue = Double.NaN;
                        } else {
                            dDoubleValue = kwqVar.v((fyy) list.get(1)).h().doubleValue();
                        }
                        if (Double.isNaN(dDoubleValue)) {
                            dA = Double.POSITIVE_INFINITY;
                        } else {
                            dA = fxw.a(dDoubleValue);
                        }
                        fyrVar = new fyr(Double.valueOf(str11.lastIndexOf(strI4, (int) dA)));
                        return fyrVar;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case -399551817:
                    i6 = i;
                    if (str.equals("toUpperCase")) {
                        fxw.i("toUpperCase", i6, list);
                        fzbVar2 = new fzb(this.a.toUpperCase(Locale.ENGLISH));
                        return fzbVar2;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 3568674:
                    i7 = i;
                    if (str.equals(str3)) {
                        fxw.i("toUpperCase", i7, list);
                        fzbVar2 = new fzb(this.a.trim());
                        return fzbVar2;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 103668165:
                    if (str.equals("match")) {
                        fxw.l("match", 1, list);
                        String str12 = this.a;
                        if (list.size() <= 0) {
                            strI2 = "";
                        } else {
                            strI2 = kwqVar.v((fyy) list.get(0)).i();
                        }
                        matcher2 = Pattern.compile(strI2).matcher(str12);
                        if (matcher2.find()) {
                            return fyy.g;
                        }
                        fzbVar2 = new fyo(new fzb(matcher2.group()));
                        return fzbVar2;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 109526418:
                    if (str.equals("slice")) {
                        fxw.l("slice", 2, list);
                        str5 = this.a;
                        if (list.isEmpty()) {
                            dDoubleValue2 = 0.0d;
                        } else {
                            dDoubleValue2 = kwqVar.v((fyy) list.get(0)).h().doubleValue();
                        }
                        dA2 = fxw.a(dDoubleValue2);
                        if (dA2 < 0.0d) {
                            dMin = Math.max(((double) str5.length()) + dA2, 0.0d);
                        } else {
                            dMin = Math.min(dA2, str5.length());
                        }
                        if (list.size() > 1) {
                            length = kwqVar.v((fyy) list.get(1)).h().doubleValue();
                        } else {
                            length = str5.length();
                        }
                        dA3 = fxw.a(length);
                        if (dA3 < 0.0d) {
                            dMin2 = Math.max(((double) str5.length()) + dA3, 0.0d);
                        } else {
                            dMin2 = Math.min(dA3, str5.length());
                        }
                        int i10 = (int) dMin;
                        fzbVar3 = new fzb(str5.substring(i10, Math.max(0, ((int) dMin2) - i10) + i10));
                        return fzbVar3;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 109648666:
                    if (str.equals("split")) {
                        fxw.l("split", 2, list);
                        str6 = this.a;
                        if (str6.length() == 0) {
                            return new fyo(this);
                        }
                        arrayList = new ArrayList();
                        if (list.isEmpty()) {
                            arrayList.add(this);
                        } else {
                            strI3 = kwqVar.v((fyy) list.get(0)).i();
                            if (list.size() > 1) {
                                jC = fxw.c(kwqVar.v((fyy) list.get(1)).h().doubleValue());
                            } else {
                                jC = 2147483647L;
                            }
                            if (jC == 0) {
                                return new fyo();
                            }
                            strArrSplit = str6.split(Pattern.quote(strI3), ((int) jC) + 1);
                            length2 = strArrSplit.length;
                            if (strI3.isEmpty() || length2 <= 0) {
                                i8 = length2;
                                i9 = 0;
                            } else {
                                zIsEmpty = strArrSplit[0].isEmpty();
                                i8 = length2 - 1;
                                if (!strArrSplit[i8].isEmpty()) {
                                    i9 = zIsEmpty;
                                    i8 = length2;
                                    i9 = zIsEmpty;
                                }
                            }
                            i9 = zIsEmpty;
                            if (length2 > jC) {
                                i8--;
                            }
                            while (i9 < i8) {
                                arrayList.add(new fzb(strArrSplit[i9]));
                                i9++;
                            }
                        }
                        return new fyo(arrayList);
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 530542161:
                    if (str.equals("substring")) {
                        fxw.l("substring", 2, list);
                        str7 = this.a;
                        if (list.isEmpty()) {
                            iA2 = 0;
                        } else {
                            iA2 = (int) fxw.a(kwqVar.v((fyy) list.get(0)).h().doubleValue());
                        }
                        if (list.size() > 1) {
                            length3 = (int) fxw.a(kwqVar.v((fyy) list.get(1)).h().doubleValue());
                        } else {
                            length3 = str7.length();
                        }
                        int iMin = Math.min(Math.max(iA2, 0), str7.length());
                        int iMin2 = Math.min(Math.max(length3, 0), str7.length());
                        fyrVar = new fzb(str7.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                        return fyrVar;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 1094496948:
                    fzbVar = this;
                    if (str.equals("replace")) {
                        fxw.l("replace", 2, list);
                        fyyVarA = fyy.f;
                        if (!list.isEmpty()) {
                            strI = kwqVar.v((fyy) list.get(0)).i();
                            if (list.size() > 1) {
                                fyyVarA = kwqVar.v((fyy) list.get(1));
                            }
                        }
                        str8 = strI;
                        str9 = fzbVar.a;
                        iIndexOf = str9.indexOf(str8);
                        if (iIndexOf >= 0) {
                            if (fyyVarA instanceof fys) {
                                fyyVarA = ((fys) fyyVarA).a(kwqVar, Arrays.asList(new fzb(str8), new fyr(Double.valueOf(iIndexOf)), fzbVar));
                            }
                            fzbVar3 = new fzb(str9.substring(0, iIndexOf) + fyyVarA.i() + str9.substring(iIndexOf + str8.length()));
                            return fzbVar3;
                        }
                        return fzbVar;
                    }
                    throw new IllegalArgumentException("Command not supported");
                case 1943291465:
                    if (str.equals("indexOf")) {
                        fxw.l("indexOf", 2, list);
                        String str13 = this.a;
                        if (list.size() <= 0) {
                            kwqVar2 = kwqVar;
                        } else {
                            kwqVar2 = kwqVar;
                            strI = kwqVar2.v((fyy) list.get(i)).i();
                        }
                        String str14 = strI;
                        if (list.size() < 2) {
                            dDoubleValue3 = 0.0d;
                        } else {
                            dDoubleValue3 = kwqVar2.v((fyy) list.get(1)).h().doubleValue();
                        }
                        fyrVar = new fyr(Double.valueOf(str13.indexOf(str14, (int) fxw.a(dDoubleValue3))));
                        return fyrVar;
                    }
                    throw new IllegalArgumentException("Command not supported");
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
        }
        str2 = "toLocaleUpperCase";
        i = 0;
        str3 = "trim";
        strI = "undefined";
        switch (str.hashCode()) {
            case -1789698943:
                i2 = i;
                if (str.equals("hasOwnProperty")) {
                    fxw.i("hasOwnProperty", 1, list);
                    str4 = this.a;
                    fyyVarV = kwqVar.v((fyy) list.get(i2));
                    if ("length".equals(fyyVarV.i())) {
                        return fyp.k;
                    }
                    double dDoubleValue5 = fyyVarV.h().doubleValue();
                    if (dDoubleValue5 == Math.floor(dDoubleValue5)) {
                    }
                    break;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1776922004:
                fzbVar = this;
                i4 = i;
                if (str.equals("toString")) {
                    fxw.i("toString", i4, list);
                    return fzbVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    fxw.i("toLocaleLowerCase", 0, list);
                    fzbVar2 = new fzb(this.a.toLowerCase());
                    return fzbVar2;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1361633751:
                if (str.equals("charAt")) {
                    fxw.l("charAt", 1, list);
                    if (list.isEmpty()) {
                        iA = (int) fxw.a(kwqVar.v((fyy) list.get(0)).h().doubleValue());
                    } else {
                        iA = 0;
                    }
                    String str15 = this.a;
                    if (iA >= 0) {
                        break;
                    }
                    return fyy.m;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                fzbVar = this;
                if (str.equals("concat")) {
                    if (!list.isEmpty()) {
                        sb = new StringBuilder(fzbVar.a);
                        while (i5 < list.size()) {
                            sb.append(kwqVar.v((fyy) list.get(i5)).i());
                        }
                        return new fzb(sb.toString());
                    }
                    return fzbVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    fxw.i("toLowerCase", 0, list);
                    fzbVar2 = new fzb(this.a.toLowerCase(Locale.ENGLISH));
                    return fzbVar2;
                }
                throw new IllegalArgumentException("Command not supported");
            case -906336856:
                if (str.equals("search")) {
                    fxw.l("search", 1, list);
                    matcher = Pattern.compile(list.isEmpty() ? "undefined" : kwqVar.v((fyy) list.get(0)).i()).matcher(this.a);
                    if (matcher.find()) {
                        return new fyr(Double.valueOf(-1.0d));
                    }
                    fzbVar2 = new fyr(Double.valueOf(matcher.start()));
                    return fzbVar2;
                }
                throw new IllegalArgumentException("Command not supported");
            case -726908483:
                if (str.equals(str2)) {
                    fxw.i(str2, 0, list);
                    fzbVar2 = new fzb(this.a.toUpperCase());
                    return fzbVar2;
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    fxw.l("lastIndexOf", 2, list);
                    String str16 = this.a;
                    String strI5 = list.size() > 0 ? kwqVar.v((fyy) list.get(0)).i() : "undefined";
                    if (list.size() < 2) {
                        dDoubleValue = Double.NaN;
                    } else {
                        dDoubleValue = kwqVar.v((fyy) list.get(1)).h().doubleValue();
                    }
                    if (Double.isNaN(dDoubleValue)) {
                        dA = Double.POSITIVE_INFINITY;
                    } else {
                        dA = fxw.a(dDoubleValue);
                    }
                    fyrVar = new fyr(Double.valueOf(str16.lastIndexOf(strI5, (int) dA)));
                    return fyrVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case -399551817:
                i6 = i;
                if (str.equals("toUpperCase")) {
                    fxw.i("toUpperCase", i6, list);
                    fzbVar2 = new fzb(this.a.toUpperCase(Locale.ENGLISH));
                    return fzbVar2;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3568674:
                i7 = i;
                if (str.equals(str3)) {
                    fxw.i("toUpperCase", i7, list);
                    fzbVar2 = new fzb(this.a.trim());
                    return fzbVar2;
                }
                throw new IllegalArgumentException("Command not supported");
            case 103668165:
                if (str.equals("match")) {
                    fxw.l("match", 1, list);
                    String str17 = this.a;
                    if (list.size() <= 0) {
                        strI2 = "";
                    } else {
                        strI2 = kwqVar.v((fyy) list.get(0)).i();
                    }
                    matcher2 = Pattern.compile(strI2).matcher(str17);
                    if (matcher2.find()) {
                        return fyy.g;
                    }
                    fzbVar2 = new fyo(new fzb(matcher2.group()));
                    return fzbVar2;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    fxw.l("slice", 2, list);
                    str5 = this.a;
                    if (list.isEmpty()) {
                        dDoubleValue2 = kwqVar.v((fyy) list.get(0)).h().doubleValue();
                    } else {
                        dDoubleValue2 = 0.0d;
                    }
                    dA2 = fxw.a(dDoubleValue2);
                    if (dA2 < 0.0d) {
                        dMin = Math.max(((double) str5.length()) + dA2, 0.0d);
                    } else {
                        dMin = Math.min(dA2, str5.length());
                    }
                    if (list.size() > 1) {
                        length = kwqVar.v((fyy) list.get(1)).h().doubleValue();
                    } else {
                        length = str5.length();
                    }
                    dA3 = fxw.a(length);
                    if (dA3 < 0.0d) {
                        dMin2 = Math.max(((double) str5.length()) + dA3, 0.0d);
                    } else {
                        dMin2 = Math.min(dA3, str5.length());
                    }
                    int i11 = (int) dMin;
                    fzbVar3 = new fzb(str5.substring(i11, Math.max(0, ((int) dMin2) - i11) + i11));
                    return fzbVar3;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109648666:
                if (str.equals("split")) {
                    fxw.l("split", 2, list);
                    str6 = this.a;
                    if (str6.length() == 0) {
                        return new fyo(this);
                    }
                    arrayList = new ArrayList();
                    if (list.isEmpty()) {
                        arrayList.add(this);
                    } else {
                        strI3 = kwqVar.v((fyy) list.get(0)).i();
                        if (list.size() > 1) {
                            jC = fxw.c(kwqVar.v((fyy) list.get(1)).h().doubleValue());
                        } else {
                            jC = 2147483647L;
                        }
                        if (jC == 0) {
                            return new fyo();
                        }
                        strArrSplit = str6.split(Pattern.quote(strI3), ((int) jC) + 1);
                        length2 = strArrSplit.length;
                        if (strI3.isEmpty()) {
                            i8 = length2;
                            i9 = 0;
                        } else {
                            i8 = length2;
                            i9 = 0;
                        }
                        i9 = zIsEmpty;
                        if (length2 > jC) {
                            i8--;
                        }
                        while (i9 < i8) {
                            arrayList.add(new fzb(strArrSplit[i9]));
                            i9++;
                        }
                    }
                    return new fyo(arrayList);
                }
                throw new IllegalArgumentException("Command not supported");
            case 530542161:
                if (str.equals("substring")) {
                    fxw.l("substring", 2, list);
                    str7 = this.a;
                    if (list.isEmpty()) {
                        iA2 = (int) fxw.a(kwqVar.v((fyy) list.get(0)).h().doubleValue());
                    } else {
                        iA2 = 0;
                    }
                    if (list.size() > 1) {
                        length3 = (int) fxw.a(kwqVar.v((fyy) list.get(1)).h().doubleValue());
                    } else {
                        length3 = str7.length();
                    }
                    int iMin3 = Math.min(Math.max(iA2, 0), str7.length());
                    int iMin4 = Math.min(Math.max(length3, 0), str7.length());
                    fyrVar = new fzb(str7.substring(Math.min(iMin3, iMin4), Math.max(iMin3, iMin4)));
                    return fyrVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1094496948:
                fzbVar = this;
                if (str.equals("replace")) {
                    fxw.l("replace", 2, list);
                    fyyVarA = fyy.f;
                    if (!list.isEmpty()) {
                        strI = kwqVar.v((fyy) list.get(0)).i();
                        if (list.size() > 1) {
                            fyyVarA = kwqVar.v((fyy) list.get(1));
                        }
                    }
                    str8 = strI;
                    str9 = fzbVar.a;
                    iIndexOf = str9.indexOf(str8);
                    if (iIndexOf >= 0) {
                        if (fyyVarA instanceof fys) {
                            fyyVarA = ((fys) fyyVarA).a(kwqVar, Arrays.asList(new fzb(str8), new fyr(Double.valueOf(iIndexOf)), fzbVar));
                        }
                        fzbVar3 = new fzb(str9.substring(0, iIndexOf) + fyyVarA.i() + str9.substring(iIndexOf + str8.length()));
                        return fzbVar3;
                    }
                    return fzbVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    fxw.l("indexOf", 2, list);
                    String str18 = this.a;
                    if (list.size() <= 0) {
                        kwqVar2 = kwqVar;
                    } else {
                        kwqVar2 = kwqVar;
                        strI = kwqVar2.v((fyy) list.get(i)).i();
                    }
                    String str19 = strI;
                    if (list.size() < 2) {
                        dDoubleValue3 = 0.0d;
                    } else {
                        dDoubleValue3 = kwqVar2.v((fyy) list.get(1)).h().doubleValue();
                    }
                    fyrVar = new fyr(Double.valueOf(str18.indexOf(str19, (int) fxw.a(dDoubleValue3))));
                    return fyrVar;
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // defpackage.fyy
    public final Double h() {
        String str = this.a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.fyy
    public final String i() {
        return this.a;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new fza(this, 2);
    }

    @Override // defpackage.fyy
    public final Iterator l() {
        return new fza(this, 0);
    }

    public final String toString() {
        return "\"" + this.a + '\"';
    }
}
