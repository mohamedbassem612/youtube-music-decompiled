package defpackage;

import app.rive.semantics.SemanticState;
import java.util.EnumMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class adce {
    private static final agke a;
    private static final agke b;
    private static final agke c;
    private static final agke d;
    private static final agke e;
    private static final agke f;
    private static final agke g;
    public static final agke k;
    public static final agke l;
    public static final agke m;
    public static final Map n;

    static {
        Boolean bool = Boolean.FALSE;
        final int i = 1;
        final int i2 = 0;
        final int i3 = 3;
        axfd axfdVar = new axfd((Object) bool, new adcj() { // from class: adbx
            @Override // defpackage.adcj
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.b = ((Float) obj2).floatValue();
                        adcaVar.u |= 2;
                        return;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.h = ((Boolean) obj2).booleanValue();
                        adcaVar2.u |= 64;
                        return;
                    case 2:
                        String str = (String) obj2;
                        if (str == null) {
                            throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
                        }
                        ((adca) obj).c = str;
                        return;
                    case 3:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.d = ((Integer) obj2).intValue();
                        adcaVar3.u |= 4;
                        return;
                    case 4:
                        adca adcaVar4 = (adca) obj;
                        adcaVar4.n = ((Boolean) obj2).booleanValue();
                        adcaVar4.u |= SemanticState.Obscured;
                        return;
                    case 5:
                        adca adcaVar5 = (adca) obj;
                        adcaVar5.o = ((Float) obj2).floatValue();
                        adcaVar5.u |= SemanticState.Multiline;
                        return;
                    case 6:
                        adca adcaVar6 = (adca) obj;
                        adcaVar6.p = ((Boolean) obj2).booleanValue();
                        adcaVar6.u |= 16384;
                        return;
                    case 7:
                        adca adcaVar7 = (adca) obj;
                        adcaVar7.i = ((Boolean) obj2).booleanValue();
                        adcaVar7.u |= SemanticState.Focused;
                        return;
                    case 8:
                        adca adcaVar8 = (adca) obj;
                        adcaVar8.q = ((Boolean) obj2).booleanValue();
                        adcaVar8.u |= 32768;
                        return;
                    case 9:
                        adca adcaVar9 = (adca) obj;
                        adcaVar9.r = ((Boolean) obj2).booleanValue();
                        adcaVar9.u |= 65536;
                        return;
                    case 10:
                        adca adcaVar10 = (adca) obj;
                        adcaVar10.l = ((Boolean) obj2).booleanValue();
                        adcaVar10.u |= SemanticState.ReadOnly;
                        return;
                    case 11:
                        adca adcaVar11 = (adca) obj;
                        adcaVar11.s = ((Boolean) obj2).booleanValue();
                        adcaVar11.u |= 131072;
                        return;
                    case 12:
                        adca adcaVar12 = (adca) obj;
                        adcaVar12.t = ((Boolean) obj2).booleanValue();
                        adcaVar12.u |= 262144;
                        return;
                    case 13:
                        adca adcaVar13 = (adca) obj;
                        adcaVar13.j = ((Boolean) obj2).booleanValue();
                        adcaVar13.u |= SemanticState.Hidden;
                        return;
                    case 14:
                        adca adcaVar14 = (adca) obj;
                        adcaVar14.m = ((Boolean) obj2).booleanValue();
                        adcaVar14.u |= SemanticState.Modal;
                        return;
                    case 15:
                        adca adcaVar15 = (adca) obj;
                        adcaVar15.k = ((Float) obj2).floatValue();
                        adcaVar15.u |= SemanticState.LiveRegion;
                        return;
                    default:
                        adca adcaVar16 = (adca) obj;
                        adcaVar16.a = ((Boolean) obj2).booleanValue();
                        adcaVar16.u |= 1;
                        return;
                }
            }
        }, new adch() { // from class: adbw
            @Override // defpackage.adch
            public final Object a(Object obj) {
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(((apjn) obj).j);
                    case 1:
                        return Boolean.valueOf(((apjn) obj).s);
                    case 2:
                        return Float.valueOf(((apjn) obj).t);
                    case 3:
                        return ((apjn) obj).u;
                    case 4:
                        return Float.valueOf(((apjn) obj).n);
                    case 5:
                        return Integer.valueOf(((apjn) obj).r);
                    case 6:
                        return Boolean.valueOf(((apjn) obj).q);
                    case 7:
                        return Float.valueOf(((apjn) obj).v);
                    case 8:
                        return Boolean.valueOf(((apjn) obj).w);
                    case 9:
                        return Boolean.valueOf(((apjn) obj).y);
                    case 10:
                        return Boolean.valueOf(((apjn) obj).z);
                    case 11:
                        return Boolean.valueOf(((apjn) obj).A);
                    case 12:
                        return Boolean.valueOf(((apjn) obj).l);
                    case 13:
                        return Boolean.valueOf(((apjn) obj).B);
                    case 14:
                        return Boolean.valueOf(((apjn) obj).o);
                    case 15:
                        return Boolean.valueOf(((apjn) obj).m);
                    default:
                        return Boolean.valueOf(((apjn) obj).x);
                }
            }
        }, new adci() { // from class: adby
            @Override // defpackage.adci
            public final boolean a(Object obj) {
                apjn apjnVar = (apjn) obj;
                switch (i3) {
                    case 0:
                        if ((apjnVar.d & 16777216) != 0) {
                            return true;
                        }
                        break;
                    case 1:
                        if ((apjnVar.d & 8388608) != 0) {
                            return true;
                        }
                        break;
                    case 2:
                        if ((apjnVar.d & 33554432) != 0) {
                            return true;
                        }
                        break;
                    case 3:
                        if ((apjnVar.b & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 4:
                        if ((apjnVar.d & 4194304) != 0) {
                            return true;
                        }
                        break;
                    case 5:
                        if ((apjnVar.d & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 6:
                        if ((apjnVar.d & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 7:
                        if ((apjnVar.c & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 8:
                        if ((apjnVar.d & 268435456) != 0) {
                            return true;
                        }
                        break;
                    case 9:
                        if ((apjnVar.e & 2) != 0) {
                            return true;
                        }
                        break;
                    case 10:
                        if ((apjnVar.e & 4) != 0) {
                            return true;
                        }
                        break;
                    case 11:
                        if ((apjnVar.e & 32) != 0) {
                            return true;
                        }
                        break;
                    case 12:
                        if ((apjnVar.e & SemanticState.Hidden) != 0) {
                            return true;
                        }
                        break;
                    case 13:
                        if ((apjnVar.c & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 14:
                        if ((apjnVar.c & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 15:
                        if ((apjnVar.c & 8388608) != 0) {
                            return true;
                        }
                        break;
                    default:
                        if ((apjnVar.d & 536870912) != 0) {
                            return true;
                        }
                        break;
                }
                return false;
            }
        }, (agex) null);
        final int i4 = 7;
        final int i5 = 12;
        final int i6 = 13;
        axfd axfdVar2 = new axfd((Object) bool, new adcj() { // from class: adbx
            @Override // defpackage.adcj
            public final void a(Object obj, Object obj2) {
                switch (i4) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.b = ((Float) obj2).floatValue();
                        adcaVar.u |= 2;
                        return;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.h = ((Boolean) obj2).booleanValue();
                        adcaVar2.u |= 64;
                        return;
                    case 2:
                        String str = (String) obj2;
                        if (str == null) {
                            throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
                        }
                        ((adca) obj).c = str;
                        return;
                    case 3:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.d = ((Integer) obj2).intValue();
                        adcaVar3.u |= 4;
                        return;
                    case 4:
                        adca adcaVar4 = (adca) obj;
                        adcaVar4.n = ((Boolean) obj2).booleanValue();
                        adcaVar4.u |= SemanticState.Obscured;
                        return;
                    case 5:
                        adca adcaVar5 = (adca) obj;
                        adcaVar5.o = ((Float) obj2).floatValue();
                        adcaVar5.u |= SemanticState.Multiline;
                        return;
                    case 6:
                        adca adcaVar6 = (adca) obj;
                        adcaVar6.p = ((Boolean) obj2).booleanValue();
                        adcaVar6.u |= 16384;
                        return;
                    case 7:
                        adca adcaVar7 = (adca) obj;
                        adcaVar7.i = ((Boolean) obj2).booleanValue();
                        adcaVar7.u |= SemanticState.Focused;
                        return;
                    case 8:
                        adca adcaVar8 = (adca) obj;
                        adcaVar8.q = ((Boolean) obj2).booleanValue();
                        adcaVar8.u |= 32768;
                        return;
                    case 9:
                        adca adcaVar9 = (adca) obj;
                        adcaVar9.r = ((Boolean) obj2).booleanValue();
                        adcaVar9.u |= 65536;
                        return;
                    case 10:
                        adca adcaVar10 = (adca) obj;
                        adcaVar10.l = ((Boolean) obj2).booleanValue();
                        adcaVar10.u |= SemanticState.ReadOnly;
                        return;
                    case 11:
                        adca adcaVar11 = (adca) obj;
                        adcaVar11.s = ((Boolean) obj2).booleanValue();
                        adcaVar11.u |= 131072;
                        return;
                    case 12:
                        adca adcaVar12 = (adca) obj;
                        adcaVar12.t = ((Boolean) obj2).booleanValue();
                        adcaVar12.u |= 262144;
                        return;
                    case 13:
                        adca adcaVar13 = (adca) obj;
                        adcaVar13.j = ((Boolean) obj2).booleanValue();
                        adcaVar13.u |= SemanticState.Hidden;
                        return;
                    case 14:
                        adca adcaVar14 = (adca) obj;
                        adcaVar14.m = ((Boolean) obj2).booleanValue();
                        adcaVar14.u |= SemanticState.Modal;
                        return;
                    case 15:
                        adca adcaVar15 = (adca) obj;
                        adcaVar15.k = ((Float) obj2).floatValue();
                        adcaVar15.u |= SemanticState.LiveRegion;
                        return;
                    default:
                        adca adcaVar16 = (adca) obj;
                        adcaVar16.a = ((Boolean) obj2).booleanValue();
                        adcaVar16.u |= 1;
                        return;
                }
            }
        }, new adch() { // from class: adbw
            @Override // defpackage.adch
            public final Object a(Object obj) {
                switch (i5) {
                    case 0:
                        return Boolean.valueOf(((apjn) obj).j);
                    case 1:
                        return Boolean.valueOf(((apjn) obj).s);
                    case 2:
                        return Float.valueOf(((apjn) obj).t);
                    case 3:
                        return ((apjn) obj).u;
                    case 4:
                        return Float.valueOf(((apjn) obj).n);
                    case 5:
                        return Integer.valueOf(((apjn) obj).r);
                    case 6:
                        return Boolean.valueOf(((apjn) obj).q);
                    case 7:
                        return Float.valueOf(((apjn) obj).v);
                    case 8:
                        return Boolean.valueOf(((apjn) obj).w);
                    case 9:
                        return Boolean.valueOf(((apjn) obj).y);
                    case 10:
                        return Boolean.valueOf(((apjn) obj).z);
                    case 11:
                        return Boolean.valueOf(((apjn) obj).A);
                    case 12:
                        return Boolean.valueOf(((apjn) obj).l);
                    case 13:
                        return Boolean.valueOf(((apjn) obj).B);
                    case 14:
                        return Boolean.valueOf(((apjn) obj).o);
                    case 15:
                        return Boolean.valueOf(((apjn) obj).m);
                    default:
                        return Boolean.valueOf(((apjn) obj).x);
                }
            }
        }, new adci() { // from class: adby
            @Override // defpackage.adci
            public final boolean a(Object obj) {
                apjn apjnVar = (apjn) obj;
                switch (i6) {
                    case 0:
                        if ((apjnVar.d & 16777216) != 0) {
                            return true;
                        }
                        break;
                    case 1:
                        if ((apjnVar.d & 8388608) != 0) {
                            return true;
                        }
                        break;
                    case 2:
                        if ((apjnVar.d & 33554432) != 0) {
                            return true;
                        }
                        break;
                    case 3:
                        if ((apjnVar.b & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 4:
                        if ((apjnVar.d & 4194304) != 0) {
                            return true;
                        }
                        break;
                    case 5:
                        if ((apjnVar.d & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 6:
                        if ((apjnVar.d & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 7:
                        if ((apjnVar.c & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 8:
                        if ((apjnVar.d & 268435456) != 0) {
                            return true;
                        }
                        break;
                    case 9:
                        if ((apjnVar.e & 2) != 0) {
                            return true;
                        }
                        break;
                    case 10:
                        if ((apjnVar.e & 4) != 0) {
                            return true;
                        }
                        break;
                    case 11:
                        if ((apjnVar.e & 32) != 0) {
                            return true;
                        }
                        break;
                    case 12:
                        if ((apjnVar.e & SemanticState.Hidden) != 0) {
                            return true;
                        }
                        break;
                    case 13:
                        if ((apjnVar.c & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 14:
                        if ((apjnVar.c & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 15:
                        if ((apjnVar.c & 8388608) != 0) {
                            return true;
                        }
                        break;
                    default:
                        if ((apjnVar.d & 536870912) != 0) {
                            return true;
                        }
                        break;
                }
                return false;
            }
        }, (agex) null);
        final int i7 = 15;
        axfd axfdVar3 = new axfd((Object) bool, new adcj() { // from class: adbx
            @Override // defpackage.adcj
            public final void a(Object obj, Object obj2) {
                switch (i6) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.b = ((Float) obj2).floatValue();
                        adcaVar.u |= 2;
                        return;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.h = ((Boolean) obj2).booleanValue();
                        adcaVar2.u |= 64;
                        return;
                    case 2:
                        String str = (String) obj2;
                        if (str == null) {
                            throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
                        }
                        ((adca) obj).c = str;
                        return;
                    case 3:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.d = ((Integer) obj2).intValue();
                        adcaVar3.u |= 4;
                        return;
                    case 4:
                        adca adcaVar4 = (adca) obj;
                        adcaVar4.n = ((Boolean) obj2).booleanValue();
                        adcaVar4.u |= SemanticState.Obscured;
                        return;
                    case 5:
                        adca adcaVar5 = (adca) obj;
                        adcaVar5.o = ((Float) obj2).floatValue();
                        adcaVar5.u |= SemanticState.Multiline;
                        return;
                    case 6:
                        adca adcaVar6 = (adca) obj;
                        adcaVar6.p = ((Boolean) obj2).booleanValue();
                        adcaVar6.u |= 16384;
                        return;
                    case 7:
                        adca adcaVar7 = (adca) obj;
                        adcaVar7.i = ((Boolean) obj2).booleanValue();
                        adcaVar7.u |= SemanticState.Focused;
                        return;
                    case 8:
                        adca adcaVar8 = (adca) obj;
                        adcaVar8.q = ((Boolean) obj2).booleanValue();
                        adcaVar8.u |= 32768;
                        return;
                    case 9:
                        adca adcaVar9 = (adca) obj;
                        adcaVar9.r = ((Boolean) obj2).booleanValue();
                        adcaVar9.u |= 65536;
                        return;
                    case 10:
                        adca adcaVar10 = (adca) obj;
                        adcaVar10.l = ((Boolean) obj2).booleanValue();
                        adcaVar10.u |= SemanticState.ReadOnly;
                        return;
                    case 11:
                        adca adcaVar11 = (adca) obj;
                        adcaVar11.s = ((Boolean) obj2).booleanValue();
                        adcaVar11.u |= 131072;
                        return;
                    case 12:
                        adca adcaVar12 = (adca) obj;
                        adcaVar12.t = ((Boolean) obj2).booleanValue();
                        adcaVar12.u |= 262144;
                        return;
                    case 13:
                        adca adcaVar13 = (adca) obj;
                        adcaVar13.j = ((Boolean) obj2).booleanValue();
                        adcaVar13.u |= SemanticState.Hidden;
                        return;
                    case 14:
                        adca adcaVar14 = (adca) obj;
                        adcaVar14.m = ((Boolean) obj2).booleanValue();
                        adcaVar14.u |= SemanticState.Modal;
                        return;
                    case 15:
                        adca adcaVar15 = (adca) obj;
                        adcaVar15.k = ((Float) obj2).floatValue();
                        adcaVar15.u |= SemanticState.LiveRegion;
                        return;
                    default:
                        adca adcaVar16 = (adca) obj;
                        adcaVar16.a = ((Boolean) obj2).booleanValue();
                        adcaVar16.u |= 1;
                        return;
                }
            }
        }, new adch() { // from class: adbw
            @Override // defpackage.adch
            public final Object a(Object obj) {
                switch (i7) {
                    case 0:
                        return Boolean.valueOf(((apjn) obj).j);
                    case 1:
                        return Boolean.valueOf(((apjn) obj).s);
                    case 2:
                        return Float.valueOf(((apjn) obj).t);
                    case 3:
                        return ((apjn) obj).u;
                    case 4:
                        return Float.valueOf(((apjn) obj).n);
                    case 5:
                        return Integer.valueOf(((apjn) obj).r);
                    case 6:
                        return Boolean.valueOf(((apjn) obj).q);
                    case 7:
                        return Float.valueOf(((apjn) obj).v);
                    case 8:
                        return Boolean.valueOf(((apjn) obj).w);
                    case 9:
                        return Boolean.valueOf(((apjn) obj).y);
                    case 10:
                        return Boolean.valueOf(((apjn) obj).z);
                    case 11:
                        return Boolean.valueOf(((apjn) obj).A);
                    case 12:
                        return Boolean.valueOf(((apjn) obj).l);
                    case 13:
                        return Boolean.valueOf(((apjn) obj).B);
                    case 14:
                        return Boolean.valueOf(((apjn) obj).o);
                    case 15:
                        return Boolean.valueOf(((apjn) obj).m);
                    default:
                        return Boolean.valueOf(((apjn) obj).x);
                }
            }
        }, new adci() { // from class: adby
            @Override // defpackage.adci
            public final boolean a(Object obj) {
                apjn apjnVar = (apjn) obj;
                switch (i7) {
                    case 0:
                        if ((apjnVar.d & 16777216) != 0) {
                            return true;
                        }
                        break;
                    case 1:
                        if ((apjnVar.d & 8388608) != 0) {
                            return true;
                        }
                        break;
                    case 2:
                        if ((apjnVar.d & 33554432) != 0) {
                            return true;
                        }
                        break;
                    case 3:
                        if ((apjnVar.b & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 4:
                        if ((apjnVar.d & 4194304) != 0) {
                            return true;
                        }
                        break;
                    case 5:
                        if ((apjnVar.d & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 6:
                        if ((apjnVar.d & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 7:
                        if ((apjnVar.c & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 8:
                        if ((apjnVar.d & 268435456) != 0) {
                            return true;
                        }
                        break;
                    case 9:
                        if ((apjnVar.e & 2) != 0) {
                            return true;
                        }
                        break;
                    case 10:
                        if ((apjnVar.e & 4) != 0) {
                            return true;
                        }
                        break;
                    case 11:
                        if ((apjnVar.e & 32) != 0) {
                            return true;
                        }
                        break;
                    case 12:
                        if ((apjnVar.e & SemanticState.Hidden) != 0) {
                            return true;
                        }
                        break;
                    case 13:
                        if ((apjnVar.c & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 14:
                        if ((apjnVar.c & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 15:
                        if ((apjnVar.c & 8388608) != 0) {
                            return true;
                        }
                        break;
                    default:
                        if ((apjnVar.d & 536870912) != 0) {
                            return true;
                        }
                        break;
                }
                return false;
            }
        }, (agex) null);
        Float fValueOf = Float.valueOf(0.45f);
        adcj adcjVar = new adcj() { // from class: adbx
            @Override // defpackage.adcj
            public final void a(Object obj, Object obj2) {
                switch (i7) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.b = ((Float) obj2).floatValue();
                        adcaVar.u |= 2;
                        return;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.h = ((Boolean) obj2).booleanValue();
                        adcaVar2.u |= 64;
                        return;
                    case 2:
                        String str = (String) obj2;
                        if (str == null) {
                            throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
                        }
                        ((adca) obj).c = str;
                        return;
                    case 3:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.d = ((Integer) obj2).intValue();
                        adcaVar3.u |= 4;
                        return;
                    case 4:
                        adca adcaVar4 = (adca) obj;
                        adcaVar4.n = ((Boolean) obj2).booleanValue();
                        adcaVar4.u |= SemanticState.Obscured;
                        return;
                    case 5:
                        adca adcaVar5 = (adca) obj;
                        adcaVar5.o = ((Float) obj2).floatValue();
                        adcaVar5.u |= SemanticState.Multiline;
                        return;
                    case 6:
                        adca adcaVar6 = (adca) obj;
                        adcaVar6.p = ((Boolean) obj2).booleanValue();
                        adcaVar6.u |= 16384;
                        return;
                    case 7:
                        adca adcaVar7 = (adca) obj;
                        adcaVar7.i = ((Boolean) obj2).booleanValue();
                        adcaVar7.u |= SemanticState.Focused;
                        return;
                    case 8:
                        adca adcaVar8 = (adca) obj;
                        adcaVar8.q = ((Boolean) obj2).booleanValue();
                        adcaVar8.u |= 32768;
                        return;
                    case 9:
                        adca adcaVar9 = (adca) obj;
                        adcaVar9.r = ((Boolean) obj2).booleanValue();
                        adcaVar9.u |= 65536;
                        return;
                    case 10:
                        adca adcaVar10 = (adca) obj;
                        adcaVar10.l = ((Boolean) obj2).booleanValue();
                        adcaVar10.u |= SemanticState.ReadOnly;
                        return;
                    case 11:
                        adca adcaVar11 = (adca) obj;
                        adcaVar11.s = ((Boolean) obj2).booleanValue();
                        adcaVar11.u |= 131072;
                        return;
                    case 12:
                        adca adcaVar12 = (adca) obj;
                        adcaVar12.t = ((Boolean) obj2).booleanValue();
                        adcaVar12.u |= 262144;
                        return;
                    case 13:
                        adca adcaVar13 = (adca) obj;
                        adcaVar13.j = ((Boolean) obj2).booleanValue();
                        adcaVar13.u |= SemanticState.Hidden;
                        return;
                    case 14:
                        adca adcaVar14 = (adca) obj;
                        adcaVar14.m = ((Boolean) obj2).booleanValue();
                        adcaVar14.u |= SemanticState.Modal;
                        return;
                    case 15:
                        adca adcaVar15 = (adca) obj;
                        adcaVar15.k = ((Float) obj2).floatValue();
                        adcaVar15.u |= SemanticState.LiveRegion;
                        return;
                    default:
                        adca adcaVar16 = (adca) obj;
                        adcaVar16.a = ((Boolean) obj2).booleanValue();
                        adcaVar16.u |= 1;
                        return;
                }
            }
        };
        final int i8 = 4;
        axfd axfdVar4 = new axfd((Object) fValueOf, adcjVar, new adch() { // from class: adbw
            @Override // defpackage.adch
            public final Object a(Object obj) {
                switch (i8) {
                    case 0:
                        return Boolean.valueOf(((apjn) obj).j);
                    case 1:
                        return Boolean.valueOf(((apjn) obj).s);
                    case 2:
                        return Float.valueOf(((apjn) obj).t);
                    case 3:
                        return ((apjn) obj).u;
                    case 4:
                        return Float.valueOf(((apjn) obj).n);
                    case 5:
                        return Integer.valueOf(((apjn) obj).r);
                    case 6:
                        return Boolean.valueOf(((apjn) obj).q);
                    case 7:
                        return Float.valueOf(((apjn) obj).v);
                    case 8:
                        return Boolean.valueOf(((apjn) obj).w);
                    case 9:
                        return Boolean.valueOf(((apjn) obj).y);
                    case 10:
                        return Boolean.valueOf(((apjn) obj).z);
                    case 11:
                        return Boolean.valueOf(((apjn) obj).A);
                    case 12:
                        return Boolean.valueOf(((apjn) obj).l);
                    case 13:
                        return Boolean.valueOf(((apjn) obj).B);
                    case 14:
                        return Boolean.valueOf(((apjn) obj).o);
                    case 15:
                        return Boolean.valueOf(((apjn) obj).m);
                    default:
                        return Boolean.valueOf(((apjn) obj).x);
                }
            }
        }, new adci() { // from class: adby
            @Override // defpackage.adci
            public final boolean a(Object obj) {
                apjn apjnVar = (apjn) obj;
                switch (i4) {
                    case 0:
                        if ((apjnVar.d & 16777216) != 0) {
                            return true;
                        }
                        break;
                    case 1:
                        if ((apjnVar.d & 8388608) != 0) {
                            return true;
                        }
                        break;
                    case 2:
                        if ((apjnVar.d & 33554432) != 0) {
                            return true;
                        }
                        break;
                    case 3:
                        if ((apjnVar.b & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 4:
                        if ((apjnVar.d & 4194304) != 0) {
                            return true;
                        }
                        break;
                    case 5:
                        if ((apjnVar.d & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 6:
                        if ((apjnVar.d & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 7:
                        if ((apjnVar.c & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 8:
                        if ((apjnVar.d & 268435456) != 0) {
                            return true;
                        }
                        break;
                    case 9:
                        if ((apjnVar.e & 2) != 0) {
                            return true;
                        }
                        break;
                    case 10:
                        if ((apjnVar.e & 4) != 0) {
                            return true;
                        }
                        break;
                    case 11:
                        if ((apjnVar.e & 32) != 0) {
                            return true;
                        }
                        break;
                    case 12:
                        if ((apjnVar.e & SemanticState.Hidden) != 0) {
                            return true;
                        }
                        break;
                    case 13:
                        if ((apjnVar.c & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 14:
                        if ((apjnVar.c & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 15:
                        if ((apjnVar.c & 8388608) != 0) {
                            return true;
                        }
                        break;
                    default:
                        if ((apjnVar.d & 536870912) != 0) {
                            return true;
                        }
                        break;
                }
                return false;
            }
        }, (agex) null);
        final int i9 = 10;
        final int i10 = 14;
        axfd axfdVar5 = new axfd((Object) bool, new adcj() { // from class: adbx
            @Override // defpackage.adcj
            public final void a(Object obj, Object obj2) {
                switch (i9) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.b = ((Float) obj2).floatValue();
                        adcaVar.u |= 2;
                        return;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.h = ((Boolean) obj2).booleanValue();
                        adcaVar2.u |= 64;
                        return;
                    case 2:
                        String str = (String) obj2;
                        if (str == null) {
                            throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
                        }
                        ((adca) obj).c = str;
                        return;
                    case 3:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.d = ((Integer) obj2).intValue();
                        adcaVar3.u |= 4;
                        return;
                    case 4:
                        adca adcaVar4 = (adca) obj;
                        adcaVar4.n = ((Boolean) obj2).booleanValue();
                        adcaVar4.u |= SemanticState.Obscured;
                        return;
                    case 5:
                        adca adcaVar5 = (adca) obj;
                        adcaVar5.o = ((Float) obj2).floatValue();
                        adcaVar5.u |= SemanticState.Multiline;
                        return;
                    case 6:
                        adca adcaVar6 = (adca) obj;
                        adcaVar6.p = ((Boolean) obj2).booleanValue();
                        adcaVar6.u |= 16384;
                        return;
                    case 7:
                        adca adcaVar7 = (adca) obj;
                        adcaVar7.i = ((Boolean) obj2).booleanValue();
                        adcaVar7.u |= SemanticState.Focused;
                        return;
                    case 8:
                        adca adcaVar8 = (adca) obj;
                        adcaVar8.q = ((Boolean) obj2).booleanValue();
                        adcaVar8.u |= 32768;
                        return;
                    case 9:
                        adca adcaVar9 = (adca) obj;
                        adcaVar9.r = ((Boolean) obj2).booleanValue();
                        adcaVar9.u |= 65536;
                        return;
                    case 10:
                        adca adcaVar10 = (adca) obj;
                        adcaVar10.l = ((Boolean) obj2).booleanValue();
                        adcaVar10.u |= SemanticState.ReadOnly;
                        return;
                    case 11:
                        adca adcaVar11 = (adca) obj;
                        adcaVar11.s = ((Boolean) obj2).booleanValue();
                        adcaVar11.u |= 131072;
                        return;
                    case 12:
                        adca adcaVar12 = (adca) obj;
                        adcaVar12.t = ((Boolean) obj2).booleanValue();
                        adcaVar12.u |= 262144;
                        return;
                    case 13:
                        adca adcaVar13 = (adca) obj;
                        adcaVar13.j = ((Boolean) obj2).booleanValue();
                        adcaVar13.u |= SemanticState.Hidden;
                        return;
                    case 14:
                        adca adcaVar14 = (adca) obj;
                        adcaVar14.m = ((Boolean) obj2).booleanValue();
                        adcaVar14.u |= SemanticState.Modal;
                        return;
                    case 15:
                        adca adcaVar15 = (adca) obj;
                        adcaVar15.k = ((Float) obj2).floatValue();
                        adcaVar15.u |= SemanticState.LiveRegion;
                        return;
                    default:
                        adca adcaVar16 = (adca) obj;
                        adcaVar16.a = ((Boolean) obj2).booleanValue();
                        adcaVar16.u |= 1;
                        return;
                }
            }
        }, new adch() { // from class: adbw
            @Override // defpackage.adch
            public final Object a(Object obj) {
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(((apjn) obj).j);
                    case 1:
                        return Boolean.valueOf(((apjn) obj).s);
                    case 2:
                        return Float.valueOf(((apjn) obj).t);
                    case 3:
                        return ((apjn) obj).u;
                    case 4:
                        return Float.valueOf(((apjn) obj).n);
                    case 5:
                        return Integer.valueOf(((apjn) obj).r);
                    case 6:
                        return Boolean.valueOf(((apjn) obj).q);
                    case 7:
                        return Float.valueOf(((apjn) obj).v);
                    case 8:
                        return Boolean.valueOf(((apjn) obj).w);
                    case 9:
                        return Boolean.valueOf(((apjn) obj).y);
                    case 10:
                        return Boolean.valueOf(((apjn) obj).z);
                    case 11:
                        return Boolean.valueOf(((apjn) obj).A);
                    case 12:
                        return Boolean.valueOf(((apjn) obj).l);
                    case 13:
                        return Boolean.valueOf(((apjn) obj).B);
                    case 14:
                        return Boolean.valueOf(((apjn) obj).o);
                    case 15:
                        return Boolean.valueOf(((apjn) obj).m);
                    default:
                        return Boolean.valueOf(((apjn) obj).x);
                }
            }
        }, new adci() { // from class: adby
            @Override // defpackage.adci
            public final boolean a(Object obj) {
                apjn apjnVar = (apjn) obj;
                switch (i10) {
                    case 0:
                        if ((apjnVar.d & 16777216) != 0) {
                            return true;
                        }
                        break;
                    case 1:
                        if ((apjnVar.d & 8388608) != 0) {
                            return true;
                        }
                        break;
                    case 2:
                        if ((apjnVar.d & 33554432) != 0) {
                            return true;
                        }
                        break;
                    case 3:
                        if ((apjnVar.b & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 4:
                        if ((apjnVar.d & 4194304) != 0) {
                            return true;
                        }
                        break;
                    case 5:
                        if ((apjnVar.d & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 6:
                        if ((apjnVar.d & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 7:
                        if ((apjnVar.c & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 8:
                        if ((apjnVar.d & 268435456) != 0) {
                            return true;
                        }
                        break;
                    case 9:
                        if ((apjnVar.e & 2) != 0) {
                            return true;
                        }
                        break;
                    case 10:
                        if ((apjnVar.e & 4) != 0) {
                            return true;
                        }
                        break;
                    case 11:
                        if ((apjnVar.e & 32) != 0) {
                            return true;
                        }
                        break;
                    case 12:
                        if ((apjnVar.e & SemanticState.Hidden) != 0) {
                            return true;
                        }
                        break;
                    case 13:
                        if ((apjnVar.c & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 14:
                        if ((apjnVar.c & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 15:
                        if ((apjnVar.c & 8388608) != 0) {
                            return true;
                        }
                        break;
                    default:
                        if ((apjnVar.d & 536870912) != 0) {
                            return true;
                        }
                        break;
                }
                return false;
            }
        }, (agex) null);
        final int i11 = 16;
        axfd axfdVar6 = new axfd((Object) bool, new adcj() { // from class: adbx
            @Override // defpackage.adcj
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.b = ((Float) obj2).floatValue();
                        adcaVar.u |= 2;
                        return;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.h = ((Boolean) obj2).booleanValue();
                        adcaVar2.u |= 64;
                        return;
                    case 2:
                        String str = (String) obj2;
                        if (str == null) {
                            throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
                        }
                        ((adca) obj).c = str;
                        return;
                    case 3:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.d = ((Integer) obj2).intValue();
                        adcaVar3.u |= 4;
                        return;
                    case 4:
                        adca adcaVar4 = (adca) obj;
                        adcaVar4.n = ((Boolean) obj2).booleanValue();
                        adcaVar4.u |= SemanticState.Obscured;
                        return;
                    case 5:
                        adca adcaVar5 = (adca) obj;
                        adcaVar5.o = ((Float) obj2).floatValue();
                        adcaVar5.u |= SemanticState.Multiline;
                        return;
                    case 6:
                        adca adcaVar6 = (adca) obj;
                        adcaVar6.p = ((Boolean) obj2).booleanValue();
                        adcaVar6.u |= 16384;
                        return;
                    case 7:
                        adca adcaVar7 = (adca) obj;
                        adcaVar7.i = ((Boolean) obj2).booleanValue();
                        adcaVar7.u |= SemanticState.Focused;
                        return;
                    case 8:
                        adca adcaVar8 = (adca) obj;
                        adcaVar8.q = ((Boolean) obj2).booleanValue();
                        adcaVar8.u |= 32768;
                        return;
                    case 9:
                        adca adcaVar9 = (adca) obj;
                        adcaVar9.r = ((Boolean) obj2).booleanValue();
                        adcaVar9.u |= 65536;
                        return;
                    case 10:
                        adca adcaVar10 = (adca) obj;
                        adcaVar10.l = ((Boolean) obj2).booleanValue();
                        adcaVar10.u |= SemanticState.ReadOnly;
                        return;
                    case 11:
                        adca adcaVar11 = (adca) obj;
                        adcaVar11.s = ((Boolean) obj2).booleanValue();
                        adcaVar11.u |= 131072;
                        return;
                    case 12:
                        adca adcaVar12 = (adca) obj;
                        adcaVar12.t = ((Boolean) obj2).booleanValue();
                        adcaVar12.u |= 262144;
                        return;
                    case 13:
                        adca adcaVar13 = (adca) obj;
                        adcaVar13.j = ((Boolean) obj2).booleanValue();
                        adcaVar13.u |= SemanticState.Hidden;
                        return;
                    case 14:
                        adca adcaVar14 = (adca) obj;
                        adcaVar14.m = ((Boolean) obj2).booleanValue();
                        adcaVar14.u |= SemanticState.Modal;
                        return;
                    case 15:
                        adca adcaVar15 = (adca) obj;
                        adcaVar15.k = ((Float) obj2).floatValue();
                        adcaVar15.u |= SemanticState.LiveRegion;
                        return;
                    default:
                        adca adcaVar16 = (adca) obj;
                        adcaVar16.a = ((Boolean) obj2).booleanValue();
                        adcaVar16.u |= 1;
                        return;
                }
            }
        }, new adch() { // from class: adbw
            @Override // defpackage.adch
            public final Object a(Object obj) {
                switch (i11) {
                    case 0:
                        return Boolean.valueOf(((apjn) obj).j);
                    case 1:
                        return Boolean.valueOf(((apjn) obj).s);
                    case 2:
                        return Float.valueOf(((apjn) obj).t);
                    case 3:
                        return ((apjn) obj).u;
                    case 4:
                        return Float.valueOf(((apjn) obj).n);
                    case 5:
                        return Integer.valueOf(((apjn) obj).r);
                    case 6:
                        return Boolean.valueOf(((apjn) obj).q);
                    case 7:
                        return Float.valueOf(((apjn) obj).v);
                    case 8:
                        return Boolean.valueOf(((apjn) obj).w);
                    case 9:
                        return Boolean.valueOf(((apjn) obj).y);
                    case 10:
                        return Boolean.valueOf(((apjn) obj).z);
                    case 11:
                        return Boolean.valueOf(((apjn) obj).A);
                    case 12:
                        return Boolean.valueOf(((apjn) obj).l);
                    case 13:
                        return Boolean.valueOf(((apjn) obj).B);
                    case 14:
                        return Boolean.valueOf(((apjn) obj).o);
                    case 15:
                        return Boolean.valueOf(((apjn) obj).m);
                    default:
                        return Boolean.valueOf(((apjn) obj).x);
                }
            }
        }, new adci() { // from class: adby
            @Override // defpackage.adci
            public final boolean a(Object obj) {
                apjn apjnVar = (apjn) obj;
                switch (i11) {
                    case 0:
                        if ((apjnVar.d & 16777216) != 0) {
                            return true;
                        }
                        break;
                    case 1:
                        if ((apjnVar.d & 8388608) != 0) {
                            return true;
                        }
                        break;
                    case 2:
                        if ((apjnVar.d & 33554432) != 0) {
                            return true;
                        }
                        break;
                    case 3:
                        if ((apjnVar.b & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 4:
                        if ((apjnVar.d & 4194304) != 0) {
                            return true;
                        }
                        break;
                    case 5:
                        if ((apjnVar.d & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 6:
                        if ((apjnVar.d & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 7:
                        if ((apjnVar.c & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 8:
                        if ((apjnVar.d & 268435456) != 0) {
                            return true;
                        }
                        break;
                    case 9:
                        if ((apjnVar.e & 2) != 0) {
                            return true;
                        }
                        break;
                    case 10:
                        if ((apjnVar.e & 4) != 0) {
                            return true;
                        }
                        break;
                    case 11:
                        if ((apjnVar.e & 32) != 0) {
                            return true;
                        }
                        break;
                    case 12:
                        if ((apjnVar.e & SemanticState.Hidden) != 0) {
                            return true;
                        }
                        break;
                    case 13:
                        if ((apjnVar.c & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 14:
                        if ((apjnVar.c & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 15:
                        if ((apjnVar.c & 8388608) != 0) {
                            return true;
                        }
                        break;
                    default:
                        if ((apjnVar.d & 536870912) != 0) {
                            return true;
                        }
                        break;
                }
                return false;
            }
        }, (agex) null);
        axfd axfdVar7 = new axfd((Object) bool, new adcj() { // from class: adbx
            @Override // defpackage.adcj
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.b = ((Float) obj2).floatValue();
                        adcaVar.u |= 2;
                        return;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.h = ((Boolean) obj2).booleanValue();
                        adcaVar2.u |= 64;
                        return;
                    case 2:
                        String str = (String) obj2;
                        if (str == null) {
                            throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
                        }
                        ((adca) obj).c = str;
                        return;
                    case 3:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.d = ((Integer) obj2).intValue();
                        adcaVar3.u |= 4;
                        return;
                    case 4:
                        adca adcaVar4 = (adca) obj;
                        adcaVar4.n = ((Boolean) obj2).booleanValue();
                        adcaVar4.u |= SemanticState.Obscured;
                        return;
                    case 5:
                        adca adcaVar5 = (adca) obj;
                        adcaVar5.o = ((Float) obj2).floatValue();
                        adcaVar5.u |= SemanticState.Multiline;
                        return;
                    case 6:
                        adca adcaVar6 = (adca) obj;
                        adcaVar6.p = ((Boolean) obj2).booleanValue();
                        adcaVar6.u |= 16384;
                        return;
                    case 7:
                        adca adcaVar7 = (adca) obj;
                        adcaVar7.i = ((Boolean) obj2).booleanValue();
                        adcaVar7.u |= SemanticState.Focused;
                        return;
                    case 8:
                        adca adcaVar8 = (adca) obj;
                        adcaVar8.q = ((Boolean) obj2).booleanValue();
                        adcaVar8.u |= 32768;
                        return;
                    case 9:
                        adca adcaVar9 = (adca) obj;
                        adcaVar9.r = ((Boolean) obj2).booleanValue();
                        adcaVar9.u |= 65536;
                        return;
                    case 10:
                        adca adcaVar10 = (adca) obj;
                        adcaVar10.l = ((Boolean) obj2).booleanValue();
                        adcaVar10.u |= SemanticState.ReadOnly;
                        return;
                    case 11:
                        adca adcaVar11 = (adca) obj;
                        adcaVar11.s = ((Boolean) obj2).booleanValue();
                        adcaVar11.u |= 131072;
                        return;
                    case 12:
                        adca adcaVar12 = (adca) obj;
                        adcaVar12.t = ((Boolean) obj2).booleanValue();
                        adcaVar12.u |= 262144;
                        return;
                    case 13:
                        adca adcaVar13 = (adca) obj;
                        adcaVar13.j = ((Boolean) obj2).booleanValue();
                        adcaVar13.u |= SemanticState.Hidden;
                        return;
                    case 14:
                        adca adcaVar14 = (adca) obj;
                        adcaVar14.m = ((Boolean) obj2).booleanValue();
                        adcaVar14.u |= SemanticState.Modal;
                        return;
                    case 15:
                        adca adcaVar15 = (adca) obj;
                        adcaVar15.k = ((Float) obj2).floatValue();
                        adcaVar15.u |= SemanticState.LiveRegion;
                        return;
                    default:
                        adca adcaVar16 = (adca) obj;
                        adcaVar16.a = ((Boolean) obj2).booleanValue();
                        adcaVar16.u |= 1;
                        return;
                }
            }
        }, new adch() { // from class: adbw
            @Override // defpackage.adch
            public final Object a(Object obj) {
                switch (i) {
                    case 0:
                        return Boolean.valueOf(((apjn) obj).j);
                    case 1:
                        return Boolean.valueOf(((apjn) obj).s);
                    case 2:
                        return Float.valueOf(((apjn) obj).t);
                    case 3:
                        return ((apjn) obj).u;
                    case 4:
                        return Float.valueOf(((apjn) obj).n);
                    case 5:
                        return Integer.valueOf(((apjn) obj).r);
                    case 6:
                        return Boolean.valueOf(((apjn) obj).q);
                    case 7:
                        return Float.valueOf(((apjn) obj).v);
                    case 8:
                        return Boolean.valueOf(((apjn) obj).w);
                    case 9:
                        return Boolean.valueOf(((apjn) obj).y);
                    case 10:
                        return Boolean.valueOf(((apjn) obj).z);
                    case 11:
                        return Boolean.valueOf(((apjn) obj).A);
                    case 12:
                        return Boolean.valueOf(((apjn) obj).l);
                    case 13:
                        return Boolean.valueOf(((apjn) obj).B);
                    case 14:
                        return Boolean.valueOf(((apjn) obj).o);
                    case 15:
                        return Boolean.valueOf(((apjn) obj).m);
                    default:
                        return Boolean.valueOf(((apjn) obj).x);
                }
            }
        }, new adci() { // from class: adby
            @Override // defpackage.adci
            public final boolean a(Object obj) {
                apjn apjnVar = (apjn) obj;
                switch (i) {
                    case 0:
                        if ((apjnVar.d & 16777216) != 0) {
                            return true;
                        }
                        break;
                    case 1:
                        if ((apjnVar.d & 8388608) != 0) {
                            return true;
                        }
                        break;
                    case 2:
                        if ((apjnVar.d & 33554432) != 0) {
                            return true;
                        }
                        break;
                    case 3:
                        if ((apjnVar.b & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 4:
                        if ((apjnVar.d & 4194304) != 0) {
                            return true;
                        }
                        break;
                    case 5:
                        if ((apjnVar.d & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 6:
                        if ((apjnVar.d & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 7:
                        if ((apjnVar.c & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 8:
                        if ((apjnVar.d & 268435456) != 0) {
                            return true;
                        }
                        break;
                    case 9:
                        if ((apjnVar.e & 2) != 0) {
                            return true;
                        }
                        break;
                    case 10:
                        if ((apjnVar.e & 4) != 0) {
                            return true;
                        }
                        break;
                    case 11:
                        if ((apjnVar.e & 32) != 0) {
                            return true;
                        }
                        break;
                    case 12:
                        if ((apjnVar.e & SemanticState.Hidden) != 0) {
                            return true;
                        }
                        break;
                    case 13:
                        if ((apjnVar.c & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 14:
                        if ((apjnVar.c & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 15:
                        if ((apjnVar.c & 8388608) != 0) {
                            return true;
                        }
                        break;
                    default:
                        if ((apjnVar.d & 536870912) != 0) {
                            return true;
                        }
                        break;
                }
                return false;
            }
        }, (agex) null);
        Float fValueOf2 = Float.valueOf(0.0f);
        adcj adcjVar2 = new adcj() { // from class: adbx
            @Override // defpackage.adcj
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.b = ((Float) obj2).floatValue();
                        adcaVar.u |= 2;
                        return;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.h = ((Boolean) obj2).booleanValue();
                        adcaVar2.u |= 64;
                        return;
                    case 2:
                        String str = (String) obj2;
                        if (str == null) {
                            throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
                        }
                        ((adca) obj).c = str;
                        return;
                    case 3:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.d = ((Integer) obj2).intValue();
                        adcaVar3.u |= 4;
                        return;
                    case 4:
                        adca adcaVar4 = (adca) obj;
                        adcaVar4.n = ((Boolean) obj2).booleanValue();
                        adcaVar4.u |= SemanticState.Obscured;
                        return;
                    case 5:
                        adca adcaVar5 = (adca) obj;
                        adcaVar5.o = ((Float) obj2).floatValue();
                        adcaVar5.u |= SemanticState.Multiline;
                        return;
                    case 6:
                        adca adcaVar6 = (adca) obj;
                        adcaVar6.p = ((Boolean) obj2).booleanValue();
                        adcaVar6.u |= 16384;
                        return;
                    case 7:
                        adca adcaVar7 = (adca) obj;
                        adcaVar7.i = ((Boolean) obj2).booleanValue();
                        adcaVar7.u |= SemanticState.Focused;
                        return;
                    case 8:
                        adca adcaVar8 = (adca) obj;
                        adcaVar8.q = ((Boolean) obj2).booleanValue();
                        adcaVar8.u |= 32768;
                        return;
                    case 9:
                        adca adcaVar9 = (adca) obj;
                        adcaVar9.r = ((Boolean) obj2).booleanValue();
                        adcaVar9.u |= 65536;
                        return;
                    case 10:
                        adca adcaVar10 = (adca) obj;
                        adcaVar10.l = ((Boolean) obj2).booleanValue();
                        adcaVar10.u |= SemanticState.ReadOnly;
                        return;
                    case 11:
                        adca adcaVar11 = (adca) obj;
                        adcaVar11.s = ((Boolean) obj2).booleanValue();
                        adcaVar11.u |= 131072;
                        return;
                    case 12:
                        adca adcaVar12 = (adca) obj;
                        adcaVar12.t = ((Boolean) obj2).booleanValue();
                        adcaVar12.u |= 262144;
                        return;
                    case 13:
                        adca adcaVar13 = (adca) obj;
                        adcaVar13.j = ((Boolean) obj2).booleanValue();
                        adcaVar13.u |= SemanticState.Hidden;
                        return;
                    case 14:
                        adca adcaVar14 = (adca) obj;
                        adcaVar14.m = ((Boolean) obj2).booleanValue();
                        adcaVar14.u |= SemanticState.Modal;
                        return;
                    case 15:
                        adca adcaVar15 = (adca) obj;
                        adcaVar15.k = ((Float) obj2).floatValue();
                        adcaVar15.u |= SemanticState.LiveRegion;
                        return;
                    default:
                        adca adcaVar16 = (adca) obj;
                        adcaVar16.a = ((Boolean) obj2).booleanValue();
                        adcaVar16.u |= 1;
                        return;
                }
            }
        };
        final int i12 = 2;
        adch adchVar = new adch() { // from class: adbw
            @Override // defpackage.adch
            public final Object a(Object obj) {
                switch (i12) {
                    case 0:
                        return Boolean.valueOf(((apjn) obj).j);
                    case 1:
                        return Boolean.valueOf(((apjn) obj).s);
                    case 2:
                        return Float.valueOf(((apjn) obj).t);
                    case 3:
                        return ((apjn) obj).u;
                    case 4:
                        return Float.valueOf(((apjn) obj).n);
                    case 5:
                        return Integer.valueOf(((apjn) obj).r);
                    case 6:
                        return Boolean.valueOf(((apjn) obj).q);
                    case 7:
                        return Float.valueOf(((apjn) obj).v);
                    case 8:
                        return Boolean.valueOf(((apjn) obj).w);
                    case 9:
                        return Boolean.valueOf(((apjn) obj).y);
                    case 10:
                        return Boolean.valueOf(((apjn) obj).z);
                    case 11:
                        return Boolean.valueOf(((apjn) obj).A);
                    case 12:
                        return Boolean.valueOf(((apjn) obj).l);
                    case 13:
                        return Boolean.valueOf(((apjn) obj).B);
                    case 14:
                        return Boolean.valueOf(((apjn) obj).o);
                    case 15:
                        return Boolean.valueOf(((apjn) obj).m);
                    default:
                        return Boolean.valueOf(((apjn) obj).x);
                }
            }
        };
        adci adciVar = new adci() { // from class: adby
            @Override // defpackage.adci
            public final boolean a(Object obj) {
                apjn apjnVar = (apjn) obj;
                switch (i2) {
                    case 0:
                        if ((apjnVar.d & 16777216) != 0) {
                            return true;
                        }
                        break;
                    case 1:
                        if ((apjnVar.d & 8388608) != 0) {
                            return true;
                        }
                        break;
                    case 2:
                        if ((apjnVar.d & 33554432) != 0) {
                            return true;
                        }
                        break;
                    case 3:
                        if ((apjnVar.b & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 4:
                        if ((apjnVar.d & 4194304) != 0) {
                            return true;
                        }
                        break;
                    case 5:
                        if ((apjnVar.d & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 6:
                        if ((apjnVar.d & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 7:
                        if ((apjnVar.c & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 8:
                        if ((apjnVar.d & 268435456) != 0) {
                            return true;
                        }
                        break;
                    case 9:
                        if ((apjnVar.e & 2) != 0) {
                            return true;
                        }
                        break;
                    case 10:
                        if ((apjnVar.e & 4) != 0) {
                            return true;
                        }
                        break;
                    case 11:
                        if ((apjnVar.e & 32) != 0) {
                            return true;
                        }
                        break;
                    case 12:
                        if ((apjnVar.e & SemanticState.Hidden) != 0) {
                            return true;
                        }
                        break;
                    case 13:
                        if ((apjnVar.c & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 14:
                        if ((apjnVar.c & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 15:
                        if ((apjnVar.c & 8388608) != 0) {
                            return true;
                        }
                        break;
                    default:
                        if ((apjnVar.d & 536870912) != 0) {
                            return true;
                        }
                        break;
                }
                return false;
            }
        };
        final int i13 = 9;
        axfd axfdVar8 = new axfd((Object) fValueOf2, adcjVar2, adchVar, adciVar, (agex) new idn(i13));
        axfd axfdVar9 = new axfd((Object) "{\"NativeLibLoading\":0.1,\"PbToFb\":0.0,\"FirstRootPreparation\":0.002,\"NativeLibChecking\":0.025,\"FirstRootMeasurement\":0.002,\"TemplateResolution\":3.0E-4,\"FirstRootMaterialization\":0.002,\"TemplateFetching\":3.0E-4,\"ComponentMaterialization\":3.0E-4}", new adcj() { // from class: adbx
            @Override // defpackage.adcj
            public final void a(Object obj, Object obj2) {
                switch (i12) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.b = ((Float) obj2).floatValue();
                        adcaVar.u |= 2;
                        return;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.h = ((Boolean) obj2).booleanValue();
                        adcaVar2.u |= 64;
                        return;
                    case 2:
                        String str = (String) obj2;
                        if (str == null) {
                            throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
                        }
                        ((adca) obj).c = str;
                        return;
                    case 3:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.d = ((Integer) obj2).intValue();
                        adcaVar3.u |= 4;
                        return;
                    case 4:
                        adca adcaVar4 = (adca) obj;
                        adcaVar4.n = ((Boolean) obj2).booleanValue();
                        adcaVar4.u |= SemanticState.Obscured;
                        return;
                    case 5:
                        adca adcaVar5 = (adca) obj;
                        adcaVar5.o = ((Float) obj2).floatValue();
                        adcaVar5.u |= SemanticState.Multiline;
                        return;
                    case 6:
                        adca adcaVar6 = (adca) obj;
                        adcaVar6.p = ((Boolean) obj2).booleanValue();
                        adcaVar6.u |= 16384;
                        return;
                    case 7:
                        adca adcaVar7 = (adca) obj;
                        adcaVar7.i = ((Boolean) obj2).booleanValue();
                        adcaVar7.u |= SemanticState.Focused;
                        return;
                    case 8:
                        adca adcaVar8 = (adca) obj;
                        adcaVar8.q = ((Boolean) obj2).booleanValue();
                        adcaVar8.u |= 32768;
                        return;
                    case 9:
                        adca adcaVar9 = (adca) obj;
                        adcaVar9.r = ((Boolean) obj2).booleanValue();
                        adcaVar9.u |= 65536;
                        return;
                    case 10:
                        adca adcaVar10 = (adca) obj;
                        adcaVar10.l = ((Boolean) obj2).booleanValue();
                        adcaVar10.u |= SemanticState.ReadOnly;
                        return;
                    case 11:
                        adca adcaVar11 = (adca) obj;
                        adcaVar11.s = ((Boolean) obj2).booleanValue();
                        adcaVar11.u |= 131072;
                        return;
                    case 12:
                        adca adcaVar12 = (adca) obj;
                        adcaVar12.t = ((Boolean) obj2).booleanValue();
                        adcaVar12.u |= 262144;
                        return;
                    case 13:
                        adca adcaVar13 = (adca) obj;
                        adcaVar13.j = ((Boolean) obj2).booleanValue();
                        adcaVar13.u |= SemanticState.Hidden;
                        return;
                    case 14:
                        adca adcaVar14 = (adca) obj;
                        adcaVar14.m = ((Boolean) obj2).booleanValue();
                        adcaVar14.u |= SemanticState.Modal;
                        return;
                    case 15:
                        adca adcaVar15 = (adca) obj;
                        adcaVar15.k = ((Float) obj2).floatValue();
                        adcaVar15.u |= SemanticState.LiveRegion;
                        return;
                    default:
                        adca adcaVar16 = (adca) obj;
                        adcaVar16.a = ((Boolean) obj2).booleanValue();
                        adcaVar16.u |= 1;
                        return;
                }
            }
        }, new adch() { // from class: adbw
            @Override // defpackage.adch
            public final Object a(Object obj) {
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(((apjn) obj).j);
                    case 1:
                        return Boolean.valueOf(((apjn) obj).s);
                    case 2:
                        return Float.valueOf(((apjn) obj).t);
                    case 3:
                        return ((apjn) obj).u;
                    case 4:
                        return Float.valueOf(((apjn) obj).n);
                    case 5:
                        return Integer.valueOf(((apjn) obj).r);
                    case 6:
                        return Boolean.valueOf(((apjn) obj).q);
                    case 7:
                        return Float.valueOf(((apjn) obj).v);
                    case 8:
                        return Boolean.valueOf(((apjn) obj).w);
                    case 9:
                        return Boolean.valueOf(((apjn) obj).y);
                    case 10:
                        return Boolean.valueOf(((apjn) obj).z);
                    case 11:
                        return Boolean.valueOf(((apjn) obj).A);
                    case 12:
                        return Boolean.valueOf(((apjn) obj).l);
                    case 13:
                        return Boolean.valueOf(((apjn) obj).B);
                    case 14:
                        return Boolean.valueOf(((apjn) obj).o);
                    case 15:
                        return Boolean.valueOf(((apjn) obj).m);
                    default:
                        return Boolean.valueOf(((apjn) obj).x);
                }
            }
        }, new adci() { // from class: adby
            @Override // defpackage.adci
            public final boolean a(Object obj) {
                apjn apjnVar = (apjn) obj;
                switch (i12) {
                    case 0:
                        if ((apjnVar.d & 16777216) != 0) {
                            return true;
                        }
                        break;
                    case 1:
                        if ((apjnVar.d & 8388608) != 0) {
                            return true;
                        }
                        break;
                    case 2:
                        if ((apjnVar.d & 33554432) != 0) {
                            return true;
                        }
                        break;
                    case 3:
                        if ((apjnVar.b & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 4:
                        if ((apjnVar.d & 4194304) != 0) {
                            return true;
                        }
                        break;
                    case 5:
                        if ((apjnVar.d & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 6:
                        if ((apjnVar.d & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 7:
                        if ((apjnVar.c & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 8:
                        if ((apjnVar.d & 268435456) != 0) {
                            return true;
                        }
                        break;
                    case 9:
                        if ((apjnVar.e & 2) != 0) {
                            return true;
                        }
                        break;
                    case 10:
                        if ((apjnVar.e & 4) != 0) {
                            return true;
                        }
                        break;
                    case 11:
                        if ((apjnVar.e & 32) != 0) {
                            return true;
                        }
                        break;
                    case 12:
                        if ((apjnVar.e & SemanticState.Hidden) != 0) {
                            return true;
                        }
                        break;
                    case 13:
                        if ((apjnVar.c & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 14:
                        if ((apjnVar.c & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 15:
                        if ((apjnVar.c & 8388608) != 0) {
                            return true;
                        }
                        break;
                    default:
                        if ((apjnVar.d & 536870912) != 0) {
                            return true;
                        }
                        break;
                }
                return false;
            }
        }, (agex) null);
        final int i14 = 5;
        axfd axfdVar10 = new axfd((Object) 1, new adcj() { // from class: adbx
            @Override // defpackage.adcj
            public final void a(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.b = ((Float) obj2).floatValue();
                        adcaVar.u |= 2;
                        return;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.h = ((Boolean) obj2).booleanValue();
                        adcaVar2.u |= 64;
                        return;
                    case 2:
                        String str = (String) obj2;
                        if (str == null) {
                            throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
                        }
                        ((adca) obj).c = str;
                        return;
                    case 3:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.d = ((Integer) obj2).intValue();
                        adcaVar3.u |= 4;
                        return;
                    case 4:
                        adca adcaVar4 = (adca) obj;
                        adcaVar4.n = ((Boolean) obj2).booleanValue();
                        adcaVar4.u |= SemanticState.Obscured;
                        return;
                    case 5:
                        adca adcaVar5 = (adca) obj;
                        adcaVar5.o = ((Float) obj2).floatValue();
                        adcaVar5.u |= SemanticState.Multiline;
                        return;
                    case 6:
                        adca adcaVar6 = (adca) obj;
                        adcaVar6.p = ((Boolean) obj2).booleanValue();
                        adcaVar6.u |= 16384;
                        return;
                    case 7:
                        adca adcaVar7 = (adca) obj;
                        adcaVar7.i = ((Boolean) obj2).booleanValue();
                        adcaVar7.u |= SemanticState.Focused;
                        return;
                    case 8:
                        adca adcaVar8 = (adca) obj;
                        adcaVar8.q = ((Boolean) obj2).booleanValue();
                        adcaVar8.u |= 32768;
                        return;
                    case 9:
                        adca adcaVar9 = (adca) obj;
                        adcaVar9.r = ((Boolean) obj2).booleanValue();
                        adcaVar9.u |= 65536;
                        return;
                    case 10:
                        adca adcaVar10 = (adca) obj;
                        adcaVar10.l = ((Boolean) obj2).booleanValue();
                        adcaVar10.u |= SemanticState.ReadOnly;
                        return;
                    case 11:
                        adca adcaVar11 = (adca) obj;
                        adcaVar11.s = ((Boolean) obj2).booleanValue();
                        adcaVar11.u |= 131072;
                        return;
                    case 12:
                        adca adcaVar12 = (adca) obj;
                        adcaVar12.t = ((Boolean) obj2).booleanValue();
                        adcaVar12.u |= 262144;
                        return;
                    case 13:
                        adca adcaVar13 = (adca) obj;
                        adcaVar13.j = ((Boolean) obj2).booleanValue();
                        adcaVar13.u |= SemanticState.Hidden;
                        return;
                    case 14:
                        adca adcaVar14 = (adca) obj;
                        adcaVar14.m = ((Boolean) obj2).booleanValue();
                        adcaVar14.u |= SemanticState.Modal;
                        return;
                    case 15:
                        adca adcaVar15 = (adca) obj;
                        adcaVar15.k = ((Float) obj2).floatValue();
                        adcaVar15.u |= SemanticState.LiveRegion;
                        return;
                    default:
                        adca adcaVar16 = (adca) obj;
                        adcaVar16.a = ((Boolean) obj2).booleanValue();
                        adcaVar16.u |= 1;
                        return;
                }
            }
        }, new adch() { // from class: adbw
            @Override // defpackage.adch
            public final Object a(Object obj) {
                switch (i14) {
                    case 0:
                        return Boolean.valueOf(((apjn) obj).j);
                    case 1:
                        return Boolean.valueOf(((apjn) obj).s);
                    case 2:
                        return Float.valueOf(((apjn) obj).t);
                    case 3:
                        return ((apjn) obj).u;
                    case 4:
                        return Float.valueOf(((apjn) obj).n);
                    case 5:
                        return Integer.valueOf(((apjn) obj).r);
                    case 6:
                        return Boolean.valueOf(((apjn) obj).q);
                    case 7:
                        return Float.valueOf(((apjn) obj).v);
                    case 8:
                        return Boolean.valueOf(((apjn) obj).w);
                    case 9:
                        return Boolean.valueOf(((apjn) obj).y);
                    case 10:
                        return Boolean.valueOf(((apjn) obj).z);
                    case 11:
                        return Boolean.valueOf(((apjn) obj).A);
                    case 12:
                        return Boolean.valueOf(((apjn) obj).l);
                    case 13:
                        return Boolean.valueOf(((apjn) obj).B);
                    case 14:
                        return Boolean.valueOf(((apjn) obj).o);
                    case 15:
                        return Boolean.valueOf(((apjn) obj).m);
                    default:
                        return Boolean.valueOf(((apjn) obj).x);
                }
            }
        }, new adci() { // from class: adby
            @Override // defpackage.adci
            public final boolean a(Object obj) {
                apjn apjnVar = (apjn) obj;
                switch (i8) {
                    case 0:
                        if ((apjnVar.d & 16777216) != 0) {
                            return true;
                        }
                        break;
                    case 1:
                        if ((apjnVar.d & 8388608) != 0) {
                            return true;
                        }
                        break;
                    case 2:
                        if ((apjnVar.d & 33554432) != 0) {
                            return true;
                        }
                        break;
                    case 3:
                        if ((apjnVar.b & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 4:
                        if ((apjnVar.d & 4194304) != 0) {
                            return true;
                        }
                        break;
                    case 5:
                        if ((apjnVar.d & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 6:
                        if ((apjnVar.d & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 7:
                        if ((apjnVar.c & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 8:
                        if ((apjnVar.d & 268435456) != 0) {
                            return true;
                        }
                        break;
                    case 9:
                        if ((apjnVar.e & 2) != 0) {
                            return true;
                        }
                        break;
                    case 10:
                        if ((apjnVar.e & 4) != 0) {
                            return true;
                        }
                        break;
                    case 11:
                        if ((apjnVar.e & 32) != 0) {
                            return true;
                        }
                        break;
                    case 12:
                        if ((apjnVar.e & SemanticState.Hidden) != 0) {
                            return true;
                        }
                        break;
                    case 13:
                        if ((apjnVar.c & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 14:
                        if ((apjnVar.c & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 15:
                        if ((apjnVar.c & 8388608) != 0) {
                            return true;
                        }
                        break;
                    default:
                        if ((apjnVar.d & 536870912) != 0) {
                            return true;
                        }
                        break;
                }
                return false;
            }
        }, (agex) null);
        final int i15 = 6;
        final int i16 = 2;
        axfd axfdVar11 = new axfd((Object) bool, new adcj() { // from class: adbx
            @Override // defpackage.adcj
            public final void a(Object obj, Object obj2) {
                switch (i8) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.b = ((Float) obj2).floatValue();
                        adcaVar.u |= 2;
                        return;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.h = ((Boolean) obj2).booleanValue();
                        adcaVar2.u |= 64;
                        return;
                    case 2:
                        String str = (String) obj2;
                        if (str == null) {
                            throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
                        }
                        ((adca) obj).c = str;
                        return;
                    case 3:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.d = ((Integer) obj2).intValue();
                        adcaVar3.u |= 4;
                        return;
                    case 4:
                        adca adcaVar4 = (adca) obj;
                        adcaVar4.n = ((Boolean) obj2).booleanValue();
                        adcaVar4.u |= SemanticState.Obscured;
                        return;
                    case 5:
                        adca adcaVar5 = (adca) obj;
                        adcaVar5.o = ((Float) obj2).floatValue();
                        adcaVar5.u |= SemanticState.Multiline;
                        return;
                    case 6:
                        adca adcaVar6 = (adca) obj;
                        adcaVar6.p = ((Boolean) obj2).booleanValue();
                        adcaVar6.u |= 16384;
                        return;
                    case 7:
                        adca adcaVar7 = (adca) obj;
                        adcaVar7.i = ((Boolean) obj2).booleanValue();
                        adcaVar7.u |= SemanticState.Focused;
                        return;
                    case 8:
                        adca adcaVar8 = (adca) obj;
                        adcaVar8.q = ((Boolean) obj2).booleanValue();
                        adcaVar8.u |= 32768;
                        return;
                    case 9:
                        adca adcaVar9 = (adca) obj;
                        adcaVar9.r = ((Boolean) obj2).booleanValue();
                        adcaVar9.u |= 65536;
                        return;
                    case 10:
                        adca adcaVar10 = (adca) obj;
                        adcaVar10.l = ((Boolean) obj2).booleanValue();
                        adcaVar10.u |= SemanticState.ReadOnly;
                        return;
                    case 11:
                        adca adcaVar11 = (adca) obj;
                        adcaVar11.s = ((Boolean) obj2).booleanValue();
                        adcaVar11.u |= 131072;
                        return;
                    case 12:
                        adca adcaVar12 = (adca) obj;
                        adcaVar12.t = ((Boolean) obj2).booleanValue();
                        adcaVar12.u |= 262144;
                        return;
                    case 13:
                        adca adcaVar13 = (adca) obj;
                        adcaVar13.j = ((Boolean) obj2).booleanValue();
                        adcaVar13.u |= SemanticState.Hidden;
                        return;
                    case 14:
                        adca adcaVar14 = (adca) obj;
                        adcaVar14.m = ((Boolean) obj2).booleanValue();
                        adcaVar14.u |= SemanticState.Modal;
                        return;
                    case 15:
                        adca adcaVar15 = (adca) obj;
                        adcaVar15.k = ((Float) obj2).floatValue();
                        adcaVar15.u |= SemanticState.LiveRegion;
                        return;
                    default:
                        adca adcaVar16 = (adca) obj;
                        adcaVar16.a = ((Boolean) obj2).booleanValue();
                        adcaVar16.u |= 1;
                        return;
                }
            }
        }, new adch() { // from class: adbw
            @Override // defpackage.adch
            public final Object a(Object obj) {
                switch (i15) {
                    case 0:
                        return Boolean.valueOf(((apjn) obj).j);
                    case 1:
                        return Boolean.valueOf(((apjn) obj).s);
                    case 2:
                        return Float.valueOf(((apjn) obj).t);
                    case 3:
                        return ((apjn) obj).u;
                    case 4:
                        return Float.valueOf(((apjn) obj).n);
                    case 5:
                        return Integer.valueOf(((apjn) obj).r);
                    case 6:
                        return Boolean.valueOf(((apjn) obj).q);
                    case 7:
                        return Float.valueOf(((apjn) obj).v);
                    case 8:
                        return Boolean.valueOf(((apjn) obj).w);
                    case 9:
                        return Boolean.valueOf(((apjn) obj).y);
                    case 10:
                        return Boolean.valueOf(((apjn) obj).z);
                    case 11:
                        return Boolean.valueOf(((apjn) obj).A);
                    case 12:
                        return Boolean.valueOf(((apjn) obj).l);
                    case 13:
                        return Boolean.valueOf(((apjn) obj).B);
                    case 14:
                        return Boolean.valueOf(((apjn) obj).o);
                    case 15:
                        return Boolean.valueOf(((apjn) obj).m);
                    default:
                        return Boolean.valueOf(((apjn) obj).x);
                }
            }
        }, new adci() { // from class: adby
            @Override // defpackage.adci
            public final boolean a(Object obj) {
                apjn apjnVar = (apjn) obj;
                switch (i14) {
                    case 0:
                        if ((apjnVar.d & 16777216) != 0) {
                            return true;
                        }
                        break;
                    case 1:
                        if ((apjnVar.d & 8388608) != 0) {
                            return true;
                        }
                        break;
                    case 2:
                        if ((apjnVar.d & 33554432) != 0) {
                            return true;
                        }
                        break;
                    case 3:
                        if ((apjnVar.b & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 4:
                        if ((apjnVar.d & 4194304) != 0) {
                            return true;
                        }
                        break;
                    case 5:
                        if ((apjnVar.d & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 6:
                        if ((apjnVar.d & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 7:
                        if ((apjnVar.c & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 8:
                        if ((apjnVar.d & 268435456) != 0) {
                            return true;
                        }
                        break;
                    case 9:
                        if ((apjnVar.e & 2) != 0) {
                            return true;
                        }
                        break;
                    case 10:
                        if ((apjnVar.e & 4) != 0) {
                            return true;
                        }
                        break;
                    case 11:
                        if ((apjnVar.e & 32) != 0) {
                            return true;
                        }
                        break;
                    case 12:
                        if ((apjnVar.e & SemanticState.Hidden) != 0) {
                            return true;
                        }
                        break;
                    case 13:
                        if ((apjnVar.c & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 14:
                        if ((apjnVar.c & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 15:
                        if ((apjnVar.c & 8388608) != 0) {
                            return true;
                        }
                        break;
                    default:
                        if ((apjnVar.d & 536870912) != 0) {
                            return true;
                        }
                        break;
                }
                return false;
            }
        }, (agex) null);
        axfd axfdVar12 = new axfd((Object) fValueOf2, new adcj() { // from class: adbx
            @Override // defpackage.adcj
            public final void a(Object obj, Object obj2) {
                switch (i14) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.b = ((Float) obj2).floatValue();
                        adcaVar.u |= 2;
                        return;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.h = ((Boolean) obj2).booleanValue();
                        adcaVar2.u |= 64;
                        return;
                    case 2:
                        String str = (String) obj2;
                        if (str == null) {
                            throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
                        }
                        ((adca) obj).c = str;
                        return;
                    case 3:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.d = ((Integer) obj2).intValue();
                        adcaVar3.u |= 4;
                        return;
                    case 4:
                        adca adcaVar4 = (adca) obj;
                        adcaVar4.n = ((Boolean) obj2).booleanValue();
                        adcaVar4.u |= SemanticState.Obscured;
                        return;
                    case 5:
                        adca adcaVar5 = (adca) obj;
                        adcaVar5.o = ((Float) obj2).floatValue();
                        adcaVar5.u |= SemanticState.Multiline;
                        return;
                    case 6:
                        adca adcaVar6 = (adca) obj;
                        adcaVar6.p = ((Boolean) obj2).booleanValue();
                        adcaVar6.u |= 16384;
                        return;
                    case 7:
                        adca adcaVar7 = (adca) obj;
                        adcaVar7.i = ((Boolean) obj2).booleanValue();
                        adcaVar7.u |= SemanticState.Focused;
                        return;
                    case 8:
                        adca adcaVar8 = (adca) obj;
                        adcaVar8.q = ((Boolean) obj2).booleanValue();
                        adcaVar8.u |= 32768;
                        return;
                    case 9:
                        adca adcaVar9 = (adca) obj;
                        adcaVar9.r = ((Boolean) obj2).booleanValue();
                        adcaVar9.u |= 65536;
                        return;
                    case 10:
                        adca adcaVar10 = (adca) obj;
                        adcaVar10.l = ((Boolean) obj2).booleanValue();
                        adcaVar10.u |= SemanticState.ReadOnly;
                        return;
                    case 11:
                        adca adcaVar11 = (adca) obj;
                        adcaVar11.s = ((Boolean) obj2).booleanValue();
                        adcaVar11.u |= 131072;
                        return;
                    case 12:
                        adca adcaVar12 = (adca) obj;
                        adcaVar12.t = ((Boolean) obj2).booleanValue();
                        adcaVar12.u |= 262144;
                        return;
                    case 13:
                        adca adcaVar13 = (adca) obj;
                        adcaVar13.j = ((Boolean) obj2).booleanValue();
                        adcaVar13.u |= SemanticState.Hidden;
                        return;
                    case 14:
                        adca adcaVar14 = (adca) obj;
                        adcaVar14.m = ((Boolean) obj2).booleanValue();
                        adcaVar14.u |= SemanticState.Modal;
                        return;
                    case 15:
                        adca adcaVar15 = (adca) obj;
                        adcaVar15.k = ((Float) obj2).floatValue();
                        adcaVar15.u |= SemanticState.LiveRegion;
                        return;
                    default:
                        adca adcaVar16 = (adca) obj;
                        adcaVar16.a = ((Boolean) obj2).booleanValue();
                        adcaVar16.u |= 1;
                        return;
                }
            }
        }, new adch() { // from class: adbw
            @Override // defpackage.adch
            public final Object a(Object obj) {
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(((apjn) obj).j);
                    case 1:
                        return Boolean.valueOf(((apjn) obj).s);
                    case 2:
                        return Float.valueOf(((apjn) obj).t);
                    case 3:
                        return ((apjn) obj).u;
                    case 4:
                        return Float.valueOf(((apjn) obj).n);
                    case 5:
                        return Integer.valueOf(((apjn) obj).r);
                    case 6:
                        return Boolean.valueOf(((apjn) obj).q);
                    case 7:
                        return Float.valueOf(((apjn) obj).v);
                    case 8:
                        return Boolean.valueOf(((apjn) obj).w);
                    case 9:
                        return Boolean.valueOf(((apjn) obj).y);
                    case 10:
                        return Boolean.valueOf(((apjn) obj).z);
                    case 11:
                        return Boolean.valueOf(((apjn) obj).A);
                    case 12:
                        return Boolean.valueOf(((apjn) obj).l);
                    case 13:
                        return Boolean.valueOf(((apjn) obj).B);
                    case 14:
                        return Boolean.valueOf(((apjn) obj).o);
                    case 15:
                        return Boolean.valueOf(((apjn) obj).m);
                    default:
                        return Boolean.valueOf(((apjn) obj).x);
                }
            }
        }, new adci() { // from class: adby
            @Override // defpackage.adci
            public final boolean a(Object obj) {
                apjn apjnVar = (apjn) obj;
                switch (i15) {
                    case 0:
                        if ((apjnVar.d & 16777216) != 0) {
                            return true;
                        }
                        break;
                    case 1:
                        if ((apjnVar.d & 8388608) != 0) {
                            return true;
                        }
                        break;
                    case 2:
                        if ((apjnVar.d & 33554432) != 0) {
                            return true;
                        }
                        break;
                    case 3:
                        if ((apjnVar.b & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 4:
                        if ((apjnVar.d & 4194304) != 0) {
                            return true;
                        }
                        break;
                    case 5:
                        if ((apjnVar.d & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 6:
                        if ((apjnVar.d & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 7:
                        if ((apjnVar.c & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 8:
                        if ((apjnVar.d & 268435456) != 0) {
                            return true;
                        }
                        break;
                    case 9:
                        if ((apjnVar.e & 2) != 0) {
                            return true;
                        }
                        break;
                    case 10:
                        if ((apjnVar.e & 4) != 0) {
                            return true;
                        }
                        break;
                    case 11:
                        if ((apjnVar.e & 32) != 0) {
                            return true;
                        }
                        break;
                    case 12:
                        if ((apjnVar.e & SemanticState.Hidden) != 0) {
                            return true;
                        }
                        break;
                    case 13:
                        if ((apjnVar.c & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 14:
                        if ((apjnVar.c & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 15:
                        if ((apjnVar.c & 8388608) != 0) {
                            return true;
                        }
                        break;
                    default:
                        if ((apjnVar.d & 536870912) != 0) {
                            return true;
                        }
                        break;
                }
                return false;
            }
        }, (agex) null);
        final int i17 = 8;
        final int i18 = 11;
        final int i19 = 12;
        final int i20 = 13;
        k = agke.A(axfdVar, axfdVar2, axfdVar3, axfdVar4, axfdVar5, axfdVar6, axfdVar7, axfdVar8, axfdVar9, axfdVar10, axfdVar11, axfdVar12, new axfd((Object) bool, new adcj() { // from class: adbx
            @Override // defpackage.adcj
            public final void a(Object obj, Object obj2) {
                switch (i15) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.b = ((Float) obj2).floatValue();
                        adcaVar.u |= 2;
                        return;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.h = ((Boolean) obj2).booleanValue();
                        adcaVar2.u |= 64;
                        return;
                    case 2:
                        String str = (String) obj2;
                        if (str == null) {
                            throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
                        }
                        ((adca) obj).c = str;
                        return;
                    case 3:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.d = ((Integer) obj2).intValue();
                        adcaVar3.u |= 4;
                        return;
                    case 4:
                        adca adcaVar4 = (adca) obj;
                        adcaVar4.n = ((Boolean) obj2).booleanValue();
                        adcaVar4.u |= SemanticState.Obscured;
                        return;
                    case 5:
                        adca adcaVar5 = (adca) obj;
                        adcaVar5.o = ((Float) obj2).floatValue();
                        adcaVar5.u |= SemanticState.Multiline;
                        return;
                    case 6:
                        adca adcaVar6 = (adca) obj;
                        adcaVar6.p = ((Boolean) obj2).booleanValue();
                        adcaVar6.u |= 16384;
                        return;
                    case 7:
                        adca adcaVar7 = (adca) obj;
                        adcaVar7.i = ((Boolean) obj2).booleanValue();
                        adcaVar7.u |= SemanticState.Focused;
                        return;
                    case 8:
                        adca adcaVar8 = (adca) obj;
                        adcaVar8.q = ((Boolean) obj2).booleanValue();
                        adcaVar8.u |= 32768;
                        return;
                    case 9:
                        adca adcaVar9 = (adca) obj;
                        adcaVar9.r = ((Boolean) obj2).booleanValue();
                        adcaVar9.u |= 65536;
                        return;
                    case 10:
                        adca adcaVar10 = (adca) obj;
                        adcaVar10.l = ((Boolean) obj2).booleanValue();
                        adcaVar10.u |= SemanticState.ReadOnly;
                        return;
                    case 11:
                        adca adcaVar11 = (adca) obj;
                        adcaVar11.s = ((Boolean) obj2).booleanValue();
                        adcaVar11.u |= 131072;
                        return;
                    case 12:
                        adca adcaVar12 = (adca) obj;
                        adcaVar12.t = ((Boolean) obj2).booleanValue();
                        adcaVar12.u |= 262144;
                        return;
                    case 13:
                        adca adcaVar13 = (adca) obj;
                        adcaVar13.j = ((Boolean) obj2).booleanValue();
                        adcaVar13.u |= SemanticState.Hidden;
                        return;
                    case 14:
                        adca adcaVar14 = (adca) obj;
                        adcaVar14.m = ((Boolean) obj2).booleanValue();
                        adcaVar14.u |= SemanticState.Modal;
                        return;
                    case 15:
                        adca adcaVar15 = (adca) obj;
                        adcaVar15.k = ((Float) obj2).floatValue();
                        adcaVar15.u |= SemanticState.LiveRegion;
                        return;
                    default:
                        adca adcaVar16 = (adca) obj;
                        adcaVar16.a = ((Boolean) obj2).booleanValue();
                        adcaVar16.u |= 1;
                        return;
                }
            }
        }, new adch() { // from class: adbw
            @Override // defpackage.adch
            public final Object a(Object obj) {
                switch (i17) {
                    case 0:
                        return Boolean.valueOf(((apjn) obj).j);
                    case 1:
                        return Boolean.valueOf(((apjn) obj).s);
                    case 2:
                        return Float.valueOf(((apjn) obj).t);
                    case 3:
                        return ((apjn) obj).u;
                    case 4:
                        return Float.valueOf(((apjn) obj).n);
                    case 5:
                        return Integer.valueOf(((apjn) obj).r);
                    case 6:
                        return Boolean.valueOf(((apjn) obj).q);
                    case 7:
                        return Float.valueOf(((apjn) obj).v);
                    case 8:
                        return Boolean.valueOf(((apjn) obj).w);
                    case 9:
                        return Boolean.valueOf(((apjn) obj).y);
                    case 10:
                        return Boolean.valueOf(((apjn) obj).z);
                    case 11:
                        return Boolean.valueOf(((apjn) obj).A);
                    case 12:
                        return Boolean.valueOf(((apjn) obj).l);
                    case 13:
                        return Boolean.valueOf(((apjn) obj).B);
                    case 14:
                        return Boolean.valueOf(((apjn) obj).o);
                    case 15:
                        return Boolean.valueOf(((apjn) obj).m);
                    default:
                        return Boolean.valueOf(((apjn) obj).x);
                }
            }
        }, new adci() { // from class: adby
            @Override // defpackage.adci
            public final boolean a(Object obj) {
                apjn apjnVar = (apjn) obj;
                switch (i17) {
                    case 0:
                        if ((apjnVar.d & 16777216) != 0) {
                            return true;
                        }
                        break;
                    case 1:
                        if ((apjnVar.d & 8388608) != 0) {
                            return true;
                        }
                        break;
                    case 2:
                        if ((apjnVar.d & 33554432) != 0) {
                            return true;
                        }
                        break;
                    case 3:
                        if ((apjnVar.b & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 4:
                        if ((apjnVar.d & 4194304) != 0) {
                            return true;
                        }
                        break;
                    case 5:
                        if ((apjnVar.d & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 6:
                        if ((apjnVar.d & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 7:
                        if ((apjnVar.c & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 8:
                        if ((apjnVar.d & 268435456) != 0) {
                            return true;
                        }
                        break;
                    case 9:
                        if ((apjnVar.e & 2) != 0) {
                            return true;
                        }
                        break;
                    case 10:
                        if ((apjnVar.e & 4) != 0) {
                            return true;
                        }
                        break;
                    case 11:
                        if ((apjnVar.e & 32) != 0) {
                            return true;
                        }
                        break;
                    case 12:
                        if ((apjnVar.e & SemanticState.Hidden) != 0) {
                            return true;
                        }
                        break;
                    case 13:
                        if ((apjnVar.c & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 14:
                        if ((apjnVar.c & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 15:
                        if ((apjnVar.c & 8388608) != 0) {
                            return true;
                        }
                        break;
                    default:
                        if ((apjnVar.d & 536870912) != 0) {
                            return true;
                        }
                        break;
                }
                return false;
            }
        }, (agex) null), new axfd((Object) bool, new adcj() { // from class: adbx
            @Override // defpackage.adcj
            public final void a(Object obj, Object obj2) {
                switch (i17) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.b = ((Float) obj2).floatValue();
                        adcaVar.u |= 2;
                        return;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.h = ((Boolean) obj2).booleanValue();
                        adcaVar2.u |= 64;
                        return;
                    case 2:
                        String str = (String) obj2;
                        if (str == null) {
                            throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
                        }
                        ((adca) obj).c = str;
                        return;
                    case 3:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.d = ((Integer) obj2).intValue();
                        adcaVar3.u |= 4;
                        return;
                    case 4:
                        adca adcaVar4 = (adca) obj;
                        adcaVar4.n = ((Boolean) obj2).booleanValue();
                        adcaVar4.u |= SemanticState.Obscured;
                        return;
                    case 5:
                        adca adcaVar5 = (adca) obj;
                        adcaVar5.o = ((Float) obj2).floatValue();
                        adcaVar5.u |= SemanticState.Multiline;
                        return;
                    case 6:
                        adca adcaVar6 = (adca) obj;
                        adcaVar6.p = ((Boolean) obj2).booleanValue();
                        adcaVar6.u |= 16384;
                        return;
                    case 7:
                        adca adcaVar7 = (adca) obj;
                        adcaVar7.i = ((Boolean) obj2).booleanValue();
                        adcaVar7.u |= SemanticState.Focused;
                        return;
                    case 8:
                        adca adcaVar8 = (adca) obj;
                        adcaVar8.q = ((Boolean) obj2).booleanValue();
                        adcaVar8.u |= 32768;
                        return;
                    case 9:
                        adca adcaVar9 = (adca) obj;
                        adcaVar9.r = ((Boolean) obj2).booleanValue();
                        adcaVar9.u |= 65536;
                        return;
                    case 10:
                        adca adcaVar10 = (adca) obj;
                        adcaVar10.l = ((Boolean) obj2).booleanValue();
                        adcaVar10.u |= SemanticState.ReadOnly;
                        return;
                    case 11:
                        adca adcaVar11 = (adca) obj;
                        adcaVar11.s = ((Boolean) obj2).booleanValue();
                        adcaVar11.u |= 131072;
                        return;
                    case 12:
                        adca adcaVar12 = (adca) obj;
                        adcaVar12.t = ((Boolean) obj2).booleanValue();
                        adcaVar12.u |= 262144;
                        return;
                    case 13:
                        adca adcaVar13 = (adca) obj;
                        adcaVar13.j = ((Boolean) obj2).booleanValue();
                        adcaVar13.u |= SemanticState.Hidden;
                        return;
                    case 14:
                        adca adcaVar14 = (adca) obj;
                        adcaVar14.m = ((Boolean) obj2).booleanValue();
                        adcaVar14.u |= SemanticState.Modal;
                        return;
                    case 15:
                        adca adcaVar15 = (adca) obj;
                        adcaVar15.k = ((Float) obj2).floatValue();
                        adcaVar15.u |= SemanticState.LiveRegion;
                        return;
                    default:
                        adca adcaVar16 = (adca) obj;
                        adcaVar16.a = ((Boolean) obj2).booleanValue();
                        adcaVar16.u |= 1;
                        return;
                }
            }
        }, new adch() { // from class: adbw
            @Override // defpackage.adch
            public final Object a(Object obj) {
                switch (i13) {
                    case 0:
                        return Boolean.valueOf(((apjn) obj).j);
                    case 1:
                        return Boolean.valueOf(((apjn) obj).s);
                    case 2:
                        return Float.valueOf(((apjn) obj).t);
                    case 3:
                        return ((apjn) obj).u;
                    case 4:
                        return Float.valueOf(((apjn) obj).n);
                    case 5:
                        return Integer.valueOf(((apjn) obj).r);
                    case 6:
                        return Boolean.valueOf(((apjn) obj).q);
                    case 7:
                        return Float.valueOf(((apjn) obj).v);
                    case 8:
                        return Boolean.valueOf(((apjn) obj).w);
                    case 9:
                        return Boolean.valueOf(((apjn) obj).y);
                    case 10:
                        return Boolean.valueOf(((apjn) obj).z);
                    case 11:
                        return Boolean.valueOf(((apjn) obj).A);
                    case 12:
                        return Boolean.valueOf(((apjn) obj).l);
                    case 13:
                        return Boolean.valueOf(((apjn) obj).B);
                    case 14:
                        return Boolean.valueOf(((apjn) obj).o);
                    case 15:
                        return Boolean.valueOf(((apjn) obj).m);
                    default:
                        return Boolean.valueOf(((apjn) obj).x);
                }
            }
        }, new adci() { // from class: adby
            @Override // defpackage.adci
            public final boolean a(Object obj) {
                apjn apjnVar = (apjn) obj;
                switch (i13) {
                    case 0:
                        if ((apjnVar.d & 16777216) != 0) {
                            return true;
                        }
                        break;
                    case 1:
                        if ((apjnVar.d & 8388608) != 0) {
                            return true;
                        }
                        break;
                    case 2:
                        if ((apjnVar.d & 33554432) != 0) {
                            return true;
                        }
                        break;
                    case 3:
                        if ((apjnVar.b & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 4:
                        if ((apjnVar.d & 4194304) != 0) {
                            return true;
                        }
                        break;
                    case 5:
                        if ((apjnVar.d & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 6:
                        if ((apjnVar.d & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 7:
                        if ((apjnVar.c & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 8:
                        if ((apjnVar.d & 268435456) != 0) {
                            return true;
                        }
                        break;
                    case 9:
                        if ((apjnVar.e & 2) != 0) {
                            return true;
                        }
                        break;
                    case 10:
                        if ((apjnVar.e & 4) != 0) {
                            return true;
                        }
                        break;
                    case 11:
                        if ((apjnVar.e & 32) != 0) {
                            return true;
                        }
                        break;
                    case 12:
                        if ((apjnVar.e & SemanticState.Hidden) != 0) {
                            return true;
                        }
                        break;
                    case 13:
                        if ((apjnVar.c & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 14:
                        if ((apjnVar.c & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 15:
                        if ((apjnVar.c & 8388608) != 0) {
                            return true;
                        }
                        break;
                    default:
                        if ((apjnVar.d & 536870912) != 0) {
                            return true;
                        }
                        break;
                }
                return false;
            }
        }, (agex) null), new axfd((Object) bool, new adcj() { // from class: adbx
            @Override // defpackage.adcj
            public final void a(Object obj, Object obj2) {
                switch (i13) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.b = ((Float) obj2).floatValue();
                        adcaVar.u |= 2;
                        return;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.h = ((Boolean) obj2).booleanValue();
                        adcaVar2.u |= 64;
                        return;
                    case 2:
                        String str = (String) obj2;
                        if (str == null) {
                            throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
                        }
                        ((adca) obj).c = str;
                        return;
                    case 3:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.d = ((Integer) obj2).intValue();
                        adcaVar3.u |= 4;
                        return;
                    case 4:
                        adca adcaVar4 = (adca) obj;
                        adcaVar4.n = ((Boolean) obj2).booleanValue();
                        adcaVar4.u |= SemanticState.Obscured;
                        return;
                    case 5:
                        adca adcaVar5 = (adca) obj;
                        adcaVar5.o = ((Float) obj2).floatValue();
                        adcaVar5.u |= SemanticState.Multiline;
                        return;
                    case 6:
                        adca adcaVar6 = (adca) obj;
                        adcaVar6.p = ((Boolean) obj2).booleanValue();
                        adcaVar6.u |= 16384;
                        return;
                    case 7:
                        adca adcaVar7 = (adca) obj;
                        adcaVar7.i = ((Boolean) obj2).booleanValue();
                        adcaVar7.u |= SemanticState.Focused;
                        return;
                    case 8:
                        adca adcaVar8 = (adca) obj;
                        adcaVar8.q = ((Boolean) obj2).booleanValue();
                        adcaVar8.u |= 32768;
                        return;
                    case 9:
                        adca adcaVar9 = (adca) obj;
                        adcaVar9.r = ((Boolean) obj2).booleanValue();
                        adcaVar9.u |= 65536;
                        return;
                    case 10:
                        adca adcaVar10 = (adca) obj;
                        adcaVar10.l = ((Boolean) obj2).booleanValue();
                        adcaVar10.u |= SemanticState.ReadOnly;
                        return;
                    case 11:
                        adca adcaVar11 = (adca) obj;
                        adcaVar11.s = ((Boolean) obj2).booleanValue();
                        adcaVar11.u |= 131072;
                        return;
                    case 12:
                        adca adcaVar12 = (adca) obj;
                        adcaVar12.t = ((Boolean) obj2).booleanValue();
                        adcaVar12.u |= 262144;
                        return;
                    case 13:
                        adca adcaVar13 = (adca) obj;
                        adcaVar13.j = ((Boolean) obj2).booleanValue();
                        adcaVar13.u |= SemanticState.Hidden;
                        return;
                    case 14:
                        adca adcaVar14 = (adca) obj;
                        adcaVar14.m = ((Boolean) obj2).booleanValue();
                        adcaVar14.u |= SemanticState.Modal;
                        return;
                    case 15:
                        adca adcaVar15 = (adca) obj;
                        adcaVar15.k = ((Float) obj2).floatValue();
                        adcaVar15.u |= SemanticState.LiveRegion;
                        return;
                    default:
                        adca adcaVar16 = (adca) obj;
                        adcaVar16.a = ((Boolean) obj2).booleanValue();
                        adcaVar16.u |= 1;
                        return;
                }
            }
        }, new adch() { // from class: adbw
            @Override // defpackage.adch
            public final Object a(Object obj) {
                switch (i9) {
                    case 0:
                        return Boolean.valueOf(((apjn) obj).j);
                    case 1:
                        return Boolean.valueOf(((apjn) obj).s);
                    case 2:
                        return Float.valueOf(((apjn) obj).t);
                    case 3:
                        return ((apjn) obj).u;
                    case 4:
                        return Float.valueOf(((apjn) obj).n);
                    case 5:
                        return Integer.valueOf(((apjn) obj).r);
                    case 6:
                        return Boolean.valueOf(((apjn) obj).q);
                    case 7:
                        return Float.valueOf(((apjn) obj).v);
                    case 8:
                        return Boolean.valueOf(((apjn) obj).w);
                    case 9:
                        return Boolean.valueOf(((apjn) obj).y);
                    case 10:
                        return Boolean.valueOf(((apjn) obj).z);
                    case 11:
                        return Boolean.valueOf(((apjn) obj).A);
                    case 12:
                        return Boolean.valueOf(((apjn) obj).l);
                    case 13:
                        return Boolean.valueOf(((apjn) obj).B);
                    case 14:
                        return Boolean.valueOf(((apjn) obj).o);
                    case 15:
                        return Boolean.valueOf(((apjn) obj).m);
                    default:
                        return Boolean.valueOf(((apjn) obj).x);
                }
            }
        }, new adci() { // from class: adby
            @Override // defpackage.adci
            public final boolean a(Object obj) {
                apjn apjnVar = (apjn) obj;
                switch (i9) {
                    case 0:
                        if ((apjnVar.d & 16777216) != 0) {
                            return true;
                        }
                        break;
                    case 1:
                        if ((apjnVar.d & 8388608) != 0) {
                            return true;
                        }
                        break;
                    case 2:
                        if ((apjnVar.d & 33554432) != 0) {
                            return true;
                        }
                        break;
                    case 3:
                        if ((apjnVar.b & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 4:
                        if ((apjnVar.d & 4194304) != 0) {
                            return true;
                        }
                        break;
                    case 5:
                        if ((apjnVar.d & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 6:
                        if ((apjnVar.d & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 7:
                        if ((apjnVar.c & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 8:
                        if ((apjnVar.d & 268435456) != 0) {
                            return true;
                        }
                        break;
                    case 9:
                        if ((apjnVar.e & 2) != 0) {
                            return true;
                        }
                        break;
                    case 10:
                        if ((apjnVar.e & 4) != 0) {
                            return true;
                        }
                        break;
                    case 11:
                        if ((apjnVar.e & 32) != 0) {
                            return true;
                        }
                        break;
                    case 12:
                        if ((apjnVar.e & SemanticState.Hidden) != 0) {
                            return true;
                        }
                        break;
                    case 13:
                        if ((apjnVar.c & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 14:
                        if ((apjnVar.c & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 15:
                        if ((apjnVar.c & 8388608) != 0) {
                            return true;
                        }
                        break;
                    default:
                        if ((apjnVar.d & 536870912) != 0) {
                            return true;
                        }
                        break;
                }
                return false;
            }
        }, (agex) null), new axfd((Object) bool, new adcj() { // from class: adbx
            @Override // defpackage.adcj
            public final void a(Object obj, Object obj2) {
                switch (i18) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.b = ((Float) obj2).floatValue();
                        adcaVar.u |= 2;
                        return;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.h = ((Boolean) obj2).booleanValue();
                        adcaVar2.u |= 64;
                        return;
                    case 2:
                        String str = (String) obj2;
                        if (str == null) {
                            throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
                        }
                        ((adca) obj).c = str;
                        return;
                    case 3:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.d = ((Integer) obj2).intValue();
                        adcaVar3.u |= 4;
                        return;
                    case 4:
                        adca adcaVar4 = (adca) obj;
                        adcaVar4.n = ((Boolean) obj2).booleanValue();
                        adcaVar4.u |= SemanticState.Obscured;
                        return;
                    case 5:
                        adca adcaVar5 = (adca) obj;
                        adcaVar5.o = ((Float) obj2).floatValue();
                        adcaVar5.u |= SemanticState.Multiline;
                        return;
                    case 6:
                        adca adcaVar6 = (adca) obj;
                        adcaVar6.p = ((Boolean) obj2).booleanValue();
                        adcaVar6.u |= 16384;
                        return;
                    case 7:
                        adca adcaVar7 = (adca) obj;
                        adcaVar7.i = ((Boolean) obj2).booleanValue();
                        adcaVar7.u |= SemanticState.Focused;
                        return;
                    case 8:
                        adca adcaVar8 = (adca) obj;
                        adcaVar8.q = ((Boolean) obj2).booleanValue();
                        adcaVar8.u |= 32768;
                        return;
                    case 9:
                        adca adcaVar9 = (adca) obj;
                        adcaVar9.r = ((Boolean) obj2).booleanValue();
                        adcaVar9.u |= 65536;
                        return;
                    case 10:
                        adca adcaVar10 = (adca) obj;
                        adcaVar10.l = ((Boolean) obj2).booleanValue();
                        adcaVar10.u |= SemanticState.ReadOnly;
                        return;
                    case 11:
                        adca adcaVar11 = (adca) obj;
                        adcaVar11.s = ((Boolean) obj2).booleanValue();
                        adcaVar11.u |= 131072;
                        return;
                    case 12:
                        adca adcaVar12 = (adca) obj;
                        adcaVar12.t = ((Boolean) obj2).booleanValue();
                        adcaVar12.u |= 262144;
                        return;
                    case 13:
                        adca adcaVar13 = (adca) obj;
                        adcaVar13.j = ((Boolean) obj2).booleanValue();
                        adcaVar13.u |= SemanticState.Hidden;
                        return;
                    case 14:
                        adca adcaVar14 = (adca) obj;
                        adcaVar14.m = ((Boolean) obj2).booleanValue();
                        adcaVar14.u |= SemanticState.Modal;
                        return;
                    case 15:
                        adca adcaVar15 = (adca) obj;
                        adcaVar15.k = ((Float) obj2).floatValue();
                        adcaVar15.u |= SemanticState.LiveRegion;
                        return;
                    default:
                        adca adcaVar16 = (adca) obj;
                        adcaVar16.a = ((Boolean) obj2).booleanValue();
                        adcaVar16.u |= 1;
                        return;
                }
            }
        }, new adch() { // from class: adbw
            @Override // defpackage.adch
            public final Object a(Object obj) {
                switch (i18) {
                    case 0:
                        return Boolean.valueOf(((apjn) obj).j);
                    case 1:
                        return Boolean.valueOf(((apjn) obj).s);
                    case 2:
                        return Float.valueOf(((apjn) obj).t);
                    case 3:
                        return ((apjn) obj).u;
                    case 4:
                        return Float.valueOf(((apjn) obj).n);
                    case 5:
                        return Integer.valueOf(((apjn) obj).r);
                    case 6:
                        return Boolean.valueOf(((apjn) obj).q);
                    case 7:
                        return Float.valueOf(((apjn) obj).v);
                    case 8:
                        return Boolean.valueOf(((apjn) obj).w);
                    case 9:
                        return Boolean.valueOf(((apjn) obj).y);
                    case 10:
                        return Boolean.valueOf(((apjn) obj).z);
                    case 11:
                        return Boolean.valueOf(((apjn) obj).A);
                    case 12:
                        return Boolean.valueOf(((apjn) obj).l);
                    case 13:
                        return Boolean.valueOf(((apjn) obj).B);
                    case 14:
                        return Boolean.valueOf(((apjn) obj).o);
                    case 15:
                        return Boolean.valueOf(((apjn) obj).m);
                    default:
                        return Boolean.valueOf(((apjn) obj).x);
                }
            }
        }, new adci() { // from class: adby
            @Override // defpackage.adci
            public final boolean a(Object obj) {
                apjn apjnVar = (apjn) obj;
                switch (i18) {
                    case 0:
                        if ((apjnVar.d & 16777216) != 0) {
                            return true;
                        }
                        break;
                    case 1:
                        if ((apjnVar.d & 8388608) != 0) {
                            return true;
                        }
                        break;
                    case 2:
                        if ((apjnVar.d & 33554432) != 0) {
                            return true;
                        }
                        break;
                    case 3:
                        if ((apjnVar.b & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 4:
                        if ((apjnVar.d & 4194304) != 0) {
                            return true;
                        }
                        break;
                    case 5:
                        if ((apjnVar.d & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 6:
                        if ((apjnVar.d & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 7:
                        if ((apjnVar.c & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 8:
                        if ((apjnVar.d & 268435456) != 0) {
                            return true;
                        }
                        break;
                    case 9:
                        if ((apjnVar.e & 2) != 0) {
                            return true;
                        }
                        break;
                    case 10:
                        if ((apjnVar.e & 4) != 0) {
                            return true;
                        }
                        break;
                    case 11:
                        if ((apjnVar.e & 32) != 0) {
                            return true;
                        }
                        break;
                    case 12:
                        if ((apjnVar.e & SemanticState.Hidden) != 0) {
                            return true;
                        }
                        break;
                    case 13:
                        if ((apjnVar.c & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 14:
                        if ((apjnVar.c & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 15:
                        if ((apjnVar.c & 8388608) != 0) {
                            return true;
                        }
                        break;
                    default:
                        if ((apjnVar.d & 536870912) != 0) {
                            return true;
                        }
                        break;
                }
                return false;
            }
        }, (agex) null), new axfd((Object) bool, new adcj() { // from class: adbx
            @Override // defpackage.adcj
            public final void a(Object obj, Object obj2) {
                switch (i19) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.b = ((Float) obj2).floatValue();
                        adcaVar.u |= 2;
                        return;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.h = ((Boolean) obj2).booleanValue();
                        adcaVar2.u |= 64;
                        return;
                    case 2:
                        String str = (String) obj2;
                        if (str == null) {
                            throw new NullPointerException("Null elementsPerformanceMetricSubSampleRate");
                        }
                        ((adca) obj).c = str;
                        return;
                    case 3:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.d = ((Integer) obj2).intValue();
                        adcaVar3.u |= 4;
                        return;
                    case 4:
                        adca adcaVar4 = (adca) obj;
                        adcaVar4.n = ((Boolean) obj2).booleanValue();
                        adcaVar4.u |= SemanticState.Obscured;
                        return;
                    case 5:
                        adca adcaVar5 = (adca) obj;
                        adcaVar5.o = ((Float) obj2).floatValue();
                        adcaVar5.u |= SemanticState.Multiline;
                        return;
                    case 6:
                        adca adcaVar6 = (adca) obj;
                        adcaVar6.p = ((Boolean) obj2).booleanValue();
                        adcaVar6.u |= 16384;
                        return;
                    case 7:
                        adca adcaVar7 = (adca) obj;
                        adcaVar7.i = ((Boolean) obj2).booleanValue();
                        adcaVar7.u |= SemanticState.Focused;
                        return;
                    case 8:
                        adca adcaVar8 = (adca) obj;
                        adcaVar8.q = ((Boolean) obj2).booleanValue();
                        adcaVar8.u |= 32768;
                        return;
                    case 9:
                        adca adcaVar9 = (adca) obj;
                        adcaVar9.r = ((Boolean) obj2).booleanValue();
                        adcaVar9.u |= 65536;
                        return;
                    case 10:
                        adca adcaVar10 = (adca) obj;
                        adcaVar10.l = ((Boolean) obj2).booleanValue();
                        adcaVar10.u |= SemanticState.ReadOnly;
                        return;
                    case 11:
                        adca adcaVar11 = (adca) obj;
                        adcaVar11.s = ((Boolean) obj2).booleanValue();
                        adcaVar11.u |= 131072;
                        return;
                    case 12:
                        adca adcaVar12 = (adca) obj;
                        adcaVar12.t = ((Boolean) obj2).booleanValue();
                        adcaVar12.u |= 262144;
                        return;
                    case 13:
                        adca adcaVar13 = (adca) obj;
                        adcaVar13.j = ((Boolean) obj2).booleanValue();
                        adcaVar13.u |= SemanticState.Hidden;
                        return;
                    case 14:
                        adca adcaVar14 = (adca) obj;
                        adcaVar14.m = ((Boolean) obj2).booleanValue();
                        adcaVar14.u |= SemanticState.Modal;
                        return;
                    case 15:
                        adca adcaVar15 = (adca) obj;
                        adcaVar15.k = ((Float) obj2).floatValue();
                        adcaVar15.u |= SemanticState.LiveRegion;
                        return;
                    default:
                        adca adcaVar16 = (adca) obj;
                        adcaVar16.a = ((Boolean) obj2).booleanValue();
                        adcaVar16.u |= 1;
                        return;
                }
            }
        }, new adch() { // from class: adbw
            @Override // defpackage.adch
            public final Object a(Object obj) {
                switch (i20) {
                    case 0:
                        return Boolean.valueOf(((apjn) obj).j);
                    case 1:
                        return Boolean.valueOf(((apjn) obj).s);
                    case 2:
                        return Float.valueOf(((apjn) obj).t);
                    case 3:
                        return ((apjn) obj).u;
                    case 4:
                        return Float.valueOf(((apjn) obj).n);
                    case 5:
                        return Integer.valueOf(((apjn) obj).r);
                    case 6:
                        return Boolean.valueOf(((apjn) obj).q);
                    case 7:
                        return Float.valueOf(((apjn) obj).v);
                    case 8:
                        return Boolean.valueOf(((apjn) obj).w);
                    case 9:
                        return Boolean.valueOf(((apjn) obj).y);
                    case 10:
                        return Boolean.valueOf(((apjn) obj).z);
                    case 11:
                        return Boolean.valueOf(((apjn) obj).A);
                    case 12:
                        return Boolean.valueOf(((apjn) obj).l);
                    case 13:
                        return Boolean.valueOf(((apjn) obj).B);
                    case 14:
                        return Boolean.valueOf(((apjn) obj).o);
                    case 15:
                        return Boolean.valueOf(((apjn) obj).m);
                    default:
                        return Boolean.valueOf(((apjn) obj).x);
                }
            }
        }, new adci() { // from class: adby
            @Override // defpackage.adci
            public final boolean a(Object obj) {
                apjn apjnVar = (apjn) obj;
                switch (i19) {
                    case 0:
                        if ((apjnVar.d & 16777216) != 0) {
                            return true;
                        }
                        break;
                    case 1:
                        if ((apjnVar.d & 8388608) != 0) {
                            return true;
                        }
                        break;
                    case 2:
                        if ((apjnVar.d & 33554432) != 0) {
                            return true;
                        }
                        break;
                    case 3:
                        if ((apjnVar.b & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 4:
                        if ((apjnVar.d & 4194304) != 0) {
                            return true;
                        }
                        break;
                    case 5:
                        if ((apjnVar.d & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 6:
                        if ((apjnVar.d & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 7:
                        if ((apjnVar.c & 134217728) != 0) {
                            return true;
                        }
                        break;
                    case 8:
                        if ((apjnVar.d & 268435456) != 0) {
                            return true;
                        }
                        break;
                    case 9:
                        if ((apjnVar.e & 2) != 0) {
                            return true;
                        }
                        break;
                    case 10:
                        if ((apjnVar.e & 4) != 0) {
                            return true;
                        }
                        break;
                    case 11:
                        if ((apjnVar.e & 32) != 0) {
                            return true;
                        }
                        break;
                    case 12:
                        if ((apjnVar.e & SemanticState.Hidden) != 0) {
                            return true;
                        }
                        break;
                    case 13:
                        if ((apjnVar.c & 2097152) != 0) {
                            return true;
                        }
                        break;
                    case 14:
                        if ((apjnVar.c & 536870912) != 0) {
                            return true;
                        }
                        break;
                    case 15:
                        if ((apjnVar.c & 8388608) != 0) {
                            return true;
                        }
                        break;
                    default:
                        if ((apjnVar.d & 536870912) != 0) {
                            return true;
                        }
                        break;
                }
                return false;
            }
        }, (agex) null));
        l = agke.s(new abxv("eko_processor_max_lru_cache_size", (Object) 30, new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, (agkj) null), new abxv("thumbnail_resolution_type", (Object) 0, new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, agkj.m("default", 0, "high_resolution_all", 1, "high_resolution_center_crop", 2, "high_resolution_on_center_crop_ratio", 3)), new abxv("setup_default_properties", (Object) bool, new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i16) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, (agkj) null));
        abxv abxvVar = new abxv("litho_init_range", (Object) 4, new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, (agkj) null);
        abxv abxvVar2 = new abxv("litho_range_ratio", (Object) Float.valueOf(0.5f), new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i8) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, (agkj) null);
        Boolean bool2 = Boolean.TRUE;
        final int i21 = 6;
        final int i22 = 11;
        m = agke.y(abxvVar, abxvVar2, new abxv("use_incremental_mount_for_rb", (Object) bool2, new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i14) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, (agkj) null), new abxv("use_legacy_visible", (Object) bool, new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i21) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, (agkj) null), new abxv("use_size_spec_youtube_element", (Object) bool, new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i4) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, (agkj) null), new abxv("use_flatbuffer_runtime", (Object) bool, new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i17) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, (agkj) null), new abxv("rebind_after_detach", (Object) bool, new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i13) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, (agkj) null), new abxv("horizontal_collection_touch_interceptor", (Object) bool, new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i9) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, (agkj) null), new abxv("use_swipe_to_camera_local_config", (Object) bool2, new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i22) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, (agkj) null));
        final int i23 = 5;
        agke agkeVarQ = agke.q(new abxv("use_incremental_mount_for_rb", (Object) bool, new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i23) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, (agkj) null));
        a = agkeVarQ;
        agke agkeVarQ2 = agke.q(new abxv("use_incremental_mount_for_rb", (Object) bool, new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i23) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, (agkj) null));
        b = agkeVarQ2;
        agke agkeVarQ3 = agke.q(new abxv("use_incremental_mount_for_rb", (Object) bool, new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i23) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, (agkj) null));
        c = agkeVarQ3;
        final int i24 = 10;
        agke agkeVarQ4 = agke.q(new abxv("horizontal_collection_touch_interceptor", (Object) bool2, new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i24) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, (agkj) null));
        d = agkeVarQ4;
        final int i25 = 5;
        agke agkeVarQ5 = agke.q(new abxv("use_incremental_mount_for_rb", (Object) bool, new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i25) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, (agkj) null));
        e = agkeVarQ5;
        agke agkeVarQ6 = agke.q(new abxv("use_incremental_mount_for_rb", (Object) bool, new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i25) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, (agkj) null));
        f = agkeVarQ6;
        agke agkeVarQ7 = agke.q(new abxv("use_incremental_mount_for_rb", (Object) bool, new adcf() { // from class: adbz
            @Override // defpackage.adcf
            public final void a(Object obj, Object obj2) {
                switch (i25) {
                    case 0:
                        adca adcaVar = (adca) obj;
                        adcaVar.g = ((Integer) obj2).intValue();
                        adcaVar.u |= 32;
                        break;
                    case 1:
                        adca adcaVar2 = (adca) obj;
                        adcaVar2.e = ((Integer) obj2).intValue();
                        adcaVar2.u |= 8;
                        break;
                    case 2:
                        adca adcaVar3 = (adca) obj;
                        adcaVar3.f = ((Boolean) obj2).booleanValue();
                        adcaVar3.u |= 16;
                        break;
                    case 3:
                        adcc adccVar = (adcc) obj;
                        adccVar.a = ((Integer) obj2).intValue();
                        adccVar.j = (short) (adccVar.j | 1);
                        break;
                    case 4:
                        adcc adccVar2 = (adcc) obj;
                        adccVar2.b = ((Float) obj2).floatValue();
                        adccVar2.j = (short) (adccVar2.j | 2);
                        break;
                    case 5:
                        adcc adccVar3 = (adcc) obj;
                        adccVar3.d = ((Boolean) obj2).booleanValue();
                        adccVar3.j = (short) (adccVar3.j | 4);
                        break;
                    case 6:
                        adcc adccVar4 = (adcc) obj;
                        adccVar4.e = ((Boolean) obj2).booleanValue();
                        adccVar4.j = (short) (adccVar4.j | 8);
                        break;
                    case 7:
                        adcc adccVar5 = (adcc) obj;
                        adccVar5.h = ((Boolean) obj2).booleanValue();
                        adccVar5.j = (short) (adccVar5.j | 64);
                        break;
                    case 8:
                        ((adcc) obj).b(((Boolean) obj2).booleanValue());
                        break;
                    case 9:
                        adcc adccVar6 = (adcc) obj;
                        adccVar6.i = ((Boolean) obj2).booleanValue();
                        adccVar6.j = (short) (adccVar6.j | 128);
                        break;
                    case 10:
                        adcc adccVar7 = (adcc) obj;
                        adccVar7.f = ((Boolean) obj2).booleanValue();
                        adccVar7.j = (short) (adccVar7.j | 16);
                        break;
                    default:
                        adcc adccVar8 = (adcc) obj;
                        adccVar8.g = ((Boolean) obj2).booleanValue();
                        adccVar8.j = (short) (adccVar8.j | 32);
                        break;
                }
            }
        }, (agkj) null));
        g = agkeVarQ7;
        EnumMap enumMap = new EnumMap(adcb.class);
        n = enumMap;
        enumMap.put(adcb.CHANNEL, agkeVarQ);
        enumMap.put(adcb.ENGAGEMENT, agkeVarQ2);
        enumMap.put(adcb.WATCH, agkeVarQ3);
        enumMap.put(adcb.HOME, agkeVarQ4);
        enumMap.put(adcb.MINI_APP_DESTINATION, agkeVarQ5);
        enumMap.put(adcb.MUSIC_LISTENING_REVIEW, agkeVarQ6);
        enumMap.put(adcb.EVENT_DETAIL, agkeVarQ7);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [adcj, java.lang.Object] */
    public static adca v() {
        adca adcaVar = new adca();
        agke agkeVar = l;
        int i = ((agpi) agkeVar).d;
        for (int i2 = 0; i2 < i; i2++) {
            ((abxv) agkeVar.get(i2)).N(adcaVar);
        }
        agke agkeVar2 = k;
        int i3 = ((agpi) agkeVar2).d;
        for (int i4 = 0; i4 < i3; i4++) {
            axfd axfdVar = (axfd) agkeVar2.get(i4);
            axfdVar.a.a(adcaVar, axfdVar.b);
        }
        EnumMap enumMap = new EnumMap(adcb.class);
        for (adcb adcbVar : adcb.values()) {
            adcc adccVarA = adcd.a(adcbVar);
            adccVarA.c = adcbVar;
            enumMap.put(adcbVar, adccVarA.a());
        }
        adcaVar.b(enumMap);
        return adcaVar;
    }

    public static void w(adcc adccVar, JSONObject jSONObject, adcb adcbVar) {
        String str = adcbVar != null ? adcbVar.n : "";
        agke agkeVar = m;
        int i = ((agpi) agkeVar).d;
        for (int i2 = 0; i2 < i; i2++) {
            abxv abxvVar = (abxv) agkeVar.get(i2);
            try {
                abxvVar.O(jSONObject, adccVar, str);
            } catch (adcg | JSONException e2) {
                zvp.b(zvn.b, zvm.x, "Error parsing ElementsLaunchConfig.SurfaceConfig.".concat((String) abxvVar.d), e2);
            }
        }
    }

    public abstract float a();

    public abstract float b();

    public abstract float c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract agkj g();

    public abstract String h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();

    public abstract boolean s();

    public abstract boolean t();

    public abstract boolean u();
}
