package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dcn implements dbn {
    private static final Pattern a = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern b = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder c = new StringBuilder();
    private final ArrayList d = new ArrayList();
    private final bwb e = new bwb();
    private final bse f;

    public dcn(bse bseVar) {
        this.f = bseVar;
    }

    public static float e(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long f(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = Long.parseLong(strGroup2) * 60000;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = Long.parseLong(strGroup3) * 1000;
        String strGroup4 = matcher.group(i + 4);
        long j4 = j + j2 + j3;
        if (strGroup4 != null) {
            j4 += Long.parseLong(strGroup4);
        }
        return j4 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    private static final bus g(Spanned spanned, String str) {
        int i;
        bur burVar = new bur();
        burVar.d(spanned);
        if (str == null) {
            return burVar.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    burVar.f = 1;
                    i = 1;
                } else {
                    burVar.f = 0;
                    i = 0;
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    burVar.f = 1;
                    i = 1;
                } else {
                    burVar.f = 2;
                    i = 2;
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    burVar.f = 1;
                    i = 1;
                } else {
                    burVar.f = 0;
                    i = 0;
                }
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    burVar.f = 1;
                    i = 1;
                } else {
                    burVar.f = 2;
                    i = 2;
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    burVar.f = 1;
                    i = 1;
                } else {
                    burVar.f = 0;
                    i = 0;
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    burVar.f = 1;
                    i = 1;
                } else {
                    burVar.f = 2;
                    i = 2;
                }
                break;
            default:
                burVar.f = 1;
                i = 1;
                break;
        }
        switch (str) {
            case "{\an1}":
            case "{\an2}":
            case "{\an3}":
                burVar.d = 2;
                break;
            case "{\an7}":
            case "{\an8}":
            case "{\an9}":
                burVar.d = 0;
                break;
            default:
                burVar.d = 1;
                break;
        }
        burVar.e = e(i);
        burVar.c(e(burVar.d), 0);
        return burVar.a();
    }

    @Override // defpackage.dbn
    public final int a() {
        return 1;
    }

    @Override // defpackage.dbn
    public final /* synthetic */ dbd b(byte[] bArr, int i, int i2) {
        return dco.a(this, bArr, i2);
    }

    @Override // defpackage.dbn
    public final void c(byte[] bArr, int i, int i2, dbm dbmVar, bvh bvhVar) {
        Charset charsetE;
        bwb bwbVar;
        long j;
        String str;
        dcn dcnVar = this;
        bwb bwbVar2 = dcnVar.e;
        bwbVar2.N(bArr, i + i2);
        bwbVar2.P(i);
        if (bsy.l(dcnVar.f.p) || (charsetE = bwbVar2.E()) == null) {
            charsetE = StandardCharsets.UTF_8;
        }
        agkz agkzVar = bwb.a;
        charsetE.getClass();
        if (!agkzVar.contains(charsetE)) {
            bwbVar2.M(new String(bwbVar2.b, bwbVar2.c, bwbVar2.d(), charsetE).getBytes(StandardCharsets.UTF_8));
            charsetE = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (dbmVar.b == -9223372036854775807L || !dbmVar.c) ? null : new ArrayList();
        while (true) {
            String strA = bwbVar2.A(charsetE);
            int i3 = 0;
            if (strA == null) {
                break;
            }
            if (strA.isEmpty()) {
                bwbVar = bwbVar2;
                j = j2;
            } else {
                try {
                    Integer.parseInt(strA);
                    bwb bwbVar3 = dcnVar.e;
                    String strA2 = bwbVar3.A(charsetE);
                    if (strA2 == null) {
                        bvx.e("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = a.matcher(strA2);
                    if (matcher.matches()) {
                        long jF = f(matcher, 1);
                        long jF2 = f(matcher, 6);
                        StringBuilder sb = dcnVar.c;
                        sb.setLength(0);
                        ArrayList arrayList2 = dcnVar.d;
                        arrayList2.clear();
                        String strA3 = bwbVar3.A(charsetE);
                        while (!TextUtils.isEmpty(strA3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strA3.trim();
                            long j3 = j2;
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = b.matcher(strTrim);
                            int i4 = i3;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                int iStart = matcher2.start() - i4;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i4 += length;
                                matcher2 = matcher2;
                                bwbVar2 = bwbVar2;
                            }
                            sb.append(sb2.toString());
                            j2 = j3;
                            strA3 = bwbVar3.A(charsetE);
                            i3 = 0;
                        }
                        bwbVar = bwbVar2;
                        j = j2;
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString(), 0);
                        int i5 = 0;
                        while (true) {
                            if (i5 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (String) arrayList2.get(i5);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        long j4 = dbmVar.b;
                        if (j4 == j || jF2 >= j4) {
                            bvhVar.a(new abnx(agke.q(g(spannedFromHtml, str)), jF, jF2 - jF));
                        } else if (arrayList != null) {
                            arrayList.add(new abnx(agke.q(g(spannedFromHtml, str)), jF, jF2 - jF));
                        }
                    } else {
                        bwbVar = bwbVar2;
                        j = j2;
                        bvx.e("SubripParser", "Skipping invalid timing: ".concat(strA2));
                    }
                } catch (NumberFormatException unused) {
                    bwbVar = bwbVar2;
                    j = j2;
                    bvx.e("SubripParser", "Skipping invalid index: ".concat(strA));
                }
            }
            dcnVar = this;
            j2 = j;
            bwbVar2 = bwbVar;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                bvhVar.a((abnx) arrayList.get(i6));
            }
        }
    }

    @Override // defpackage.dbn
    public final /* synthetic */ void d() {
    }
}
