package defpackage;

import app.rive.semantics.SemanticState;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qhz {
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    private static final Pattern d;
    private static final Pattern e;
    private static final Pattern f;
    private static final Pattern g;
    private final awmd h;

    static {
        agkz.s("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");
        d = Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
        a = Pattern.compile("([^\\?]+)(\\?+)");
        e = Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
        b = Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+$)");
        c = Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+\\.[\\w]*$)");
        f = Pattern.compile("([a-zA-Z0-9-_]+)");
        g = Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");
    }

    public qhz(awmd awmdVar) {
        this.h = awmdVar;
    }

    static String a(String str) {
        Matcher matcher = e.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    static String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = g.matcher(str);
        return matcher.find() ? matcher.replaceFirst("<ip>") : str;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x016f  */
    public final axhz c(Iterable iterable) {
        int i;
        String strB;
        String strGroup;
        aihf aihfVarCreateBuilder = axgt.a.createBuilder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            qhy qhyVar = (qhy) it.next();
            aihf aihfVarCreateBuilder2 = axgs.a.createBuilder();
            int i2 = qhyVar.e;
            if (i2 > 0) {
                aihfVarCreateBuilder2.copyOnWrite();
                axgs axgsVar = (axgs) aihfVarCreateBuilder2.instance;
                axgsVar.b |= SemanticState.Focused;
                axgsVar.l = i2;
            }
            int i3 = qhyVar.d;
            if (i3 > 0) {
                aihfVarCreateBuilder2.copyOnWrite();
                axgs axgsVar2 = (axgs) aihfVarCreateBuilder2.instance;
                axgsVar2.b |= 64;
                axgsVar2.k = i3;
            }
            long j = qhyVar.c;
            if (j > 0) {
                aihfVarCreateBuilder2.copyOnWrite();
                axgs axgsVar3 = (axgs) aihfVarCreateBuilder2.instance;
                axgsVar3.b |= 8;
                axgsVar3.h = (int) j;
            }
            long j2 = qhyVar.b;
            if (j2 > 0) {
                aihfVarCreateBuilder2.copyOnWrite();
                axgs axgsVar4 = (axgs) aihfVarCreateBuilder2.instance;
                axgsVar4.b |= 16;
                axgsVar4.i = (int) j2;
            }
            int i4 = qhyVar.j;
            aihfVarCreateBuilder2.copyOnWrite();
            axgs axgsVar5 = (axgs) aihfVarCreateBuilder2.instance;
            axgsVar5.b |= 32;
            axgsVar5.j = i4;
            if (qhyVar.q >= 0) {
                aihf aihfVarCreateBuilder3 = axgu.a.createBuilder();
                int i5 = qhyVar.q;
                aihfVarCreateBuilder3.copyOnWrite();
                axgu axguVar = (axgu) aihfVarCreateBuilder3.instance;
                axguVar.b |= 1;
                axguVar.c = i5;
                axgu axguVar2 = (axgu) aihfVarCreateBuilder3.build();
                aihfVarCreateBuilder2.copyOnWrite();
                axgs axgsVar6 = (axgs) aihfVarCreateBuilder2.instance;
                axguVar2.getClass();
                axgsVar6.z = axguVar2;
                axgsVar6.b |= 4194304;
            }
            String str = qhyVar.k;
            boolean z = false;
            String strGroup2 = null;
            if (str != null) {
                if (ahno.aa(str)) {
                    strGroup = null;
                } else {
                    Matcher matcher = d.matcher(str);
                    if (matcher.find()) {
                        strGroup = matcher.group(0);
                    } else {
                        ((agrc) ((agrc) qcq.a.c()).k("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricCollector", "extractContentType", 445, "NetworkMetricCollector.java")).w("contentType extraction failed for %s, skipping logging path", str);
                        strGroup = null;
                    }
                }
                if (strGroup != null) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    axgs axgsVar7 = (axgs) aihfVarCreateBuilder2.instance;
                    axgsVar7.b |= 1;
                    axgsVar7.e = strGroup;
                }
            }
            String str2 = qhyVar.i;
            if (ahno.aa(str2)) {
                i = 1;
            } else if (str2.equals("http/1.1")) {
                i = 2;
            } else if (str2.equals("spdy/2")) {
                i = 3;
            } else if (str2.equals("spdy/3")) {
                i = 4;
            } else if (str2.equals("spdy/3.1")) {
                i = 5;
            } else if (str2.startsWith("h2")) {
                i = 6;
            } else if (str2.equals("quic/1+spdy/3")) {
                i = 7;
            } else if (str2.startsWith("http/2+quic")) {
                i = 11;
            } else if (str2.startsWith("h3")) {
                i = 12;
            } else if (str2.equals("http/0.9")) {
                i = 9;
            } else if (str2.equals("http/1.0")) {
                i = 10;
            } else {
                i = 1;
            }
            aihfVarCreateBuilder2.copyOnWrite();
            axgs axgsVar8 = (axgs) aihfVarCreateBuilder2.instance;
            axgsVar8.m = i - 1;
            axgsVar8.b |= SemanticState.Hidden;
            awmd awmdVar = this.h;
            qic qicVar = ((qhx) awmdVar.io()).b;
            String strGroup3 = qhyVar.f;
            if (strGroup3 != null) {
                boolean z2 = qhyVar.h;
                String strA = a(strGroup3);
                int i6 = qhyVar.t;
                if (!ahno.aa(strGroup3)) {
                    if (qicVar != null) {
                        strGroup3 = qicVar.a(strGroup3);
                    }
                    String strA2 = a(strGroup3);
                    if (strA2 != null) {
                        strGroup3 = strA2;
                        z = true;
                    }
                    Matcher matcher2 = a.matcher(strGroup3);
                    if (matcher2.find()) {
                        strGroup3 = matcher2.group(1);
                        z = true;
                    }
                    String strB2 = b(strGroup3);
                    if (strB2 != null && !strB2.equals(strGroup3)) {
                        z = true;
                    }
                    if (strB2 != null) {
                        Matcher matcher3 = g.matcher(strB2);
                        if (matcher3.find()) {
                            strB2 = matcher3.replaceFirst("<ip>");
                            z = true;
                        }
                    }
                    if (strB2 == null || z) {
                        strGroup2 = strB2;
                    } else {
                        Matcher matcher4 = f.matcher(strB2);
                        if (matcher4.find()) {
                            strGroup2 = matcher4.group(1);
                        }
                    }
                }
                if (strGroup2 != null) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    axgs axgsVar9 = (axgs) aihfVarCreateBuilder2.instance;
                    axgsVar9.b |= 2;
                    axgsVar9.f = strGroup2;
                }
                strGroup2 = strA;
            }
            if (strGroup2 != null && (strB = b(strGroup2)) != null) {
                aihfVarCreateBuilder2.copyOnWrite();
                axgs axgsVar10 = (axgs) aihfVarCreateBuilder2.instance;
                axgsVar10.b |= 2097152;
                axgsVar10.y = strB;
            }
            axhf axhfVar = qhyVar.l;
            if (axhfVar != null) {
                aihfVarCreateBuilder2.copyOnWrite();
                axgs axgsVar11 = (axgs) aihfVarCreateBuilder2.instance;
                axgsVar11.n = axhfVar;
                axgsVar11.b |= SemanticState.LiveRegion;
            }
            aihf aihfVarCreateBuilder4 = axgr.a.createBuilder();
            int i7 = qhyVar.s;
            if (i7 != 0) {
                aihfVarCreateBuilder4.copyOnWrite();
                axgr axgrVar = (axgr) aihfVarCreateBuilder4.instance;
                axgrVar.c = i7 - 2;
                axgrVar.b |= 1;
            }
            aihfVarCreateBuilder2.copyOnWrite();
            axgs axgsVar12 = (axgs) aihfVarCreateBuilder2.instance;
            axgr axgrVar2 = (axgr) aihfVarCreateBuilder4.build();
            axgrVar2.getClass();
            axgsVar12.o = axgrVar2;
            axgsVar12.b |= SemanticState.Modal;
            int i8 = qhyVar.t;
            axgh axghVar = qhyVar.m;
            if (axghVar != null) {
                aihfVarCreateBuilder2.copyOnWrite();
                axgs axgsVar13 = (axgs) aihfVarCreateBuilder2.instance;
                axgsVar13.q = axghVar;
                axgsVar13.b |= SemanticState.Multiline;
            }
            long j3 = qhyVar.a;
            if (j3 > 0) {
                aihfVarCreateBuilder2.copyOnWrite();
                axgs axgsVar14 = (axgs) aihfVarCreateBuilder2.instance;
                axgsVar14.b |= 16384;
                axgsVar14.r = j3;
            }
            int i9 = qhyVar.o;
            qjj qjjVar = qhyVar.r;
            if (qjjVar != null) {
                if (qjjVar.e()) {
                    int i10 = qjjVar.c;
                    aihfVarCreateBuilder2.copyOnWrite();
                    axgs axgsVar15 = (axgs) aihfVarCreateBuilder2.instance;
                    axgsVar15.c = 28;
                    axgsVar15.d = Long.valueOf(i10);
                } else {
                    aihf aihfVarCreateBuilder5 = axhh.a.createBuilder();
                    int i11 = qjjVar.c;
                    aihfVarCreateBuilder5.copyOnWrite();
                    axhh axhhVar = (axhh) aihfVarCreateBuilder5.instance;
                    axhhVar.b |= 1;
                    axhhVar.c = i11;
                    int i12 = qjjVar.d;
                    aihfVarCreateBuilder5.copyOnWrite();
                    axhh axhhVar2 = (axhh) aihfVarCreateBuilder5.instance;
                    axhhVar2.b |= 2;
                    axhhVar2.d = i12;
                    aihfVarCreateBuilder2.copyOnWrite();
                    axgs axgsVar16 = (axgs) aihfVarCreateBuilder2.instance;
                    axhh axhhVar3 = (axhh) aihfVarCreateBuilder5.build();
                    axhhVar3.getClass();
                    axgsVar16.d = axhhVar3;
                    axgsVar16.c = 29;
                }
            }
            int i13 = qhyVar.u;
            if (i13 != 0) {
                aihfVarCreateBuilder2.copyOnWrite();
                axgs axgsVar17 = (axgs) aihfVarCreateBuilder2.instance;
                axgsVar17.t = i13 - 1;
                axgsVar17.b |= 65536;
            }
            int i14 = qhyVar.v;
            if (i14 != 0) {
                aihfVarCreateBuilder2.copyOnWrite();
                axgs axgsVar18 = (axgs) aihfVarCreateBuilder2.instance;
                axgsVar18.s = i14 - 1;
                axgsVar18.b |= 32768;
            }
            Integer num = qhyVar.n;
            if (num != null) {
                int iIntValue = num.intValue();
                aihfVarCreateBuilder2.copyOnWrite();
                axgs axgsVar19 = (axgs) aihfVarCreateBuilder2.instance;
                axgsVar19.b |= 131072;
                axgsVar19.u = iIntValue;
            }
            int i15 = qhyVar.p;
            aihfVarCreateBuilder2.copyOnWrite();
            axgs axgsVar20 = (axgs) aihfVarCreateBuilder2.instance;
            axgsVar20.b |= 262144;
            axgsVar20.v = i15;
            aihfVarCreateBuilder.copyOnWrite();
            axgt axgtVar = (axgt) aihfVarCreateBuilder.instance;
            axgs axgsVar21 = (axgs) aihfVarCreateBuilder2.build();
            axgsVar21.getClass();
            axgtVar.a();
            axgtVar.b.add(axgsVar21);
        }
        aihf aihfVarCreateBuilder6 = axhz.a.createBuilder();
        aihfVarCreateBuilder6.copyOnWrite();
        axhz axhzVar = (axhz) aihfVarCreateBuilder6.instance;
        axgt axgtVar2 = (axgt) aihfVarCreateBuilder.build();
        axgtVar2.getClass();
        axhzVar.g = axgtVar2;
        axhzVar.b |= 32;
        return (axhz) aihfVarCreateBuilder6.build();
    }
}
