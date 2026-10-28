package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lfx extends lfo {
    private long a;
    private long b;

    static boolean E(List list, int i) {
        return i < (list.size() << 6) && (((Long) list.get(i / 64)).longValue() & (1 << (i % 64))) != 0;
    }

    static boolean F(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static Bundle[] O(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lip lipVar = (lip) it.next();
            if (lipVar != null) {
                Bundle bundle = new Bundle();
                for (lip lipVar2 : lipVar.h) {
                    int i = lipVar2.b;
                    if ((i & 2) != 0) {
                        bundle.putString(lipVar2.c, lipVar2.d);
                    } else if ((i & 4) != 0) {
                        bundle.putLong(lipVar2.c, lipVar2.e);
                    } else if ((i & 16) != 0) {
                        bundle.putDouble(lipVar2.c, lipVar2.g);
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void P(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final Bundle Q(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lip lipVar = (lip) it.next();
            String str = lipVar.c;
            int i = lipVar.b;
            if ((i & 16) != 0) {
                bundle.putDouble(str, lipVar.g);
            } else if ((i & 8) != 0) {
                bundle.putFloat(str, lipVar.f);
            } else if ((i & 2) != 0) {
                bundle.putString(str, lipVar.d);
            } else if ((i & 4) != 0) {
                bundle.putLong(str, lipVar.e);
            }
        }
        return bundle;
    }

    static final lip R(lin linVar, String str) {
        for (lip lipVar : linVar.c) {
            if (lipVar.c.equals(str)) {
                return lipVar;
            }
        }
        return null;
    }

    public static final String S(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    static final String T(Map map, String str) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (str.equalsIgnoreCase((String) entry.getKey())) {
                    if (entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                        return (String) ((List) entry.getValue()).get(0);
                    }
                    break;
                    break;
                }
            }
        }
        return null;
    }

    public static final Object U(lip lipVar) {
        int i = lipVar.b;
        if ((i & 2) != 0) {
            return lipVar.d;
        }
        if ((i & 4) != 0) {
            return Long.valueOf(lipVar.e);
        }
        if ((i & 16) != 0) {
            return Double.valueOf(lipVar.g);
        }
        if (lipVar.h.size() > 0) {
            return O(lipVar.h);
        }
        return null;
    }

    static final boolean V(String str) {
        kro.i(str);
        return str.hashCode() == 95027 && str.equals("_ui");
    }

    static int W(aihf aihfVar, String str) {
        if (aihfVar == null) {
            return -1;
        }
        for (int i = 0; i < ((lir) aihfVar.instance).f.size(); i++) {
            if (str.equals(((lix) ((lir) aihfVar.instance).f.get(i)).d)) {
                return i;
            }
        }
        return -1;
    }

    static final void Z(aihf aihfVar, String str, Object obj) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((lin) aihfVar.instance).c);
        int i = 0;
        while (true) {
            if (i >= listUnmodifiableList.size()) {
                i = -1;
                break;
            } else if (str.equals(((lip) listUnmodifiableList.get(i)).c)) {
                break;
            } else {
                i++;
            }
        }
        aihf aihfVarCreateBuilder = lip.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        lip lipVar = (lip) aihfVarCreateBuilder.instance;
        lipVar.b |= 1;
        lipVar.c = str;
        long jLongValue = ((Long) obj).longValue();
        aihfVarCreateBuilder.copyOnWrite();
        lip lipVar2 = (lip) aihfVarCreateBuilder.instance;
        lipVar2.b |= 4;
        lipVar2.e = jLongValue;
        if (i >= 0) {
            aihfVar.bh(i, aihfVarCreateBuilder);
        } else {
            aihfVar.bg(aihfVarCreateBuilder);
        }
    }

    public static final void aa(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            P(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append('\n');
        }
    }

    static final boolean ab(lbg lbgVar) {
        kro.l(lbgVar);
        return !TextUtils.isEmpty(lbgVar.b);
    }

    static final Object ac(lin linVar, String str) {
        lip lipVarR = R(linVar, str);
        if (lipVarR == null) {
            return null;
        }
        return U(lipVarR);
    }

    static final boolean ad(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public static final void ae(StringBuilder sb, int i, String str, lhv lhvVar) {
        String str2;
        if (lhvVar != null) {
            P(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if ((lhvVar.b & 1) != 0) {
                int iBc = a.bc(lhvVar.c);
                if (iBc == 0 || iBc == 1) {
                    str2 = "UNKNOWN_COMPARISON_TYPE";
                } else if (iBc == 2) {
                    str2 = "LESS_THAN";
                } else if (iBc != 3) {
                    str2 = iBc != 4 ? "BETWEEN" : "EQUAL";
                } else {
                    str2 = "GREATER_THAN";
                }
                aa(sb, i, "comparison_type", str2);
            }
            if ((lhvVar.b & 2) != 0) {
                aa(sb, i, "match_as_float", Boolean.valueOf(lhvVar.d));
            }
            if ((lhvVar.b & 4) != 0) {
                aa(sb, i, "comparison_value", lhvVar.e);
            }
            if ((lhvVar.b & 8) != 0) {
                aa(sb, i, "min_comparison_value", lhvVar.f);
            }
            if ((lhvVar.b & 16) != 0) {
                aa(sb, i, "max_comparison_value", lhvVar.g);
            }
            P(sb, i);
            sb.append("}\n");
        }
    }

    static final Object af(lin linVar, String str, Object obj) {
        Object objAc = ac(linVar, str);
        return objAc != null ? objAc : obj;
    }

    private final void ag(StringBuilder sb, int i, List list) {
        if (list != null) {
            int i2 = i + 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lip lipVar = (lip) it.next();
                if (lipVar != null) {
                    P(sb, i2);
                    sb.append("param {\n");
                    aa(sb, i2, "name", (lipVar.b & 1) != 0 ? I().d(lipVar.c) : null);
                    aa(sb, i2, "string_value", (lipVar.b & 2) != 0 ? lipVar.d : null);
                    aa(sb, i2, "int_value", (lipVar.b & 4) != 0 ? Long.valueOf(lipVar.e) : null);
                    aa(sb, i2, "double_value", (lipVar.b & 16) != 0 ? Double.valueOf(lipVar.g) : null);
                    if (lipVar.h.size() > 0) {
                        ag(sb, i2, lipVar.h);
                    }
                    P(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    private static final void ah(StringBuilder sb, String str, lit litVar) {
        if (litVar != null) {
            P(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (litVar.c.size() != 0) {
                P(sb, 4);
                sb.append("results: ");
                int i = 0;
                for (Long l : litVar.c) {
                    int i2 = i + 1;
                    if (i != 0) {
                        sb.append(", ");
                    }
                    sb.append(l);
                    i = i2;
                }
                sb.append('\n');
            }
            if (litVar.b.size() != 0) {
                P(sb, 4);
                sb.append("status: ");
                int i3 = 0;
                for (Long l2 : litVar.b) {
                    int i4 = i3 + 1;
                    if (i3 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i3 = i4;
                }
                sb.append('\n');
            }
            if (litVar.d.size() != 0) {
                P(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i5 = 0;
                for (lim limVar : litVar.d) {
                    int i6 = i5 + 1;
                    if (i5 != 0) {
                        sb.append(", ");
                    }
                    sb.append((limVar.b & 1) != 0 ? Integer.valueOf(limVar.c) : null);
                    sb.append(':');
                    sb.append((limVar.b & 2) != 0 ? Long.valueOf(limVar.d) : null);
                    i5 = i6;
                }
                sb.append("}\n");
            }
            if (litVar.e.size() != 0) {
                P(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i7 = 0;
                for (liu liuVar : litVar.e) {
                    int i8 = i7 + 1;
                    if (i7 != 0) {
                        sb.append(", ");
                    }
                    sb.append((liuVar.b & 1) != 0 ? Integer.valueOf(liuVar.c) : null);
                    sb.append(": [");
                    Iterator it = liuVar.d.iterator();
                    int i9 = 0;
                    while (it.hasNext()) {
                        long jLongValue = ((Long) it.next()).longValue();
                        int i10 = i9 + 1;
                        if (i9 != 0) {
                            sb.append(", ");
                        }
                        sb.append(jLongValue);
                        i9 = i10;
                    }
                    sb.append(']');
                    i7 = i8;
                }
                sb.append("}\n");
            }
            P(sb, 3);
            sb.append("}\n");
        }
    }

    public static aiir l(aiir aiirVar, byte[] bArr) {
        ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
        return generatedRegistry != null ? aiirVar.mergeFrom(bArr, generatedRegistry) : aiirVar.mergeFrom(bArr);
    }

    static List q(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    public final void A(StringBuilder sb, int i, lhu lhuVar) {
        String str;
        if (lhuVar != null) {
            P(sb, i);
            sb.append("filter {\n");
            if ((lhuVar.b & 4) != 0) {
                aa(sb, i, "complement", Boolean.valueOf(lhuVar.e));
            }
            if ((lhuVar.b & 8) != 0) {
                aa(sb, i, "param_name", I().d(lhuVar.f));
            }
            if ((lhuVar.b & 1) != 0) {
                int i2 = i + 1;
                lhx lhxVar = lhuVar.c;
                if (lhxVar == null) {
                    lhxVar = lhx.a;
                }
                if (lhxVar != null) {
                    P(sb, i2);
                    sb.append("string_filter {\n");
                    if ((lhxVar.b & 1) != 0) {
                        int iAX = a.aX(lhxVar.c);
                        if (iAX != 0) {
                            switch (iAX) {
                                case 1:
                                    str = "UNKNOWN_MATCH_TYPE";
                                    break;
                                case 2:
                                    str = "REGEXP";
                                    break;
                                case 3:
                                    str = "BEGINS_WITH";
                                    break;
                                case 4:
                                    str = "ENDS_WITH";
                                    break;
                                case 5:
                                    str = "PARTIAL";
                                    break;
                                case 6:
                                    str = "EXACT";
                                    break;
                                default:
                                    str = "IN_LIST";
                                    break;
                            }
                        } else {
                            str = "UNKNOWN_MATCH_TYPE";
                        }
                        aa(sb, i2, "match_type", str);
                    }
                    if ((lhxVar.b & 2) != 0) {
                        aa(sb, i2, "expression", lhxVar.d);
                    }
                    if ((lhxVar.b & 4) != 0) {
                        aa(sb, i2, "case_sensitive", Boolean.valueOf(lhxVar.e));
                    }
                    if (lhxVar.f.size() > 0) {
                        P(sb, i + 2);
                        sb.append("expression_list {\n");
                        for (String str2 : lhxVar.f) {
                            P(sb, i + 3);
                            sb.append(str2);
                            sb.append('\n');
                        }
                        sb.append("}\n");
                    }
                    P(sb, i2);
                    sb.append("}\n");
                }
            }
            if ((lhuVar.b & 2) != 0) {
                int i3 = i + 1;
                lhv lhvVar = lhuVar.d;
                if (lhvVar == null) {
                    lhvVar = lhv.a;
                }
                ae(sb, i3, "number_filter", lhvVar);
            }
            P(sb, i);
            sb.append("}\n");
        }
    }

    public final void B(Map map) {
        String strT = T(map, "Date");
        if (TextUtils.isEmpty(strT)) {
            return;
        }
        long jG = g(strT);
        if (jG > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            o();
            if (this.b == 0) {
                this.a = jElapsedRealtime;
                this.b = jG;
            }
        }
    }

    public final void D(long j, String str) {
        o();
        if (j == 0) {
            if (G().F(null, lcl.aT)) {
                ((lgw) this.l.i).a(str, "gct_zero_elapsed", null, 1);
                return;
            } else {
                v().T(str, "gct_zero_elapsed", "", 1L, 0L);
                return;
            }
        }
        if (this.b == 0) {
            if (G().F(null, lcl.aT)) {
                ((lgw) this.l.i).a(str, "gct_zero_reference", null, 1);
            } else {
                v().T(str, "gct_zero_reference", "", 1L, 0L);
            }
        }
    }

    public final byte[] N(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            aT().c.b("Failed to gzip content", e);
            throw e;
        }
    }

    final void X(aihf aihfVar, Object obj) {
        kro.l(obj);
        aihfVar.copyOnWrite();
        lip lipVar = (lip) aihfVar.instance;
        lip lipVar2 = lip.a;
        lipVar.b &= -3;
        lip lipVar3 = lip.a;
        lipVar.d = lipVar3.d;
        aihfVar.copyOnWrite();
        lip lipVar4 = (lip) aihfVar.instance;
        lipVar4.b &= -5;
        lipVar4.e = 0L;
        aihfVar.copyOnWrite();
        lip lipVar5 = (lip) aihfVar.instance;
        lipVar5.b &= -17;
        lipVar5.g = 0.0d;
        aihfVar.copyOnWrite();
        ((lip) aihfVar.instance).h = lip.emptyProtobufList();
        if (obj instanceof String) {
            String str = (String) obj;
            aihfVar.copyOnWrite();
            lip lipVar6 = (lip) aihfVar.instance;
            str.getClass();
            lipVar6.b |= 2;
            lipVar6.d = str;
            return;
        }
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            aihfVar.copyOnWrite();
            lip lipVar7 = (lip) aihfVar.instance;
            lipVar7.b |= 4;
            lipVar7.e = jLongValue;
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            aihfVar.copyOnWrite();
            lip lipVar8 = (lip) aihfVar.instance;
            lipVar8.b |= 16;
            lipVar8.g = dDoubleValue;
            return;
        }
        if (!(obj instanceof Bundle[])) {
            aT().c.b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                aihf aihfVarCreateBuilder = lipVar3.createBuilder();
                for (String str2 : bundle.keySet()) {
                    aihf aihfVarCreateBuilder2 = lipVar3.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    lip lipVar9 = (lip) aihfVarCreateBuilder2.instance;
                    str2.getClass();
                    lipVar9.b |= 1;
                    lipVar9.c = str2;
                    Object obj2 = bundle.get(str2);
                    if (obj2 instanceof Long) {
                        long jLongValue2 = ((Long) obj2).longValue();
                        aihfVarCreateBuilder2.copyOnWrite();
                        lip lipVar10 = (lip) aihfVarCreateBuilder2.instance;
                        lipVar10.b |= 4;
                        lipVar10.e = jLongValue2;
                    } else if (obj2 instanceof String) {
                        String str3 = (String) obj2;
                        aihfVarCreateBuilder2.copyOnWrite();
                        lip lipVar11 = (lip) aihfVarCreateBuilder2.instance;
                        str3.getClass();
                        lipVar11.b |= 2;
                        lipVar11.d = str3;
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        aihfVarCreateBuilder2.copyOnWrite();
                        lip lipVar12 = (lip) aihfVarCreateBuilder2.instance;
                        lipVar12.b |= 16;
                        lipVar12.g = dDoubleValue2;
                    }
                    aihfVarCreateBuilder.copyOnWrite();
                    lip lipVar13 = (lip) aihfVarCreateBuilder.instance;
                    lip lipVar14 = (lip) aihfVarCreateBuilder2.build();
                    lipVar14.getClass();
                    lipVar13.a();
                    lipVar13.h.add(lipVar14);
                }
                if (((lip) aihfVarCreateBuilder.instance).h.size() > 0) {
                    arrayList.add((lip) aihfVarCreateBuilder.build());
                }
            }
        }
        aihfVar.copyOnWrite();
        lip lipVar15 = (lip) aihfVar.instance;
        lipVar15.a();
        aifs.addAll(arrayList, lipVar15.h);
    }

    final void Y(aihf aihfVar, Object obj) {
        aihfVar.copyOnWrite();
        lix lixVar = (lix) aihfVar.instance;
        lix lixVar2 = lix.a;
        lixVar.b &= -5;
        lixVar.e = lix.a.e;
        aihfVar.copyOnWrite();
        lix lixVar3 = (lix) aihfVar.instance;
        lixVar3.b &= -9;
        lixVar3.f = 0L;
        aihfVar.copyOnWrite();
        lix lixVar4 = (lix) aihfVar.instance;
        lixVar4.b &= -33;
        lixVar4.g = 0.0d;
        if (obj instanceof String) {
            aihfVar.copyOnWrite();
            lix lixVar5 = (lix) aihfVar.instance;
            lixVar5.b |= 4;
            lixVar5.e = (String) obj;
            return;
        }
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            aihfVar.copyOnWrite();
            lix lixVar6 = (lix) aihfVar.instance;
            lixVar6.b |= 8;
            lixVar6.f = jLongValue;
            return;
        }
        if (!(obj instanceof Double)) {
            aT().c.b("Ignoring invalid (type) user attribute value", obj);
            return;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        aihfVar.copyOnWrite();
        lix lixVar7 = (lix) aihfVar.instance;
        lixVar7.b |= 32;
        lixVar7.g = dDoubleValue;
    }

    public final int a(String str, byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        try {
            liq liqVar = (liq) ((aihf) l(liq.a.createBuilder(), bArr)).build();
            if (liqVar == null) {
                return 0;
            }
            Iterator it = liqVar.c.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((lir) it.next()).e.size();
            }
            return size;
        } catch (IOException e) {
            aT().c.c("Failed to parse MeasurementBatch for diagnostics. appId", str, e);
            return 0;
        }
    }

    final long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return d(str.getBytes(StandardCharsets.UTF_8));
    }

    public final long d(byte[] bArr) {
        kro.l(bArr);
        L().o();
        MessageDigest messageDigestA = lga.A();
        if (messageDigestA != null) {
            return lga.l(messageDigestA.digest(bArr));
        }
        aT().c.a("Failed to get MD5");
        return 0L;
    }

    public final long e(long j) {
        o();
        long j2 = this.b;
        if (j2 == 0 || j == 0) {
            return 0L;
        }
        return (j2 - this.a) + j;
    }

    final long g(String str) {
        try {
            return ZonedDateTime.parse(str, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
        } catch (DateTimeParseException unused) {
            aT().f.b("Unable to parse header time, time", str);
            return 0L;
        }
    }

    final Bundle h(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(h((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public final Parcelable i(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr != null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
            } catch (krz unused) {
                aT().c.a("Failed to load parcelable from buffer");
            } finally {
                parcelObtain.recycle();
            }
        }
        return parcelable;
    }

    final lcd j(fyk fykVar) {
        Object obj;
        Bundle bundleH = h(fykVar.c, true);
        String string = (!bundleH.containsKey("_o") || (obj = bundleH.get("_o")) == null) ? "app" : obj.toString();
        String strB = lec.b(fykVar.a);
        if (strB == null) {
            strB = fykVar.a;
        }
        return new lcd(strB, new lcc(bundleH), string, fykVar.b, 0L);
    }

    public final lin k(lbz lbzVar) {
        aihf aihfVarCreateBuilder = lin.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        lin linVar = (lin) aihfVarCreateBuilder.instance;
        linVar.b |= 4;
        linVar.f = lbzVar.f;
        aihfVarCreateBuilder.copyOnWrite();
        lin linVar2 = (lin) aihfVarCreateBuilder.instance;
        linVar2.b |= 64;
        linVar2.j = lbzVar.e;
        lcc lccVar = lbzVar.g;
        lcb lcbVar = new lcb(lccVar);
        while (lcbVar.hasNext()) {
            String next = lcbVar.next();
            aihf aihfVarCreateBuilder2 = lip.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            lip lipVar = (lip) aihfVarCreateBuilder2.instance;
            next.getClass();
            lipVar.b |= 1;
            lipVar.c = next;
            Object objC = lccVar.c(next);
            kro.l(objC);
            X(aihfVarCreateBuilder2, objC);
            aihfVarCreateBuilder.bg(aihfVarCreateBuilder2);
        }
        String str = lbzVar.c;
        if (!TextUtils.isEmpty(str) && lccVar.c("_o") == null) {
            aihf aihfVarCreateBuilder3 = lip.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            lip lipVar2 = (lip) aihfVarCreateBuilder3.instance;
            lipVar2.b |= 1;
            lipVar2.c = "_o";
            aihfVarCreateBuilder3.copyOnWrite();
            lip lipVar3 = (lip) aihfVarCreateBuilder3.instance;
            str.getClass();
            lipVar3.b |= 2;
            lipVar3.d = str;
            aihfVarCreateBuilder.D((lip) aihfVarCreateBuilder3.build());
        }
        return (lin) aihfVarCreateBuilder.build();
    }

    final String m(liq liqVar) {
        String str;
        String str2;
        String str3;
        if (liqVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if ((liqVar.b & 2) != 0) {
            aa(sb, 0, "upload_subdomain", liqVar.e);
        }
        if ((liqVar.b & 1) != 0) {
            aa(sb, 0, "sgtm_join_id", liqVar.d);
        }
        for (lir lirVar : liqVar.c) {
            if (lirVar != null) {
                P(sb, 1);
                sb.append("bundle {\n");
                if ((lirVar.b & 1) != 0) {
                    aa(sb, 1, "protocol_version", Integer.valueOf(lirVar.d));
                }
                autm.c();
                if (G().F(lirVar.r, lcl.aM) && (lirVar.c & SemanticState.Multiline) != 0) {
                    aa(sb, 1, "session_stitching_token", lirVar.P);
                }
                aa(sb, 1, "platform", lirVar.l);
                if ((lirVar.b & 16384) != 0) {
                    aa(sb, 1, "gmp_version", Long.valueOf(lirVar.t));
                }
                if ((lirVar.b & 32768) != 0) {
                    aa(sb, 1, "uploading_gmp_version", Long.valueOf(lirVar.u));
                }
                if ((lirVar.c & 16) != 0) {
                    aa(sb, 1, "dynamite_version", Long.valueOf(lirVar.M));
                }
                if ((lirVar.b & 536870912) != 0) {
                    aa(sb, 1, "config_version", Long.valueOf(lirVar.H));
                }
                aa(sb, 1, "gmp_app_id", lirVar.B);
                aa(sb, 1, "app_id", lirVar.r);
                aa(sb, 1, "app_version", lirVar.s);
                if ((lirVar.b & 33554432) != 0) {
                    aa(sb, 1, "app_version_major", Integer.valueOf(lirVar.F));
                }
                aa(sb, 1, "firebase_instance_id", lirVar.E);
                if ((lirVar.b & 524288) != 0) {
                    aa(sb, 1, "dev_cert_hash", Long.valueOf(lirVar.y));
                }
                aa(sb, 1, "app_store", lirVar.q);
                if ((lirVar.b & 2) != 0) {
                    aa(sb, 1, "upload_timestamp_millis", Long.valueOf(lirVar.g));
                }
                if ((lirVar.b & 4) != 0) {
                    aa(sb, 1, "start_timestamp_millis", Long.valueOf(lirVar.h));
                }
                if ((lirVar.b & 8) != 0) {
                    aa(sb, 1, "end_timestamp_millis", Long.valueOf(lirVar.i));
                }
                if ((lirVar.b & 16) != 0) {
                    aa(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(lirVar.j));
                }
                if ((lirVar.b & 32) != 0) {
                    aa(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(lirVar.k));
                }
                aa(sb, 1, "app_instance_id", lirVar.x);
                aa(sb, 1, "resettable_device_id", lirVar.v);
                aa(sb, 1, "ds_id", lirVar.I);
                if ((lirVar.b & 131072) != 0) {
                    aa(sb, 1, "limited_ad_tracking", Boolean.valueOf(lirVar.w));
                }
                if (lirVar.L.size() > 0) {
                    aa(sb, 1, "config_flags", "[" + TextUtils.join(", ", lirVar.L) + ']');
                }
                aa(sb, 1, "os_version", lirVar.m);
                aa(sb, 1, "device_model", lirVar.n);
                aa(sb, 1, "user_default_language", lirVar.o);
                if ((lirVar.b & SemanticState.ReadOnly) != 0) {
                    aa(sb, 1, "time_zone_offset_minutes", Integer.valueOf(lirVar.p));
                }
                if ((lirVar.b & 1048576) != 0) {
                    aa(sb, 1, "bundle_sequential_index", Integer.valueOf(lirVar.z));
                }
                if ((lirVar.c & 8388608) != 0) {
                    aa(sb, 1, "delivery_index", Integer.valueOf(lirVar.Y));
                }
                if ((lirVar.b & 8388608) != 0) {
                    aa(sb, 1, "service_upload", Boolean.valueOf(lirVar.C));
                }
                aa(sb, 1, "health_monitor", lirVar.A);
                if ((lirVar.c & 2) != 0) {
                    aa(sb, 1, "retry_counter", Integer.valueOf(lirVar.J));
                }
                if ((lirVar.c & SemanticState.Focused) != 0) {
                    aa(sb, 1, "consent_signals", lirVar.O);
                }
                if ((lirVar.c & 262144) != 0) {
                    aa(sb, 1, "is_dma_region", Boolean.valueOf(lirVar.U));
                }
                if ((lirVar.c & 524288) != 0) {
                    aa(sb, 1, "core_platform_services", lirVar.V);
                }
                if ((lirVar.c & 131072) != 0) {
                    aa(sb, 1, "consent_diagnostics", lirVar.T);
                }
                if ((lirVar.c & 32768) != 0) {
                    aa(sb, 1, "target_os_version", Long.valueOf(lirVar.S));
                }
                autd.c();
                if (G().F(lirVar.r, lcl.aN)) {
                    aa(sb, 1, "ad_services_version", Integer.valueOf(lirVar.W));
                    if ((lirVar.c & 4194304) != 0) {
                        lii liiVar = lirVar.X;
                        if (liiVar == null) {
                            liiVar = lii.a;
                        }
                        if (liiVar != null) {
                            P(sb, 2);
                            sb.append("attribution_eligibility_status {\n");
                            aa(sb, 2, "eligible", Boolean.valueOf(liiVar.b));
                            aa(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(liiVar.c));
                            aa(sb, 2, "pre_r", Boolean.valueOf(liiVar.d));
                            aa(sb, 2, "r_extensions_too_old", Boolean.valueOf(liiVar.e));
                            aa(sb, 2, "adservices_extension_too_old", Boolean.valueOf(liiVar.f));
                            aa(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(liiVar.g));
                            aa(sb, 2, "measurement_manager_disabled", Boolean.valueOf(liiVar.h));
                            P(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                if ((lirVar.c & 16777216) != 0) {
                    lih lihVar = lirVar.Z;
                    if (lihVar == null) {
                        lihVar = lih.a;
                    }
                    P(sb, 2);
                    sb.append("ad_campaign_info {\n");
                    if ((lihVar.b & 1) != 0) {
                        aa(sb, 2, "deep_link_gclid", lihVar.c);
                    }
                    if ((lihVar.b & 2) != 0) {
                        aa(sb, 2, "deep_link_gbraid", lihVar.d);
                    }
                    if ((lihVar.b & 4) != 0) {
                        aa(sb, 2, "deep_link_gad_source", lihVar.e);
                    }
                    if ((lihVar.b & SemanticState.Hidden) != 0) {
                        aa(sb, 2, "deep_link_url", lihVar.k);
                    }
                    if ((lihVar.b & 8) != 0) {
                        aa(sb, 2, "deep_link_session_millis", Long.valueOf(lihVar.f));
                    }
                    if ((lihVar.b & 16) != 0) {
                        aa(sb, 2, "market_referrer_gclid", lihVar.g);
                    }
                    if ((lihVar.b & 32) != 0) {
                        aa(sb, 2, "market_referrer_gbraid", lihVar.h);
                    }
                    if ((lihVar.b & 64) != 0) {
                        aa(sb, 2, "market_referrer_gad_source", lihVar.i);
                    }
                    if ((lihVar.b & SemanticState.Focused) != 0) {
                        aa(sb, 2, "market_referrer_click_millis", Long.valueOf(lihVar.j));
                    }
                    P(sb, 2);
                    sb.append("}\n");
                }
                if ((lirVar.c & 134217728) != 0) {
                    aa(sb, 1, "batching_timestamp_millis", Long.valueOf(lirVar.ab));
                }
                if ((lirVar.c & 67108864) != 0) {
                    liw liwVar = lirVar.aa;
                    if (liwVar == null) {
                        liwVar = liw.a;
                    }
                    P(sb, 2);
                    sb.append("sgtm_diagnostics {\n");
                    int iBc = a.bc(liwVar.c);
                    if (iBc == 0 || iBc == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iBc == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iBc != 3) {
                        str2 = iBc != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    aa(sb, 2, "upload_type", str2);
                    liv livVarA = liv.a(liwVar.d);
                    if (livVarA == null) {
                        livVarA = liv.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN;
                    }
                    aa(sb, 2, "client_upload_eligibility", livVarA.name());
                    int iBt = a.bt(liwVar.e);
                    if (iBt == 0 || iBt == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iBt == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iBt == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iBt != 4) {
                        str3 = iBt != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    aa(sb, 2, "service_upload_eligibility", str3);
                    P(sb, 2);
                    sb.append("}\n");
                }
                if ((lirVar.c & 536870912) != 0) {
                    lil lilVar = lirVar.ac;
                    if (lilVar == null) {
                        lilVar = lil.a;
                    }
                    P(sb, 2);
                    sb.append("consent_info_extra {\n");
                    for (lik likVar : lilVar.b) {
                        P(sb, 3);
                        sb.append("limited_data_modes {\n");
                        int iBc2 = a.bc(likVar.b);
                        if (iBc2 == 0 || iBc2 == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iBc2 == 2) {
                            str = "AD_STORAGE";
                        } else if (iBc2 != 3) {
                            str = iBc2 != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        aa(sb, 3, "type", str);
                        int iAS = a.aS(likVar.c);
                        aa(sb, 3, "mode", (iAS == 0 || iAS == 1) ? "NOT_LIMITED" : iAS != 2 ? "NO_DATA_MODE" : "LIMITED_MODE");
                        P(sb, 3);
                        sb.append("}\n");
                    }
                    P(sb, 2);
                    sb.append("}\n");
                }
                aiie<lix> aiieVar = lirVar.f;
                if (aiieVar != null) {
                    for (lix lixVar : aiieVar) {
                        if (lixVar != null) {
                            P(sb, 2);
                            sb.append("user_property {\n");
                            aa(sb, 2, "set_timestamp_millis", (lixVar.b & 1) != 0 ? Long.valueOf(lixVar.c) : null);
                            aa(sb, 2, "name", I().e(lixVar.d));
                            aa(sb, 2, "string_value", lixVar.e);
                            aa(sb, 2, "int_value", (lixVar.b & 8) != 0 ? Long.valueOf(lixVar.f) : null);
                            aa(sb, 2, "double_value", (lixVar.b & 32) != 0 ? Double.valueOf(lixVar.g) : null);
                            P(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                aiie<lij> aiieVar2 = lirVar.D;
                if (aiieVar2 != null) {
                    for (lij lijVar : aiieVar2) {
                        if (lijVar != null) {
                            P(sb, 2);
                            sb.append("audience_membership {\n");
                            if ((lijVar.b & 1) != 0) {
                                aa(sb, 2, "audience_id", Integer.valueOf(lijVar.c));
                            }
                            if ((lijVar.b & 8) != 0) {
                                aa(sb, 2, "new_audience", Boolean.valueOf(lijVar.f));
                            }
                            lit litVar = lijVar.d;
                            if (litVar == null) {
                                litVar = lit.a;
                            }
                            ah(sb, "current_data", litVar);
                            if ((lijVar.b & 4) != 0) {
                                lit litVar2 = lijVar.e;
                                if (litVar2 == null) {
                                    litVar2 = lit.a;
                                }
                                ah(sb, "previous_data", litVar2);
                            }
                            P(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                aiie<lin> aiieVar3 = lirVar.e;
                if (aiieVar3 != null) {
                    for (lin linVar : aiieVar3) {
                        if (linVar != null) {
                            P(sb, 2);
                            sb.append("event {\n");
                            aa(sb, 2, "name", I().c(linVar.d));
                            if ((linVar.b & 2) != 0) {
                                aa(sb, 2, "timestamp_millis", Long.valueOf(linVar.e));
                            }
                            if ((linVar.b & 32) != 0) {
                                aa(sb, 2, "corrected_timestamp_millis", Long.valueOf(linVar.i));
                            }
                            if ((linVar.b & 4) != 0) {
                                aa(sb, 2, "previous_timestamp_millis", Long.valueOf(linVar.f));
                            }
                            if ((linVar.b & 8) != 0) {
                                aa(sb, 2, "count", Integer.valueOf(linVar.g));
                            }
                            if (linVar.c.size() != 0) {
                                ag(sb, 2, linVar.c);
                            }
                            P(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                P(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    final List p(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                aT().f.b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    aT().f.c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    final Map r(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(r((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(r((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(r((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    @Override // defpackage.lfo
    protected final void b() {
    }
}
