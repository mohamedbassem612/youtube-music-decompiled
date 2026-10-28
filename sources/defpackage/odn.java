package defpackage;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import app.rive.semantics.SemanticState;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class odn extends odl {
    private final Map a;
    private final DisplayMetrics b;
    private final ocu c;

    public odn(fxg fxgVar, ocu ocuVar, Map map, DisplayMetrics displayMetrics, omj omjVar) {
        super("Db5QZzhZv9oUu580+bJckQOthvZIXdsdaf0cxWg631H9Hxia2qy+HtjJTBIhisD1", "0NmnaiixCnyjEp6vEpm9tIVmZRZQWh6HSg+6MqfekvM=", fxgVar, ocuVar, omjVar.h(123));
        this.c = ocuVar;
        this.a = map;
        this.b = displayMetrics;
    }

    private static long b(DisplayMetrics displayMetrics) {
        return Math.round(0.0d / ((double) displayMetrics.density));
    }

    @Override // defpackage.odl
    protected final void a(Method method, fxg fxgVar) {
        Map map = this.a;
        MotionEvent motionEvent = (MotionEvent) map.get("nv");
        try {
            DisplayMetrics displayMetrics = this.b;
            Object[] objArr = (Object[]) method.invoke("", motionEvent, displayMetrics);
            objArr.getClass();
            fxj fxjVar = fxj.a;
            aihf aihfVarCreateBuilder = fxjVar.createBuilder();
            Object obj = objArr[0];
            if (obj != null && objArr[1] != null) {
                long jLongValue = ((Long) obj).longValue();
                aihfVarCreateBuilder.copyOnWrite();
                fxj fxjVar2 = (fxj) aihfVarCreateBuilder.instance;
                fxjVar2.b |= 1;
                fxjVar2.c = jLongValue;
                long jLongValue2 = ((Long) objArr[1]).longValue();
                aihfVarCreateBuilder.copyOnWrite();
                fxj fxjVar3 = (fxj) aihfVarCreateBuilder.instance;
                fxjVar3.b |= 2;
                fxjVar3.d = jLongValue2;
            }
            Object obj2 = objArr[2];
            if (obj2 != null) {
                long jLongValue3 = ((Long) obj2).longValue();
                aihfVarCreateBuilder.copyOnWrite();
                fxj fxjVar4 = (fxj) aihfVarCreateBuilder.instance;
                fxjVar4.b |= SemanticState.Focused;
                fxjVar4.j = jLongValue3;
            }
            Object obj3 = objArr[3];
            if (obj3 != null) {
                long jLongValue4 = ((Long) obj3).longValue();
                aihfVarCreateBuilder.copyOnWrite();
                fxj fxjVar5 = (fxj) aihfVarCreateBuilder.instance;
                fxjVar5.b |= 16;
                fxjVar5.g = jLongValue4;
            }
            Object obj4 = objArr[4];
            if (obj4 != null) {
                long jLongValue5 = ((Long) obj4).longValue();
                aihfVarCreateBuilder.copyOnWrite();
                fxj fxjVar6 = (fxj) aihfVarCreateBuilder.instance;
                fxjVar6.b |= 4;
                fxjVar6.e = jLongValue5;
            }
            Object obj5 = objArr[5];
            if (obj5 != null) {
                int i = ((Long) obj5).longValue() != 0 ? 2 : 1;
                aihfVarCreateBuilder.copyOnWrite();
                fxj fxjVar7 = (fxj) aihfVarCreateBuilder.instance;
                fxjVar7.i = i - 1;
                fxjVar7.b |= 64;
            }
            Object obj6 = objArr[6];
            if (obj6 != null) {
                long jLongValue6 = ((Long) obj6).longValue();
                aihfVarCreateBuilder.copyOnWrite();
                fxj fxjVar8 = (fxj) aihfVarCreateBuilder.instance;
                fxjVar8.b |= SemanticState.LiveRegion;
                fxjVar8.l = jLongValue6;
            }
            Object obj7 = objArr[7];
            if (obj7 != null) {
                long jLongValue7 = ((Long) obj7).longValue();
                aihfVarCreateBuilder.copyOnWrite();
                fxj fxjVar9 = (fxj) aihfVarCreateBuilder.instance;
                fxjVar9.b |= SemanticState.Hidden;
                fxjVar9.k = jLongValue7;
            }
            Object obj8 = objArr[8];
            if (obj8 != null) {
                int i2 = ((Long) obj8).longValue() != 0 ? 2 : 1;
                aihfVarCreateBuilder.copyOnWrite();
                fxj fxjVar10 = (fxj) aihfVarCreateBuilder.instance;
                fxjVar10.m = i2 - 1;
                fxjVar10.b |= SemanticState.ReadOnly;
            }
            synchronized (fxgVar) {
                try {
                    Method methodA = this.c.a("thCKzhUypzE8TMzygz72soeMITmDG9sKdmaAC7DYUCFf47TzyBtvya3VT3TpE0GG", "gpzw/CBNQ/+VLbCFN3Xt6yW5IVabe88UQEUJBgKghVA=");
                    methodA.getClass();
                    Object[] objArr2 = (Object[]) methodA.invoke("", (MotionEvent) map.get("nv"), displayMetrics);
                    objArr2.getClass();
                    Object obj9 = objArr2[r8];
                    if (obj9 != null) {
                        long jLongValue8 = ((Long) obj9).longValue();
                        fxgVar.copyOnWrite();
                        fxl fxlVar = (fxl) fxgVar.instance;
                        fxl fxlVar2 = fxl.a;
                        fxlVar.b |= SemanticState.Multiline;
                        fxlVar.m = jLongValue8;
                    }
                    Object obj10 = objArr2[r9];
                    if (obj10 != null) {
                        long jLongValue9 = ((Long) obj10).longValue();
                        fxgVar.copyOnWrite();
                        fxl fxlVar3 = (fxl) fxgVar.instance;
                        fxl fxlVar4 = fxl.a;
                        fxlVar3.b |= 16384;
                        fxlVar3.n = jLongValue9;
                    }
                    Object obj11 = objArr2[2];
                    if (obj11 != null) {
                        long jLongValue10 = ((Long) obj11).longValue();
                        fxgVar.copyOnWrite();
                        fxl fxlVar5 = (fxl) fxgVar.instance;
                        fxl fxlVar6 = fxl.a;
                        fxlVar5.b |= 32768;
                        fxlVar5.o = jLongValue10;
                    }
                    Object obj12 = objArr2[3];
                    if (obj12 != null) {
                        long jLongValue11 = ((Long) obj12).longValue();
                        fxgVar.copyOnWrite();
                        fxl fxlVar7 = (fxl) fxgVar.instance;
                        fxl fxlVar8 = fxl.a;
                        fxlVar7.b |= 1073741824;
                        fxlVar7.A = jLongValue11;
                    }
                    Object obj13 = objArr2[4];
                    if (obj13 != null) {
                        long jLongValue12 = ((Long) obj13).longValue();
                        fxgVar.copyOnWrite();
                        fxl fxlVar9 = (fxl) fxgVar.instance;
                        fxl fxlVar10 = fxl.a;
                        fxlVar9.b |= Integer.MIN_VALUE;
                        fxlVar9.B = jLongValue12;
                    }
                    fxgVar.copyOnWrite();
                    fxl fxlVar11 = (fxl) fxgVar.instance;
                    fxj fxjVar11 = (fxj) aihfVarCreateBuilder.build();
                    fxl fxlVar12 = fxl.a;
                    fxjVar11.getClass();
                    fxlVar11.Q = fxjVar11;
                    fxlVar11.c |= 262144;
                    obz[] obzVarArr = (obz[]) map.get("ro");
                    if (obzVarArr != null && displayMetrics != null && displayMetrics.density != 0.0f) {
                        for (int i3 = 0; i3 <= obzVarArr.length - 2; i3++) {
                            obz obzVar = obzVarArr[i3];
                            aihf aihfVarCreateBuilder2 = fxjVar.createBuilder();
                            float f = obzVar.a;
                            long jB = b(displayMetrics);
                            aihfVarCreateBuilder2.copyOnWrite();
                            fxj fxjVar12 = (fxj) aihfVarCreateBuilder2.instance;
                            fxjVar12.b |= 1;
                            fxjVar12.c = jB;
                            float f2 = obzVar.b;
                            long jB2 = b(displayMetrics);
                            aihfVarCreateBuilder2.copyOnWrite();
                            fxj fxjVar13 = (fxj) aihfVarCreateBuilder2.instance;
                            fxjVar13.b |= 2;
                            fxjVar13.d = jB2;
                            fxgVar.a((fxj) aihfVarCreateBuilder2.build());
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } catch (Throwable th2) {
            if (motionEvent != null) {
                motionEvent.recycle();
            }
            throw th2;
        }
    }
}
