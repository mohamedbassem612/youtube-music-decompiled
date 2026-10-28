package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cym extends cyh {
    public final String a;
    public final agke b;

    public cym(String str, String str2, List list) {
        super(str);
        ahno.F(!list.isEmpty());
        this.a = str2;
        agke agkeVarN = agke.n(list);
        this.b = agkeVarN;
    }

    private static List d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:94:0x01b5 A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x0254, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x0254, blocks: (B:79:0x015d, B:92:0x01ac, B:94:0x01b5, B:95:0x01bf, B:18:0x004f, B:20:0x0058, B:21:0x0062, B:108:0x0209), top: B:118:0x000e }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.cyh, defpackage.bsw
    public final void b(bsu bsuVar) {
        Integer numValueOf;
        String str = this.f;
        try {
            switch (str.hashCode()) {
                case 82815:
                    if (!str.equals("TAL")) {
                    }
                    bsuVar.c = (CharSequence) this.b.get(0);
                    break;
                case 82878:
                    if (!str.equals("TCM")) {
                    }
                    bsuVar.s = (CharSequence) this.b.get(0);
                    break;
                case 82897:
                    if (!str.equals("TDA")) {
                    }
                    String str2 = (String) this.b.get(0);
                    int i = Integer.parseInt(str2.substring(2, 4));
                    int i2 = Integer.parseInt(str2.substring(0, 2));
                    bsuVar.m = Integer.valueOf(i);
                    bsuVar.n = Integer.valueOf(i2);
                    break;
                case 83253:
                    if (!str.equals("TP1")) {
                    }
                    bsuVar.b = (CharSequence) this.b.get(0);
                    break;
                case 83254:
                    if (!str.equals("TP2")) {
                    }
                    bsuVar.d = (CharSequence) this.b.get(0);
                    break;
                case 83255:
                    if (!str.equals("TP3")) {
                    }
                    bsuVar.t = (CharSequence) this.b.get(0);
                    break;
                case 83341:
                    if (!str.equals("TRK")) {
                    }
                    String str3 = (String) this.b.get(0);
                    int i3 = bwp.a;
                    String[] strArrSplit = str3.split("/", -1);
                    int i4 = Integer.parseInt(strArrSplit[0]);
                    numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    bsuVar.h = Integer.valueOf(i4);
                    bsuVar.i = numValueOf;
                    break;
                case 83378:
                    if (!str.equals("TT2")) {
                    }
                    bsuVar.a = (CharSequence) this.b.get(0);
                    break;
                case 83536:
                    if (!str.equals("TXT")) {
                    }
                    bsuVar.r = (CharSequence) this.b.get(0);
                    break;
                case 83552:
                    if (!str.equals("TYE")) {
                    }
                    bsuVar.l = Integer.valueOf(Integer.parseInt((String) this.b.get(0)));
                    break;
                case 2567331:
                    if (!str.equals("TALB")) {
                    }
                    bsuVar.c = (CharSequence) this.b.get(0);
                    break;
                case 2569357:
                    if (!str.equals("TCOM")) {
                    }
                    bsuVar.s = (CharSequence) this.b.get(0);
                    break;
                case 2569358:
                    if (str.equals("TCON")) {
                        agke agkeVar = this.b;
                        Integer numT = ahng.T((String) agkeVar.get(0));
                        if (numT != null) {
                            String strA = cyi.a(numT.intValue());
                            if (strA != null) {
                                bsuVar.x = strA;
                            }
                        } else {
                            bsuVar.x = (CharSequence) agkeVar.get(0);
                        }
                    }
                    break;
                case 2569891:
                    if (!str.equals("TDAT")) {
                    }
                    String str4 = (String) this.b.get(0);
                    int i5 = Integer.parseInt(str4.substring(2, 4));
                    int i6 = Integer.parseInt(str4.substring(0, 2));
                    bsuVar.m = Integer.valueOf(i5);
                    bsuVar.n = Integer.valueOf(i6);
                    break;
                case 2570401:
                    if (str.equals("TDRC")) {
                        List listD = d((String) this.b.get(0));
                        int size = listD.size();
                        if (size != 1) {
                            if (size != 2) {
                                if (size == 3) {
                                    bsuVar.n = (Integer) listD.get(2);
                                }
                            }
                            bsuVar.m = (Integer) listD.get(1);
                        }
                        bsuVar.l = (Integer) listD.get(0);
                    }
                    break;
                case 2570410:
                    if (str.equals("TDRL")) {
                        List listD2 = d((String) this.b.get(0));
                        int size2 = listD2.size();
                        if (size2 != 1) {
                            if (size2 != 2) {
                                if (size2 == 3) {
                                    bsuVar.q = (Integer) listD2.get(2);
                                }
                            }
                            bsuVar.p = (Integer) listD2.get(1);
                        }
                        bsuVar.o = (Integer) listD2.get(0);
                    }
                    break;
                case 2571565:
                    if (!str.equals("TEXT")) {
                    }
                    bsuVar.r = (CharSequence) this.b.get(0);
                    break;
                case 2575251:
                    if (!str.equals("TIT2")) {
                    }
                    bsuVar.a = (CharSequence) this.b.get(0);
                    break;
                case 2581512:
                    if (!str.equals("TPE1")) {
                    }
                    bsuVar.b = (CharSequence) this.b.get(0);
                    break;
                case 2581513:
                    if (!str.equals("TPE2")) {
                    }
                    bsuVar.d = (CharSequence) this.b.get(0);
                    break;
                case 2581514:
                    if (!str.equals("TPE3")) {
                    }
                    bsuVar.t = (CharSequence) this.b.get(0);
                    break;
                case 2581856:
                    if (str.equals("TPOS")) {
                        String str5 = (String) this.b.get(0);
                        int i7 = bwp.a;
                        String[] strArrSplit2 = str5.split("/", -1);
                        int i8 = Integer.parseInt(strArrSplit2[0]);
                        numValueOf = strArrSplit2.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit2[1])) : null;
                        bsuVar.v = Integer.valueOf(i8);
                        bsuVar.w = numValueOf;
                    }
                    break;
                case 2583398:
                    if (!str.equals("TRCK")) {
                    }
                    String str6 = (String) this.b.get(0);
                    int i9 = bwp.a;
                    String[] strArrSplit3 = str6.split("/", -1);
                    int i10 = Integer.parseInt(strArrSplit3[0]);
                    if (strArrSplit3.length > 1) {
                    }
                    bsuVar.h = Integer.valueOf(i10);
                    bsuVar.i = numValueOf;
                    break;
                case 2584864:
                    if (str.equals("TSST")) {
                        bsuVar.u = (CharSequence) this.b.get(0);
                    }
                    break;
                case 2590194:
                    if (!str.equals("TYER")) {
                    }
                    bsuVar.l = Integer.valueOf(Integer.parseInt((String) this.b.get(0)));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cym cymVar = (cym) obj;
            if (Objects.equals(this.f, cymVar.f) && Objects.equals(this.a, cymVar.a) && aguu.v(this.b, cymVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f.hashCode() + 527;
        String str = this.a;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.b.hashCode();
    }

    @Override // defpackage.cyh
    public final String toString() {
        return this.f + ": description=" + this.a + ": values=" + String.valueOf(this.b);
    }
}
